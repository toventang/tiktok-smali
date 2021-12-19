package com.ss.android.ad.splash.core.video.a;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class c implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<d> f58734a;

    static {
        Covode.recordClassIndex(36395);
    }

    public c(d dVar) {
        this.f58734a = new WeakReference<>(dVar);
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f58734a.get() != null) {
            d dVar = this.f58734a.get();
            if (dVar.f58731e != null) {
                dVar.f58731e.d();
            }
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (this.f58734a.get() != null) {
            d dVar = this.f58734a.get();
            if (dVar.f58727a != null) {
                dVar.f58727a.e();
            }
        }
    }

    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.f58734a.get() != null) {
            d dVar = this.f58734a.get();
            if (dVar.f58730d != null) {
                dVar.f58730d.f();
            }
        }
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        if (this.f58734a.get() != null) {
            d dVar = this.f58734a.get();
            if (dVar.f58729c != null) {
                dVar.f58729c.a(dVar, i2);
            }
        }
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        if (this.f58734a.get() != null) {
            this.f58734a.get();
        }
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        if (this.f58734a.get() == null) {
            return false;
        }
        d dVar = this.f58734a.get();
        if (dVar.f58728b == null) {
            return false;
        }
        dVar.f58728b.a(i2, i3);
        return false;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        if (this.f58734a.get() == null) {
            return false;
        }
        d dVar = this.f58734a.get();
        if (dVar.f58732f == null) {
            return false;
        }
        dVar.f58732f.a(dVar, i2, i3);
        return false;
    }
}
