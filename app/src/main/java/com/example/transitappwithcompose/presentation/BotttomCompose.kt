package com.plcoding.mapscomposeguide.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.transitappwithcompose.R

import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheetComposeTheme() {

    val sheetState = rememberBottomSheetState(
        initialValue = BottomSheetValue.Collapsed
    )
    val scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = sheetState
    )
    val scope = rememberCoroutineScope()
    var value by remember {
        mutableStateOf("")
    }
    val station = listOf("East", "Sherbrooke/Saint-Mathieu","Cote-des-Neiges/Sherbrooke","Sherbrooke/Saint-Mathieu", "Cote-des-Neiges/Sherbrooke","East","Sherbrooke/Saint-Mathieu","Cote-des-Neiges/Sherbrooke","Sherbrooke/Saint-Mathieu", "Cote-des-Neiges/Sherbrooke")
    val busNumber = listOf("24","165","24","165","24","165","24","165","24","165")
    val minute = listOf("4","15","4","15","4","15","4","15","4","15")


    var abc=false

    fun scopcheck () :Boolean{

        scope.launch {
            abc = sheetState.isExpanded
        }
            return abc
    }


    BottomSheetScaffold(
        scaffoldState = scaffoldState,

        sheetContent = {
            Spacer(modifier = Modifier.height(46.dp))

            Box(modifier = Modifier
                .background(androidx.compose.ui.graphics.Color.Transparent)) {



                LazyColumn{
                    itemsIndexed(
                        station
                    ){
                            index,string->

                        Row(
                            horizontalArrangement  =  Arrangement.SpaceBetween,
                            modifier = Modifier
                                .fillMaxWidth()
                                // .padding(start = 0.5.dp, end = 0.5.dp, top = 0.25.dp, bottom = 0.25.dp)
                                .background(Color(24, 75, 166)),
                        )
                        {

                            Column(
                                modifier = Modifier
                                    .padding(start = 15.dp, top = 10.dp, bottom = 15.dp )


                            ) {
                                Text(
                                    text = busNumber[index],
                                    fontSize = 30.sp,
                                    color= androidx.compose.ui.graphics.Color.White,
                                    fontWeight = FontWeight.Bold,
                                    textAlign = TextAlign.Right,
                                    modifier = Modifier
                                        .background(Color(24, 75, 166))
                                )
                                Text(
                                    text = string,
                                    fontSize = 18.sp,
                                    color= androidx.compose.ui.graphics.Color.White,
                                    fontWeight = FontWeight.SemiBold,
                                    textAlign = TextAlign.Left,
                                    modifier = Modifier

                                        .background(Color(24, 75, 166))
                                )
                            }





                            Column(
                                modifier = Modifier
                                    .padding(end = 15.dp, top = 10.dp, bottom = 15.dp)


                            ) {

                            Text(
                                text = minute[index],
                                fontSize = 28.sp,
                                color= androidx.compose.ui.graphics.Color(163, 183, 220),
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Right,
                                modifier = Modifier

                                    .background(Color(24, 75, 166))
                            )
                            Text(
                                text = "mins",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color= androidx.compose.ui.graphics.Color(163, 183, 220),

                                textAlign = TextAlign.Right,
                                modifier = Modifier

                                    .background(Color(24, 75, 166))
                            )
                        }

                        }
                        Divider(color = Color.Black, thickness = 0.5.dp)
                    }
                }


                TextField(
                    value = value,
                    onValueChange = { value = it },
                    singleLine = true,
                    placeholder =  {
                        Text(
                        "Where to?",
                        fontSize = 18.sp,
                        color = androidx.compose.ui.graphics.Color(185, 249, 214),
                        textAlign = TextAlign.Start
                    )
                                   },

                    leadingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.baseline_search_24),
                            tint= androidx.compose.ui.graphics.Color(185, 249, 214),
                            contentDescription = "Search"
                        )
                    },

                    trailingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.baseline_add_home_work_24),
                            tint= androidx.compose.ui.graphics.Color(185, 249, 214),
                            contentDescription = "Work"
                        )
                    },

                    modifier = Modifier
                        .width(250.dp)

                        .offset(y = (-45).dp)
                        .wrapContentWidth()
                        .clip(RoundedCornerShape(10.dp))
                        .background(androidx.compose.ui.graphics.Color(48, 181, 102))
                        .align(Alignment.TopCenter)
                )

            }



        },
        sheetBackgroundColor = androidx.compose.ui.graphics.Color.Transparent,
        sheetPeekHeight = 350.dp,
        sheetElevation = 0.dp
      //  sheetGesturesEnabled = true,


    ) {
      MapScreen()
    }
}


