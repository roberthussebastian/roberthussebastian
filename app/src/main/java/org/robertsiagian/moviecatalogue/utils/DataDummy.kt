package org.robertsiagian.moviecatalogue.utils

import org.robertsiagian.moviecatalogue.data.MoviesEntity

object DataDummy {

    fun generateDummyMovies(): List<MoviesEntity> {
        val movies = ArrayList<MoviesEntity>()

        movies.add(MoviesEntity("movies1","Army of the Dead","Army of the Dead adalah sebuah film heist mayat hidup Amerika Serikat garapan Zack Snyder, dari skenario karya Snyder, Shay Hatten dan Joby Harold dan cerita karya Snyder.","14 Mei 2021","https://www.awn.com/sites/default/files/styles/original/public/image/featured/army_of_the_dead1280x720.jpg?itok=en2dwNq4"))
        movies.add(MoviesEntity("movies2","Oxygen","Oxygen adalah film thriller fiksi ilmiah berbahasa Prancis 2021 yang disutradarai dan diproduksi oleh Alexandre Aja, dari skenario oleh Christie LeBlanc. Sebagai bagian dari produksi bersama Amerika-Prancis, film ini dibintangi oleh Mélanie Laurent, Mathieu Amalric, dan Malik Zidi.","12 Mei 2021","https://movieden.net/wp-content/uploads/2021/05/oxygen.jpg"))
        movies.add(MoviesEntity("movies3","Mortal Kombat","Petarung MMA Cole Young, yang terbiasa menerima pukulan demi uang, tidak menyadari warisannya-atau mengapa Kaisar Dunia Luar Shang Tsung telah mengirim prajurit terbaiknya, Sub-Zero, seorang Cryomancer dunia lain, untuk memburu Cole.","14 April 2021","https://cinemags.co.id/wp-content/uploads/2021/03/Mortal-Kombat.jpg"))
        return movies
    }
}