
## Transit App UI with Jetpack Compose

This is the [Transit App](https://transitapp.com) UI built with Jetpack compose. 
Here I used the latest Google maps SDK for Jetpack compose. You can read it documentation [here](https://developers.google.com/maps/documentation/android-sdk/maps-compose).

I styled the maps using [snazzymaps.org](https://snazzymaps.com/) to highlight the transit lines in the map. It can be further tweaked by changing JSON according to your needs. 

If you want to display real-time data of Public transportation agencies in your app then you should read [this](https://developers.google.com/transit/gtfs-realtime?hl=en) by google on GFTS realtime. I also recommend this [youtube video](https://www.youtube.com/watch?v=8OQKHhu1VgQ) and channel to learn the basics about GFTS.

The public transport agency that you want the data from is likely using [protobuf](https://protobuf.dev/)(protocol buffers) as their data interchange format. It is more efficient and compact than JSON because it uses binary format. If you want to use protobuf with Kotlin then you should read more about it [here](https://kotlinlang.org/api/kotlinx.serialization/kotlinx-serialization-protobuf/kotlinx.serialization.protobuf/-proto-buf/).



## Screenshots

![App Screenshot](https://i.ibb.co/jv1Sz9N/Screenshot-20230219-193135.png)



![App Screenshot2](https://i.ibb.co/MnBXdXL/Screenshot-20230219-193219.png)


