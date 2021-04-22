package com.feylabs.firrieflix.util.seeder

import com.feylabs.firrieflix.R
import com.feylabs.firrieflix.model.MovieModel

object MovieSeeder {

    fun movieSeeder(): MutableList<MovieModel> {
        val tempList = mutableListOf<MovieModel>()

        tempList.add(
            MovieModel(
                id = 10,
                title = "Tomorrowland",
                type = MovieModel.MovieType.MOVIE,
                description = "Bound by a shared destiny, a bright, optimistic teen bursting with scientific curiosity and a former boy-genius inventor jaded by disillusionment embark on a danger-filled mission to unearth the secrets of an enigmatic place somewhere in time and space that exists in their collective memory as \"Tomorrowland.\"",
                releaseDate = "22/05/2015",
                artist = arrayListOf(
                    MovieModel.Artist("", "Raffey Cassidy", play_as = "Athena",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/iIPH3YHFOz8wXfj4uLQnzOX2Kpa.jpg"),
                    MovieModel.Artist("", "Britt Robertson", play_as = "Casey Newton",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/6lnipeQ6auGaxn4gQ8UX68xoxOy.jpg"),
                    MovieModel.Artist("", "Frank Walker", play_as = "George Clooney",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/kHiVY6r1k6juXrNetAYk2jILqn9.jpg"),
                ),
                director = "Brad Bird",
                imbdRating = "62%",
                img_link = R.drawable.ic_tomorrowland,
            ),
        )

        tempList.add(
            MovieModel(
                id = 1,
                title = "A Start is Born",
                type = MovieModel.MovieType.MOVIE,
                description = "Seorang bintang musik country yang karirnya mulai memudar, Jackson Maine (Bradley Cooper) menemukan sebuah talenta yang sangat berbakat di dalam diri dari seorang musisi muda bernama Ally (Lady Gaga). Maine berhasil mengorbitkan Ally menjadi seorang bintang muda yang menjanjikan. Namun keduanya terlibat hubungan yang lebih jauh dari sekedar mentor dan anak didik. Seiring dengan meroketnya karir dari Ally dan dirinya, Maine mengalami dilema mengenai masalah ini.",
                releaseDate = "05/10/2018",
                artist = arrayListOf(
                    MovieModel.Artist("", "Bradley Cooper", play_as = "Jackson Maine",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/DPnessSsWqVXRbKm93PtMjB4Us.jpg"),
                    MovieModel.Artist("", "Lady Gaga", play_as = "Ally Campana",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/asB6CImOsNGA5i9HHt2FFCtP2QJ.jpg"),
                    MovieModel.Artist("", "Sam Elliott", play_as = "Bobby Maine",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/1K2IvGXFbKsgkExuUsRvy4F0c9e.jpg"),
                ),
                director = "Bradley Cooper",
                imbdRating = "75%",
                img_link = R.drawable.poster_a_start_is_born,
            ),
        )

        tempList.add(
            MovieModel(
                id = 2,
                title = "Alita: Battle Angel",
                type = MovieModel.MovieType.MOVIE,
                description = "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
                releaseDate = "14/02/2019",
                artist = arrayListOf(
                    MovieModel.Artist("", "Rosa Salazar", play_as = "Alita",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/pc2tCeB99HtmrghAoPKksZkbzUU.jpg"),
                    MovieModel.Artist("", "Christoph Waltz", play_as = "Dr. Dyson Ido",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/2Hhztd4mUEV9Y25rfkXDwzL9QI9.jpg"),
                    MovieModel.Artist("", "Jennifer Connelly", play_as = "Chiren",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/egh1eOHuYgeoqdlLQgaXMl6cPOm.jpg"),
                ),
                director = "Robert Rodriguez",
                imbdRating = "72%",
                img_link = R.drawable.poster_alita,
            ),
        )

        tempList.add(
            MovieModel(
                id = 3,
                title = "Dunkirk",
                type = MovieModel.MovieType.MOVIE,
                description = "Pasukan sekutu dari Belgia, Inggris Raya, Kanada dan Perancis terkepung oleh pasukan Jerman pada Perang Dunia II di wilayah pantai Dunkirk Perancis. Ini adalah kisah heroik upaya penyelamatan mereka yang berlangsung dari 24 Mei hingga 4 Juni 1940.",
                releaseDate = "21/07/2017",
                artist = arrayListOf(
                    MovieModel.Artist("", "Fionn Whitehead", play_as = "Tommy",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/9f3yMfRcrdFRausgBVQVzrlitsi.jpg"),
                    MovieModel.Artist("", "Damien Bonnard", play_as = "French Soldier",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/2XYsRJdDJdkZzoiHeuqpjBKM7eK.jpg"),
                    MovieModel.Artist("", "Aneurin Barnard", play_as = "Gibson",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/aiuFLvyaxmuglNi3nfQ3oL9qW97.jpg"),
                ),
                director = "Christopher Nolan",
                imbdRating = "75%",
                img_link = R.drawable.ic_dunkirk,
            ),
        )

        tempList.add(
            MovieModel(
                id = 4,
                title = "Cold Pursuit",
                type = MovieModel.MovieType.MOVIE,
                description = "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                releaseDate = "08/02/2019",
                artist = arrayListOf(
                    MovieModel.Artist("", "Liam Neeson", play_as = "Nels Coxman",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/jrf9LaTFWfLA5DBhFWENFsWh4Y9.jpg"),
                    MovieModel.Artist("", "Laura Dern", play_as = "Grace Coxman",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/gB9PnGEvxKg33OSlcqptQwTBwPE.jpg"),
                    MovieModel.Artist("", "Kim Dash", play_as = "Emmy Rossum",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/aJ8bzA1WJOBFx0Ppdo1fLMiNxLh.jpg"),
                ),
                director = "Hans Petter Moland",
                imbdRating = "57%",
                img_link = R.drawable.poster_cold_persuit,
                ),
        )

        tempList.add(
            MovieModel(
                id = 5,
                title = "Bohemian Rhapsody",
                type = MovieModel.MovieType.MOVIE,
                description = "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                releaseDate = "02/11/2018",
                artist = arrayListOf(
                    MovieModel.Artist("", "Rami Malek", play_as = "Freddie Mercury",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/2OuFzCbMibXGouG79tG1U4BLPbe.jpg"),
                    MovieModel.Artist("", "Gwilym Lee", play_as = "Brian May",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/bHSmjJLJyrg5Q0tC0W2FFreuOnO.jpg"),
                    MovieModel.Artist("", "Lucy Boynton", play_as = "Mary Austin",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/a8AB1B1jXuDtO3NOD2n4h4e4COJ.jpg"),

                ),
                director = "Anthony McCarten",
                imbdRating = "80%",
                img_link = R.drawable.poster_bohemian,
            ),
        )

        tempList.add(
            MovieModel(
                id = 6,
                title = "Creed II",
                type = MovieModel.MovieType.MOVIE,
                description = "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                releaseDate = "21/11/2018",
                artist = arrayListOf(
                    MovieModel.Artist("", "Michael B. Jordan", play_as = "Adonis Creed",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/kfcn0yyEdN2aJfVaxW0NIoKVF4J.jpg"),
                    MovieModel.Artist("", "Tessa Thompson", play_as = "Bianca Taylor",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/ewRWXNfS3ehaalCQtvHCa7BhibC.jpg"),
                    MovieModel.Artist("", "Florian Munteanu", play_as = "Viktor Drago",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/lE26A169mjuwW5x0zx2wW9Q9o2w.jpg"),
                    ),
                director = "Steven Caple Jr.",
                imbdRating = "69%",
                img_link = R.drawable.poster_creed,
            ),
        )

        tempList.add(
            MovieModel(
                id = 7,
                title = "Glass",
                type = MovieModel.MovieType.MOVIE,
                description = "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                releaseDate = "18/01/2019",
                artist = arrayListOf(
                    MovieModel.Artist("", "Anya Taylor-Joy", play_as = "Casey Cooke",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/wA1ZT3GSWvRjcJP96VRRARs9zEe.jpg"),
                    MovieModel.Artist("", "James McAvoy", play_as = "Hedwig",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/wA1ZT3GSWvRjcJP96VRRARs9zEe.jpg"),
                ),
                director = "M. Night Shyamalan",
                imbdRating = "67%",
                img_link = R.drawable.poster_glass,
            ),
        )

        tempList.add(
            MovieModel(
                id = 8,
                title = "How To Train Your Dragon",
                type = MovieModel.MovieType.MOVIE,
                description = "As the son of a Viking leader on the cusp of manhood, shy Hiccup Horrendous Haddock III faces a rite of passage: he must kill a dragon to prove his warrior mettle. But after downing a feared dragon, he realizes that he no longer wants to destroy it, and instead befriends the beast – which he names Toothless – much to the chagrin of his warrior father",
                releaseDate = "26/03/2010",
                artist = arrayListOf(
                    MovieModel.Artist("", "Jay Baruchel", play_as = "Hiccup Horrendous Haddock III",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/hTg6RJMxpxcsYzmdre81TznDATZ.jpg"),
                    MovieModel.Artist("", "America Ferrera", play_as = "Astrid Hofferson",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/7F84Lh2lKpvkM3EiOvqqvlOmw93.jpg"),
                    MovieModel.Artist("", "Jonah Hill", play_as = "Snotlout Jorgenson",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/cymlWttB83MsAGR2EkTgANtjeRH.jpg"),
                ),
                director = "Dean DeBlois",
                imbdRating = "78",
                img_link = R.drawable.poster_how_to_train,
            ),
        )

        tempList.add(
            MovieModel(
                id = 9,
                title = "Infinity War",
                type = MovieModel.MovieType.MOVIE,
                description = "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                releaseDate = "27/04/2018",
                artist = arrayListOf(
                    MovieModel.Artist("", "Robert Downey Jr.", play_as = "Tony Stark / Iron Man",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/im9SAqJPZKEbVZGmjXuLI4O7RvM.jpg"),
                    MovieModel.Artist("", "Chris Hemsworth", play_as = "Thor Odinson",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/jpurJ9jAcLCYjgHHfYF32m3zJYm.jpg"),
                    MovieModel.Artist("", "Chris Evans", play_as = "Steve Rogers / Captain America",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/3bOGNsHlrswhyW79uvIHH1V43JI.jpg"),
                    MovieModel.Artist("", "Scarlett Johansson", play_as = "Natasha Romanoff / Black Widow",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/6NsMbJXRlDZuDzatN2akFdGuTvx.jpg"),
                ),
                director = "Anthony Russo",
                imbdRating = "83%",
                img_link = R.drawable.poster_infinity_war,
            ),
        )





        return tempList
    }

}