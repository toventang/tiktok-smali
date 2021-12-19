package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.q;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class a extends com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a {

    /* renamed from: b  reason: collision with root package name */
    public b f37008b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a f37009c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f37010d;

    /* renamed from: e  reason: collision with root package name */
    private final h f37011e = i.a((h.f.a.a) new c(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f37012f = i.a((h.f.a.a) new C0912a(this));

    /* renamed from: g  reason: collision with root package name */
    private final h f37013g = i.a((h.f.a.a) new b(this));

    /* renamed from: h  reason: collision with root package name */
    private boolean f37014h;

    /* renamed from: i  reason: collision with root package name */
    private final com.bytedance.ies.xelement.defaultimpl.player.impl.d f37015i;

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.ies.xelement.b.c f37016j;

    /* renamed from: k  reason: collision with root package name */
    private final int f37017k;

    static {
        Covode.recordClassIndex(22259);
    }

    private final c.AnonymousClass1 c() {
        return (c.AnonymousClass1) this.f37011e.getValue();
    }

    private final C0912a.AnonymousClass1 f() {
        return (C0912a.AnonymousClass1) this.f37012f.getValue();
    }

    private final ComponentName g() {
        return (ComponentName) this.f37013g.getValue();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a$a  reason: collision with other inner class name */
    static final class C0912a extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0912a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new BroadcastReceiver(this) {
                /* class com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.C0912a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C0912a f37020a;

                static {
                    Covode.recordClassIndex(22261);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f37020a = r1;
                }

                public final void onReceive(Context context, Intent intent) {
                    com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c cVar;
                    com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar = this.f37020a.this$0.f36963a;
                    if (bVar != null && (cVar = bVar.f36968e) != null) {
                        cVar.d(new com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c("PAUSE_FROM_AUDIO_OUTPUT_CHANGED"));
                    }
                }
            };
        }
    }

    static final class c extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new BroadcastReceiver(this) {
                /* class com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f37040a;

                static {
                    Covode.recordClassIndex(22264);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f37040a = r1;
                }

                public final void onReceive(Context context, Intent intent) {
                    Intent intent2;
                    if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("EXTRA_MEDIA_BUTTON_DATA")) != null) {
                        b bVar = this.f37040a.this$0.f37008b;
                        if (bVar != null) {
                            bVar.a(intent2);
                        }
                        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar = this.f37040a.this$0.f37009c;
                        if (aVar != null) {
                            aVar.a(intent2);
                        }
                    }
                }
            };
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void a() {
        super.a();
        i();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void d() {
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar = this.f37009c;
        if (aVar != null) {
            aVar.b();
        }
    }

    static final class b extends m implements h.f.a.a<ComponentName> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ComponentName invoke() {
            return new ComponentName(this.this$0.f37010d, MediaSessionReceiver.class);
        }
    }

    private final void h() {
        o oVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c cVar;
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar = this.f37009c;
        if (aVar != null) {
            aVar.d();
        }
        b bVar = this.f37008b;
        if (bVar != null) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar2 = this.f36963a;
            if (bVar2 == null || (cVar = bVar2.f36968e) == null || (oVar = cVar.b()) == null) {
                oVar = o.PLAYBACK_STATE_STOPPED;
            }
            bVar.a(oVar);
        }
    }

    private final void i() {
        com.bytedance.ies.xelement.defaultimpl.player.impl.d dVar = this.f37015i;
        if (dVar != null) {
            dVar.a();
        }
        try {
            LocalBroadcastManager.getInstance(this.f37010d).unregisterReceiver(c());
            this.f37010d.unregisterReceiver(f());
        } catch (Throwable unused) {
        }
        b bVar = this.f37008b;
        if (bVar != null) {
            bVar.a();
        }
        this.f37008b = null;
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar = this.f37009c;
        if (aVar != null) {
            aVar.a();
        }
        this.f37009c = null;
        this.f37014h = false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void a(long j2) {
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar = this.f37009c;
        if (aVar != null) {
            aVar.d();
        }
    }

    static final class d extends m implements h.f.a.b<Bitmap, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22265);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar = this.this$0.f37009c;
            if (aVar != null) {
                aVar.a(bitmap2);
            }
            b bVar = this.this$0.f37008b;
            if (bVar != null) {
                bVar.a(bitmap2);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void a(o oVar) {
        boolean z;
        l.c(oVar, "");
        if (oVar != o.PLAYBACK_STATE_STOPPED) {
            z = true;
        } else {
            z = false;
        }
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar = this.f37009c;
        if (aVar != null) {
            aVar.a(z);
        }
        b bVar = this.f37008b;
        if (bVar != null) {
            bVar.a(z);
        }
        h();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void a(q qVar) {
        l.c(qVar, "");
        h();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void a(f fVar) {
        if (fVar == null) {
            i();
            return;
        }
        if (!this.f37014h) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar = this.f36963a;
            if (bVar != null) {
                com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar = new com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a(this.f37010d, bVar.f36968e, bVar.f36969f, bVar.f36970g, g());
                this.f37008b = new b(this.f37010d, aVar.c(), bVar.f36969f, g(), this.f37016j, this.f37017k);
                this.f37009c = aVar;
            }
            LocalBroadcastManager.getInstance(this.f37010d).registerReceiver(c(), new IntentFilter("intent.filter.X_ELEMENT_X_AUDIO_MEDIA_SESSION_BROADCAST"));
            b(this.f37010d, f(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f37014h = true;
        }
        com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.a aVar2 = this.f37009c;
        if (aVar2 != null) {
            aVar2.a(fVar);
        }
        b bVar2 = this.f37008b;
        if (bVar2 != null) {
            bVar2.a(fVar);
        }
        com.bytedance.ies.xelement.defaultimpl.player.impl.d dVar = this.f37015i;
        if (dVar != null) {
            dVar.a(fVar.getCoverUrl(), new d(this));
        }
        h();
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public a(Context context, com.bytedance.ies.xelement.defaultimpl.player.impl.d dVar, com.bytedance.ies.xelement.b.c cVar, int i2) {
        l.c(context, "");
        this.f37010d = context;
        this.f37015i = dVar;
        this.f37016j = cVar;
        this.f37017k = i2;
    }
}
