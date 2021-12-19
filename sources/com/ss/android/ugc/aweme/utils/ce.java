package com.ss.android.ugc.aweme.utils;

import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.adaptation.k;
import com.ss.android.ugc.aweme.df.b;
import com.ss.android.ugc.aweme.df.n;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.vesdk.VESafeAreaParams;
import h.f.b.l;

public final class ce {

    /* renamed from: a  reason: collision with root package name */
    public static final ce f142765a = new ce();

    /* renamed from: b  reason: collision with root package name */
    private static final float f142766b = r.a(b.a(), 28.0f);

    /* renamed from: c  reason: collision with root package name */
    private static final float f142767c = (r.a(b.a(), 31.5f) + ((float) n.a()));

    /* renamed from: d  reason: collision with root package name */
    private static final float f142768d = r.a(b.a(), 100.0f);

    /* renamed from: e  reason: collision with root package name */
    private static final float f142769e = r.a(b.a(), 40.0f);

    /* renamed from: f  reason: collision with root package name */
    private static final float f142770f = r.a(b.a(), 33.0f);

    private ce() {
    }

    static {
        Covode.recordClassIndex(93386);
    }

    public static VESafeAreaParams[] a(ViewGroup.MarginLayoutParams marginLayoutParams, Window window, boolean z) {
        float f2;
        l.d(marginLayoutParams, "");
        l.d(window, "");
        int a2 = k.a(b.a(), window);
        float max = Math.max(((((float) (marginLayoutParams.width - n.b(b.a()))) * 1.0f) / 2.0f) / ((float) marginLayoutParams.width), 0.0f);
        float max2 = ((float) Math.max(a2 - marginLayoutParams.topMargin, 0)) / ((float) marginLayoutParams.height);
        float max3 = Math.max(((((float) (marginLayoutParams.width + n.b(b.a()))) * 1.0f) / 2.0f) / ((float) marginLayoutParams.width), 0.0f);
        VESafeAreaParams vESafeAreaParams = new VESafeAreaParams();
        vESafeAreaParams.safeType = 0;
        vESafeAreaParams.left = max;
        vESafeAreaParams.top = max2;
        vESafeAreaParams.right = max3;
        vESafeAreaParams.bottom = 1.0f;
        float max4 = Math.max(Math.max(f142766b + f142767c, (float) a2) - ((float) marginLayoutParams.topMargin), 0.0f) / ((float) marginLayoutParams.height);
        if (z) {
            f2 = f142769e + f142770f;
        } else {
            f2 = f142769e;
        }
        float min = Math.min(1.0f, (((((float) (n.d(b.a()) - n.b())) - f142768d) - f2) - ((float) marginLayoutParams.topMargin)) / ((float) marginLayoutParams.height));
        VESafeAreaParams vESafeAreaParams2 = new VESafeAreaParams();
        vESafeAreaParams2.safeType = 1;
        vESafeAreaParams2.left = max;
        vESafeAreaParams2.top = max4;
        vESafeAreaParams2.right = max3;
        vESafeAreaParams2.bottom = min;
        return new VESafeAreaParams[]{vESafeAreaParams, vESafeAreaParams2};
    }
}
