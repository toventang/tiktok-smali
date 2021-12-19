package com.ss.android.ugc.tools.infosticker.view.internal.base;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.widget.c.b;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;

public final class h {
    static {
        Covode.recordClassIndex(98511);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements b<Float, Integer> {
        final /* synthetic */ int $containerHeight$inlined;
        final /* synthetic */ Float $containerPaddingBottom$inlined;
        final /* synthetic */ Float $containerPaddingLeft$inlined;
        final /* synthetic */ Float $containerPaddingRight$inlined;
        final /* synthetic */ Float $containerPaddingTop$inlined;
        final /* synthetic */ int $containerWidth$inlined;
        final /* synthetic */ Context $context$inlined;
        final /* synthetic */ com.ss.android.ugc.tools.view.widget.c.b $stickerView$inlined;

        static {
            Covode.recordClassIndex(98512);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2, int i3, Context context, Float f2, Float f3, Float f4, Float f5, com.ss.android.ugc.tools.view.widget.c.b bVar) {
            super(1);
            this.$containerWidth$inlined = i2;
            this.$containerHeight$inlined = i3;
            this.$context$inlined = context;
            this.$containerPaddingLeft$inlined = f2;
            this.$containerPaddingTop$inlined = f3;
            this.$containerPaddingRight$inlined = f4;
            this.$containerPaddingBottom$inlined = f5;
            this.$stickerView$inlined = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Float f2) {
            int i2;
            Float f3 = f2;
            if (f3 != null) {
                f3.floatValue();
                i2 = (int) r.a(this.$context$inlined, f3.floatValue());
            } else {
                i2 = 0;
            }
            return Integer.valueOf(i2);
        }
    }

    public static final p<FrameLayout, com.ss.android.ugc.tools.view.widget.c.b> a(Context context) {
        l.d(context, "");
        Float valueOf = Float.valueOf(8.0f);
        Float valueOf2 = Float.valueOf(16.0f);
        return a(context, 93.0f, 93.0f, (int) r.a(context, 125.0f), (int) r.a(context, 109.0f), valueOf2, valueOf, valueOf2, valueOf);
    }

    public static final p<FrameLayout, com.ss.android.ugc.tools.view.widget.c.b> b(Context context) {
        l.d(context, "");
        Float valueOf = Float.valueOf(3.0f);
        return a(context, 80.0f, 80.0f, (int) r.a(context, 86.0f), (int) r.a(context, 86.0f), valueOf, valueOf, valueOf, valueOf);
    }

    public static final p<FrameLayout, com.ss.android.ugc.tools.view.widget.c.b> a(Context context, float f2, float f3, int i2, int i3, Float f4, Float f5, Float f6, Float f7) {
        MethodCollector.i(8236);
        l.d(context, "");
        b.a aVar = new b.a(context);
        aVar.f150397g = (int) r.a(context, f2);
        aVar.f150398h = (int) r.a(context, f3);
        aVar.f150400j = false;
        aVar.o = false;
        aVar.f150399i = 2131232913;
        com.ss.android.ugc.tools.view.widget.c.b a2 = aVar.b();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        a2.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i2, i3));
        a aVar2 = new a(i2, i3, context, f4, f5, f6, f7, a2);
        frameLayout.setPadding(((Number) aVar2.invoke(f4)).intValue(), ((Number) aVar2.invoke(f5)).intValue(), ((Number) aVar2.invoke(f6)).intValue(), ((Number) aVar2.invoke(f7)).intValue());
        frameLayout.addView(a2);
        p<FrameLayout, com.ss.android.ugc.tools.view.widget.c.b> a3 = v.a(frameLayout, a2);
        MethodCollector.o(8236);
        return a3;
    }
}
