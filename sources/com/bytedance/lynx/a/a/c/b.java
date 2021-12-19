package com.bytedance.lynx.a.a.c;

import android.graphics.Color;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.a.a.e.a;
import h.f.b.l;
import h.m.p;
import h.q;
import h.r;
import h.z;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f40844a = new b();

    public static final String c(String str, String str2, Map<String, String> map, Uri uri) {
        l.c(str, "");
        l.c(str2, "");
        l.c(map, "");
        l.c(uri, "");
        return str2;
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(25037);
    }

    public static final boolean b(String str, String str2, Map<String, String> map, Uri uri) {
        l.c(str, "");
        l.c(str2, "");
        l.c(map, "");
        l.c(uri, "");
        return l.a((Object) str2, (Object) "1");
    }

    public static final int a(String str, String str2, Map<String, String> map, Uri uri) {
        l.c(str, "");
        l.c(str2, "");
        l.c(map, "");
        l.c(uri, "");
        if (p.c(str2, "rpx", false)) {
            return (int) ((Float.parseFloat(p.b(str2, (CharSequence) "rpx")) / 750.0f) * ((float) com.bytedance.lynx.a.a.f.b.b()));
        }
        if (!p.c(str2, "%", false)) {
            return com.bytedance.lynx.a.a.f.b.a(Float.parseFloat(str2));
        }
        float parseFloat = Float.parseFloat(p.b(str2, (CharSequence) "%")) / 100.0f;
        if (p.a((CharSequence) str, (CharSequence) "width", false)) {
            return (int) (((float) com.bytedance.lynx.a.a.f.b.b()) * parseFloat);
        }
        if (p.a((CharSequence) str, (CharSequence) "height", false)) {
            return (int) (((float) com.bytedance.lynx.a.a.f.b.a()) * parseFloat);
        }
        return (int) (((float) com.bytedance.lynx.a.a.f.b.b()) * parseFloat);
    }

    public static final a d(String str, String str2, Map<String, String> map, Uri uri) {
        l.c(str, "");
        l.c(str2, "");
        l.c(map, "");
        l.c(uri, "");
        z zVar = null;
        a aVar = new a(0, 1, null);
        try {
            aVar.setColor(Color.parseColor(com.bytedance.lynx.a.a.f.a.a(str2)));
            String str3 = map.get(str + "_light");
            if (str3 != null) {
                aVar.setColorLight(Color.parseColor(com.bytedance.lynx.a.a.f.a.a(str3)));
            }
            String str4 = map.get(str + "_dark");
            if (str4 != null) {
                aVar.setColorDark(Color.parseColor(com.bytedance.lynx.a.a.f.a.a(str4)));
                zVar = z.f158842a;
            }
            q.m223constructorimpl(zVar);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
        return aVar;
    }

    public static final a e(String str, String str2, Map<String, String> map, Uri uri) {
        l.c(str, "");
        l.c(str2, "");
        l.c(map, "");
        l.c(uri, "");
        z zVar = null;
        a aVar = new a(0, 1, null);
        try {
            aVar.setColor(Color.parseColor(com.bytedance.lynx.a.a.f.a.a("#".concat(String.valueOf(str2)))));
            String str3 = map.get(str + "_light");
            if (str3 != null) {
                aVar.setColorLight(Color.parseColor(com.bytedance.lynx.a.a.f.a.a("#".concat(String.valueOf(str3)))));
            }
            String str4 = map.get(str + "_dark");
            if (str4 != null) {
                aVar.setColorDark(Color.parseColor(com.bytedance.lynx.a.a.f.a.a("#".concat(String.valueOf(str4)))));
                zVar = z.f158842a;
            }
            q.m223constructorimpl(zVar);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
        return aVar;
    }
}
