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
import com.ss.android.ugc.tools.view.widget.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;
import h.z;
import java.util.HashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<Float, Float> f136678a = new HashMap<>();

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<FrameLayout.LayoutParams, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f136679a = new a();

        static {
            Covode.recordClassIndex(89266);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FrameLayout.LayoutParams layoutParams) {
            l.d(layoutParams, "");
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<a.C4052a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f136680a = new b();

        static {
            Covode.recordClassIndex(89267);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a.C4052a aVar) {
            l.d(aVar, "");
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(89265);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.widget.c$c  reason: collision with other inner class name */
    public static final class C3568c extends m implements h.f.a.b<n.a, z> {
        final /* synthetic */ k $config;
        final /* synthetic */ h.f.a.b $configureImageView;
        final /* synthetic */ Context $context;
        final /* synthetic */ float $imageHeight;
        final /* synthetic */ float $imageWidth;

        static {
            Covode.recordClassIndex(89268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3568c(Context context, float f2, float f3, k kVar, h.f.a.b bVar) {
            super(1);
            this.$context = context;
            this.$imageWidth = f2;
            this.$imageHeight = f3;
            this.$config = kVar;
            this.$configureImageView = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n.a aVar) {
            n.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f150397g = (int) c.a(this.$context, this.$imageWidth);
            aVar2.f150398h = (int) c.a(this.$context, this.$imageHeight);
            aVar2.f150394d = this.$config.f135226a;
            aVar2.o = true;
            aVar2.f150400j = this.$config.o;
            aVar2.n = this.$config.p;
            aVar2.f150401k = this.$config.q;
            aVar2.f150402l = this.$config.r;
            aVar2.r = this.$config.f135227b;
            aVar2.f150456a = this.$config.f135236k;
            aVar2.f150457b = this.$config.f135237l;
            aVar2.f150395e = (int) c.a(this.$context, this.$config.f135228c);
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

    public static final p<FrameLayout, n> a(k kVar, Context context) {
        l.d(kVar, "");
        l.d(context, "");
        return a(kVar, context, kVar.f135232g, kVar.f135233h);
    }

    public static final float a(Context context, float f2) {
        if (f2 < 0.0f) {
            return f2;
        }
        HashMap<Float, Float> hashMap = f136678a;
        Float f3 = hashMap.get(Float.valueOf(f2));
        if (f3 == null) {
            f3 = Float.valueOf(r.a(context, f2));
            hashMap.put(Float.valueOf(f2), Float.valueOf(f3.floatValue()));
        }
        l.b(f3, "");
        return f3.floatValue();
    }

    private static /* synthetic */ p a(k kVar, Context context, float f2, float f3) {
        MethodCollector.i(12802);
        float f4 = kVar.f135230e;
        float f5 = kVar.f135231f;
        float f6 = kVar.f135234i;
        float f7 = kVar.f135235j;
        a aVar = a.f136679a;
        b bVar = b.f136680a;
        l.d(kVar, "");
        l.d(context, "");
        l.d(aVar, "");
        l.d(bVar, "");
        C3568c cVar = new C3568c(context, f4, f5, kVar, bVar);
        l.d(context, "");
        l.d(cVar, "");
        n.a aVar2 = new n.a(context);
        cVar.invoke(aVar2);
        n a2 = aVar2.b();
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
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) a(context, f2), (int) a(context, f3));
        layoutParams.gravity = 8388611;
        layoutParams.leftMargin = (int) r.a(context, 17.0f);
        layoutParams.rightMargin = (int) r.a(context, 17.0f);
        layoutParams.topMargin = (int) r.a(context, 9.0f);
        aVar.invoke(layoutParams);
        a2.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams((int) a(context, f6), (int) a(context, f7)));
        frameLayout.addView(a2);
        p a3 = v.a(frameLayout, a2);
        MethodCollector.o(12802);
        return a3;
    }
}
