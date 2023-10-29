package vn.edu.hust.listexamples

data class ItemModel(val imageThumb: Int, val imageLarge: Int = 0) {
    var selected: Boolean = false
}
