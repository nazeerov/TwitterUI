package com.nazirov.twitterui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nazirov.twitterui.adapter.FeedAdapter
import com.nazirov.twitterui.adapter.StoryAdapter
import com.nazirov.twitterui.model.Post
import com.nazirov.twitterui.model.Story

class MainActivity : AppCompatActivity() {
    lateinit var recyclerStory:RecyclerView
    lateinit var recyclerFeed:RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerFeed  = findViewById(R.id.recyclerViewFeed)
        recyclerFeed.layoutManager = GridLayoutManager(this, 1)

        recyclerStory  = findViewById(R.id.recyclerViewStory)
        recyclerStory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        refreshStoryAdapter(getAllStories())
        refreshFeedAdapter(getAllFeeds())


    }



    private fun refreshFeedAdapter(posts: ArrayList<Post>) {
        val adapter = FeedAdapter(this,posts)
        recyclerFeed.adapter = adapter

    }

    private fun refreshStoryAdapter(chats: ArrayList<Story>) {
        val adapter = StoryAdapter(this,chats)
        recyclerStory.adapter = adapter

    }

    private fun getAllFeeds(): ArrayList<Post> {
        val posts:ArrayList<Post>  = ArrayList()

        posts.add(Post(R.drawable.img_1,"Nazirov ELmurod",R.drawable.fortwit2))
        posts.add(Post(R.drawable.img_1,"Nazirov ELmurod",R.drawable.fortwit))
        posts.add(Post(R.drawable.img_1,"Nazirov ELmurod",R.drawable.fortwit3))
        posts.add(Post(R.drawable.img_1,"Nazirov ELmurod",R.drawable.fortwit8))
        posts.add(Post(R.drawable.img_1,"Nazirov ELmurod",R.drawable.fortwit7))
        posts.add(Post(R.drawable.img_1,"Nazirov ELmurod",R.drawable.fortwit2))
        posts.add(Post(R.drawable.img_1,"Nazirov ELmurod",R.drawable.fortwit))
        posts.add(Post(R.drawable.img_1,"Nazirov ELmurod",R.drawable.fortwit3))
        posts.add(Post(R.drawable.img_1,"Nazirov ELmurod",R.drawable.fortwit8))
        posts.add(Post(R.drawable.img_1,"Nazirov ELmurod",R.drawable.fortwit7))
        return posts

    }

    private fun getAllStories(): ArrayList<Story> {
        val stories: ArrayList<Story> = ArrayList()

        stories.add(Story(R.drawable.img_1,"Elmurod"))
        stories.add(Story(R.drawable.img_1,"Elmurod"))
        stories.add(Story(R.drawable.img_1,"Elmurod"))
        stories.add(Story(R.drawable.img_1,"Elmurod"))
        stories.add(Story(R.drawable.img_1,"Elmurod"))
        stories.add(Story(R.drawable.img_1,"Elmurod"))

        return stories

    }
}