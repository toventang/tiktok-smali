package com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.dsp.playerservice.a.h;
import com.ss.android.ugc.aweme.dsp.playerservice.a.j;
import com.ss.android.ugc.aweme.dsp.playerservice.a.m;
import com.ss.android.ugc.aweme.dsp.playerservice.a.q;
import com.ss.android.ugc.aweme.dsp.playerservice.b.f;
import com.ss.android.ugc.aweme.dsp.playerservice.c.g;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.common.MediaSessionService;
import h.f.b.l;
import h.i;
import h.r;
import h.z;

public final class e implements com.ss.android.ugc.aweme.dsp.playerservice.a.a, h, j, m, q {

    /* renamed from: e  reason: collision with root package name */
    public static final a f83655e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playerservice.a.d f83656a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.a f83657b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b.a f83658c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f83659d;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f83660f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f83661g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f83662h;

    /* renamed from: i  reason: collision with root package name */
    private final d f83663i;

    static {
        Covode.recordClassIndex(52198);
    }

    private final ComponentName e() {
        return (ComponentName) this.f83661g.getValue();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean a(f fVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final com.ss.android.ugc.aweme.dsp.playerservice.b.c a_(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean a_(long j2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void b(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean b(f fVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void bd_() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean c(f fVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean d(f fVar) {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52199);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(g gVar) {
        l.d(gVar, "");
        l.d(gVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.f fVar) {
        l.d(fVar, "");
        f();
        int i2 = f.f83665a[fVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            a(true);
        } else if (i2 == 3) {
            a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.a
    public final void a(boolean z, f fVar) {
        if (z) {
            a(true);
        } else {
            if (!l.a((Object) (fVar != null ? fVar.f83375a : null), (Object) "PAUSE_FROM_ON_BACKGROUND") || !com.ss.android.ugc.aweme.dsp.experiment.a.a().getDspEnableBgPlay()) {
                a(false);
            } else {
                return;
            }
        }
        String.valueOf("onActiveChange " + z + ' ' + fVar);
    }

    static final class b extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(52200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new BroadcastReceiver(this) {
                /* class com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.e.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f83664a;

                static {
                    Covode.recordClassIndex(52201);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f83664a = r1;
                }

                public final void onReceive(Context context, Intent intent) {
                    Intent intent2;
                    if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("EXTRA_MEDIA_BUTTON_DATA")) != null) {
                        l.b(intent2, "");
                        com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.a aVar = this.f83664a.this$0.f83657b;
                        if (aVar != null) {
                            l.d(intent2, "");
                            if (aVar.f83607d && aVar.f83605b.f83622a == intent2.getIntExtra("EXTRA_KEY_FACTORY_ID", -1)) {
                                switch (intent2.getIntExtra("EXTRA_KEY_COMMAND_FROM_NOTIFICATION", -1)) {
                                    case 1:
                                    case 2:
                                        aVar.b();
                                        break;
                                    case 3:
                                        b bVar = aVar.f83614k;
                                        if (bVar != null && bVar.a()) {
                                            aVar.f83614k.b();
                                            break;
                                        }
                                    case 4:
                                        com.ss.android.ugc.aweme.dsp.playerservice.a.d dVar = aVar.f83615l;
                                        if (!dVar.e().isPlayingState()) {
                                            dVar.e(new f("PLAY_FROM_NOTIFICATION_CLICK"));
                                            break;
                                        } else {
                                            dVar.f(new f("PAUSE_FROM_NOTIFICATION_CLICK"));
                                            break;
                                        }
                                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                                        if (aVar.f83615l.q()) {
                                            aVar.f83615l.j(new f("operation_from_notification_skip_to_next"));
                                            break;
                                        }
                                        break;
                                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                        com.ss.android.ugc.aweme.dsp.playerservice.b.c p = aVar.f83615l.p();
                                        if (p != null && !com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.a(p.a())) {
                                            aVar.f83615l.i(new f("operation_from_notification_skip_to_prev"));
                                            break;
                                        }
                                }
                            }
                        }
                        com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b.a aVar2 = this.f83664a.this$0.f83658c;
                        if (aVar2 != null) {
                            l.d(intent2, "");
                            androidx.media.b.a.a(aVar2.f83637a, intent2);
                        }
                    }
                }
            };
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<ComponentName> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(52202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ComponentName invoke() {
            return new ComponentName(this.this$0.f83659d, MediaSessionService.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final com.ss.android.ugc.aweme.dsp.playerservice.a.d v() {
        com.ss.android.ugc.aweme.dsp.playerservice.a.d dVar = this.f83656a;
        if (dVar == null) {
            l.a("mMediaPlayerService");
        }
        return dVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
        v().a((q) this);
        v().a((j) this);
        v().a((h) this);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        a(false);
        v().b((q) this);
        v().b((j) this);
        v().b((h) this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ e() {
        /*
            r7 = this;
            android.content.Context r6 = com.bytedance.ies.ugc.appcontext.d.a()
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.d r5 = new com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.d
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a r4 = new com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a
            r4.<init>()
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.common.a r3 = new com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.common.a
            r3.<init>()
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.g r2 = new com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.g
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 20
            if (r1 <= r0) goto L_0x0025
            r0 = 2131755269(0x7f100105, float:1.9141413E38)
        L_0x001b:
            r2.<init>(r0)
            r5.<init>(r4, r3, r2)
            r7.<init>(r6, r5)
            return
        L_0x0025:
            r0 = 0
            com.ss.android.ugc.aweme.services.IMainService r1 = com.ss.android.ugc.aweme.services.MainServiceImpl.createIMainServicebyMonsterPlugin(r0)
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            int r0 = r1.getLauncherIconRes()
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.e.<init>():void");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void be_() {
        long j2;
        com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b.a aVar = this.f83658c;
        if (aVar != null) {
            MediaMetadataCompat.a a2 = aVar.a();
            com.ss.android.ugc.aweme.dsp.playerservice.b.c n = aVar.f83638b.n();
            if (n != null) {
                j2 = n.f();
            } else {
                j2 = 0;
            }
            long g2 = aVar.f83638b.g();
            if (g2 > 0) {
                j2 = g2;
            }
            a2.a("android.media.metadata.DURATION", j2);
            aVar.f83637a.a(aVar.a().a());
        }
    }

    private final void f() {
        boolean z;
        com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b.a aVar = this.f83658c;
        if (aVar != null) {
            aVar.b();
        }
        com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.a aVar2 = this.f83657b;
        if (aVar2 != null) {
            com.ss.android.ugc.aweme.dsp.playerservice.c.f e2 = v().e();
            l.d(e2, "");
            boolean isPlayingState = e2.isPlayingState();
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.c cVar = aVar2.f83606c;
            cVar.f83629a = Boolean.valueOf(isPlayingState);
            cVar.f83631c = Boolean.valueOf(aVar2.f83615l.q());
            com.ss.android.ugc.aweme.dsp.playerservice.b.c p = aVar2.f83615l.p();
            if (p == null || com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.a(p.a())) {
                z = false;
            } else {
                z = true;
            }
            cVar.f83630b = Boolean.valueOf(z);
            aVar2.a();
        }
    }

    private void a(boolean z) {
        com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b.a aVar = this.f83658c;
        if (aVar != null) {
            aVar.a(z);
        }
        com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.a aVar2 = this.f83657b;
        if (aVar2 != null) {
            aVar2.a(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(long j2) {
        com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b.a aVar = this.f83658c;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.a.d dVar) {
        l.d(dVar, "");
        this.f83656a = dVar;
    }

    static final class d extends h.f.b.m implements h.f.a.b<Bitmap, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(52203);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b.a aVar = this.this$0.f83658c;
            boolean z = true;
            if (aVar != null && l.a((Object) Build.MANUFACTURER, (Object) "Xiaomi")) {
                if (bitmap2 == null || !bitmap2.isRecycled()) {
                    aVar.a().a("android.media.metadata.ART", bitmap2);
                    aVar.f83637a.a(aVar.a().a());
                } else {
                    String.valueOf("coverBitmap(" + bitmap2 + ") already recycled.");
                }
            }
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.a aVar2 = this.this$0.f83657b;
            if (aVar2 != null) {
                com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.c cVar = aVar2.f83606c;
                cVar.f83635g = bitmap2;
                cVar.f83631c = Boolean.valueOf(aVar2.f83615l.q());
                com.ss.android.ugc.aweme.dsp.playerservice.b.c p = aVar2.f83615l.p();
                if (p == null || com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.a(p.a())) {
                    z = false;
                }
                cVar.f83630b = Boolean.valueOf(z);
                aVar2.a();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
        a(false);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        Object obj;
        l.d(cVar, "");
        boolean z = true;
        if (!this.f83662h) {
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b.a aVar = new com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b.a(this.f83659d, v(), e());
            Context context = this.f83659d;
            g gVar = this.f83663i.f83654c;
            b bVar = this.f83663i.f83653b;
            com.ss.android.ugc.aweme.dsp.playerservice.a.d v = v();
            MediaSessionCompat.Token d2 = aVar.f83637a.d();
            l.b(d2, "");
            this.f83657b = new com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.a(context, gVar, bVar, v, d2, e());
            this.f83658c = aVar;
            LocalBroadcastManager.getInstance(this.f83659d).registerReceiver((b.AnonymousClass1) this.f83660f.getValue(), new IntentFilter("player.plugin.mediasession.common.intent.filter.AWE_MEDIA_SESSION_BROADCAST"));
            this.f83662h = true;
        }
        com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.b.a aVar2 = this.f83658c;
        if (aVar2 != null) {
            l.d(cVar, "");
            MediaMetadataCompat.a a2 = aVar2.a();
            a2.a("android.media.metadata.TITLE", cVar.i());
            a2.a("android.media.metadata.ALBUM", cVar.k());
            a2.a("android.media.metadata.ARTIST", cVar.j());
            long f2 = cVar.f();
            long g2 = aVar2.f83638b.g();
            if (g2 > 0) {
                f2 = g2;
            }
            a2.a("android.media.metadata.DURATION", f2);
            a2.a("android.media.metadata.ART", (Bitmap) null);
            aVar2.f83637a.a(true);
            aVar2.f83637a.a(aVar2.a().a());
        }
        com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.a aVar3 = this.f83657b;
        if (aVar3 != null) {
            if (cVar == null) {
                aVar3.b();
                try {
                    MediaSessionService.b bVar2 = aVar3.f83611h;
                    if (bVar2 != null) {
                        bVar2.unlinkToDeath(aVar3.f83609f, 0);
                    }
                    aVar3.f83612i.unbindService(aVar3.f83610g);
                    obj = h.q.m223constructorimpl(z.f158842a);
                } catch (Throwable th) {
                    obj = h.q.m223constructorimpl(r.a(th));
                }
                h.q.m226exceptionOrNullimpl(obj);
            } else {
                com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.a.c cVar2 = aVar3.f83606c;
                cVar2.f83629a = false;
                cVar2.f83631c = Boolean.valueOf(aVar3.f83615l.q());
                com.ss.android.ugc.aweme.dsp.playerservice.b.c p = aVar3.f83615l.p();
                if (p == null || com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.a(p.a())) {
                    z = false;
                }
                cVar2.f83630b = Boolean.valueOf(z);
                cVar2.f83632d = cVar.i();
                cVar2.f83633e = cVar.j();
                cVar2.f83634f = cVar.k();
                cVar2.f83635g = null;
                aVar3.a();
            }
        }
        c cVar3 = this.f83663i.f83652a;
        if (cVar3 != null) {
            cVar3.a(cVar.g(), new d(this));
        }
        f();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.c cVar) {
        l.d(cVar, "");
        f();
    }

    private e(Context context, d dVar) {
        l.d(context, "");
        l.d(dVar, "");
        this.f83659d = context;
        this.f83663i = dVar;
        this.f83660f = i.a((h.f.a.a) new b(this));
        this.f83661g = i.a((h.f.a.a) new c(this));
    }
}
