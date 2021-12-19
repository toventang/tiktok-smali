package com.bytedance.android.monitorV2.lynx.a;

import android.view.View;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.lynx.a.a;
import com.bytedance.android.monitorV2.lynx.a.c;
import com.bytedance.android.monitorV2.lynx.a.d;
import com.bytedance.android.monitorV2.lynx.c;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.List;
import java.util.TimerTask;

public final class b extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final String f24039a = "LynxViewBlankChecker";

    /* renamed from: b  reason: collision with root package name */
    public boolean f24040b = true;

    /* renamed from: c  reason: collision with root package name */
    public double f24041c = 0.05d;

    /* renamed from: d  reason: collision with root package name */
    public final LynxView f24042d;

    /* renamed from: e  reason: collision with root package name */
    public c.AbstractC0516c f24043e;

    static {
        Covode.recordClassIndex(14171);
    }

    public final void run() {
        String str;
        if (this.f24042d.getWidth() != 0 && this.f24042d.getHeight() != 0) {
            try {
                Field declaredField = LynxView.class.getDeclaredField("mLynxTemplateRender");
                l.a((Object) declaredField, "");
                declaredField.setAccessible(true);
                if (((LynxTemplateRender) declaredField.get(this.f24042d)) == null) {
                    return;
                }
            } catch (Exception unused) {
            }
            if (this.f24040b || HybridMultiMonitor.isDebuggable()) {
                LynxView lynxView = this.f24042d;
                l.c(lynxView, "");
                a aVar = new a();
                aVar.f24022a = lynxView.getTemplateUrl();
                aVar.f24024c = lynxView.getWidth();
                aVar.f24025d = lynxView.getHeight();
                aVar.f24026e = h.g.a.a(lynxView.getAlpha() * 100.0f);
                d.f24054a.put(lynxView, aVar);
            }
            com.bytedance.android.monitorV2.lynx.c.b.b c2 = com.bytedance.android.monitorV2.lynx.c.f24075j.f24081d.b(this.f24042d);
            if (c2 != null) {
                str = c2.f23903b;
            } else {
                str = null;
            }
            com.bytedance.android.monitorV2.lynx.c.f24075j.b(str, "blank");
            long currentTimeMillis = System.currentTimeMillis();
            LynxView lynxView2 = this.f24042d;
            a aVar2 = new a(this, currentTimeMillis);
            l.c(lynxView2, "");
            l.c("", "");
            com.bytedance.ugc.a.c.b(lynxView2, "", c.f24047a, new c.a(aVar2), new c.b(lynxView2, aVar2));
        }
    }

    public static final class a implements c.AbstractC0516c {

        /* renamed from: a  reason: collision with root package name */
        public com.bytedance.android.monitorV2.lynx.c.b.a f24044a = new com.bytedance.android.monitorV2.lynx.c.b.a();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f24045b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f24046c;

        static {
            Covode.recordClassIndex(14172);
        }

        a(b bVar, long j2) {
            this.f24045b = bVar;
            this.f24046c = j2;
        }

        @Override // com.bytedance.android.monitorV2.lynx.a.c.AbstractC0516c
        public final void a(View view, String str, float f2) {
            String str2;
            List<a.C0515a> list;
            l.c(view, "");
            l.c(str, "");
            com.bytedance.android.monitorV2.lynx.b.b a2 = com.bytedance.android.monitorV2.lynx.c.f24075j.f24080c.a(this.f24045b.f24042d);
            String str3 = null;
            if (a2 != null) {
                str2 = a2.f24068c;
            } else {
                str2 = null;
            }
            int i2 = 0;
            if (l.a((Object) "detect_when_detach", (Object) str2)) {
                this.f24044a.f24097h = 0;
            } else {
                if (a2 != null) {
                    str3 = a2.f24068c;
                }
                if (l.a((Object) "detect_when_load_success", (Object) str3)) {
                    this.f24044a.f24097h = 1;
                }
            }
            this.f24044a.f24091b = f2;
            this.f24044a.f24092c = view.getHeight();
            this.f24044a.f24093d = view.getWidth();
            this.f24044a.f24100k = h.g.a.a(view.getAlpha() * 100.0f);
            com.bytedance.android.monitorV2.lynx.c.b.a aVar = this.f24044a;
            a aVar2 = d.f24054a.get(view);
            if (!(aVar2 == null || (list = aVar2.f24028g) == null)) {
                i2 = list.size();
            }
            aVar.f24101l = i2;
            if (((double) f2) <= this.f24045b.f24041c) {
                LynxView lynxView = this.f24045b.f24042d;
                l.c(lynxView, "");
                a aVar3 = d.f24054a.get(lynxView);
                if (aVar3 != null) {
                    aVar3.f24023b = f2;
                }
                LynxView lynxView2 = this.f24045b.f24042d;
                l.c(lynxView2, "");
                a aVar4 = d.f24054a.get(lynxView2);
                if (aVar4 != null) {
                    com.bytedance.android.monitorV2.f.a.a(new d.a(aVar4));
                }
            }
            c.AbstractC0516c cVar = this.f24045b.f24043e;
            if (cVar != null) {
                cVar.a(view, str, f2);
            }
            com.bytedance.android.monitorV2.i.b.b(this.f24045b.f24039a, "effectivePercentage: " + this.f24044a.f24091b + ", height: " + this.f24044a.f24092c + ", width: " + this.f24044a.f24093d + ", alpha: " + this.f24044a.f24100k + ", elementCount: " + this.f24044a.f24101l);
        }

        @Override // com.bytedance.android.monitorV2.lynx.a.c.AbstractC0516c
        public final void a(View view, String str, long j2, long j3) {
            com.bytedance.android.monitorV2.lynx.c.b.b c2;
            l.c(view, "");
            l.c(str, "");
            this.f24044a.f24094e = System.currentTimeMillis() - this.f24046c;
            this.f24044a.f24095f = j2;
            this.f24044a.f24096g = j3;
            this.f24044a.f24098i = 0;
            this.f24044a.f24099j = this.f24046c;
            com.bytedance.android.monitorV2.lynx.c cVar = com.bytedance.android.monitorV2.lynx.c.f24075j;
            LynxView lynxView = (LynxView) view;
            com.bytedance.android.monitorV2.lynx.c.b.a aVar = this.f24044a;
            l.c(lynxView, "");
            l.c(aVar, "");
            com.bytedance.android.monitorV2.i.b.b("LynxViewMonitor", "reportBlank");
            com.bytedance.android.monitorV2.lynx.b.b a2 = cVar.f24080c.a(lynxView);
            if (!(a2 == null || (c2 = cVar.f24081d.b(lynxView)) == null)) {
                com.bytedance.android.monitorV2.d.a a3 = com.bytedance.android.monitorV2.k.a.a(lynxView);
                com.bytedance.android.monitorV2.lynx.c.b.c cVar2 = (com.bytedance.android.monitorV2.lynx.c.b.c) cVar.f24082e.b(lynxView);
                if (cVar2 != null) {
                    aVar.f24098i = cVar2.f24105a;
                }
                c2.a(cVar.b(lynxView), cVar.a(lynxView));
                cVar.a(com.bytedance.android.monitorV2.f.a.a(), new c.C0518c(cVar, lynxView, c2, a3, aVar, a2));
            }
            c.AbstractC0516c cVar3 = this.f24045b.f24043e;
            if (cVar3 != null) {
                cVar3.a(view, str, j2, j3);
            }
        }
    }

    public b(LynxView lynxView, c.AbstractC0516c cVar) {
        l.c(lynxView, "");
        this.f24042d = lynxView;
        this.f24043e = cVar;
    }
}
