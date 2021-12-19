package com.ss.android.ugc.aweme.livewallpaper;

import android.graphics.Rect;
import android.media.MediaPlayer;
import android.os.Message;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.livewallpaper.a;
import com.ss.android.ugc.aweme.livewallpaper.c.j;
import com.ss.android.ugc.aweme.livewallpaper.c.k;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.video.e;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f108738a;

    /* renamed from: b  reason: collision with root package name */
    private a.AbstractC2787a f108739b;

    /* renamed from: c  reason: collision with root package name */
    private k f108740c;

    /* renamed from: d  reason: collision with root package name */
    private MediaPlayer f108741d;

    /* renamed from: e  reason: collision with root package name */
    private j f108742e;

    /* renamed from: f  reason: collision with root package name */
    private SurfaceHolder f108743f;

    /* renamed from: g  reason: collision with root package name */
    private Surface f108744g;

    /* renamed from: h  reason: collision with root package name */
    private LiveWallPaperBean f108745h;

    static {
        Covode.recordClassIndex(69664);
    }

    public final void c() {
        MediaPlayer mediaPlayer = this.f108741d;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f108741d.pause();
        }
    }

    private void e() {
        MediaPlayer mediaPlayer;
        LiveWallPaperBean liveWallPaperBean = this.f108745h;
        if (liveWallPaperBean != null && !liveWallPaperBean.isForceToPause() && (mediaPlayer = this.f108741d) != null && !mediaPlayer.isPlaying()) {
            this.f108741d.start();
        }
    }

    private void d() {
        if (this.f108745h.isShouldMute()) {
            this.f108741d.setVolume(0.0f, 0.0f);
        } else {
            this.f108741d.setVolume(this.f108745h.getVolume(), this.f108745h.getVolume());
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void b() {
        LiveWallPaperBean liveWallPaperBean = this.f108745h;
        if (liveWallPaperBean != null) {
            liveWallPaperBean.setForceToPause(!liveWallPaperBean.isForceToPause());
            if (this.f108745h.isForceToPause()) {
                c();
            } else {
                e();
            }
            r.a("double_tap_wallpaper", new d().a("action", !this.f108745h.isForceToPause()).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void a() {
        MediaPlayer mediaPlayer = this.f108741d;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f108741d = null;
        }
        Surface surface = this.f108744g;
        if (surface != null) {
            surface.release();
            this.f108744g = null;
        }
        j jVar = this.f108742e;
        if (jVar != null) {
            jVar.d();
        }
        k kVar = this.f108740c;
        if (kVar != null) {
            kVar.release();
        }
        this.f108743f = null;
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void a(LiveWallPaperBean liveWallPaperBean) {
        this.f108745h = liveWallPaperBean;
    }

    public b(a.AbstractC2787a aVar) {
        this.f108739b = aVar;
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void a(boolean z) {
        this.f108738a = z;
        if (z) {
            e();
        } else {
            c();
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void a(float f2) {
        LiveWallPaperBean liveWallPaperBean;
        if (this.f108741d != null && (liveWallPaperBean = this.f108745h) != null && !liveWallPaperBean.isShouldMute()) {
            this.f108745h.setVolume(f2);
            this.f108741d.setVolume(f2, f2);
        }
    }

    public final void a(boolean z, String str) {
        a.AbstractC2787a aVar = this.f108739b;
        if (aVar != null) {
            aVar.a(z, this.f108745h.getSource(), str);
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void a(SurfaceHolder surfaceHolder, int i2, int i3) {
        this.f108743f = surfaceHolder;
        j jVar = this.f108742e;
        if (jVar != null) {
            Message obtainMessage = jVar.f108817d.obtainMessage(10);
            obtainMessage.arg1 = i2;
            obtainMessage.arg2 = i3;
            jVar.f108817d.sendMessage(obtainMessage);
        }
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void a(String str, int i2, int i3) {
        if (!e.b(str)) {
            a(false, "onRefresh video is not exists");
            return;
        }
        SurfaceHolder surfaceHolder = this.f108743f;
        if (surfaceHolder != null) {
            Surface surface = surfaceHolder.getSurface();
            Rect surfaceFrame = this.f108743f.getSurfaceFrame();
            int height = surfaceFrame.height();
            int width = surfaceFrame.width();
            Pair<Float, Float> a2 = a(width, height, i2, i3);
            MediaPlayer mediaPlayer = this.f108741d;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.f108741d = null;
            }
            Surface surface2 = this.f108744g;
            if (surface2 != null) {
                surface2.release();
                this.f108744g = null;
            }
            j jVar = this.f108742e;
            if (jVar != null) {
                jVar.d();
            }
            k kVar = this.f108740c;
            if (kVar != null) {
                kVar.release();
            }
            j jVar2 = new j(surface);
            this.f108742e = jVar2;
            jVar2.o = a2;
            this.f108742e.e();
            k f2 = this.f108742e.f();
            this.f108740c = f2;
            if (f2 != null) {
                f2.setDefaultBufferSize(width, height);
                surface = new Surface(this.f108740c);
            }
            this.f108744g = surface;
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.f108741d = mediaPlayer2;
            try {
                mediaPlayer2.setSurface(surface);
                this.f108741d.setDataSource(str);
                this.f108741d.setLooping(true);
                d();
                this.f108741d.prepare();
                this.f108741d.start();
                this.f108741d.setOnInfoListener(new MediaPlayer.OnInfoListener() {
                    /* class com.ss.android.ugc.aweme.livewallpaper.b.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(69666);
                    }

                    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
                        if (i2 != 3) {
                            return false;
                        }
                        b.this.a(true, "");
                        if (b.this.f108738a) {
                            return false;
                        }
                        b.this.c();
                        return false;
                    }
                });
                this.f108741d.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                    /* class com.ss.android.ugc.aweme.livewallpaper.b.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(69667);
                    }

                    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
                        b.this.a(false, "media play error what = " + i2 + " extra = " + i3);
                        return false;
                    }
                });
                com.a.a("onSurfaceCreated: start video, path=%s", new Object[]{str});
            } catch (Exception e2) {
                e2.printStackTrace();
                a(false, "media play exception " + e2.getMessage());
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("WallPaperPlayerEngine", e2));
            }
        }
    }

    private static Pair<Float, Float> a(int i2, int i3, int i4, int i5) {
        float f2;
        float f3 = 1.0f;
        Float valueOf = Float.valueOf(1.0f);
        if (i5 <= 0 || i4 <= 0 || i3 <= 0 || i2 <= 0) {
            return new Pair<>(valueOf, valueOf);
        }
        float f4 = ((float) i4) / ((float) i5);
        float f5 = ((float) i2) / ((float) i3);
        if (f4 < f5) {
            f2 = f5 / f4;
        } else {
            f3 = f4 / f5;
            f2 = 1.0f;
        }
        return new Pair<>(Float.valueOf(f3), Float.valueOf(f2));
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.a
    public final void a(SurfaceHolder surfaceHolder, String str, int i2, int i3) {
        this.f108743f = surfaceHolder;
        if (surfaceHolder != null) {
            Surface surface = surfaceHolder.getSurface();
            Rect surfaceFrame = this.f108743f.getSurfaceFrame();
            int height = surfaceFrame.height();
            int width = surfaceFrame.width();
            Pair<Float, Float> a2 = a(width, height, i2, i3);
            MediaPlayer mediaPlayer = this.f108741d;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.f108741d = null;
            }
            Surface surface2 = this.f108744g;
            if (surface2 != null) {
                surface2.release();
                this.f108744g = null;
            }
            j jVar = this.f108742e;
            if (jVar != null) {
                jVar.d();
            }
            k kVar = this.f108740c;
            if (kVar != null) {
                kVar.release();
            }
            j jVar2 = new j(surface);
            this.f108742e = jVar2;
            jVar2.o = a2;
            this.f108742e.e();
            k f2 = this.f108742e.f();
            this.f108740c = f2;
            if (f2 != null) {
                f2.setDefaultBufferSize(width, height);
                surface = new Surface(this.f108740c);
            }
            this.f108744g = surface;
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.f108741d = mediaPlayer2;
            try {
                mediaPlayer2.setSurface(surface);
                this.f108741d.setDataSource(str);
                this.f108741d.setLooping(true);
                d();
                this.f108741d.prepare();
                this.f108741d.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                    /* class com.ss.android.ugc.aweme.livewallpaper.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(69665);
                    }

                    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
                        b.this.a(false, "onSurfaceCreated media play error what = " + i2 + " extra = " + i3);
                        return false;
                    }
                });
                e();
            } catch (Exception e2) {
                e2.printStackTrace();
                a(false, "onSurfaceCreated media play exception " + e2.getMessage());
            }
        }
    }
}
