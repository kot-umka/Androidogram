package ru.gordinmitya.androidogram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PostModel> posts = Arrays.asList(
                new PostModel("From you grandma with love – Pie #android", "August 6, 2018", R.drawable.pie),
                new PostModel("Famous Oreo is here! #android 8.0", "August 24, 2018", R.drawable.oreo),
                new PostModel("How about Nougat? #android 7.0", "August 22, 2016", R.drawable.nougat),
                new PostModel("Lovely Marshmallow #android 6.0", "October 5, 2015", R.drawable.marshmallow),
                new PostModel("Lollipop come with Material Design! #android 5.0", "November 12, 2014", R.drawable.lollipop),
                new PostModel("Will you support KitKat after 5 years? #android 4.4", "October 31, 2013", R.drawable.kit_kat),
                new PostModel("Jelly Bean #android 4.1", "July 9, 2012", R.drawable.jelly_bean),
                new PostModel("I'm Ice Cream Sandwich. #android 4.0", "October 19, 2011", R.drawable.ice_cream_sandwich),
                new PostModel("Honeycomb and Tablets! #android 3.0", "February 22, 2011", R.drawable.honeycomb),
                new PostModel("Gingerbread reminds my winter time… #android 2.3", "December 6, 2010", R.drawable.gingerbread),
                new PostModel("Do you like Froyo? #android 2.2", "May 20, 2010", R.drawable.froyo),
                new PostModel("Hello, Eclair! #android 2.1", "October 26, 2009", R.drawable.eclair),
                new PostModel("Donut released! #android 1.6", "September 15, 2009", R.drawable.donut),
                new PostModel("Mmm, first Cupcake from #android 1.5", "April 27, 2009", R.drawable.cupcake)
        );

        ListView listView = findViewById(R.id.list_photos);
        listView.setAdapter(new PostAdapter(this, R.layout.item_card, posts));
    }
}
