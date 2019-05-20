package video_player.smart027.com.videoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String mpfilelocation = "https://hw3.cdn.asset.aparat.com/aparat-video/34f348ec2462603fc676be9c2de6b3c813634993-720p__95218.mp4";

        JzvdStd jzvdStd = (JzvdStd) findViewById(R.id.videoplayer);
        jzvdStd.setUp(mpfilelocation , "media player" , Jzvd.SCREEN_WINDOW_NORMAL);
        //jzvdStd.startVideo();

    }

    @Override
    public void onBackPressed() {
        if (Jzvd.backPress()) {
            return;
        }
        super.onBackPressed();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Jzvd.releaseAllVideos();
    }
}
