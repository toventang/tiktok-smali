package com.bytedance.android.monitor.lynx.a;

import android.view.View;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.lynx.a.a;
import com.bytedance.android.monitor.lynx.a.c;
import com.bytedance.android.monitor.lynx.a.d;
import com.bytedance.android.monitor.lynx.b;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.LynxView;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.List;
import java.util.TimerTask;

public final class b extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final String f23560a = "LynxViewChecker";

    /* renamed from: b  reason: collision with root package name */
    public boolean f23561b = true;

    /* renamed from: c  reason: collision with root package name */
    public double f23562c = 0.05d;

    /* renamed from: d  reason: collision with root package name */
    public final LynxView f23563d;

    /* renamed from: e  reason: collision with root package name */
    public c.AbstractC0510c f23564e;

    static {
        Covode.recordClassIndex(13989);
    }

    public final void run() {
        String str;
        if (this.f23563d.getWidth() != 0 && this.f23563d.getHeight() != 0) {
            try {
                Field declaredField = LynxView.class.getDeclaredField("mLynxTemplateRender");
                l.a((Object) declaredField, "");
                declaredField.setAccessible(true);
                if (((LynxTemplateRender) declaredField.get(this.f23563d)) == null) {
                    return;
                }
            } catch (Exception unused) {
            }
            if (this.f23561b || HybridMonitor.isDebuggable()) {
                LynxView lynxView = this.f23563d;
                l.c(lynxView, "");
                a aVar = new a();
                aVar.f23543a = lynxView.getTemplateUrl();
                aVar.f23545c = lynxView.getWidth();
                aVar.f23546d = lynxView.getHeight();
                aVar.f23547e = h.g.a.a(lynxView.getAlpha() * 100.0f);
                d.f23575a.put(lynxView, aVar);
            }
            com.bytedance.android.monitor.lynx.c.a.b c2 = com.bytedance.android.monitor.lynx.b.f23580f.f23584b.b(this.f23563d);
            if (c2 != null) {
                str = c2.f23491b;
            } else {
                str = null;
            }
            com.bytedance.android.monitor.lynx.b.f23580f.b(str, "blank");
            long currentTimeMillis = System.currentTimeMillis();
            LynxView lynxView2 = this.f23563d;
            a aVar2 = new a(this, currentTimeMillis);
            l.c(lynxView2, "");
            l.c("", "");
            com.bytedance.ugc.a.c.b(lynxView2, "", c.f23568a, new c.a(aVar2), new c.b(lynxView2, aVar2));
        }
    }

    public static final class a implements c.AbstractC0510c {

        /* renamed from: a  reason: collision with root package name */
        public com.bytedance.android.monitor.lynx.c.a.a f23565a = new com.bytedance.android.monitor.lynx.c.a.a();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f23566b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f23567c;

        static {
            Covode.recordClassIndex(13990);
        }

        a(b bVar, long j2) {
            this.f23566b = bVar;
            this.f23567c = j2;
        }

        @Override // com.bytedance.android.monitor.lynx.a.c.AbstractC0510c
        public final void a(View view, String str, float f2) {
            int i2;
            List<a.C0509a> list;
            l.c(view, "");
            l.c(str, "");
            this.f23565a.f23612b = f2;
            this.f23565a.f23613c = view.getHeight();
            this.f23565a.f23614d = view.getWidth();
            this.f23565a.f23619i = h.g.a.a(view.getAlpha() * 100.0f);
            com.bytedance.android.monitor.lynx.c.a.a aVar = this.f23565a;
            a aVar2 = d.f23575a.get(view);
            if (aVar2 == null || (list = aVar2.f23549g) == null) {
                i2 = 0;
            } else {
                i2 = list.size();
            }
            aVar.f23620j = i2;
            if (((double) f2) <= this.f23566b.f23562c) {
                LynxView lynxView = this.f23566b.f23563d;
                l.c(lynxView, "");
                a aVar3 = d.f23575a.get(lynxView);
                if (aVar3 != null) {
                    aVar3.f23544b = f2;
                }
                LynxView lynxView2 = this.f23566b.f23563d;
                l.c(lynxView2, "");
                a aVar4 = d.f23575a.get(lynxView2);
                if (aVar4 != null) {
                    com.bytedance.android.monitor.f.a.a(new d.a(aVar4));
                }
            }
            c.AbstractC0510c cVar = this.f23566b.f23564e;
            if (cVar != null) {
                cVar.a(view, str, f2);
            }
            com.bytedance.android.monitor.h.b.b(this.f23566b.f23560a, "effectivePercentage: " + this.f23565a.f23612b + ", height: " + this.f23565a.f23613c + ", width: " + this.f23565a.f23614d + ", alpha: " + this.f23565a.f23619i + ", elementCount: " + this.f23565a.f23620j);
        }

        @Override // com.bytedance.android.monitor.lynx.a.c.AbstractC0510c
        public final void a(View view, String str, long j2, long j3) {
            com.bytedance.android.monitor.lynx.c.a.b c2;
            l.c(view, "");
            l.c(str, "");
            this.f23565a.f23615e = System.currentTimeMillis() - this.f23567c;
            this.f23565a.f23616f = j2;
            this.f23565a.f23617g = j3;
            com.bytedance.android.monitor.lynx.b bVar = com.bytedance.android.monitor.lynx.b.f23580f;
            LynxView lynxView = (LynxView) view;
            com.bytedance.android.monitor.lynx.c.a.a aVar = this.f23565a;
            l.c(lynxView, "");
            l.c(aVar, "");
            com.bytedance.android.monitor.lynx.b.b a2 = bVar.f23583a.a(lynxView);
            if (!(a2 == null || (c2 = bVar.f23584b.b(lynxView)) == null)) {
                bVar.a(com.bytedance.android.monitor.f.a.a(), new b.c(bVar, c2, com.bytedance.android.monitor.k.a.a(lynxView), aVar, a2));
            }
            c.AbstractC0510c cVar = this.f23566b.f23564e;
            if (cVar != null) {
                cVar.a(view, str, j2, j3);
            }
        }
    }

    public b(LynxView lynxView, c.AbstractC0510c cVar) {
        l.c(lynxView, "");
        this.f23563d = lynxView;
        this.f23564e = cVar;
    }
}
