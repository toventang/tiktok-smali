package com.ss.android.ugc.aweme.sticker.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.sticker.panel.k;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.g;
import com.ss.android.ugc.tools.view.widget.c.a;
import com.ss.android.ugc.tools.view.widget.c.b;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;
import h.z;
import java.util.HashMap;

public final class b {

    /* renamed from: a */
    private static final HashMap<Float, Float> f136675a = new HashMap<>();

    public static final class a extends m implements h.f.a.b<FrameLayout.LayoutParams, z> {

        /* renamed from: a */
        public static final a f136676a = new a();

        static {
            Covode.recordClassIndex(89262);
        }

        a() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FrameLayout.LayoutParams layoutParams) {
            l.d(layoutParams, "");
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.widget.b$b */
    public static final class C3567b extends m implements h.f.a.b<a.C4052a, z> {

        /* renamed from: a */
        public static final C3567b f136677a = new C3567b();

        static {
            Covode.recordClassIndex(89263);
        }

        C3567b() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a.C4052a aVar) {
            l.d(aVar, "");
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(89261);
    }

    public static final class c extends m implements h.f.a.b<b.a, z> {
        final /* synthetic */ k $config;
        final /* synthetic */ h.f.a.b $configureImageView;
        final /* synthetic */ Context $context;
        final /* synthetic */ float $imageHeight;
        final /* synthetic */ float $imageWidth;

        static {
            Covode.recordClassIndex(89264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, float f2, float f3, k kVar, h.f.a.b bVar) {
            super(1);
            this.$context = context;
            this.$imageWidth = f2;
            this.$imageHeight = f3;
            this.$config = kVar;
            this.$configureImageView = bVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b.a aVar) {
            b.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f150397g = (int) b.a(this.$context, this.$imageWidth);
            aVar2.f150398h = (int) b.a(this.$context, this.$imageHeight);
            aVar2.f150394d = this.$config.f135226a;
            aVar2.o = true;
            aVar2.f150400j = this.$config.o;
            aVar2.n = this.$config.p;
            aVar2.f150401k = this.$config.q;
            aVar2.f150402l = this.$config.r;
            aVar2.r = this.$config.f135227b;
            aVar2.f150414a = this.$config.f135236k;
            aVar2.f150415b = this.$config.f135237l;
            aVar2.f150395e = (int) b.a(this.$context, this.$config.f135228c);
            aVar2.q = this.$config.f135229d;
            aVar2.p = this.$config.s;
            h.f.a.b<? super a.C4052a, z> bVar = this.$config.n;
            if (bVar != null) {
                bVar.invoke(aVar2);
            }
            this.$configureImageView.invoke(aVar2);
            return z.f158842a;
        }
    }

    public static final p<FrameLayout, com.ss.android.ugc.tools.view.widget.c.b> a(k kVar, Context context) {
        l.d(kVar, "");
        l.d(context, "");
        return a(kVar, context, 0.0f, 0.0f, kVar.f135232g, kVar.f135233h, 0.0f, 0.0f, null, null, 486);
    }

    public static final float a(Context context, float f2) {
        if (f2 < 0.0f) {
            return f2;
        }
        HashMap<Float, Float> hashMap = f136675a;
        Float f3 = hashMap.get(Float.valueOf(f2));
        if (f3 == null) {
            f3 = Float.valueOf(r.a(context, f2));
            hashMap.put(Float.valueOf(f2), Float.valueOf(f3.floatValue()));
        }
        l.b(f3, "");
        return f3.floatValue();
    }

    private static p<FrameLayout, com.ss.android.ugc.tools.view.widget.c.b> a(k kVar, Context context, float f2, float f3, float f4, float f5, float f6, float f7, h.f.a.b<? super FrameLayout.LayoutParams, z> bVar, h.f.a.b<? super a.C4052a, z> bVar2) {
        MethodCollector.i(11691);
        l.d(kVar, "");
        l.d(context, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        c cVar = new c(context, f2, f3, kVar, bVar2);
        l.d(context, "");
        l.d(cVar, "");
        b.a aVar = new b.a(context);
        cVar.invoke(aVar);
        com.ss.android.ugc.tools.view.widget.c.b a2 = aVar.b();
        if (com.ss.android.ugc.tools.a.f149054l.f149061f) {
            TextView textView = a2.getTextView();
            if (textView != null) {
                textView.setTextSize(12.0f);
            }
            TextView textView2 = a2.getTextView();
            if (textView2 != null) {
                g.a(textView2);
            }
        } else {
            TextView textView3 = a2.getTextView();
            if (textView3 != null) {
                textView3.setTextSize(11.0f);
            }
            TextView textView4 = a2.getTextView();
            if (textView4 != null) {
                textView4.setTypeface(Typeface.defaultFromStyle(0));
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) a(context, f4), (int) a(context, f5));
        layoutParams.gravity = 17;
        bVar.invoke(layoutParams);
        a2.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams((int) a(context, f6), (int) a(context, f7)));
        frameLayout.addView(a2);
        p<FrameLayout, com.ss.android.ugc.tools.view.widget.c.b> a3 = v.a(frameLayout, a2);
        MethodCollector.o(11691);
        return a3;
    }

    public static /* synthetic */ p a(k kVar, Context context, float f2, float f3, float f4, float f5, float f6, float f7, h.f.a.b bVar, h.f.a.b bVar2, int i2) {
        if ((i2 & 2) != 0) {
            f2 = kVar.f135230e;
        }
        if ((i2 & 4) != 0) {
            f3 = kVar.f135231f;
        }
        if ((i2 & 8) != 0) {
            f4 = kVar.f135232g;
        }
        if ((i2 & 16) != 0) {
            f5 = kVar.f135233h;
        }
        if ((i2 & 32) != 0) {
            f6 = kVar.f135234i;
        }
        if ((i2 & 64) != 0) {
            f7 = kVar.f135235j;
        }
        if ((i2 & 128) != 0) {
            bVar = a.f136676a;
        }
        if ((i2 & 256) != 0) {
            bVar2 = C3567b.f136677a;
        }
        return a(kVar, context, f2, f3, f4, f5, f6, f7, bVar, bVar2);
    }
}
