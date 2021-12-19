package com.ss.android.ugc.aweme.dsp.playerservice.d.a;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.b.g;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.az;
import com.ss.ttvideoengine.ba;
import com.ss.ttvideoengine.bb;
import com.ss.ttvideoengine.y;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class e {

    /* renamed from: h  reason: collision with root package name */
    public static final String f83450h = e.class.getSimpleName();

    /* renamed from: i  reason: collision with root package name */
    public static final a f83451i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f83452a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f83453b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f83454c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f83455d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f83456e;

    /* renamed from: f  reason: collision with root package name */
    public final g f83457f = new g();

    /* renamed from: g  reason: collision with root package name */
    public final c f83458g;

    /* renamed from: j  reason: collision with root package name */
    private final h f83459j = i.a((h.f.a.a) new C1968e(this));

    public interface b {
        static {
            Covode.recordClassIndex(52084);
        }

        void a(boolean z);
    }

    public interface c {
        static {
            Covode.recordClassIndex(52085);
        }

        void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar);

        void a(e eVar);

        void a(e eVar, int i2);

        void a(e eVar, int i2, int i3);

        void a(e eVar, long j2);

        void a(e eVar, com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar);

        void a(e eVar, com.ss.android.ugc.aweme.dsp.playerservice.c.f fVar);

        void b(e eVar);

        void b(e eVar, long j2);

        void c(e eVar);

        void d(e eVar);

        void e(e eVar);
    }

    /* access modifiers changed from: package-private */
    public final aj a() {
        return (aj) this.f83459j.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52083);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static com.ss.android.ugc.aweme.dsp.playerservice.c.f a(int i2) {
            if (i2 == 0) {
                return com.ss.android.ugc.aweme.dsp.playerservice.c.f.PLAYBACK_STATE_STOPPED;
            }
            if (i2 == 1) {
                return com.ss.android.ugc.aweme.dsp.playerservice.c.f.PLAYBACK_STATE_PLAYING;
            }
            if (i2 == 2) {
                return com.ss.android.ugc.aweme.dsp.playerservice.c.f.PLAYBACK_STATE_PAUSED;
            }
            if (i2 != 3) {
                return com.ss.android.ugc.aweme.dsp.playerservice.c.f.PLAYBACK_STATE_STOPPED;
            }
            return com.ss.android.ugc.aweme.dsp.playerservice.c.f.PLAYBACK_STATE_ERROR;
        }
    }

    final class d implements bb {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f83460a;

        /* renamed from: b  reason: collision with root package name */
        private long f83461b = Long.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        private long f83462c = Long.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        private final Handler f83463d = new Handler(Looper.getMainLooper());

        /* renamed from: e  reason: collision with root package name */
        private final e f83464e;

        /* renamed from: f  reason: collision with root package name */
        private final c f83465f;

        static {
            Covode.recordClassIndex(52086);
        }

        /* access modifiers changed from: package-private */
        public static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f83466a;

            static {
                Covode.recordClassIndex(52087);
            }

            a(d dVar) {
                this.f83466a = dVar;
            }

            public final void run() {
                this.f83466a.a();
            }
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f83467a;

            static {
                Covode.recordClassIndex(52088);
            }

            b(d dVar) {
                this.f83467a = dVar;
            }

            public final void run() {
                this.f83467a.a();
            }
        }

        public final void a() {
            long e2 = this.f83464e.e();
            boolean z = !this.f83464e.f83455d;
            if (e2 != this.f83461b) {
                if (z) {
                    this.f83465f.b(this.f83464e, e2);
                }
                if (Math.abs(e2 - this.f83462c) >= 500) {
                    if (z) {
                        this.f83465f.a(this.f83464e, e2);
                    }
                    this.f83462c = e2;
                }
                this.f83461b = e2;
            }
            this.f83463d.postAtTime(new a(this), this, SystemClock.uptimeMillis() + 50);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(aj ajVar) {
            this.f83465f.a(this.f83464e);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void d(aj ajVar) {
            this.f83465f.d(this.f83464e);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(int i2) {
            String.valueOf("onVideoStatusException() -> ".concat(String.valueOf(i2)));
        }

        @Override // com.ss.ttvideoengine.bb
        public final void b(aj ajVar) {
            this.f83465f.b(this.f83464e);
            e eVar = this.f83464e;
            eVar.f83453b = true;
            if (eVar.f83454c) {
                eVar.b();
            }
        }

        @Override // com.ss.ttvideoengine.bb
        public final void c(aj ajVar) {
            int i2;
            g gVar = this.f83460a.f83457f;
            e eVar = this.f83460a;
            if (eVar.f83452a) {
                i2 = (int) (eVar.a().m(60) / 1000);
            } else {
                i2 = 0;
            }
            gVar.f83378c = i2;
            this.f83460a.f83457f.f83377b = this.f83460a.f();
            this.f83465f.c(this.f83464e);
            e eVar2 = this.f83464e;
            long j2 = eVar2.f83456e;
            eVar2.f83456e = 0;
            if (j2 > 0) {
                eVar2.a(j2, null);
            }
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(com.ss.ttvideoengine.s.c cVar) {
            com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar;
            if (cVar == null) {
                aVar = com.ss.android.ugc.aweme.dsp.playerservice.c.a.f83405f;
            } else if (cVar.b() == 1001 || cVar.b() == 1000) {
                aVar = com.ss.android.ugc.aweme.dsp.playerservice.c.a.f83402c;
            } else {
                int i2 = cVar.f153260a;
                String str = cVar.f153263d;
                l.b(str, "");
                aVar = new com.ss.android.ugc.aweme.dsp.playerservice.c.a(i2, str);
            }
            String.valueOf("onError() -> " + aVar.f83407a);
            this.f83465f.a(aVar);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void c(aj ajVar, int i2) {
            String.valueOf("onBufferingUpdate() -> ".concat(String.valueOf(i2)));
            this.f83465f.a(this.f83464e, i2);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void d(aj ajVar, int i2) {
            String.valueOf("onStreamChanged() -> ".concat(String.valueOf(i2)));
            this.f83465f.e(this.f83464e);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void b(aj ajVar, int i2) {
            com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar;
            if (i2 == 1) {
                bVar = com.ss.android.ugc.aweme.dsp.playerservice.c.b.LOAD_STATE_PLAYABLE;
            } else if (i2 != 2) {
                bVar = com.ss.android.ugc.aweme.dsp.playerservice.c.b.LOAD_STATE_ERROR;
            } else {
                bVar = com.ss.android.ugc.aweme.dsp.playerservice.c.b.LOAD_STATE_STALLED;
            }
            String.valueOf("onLoadStateChanged() -> " + bVar.name());
            this.f83465f.a(this.f83464e, bVar);
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(aj ajVar, int i2) {
            if (i2 == 1) {
                this.f83464e.f83454c = false;
            } else if (i2 == 2) {
                this.f83464e.f83454c = false;
            }
            String.valueOf("onPlaybackStateChanged() -> ".concat(String.valueOf(i2)));
            if (i2 == 1) {
                this.f83463d.postAtTime(new b(this), this, SystemClock.uptimeMillis() + 50);
            } else {
                this.f83463d.removeCallbacksAndMessages(this);
            }
            this.f83465f.a(this.f83464e, a.a(i2));
        }

        public d(e eVar, e eVar2, c cVar) {
            l.d(eVar2, "");
            l.d(cVar, "");
            this.f83460a = eVar;
            this.f83464e = eVar2;
            this.f83465f = cVar;
        }

        @Override // com.ss.ttvideoengine.bb
        public final void a(aj ajVar, int i2, int i3) {
            String.valueOf("onVideoSizeChanged() -> " + i2 + "  -- " + i3);
            this.f83465f.a(this.f83464e, i2, i3);
        }
    }

    public final com.ss.android.ugc.aweme.dsp.playerservice.c.f d() {
        return a.a(a().v);
    }

    public final long f() {
        if (this.f83452a) {
            return (long) a().x;
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(52082);
    }

    public final void c() {
        String.valueOf(this + "  -> stop");
        a().m();
    }

    public final long e() {
        if (this.f83452a) {
            return (long) a().s();
        }
        return 0;
    }

    public final void b() {
        String.valueOf(this + "  -> play() pending: -> " + this.f83454c + "  isPrepared: " + this.f83453b);
        this.f83454c = true;
        if (this.f83453b) {
            a().k();
        }
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        String.valueOf(this + "  -> resetParams()");
        this.f83455d = false;
        this.f83453b = false;
        this.f83454c = false;
        this.f83456e = 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.d.a.e$e  reason: collision with other inner class name */
    static final class C1968e extends m implements h.f.a.a<aj> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(52089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1968e(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ aj invoke() {
            aj ajVar = new aj(com.bytedance.ies.ugc.appcontext.d.a(), 0);
            ajVar.aI = e.f83450h;
            ajVar.f(160, 1);
            ajVar.f(402, 1);
            ajVar.f(0, 300);
            ajVar.f(27, 1);
            ajVar.f(416, 0);
            ajVar.f(314, 1);
            ajVar.f(28, 6);
            ajVar.f(18, 1);
            ajVar.f(415, 1);
            ajVar.f(4, 2);
            ajVar.O = new a(this);
            e eVar = this.this$0;
            ajVar.a(new d(eVar, eVar, eVar.f83458g));
            ajVar.h(false);
            ajVar.aW = true;
            this.this$0.f83452a = true;
            return ajVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.d.a.e$e$a */
        public static final class a implements az {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1968e f83468a;

            static {
                Covode.recordClassIndex(52090);
            }

            a(C1968e eVar) {
                this.f83468a = eVar;
            }

            @Override // com.ss.ttvideoengine.az
            public final void a(ba baVar) {
                if (baVar != null && l.a((Object) baVar.f152316a, (Object) "mdlhitcachesize")) {
                    this.f83468a.this$0.f83457f.f83376a = (int) (baVar.f152321f / 1024);
                }
            }
        }
    }

    public e(c cVar) {
        l.d(cVar, "");
        this.f83458g = cVar;
    }

    /* access modifiers changed from: package-private */
    public static final class f implements y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f83469a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f83470b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f83471c;

        static {
            Covode.recordClassIndex(52091);
        }

        f(e eVar, b bVar, long j2) {
            this.f83469a = eVar;
            this.f83470b = bVar;
            this.f83471c = j2;
        }

        @Override // com.ss.ttvideoengine.y
        public final void a(boolean z) {
            String.valueOf(this.f83469a + "  -> seekToTime finish: -> " + z);
            b bVar = this.f83470b;
            if (bVar != null) {
                bVar.a(z);
            }
            this.f83469a.f83455d = false;
        }
    }

    public final void a(long j2, b bVar) {
        String.valueOf(this + "  -> seekToTime: -> " + j2);
        if (!this.f83455d && j2 >= 0) {
            this.f83455d = true;
            long a2 = h.j.h.a(0L, f() - InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            if (j2 > a2) {
                j2 = a2;
            }
            a().a((int) j2, new f(this, bVar, j2));
        } else if (bVar != null) {
            bVar.a(false);
        }
    }
}
