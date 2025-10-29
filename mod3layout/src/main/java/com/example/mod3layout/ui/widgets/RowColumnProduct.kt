package com.example.mod3layout.ui.widgets

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Sell
import androidx.compose.material.icons.outlined.Sell
import androidx.compose.material.icons.rounded.Sell
import androidx.compose.material3.Icon
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.mod3layout.ui.theme.Typography

import androidx.compose.ui.graphics.Color
@Composable
fun RowColumnProduct(modifier: Modifier = Modifier) {
    Row(modifier) {
        Box {
            AsyncImage(
                model = "https://www.cdiscount.com/pdt2/6/3/7/1/700x700/bos4242005465637/rw/four-pyrolyse-softclose-bosch-ser4-hqg572bb3f.jpg",
                contentDescription = "Four pyrolyse",
                modifier = Modifier.size(128.dp)
            )
            Icon(imageVector = Icons.Default.Sell,
                tint = Color.Red,
                modifier = Modifier.align(Alignment.BottomEnd) ,
                contentDescription = "Tête")
        }
        Column {
            Text("Four pyrolyse SANSMARQUE - SANS MODELE", style = Typography.headlineMedium)
            Text("Bon plan du moment", style = Typography.labelLarge)
            Row {
                Text("4.9/5", style = Typography.bodyLarge)
                Text("Livraison gratuite", style = Typography.bodyMedium)
            }
        }
    }
}