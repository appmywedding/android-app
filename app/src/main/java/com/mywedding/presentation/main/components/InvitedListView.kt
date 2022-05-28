package com.mywedding.presentation.main.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mywedding.domain.model.Invited
import com.mywedding.ui.theme.MyWeddingTheme

@Composable
fun InvitedListView(invited: List<Invited>, onDelete: (Invited) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        InvitedView(invited = invited[0], onDelete = onDelete)
    }
}

@Composable
private fun InvitedView(invited: Invited, onDelete: (Invited) -> Unit) =
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                invited.name,
                fontSize = 30.sp
            )
            Text(invited.number, fontSize = 24.sp)
        }
        Spacer(modifier = Modifier.weight(1.0f))
        Icon(
            Icons.Outlined.Delete, "delete", modifier =
            Modifier
                .height(40.dp)
                .width(40.dp)
                .clickable { onDelete(invited) }
        )
    }

@Composable
@Preview
fun DefaultPreview() {
    MyWeddingTheme {
        InvitedListView(
            listOf(Invited(id = "", name = "Orel", number = "0543056286")),
            onDelete = {println("This is delete on preview.")}
        )
    }
}