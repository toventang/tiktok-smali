package com.amazing.media;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import java.io.IOException;

public class AudioPlayer {

    /* renamed from: a  reason: collision with root package name */
    private MediaPlayer f5770a = new MediaPlayer();

    /* renamed from: b  reason: collision with root package name */
    private String f5771b;

    static {
        Covode.recordClassIndex(2414);
    }

    public boolean isPlaying() {
        return this.f5770a.isPlaying();
    }

    public void pause() {
        this.f5770a.pause();
    }

    public void resume() {
        this.f5770a.start();
    }

    public void stop() {
        this.f5770a.stop();
    }

    public void destroy() {
        MediaPlayer mediaPlayer = this.f5770a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f5770a.release();
            this.f5770a = null;
        }
    }

    public void play() {
        this.f5770a.reset();
        if (prepare()) {
            this.f5770a.start();
        }
    }

    public boolean prepare() {
        try {
            this.f5770a.setDataSource(this.f5771b);
            this.f5770a.setAudioStreamType(3);
            this.f5770a.prepare();
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void setLoop(boolean z) {
        this.f5770a.setLooping(z);
    }

    public AudioPlayer(String str) {
        this.f5771b = str;
    }
}
