package com.example.integracionmapa.MyViewModel

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.mapbox.geojson.Point

class Marcadores {
    // Add a CircleAnnotation composable function.
    @Composable
    fun PutCircleAnnotation(){
        // Insert a CircleAnnotation composable function with the geographic coordinate to the content of MapboxMap composable function.
        com.mapbox.maps.extension.compose.annotation.generated.CircleAnnotation(
            // Set the coordinates of the circle.
            point = Point.fromLngLat(
                // Add the coordinates of the circle.
                42.236647222448035,
                -8.714549155842697
            )
        ) {
            // Style the circle that will be added to the map.
            circleBlur = 0.5
            circleOpacity = 0.8
            circleRadius = 8.0
            circleColor = Color(0xffee4e8b)
            circleStrokeWidth = 2.0
            circleStrokeColor = Color(0xffffffff)
        }
    }
}