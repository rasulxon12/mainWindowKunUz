package uz.akra.dars8hw4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.akra.dars8hw4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.linkmain.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kun.uz/news/2023/11/17/aqsh-markaziy-osiyo-davlatlari-bilan-51-formatida-biznes-platforma-ishga-tushiradi")
            startActivity(intent)
        }

        binding.view1.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kun.uz/news/2023/11/17/izyumdagi-vayrongarchilik-va-lvivdagi-harbiy-asirlar-urush-suratlari")
            startActivity(intent)
        }

        binding.view2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kun.uz/news/2023/11/15/kartoshka-puli-u-kimlarga-va-qanday-asos-boyicha-beriladi")
            startActivity(intent)
        }

        binding.view3.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kun.uz/news/2023/11/17/yevropa-ittifoqi-ekologik-jinoyatlar-uchun-jazoni-kuchaytiradi")
            startActivity(intent)
        }

        binding.view4.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kun.uz/news/2023/11/17/bayden-aqshning-apec-doirasida-aloqalarni-mustahkamlash-rejalarini-elon-qildi")
            startActivity(intent)
        }

        binding.view5.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kun.uz/news/2023/11/19/onlayn-qopqon-ommalashgan-virtual-firibgarlik-turlari-va-ulardan-qanday-himoyalanish-kerak")
            startActivity(intent)
        }

        binding.view6.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kun.uz/news/2023/11/17/turkiya-parlamenti-shvetsiyaning-natoga-kirishi-masalasini-korib-chiqishni-keyinga-qoldirdi")
            startActivity(intent)
        }
    }
}