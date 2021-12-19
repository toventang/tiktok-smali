package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.a.a.c;
import com.facebook.drawee.a.a.e;
import com.zhiliaoapp.musically.R;

public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private HSImageView f14834a;

    /* renamed from: b  reason: collision with root package name */
    private HSImageView f14835b;

    static {
        Covode.recordClassIndex(8223);
    }

    public a(Context context) {
        super(context);
        MethodCollector.i(9500);
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.bfl, this, true);
        this.f14834a = (HSImageView) a2.findViewById(R.id.km);
        this.f14835b = (HSImageView) a2.findViewById(R.id.kn);
        e a3 = c.b().a(HSAnimImageView.a("tiktok_live_basic_resource", "ttlive_ic_loading_center.webp"));
        a3.f47322j = true;
        this.f14834a.setController(a3.e());
        e a4 = c.b().a(HSAnimImageView.a("tiktok_live_basic_resource", "ttlive_ic_loading_point.webp"));
        a4.f47322j = true;
        this.f14835b.setController(a4.e());
        MethodCollector.o(9500);
    }
}
