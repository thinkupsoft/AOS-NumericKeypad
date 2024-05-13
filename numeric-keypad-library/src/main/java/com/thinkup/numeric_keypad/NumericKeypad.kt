package com.thinkup.numeric_keypad

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Created by Martin Zarzar on 18/4/24.
 */
@Composable
fun NumericKeypad(
    modifier: Modifier = Modifier,
    onNumberClick: (String) -> Unit,
    onDeleteClick: () -> Unit,
    keyColor: Color = MaterialTheme.colorScheme.secondary,
    fontStyle: FontStyle = FontStyle.Normal,
    textStyle: TextStyle = LocalTextStyle.current,
    deleteIcon: Int = R.drawable.ic_delete,
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier) {
        (1..3).forEach { row ->
            Row(modifier = Modifier.fillMaxWidth()) {
                (1..3).forEach { col ->
                    Button(
                        onClick = { onNumberClick("${(row - 1) * 3 + col}") },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp),
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp)
                    ) {
                        DefaultKeyText(
                            text = "${(row - 1) * 3 + col}",
                            color = keyColor,
                            fontStyle = fontStyle,
                            textStyle = textStyle
                        )
                    }
                }
            }
        }

        Row(modifier = Modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = { onNumberClick("0") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp),
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
            ) {
                DefaultKeyText(
                    text = "0",
                    color = keyColor,
                    fontStyle = fontStyle,
                    textStyle = textStyle
                )
            }

            Button(
                onClick = { onDeleteClick() },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp),
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp)
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = deleteIcon),
                    contentDescription = null,
                    tint = keyColor,
                    modifier = Modifier
                )
            }
        }
    }
}

@Composable
private fun DefaultKeyText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.onPrimary,
    lineHeight: TextUnit = 32.sp,
    fontStyle: FontStyle = FontStyle.Normal,
    textStyle: TextStyle = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = lineHeight,
        letterSpacing = 0.sp
    ),
    maxLines: Int = Int.MAX_VALUE,
    textOverflow: TextOverflow = TextOverflow.Ellipsis,
    textAlign: TextAlign? = null,
) =
    Text(
        text = text,
        fontStyle = fontStyle,
        style = textStyle,
        textAlign = textAlign,
        modifier = modifier,
        maxLines = maxLines,
        overflow = textOverflow,
        color = color
    )

@Composable
@Preview
private fun NumericKeypadPreview() {
    MaterialTheme {
        NumericKeypad(onNumberClick = {}, onDeleteClick = {})
    }
}

@Composable
@Preview
private fun NumericKeypadCustomPreview() {
    MaterialTheme {
        NumericKeypad(
            onNumberClick = {},
            onDeleteClick = {},
            keyColor = Color.Yellow,
            textStyle = TextStyle(
                fontWeight = FontWeight.ExtraBold,
                fontSize = 54.sp,
            ),
        )
    }
}