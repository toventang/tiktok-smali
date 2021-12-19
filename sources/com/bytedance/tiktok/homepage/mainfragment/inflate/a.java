package com.bytedance.tiktok.homepage.mainfragment.inflate;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.c.c;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f44206a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(27083);
    }

    public static View b(Context context) {
        l.d(context, "");
        return IMService.createIIMServicebyMonsterPlugin(false).getDmEntranceView(context, "homepage_hot");
    }

    public static ImageView a(Context context) {
        int i2;
        MethodCollector.i(3031);
        l.d(context, "");
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        boolean a2 = com.ss.android.ugc.aweme.live.a.a.a();
        int a3 = n.a(10.0d);
        if (a2) {
            i2 = n.a(16.0d);
            a3 = n.a(16.0d);
        } else {
            i2 = 0;
        }
        imageView.setPadding(i2, a3, i2, a3);
        imageView.setImageResource(2131232121);
        imageView.setVisibility(8);
        MethodCollector.o(3031);
        return imageView;
    }

    public static View c(Context context) {
        int i2;
        l.d(context, "");
        AnimatedImageView animatedImageView = new AnimatedImageView(context);
        animatedImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (com.ss.android.ugc.aweme.homepage.ui.view.a.f99526c) {
            i2 = 56;
        } else {
            i2 = 40;
        }
        double d2 = (double) i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n.a(d2), n.a(d2));
        layoutParams.setMargins(0, 0, n.a(8.0d), 0);
        int i3 = Build.VERSION.SDK_INT;
        layoutParams.setMarginEnd(n.a(8.0d));
        animatedImageView.setLayoutParams(layoutParams);
        return animatedImageView;
    }

    public static View e(Context context) {
        MethodCollector.i(3040);
        l.d(context, "");
        int a2 = n.a(12.0d);
        ImageView imageView = new ImageView(context);
        imageView.setPadding(a2, a2, a2, a2);
        imageView.setImageResource(2131232479);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(n.a(44.0d), n.a(44.0d)));
        MethodCollector.o(3040);
        return imageView;
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.inflate.a$a  reason: collision with other inner class name */
    static final class C1078a extends m implements b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1078a f44207a = new C1078a();

        static {
            Covode.recordClassIndex(27084);
        }

        C1078a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics()));
            aVar2.f44749a = R.raw.icon_magnifying_glass_offset;
            aVar2.f44753e = Integer.valueOf((int) R.attr.aa);
            aVar2.f44754f = true;
            return z.f158842a;
        }
    }

    public static View d(Context context) {
        int a2;
        l.d(context, "");
        com.bytedance.tux.c.a a3 = c.a(C1078a.f44207a);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6);
        com.bytedance.ies.dmt.ui.f.c.a(tuxIconView, 0.75f);
        tuxIconView.setTuxIcon(a3);
        tuxIconView.setClickable(true);
        tuxIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (SearchServiceImpl.t().j()) {
            a2 = n.a(55.0d);
        } else {
            a2 = n.a(44.0d);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.setMargins(0, 0, n.a(7.0d), 0);
        tuxIconView.setLayoutParams(layoutParams);
        return tuxIconView;
    }
}
