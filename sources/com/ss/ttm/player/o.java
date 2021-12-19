package com.ss.ttm.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttm.player.m;
import java.io.FileDescriptor;
import java.util.Map;

public final class o extends n {

    /* renamed from: a  reason: collision with root package name */
    protected m.e f152067a;

    /* renamed from: b  reason: collision with root package name */
    protected m.c f152068b;

    /* renamed from: c  reason: collision with root package name */
    protected m.g f152069c;

    /* renamed from: d  reason: collision with root package name */
    protected m.b f152070d;

    /* renamed from: e  reason: collision with root package name */
    protected m.i f152071e;

    /* renamed from: f  reason: collision with root package name */
    protected m.a f152072f;

    /* renamed from: g  reason: collision with root package name */
    private MediaPlayer f152073g;

    /* renamed from: h  reason: collision with root package name */
    private m f152074h;

    static {
        Covode.recordClassIndex(101356);
    }

    @Override // com.ss.ttm.player.n
    public final void a(int i2, int i3) {
    }

    @Override // com.ss.ttm.player.n
    public final void a(IMediaDataSource iMediaDataSource) {
    }

    @Override // com.ss.ttm.player.n
    public final void a(f fVar) {
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.d dVar) {
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.k kVar) {
    }

    @Override // com.ss.ttm.player.n
    public final int c() {
        return 0;
    }

    @Override // com.ss.ttm.player.n
    public final void i() {
    }

    @Override // com.ss.ttm.player.n
    public final void a(boolean z) {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setLooping(z);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.b bVar) {
        this.f152070d = bVar;
        this.f152073g.setOnCompletionListener(new b(bVar, this.f152074h));
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.c cVar) {
        this.f152068b = cVar;
        this.f152073g.setOnErrorListener(new c(cVar, this.f152074h));
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.e eVar) {
        this.f152067a = eVar;
        this.f152073g.setOnInfoListener(new d(eVar, this.f152074h));
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.g gVar) {
        this.f152069c = gVar;
        this.f152073g.setOnPreparedListener(new e(gVar, this.f152074h));
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.i iVar) {
        this.f152071e = iVar;
        this.f152073g.setOnSeekCompleteListener(new f(iVar, this.f152074h));
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.j jVar) {
        this.f152073g.setOnVideoSizeChangedListener(new g(jVar, this.f152074h));
    }

    @Override // com.ss.ttm.player.n
    public final void a(FileDescriptor fileDescriptor, long j2, long j3) {
        this.f152073g.setDataSource(fileDescriptor, j2, j3);
    }

