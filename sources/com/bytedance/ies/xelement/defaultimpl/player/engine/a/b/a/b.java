package com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.b.g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.m;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;
import com.ss.ttvideoengine.w;
import h.f.b.l;
import h.m.p;
import java.io.FileDescriptor;

public final class b implements h {

    /* renamed from: g  reason: collision with root package name */
    public static final String f36845g = b.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    public static final a f36846h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f36847a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f36848b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f36849c;

    /* renamed from: d  reason: collision with root package name */
    public o f36850d = o.PLAYBACK_STATE_STOPPED;

    /* renamed from: e  reason: collision with root package name */
    public final Context f36851e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a f36852f;

    /* renamed from: i  reason: collision with root package name */
    private MediaPlayer f36853i;

    /* renamed from: j  reason: collision with root package name */
    private long f36854j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f36855k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f36856l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f36857m = true;
    private long n = Long.MIN_VALUE;
    private long o = Long.MIN_VALUE;
    private final Handler p = new Handler(Looper.getMainLooper());

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final int g() {
        return 0;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final long h() {
        return 0;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final boolean j() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22120);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final o d() {
        return this.f36850d;
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36863a;

        static {
            Covode.recordClassIndex(22124);
        }

        e(b bVar) {
            this.f36863a = bVar;
        }

        public final void run() {
            this.f36863a.m();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36864a;

        static {
            Covode.recordClassIndex(22125);
        }

        f(b bVar) {
            this.f36864a = bVar;
        }

        public final void run() {
            this.f36864a.m();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void i() {
        g.f36700a.a(f36845g, " ---> release()");
        o();
    }

    static {
        Covode.recordClassIndex(22119);
    }

    private final void n() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnPreparedListener(new C0899b(this));
        mediaPlayer.setOnCompletionListener(new c(this));
        mediaPlayer.setLooping(false);
        this.f36853i = mediaPlayer;
    }

    private final void o() {
        MediaPlayer mediaPlayer = this.f36853i;
        if (mediaPlayer != null) {
            k();
            mediaPlayer.setOnCompletionListener(null);
            mediaPlayer.setOnPreparedListener(null);
            mediaPlayer.setOnSeekCompleteListener(null);
            mediaPlayer.reset();
            mediaPlayer.release();
        }
        this.f36853i = null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void c() {
        g.f36700a.a(f36845g, " ---> resume(), mIsPaused: " + this.f36856l);
        if (this.f36856l) {
            l();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final long e() {
        MediaPlayer mediaPlayer;
        try {
            if (!this.f36847a || (mediaPlayer = this.f36853i) == null) {
                return 0;
            }
            return (long) mediaPlayer.getCurrentPosition();
        } catch (Throwable unused) {
            o();
            return 0;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final long f() {
        MediaPlayer mediaPlayer;
        try {
            if (!this.f36847a || (mediaPlayer = this.f36853i) == null) {
                return 0;
            }
            return (long) mediaPlayer.getDuration();
        } catch (Throwable th) {
            g.f36700a.c(f36845g, th.getMessage());
            o();
            return 0;
        }
    }

    public final void k() {
        g.f36700a.a(f36845g, " ---> resetFlags()");
        this.f36857m = true;
        this.f36848b = false;
        this.f36855k = false;
        this.f36855k = false;
        this.f36856l = false;
        this.f36849c = false;
        a(false);
    }

    public final void m() {
        long e2 = e();
        if (e2 != this.n) {
            this.f36852f.b(this, e2);
            if (Math.abs(e2 - this.o) >= 500) {
                this.f36852f.a(this, e2);
                this.o = e2;
            }
            this.n = e2;
        }
        this.p.postAtTime(new f(this), this, SystemClock.uptimeMillis() + 50);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void a() {
        g.f36700a.a(f36845g, " ---> stop(), mIsStopped: " + this.f36857m);
        if (!this.f36857m) {
            try {
                MediaPlayer mediaPlayer = this.f36853i;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
                o oVar = o.PLAYBACK_STATE_STOPPED;
                this.f36850d = oVar;
                this.f36852f.a(this, oVar);
                k();
                MediaPlayer mediaPlayer2 = this.f36853i;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setOnSeekCompleteListener(null);
                }
                MediaPlayer mediaPlayer3 = this.f36853i;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.seekTo(0);
                }
            } catch (Throwable th) {
                g.f36700a.c(f36845g, th.getMessage());
                o();
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void b() {
        g.f36700a.a(f36845g, " ---> pause(), mIsStarted: " + this.f36855k);
        if (this.f36855k) {
            try {
                MediaPlayer mediaPlayer = this.f36853i;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
            } catch (Throwable th) {
                g.f36700a.c(f36845g, th.getMessage());
                o();
            }
            this.f36856l = true;
            this.f36855k = false;
            this.f36848b = false;
            this.f36857m = false;
            o oVar = o.PLAYBACK_STATE_PAUSED;
            this.f36850d = oVar;
            this.f36852f.a(this, oVar);
            a(false);
        }
    }

    public final void l() {
        g.f36700a.a(f36845g, " ---> start(), startPlayTime: " + this.f36854j + ",   mIsStart: " + this.f36855k + ",   mIsPendingStart: " + this.f36848b + ",   mIsPrepared: " + this.f36847a);
        long j2 = this.f36854j;
        if (j2 > 0) {
            a(j2, (m) null);
            this.f36854j = 0;
        }
        try {
            MediaPlayer mediaPlayer = this.f36853i;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
            this.f36855k = true;
            this.f36848b = false;
            this.f36856l = false;
            this.f36857m = false;
            o oVar = o.PLAYBACK_STATE_PLAYING;
            this.f36850d = oVar;
            this.f36852f.a(this, oVar);
            a(true);
        } catch (Throwable th) {
            g.f36700a.c(f36845g, th.getMessage());
            this.f36852f.a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b.INVALIDATE_PLAYER_MODEL);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void a(String str) {
        b(str);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements MediaPlayer.OnCompletionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36859a;

        static {
            Covode.recordClassIndex(22122);
        }

        c(b bVar) {
            this.f36859a = bVar;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            this.f36859a.k();
            this.f36859a.f36850d = o.PLAYBACK_STATE_STOPPED;
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a aVar = this.f36859a.f36852f;
            b bVar = this.f36859a;
            aVar.a(bVar, bVar.f36850d);
            this.f36859a.f36852f.d(this.f36859a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements MediaPlayer.OnSeekCompleteListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36860a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f36861b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f36862c;

        static {
            Covode.recordClassIndex(22123);
        }

        d(b bVar, m mVar, long j2) {
            this.f36860a = bVar;
            this.f36861b = mVar;
            this.f36862c = j2;
        }

        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            m mVar = this.f36861b;
            if (mVar != null) {
                mVar.a(this.f36862c, true);
            }
            this.f36860a.a(true);
            this.f36860a.f36849c = false;
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.p.postAtTime(new e(this), this, SystemClock.uptimeMillis() + 50);
        } else {
            this.p.removeCallbacksAndMessages(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.b$b  reason: collision with other inner class name */
    public static final class C0899b implements MediaPlayer.OnPreparedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36858a;

        static {
            Covode.recordClassIndex(22121);
        }

        C0899b(b bVar) {
            this.f36858a = bVar;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            g.f36700a.a(b.f36845g, "---> onPrepared()");
            this.f36858a.f36847a = true;
            this.f36858a.f36852f.b(this.f36858a);
            if (this.f36858a.f36848b) {
                this.f36858a.l();
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void a(long j2) {
        g.f36700a.a(f36845g, " ---> play(), startPlayTime: " + j2 + ",   mIsStart: " + this.f36855k + ",   mIsPendingStart: " + this.f36848b + ",   mIsPrepared: " + this.f36847a);
        if (!this.f36855k && !this.f36848b) {
            this.f36854j = j2;
            if (this.f36847a) {
                l();
            } else {
                this.f36848b = true;
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void b(String str) {
        g gVar = g.f36700a;
        String str2 = f36845g;
        gVar.a(str2, " ---> setDirectURL(), url is ".concat(String.valueOf(str)));
        try {
            if (this.f36853i == null) {
                g.f36700a.a(str2, "mediaplayer is null ---> createMediaPlayer");
                n();
            }
            MediaPlayer mediaPlayer = this.f36853i;
            if (mediaPlayer != null) {
                this.f36847a = false;
                mediaPlayer.reset();
                if (str == null || !p.b(str, "http", false)) {
                    mediaPlayer.setDataSource(this.f36851e, Uri.parse(str));
                } else {
                    mediaPlayer.setDataSource(str);
                }
                this.f36852f.a(this);
                mediaPlayer.prepareAsync();
            }
        } catch (Throwable th) {
            g.f36700a.c(f36845g, th.getMessage());
            this.f36852f.a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b.INVALIDATE_PLAYER_MODEL);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void a(String str, String str2) {
        b(str);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void a(w wVar, com.ss.ttvideoengine.j.p pVar) {
        g.f36700a.c(f36845g, "light player not support VideoModel src Type");
    }

    public b(Context context, com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a aVar) {
        l.c(context, "");
        l.c(aVar, "");
        this.f36851e = context;
        this.f36852f = aVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void a(long j2, m mVar) {
        g.f36700a.a(f36845g, " ---> seekToTime(), time: " + j2 + ",   mIsSeeking: " + this.f36849c);
        if (!this.f36849c && j2 >= 0) {
            this.f36849c = true;
            a(false);
            try {
                MediaPlayer mediaPlayer = this.f36853i;
                if (mediaPlayer != null) {
                    mediaPlayer.seekTo((int) j2);
                }
                MediaPlayer mediaPlayer2 = this.f36853i;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setOnSeekCompleteListener(new d(this, mVar, j2));
                }
            } catch (Throwable th) {
                g.f36700a.c(f36845g, th.getMessage());
                o();
            }
        } else if (mVar != null) {
            mVar.a(j2, false);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void a(FileDescriptor fileDescriptor, long j2, long j3) {
        try {
            g gVar = g.f36700a;
            String str = f36845g;
            gVar.a(str, " ---> setDataSource(), file descriptor is " + String.valueOf(fileDescriptor));
            if (this.f36853i == null) {
                g.f36700a.a(str, "mediaplayer is null ---> createMediaPlayer");
                n();
            }
            MediaPlayer mediaPlayer = this.f36853i;
            if (mediaPlayer != null) {
                this.f36847a = false;
                mediaPlayer.reset();
                mediaPlayer.setDataSource(fileDescriptor, j2, j3);
                this.f36852f.a(this);
                mediaPlayer.prepareAsync();
            }
        } catch (Throwable th) {
            g.f36700a.c(f36845g, th.getMessage());
            this.f36852f.a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b.INVALIDATE_PLAYER_MODEL);
        }
    }
}
