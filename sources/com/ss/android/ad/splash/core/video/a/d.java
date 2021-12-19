package com.ss.android.ad.splash.core.video.a;

import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;

public final class d extends a {

    /* renamed from: g  reason: collision with root package name */
    public final MediaPlayer f58735g;

    /* renamed from: h  reason: collision with root package name */
    private final c f58736h;

    /* renamed from: i  reason: collision with root package name */
    private MediaDataSource f58737i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f58738j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f58739k;

    static {
        Covode.recordClassIndex(36396);
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final void b() {
        this.f58735g.pause();
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final void c() {
        this.f58735g.setScreenOnWhilePlaying(true);
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final void d() {
        this.f58735g.stop();
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final void h() {
        this.f58735g.start();
    }

    private void k() {
        MediaDataSource mediaDataSource = this.f58737i;
        if (mediaDataSource != null) {
            try {
                mediaDataSource.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.f58737i = null;
        }
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final long f() {
        try {
            return (long) this.f58735g.getDuration();
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final long i() {
        try {
            return (long) this.f58735g.getCurrentPosition();
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final void e() {
        this.f58739k = true;
        this.f58735g.release();
        k();
        a();
        l();
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final void g() {
        try {
            this.f58735g.reset();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        k();
        a();
        l();
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final void j() {
        MediaPlayer mediaPlayer = this.f58735g;
        if (mediaPlayer != null && !this.f58739k && mediaPlayer.isPlaying()) {
            this.f58735g.setVolume(0.0f, 0.0f);
        }
    }

    public d() {
        MediaPlayer mediaPlayer;
        MethodCollector.i(2364);
        Object obj = new Object();
        this.f58738j = obj;
        synchronized (obj) {
            try {
                mediaPlayer = new MediaPlayer();
                this.f58735g = mediaPlayer;
            } catch (Throwable th) {
                MethodCollector.o(2364);
                throw th;
            }
        }
        mediaPlayer.setAudioStreamType(3);
        this.f58736h = new c(this);
        l();
        MethodCollector.o(2364);
    }

    private void l() {
        this.f58735g.setOnSeekCompleteListener(this.f58736h);
        this.f58735g.setOnInfoListener(this.f58736h);
        this.f58735g.setOnCompletionListener(this.f58736h);
        this.f58735g.setOnVideoSizeChangedListener(this.f58736h);
        this.f58735g.setOnPreparedListener(this.f58736h);
        this.f58735g.setOnErrorListener(this.f58736h);
        this.f58735g.setOnBufferingUpdateListener(this.f58736h);
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final void a(long j2) {
        this.f58735g.seekTo((int) j2);
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final void a(Context context) {
        this.f58735g.setWakeMode(context, 10);
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final void a(Surface surface) {
        this.f58735g.setSurface(surface);
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final void a(SurfaceHolder surfaceHolder) {
        MethodCollector.i(2367);
        synchronized (this.f58738j) {
            try {
                if (!this.f58739k) {
                    this.f58735g.setDisplay(surfaceHolder);
                }
            } finally {
                MethodCollector.o(2367);
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final void a(String str) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase("file")) {
            this.f58735g.setDataSource(str);
        } else {
            this.f58735g.setDataSource(parse.getPath());
        }
    }

    @Override // com.ss.android.ad.splash.core.video.a.b
    public final void a(boolean z) {
        this.f58735g.setLooping(z);
    }
}
