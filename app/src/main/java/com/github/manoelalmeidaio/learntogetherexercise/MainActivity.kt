package com.github.manoelalmeidaio.learntogetherexercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.manoelalmeidaio.learntogetherexercise.ui.theme.LearnTogetherExerciseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherExerciseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article()
                }
            }
        }
    }
}

@Composable
fun Article(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        ArticleHeader()
        ArticleBody()
    }
}

@Composable
fun ArticleHeader() {
    val painter = painterResource(R.drawable.bg_compose_background)

    Image(
        painter = painter,
        contentDescription = null,
        Modifier.fillMaxWidth()
    )
}

@Composable
fun ArticleBody() {
    Column {
        Text(
            text = stringResource(R.string.article_title),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.article_part1),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.article_part2),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL_4_XL)
@Composable
fun GreetingPreview() {
    LearnTogetherExerciseTheme {
        Article()
    }
}