package com.afzal.mylibrary
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
    ) {
        Text(text = text, color = Color.White)
    }
}

@Composable
@Preview(showBackground = true)
fun CustomButtonPreview() {
    CustomButton(text = "Click Me", onClick = {})
}
