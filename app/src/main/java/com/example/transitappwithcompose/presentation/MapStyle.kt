package com.example.transitappwithcompose.presentation

object MapStyle {

    val json = """
   [
    {
        "featureType": "landscape.man_made",
        "elementType": "geometry",
        "stylers": [
            {
                "lightness": "100"
            },
            {
                "visibility": "on"
            },
            {
                "hue": "#00c6ff"
            },
            {
                "saturation": "100"
            }
        ]
    },
    {
        "featureType": "poi",
        "elementType": "labels.icon",
        "stylers": [
            {
                "hue": "#ff0000"
            }
        ]
    },
    {
        "featureType": "poi.attraction",
        "elementType": "geometry",
        "stylers": [
            {
                "visibility": "simplified"
            }
        ]
    },
    {
        "featureType": "poi.medical",
        "elementType": "geometry",
        "stylers": [
            {
                "color": "#507785"
            },
            {
                "lightness": "32"
            }
        ]
    },
    {
        "featureType": "poi.park",
        "elementType": "geometry",
        "stylers": [
            {
                "visibility": "on"
            },
            {
                "weight": "0"
            },
            {
                "color": "#5ac41a"
            },
            {
                "lightness": "45"
            }
        ]
    },
    {
        "featureType": "poi.park",
        "elementType": "geometry.fill",
        "stylers": [
            {
                "hue": "#78ff00"
            },
            {
                "saturation": "75"
            },
            {
                "visibility": "on"
            },
            {
                "weight": "3"
            }
        ]
    },
    {
        "featureType": "poi.school",
        "elementType": "geometry",
        "stylers": [
            {
                "visibility": "simplified"
            },
            {
                "color": "#f7da38"
            },
            {
                "saturation": "64"
            },
            {
                "lightness": "45"
            }
        ]
    },
    {
        "featureType": "road.highway",
        "elementType": "geometry.fill",
        "stylers": [
            {
                "saturation": "1"
            },
            {
                "color": "#f40606"
            },
            {
                "lightness": "14"
            }
        ]
    },
    {
        "featureType": "road.highway",
        "elementType": "geometry.stroke",
        "stylers": [
            {
                "visibility": "on"
            },
            {
                "saturation": "70"
            },
            {
                "hue": "#0060ff"
            },
            {
                "lightness": "91"
            }
        ]
    },
    {
        "featureType": "road.highway",
        "elementType": "labels.text",
        "stylers": [
            {
                "hue": "#ff0c00"
            },
            {
                "lightness": "100"
            },
            {
                "saturation": "-87"
            },
            {
                "invert_lightness": true
            }
        ]
    },
    {
        "featureType": "road.highway",
        "elementType": "labels.text.stroke",
        "stylers": [
            {
                "saturation": "-1"
            },
            {
                "lightness": "100"
            },
            {
                "gamma": "4.86"
            },
            {
                "weight": "1"
            },
            {
                "visibility": "on"
            },
            {
                "color": "#ffffff"
            }
        ]
    },
    {
        "featureType": "road.highway",
        "elementType": "labels.icon",
        "stylers": [
            {
                "visibility": "on"
            },
            {
                "hue": "#4200ff"
            },
            {
                "weight": "1"
            }
        ]
    },
    {
        "featureType": "road.arterial",
        "elementType": "geometry.fill",
        "stylers": [
            {
                "visibility": "on"
            },
            {
                "color": "#ba9393"
            }
        ]
    },
    {
        "featureType": "road.arterial",
        "elementType": "geometry.stroke",
        "stylers": [
            {
                "visibility": "off"
            },
            {
                "hue": "#ff0000"
            },
            {
                "weight": "4.88"
            }
        ]
    },
    {
        "featureType": "road.local",
        "elementType": "geometry",
        "stylers": [
            {
                "visibility": "simplified"
            },
            {
                "color": "#f7b3b3"
            }
        ]
    },
    {
        "featureType": "road.local",
        "elementType": "geometry.fill",
        "stylers": [
            {
                "visibility": "simplified"
            },
            {
                "gamma": "2"
            }
        ]
    },
    {
        "featureType": "transit.line",
        "elementType": "geometry",
        "stylers": [
            {
                "visibility": "simplified"
            }
        ]
    },
    {
        "featureType": "transit.line",
        "elementType": "geometry.fill",
        "stylers": [
            {
                "color": "#15386d"
            },
            {
                "visibility": "on"
            },
            {
                "saturation": "57"
            },
            {
                "lightness": "54"
            },
            {
                "gamma": "1"
            },
            {
                "weight": "1"
            },
            {
                "invert_lightness": true
            }
        ]
    },
    {
        "featureType": "transit.line",
        "elementType": "geometry.stroke",
        "stylers": [
            {
                "visibility": "on"
            },
            {
                "color": "#000cff"
            }
        ]
    },
    {
        "featureType": "transit.station.airport",
        "elementType": "labels.icon",
        "stylers": [
            {
                "gamma": "0.00"
            },
            {
                "weight": "0.84"
            },
            {
                "invert_lightness": true
            },
            {
                "lightness": "19"
            },
            {
                "hue": "#003cff"
            },
            {
                "saturation": "66"
            }
        ]
    },
    {
        "featureType": "transit.station.bus",
        "elementType": "labels.icon",
        "stylers": [
            {
                "hue": "#ff0000"
            }
        ]
    },
    {
        "featureType": "water",
        "elementType": "geometry",
        "stylers": [
            {
                "visibility": "on"
            },
            {
                "hue": "#0030ff"
            }
        ]
    },
    {
        "featureType": "water",
        "elementType": "geometry.fill",
        "stylers": [
            {
                "hue": "#00b4ff"
            },
            {
                "lightness": "14"
            }
        ]
    }
]
    """.trimIndent()
}