package com.example.listsjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listsjetpackcompose.ui.theme.ListsJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            val scrollState = rememberScrollState() // this has to include in the verticalScroll modifier to make the column scrollable.
//            Column(
//                modifier = Modifier.verticalScroll(state = scrollState)
//            ) { // this column is not by default scrollable, to make it one, we have to make changes in the modifier option
//                for(i in 1..50){
//                    Text(
//                        text = "Item $i",
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 20.dp)
//                    )
//                }
//            }

            // now to make it make it more efficient, one has to use LazyColumn which is basically the same as RecyclerView in Native App.
            /*
            LazyColumn{
                items(250) {
                    Text(
                        text = "Item $it",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 20.dp)
                    )
                }
            }

             */
            // one can also use itemsIndexed for passing items in form of list.. just in recycler view but it is easier..
            LazyColumn{
               itemsIndexed(
                    listOf("This", "is", "Jetpack", "Compose", "by", "Phillip", "Lackner")
               ){index, string ->
                    Text(
                        text = string,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 20.dp)
                    )
                }
            }
        }
    }
}

/*
NOTES:
YT Link: https://www.youtube.com/watch?v=1Thp0bB5Ev0&list=PLQkwcJG4YTCSpJ2NLhDTHhi6XBNfk9WiC&index=8&pp=iAQB
 */
