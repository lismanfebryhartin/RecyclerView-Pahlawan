package com.example.recyclerviewpahlawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.sultanhasanuddin,
                "sultanhasanuddin",
                "Dijuluki sebagai Ayam Jantan dari Timur, Sultan Hasanuddin adalah salah satu pahlawan kemerdekaan Indonesia yang berasal dari Sulawesi Selatan."
            ),
            Superhero(
                R.drawable.bungtomo,
                "bungtomo",
                "Bung Tomo dikenal dengan aksi heroiknya saat membangkitkan semangat arek-arek Suroboyo dalam melawan kembali tentara Nederlandsch Indie Civil Administratie (NICA) Belanda dalam pertempuran 10 November."
            ),
            Superhero(
                R.drawable.tanmalaka,
                "tanmalaka",
                "Salah satu pahlawan perintis kemerdekaan Indonesia yang sering dilupakan jasanya. Beliau berperan besar dalam perlawanan terhadap kolonialisme bangsa Belanda."
            ),
            Superhero(
                R.drawable.rakartini,
                "rakartini",
                "Sebagai salah satu pahlawan wanita, Raden Adjeng Kartini telah berjasa dalam memperjuangkan kesetaraan hak kaum perempuan semasa hidupnya."
            ),
            Superhero(
                R.drawable.jenderalsoedirman,
                "jenderalsoedirman",
                "Soedirman tidak hanya tercatat sebagai Panglima Tentara dan Jenderal Republik Indonesia pertama, tetapi juga menjadi yang termuda dalam sejarah."
            ),
            Superhero(
                R.drawable.sutansjahrir,
                "sutansjahrir",
                "Sutan Sjahrir merupakan salah satu pahlawan nasional Indonesia yang dikenal karena jasanya dalam mengorganisasi kemerdekaan Indonesia."
            ),
            Superhero(
                R.drawable.radendewisartika,
                "radendewisartika",
                "Satu lagi pahlawan perintis kemerdekaan wanita Indonesia. Pendidikan yang diterimanya sebagai keturunan ningrat menginspirasi Raden Dewi Sartika untuk memperjuangkan hak pendidikan kepada rakyat pribumi dengan membangun sekolah khusus wanita."
            ),
            Superhero(
                R.drawable.hasyimasyari,
                "hasyimasyari",
                "Kyai Haji Mohammad Hasyim Asyarie merupakan salah satu pahlawan nasional Indonesia yang sekaligus pendiri Nahdlatul Ulama (NU), sebuah organisasi Islam terbesar di Indonesia."
            ),
            Superhero(
                R.drawable.marthachristinatiahahu,
                "marthachristinatiahahu",
                "Pahlawan nasional kemerdekaan Indonesia berikutnya merupakan anak dari Kapitan Paulus Tiahahu yang turut membantu Kapitan Pattimura dalam perlawanan terhadap Belanda pada tahun 1817."
            ),
            Superhero(
                R.drawable.soekarno,
                "soekarno",
                "Ir. Soekarno adalah presiden pertama Indonesia yang juga berperan sebagai pencetus dasar negara Pancasila yang kita gunakan hingga saat ini."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent(this,DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}