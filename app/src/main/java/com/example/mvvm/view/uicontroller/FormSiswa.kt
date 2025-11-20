package com.example.mvvm.view.uicontroller

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp


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

    val array = Color(0xFF7B8287)
    val lali = Color(0xFF7687A8)
    val lili = Color(0xFF89C7A0)


    Scaffold(modifier = Modifier,
        topBar = { TopAppBar(title = { Text(text = stringResource(id = R.string.app_name), color = lali) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(array)
        ) }
    )
    { isiRuang ->

        Column(
            modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //edit 3 : value, onValueChange, selected, onClick
            OutlinedTextField(
                value = txtNama,
                singleLine = true,
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier.width(width = 250.dp).padding(top = 20.dp),
                label = { Text(text = "Nama Lengkap") },
                onValueChange = {
                    txtNama = it
                }
            )
            HorizontalDivider(
                modifier = Modifier
                    .padding(all = 12.dp)
                    .width(width = 250.dp),
                thickness = dimensionResource(1.dp),
                color = lili
            )
            Row {
                pilihanJK.forEach { item ->
                    Row(modifier = Modifier.selectable(
                        selected = txtGender == item,
                        onClick = {
                            txtGender = item
                        }
                    ),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = txtGender == item,
                            onClick = {
                                txtGender = item
                            }
                        )
                        Text(text = item)
                    }
                }
            }

            HorizontalDivider(
                modifier = Modifier
                    .padding(all = 5.dp)
                    .width(width = 250.dp),
                thickness = dimensionResource(1.dp),
                color = array
            )
            OutlinedTextField(
                value = txtAlamat,
                singleLine = true,
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier.width(width = 250.dp),
                label = { Text(text = "Alamat Lengkap") },
                onValueChange = {
                    txtAlamat = it
                }
            )

