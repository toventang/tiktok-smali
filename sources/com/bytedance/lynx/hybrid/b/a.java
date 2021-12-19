package com.bytedance.lynx.hybrid.b;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.h;
import com.bytedance.lynx.hybrid.b.a.d;
import com.bytedance.lynx.hybrid.b.a.e;
import com.bytedance.lynx.hybrid.service.c;
import com.bytedance.lynx.hybrid.service.f;
import com.bytedance.sdk.xbridge.protocol.c.g;
import com.lynx.tasm.LynxView;
import h.a.z;
import h.f.b.l;
import h.w;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public final class a extends b implements f {

    /* renamed from: a  reason: collision with root package name */
    public c f40875a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<h> f40876b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.sdk.xbridge.registry.core_api.a f40877c = new com.bytedance.sdk.xbridge.registry.core_api.a();

    /* renamed from: d  reason: collision with root package name */
    private g f40878d;

    /* renamed from: e  reason: collision with root package name */
    private e f40879e = new e();

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.sdk.xbridge.registry.core.a f40880f = new com.bytedance.sdk.xbridge.registry.core.a();

    static {
        Covode.recordClassIndex(25060);
    }

    @Override // com.bytedance.lynx.hybrid.service.g
    public final void a() {
        e eVar = this.f40879e;
        eVar.f40895a.a();
        for (Map.Entry<String, d> entry : eVar.f40896b.entrySet()) {
            entry.getValue().a();
        }
        g gVar = this.f40878d;
        if (gVar != null) {
            gVar.c();
        }
        this.f40877c.c();
    }

    /* renamed from: com.bytedance.lynx.hybrid.b.a$a  reason: collision with other inner class name */
    public static final class C0989a implements com.bytedance.sdk.xbridge.protocol.impl.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f40888a;

        static {
            Covode.recordClassIndex(25061);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C0989a(a aVar) {
            this.f40888a = aVar;
        }

        @Override // com.bytedance.sdk.xbridge.protocol.impl.a.b
        public final void b(com.bytedance.sdk.xbridge.protocol.impl.a.c cVar) {
            com.bytedance.lynx.hybrid.a.c cVar2;
            com.bytedance.lynx.hybrid.a.c cVar3;
            h hVar;
            com.bytedance.lynx.hybrid.h.a hybridContext;
            com.bytedance.lynx.hybrid.f fVar;
            h hVar2;
            h hVar3;
            com.bytedance.lynx.hybrid.h.a hybridContext2;
            com.bytedance.lynx.hybrid.f fVar2;
            l.c(cVar, "");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f40888a.f40876b != null) {
                WeakReference<h> weakReference = this.f40888a.f40876b;
                h hVar4 = null;
                if (weakReference != null && weakReference.get() != null && !TextUtils.isEmpty(cVar.f44000a)) {
                    WeakReference<h> weakReference2 = this.f40888a.f40876b;
                    if (weakReference2 == null || (hVar3 = weakReference2.get()) == null || (hybridContext2 = hVar3.getHybridContext()) == null || (fVar2 = hybridContext2.f40981h) == null) {
                        cVar2 = null;
                    } else {
                        cVar2 = fVar2.a();
                    }
                    if (cVar2 == com.bytedance.lynx.hybrid.a.c.LYNX) {
                        WeakReference<h> weakReference3 = this.f40888a.f40876b;
                        if (weakReference3 != null) {
                            hVar2 = weakReference3.get();
                        } else {
                            hVar2 = null;
                        }
                        if (hVar2 instanceof LynxView) {
                            b(cVar, elapsedRealtime);
                            return;
                        }
                    }
                    WeakReference<h> weakReference4 = this.f40888a.f40876b;
                    if (weakReference4 == null || (hVar = weakReference4.get()) == null || (hybridContext = hVar.getHybridContext()) == null || (fVar = hybridContext.f40981h) == null) {
                        cVar3 = null;
                    } else {
                        cVar3 = fVar.a();
                    }
                    if (cVar3 == com.bytedance.lynx.hybrid.a.c.WEB) {
                        WeakReference<h> weakReference5 = this.f40888a.f40876b;
                        if (weakReference5 != null) {
                            hVar4 = weakReference5.get();
                        }
                        if (hVar4 instanceof WebView) {
                            a(cVar, elapsedRealtime);
                        }
                    }
                }
            }
        }

        @Override // com.bytedance.sdk.xbridge.protocol.impl.a.b
        public final void a(com.bytedance.sdk.xbridge.protocol.impl.a.c cVar) {
            com.bytedance.lynx.hybrid.a.c cVar2;
            com.bytedance.lynx.hybrid.a.c cVar3;
            h hVar;
            h hVar2;
            com.bytedance.lynx.hybrid.h.a hybridContext;
            com.bytedance.lynx.hybrid.f fVar;
            h hVar3;
            h hVar4;
            com.bytedance.android.monitorV2.lynx.b.b a2;
            com.bytedance.android.monitorV2.lynx.c.b.b c2;
            h hVar5;
            com.bytedance.lynx.hybrid.h.a hybridContext2;
            com.bytedance.lynx.hybrid.f fVar2;
            l.c(cVar, "");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f40888a.f40876b != null) {
                WeakReference<h> weakReference = this.f40888a.f40876b;
                h hVar6 = null;
                if (weakReference != null && weakReference.get() != null && !TextUtils.isEmpty(cVar.f44000a)) {
                    WeakReference<h> weakReference2 = this.f40888a.f40876b;
                    if (weakReference2 == null || (hVar5 = weakReference2.get()) == null || (hybridContext2 = hVar5.getHybridContext()) == null || (fVar2 = hybridContext2.f40981h) == null) {
                        cVar2 = null;
                    } else {
                        cVar2 = fVar2.a();
                    }
                    int i2 = 3;
                    if (cVar2 == com.bytedance.lynx.hybrid.a.c.LYNX) {
                        WeakReference<h> weakReference3 = this.f40888a.f40876b;
                        if (weakReference3 != null) {
                            hVar3 = weakReference3.get();
                        } else {
                            hVar3 = null;
                        }
                        if (hVar3 instanceof LynxView) {
                            com.bytedance.android.monitorV2.d.g gVar = new com.bytedance.android.monitorV2.d.g();
                            gVar.f23891e = cVar.f44000a;
                            Integer num = cVar.f44001b;
                            if (num != null) {
                                i2 = num.intValue();
                            }
                            gVar.f23889c = i2;
                            gVar.f23890d = cVar.f44002c;
                            com.bytedance.android.monitorV2.lynx.c cVar4 = com.bytedance.android.monitorV2.lynx.c.f24075j;
                            WeakReference<h> weakReference4 = this.f40888a.f40876b;
                            if (weakReference4 == null || (hVar4 = weakReference4.get()) == null) {
                                throw new w("null cannot be cast to non-null type");
                            }
                            LynxView lynxView = (LynxView) hVar4;
                            l.c(lynxView, "");
                            l.c(gVar, "");
                            com.bytedance.android.monitorV2.i.b.b("LynxViewMonitor", "reportJsbError");
                            if (!(!com.bytedance.android.monitorV2.lynx.c.a().i() || (a2 = cVar4.f24080c.a(lynxView)) == null || (c2 = cVar4.f24081d.b(lynxView)) == null)) {
                                c2.a(cVar4.b(lynxView), cVar4.a(lynxView));
                                cVar4.a((com.bytedance.android.monitorV2.lynx.c) lynxView, (LynxView) c2, (com.bytedance.android.monitorV2.lynx.c.b.b) com.bytedance.android.monitorV2.k.a.a(lynxView), (com.bytedance.android.monitorV2.d.a) gVar, (com.bytedance.android.monitorV2.a.b) a2, (com.bytedance.android.monitorV2.lynx.b.b) null);
                            }
                            b(cVar, elapsedRealtime);
                            return;
                        }
                    }
                    WeakReference<h> weakReference5 = this.f40888a.f40876b;
                    if (weakReference5 == null || (hVar2 = weakReference5.get()) == null || (hybridContext = hVar2.getHybridContext()) == null || (fVar = hybridContext.f40981h) == null) {
                        cVar3 = null;
                    } else {
                        cVar3 = fVar.a();
                    }
                    if (cVar3 == com.bytedance.lynx.hybrid.a.c.WEB) {
                        WeakReference<h> weakReference6 = this.f40888a.f40876b;
                        if (weakReference6 != null) {
                            hVar6 = weakReference6.get();
                        }
                        if (hVar6 instanceof WebView) {
                            com.bytedance.android.monitorV2.d.e eVar = new com.bytedance.android.monitorV2.d.e();
                            eVar.f23875c = cVar.f44000a;
                            Integer num2 = cVar.f44001b;
                            if (num2 != null) {
                                i2 = num2.intValue();
                            }
                            eVar.f23873a = i2;
                            eVar.f23874b = cVar.f44002c;
                            com.bytedance.android.monitorV2.webview.d a3 = n.a();
                            WeakReference<h> weakReference7 = this.f40888a.f40876b;
                            if (weakReference7 == null || (hVar = weakReference7.get()) == null) {
                                throw new w("null cannot be cast to non-null type");
                            }
                            a3.a((WebView) hVar, eVar);
                            a(cVar, elapsedRealtime);
                        }
                    }
                }
            }
        }

        private final void a(com.bytedance.sdk.xbridge.protocol.impl.a.c cVar, long j2) {
            int i2;
            long j3;
            h hVar;
            com.bytedance.android.monitorV2.d.f fVar = new com.bytedance.android.monitorV2.d.f();
            fVar.f23880a = cVar.f44000a;
            Integer num = cVar.f44001b;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 3;
            }
            fVar.f23881b = i2;
            fVar.f23882c = cVar.f44002c;
            Long l2 = cVar.f44004e;
            if (l2 != null) {
                j3 = l2.longValue();
            } else {
                j3 = 0;
            }
            fVar.f23885f = j3;
            if (fVar.f23885f != 0) {
                fVar.f23886g = j2;
                fVar.f23884e = fVar.f23886g - fVar.f23885f;
            }
            com.bytedance.android.monitorV2.webview.d a2 = n.a();
            WeakReference<h> weakReference = this.f40888a.f40876b;
            if (weakReference == null || (hVar = weakReference.get()) == null) {
                throw new w("null cannot be cast to non-null type");
            }
            a2.a((WebView) hVar, fVar);
        }

        private final void b(com.bytedance.sdk.xbridge.protocol.impl.a.c cVar, long j2) {
            int i2;
            long j3;
            h hVar;
            com.bytedance.android.monitorV2.d.h hVar2 = new com.bytedance.android.monitorV2.d.h();
            hVar2.f23894b = cVar.f44000a;
            Integer num = cVar.f44001b;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 3;
            }
            hVar2.f23895c = i2;
            hVar2.f23896d = cVar.f44002c;
            Long l2 = cVar.f44004e;
            if (l2 != null) {
                j3 = l2.longValue();
            } else {
                j3 = 0;
            }
            hVar2.f23899g = j3;
            if (hVar2.f23899g != 0) {
                hVar2.f23900h = j2;
                hVar2.f23898f = hVar2.f23900h - hVar2.f23899g;
            }
            com.bytedance.android.monitorV2.lynx.c cVar2 = com.bytedance.android.monitorV2.lynx.c.f24075j;
            WeakReference<h> weakReference = this.f40888a.f40876b;
            if (weakReference == null || (hVar = weakReference.get()) == null) {
                throw new w("null cannot be cast to non-null type");
            }
            cVar2.a((LynxView) hVar, hVar2);
        }
    }

    public static final class b implements com.bytedance.sdk.xbridge.registry.core.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f40890a;

        static {
            Covode.recordClassIndex(25062);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f40890a = aVar;
        }
    }

    @Override // com.bytedance.lynx.hybrid.b.b
    public final void a(com.bytedance.lynx.hybrid.b.a.a aVar) {
        l.c(aVar, "");
        this.f40879e.a(aVar);
    }

    @Override // com.bytedance.lynx.hybrid.service.g
    public final boolean b(String str) {
        g gVar = this.f40878d;
        if (gVar == null || !gVar.b(str)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.lynx.hybrid.service.g
    public final void c(String str) {
        l.c(str, "");
        g gVar = this.f40878d;
        if (gVar != null) {
            gVar.c(str);
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.g
    public final void a(String str) {
        l.c(str, "");
        g gVar = this.f40878d;
        if (gVar != null) {
            gVar.a(str);
        }
    }

    @Override // com.bytedance.lynx.hybrid.service.e
    public final void a(Object obj, String str) {
        this.f40877c.a((com.lynx.tasm.n) obj, str);
    }

    @Override // com.bytedance.lynx.hybrid.service.f, com.bytedance.lynx.hybrid.b.b
    public final void a(String str, JSONObject jSONObject) {
        l.c(str, "");
        this.f40877c.a(str, jSONObject);
    }

    @Override // com.bytedance.lynx.hybrid.service.e
    public final void a(Context context, h hVar, com.bytedance.lynx.hybrid.a.n nVar) {
        String str;
        l.c(context, "");
        l.c(hVar, "");
        com.bytedance.sdk.xbridge.registry.core_api.a aVar = this.f40877c;
        View a2 = hVar.a();
        if (nVar != null) {
            str = nVar.f40859a;
        } else {
            str = null;
        }
        aVar.a(a2, str, true);
        this.f40877c.a("legacy", this.f40879e);
        this.f40878d = this.f40877c.b();
        this.f40880f.f44033a = hVar.getHybridContext().f40979f;
        this.f40880f.a(new b(this));
        this.f40880f.a(hVar.a());
        if (context instanceof Activity) {
            this.f40880f.a((Activity) context);
        }
        com.bytedance.lynx.hybrid.h.a hybridContext = hVar.getHybridContext();
        hybridContext.a(b.class, this);
        c cVar = this.f40875a;
        if (cVar != null) {
            cVar.a(hVar, context);
        }
        if (hybridContext.a(d.class) != null) {
            for (Class cls : z.INSTANCE) {
                com.bytedance.sdk.xbridge.registry.core.g gVar = com.bytedance.sdk.xbridge.registry.core.g.ALL;
                l.c(gVar, "");
                com.bytedance.sdk.xbridge.registry.core.f.a(cls, gVar);
            }
            for (com.bytedance.lynx.hybrid.b.a.a aVar2 : z.INSTANCE) {
                a(aVar2);
            }
        }
        this.f40876b = new WeakReference<>(hVar);
        com.bytedance.sdk.xbridge.registry.core.f.a(hVar.a(), this.f40880f);
        this.f40877c.a(new C0989a(this));
    }
}
