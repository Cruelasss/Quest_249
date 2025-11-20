package com.example.mvvm.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@OptIn(markerClass = ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    //edit 1 : parameter statusUISiswa
    statusUISiswa: Siswa,
    onBackButtonClicked: () -> Unit
)
{
    //edit 2 : items Pair
    val items = listOf(
        Pair(first = stringResource("Nama Lengkap"), second = statusUISiswa.nama),
        Pair(first = stringResource(id = "Jenis Kelamin"), second = statusUISiswa.gender),
        Pair(first = stringResource("Alamat"), second = statusUISiswa.alamat)


    )
    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = "Data Siswa"), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = colorResource(id = R.color.purple_500)),
            )
        }
    )