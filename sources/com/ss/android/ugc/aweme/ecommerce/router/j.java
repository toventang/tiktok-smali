package com.ss.android.ugc.aweme.ecommerce.router;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.f;
import com.google.gson.g;
import com.ss.android.ugc.aweme.ecommerce.util.d;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.hk;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f87169a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static final h f87170b = i.a((h.f.a.a) a.f87171a);

    public static f a() {
        return (f) f87170b.getValue();
    }

    private j() {
    }

    static final class a extends m implements h.f.a.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f87171a = new a();

        static {
            Covode.recordClassIndex(54707);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return new g().a((Type) HashMap.class, (Object) new d()).b();
        }
    }

    static {
        Covode.recordClassIndex(54706);
    }

    public static Uri.Builder a(String str, Map<String, ? extends Object> map) {
        l.d(str, "");
        l.d(map, "");
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof Number) || (value instanceof String) || (value instanceof Character)) {
                buildUpon.appendQueryParameter(key, value.toString());
            } else {
                buildUpon.appendQueryParameter(key, dg.a().b(value));
            }
        }
        l.b(buildUpon, "");
        return buildUpon;
    }

    public static Uri.Builder b(String str, Map<String, ? extends Object> map) {
        l.d(str, "");
        l.d(map, "");
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((!l.a(value, (Object) "")) && value != null) {
                if ((value instanceof Number) || (value instanceof String) || (value instanceof Character)) {
                    buildUpon.appendQueryParameter(key, value.toString());
                } else {
                    buildUpon.appendQueryParameter(key, dg.a().b(value));
                }
            }
        }
        l.b(buildUpon, "");
        return buildUpon;
    }

    public static String c(String str, Map<String, ? extends Object> map) {
        l.d(str, "");
        l.d(map, "");
        Uri parse = Uri.parse(str);
        Uri uri = null;
        String queryParameter = parse != null ? parse.getQueryParameter("url") : null;
        if (hk.a(queryParameter)) {
            Uri.Builder buildUpon = Uri.parse(queryParameter).buildUpon();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if ((!l.a(value, (Object) "")) && value != null) {
                    if ((value instanceof Number) || (value instanceof String) || (value instanceof Character)) {
                        buildUpon.appendQueryParameter(key, value.toString());
                    } else {
                        buildUpon.appendQueryParameter(key, dg.a().b(value));
                    }
                }
            }
            l.b(parse, "");
            if (buildUpon != null) {
                uri = buildUpon.build();
            }
            String uri2 = com.ss.android.ugc.aweme.ecommerce.util.f.a(parse, "url", String.valueOf(uri)).toString();
            l.b(uri2, "");
            return uri2;
        }
        String uri3 = parse.toString();
        l.b(uri3, "");
        return uri3;
    }

    public static SmartRoute a(Context context, String str, Map<String, ? extends Object> map, boolean z) {
        l.d(context, "");
        l.d(str, "");
        l.d(map, "");
        Uri.Builder a2 = a(str, map);
        if (z) {
            a2.appendQueryParameter("fallback", null);
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, a2.toString());
        l.b(buildRoute, "");
        return buildRoute;
    }
}
