package amadeuszbubniak.kononowicz_soundboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoundboardActivity extends AppCompatActivity {

    Toolbar toolbar;

    ArrayList<SoundObject> soundList = new ArrayList<>();
    RecyclerView SoundView;
    SoundboardRecyclerAdapter SoundAdapter = new SoundboardRecyclerAdapter(soundList);
    RecyclerView.LayoutManager SoundLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundboard);

        toolbar = (Toolbar) findViewById(R.id.soundbar_toolbar); //text on toolbar
        setSupportActionBar(toolbar);

        List<String> nameList = Arrays.asList(getResources().getStringArray(R.array.soundNames));

        SoundObject[] soundItems = {new SoundObject(nameList.get(0),R.raw.audio01),new SoundObject(nameList.get(1),R.raw.audio02),new SoundObject(nameList.get(2),R.raw.audio03)};

        soundList.addAll(Arrays.asList(soundItems));

        SoundView = (RecyclerView) findViewById(R.id.soundboardRecyclerView);

        SoundLayoutManager = new GridLayoutManager(this, 3);

        SoundView.setLayoutManager(SoundLayoutManager);

        SoundView.setAdapter(SoundAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventHandlerClass.releaseMediaPlayer();
    }
}
