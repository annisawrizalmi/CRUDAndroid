package com.annisawr.activity_staff

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_update_add.*

@Suppress( "SENSELESESS_COMPARISON")
class UpdateAddActivity : AppCompatActivity(), CrudView {

    private lateinit var presenter: Presenter2
    @SuppressLint("SetTextI18n")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_add)

        presenter = Presenter2(this)
        val itemDataItem = intent.getSerializableExtra("dataItem")

        if (itemDataItem == null) {
            btnAction.text = "Tambah"
            btnAction.setOnClickListener {
                presenter.addData(
                    etName.text.toString(),
                    etPhone.text.toString(),
                    etAddress.text.toString())

            }
        } else if (itemDataItem != null)
        {
            btnAction.text = "Update"
            val item = itemDataItem as DataItem?
            etName.setText(item?.staffName.toString())
            etPhone.setText(item?.staffHp.toString())
            etAddress.setText(item?.staffAlamat.toString())
            btnAction.setOnClickListener() {
                presenter.updateData(
                    item?.staffId ?: "",
                    atName.text.toString(),
                )
            }

        }
    }
}