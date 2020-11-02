package com.example.gmailmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<EmailPacketModel> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();

//        TextView ic_textview = findViewById(R.id.ic_textview);
//        TextView label = findViewById(R.id.label);
//        TextView sub_string = findViewById(R.id.sub_string);
//        TextView time = findViewById(R.id.time);
//
//        String s = "Edurila.com";
//        String s1 = s.charAt(0) + "";
//        ic_textview.setText(s1);
//        label.setText(s);
//        sub_string.setText("$19 Only(First 10 spots - Bestselling... ");
//        time.setText("12:34 PM");

        items.add(new EmailPacketModel("Edurila.com", "$19        Only(First 10 spots - Bestselling... Are you looking to learn Web Design...", "12:34 PM"));
        items.add(new EmailPacketModel("Chris Abad", "Help make Campaign Monitor better Let us know your thoughts! No Images...", "11:22 AM"));
        items.add(new EmailPacketModel("Tuto.com", "8h de formation gratuite et les nouvea... Photoshop, SEO, Blender, CSS, WorlPre...", "11:04 AM"));
        items.add(new EmailPacketModel("support", "Société Ovh: suivi de vos sevices- hp... SAS OVH - http://www.ovh.com 2 rue K...", "10:26 AM"));
        items.add(new EmailPacketModel("Matt from lonic", "The New lonic Creator Is Here! Announcing the all-new Creator, build...", "10:04 AM"));

        EmailAdapter adapter = new EmailAdapter(this, items);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}