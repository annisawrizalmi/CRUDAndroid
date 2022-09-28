package com.annisawr.activity_staff

interface CrudView {
    //get data
    fun onSuccessGet(data: List<DataItem>?)
    fun onFailedGet(msg : String)

    //untuk add
    fun onSuccessAdd(msg: String)
    fun errorAdd(msg : String)

    //untuk update
    fun onSuccessUpdate(msg: String)
    fun errorUpdate(msg : String)

    //untuk delete
    fun onSuccessDelete(msg: String)
    fun errorDelete(msg : String)
}