package com.example.mvvm.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
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