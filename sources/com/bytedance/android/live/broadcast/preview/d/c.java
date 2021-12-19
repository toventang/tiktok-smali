package com.bytedance.android.live.broadcast.preview.d;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.network.h;
import com.bytedance.android.live.t.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.g;
import h.a.ag;
import h.f.b.l;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f8209a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(4161);
    }

    public static String a() {
        h a2 = h.a();
        l.b(a2, "");
        Map<String, String> b2 = a2.b();
        if (b2 == null) {
            b2 = ag.a();
        }
        String str = b2.get("fake_region");
        String str2 = b2.get("carrier_region");
        String str3 = b2.get("sys_region");
        String str4 = b2.get("app_language");
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            } else if (TextUtils.isEmpty(str3)) {
                str = str4;
            } else {
                str = str3;
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        } else if (str == null) {
            l.b();
        }
        Locale locale = Locale.US;
        l.b(locale, "");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String upperCase = str.toUpperCase(locale);
        l.b(upperCase, "");
        return upperCase;
    }

    public static void a(Context context, String str, String str2, boolean z) {
        String str3;
        l.d(str, "");
        l.d(str2, "");
        g gVar = new g(str);
        gVar.a("previous_page", str2);
        if (z) {
            str3 = "popup";
        } else {
            str3 = "page";
        }
        gVar.a("container_type", str3);
        gVar.a("priority_region", a());
        ((IActionHandlerService) a.a(IActionHandlerService.class)).handle(context, Uri.parse(gVar.a()));
    }
}
