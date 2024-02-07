package id.aej.myflix.impl.presentation.screen.favorite

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

/**
 * Created by ilhamaulnaa on 06/02/24.
 */

@Composable
fun FavoriteScreen() {

    Text(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        text = "Favorite Screen",
        style = MaterialTheme.typography.bodyMedium,
        color = Color.Red,
    )


}