package com.bytedance.ies.xelement.defaultimpl.player.engine.a.b;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.b.g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.i;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.j;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.q;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;
import com.ss.ttvideoengine.w;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class d implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a, j {

    /* renamed from: g  reason: collision with root package name */
    public static final String f36897g = d.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    public static final b f36898h = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public n f36899a;

    /* renamed from: b  reason: collision with root package name */
    long f36900b;

    /* renamed from: c  reason: collision with root package name */
    public i f36901c = new com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.d();

    /* renamed from: d  reason: collision with root package name */
    public final Context f36902d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d f36903e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.ies.xelement.b.a f36904f;

    /* renamed from: i  reason: collision with root package name */
    private final h f36905i = h.i.a((h.f.a.a) new C0904d(this));

    /* renamed from: j  reason: collision with root package name */
    private c f36906j = c.INIT;

    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h a() {
        return (com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h) this.f36905i.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(22152);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final void a(n nVar) {
        this.f36899a = nVar;
        g();
    }

    private final void g() {
        this.f36906j = c.INIT;
        a(this);
    }

    public final void b() {
        if (this.f36899a != null) {
            a().c();
        }
    }

    public final o c() {
        if (this.f36899a == null) {
            return o.PLAYBACK_STATE_STOPPED;
        }
        return a().d();
    }

    public final long d() {
        if (this.f36899a == null) {
            return 0;
        }
        return a().f();
    }

    public final void f() {
        this.f36899a = null;
        a().i();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.d$d  reason: collision with other inner class name */
    static final class C0904d extends m implements h.f.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(22154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0904d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h invoke() {
            return this.this$0.f36901c.a(this.this$0.f36902d, new a());
        }
    }

    static {
        Covode.recordClassIndex(22150);
    }

    public final long e() {
        if (this.f36899a == null) {
            return 0;
        }
        return (d() * ((long) a().g())) / 100;
    }

    /* access modifiers changed from: package-private */
    public enum c {
        AFD(3000),
        LOCAL_FILE(LiveNetAdaptiveHurryTimeSetting.DEFAULT),
        PRELOAD_CACHE(1000),
        VIDEO_MODEL(500),
        PLAY_URL(0),
        INIT(-1);
        
        final int priority;

        static {
            Covode.recordClassIndex(22153);
        }

        private c(int i2) {
            this.priority = i2;
        }
    }

    final class a implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a {
        static {
            Covode.recordClassIndex(22151);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
        public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar) {
            l.c(hVar, "");
            d.this.f36903e.b();
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
        public final void b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar) {
            l.c(hVar, "");
            d.this.f36903e.d();
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
        public final void c(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar) {
            l.c(hVar, "");
            l.c(hVar, "");
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
        public final void d(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar) {
            l.c(hVar, "");
            d.this.f36903e.e();
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
        public final void e(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar) {
            l.c(hVar, "");
            l.c(hVar, "");
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
        public final void f(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar) {
            l.c(hVar, "");
            l.c(hVar, "");
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
        public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b bVar) {
            String str;
            l.c(bVar, "");
            g.f36700a.b(d.f36897g, "Playable: " + d.this.f36899a + ", occurred an error " + bVar.getMsg());
            d.this.b(bVar);
            com.bytedance.ies.xelement.b.l lVar = com.bytedance.ies.xelement.b.l.DEFAULT;
            if (d.this.a() instanceof com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.b) {
                lVar = com.bytedance.ies.xelement.b.l.LIGHT;
            }
            com.bytedance.ies.xelement.b.a aVar = d.this.f36904f;
            String desc = lVar.getDesc();
            StringBuilder sb = new StringBuilder("play error and to switchResources, currentPlayable: ");
            n nVar = d.this.f36899a;
            String str2 = null;
            if (nVar != null) {
                str = nVar.toString();
            } else {
                str = null;
            }
            String sb2 = sb.append(str).toString();
            n nVar2 = d.this.f36899a;
            if (nVar2 != null) {
                str2 = nVar2.toString();
            }
            aVar.a(-1, desc, false, sb2, str2, -1);
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
        public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar, long j2) {
            l.c(hVar, "");
            d.this.f36903e.a(j2);
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
        public final void b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar, long j2) {
            l.c(hVar, "");
            d.this.f36903e.b(j2);
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
        public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar, com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l lVar) {
            l.c(hVar, "");
            l.c(lVar, "");
            d.this.f36903e.a(lVar);
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
        public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar, o oVar) {
            l.c(hVar, "");
            l.c(oVar, "");
            d.this.f36903e.a(oVar);
        }
    }

    private static /* synthetic */ void a(d dVar) {
        dVar.b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b.INVALIDATE_PLAYER_MODEL);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
    public final void e(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar) {
        l.c(hVar, "");
        l.c(hVar, "");
    }

    private final boolean a(c cVar) {
        c cVar2 = this.f36906j;
        if (cVar2 == c.INIT) {
            this.f36906j = cVar;
            return true;
        } else if (cVar2.priority <= cVar.priority) {
            return false;
        } else {
            this.f36906j = cVar;
            return true;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
    public final void b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar) {
        l.c(hVar, "");
        l.c(hVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
    public final void c(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar) {
        l.c(hVar, "");
        l.c(hVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
    public final void d(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar) {
        l.c(hVar, "");
        l.c(hVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
    public final void f(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar) {
        l.c(hVar, "");
        l.c(hVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b bVar) {
        l.c(bVar, "");
        l.c(bVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar) {
        l.c(hVar, "");
        l.c(hVar, "");
    }

    public final void b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b bVar) {
        n nVar = this.f36899a;
        if (nVar != null) {
            if (nVar.f36958d == null || !a(c.AFD)) {
                String str = nVar.f36956b;
                if (str == null || str.length() <= 0 || !a(c.LOCAL_FILE)) {
                    String str2 = nVar.f36957c;
                    if (str2 == null || str2.length() <= 0 || !nVar.a() || !a(c.PRELOAD_CACHE)) {
                        PlayModel playModel = nVar.f36959e;
                        if (playModel != null && playModel.getVideoModelJsonObj() != null && a(c.VIDEO_MODEL)) {
                            PlayModel playModel2 = nVar.f36959e;
                            if (playModel2 != null) {
                                com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h a2 = a();
                                w resolution = playModel2.getResolution();
                                playModel2.getEncryptType();
                                a2.a(resolution, playModel2.getVideoModel());
                            }
                        } else if (!nVar.a() || !a(c.PLAY_URL)) {
                            this.f36906j = c.INIT;
                            this.f36903e.a(bVar);
                        } else {
                            a().b(nVar.f36955a);
                        }
                    } else {
                        a().a(nVar.f36955a, nVar.f36957c);
                    }
                } else {
                    a().a(nVar.f36956b);
                }
            } else {
                AssetFileDescriptor assetFileDescriptor = nVar.f36958d;
                if (assetFileDescriptor != null) {
                    a().a(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
                }
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.j
    public final void a(i iVar) {
        l.c(iVar, "");
        this.f36901c = iVar;
    }

    public static final class e implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f36915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.m f36916b;

        static {
            Covode.recordClassIndex(22155);
        }

        e(d dVar, com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.m mVar) {
            this.f36915a = dVar;
            this.f36916b = mVar;
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.m
        public final void a(long j2, boolean z) {
            q qVar;
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.m mVar = this.f36916b;
            if (mVar != null) {
                mVar.a(j2, z);
            }
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar = this.f36915a.f36903e;
            if (z) {
                qVar = q.SEEK_SUCCESS;
            } else {
                qVar = q.SEEK_FAILED;
            }
            dVar.a(qVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
    public final void b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar, long j2) {
        l.c(hVar, "");
        l.c(hVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar, long j2) {
        l.c(hVar, "");
        l.c(hVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar, com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l lVar) {
        l.c(hVar, "");
        l.c(lVar, "");
        l.c(hVar, "");
        l.c(lVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.a
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.h hVar, o oVar) {
        l.c(hVar, "");
        l.c(oVar, "");
        l.c(hVar, "");
        l.c(oVar, "");
    }

    public d(Context context, com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d dVar, com.bytedance.ies.xelement.b.a aVar) {
        l.c(context, "");
        l.c(dVar, "");
        l.c(aVar, "");
        this.f36902d = context;
        this.f36903e = dVar;
        this.f36904f = aVar;
    }
}
