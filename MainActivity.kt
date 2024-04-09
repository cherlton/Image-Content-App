package com.example.myapplication
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
class MainActivity : ComponentActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
 super.onCreate(savedInstanceState)
 setContent {
 MyApplicationTheme {
 Surface(modifier = Modifier
 .fillMaxSize()
 , color = Color.Yellow) {
 Tut()
 }
 }
 }
 }
}
@Preview (showBackground = true)
@Composable
fun Tut_Mobile(){
 Tut(
 modifier = Modifier
 .fillMaxSize()
 .padding(top = 10.dp)
 )
}
@Composable
fun Tut(modifier: Modifier = Modifier){
 Column(modifier = modifier,horizontalAlignment = Alignment.CenterHorizontally){
 Surface{
 Text(text = stringResource(id = R.string.mobile_tut_Text),
 modifier = Modifier.background(Color.Blue))
 }
 Surface{
 Text(text = stringResource(id = R.string.student_number),
 modifier = Modifier
 .background(Color.Red)
 .padding(30.dp))
 }
 Surface{
 Text(text = stringResource(id = R.string.compose_Text),
 modifier = Modifier.background(Color.White))
 }
 }
}
