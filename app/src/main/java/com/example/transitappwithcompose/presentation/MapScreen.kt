package com.plcoding.mapscomposeguide.presentation
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.maps.android.compose.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MapScreen() {

    val montreal = LatLng(45.65, -73.83)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(montreal, 10f)
    }
    val uiSettings = remember {
        MapUiSettings(zoomControlsEnabled = false,

            myLocationButtonEnabled = true,
            mapToolbarEnabled = true,
        )
    }

    Scaffold(

    ) {
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            properties = MapProperties(mapStyleOptions =  MapStyleOptions(MapStyle.json)),
            uiSettings = uiSettings,
            cameraPositionState = cameraPositionState,
        )
    }
}