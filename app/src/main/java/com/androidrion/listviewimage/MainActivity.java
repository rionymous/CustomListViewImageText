package com.androidrion.listviewimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] listViewItems = new String[] {
            "Facebook", "Instagram", "Twitter", "Tumblr", "LINE", "VK",
            "Pinterest", "Reddit", "Foursquare", "YouTube", "LinkedIn", "Quora",
            "Flickr", "Twitch", "GitHub", "Behance", "ok.ru", "Steam",
            "Vine", "KakaoTalk", "Telegram", "SnapChat", "Viber", "WhatsApp"
    };

    int[] listViewGambar = new int[]{
            R.drawable.facebook, R.drawable.instagram, R.drawable.twitter, R.drawable.tumblr, R.drawable.line, R.drawable.vk,
            R.drawable.pinterest, R.drawable.reddit, R.drawable.foursquare, R.drawable.yt, R.drawable.linkedin, R.drawable.quora,
            R.drawable.flickr, R.drawable.twitch, R.drawable.github, R.drawable.behance, R.drawable.okru, R.drawable.steam,
            R.drawable.vine, R.drawable.kakaotalk, R.drawable.telegram, R.drawable.snapchat, R.drawable.viber, R.drawable.wa
    };

    String[] listViewDeskripsi = new String[]{
            "https://www.facebook.com", "https://www.instagram.com", "https://twitter.com", "https://www.tumblr.com", "https://line.me/en/", "https://vk.com",
            "https://www.pinterest.com", "https://www.reddit.com", "https://www.foursquare.com", "https://www.youtube.com", "https://www.linkedin.com", "https://www.quora.com",
            "https://www.flickr.com", "https://www.twitch.tv", "https://github.com", "https://www.behance.net", "https://ok.ru", "https://store.steampowered.com",
            "https://vine.co", "https://www.kakaocorp.com", "https://pinterest.org", "https://www.snapchat.com", "https://www.viber.com", "https://www.whatsapp.com"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);

        List<HashMap<String, String>> aList = new ArrayList<>();

        for (int i = 0; i < 24; i++) {
            HashMap<String, String> hm = new HashMap<>();
            hm.put("listview_title", listViewItems[i]);
            hm.put("listview_desc", listViewDeskripsi[i]);
            hm.put("listview_image", Integer.toString(listViewGambar[i]));
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_title", "listview_desc"};
        int[] to = {R.id.imageViewLogo, R.id.textViewJudul, R.id.textViewDeskripsi};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_activity, from, to);
        listView.setAdapter(simpleAdapter);
    }
}
