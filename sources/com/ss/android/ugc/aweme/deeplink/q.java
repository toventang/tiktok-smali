package com.ss.android.ugc.aweme.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.o;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.gw;
import h.f.b.l;
import h.m.p;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79527a = new a((byte) 0);

    static {
        Covode.recordClassIndex(49395);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49396);
        }

        private a() {
        }

        public static boolean a() {
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            l.b(createIMainServicebyMonsterPlugin, "");
            return createIMainServicebyMonsterPlugin.isAppHot();
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(Map<String, ? extends Object> map) {
            l.d(map, "");
            StringBuilder sb = new StringBuilder();
            map.entrySet();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
            }
            String sb2 = sb.toString();
            l.b(sb2, "");
            if (TextUtils.isEmpty(sb2)) {
                return "";
            }
            Objects.requireNonNull(sb2, "null cannot be cast to non-null type java.lang.String");
            String substring = sb2.substring(0, sb2.length() - 1);
            l.b(substring, "");
            return substring;
        }

        public static HashMap<String, Object> a(String str) {
            String str2;
            HashMap<String, Object> hashMap = new HashMap<>();
            if (str == null) {
                return hashMap;
            }
            try {
                Object[] array = p.c(str, new String[]{"&"}).toArray(new String[0]);
                if (array != null) {
                    for (String str3 : (String[]) array) {
                        Object[] array2 = p.c(str3, new String[]{"="}).toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr = (String[]) array2;
                            String decode = URLDecoder.decode(strArr[0], "UTF-8");
                            l.b(decode, "");
                            if (strArr.length > 1) {
                                str2 = URLDecoder.decode(strArr[1], "UTF-8");
                                l.b(str2, "");
                            } else {
                                str2 = "";
                            }
                            hashMap.put(decode, str2);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    return hashMap;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }

        public static String b(String str) {
            l.d(str, "");
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            boolean z = false;
            if (p.a((CharSequence) str, (CharSequence) "microapp", false) || p.a((CharSequence) str, (CharSequence) "microgame", false)) {
                z = true;
            }
            if (!z) {
                return str;
            }
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("android_scheme");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = parse.getQueryParameter("ios_scheme");
            }
            if (TextUtils.isEmpty(queryParameter)) {
                return str;
            }
            try {
                String decode = URLDecoder.decode(str, "UTF8");
                l.b(decode, "");
                parse = Uri.parse(decode);
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
            return queryParameter + "&app_id=" + parse.getQueryParameter("app_id") + "&token=" + parse.getQueryParameter("token") + "&channel=" + parse.getQueryParameter("channel") + "&iid=" + parse.getQueryParameter("iid");
        }

        public static boolean a(Uri uri) {
            l.d(uri, "");
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.contains("_t")) {
                uri.getQueryParameter("_t");
                if (!TextUtils.isEmpty(uri.getQueryParameter("_t"))) {
                    return true;
                }
            }
            return false;
        }

        public static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        public static String a(String str, Uri uri) {
            String str2;
            String str3;
            if (uri != null) {
                str2 = uri.getQueryParameter("sec_uid");
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                gw.a().a(str, str2);
            }
            gw.a();
            if (uri == null || (str3 = uri.toString()) == null) {
                str3 = "";
            }
            gw.a(str3, str, str2);
            return str2;
        }

        public static void a(Uri uri, String str) {
            String queryParameter;
            l.d(uri, "");
            l.d(str, "");
            if (TextUtils.equals(uri.getQueryParameter("gd_label"), "retarget") && (queryParameter = uri.getQueryParameter("toast")) != null) {
                o.b.a(str, queryParameter);
            }
        }
    }
}
