/**class MainActivity : AppCompatActivity(), MyListener {


    protected fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sayilariTopla(sayi1: Int, sayi2: Int) {

        val manager = getFragmentManager()

        val fragmentB = manager.findFragmentById(R.id.fragment2) as FragmentB
        fragmentB.sayilariTopla(sayi1, sayi2)

    }


}*/