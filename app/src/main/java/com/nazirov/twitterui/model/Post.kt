package com.nazirov.twitterui.model

class Post( profile:Int,  fullname : String,  photo : Int,photo2: Int,video: String) {


    class Post{
        var profile:String
        var fullname:String
        var photo:Int = 0
        var photo2: Int = 0
        var video:String = ""

        constructor(profile: String,fullname: String,photo: Int,photo2: Int){
            this.profile = profile
            this.fullname = fullname
            this.photo = photo
            this.photo2 = photo2
        }

        constructor(profile: String,fullname: String,photo: Int){
            this.profile = profile
            this.fullname = fullname
            this.photo = photo
        }

        constructor(profile: String,fullname: String,video:String){
            this.profile = profile
            this.fullname = fullname
            this.video = video
        }
    }
}