package com.feylabs.firrieflix.util.seeder

import com.feylabs.firrieflix.R
import com.feylabs.firrieflix.model.ShowModel

object ShowSeeder {

    fun showSeeder(): MutableList<ShowModel> {
        val tempList = mutableListOf<ShowModel>()

        tempList.add(
            ShowModel(
                id = 10,
                title = "La Case De Papel",
                type = ShowModel.MovieType.SHOW,
                description = "8 pencuri melakukan penyanderaan dan mengunci diri mereka di Badan Percetakan Uang Spanyol sementara otak utama kejahatan mengakali polisi agar mewujudkan rencananya.",
                releaseDate = "2017",
                artist = arrayListOf(
                    ShowModel.Artist("", "Úrsula Corberó", play_as = "Tokyo (Silene Oliveira)",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/wZkK15LnloSAhzs1jxI3AZbR6f0.jpg"),
                    ShowModel.Artist("", "Álvaro Morte", play_as = "El Profesor",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/2TGPhdpRC5wjdFEJqnLYiN5kbwg.jpg"),
                    ShowModel.Artist("", "Alba Flores", play_as = "Nairobi",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/vWUZkQKxj63qTNBa8DvEd0CpU64.jpg"),
                ),
                director = "Álex Pina",
                imbdRating = "83%",
                img_link = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4LjPjtfaxEn2W61ORPeytr5Qq7j.jpg",
            ),
        )

        tempList.add(
            ShowModel(
                id = 1,
                title = "The Queen's Gambit",
                type = ShowModel.MovieType.SHOW,
                description = "Set during the Cold War era, orphaned chess prodigy Beth Harmon struggles with addiction in a quest to become the greatest chess player in the world.",
                releaseDate = "2020",
                artist = arrayListOf(
                    ShowModel.Artist("", "Anya Taylor-Joy", play_as = "Elizabeth 'Beth' Harmon",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/wA1ZT3GSWvRjcJP96VRRARs9zEe.jpg"),
                ),
                director = "Scott Frank",
                imbdRating = "87%",
                img_link = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
            ),
        )

        tempList.add(
            ShowModel(
                id = 2,
                title = "Avatar: The Last Airbender",
                type = ShowModel.MovieType.SHOW,
                description = "In a war-torn world of elemental magic, a young boy reawakens to undertake a dangerous mystic quest to fulfill his destiny as the Avatar, and bring peace to the world.",
                releaseDate = "2005",
                artist = arrayListOf(
                    ShowModel.Artist("", "Jessie Flower", play_as = "Toph Beifong (voice)",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/wAq18B8phzkvqJY16CP47Ygt7hV.jpg"),
                    ShowModel.Artist("", "Zach Tyler", play_as = "Aang (voice)",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/wXHCem1HhV4h5uW1DzAUYVOVZoQ.jpg"),
                ),
                director = "Michael Dante DiMartino",
                imbdRating = "86%",
                img_link = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/cHFZA8Tlv03nKTGXhLOYOLtqoSm.jpg",
            ),
        )

        tempList.add(
            ShowModel(
                id = 3,
                title = "The Simpsons",
                type = ShowModel.MovieType.SHOW,
                description = "Bertempat di Springfield, kota rata-rata di Amerika, pertunjukan ini berfokus pada kejenakaan dan petualangan sehari-hari keluarga Simpson; Homer, Marge, Bart, Lisa dan Maggie, serta ribuan pemain virtual. Sejak awal, serial ini telah menjadi ikon budaya pop, menarik ratusan selebriti menjadi bintang tamu. Acara ini juga menjadi terkenal karena satirnya yang tak kenal takut terhadap kehidupan politik, media, dan Amerika secara umum.",
                releaseDate = "1989",
                artist = arrayListOf(
                    ShowModel.Artist("", "Fionn Whitehead", play_as = "Tommy",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/9f3yMfRcrdFRausgBVQVzrlitsi.jpg"),
                    ShowModel.Artist("", "Damien Bonnard", play_as = "French Soldier",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/2XYsRJdDJdkZzoiHeuqpjBKM7eK.jpg"),
                    ShowModel.Artist("", "Aneurin Barnard", play_as = "Gibson",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/aiuFLvyaxmuglNi3nfQ3oL9qW97.jpg"),
                ),
                director = "Matt Groening",
                imbdRating = "78%",
                img_link ="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qcr9bBY6MVeLzriKCmJOv1562uY.jpg",
            ),
        )

        tempList.add(
            ShowModel(
                id = 4,
                title = "Cold Pursuit",
                type = ShowModel.MovieType.SHOW,
                description = "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                releaseDate = "08/02/2019",
                artist = arrayListOf(
                    ShowModel.Artist("", "Dan Castellaneta", play_as = "Homer Simpson",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/AmeqWhP4A46AWkM4kVphg6jOTQX.jpg"),
                ),
                director = "Hans Petter Moland",
                imbdRating = "78%",
                img_link = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hXgmWPd1SuujRZ4QnKLzrj79PAw.jpg",
                ),
        )

        tempList.add(
            ShowModel(
                id = 5,
                title = "Game of Thrones",
                type = ShowModel.MovieType.SHOW,
                description = "Tujuh keluarga bangsawan berjuang untuk menguasai tanah mitos Westeros. Gesekan antara rumah-rumah mengarah ke perang skala penuh. Semua sementara kejahatan yang sangat kuno terbangun di utara terjauh. Di tengah-tengah perang, perintah militer yang diabaikan, Night's Watch, adalah yang berdiri di antara alam manusia dan kengerian es di luarnya.",
                releaseDate = "2011",
                artist = arrayListOf(
                    ShowModel.Artist("", "Emilia Clarke", play_as = "Daenerys Targaryen",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/86jeYFV40KctQMDQIWhJ5oviNGj.jpg"),
                ),
                director = "David Benioff",
                imbdRating = "84%",
                img_link = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
            ),
        )

        tempList.add(
            ShowModel(
                id = 6,
                title = "The Nevers",
                type = ShowModel.MovieType.SHOW,
                description = "Pada tahun-tahun terakhir pemerintahan Victoria, London dilanda oleh \"Tersentuh\": orang - kebanyakan wanita - yang tiba-tiba menunjukkan kemampuan abnormal, beberapa menawan, beberapa sangat mengganggu. Di antara mereka adalah Amalia Sejati, seorang janda misterius yang gesit, dan Penance Adair, seorang penemu muda yang brilian. Mereka adalah juara dari kelas bawah baru ini, membuat rumah bagi yang Tersentuh, sambil melawan kekuatan… yah, hampir semua kekuatan - untuk memberi ruang bagi mereka yang sejarah seperti yang kita tahu tidak memiliki tempat.",
                releaseDate = "2021",
                artist = arrayListOf(
                    ShowModel.Artist("", "Laura Donnelly", play_as = "Amalia True",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/tle0V2j3uu9egn0OZKluzYb3F7l.jpg"),
                    ),
                director = "Joss Whedon",
                imbdRating = "87%",
                img_link = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/v6Xmj8Fy7ZruVTz3y2Po7O0TQh4.jpg",
            ),
        )

        tempList.add(
            ShowModel(
                id = 7,
                title = "Ben 10",
                type = ShowModel.MovieType.SHOW,
                description = "When 10-year-old Ben Tennyson discovers a mysterious device, he gains the power to change into ten different alien heroes, each with uniquely awesome powers. With such abilities at his disposal, Ben realizes a greater responsibility to help others and stop evildoers, but that doesn't mean he's above a little superpowered mischief now and then.",
                releaseDate = "2005",
                artist = arrayListOf(
                    ShowModel.Artist("", "Jim Ward", play_as = "Diamondhead",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/yQklzBUmaHbcS00DXq73J1HYUrE.jpg"),
                ),
                director = "Joe Kelly",
                imbdRating = "81%",
                img_link = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pT0NlYVIkwM2zAw9oUkePwrOlxW.jpg",
            ),
        )

        tempList.add(
            ShowModel(
                id = 8,
                title = "Lost",
                type = ShowModel.MovieType.SHOW,
                description = "The survivors of a plane crash find themselves stranded on a mysterious island. They are forced to work together for their survival when they realise that they are not alone on the island.",
                releaseDate = "2004",
                artist = arrayListOf(
                    ShowModel.Artist("", "Naveen Andrews", play_as = "Sayid Jarrah",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/tVAQ4dP9rRosjHZBLNVlfAGVE66.jpg"),
                    ShowModel.Artist("", "Yunjin Kim", play_as = "Sun-Hwa Kwon",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/xS7eco56mUiZGJGWDZ0pwzrUAei.jpg"),
                ),
                director = "J.J. Abrams",
                imbdRating = "79",
                img_link = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/og6S0aTZU6YUJAbqxeKjCa3kY1E.jpg",
            ),
        )

        tempList.add(
            ShowModel(
                id = 9,
                title = "The 100",
                type = ShowModel.MovieType.SHOW,
                description = "100 tahun di masa depan, ketika Bumi telah ditinggalkan karena radioaktivitas, manusia terakhir yang masih hidup hidup di atas bahtera yang mengorbit planet ini - tetapi bahtera itu tidak akan bertahan selamanya. Jadi rezim represif memilih 100 kenakalan remaja untuk dikirim ke Bumi untuk melihat apakah planet ini masih layak huni.",
                releaseDate = "2014",
                artist = arrayListOf(
                    ShowModel.Artist("", "Lindsey Morgans", play_as = "Raven Reyes",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/fl1Jt9brtTV6vfNl5mv55SrSCZm.jpg"),
                    ShowModel.Artist("", "Christopher Larkin", play_as = "Monty Green",img_link = "https://www.themoviedb.org/t/p/w138_and_h175_face/vuFngjTpYHjbo5llQcFPnAPM3jz.jpg"),
                ),
                director = "Anthony Russo",
                imbdRating = "83%",
                img_link = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wHIMMLFsk32wIzDmawWkYVbxFCS.jpg",
            ),
        )





        return tempList
    }

}