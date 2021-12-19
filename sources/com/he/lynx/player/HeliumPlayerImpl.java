package com.he.lynx.player;

import android.media.MediaPlayer;
import android.os.Build;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.he.lynx.player.IHeliumPlayer;

public class HeliumPlayerImpl implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, IHeliumPlayer {
    private IHeliumPlayer.IHeliumPlayerListener listener = null;
    private MediaPlayer player = new MediaPlayer();

    static {
        Covode.recordClassIndex(34219);
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public int getCurrentPosition() {
        return this.player.getCurrentPosition();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public int getDuration() {
        return this.player.getDuration();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public int getVideoHeight() {
        return this.player.getVideoHeight();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public int getVideoWidth() {
        return this.player.getVideoWidth();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public boolean isPlaying() {
        return this.player.isPlaying();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void pause() {
        this.player.pause();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void play() {
        this.player.start();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void prepare() {
        this.player.prepareAsync();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void release() {
        this.player.release();
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void stop() {
        this.player.stop();
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener = this.listener;
        if (iHeliumPlayerListener != null) {
            iHeliumPlayerListener.onCompletion(this);
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener = this.listener;
        if (iHeliumPlayerListener != null) {
            iHeliumPlayerListener.onPrepared(this);
        }
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener = this.listener;
        if (iHeliumPlayerListener != null) {
            iHeliumPlayerListener.onSeekComplete(this);
        }
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void setDataSource(String str) {
        this.player.setDataSource(str);
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void setLooping(boolean z) {
        this.player.setLooping(z);
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void setSurface(Surface surface) {
        this.player.setSurface(surface);
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void seekTo(int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.player.seekTo((long) i2, 3);
        } else {
            this.player.seekTo(i2);
        }
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void setListener(IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener) {
        if (iHeliumPlayerListener == null) {
            this.player.setOnPreparedListener(null);
            this.player.setOnCompletionListener(null);
            this.player.setOnErrorListener(null);
            this.player.setOnInfoListener(null);
            this.player.setOnSeekCompleteListener(null);
        } else {
            this.player.setOnPreparedListener(this);
            this.player.setOnCompletionListener(this);
            this.player.setOnErrorListener(this);
            this.player.setOnInfoListener(this);
            this.player.setOnSeekCompleteListener(this);
        }
        this.listener = iHeliumPlayerListener;
    }

    @Override // com.he.lynx.player.IHeliumPlayer
    public void setVolume(float f2, float f3) {
        this.player.setVolume(f2, f3);
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        if (i2 != 3) {
            return false;
        }
        IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener = this.listener;
        if (iHeliumPlayerListener == null) {
            return true;
        }
        iHeliumPlayerListener.onRenderStart(this);
        return true;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        IHeliumPlayer.IHeliumPlayerListener iHeliumPlayerListener = this.listener;
        if (iHeliumPlayerListener != null) {
            return iHeliumPlayerListener.onError(this, new Error("what: " + i2 + ", extra: " + i3));
        }
        return false;
    }
}
