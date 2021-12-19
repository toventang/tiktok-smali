package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.adaptation.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.df.e;

public class RepeatMusicPlayer implements au {

    /* renamed from: a  reason: collision with root package name */
    public MediaPlayer f126317a;

    /* renamed from: b  reason: collision with root package name */
    public int f126318b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f126319c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public Runnable f126320d = new Runnable() {
        /* class com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer.AnonymousClass1 */

        static {
            Covode.recordClassIndex(82903);
        }

        public final void run() {
            int currentPosition;
            if (RepeatMusicPlayer.this.f126317a != null && RepeatMusicPlayer.this.f126317a.isPlaying() && (currentPosition = RepeatMusicPlayer.this.f126317a.getCurrentPosition()) <= RepeatMusicPlayer.this.f126317a.getDuration()) {
                if (RepeatMusicPlayer.this.f126321e != null) {
                    RepeatMusicPlayer.this.f126321e.f(currentPosition);
                }
                RepeatMusicPlayer.this.f126319c.post(RepeatMusicPlayer.this.f126320d);
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    public a f126321e;

    /* renamed from: f  reason: collision with root package name */
    private int f126322f;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f126323g;

    /* renamed from: h  reason: collision with root package name */
    private Handler f126324h = new Handler(Looper.getMainLooper());

    public interface a {
        static {
            Covode.recordClassIndex(82906);
        }

        void f(int i2);
    }

    static {
        Covode.recordClassIndex(82902);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_PAUSE) {
            pause();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f126324h.removeCallbacksAndMessages(null);
        this.f126319c.removeCallbacksAndMessages(null);
        a();
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_PAUSE)
    public void pause() {
        MediaPlayer mediaPlayer = this.f126317a;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f126317a.pause();
        }
        this.f126319c.removeCallbacksAndMessages(null);
    }

    public final void a() {
        e.a("stopMusic() called");
        MediaPlayer mediaPlayer = this.f126317a;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f126317a.pause();
            }
            this.f126317a.stop();
            this.f126317a.release();
            this.f126317a = null;
        }
        this.f126319c.removeCallbacksAndMessages(null);
    }

    private Runnable b(final int i2) {
        return new Runnable() {
            /* class com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer.AnonymousClass2 */

            static {
                Covode.recordClassIndex(82904);
            }

            public final void run() {
                if (RepeatMusicPlayer.this.f126317a != null) {
                    if (RepeatMusicPlayer.this.f126317a.isPlaying()) {
                        RepeatMusicPlayer.this.f126317a.pause();
                    }
                    RepeatMusicPlayer.this.a(i2);
                }
            }
        };
    }

    public final void a(int i2) {
        this.f126318b = i2;
        e.a("playMusic() called");
        MediaPlayer mediaPlayer = this.f126317a;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f126317a.pause();
            }
            Runnable runnable = this.f126323g;
            if (runnable != null) {
                this.f126324h.removeCallbacks(runnable);
            }
            this.f126323g = b(i2);
            this.f126317a.seekTo(i2);
            this.f126324h.postDelayed(this.f126323g, (long) this.f126322f);
            this.f126317a.start();
            Runnable runnable2 = this.f126320d;
            if (runnable2 != null) {
                this.f126319c.removeCallbacks(runnable2);
            }
            this.f126319c.post(this.f126320d);
        }
    }

    public RepeatMusicPlayer(b bVar, String str, int i2) {
        this.f126322f = i2;
        bVar.getLifecycle().a(this);
        MediaPlayer create = MediaPlayer.create(bVar, Uri.parse(str));
        this.f126317a = create;
        if (create != null) {
            create.setAudioStreamType(3);
            this.f126317a.setDisplay(null);
            this.f126317a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                /* class com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(82905);
                }

                public final void onCompletion(MediaPlayer mediaPlayer) {
                    RepeatMusicPlayer repeatMusicPlayer = RepeatMusicPlayer.this;
                    repeatMusicPlayer.a(repeatMusicPlayer.f126318b);
                }
            });
        }
    }
}
