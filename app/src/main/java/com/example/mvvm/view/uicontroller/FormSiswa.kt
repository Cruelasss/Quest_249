package com.example.mvvm.view.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier


@OptIn(markerClass = ExperimentalMaterial3Api::class)
@Composable
fun FormSiswa(

 pilihanJK: List<String>,
onSubmitButtonClicked: (MutableList<String>) -> Unit,
modifier: Modifier = Modifier
) {
    var txtNama by rememberSaveable { mutableStateOf(value = "") }
    var txtAlamat by remember { mutableStateOf(value = "") }
    var txtGender by remember { mutableStateOf(value = "") }
    val listData: MutableList<String> = mutableListOf(txtNama, txtGender, txtAlamat)
