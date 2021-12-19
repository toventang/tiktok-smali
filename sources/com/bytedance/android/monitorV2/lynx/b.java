package com.bytedance.android.monitorV2.lynx;

import android.os.Build;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.d;
import com.bytedance.android.monitorV2.h.a.e;
import com.bytedance.android.monitorV2.l.g;
import com.bytedance.android.monitorV2.l.j;
import com.bytedance.android.monitorV2.lynx.c;
import com.bytedance.android.monitorV2.lynx.c.b.c;
import com.bytedance.android.monitorV2.lynx.c.b.f;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private volatile AtomicInteger f24059a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    private f f24060b;

    /* renamed from: c  reason: collision with root package name */
    private final String f24061c = "LynxViewLifeCycle";

    static {
        Covode.recordClassIndex(14180);
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.b$b  reason: collision with other inner class name */
    static final class C0517b extends m implements h.f.a.a<z> {
        final /* synthetic */ LynxView $view;

        static {
            Covode.recordClassIndex(14182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0517b(LynxView lynxView) {
            super(0);
            this.$view = lynxView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            HybridMultiMonitor.getInstance().wrapTouchTraceCallback(com.bytedance.android.monitorV2.l.a.a(this.$view));
            return z.f158842a;
        }
    }

    private static e a() {
        HybridMultiMonitor instance = HybridMultiMonitor.getInstance();
        l.a((Object) instance, "");
        com.bytedance.android.monitorV2.h.f hybridSettingManager = instance.getHybridSettingManager();
        l.a((Object) hybridSettingManager, "");
        e c2 = hybridSettingManager.c();
        l.a((Object) c2, "");
        return c2;
    }

    private static c f(LynxView lynxView) {
        return (c) c.f24075j.f24082e.b(lynxView);
    }

    private final void g(LynxView lynxView) {
        this.f24059a.getAndIncrement();
        if (this.f24059a.get() == 3) {
            c.f24075j.a(lynxView, this.f24060b);
            this.f24059a.set(0);
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.a
    public final void d(LynxView lynxView) {
        l.c(lynxView, "");
        com.bytedance.android.monitorV2.i.b.b(this.f24061c, "onPageUpdate");
        c.f24075j.c(lynxView);
    }

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f24062a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LynxView f24063b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.monitorV2.lynx.b.b f24064c;

        static {
            Covode.recordClassIndex(14181);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (!c.f24075j.a(this.f24062a, "blank")) {
                com.bytedance.android.monitorV2.lynx.a.b bVar = new com.bytedance.android.monitorV2.lynx.a.b(this.f24063b, this.f24064c.f24072g);
                bVar.f24040b = true;
                bVar.run();
                if (view != null) {
                    view.removeOnAttachStateChangeListener(this);
                }
            } else if (view != null) {
                view.removeOnAttachStateChangeListener(this);
            }
        }

        a(String str, LynxView lynxView, com.bytedance.android.monitorV2.lynx.b.b bVar) {
            this.f24062a = str;
            this.f24063b = lynxView;
            this.f24064c = bVar;
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.a
    public final void a(LynxView lynxView) {
        l.c(lynxView, "");
        com.bytedance.android.monitorV2.i.b.b(this.f24061c, "onRuntimeReady");
        if (c.f24075j.c(lynxView)) {
            c cVar = (c) c.f24075j.f24082e.b(lynxView);
            if (cVar != null) {
                cVar.f24110f = System.currentTimeMillis();
            }
            g(lynxView);
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.a
    public final void b(LynxView lynxView) {
        c f2;
        l.c(lynxView, "");
        com.bytedance.android.monitorV2.i.b.b(this.f24061c, "onLoadSuccess");
        com.bytedance.android.monitorV2.lynx.c.b.b c2 = c.f24075j.f24081d.b(lynxView);
        if (c2 == null) {
            c2 = c.f24075j.f24081d.a(lynxView);
        }
        String pageVersion = lynxView.getPageVersion();
        l.a((Object) pageVersion, "");
        l.c(pageVersion, "");
        c2.f24103l = pageVersion;
        if (c.f24075j.c(lynxView) && (f2 = f(lynxView)) != null) {
            f2.f24106b = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.a
    public final void c(LynxView lynxView) {
        l.c(lynxView, "");
        com.bytedance.android.monitorV2.i.b.b(this.f24061c, "onFirstScreen");
        if (c.f24075j.c(lynxView)) {
            c f2 = f(lynxView);
            if (f2 != null) {
                f2.f24109e = System.currentTimeMillis();
            }
            g(lynxView);
            com.bytedance.android.monitorV2.lynx.c.b.b c2 = c.f24075j.f24081d.b(lynxView);
            if (c2 == null) {
                c2 = c.f24075j.f24081d.a(lynxView);
            }
            String str = c2.f23903b;
            com.bytedance.android.monitorV2.lynx.b.b a2 = c.f24075j.f24080c.a(lynxView);
            if (a2 != null && a().h() && !(!l.a((Object) a2.f24068c, (Object) "detect_when_load_success")) && !c.f24075j.a(str, "blank")) {
                com.bytedance.android.monitorV2.lynx.a.b bVar = new com.bytedance.android.monitorV2.lynx.a.b(lynxView, a2.f24072g);
                bVar.f24040b = true;
                new Timer().schedule(bVar, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.a
    public final void e(LynxView lynxView) {
        l.c(lynxView, "");
        com.bytedance.android.monitorV2.i.b.b(this.f24061c, "onDestroy");
        if (c.f24075j.c(lynxView)) {
            c cVar = (c) c.f24075j.f24082e.b(lynxView);
            com.bytedance.android.monitorV2.lynx.c.b.b c2 = c.f24075j.f24081d.b(lynxView);
            if (!c.f24075j.a(c.f24075j.f24084g.a(lynxView), "perf")) {
                f fVar = new f();
                if (cVar == null || !cVar.f24111g || !cVar.f24112h) {
                    fVar.n = 3;
                    com.bytedance.android.monitorV2.i.b.b("LynxState", "lynx_state = 3");
                } else {
                    fVar.n = 2;
                    com.bytedance.android.monitorV2.i.b.b("LynxState", "lynx_state = 2");
                }
                c.f24075j.a(lynxView, fVar);
            }
            if (c2 != null) {
                com.bytedance.android.monitorV2.lynx.c.c.e eVar = c.f24075j.f24084g;
                String str = c2.f23903b;
                l.a((Object) str, "");
                eVar.a(lynxView, str);
            }
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.a
    public final void a(com.bytedance.android.monitorV2.lynx.c.b.e eVar, LynxView lynxView) {
        l.c(eVar, "");
        l.c(lynxView, "");
        String str = this.f24061c;
        StringBuilder append = new StringBuilder("onReceivedError: errorCode: ").append(eVar.f24120c).append(", errorMsg: ");
        String str2 = eVar.f24121d;
        if (str2 == null) {
            str2 = null;
        } else if (str2.length() > 100) {
            str2 = str2.substring(0, 100);
            l.a((Object) str2, "");
        }
        com.bytedance.android.monitorV2.i.b.b(str, append.append(str2).toString());
        if (c.f24075j.c(lynxView)) {
            c.f24075j.a(lynxView, eVar);
            int i2 = eVar.f24120c;
            if (i2 == 100 || i2 == 103) {
                f fVar = new f();
                fVar.n = 1;
                com.bytedance.android.monitorV2.i.b.b("LynxState", "lynx_state = 1");
                c.f24075j.a(lynxView, fVar);
            }
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.a
    public final void a(f fVar, LynxView lynxView) {
        com.bytedance.android.monitorV2.lynx.c.b.b c2;
        l.c(fVar, "");
        l.c(lynxView, "");
        com.bytedance.android.monitorV2.i.b.b(this.f24061c, "onFirstLoadPerfReady");
        com.bytedance.android.monitorV2.lynx.c.b.b c3 = c.f24075j.f24081d.b(lynxView);
        if (c3 == null) {
            c3 = c.f24075j.f24081d.a(lynxView);
        }
        JSONObject jSONObject = fVar.f24133m;
        if (jSONObject != null) {
            try {
                c3.f23910i = jSONObject.getJSONObject("timing").getLong("init_end");
            } catch (Exception unused) {
            }
        }
        if (c.f24075j.c(lynxView)) {
            fVar.n = 0;
            com.bytedance.android.monitorV2.i.b.b("LynxState", "lynx_state = 1");
            this.f24060b = fVar;
            g(lynxView);
            c cVar = c.f24075j;
            l.c(lynxView, "");
            com.bytedance.android.monitorV2.i.b.b("LynxViewMonitor", "reportABTest");
            com.bytedance.android.monitorV2.lynx.b.b a2 = cVar.f24080c.a(lynxView);
            if (a2 != null && a2.f24070e && (c2 = cVar.f24081d.b(lynxView)) != null) {
                c2.a(cVar.b(lynxView), cVar.a(lynxView));
                JSONObject jSONObject2 = new JSONObject();
                com.bytedance.android.monitorV2.l.f.a(jSONObject2, "url", c2.f23902a);
                com.bytedance.android.monitorV2.l.f.a(jSONObject2, "container_type", "lynx");
                JSONObject jSONObject3 = new JSONObject();
                com.bytedance.android.monitorV2.l.f.a(jSONObject3, "tti", Double.valueOf(fVar.f24124d));
                if (a2.f24069d != null) {
                    cVar.a(lynxView, "performance_test", lynxView.getTemplateUrl(), jSONObject2, jSONObject3, null, null, 0);
                }
            }
        }
    }

    @Override // com.bytedance.android.monitorV2.lynx.a
    public final void a(String str, LynxView lynxView) {
        boolean z;
        com.bytedance.android.monitorV2.lynx.c.b.b c2;
        String str2;
        l.c(lynxView, "");
        com.bytedance.android.monitorV2.i.b.b(this.f24061c, "onPageStart: ".concat(String.valueOf(str)));
        if (c.f24075j.c(lynxView)) {
            c cVar = c.f24075j;
            l.c(lynxView, "");
            String templateUrl = lynxView.getTemplateUrl();
            if (templateUrl != null) {
                l.a((Object) templateUrl, "");
                HybridMultiMonitor instance = HybridMultiMonitor.getInstance();
                l.a((Object) instance, "");
                com.bytedance.android.monitorV2.h.f hybridSettingManager = instance.getHybridSettingManager();
                l.a((Object) hybridSettingManager, "");
                String a2 = d.a(templateUrl, hybridSettingManager.d());
                com.bytedance.android.monitorV2.i.b.b("LynxViewMonitor", "regexMatcher: ".concat(String.valueOf(a2)));
                cVar.a(lynxView, a2);
            }
            com.bytedance.android.monitorV2.lynx.c.b.b c3 = c.f24075j.f24081d.b(lynxView);
            if (c3 == null) {
                c3 = c.f24075j.f24081d.a(lynxView);
            }
            String a3 = g.a();
            if (c3.f23902a != null) {
                z = true;
            } else {
                z = false;
            }
            c3.f23911j = Boolean.valueOf(z);
            if (!c3.f23903b.equals(c.f24075j.f24084g.a(lynxView))) {
                com.bytedance.android.monitorV2.lynx.c.c.e eVar = c.f24075j.f24084g;
                l.a((Object) a3, "");
                eVar.a(lynxView, a3);
            }
            c3.f23902a = str;
            c3.f23905d = j.a();
            c3.f23903b = a3;
            ((c) c.f24075j.f24082e.a(lynxView)).f24105a = System.currentTimeMillis();
            c cVar2 = c.f24075j;
            com.bytedance.android.monitorV2.d.j jVar = new com.bytedance.android.monitorV2.d.j();
            l.c(lynxView, "");
            l.c(jVar, "");
            com.bytedance.android.monitorV2.i.b.b("LynxViewMonitor", "reportPV");
            com.bytedance.android.monitorV2.lynx.b.b a4 = cVar2.f24080c.a(lynxView);
            if (!(a4 == null || (c2 = cVar2.f24081d.b(lynxView)) == null)) {
                c2.a(cVar2.b(lynxView), cVar2.a(lynxView));
                cVar2.a(com.bytedance.android.monitorV2.f.a.a(), new c.f(cVar2, lynxView, c2, com.bytedance.android.monitorV2.k.a.a(lynxView), jVar, a4));
            }
            com.bytedance.android.monitorV2.lynx.b.b a5 = c.f24075j.f24080c.a(lynxView);
            if (a5 != null && a().h() && !(!l.a((Object) a5.f24068c, (Object) "detect_when_detach"))) {
                com.bytedance.android.monitorV2.lynx.c.b.b c4 = c.f24075j.f24081d.b(lynxView);
                if (c4 != null) {
                    str2 = c4.f23903b;
                } else {
                    str2 = null;
                }
                lynxView.addOnAttachStateChangeListener(new a(str2, lynxView, a5));
            }
            com.bytedance.android.monitorV2.f.a.a(new C0517b(lynxView));
            com.bytedance.android.monitorV2.lynx.c.b.c f2 = f(lynxView);
            int i2 = Build.VERSION.SDK_INT;
            if (f2 != null) {
                f2.f24111g = lynxView.isAttachedToWindow();
            }
            if (lynxView.getVisibility() == 0 && f2 != null) {
                f2.f24112h = true;
            }
        }
    }
}
