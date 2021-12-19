package com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.b.g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.m;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;
import com.lynx.tasm.base.LLog;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.bb;
import com.ss.ttvideoengine.j.p;
import com.ss.ttvideoengine.w;
import com.ss.ttvideoengine.y;
import h.f.b.l;
import h.i;
import java.io.FileDescriptor;

public final class c implements h {

    /* renamed from: h  reason: collision with root package name */
    public static final a f36865h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f36866a = 300;

    /* renamed from: b  reason: collision with root package name */
    public boolean f36867b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f36868c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f36869d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f36870e;

    /* renamed from: f  reason: collision with root package name */
    public volatile long f36871f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a f36872g;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f36873i;

    static final class b implements bb {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36874a = new a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        private long f36875b = Long.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        private long f36876c = Long.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        private final Handler f36877d = new Handler(Looper.getMainLooper());

        /* renamed from: e  reason: collision with root package name */
        private final c f36878e;

        /* renamed from: f  reason: collision with root package name */
        private final com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a f36879f;

        static {
            Covode.recordClassIndex(22128);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(int i2) {
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(aj ajVar, int i2, int i3) {
        }

        public static final class a {
            static {
                Covode.recordClassIndex(22129);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.c$b$b  reason: collision with other inner class name */
        public static final class RunnableC0900b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f36880a;

            static {
                Covode.recordClassIndex(22130);
            }

            RunnableC0900b(b bVar) {
                this.f36880a = bVar;
            }

            public final void run() {
                this.f36880a.a();
            }
        }

        /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.c$b$c  reason: collision with other inner class name */
        static final class RunnableC0901c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f36881a;

            static {
                Covode.recordClassIndex(22131);
            }

            RunnableC0901c(b bVar) {
                this.f36881a = bVar;
            }

            public final void run() {
                this.f36881a.a();
            }
        }

        public final void a() {
            long e2 = this.f36878e.e();
            if (e2 != this.f36875b) {
                this.f36879f.b(this.f36878e, e2);
                if (Math.abs(e2 - this.f36876c) >= 500) {
                    this.f36879f.a(this.f36878e, e2);
                    this.f36876c = e2;
                }
                this.f36875b = e2;
            }
            this.f36877d.postAtTime(new RunnableC0900b(this), this, SystemClock.uptimeMillis() + 50);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(aj ajVar) {
            this.f36879f.a(this.f36878e);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void d(aj ajVar) {
            this.f36879f.d(this.f36878e);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void b(aj ajVar) {
            this.f36879f.b(this.f36878e);
            c cVar = this.f36878e;
            cVar.f36869d = true;
            if (cVar.f36870e) {
                cVar.a(-1);
            }
        }

        @Override // com.ss.ttvideoengine.bb
        public final void c(aj ajVar) {
            this.f36879f.c(this.f36878e);
            this.f36879f.a(this.f36878e, o.PLAYBACK_STATE_START);
            c cVar = this.f36878e;
            long j2 = cVar.f36871f;
            cVar.f36871f = 0;
            if (j2 > 0) {
                cVar.a(j2, (m) null);
            }
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(com.ss.ttvideoengine.s.c cVar) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b bVar;
            if (cVar == null || !(cVar.b() == 1001 || cVar.b() == 1003 || cVar.b() == 1000)) {
                bVar = com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b.UNKNOWN;
            } else {
                bVar = com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b.NETWORK_ERROR;
            }
            g.f36700a.c("TTAudioEngineImpl", " ---> onError()  internal  --- errorCode is " + bVar.name());
            this.f36879f.a(bVar);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void c(aj ajVar, int i2) {
            this.f36879f.e(this.f36878e);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void d(aj ajVar, int i2) {
            this.f36879f.f(this.f36878e);
        }

        public b(c cVar, com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a aVar) {
            l.c(cVar, "");
            l.c(aVar, "");
            this.f36878e = cVar;
            this.f36879f = aVar;
        }

        @Override // com.ss.ttvideoengine.bb
        public final void b(aj ajVar, int i2) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l lVar;
            if (i2 == 1) {
                lVar = com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l.LOAD_STATE_PLAYABLE;
            } else if (i2 != 2) {
                lVar = com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l.LOAD_STATE_ERROR;
            } else {
                lVar = com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l.LOAD_STATE_STALLED;
            }
            lVar.name();
            this.f36879f.a(this.f36878e, lVar);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(aj ajVar, int i2) {
            if (i2 == 1) {
                this.f36878e.f36870e = false;
            } else if (i2 == 2) {
                this.f36878e.f36870e = false;
            }
            a.a(i2).name();
            if (i2 == 1) {
                this.f36877d.postAtTime(new RunnableC0901c(this), this, SystemClock.uptimeMillis() + 50);
            } else {
                this.f36879f.a(this.f36878e, this.f36878e.e());
                this.f36877d.removeCallbacksAndMessages(this);
            }
            this.f36879f.a(this.f36878e, a.a(i2));
        }
    }

    static {
        Covode.recordClassIndex(22126);
    }

    private final aj k() {
        return (aj) this.f36873i.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22127);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static o a(int i2) {
            if (i2 == 0) {
                return o.PLAYBACK_STATE_STOPPED;
            }
            if (i2 == 1) {
                return o.PLAYBACK_STATE_PLAYING;
            }
            if (i2 == 2) {
                return o.PLAYBACK_STATE_PAUSED;
            }
            if (i2 != 3) {
                return o.PLAYBACK_STATE_STOPPED;
            }
            return o.PLAYBACK_STATE_ERROR;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final long f() {
        return (long) k().x;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final int g() {
        return k().y;
    }

    private final void l() {
        this.f36868c = false;
        this.f36869d = false;
        this.f36870e = false;
        this.f36871f = 0;
    }

    private final boolean m() {
        if (k().v == 2) {
            return true;
        }
        return false;
    }

    private final boolean n() {
        if (k().v == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final o d() {
        return a.a(k().v);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final long e() {
        return (long) k().s();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final long h() {
        return k().i();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void a() {
        g.f36700a.a("TTAudioEngineImpl", " ---> stop(),  already stop ?: " + n());
        if (!n()) {
            k().m();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void b() {
        g.f36700a.a("TTAudioEngineImpl", " ---> stop(),  already pause ?: " + m());
        if (!m()) {
            k().l();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void c() {
        g gVar = g.f36700a;
        StringBuilder sb = new StringBuilder(" ---> resume(),  isPlaying ?: ");
        boolean z = true;
        if (k().v != 1) {
            z = false;
        }
        gVar.a("TTAudioEngineImpl", sb.append(z).toString());
        if (m()) {
            k().k();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void i() {
        g.f36700a.a("TTAudioEngineImpl", " ---> release(),  mIsEngineInstantiate ?: " + this.f36867b);
        if (this.f36867b) {
            k().a((bb) null);
            k().n();
            return;
        }
        g.f36700a.c("TTAudioEngineImpl", "TTVideoEngine is not instantiate, ignore release.");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final boolean j() {
        try {
            Object a2 = com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.b.a(k(), "mIsPlayComplete");
            l.a(a2, "");
            return ((Boolean) a2).booleanValue();
        } catch (Throwable th) {
            LLog.d("TTAudioEngineImpl", "isPlayingCompletion: " + Log.getStackTraceString(th));
            return false;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.c$c  reason: collision with other inner class name */
    static final class C0902c extends h.f.b.m implements h.f.a.a<aj> {
        final /* synthetic */ Context $context;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(22132);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0902c(c cVar, Context context) {
            super(0);
            this.this$0 = cVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ aj invoke() {
            aj ajVar = new aj(this.$context, 0);
            ajVar.h(false);
            ajVar.aI = "TTAudioEngineImpl";
            ajVar.f(160, 1);
            ajVar.f(402, 1);
            ajVar.f(27, 1);
            ajVar.f(416, 0);
            ajVar.f(314, 1);
            ajVar.f(28, 6);
            ajVar.f(18, 1);
            ajVar.f(415, 1);
            ajVar.f(0, this.this$0.f36866a);
            ajVar.aW = true;
            c cVar = this.this$0;
            ajVar.a(new b(cVar, cVar.f36872g));
            this.this$0.f36867b = true;
            return ajVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f36882a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f36883b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f36884c;

        static {
            Covode.recordClassIndex(22133);
        }

        d(c cVar, m mVar, long j2) {
            this.f36882a = cVar;
            this.f36883b = mVar;
            this.f36884c = j2;
        }

        @Override // com.ss.ttvideoengine.y
        public final void a(boolean z) {
            m mVar = this.f36883b;
            if (mVar != null) {
                mVar.a(this.f36884c, z);
            }
            this.f36882a.f36868c = false;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void a(long j2) {
        g.f36700a.a("TTAudioEngineImpl", " ---> play(),  startPlayTime is ".concat(String.valueOf(j2)));
        this.f36870e = true;
        if (this.f36869d) {
            k().k();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void b(String str) {
        g.f36700a.a("TTAudioEngineImpl", " ---> setDirectURL(),  playUrl is ".concat(String.valueOf(str)));
        l();
        k().h(str);
        k().j();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void a(String str) {
        g.f36700a.a("TTAudioEngineImpl", " ---> setLocalURL(),  localFilePath is ".concat(String.valueOf(str)));
        l();
        k().f(str);
        k().j();
    }

    public c(Context context, com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a aVar) {
        l.c(context, "");
        l.c(aVar, "");
        this.f36872g = aVar;
        this.f36873i = i.a((h.f.a.a) new C0902c(this, context));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void a(long j2, m mVar) {
        g.f36700a.a("TTAudioEngineImpl", " ---> seekToTime(),  time is ?: " + j2 + ",   mIsSeeking : " + this.f36868c);
        if (!this.f36868c && j2 >= 0) {
            this.f36868c = true;
            long a2 = h.j.h.a(0L, f() - InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            if (j2 > a2) {
                j2 = a2;
            }
            k().a((int) j2, new d(this, mVar, j2));
        } else if (mVar != null) {
            mVar.a(j2, false);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void a(w wVar, p pVar) {
        l();
        if (pVar == null) {
            g.f36700a.a("TTAudioEngineImpl", "videoMode is empty");
            return;
        }
        k().a(pVar);
        k().a(wVar);
        k().j();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void a(String str, String str2) {
        g.f36700a.a("TTAudioEngineImpl", " ---> setDirectUrlUseDataLoader(),  playUrl is " + str + ",   cacheKey is " + str2);
        l();
        k().b(str, str2);
        k().j();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h
    public final void a(FileDescriptor fileDescriptor, long j2, long j3) {
        String str;
        g gVar = g.f36700a;
        StringBuilder sb = new StringBuilder(" ---> setDataSource(),  FileDescriptor is ");
        if (fileDescriptor != null) {
            str = fileDescriptor.toString();
        } else {
            str = null;
        }
        gVar.a("TTAudioEngineImpl", sb.append(str).toString());
        l();
        k().a(fileDescriptor, j2, j3);
    }
}
