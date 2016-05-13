package com.artjimlop.alteximagedownloadersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.artjimlop.altex.AltexImageDownloader;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    AltexImageDownloader.writeToDisk(this, "http://images.nationalgeographic.com/wpf/media-live/photos/000/936/cache/bear-road-denali_93621_990x742.jpg", "folder");
  }
}