    @Override // com.ss.ttm.player.n
    public final void a(p pVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            PlaybackParams playbackParams = new PlaybackParams();
            float f2 = pVar.f152093d;
            if (f2 > 0.0f) {
                playbackParams.setSpeed(f2);
            }
            int i2 = pVar.f152091b;
            if (i2 >= 0) {
                playbackParams.setAudioFallbackMode(i2);
            }
            float f3 = pVar.f152092c;
            if (f3 > 0.0f) {
                playbackParams.setPitch(f3);
            }
            MediaPlayer mediaPlayer = this.f152073g;
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.setPlaybackParams(playbackParams);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final void e() {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.start();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final void f() {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.pause();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final void g() {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.reset();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final void h() {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final void k() {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.prepareAsync();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final void j() {
        new Thread(new Runnable() {
            /* class com.ss.ttm.player.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(101357);
            }

            public final void run() {
                o.this.d();
            }
        }).start();
    }

    @Override // com.ss.ttm.player.n
    public final int l() {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getCurrentPosition();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.ss.ttm.player.n
    public final int m() {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getVideoHeight();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.ss.ttm.player.n
    public final int n() {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getVideoWidth();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.ss.ttm.player.n
    public final int o() {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getDuration();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.ss.ttm.player.n
    public final boolean p() {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.isPlaying();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.ss.ttm.player.n
    public final void q() {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setScreenOnWhilePlaying(true);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final void d() {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (Exception unused) {
            } finally {
                this.f152073g = null;
            }
        }
    }

    static class b implements MediaPlayer.OnCompletionListener {

        /* renamed from: a  reason: collision with root package name */
        private m.b f152078a;

        /* renamed from: b  reason: collision with root package name */
        private m f152079b;

        static {
            Covode.recordClassIndex(101359);
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            this.f152078a.a(this.f152079b);
        }

        public b(m.b bVar, m mVar) {
            this.f152079b = mVar;
            this.f152078a = bVar;
        }
    }

    static class e implements MediaPlayer.OnPreparedListener {

        /* renamed from: a  reason: collision with root package name */
        private m.g f152084a;

        /* renamed from: b  reason: collision with root package name */
        private m f152085b;

        static {
            Covode.recordClassIndex(101362);
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            this.f152084a.a(this.f152085b);
        }

        public e(m.g gVar, m mVar) {
            this.f152084a = gVar;
            this.f152085b = mVar;
        }
    }

    static class f implements MediaPlayer.OnSeekCompleteListener {

        /* renamed from: a  reason: collision with root package name */
        private m.i f152086a;

        /* renamed from: b  reason: collision with root package name */
        private m f152087b;

        static {
            Covode.recordClassIndex(101363);
        }

        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            this.f152086a.a();
        }

        public f(m.i iVar, m mVar) {
            this.f152086a = iVar;
            this.f152087b = mVar;
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(int i2) {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.seekTo(i2);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final void b(SurfaceHolder surfaceHolder) {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setDisplay(surfaceHolder);
            } catch (Exception unused) {
            }
        }
    }

    public static final synchronized o a(m mVar) {
        o oVar;
        synchronized (o.class) {
            MethodCollector.i(1945);
            oVar = new o();
            oVar.f152073g = new MediaPlayer();
            oVar.f152074h = mVar;
            MethodCollector.o(1945);
        }
        return oVar;
    }

    @Override // com.ss.ttm.player.n
    public final void a(Surface surface) {
        this.f152073g.setSurface(surface);
    }

    @Override // com.ss.ttm.player.n
    public final void a(m.a aVar) {
        this.f152072f = aVar;
        this.f152073g.setOnBufferingUpdateListener(new a(aVar, this.f152074h));
    }

    static class a implements MediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private m.a f152076a;

        /* renamed from: b  reason: collision with root package name */
        private m f152077b;

        static {
            Covode.recordClassIndex(101358);
        }

        public a(m.a aVar, m mVar) {
            this.f152077b = mVar;
            this.f152076a = aVar;
        }

        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
            this.f152076a.a(i2);
        }
    }

    static class c implements MediaPlayer.OnErrorListener {

        /* renamed from: a  reason: collision with root package name */
        private m.c f152080a;

        /* renamed from: b  reason: collision with root package name */
        private m f152081b;

        static {
            Covode.recordClassIndex(101360);
        }

        public c(m.c cVar, m mVar) {
            this.f152081b = mVar;
            this.f152080a = cVar;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
            return this.f152080a.a(this.f152081b, i2, i3);
        }
    }

    static class d implements MediaPlayer.OnInfoListener {

        /* renamed from: a  reason: collision with root package name */
        private m.e f152082a;

        /* renamed from: b  reason: collision with root package name */
        private m f152083b;

        static {
            Covode.recordClassIndex(101361);
        }

        public d(m.e eVar, m mVar) {
            this.f152083b = mVar;
            this.f152082a = eVar;
        }

        public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
            return this.f152082a.a(this.f152083b, i2, i3);
        }
    }

    static class g implements MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a  reason: collision with root package name */
        private m.j f152088a;

        /* renamed from: b  reason: collision with root package name */
        private m f152089b;

        static {
            Covode.recordClassIndex(101364);
        }

        public g(m.j jVar, m mVar) {
            this.f152088a = jVar;
            this.f152089b = mVar;
        }

        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
            this.f152088a.a(this.f152089b, i2, i3);
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(float f2, float f3) {
        MediaPlayer mediaPlayer = this.f152073g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f2, f3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.ttm.player.n
    public final void a(Context context, Uri uri) {
        this.f152073g.setDataSource(context, uri);
    }

    @Override // com.ss.ttm.player.n
    public final void a(Context context, Uri uri, Map<String, String> map) {
        this.f152073g.setDataSource(context, uri, map);
    }
}
