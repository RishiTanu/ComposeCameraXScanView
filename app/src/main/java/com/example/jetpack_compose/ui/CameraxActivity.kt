package com.example.jetpack_compose.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.jetpack_compose.camerax.CameraX
import com.example.jetpack_compose.theme.ComposeClass1Theme
import com.example.jetpack_compose.ui.screens.CameraCompose
import com.example.jetpack_compose.utils.Permissions.allPermissionsGranted

class CameraxActivity : ComponentActivity(){
    private var cameraX: CameraX = CameraX(this, this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeClass1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CameraCompose(this, cameraX = cameraX) {
                        if (allPermissionsGranted(this)) {
                            cameraX.capturePhoto()
                        }
                    }
                }
            }
        }
    }
}