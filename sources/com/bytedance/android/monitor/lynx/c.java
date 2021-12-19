package com.bytedance.android.monitor.lynx;

import android.os.Build;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.d.j;
import com.bytedance.android.monitor.l.i;
import com.bytedance.android.monitor.lynx.b;
import com.bytedance.android.monitor.lynx.c.a.d;
import com.bytedance.android.monitor.lynx.c.a.f;
import com.bytedance.android.monitor.lynx.c.a.g;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private volatile AtomicInteger f23607a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    private g f23608b;

    static {
        Covode.recordClassIndex(14010);
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ LynxView $view;

        static {
            Covode.recordClassIndex(14012);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LynxView lynxView) {
            super(0);
            this.$view = lynxView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            HybridMonitor.getInstance().wrapTouchTraceCallback(com.bytedance.android.monitor.l.a.a(this.$view));
            return z.f158842a;
        }
    }

    private static com.bytedance.android.monitor.j.c a() {
        HybridMonitor instance = HybridMonitor.getInstance();
        l.a((Object) instance, "");
        com.bytedance.android.monitor.j.b settingManager = instance.getSettingManager();
        l.a((Object) settingManager, "");
        com.bytedance.android.monitor.j.c c2 = settingManager.c();
        l.a((Object) c2, "");
        return c2;
    }

    private static d f(LynxView lynxView) {
        return (d) b.f23580f.f23585c.b(lynxView);
    }

    @Override // com.bytedance.android.monitor.lynx.a
    public final void d(LynxView lynxView) {
        l.c(lynxView, "");
        b.f23580f.a(lynxView);
    }

    private final void g(LynxView lynxView) {
        this.f23607a.getAndIncrement();
        if (this.f23607a.get() == 3) {
            b.f23580f.a(lynxView, this.f23608b);
            this.f23607a.set(0);
        }
    }

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f23609a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LynxView f23610b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.monitor.lynx.b.b f23611c;

        static {
            Covode.recordClassIndex(14011);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (!b.f23580f.a(this.f23609a, "blank")) {
                com.bytedance.android.monitor.lynx.a.b bVar = new com.bytedance.android.monitor.lynx.a.b(this.f23610b, this.f23611c.f23603k);
                bVar.f23561b = true;
                bVar.run();
                if (view != null) {
                    view.removeOnAttachStateChangeListener(this);
                }
            } else if (view != null) {
                view.removeOnAttachStateChangeListener(this);
            }
        }

        a(String str, LynxView lynxView, com.bytedance.android.monitor.lynx.b.b bVar) {
            this.f23609a = str;
            this.f23610b = lynxView;
            this.f23611c = bVar;
        }
    }

    @Override // com.bytedance.android.monitor.lynx.a
    public final void b(LynxView lynxView) {
        d f2;
        l.c(lynxView, "");
        com.bytedance.android.monitor.lynx.c.a.b c2 = b.f23580f.f23584b.b(lynxView);
        if (c2 == null) {
            c2 = b.f23580f.f23584b.a(lynxView);
        }
        String pageVersion = lynxView.getPageVersion();
        l.a((Object) pageVersion, "");
        l.c(pageVersion, "");
        c2.f23622m = pageVersion;
        if (b.f23580f.a(lynxView) && (f2 = f(lynxView)) != null) {
            f2.f23633b = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.monitor.lynx.a
    public final void a(LynxView lynxView) {
        l.c(lynxView, "");
        if (b.f23580f.a(lynxView)) {
            d dVar = (d) b.f23580f.f23585c.b(lynxView);
            if (dVar != null) {
                dVar.f23637f = System.currentTimeMillis();
            }
            g(lynxView);
        }
    }

    @Override // com.bytedance.android.monitor.lynx.a
    public final void c(LynxView lynxView) {
        l.c(lynxView, "");
        if (b.f23580f.a(lynxView)) {
            d f2 = f(lynxView);
            if (f2 != null) {
                f2.f23636e = System.currentTimeMillis();
            }
            g(lynxView);
            com.bytedance.android.monitor.lynx.c.a.b c2 = b.f23580f.f23584b.b(lynxView);
            if (c2 == null) {
                c2 = b.f23580f.f23584b.a(lynxView);
            }
            String str = c2.f23491b;
            com.bytedance.android.monitor.lynx.b.b a2 = b.f23580f.f23583a.a(lynxView);
            if (a2 != null && a2.f23596d && a().f23525b && !(!l.a((Object) a2.f23597e, (Object) "detect_when_load_success")) && !b.f23580f.a(str, "blank")) {
                com.bytedance.android.monitor.lynx.a.b bVar = new com.bytedance.android.monitor.lynx.a.b(lynxView, a2.f23603k);
                bVar.f23561b = true;
                new Timer().schedule(bVar, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
        }
    }

    @Override // com.bytedance.android.monitor.lynx.a
    public final void e(LynxView lynxView) {
        String str;
        l.c(lynxView, "");
        d dVar = (d) b.f23580f.f23585c.b(lynxView);
        if (b.f23580f.a(lynxView)) {
            com.bytedance.android.monitor.lynx.c.a.b c2 = b.f23580f.f23584b.b(lynxView);
            if (c2 != null) {
                str = c2.f23491b;
            } else {
                str = null;
            }
            if (!b.f23580f.a(str, "perf")) {
                g gVar = new g();
                if (dVar == null || !dVar.f23638g || !dVar.f23639h) {
                    gVar.n = 3;
                    com.bytedance.android.monitor.h.b.b("LynxState", "lynx_state = 3");
                } else {
                    gVar.n = 2;
                    com.bytedance.android.monitor.h.b.b("LynxState", "lynx_state = 2");
                }
                b.f23580f.a(lynxView, gVar);
            }
        }
    }

    @Override // com.bytedance.android.monitor.lynx.a
    public final void a(f fVar, LynxView lynxView) {
        l.c(fVar, "");
        l.c(lynxView, "");
        if (b.f23580f.a(lynxView)) {
            b.f23580f.a(lynxView, fVar);
            int i2 = fVar.f23647c;
            if (i2 == 100 || i2 == 103) {
                g gVar = new g();
                gVar.n = 1;
                com.bytedance.android.monitor.h.b.b("LynxState", "lynx_state = 1");
                b.f23580f.a(lynxView, gVar);
            }
        }
    }

    @Override // com.bytedance.android.monitor.lynx.a
    public final void a(g gVar, LynxView lynxView) {
        com.bytedance.android.monitor.lynx.c.a.b c2;
        l.c(gVar, "");
        l.c(lynxView, "");
        com.bytedance.android.monitor.lynx.c.a.b c3 = b.f23580f.f23584b.b(lynxView);
        if (c3 == null) {
            c3 = b.f23580f.f23584b.a(lynxView);
        }
        JSONObject jSONObject = gVar.f23660m;
        if (jSONObject != null) {
            try {
                c3.f23497h = jSONObject.getJSONObject("timing").getLong("init_end");
            } catch (Exception unused) {
            }
        }
        if (b.f23580f.a(lynxView)) {
            gVar.n = 0;
            com.bytedance.android.monitor.h.b.b("LynxState", "lynx_state = 1");
            this.f23608b = gVar;
            g(lynxView);
            b bVar = b.f23580f;
            l.c(lynxView, "");
            com.bytedance.android.monitor.lynx.b.b a2 = bVar.f23583a.a(lynxView);
            if (a2 != null && a2.f23601i && (c2 = bVar.f23584b.b(lynxView)) != null) {
                JSONObject jSONObject2 = new JSONObject();
                com.bytedance.android.monitor.l.d.a(jSONObject2, "prefEnable", String.valueOf(a2.f23595c));
                com.bytedance.android.monitor.l.d.a(jSONObject2, "url", c2.f23490a);
                com.bytedance.android.monitor.l.d.a(jSONObject2, "container_type", "lynx");
                JSONObject jSONObject3 = new JSONObject();
                com.bytedance.android.monitor.l.d.a(jSONObject3, "tti", Double.valueOf(gVar.f23651d));
                if (a2.f23600h != null) {
                    bVar.a(lynxView, "performance_test", lynxView.getTemplateUrl(), jSONObject2, jSONObject3, null, null, true);
                }
            }
        }
    }

    @Override // com.bytedance.android.monitor.lynx.a
    public final void a(String str, LynxView lynxView) {
        boolean z;
        com.bytedance.android.monitor.lynx.c.a.b c2;
        String str2;
        l.c(lynxView, "");
        if (b.f23580f.a(lynxView)) {
            com.bytedance.android.monitor.lynx.c.a.b c3 = b.f23580f.f23584b.b(lynxView);
            if (c3 == null) {
                c3 = b.f23580f.f23584b.a(lynxView);
            }
            if (c3.f23490a != null) {
                z = true;
            } else {
                z = false;
            }
            c3.f23500k = Boolean.valueOf(z);
            c3.f23490a = str;
            c3.f23494e = i.a();
            c3.f23491b = com.bytedance.android.monitor.l.f.a();
            ((d) b.f23580f.f23585c.a(lynxView)).f23632a = System.currentTimeMillis();
            b bVar = b.f23580f;
            j jVar = new j();
            l.c(lynxView, "");
            l.c(jVar, "");
            com.bytedance.android.monitor.lynx.b.b a2 = bVar.f23583a.a(lynxView);
            if (!(a2 == null || (c2 = bVar.f23584b.b(lynxView)) == null)) {
                bVar.a(com.bytedance.android.monitor.f.a.a(), new b.g(bVar, c2, com.bytedance.android.monitor.k.a.a(lynxView), jVar, a2));
            }
            com.bytedance.android.monitor.lynx.b.b a3 = b.f23580f.f23583a.a(lynxView);
            if (a3 != null && a3.f23596d && a().f23525b && !(!l.a((Object) a3.f23597e, (Object) "detect_when_detach"))) {
                com.bytedance.android.monitor.lynx.c.a.b c4 = b.f23580f.f23584b.b(lynxView);
                if (c4 != null) {
                    str2 = c4.f23491b;
                } else {
                    str2 = null;
                }
                if (lynxView != null) {
                    lynxView.addOnAttachStateChangeListener(new a(str2, lynxView, a3));
                }
            }
            com.bytedance.android.monitor.f.a.a(new b(lynxView));
            d f2 = f(lynxView);
            int i2 = Build.VERSION.SDK_INT;
            if (f2 != null) {
                f2.f23638g = lynxView.isAttachedToWindow();
            }
            if (lynxView.getVisibility() == 0 && f2 != null) {
                f2.f23639h = true;
            }
        }
    }
}
