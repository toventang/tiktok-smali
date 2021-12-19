package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b;
import dmt.av.video.VEPreviewParams;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f127866a = new c();

    private c() {
    }

    public static void c() {
        b.f127976e = 0;
        b.f127977f = 0;
    }

    static {
        Covode.recordClassIndex(83813);
    }

    public static boolean b() {
        if (b.f127975d <= 0 || b.f127974c <= 0 || b.f127972a <= 0 || b.f127973b <= 0) {
            return false;
        }
        return true;
    }

    public static boolean a() {
        if (b.f127977f <= 0 || b.f127976e <= 0) {
            return false;
        }
        return true;
    }

    public static void a(VEPreviewParams vEPreviewParams) {
        if (vEPreviewParams != null) {
            b.f127976e = vEPreviewParams.getCanvasWidth();
            b.f127977f = vEPreviewParams.getCanvasHeight();
        }
    }

    public static void a(int i2, int i3, int i4, int i5) {
        b.f127978g = i2;
        b.f127979h = i3;
        b.f127980i = i4;
        b.f127981j = i5;
    }
}
