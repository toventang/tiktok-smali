package com.bytedance.android.live.broadcast.preview;

import android.net.Uri;
import androidx.fragment.app.d;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.b.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveIntroLynxUrl;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public static final aj f8112a = new aj();

    private aj() {
    }

    static {
        Covode.recordClassIndex(4037);
    }

    public static d a(boolean z) {
        String str;
        boolean z2;
        String str2;
        String value = LiveIntroLynxUrl.INSTANCE.getValue();
        Uri parse = Uri.parse(value);
        boolean z3 = false;
        m e2 = ((f) a.a(f.class)).createLynxDialogBuilder(value, "").a(8, 8).b(a(parse, "height", 438)).a(a(parse, "width", (int) y.e(y.c()))).c(a(parse, "margin", 0)).e(80);
        if (z) {
            str = "right";
        } else {
            str = "bottom";
        }
        m d2 = e2.d(str);
        if (a(parse, "show_close", 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        m e3 = d2.d(z2).b(true).e("0.5");
        if (parse == null || (str2 = parse.toString()) == null) {
            str2 = "";
        }
        l.b(str2, "");
        m c2 = e3.c(str2);
        if (a(parse, "landscape_custom_height", 0) == 1) {
            z3 = true;
        }
        return c2.a(z3).a();
    }

    private static int a(Uri uri, String str, int i2) {
        if (uri == null) {
            return i2;
        }
        try {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return Integer.parseInt(queryParameter);
            }
            return i2;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
