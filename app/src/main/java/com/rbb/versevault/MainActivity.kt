package com.rbb.versevault

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rbb.versevault.ui.theme.VerseVaultTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VerseVaultTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    VerseVault(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun VerseVault(modifier: Modifier = Modifier) {
    Text(
        text = "Welcome to Verse Vault!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun VerseVaultPreview() {
    VerseVaultTheme {
        VerseVault()
    }
}
