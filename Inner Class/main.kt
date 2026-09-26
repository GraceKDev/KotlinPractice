fun main() {
    val listView = ListView(arrayOf("One","Two","Three","Four"))
    listView.ListViewItem().displayItem(position=2)
}

class ListView(val items:Array<String>) {
    inner class ListViewItem() {
        fun displayItem(position:Int) {
            println(items[position])
        }
    }
}