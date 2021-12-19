package com.ss.android.f;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.LinkedHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static Context f59515a;

    /* renamed from: c  reason: collision with root package name */
    private static c<b> f59516c = new c<b>() {
        /* class com.ss.android.f.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(36745);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.ss.android.f.c
        public final /* synthetic */ b a() {
            return new b();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public a f59517b;

    static {
        Covode.recordClassIndex(36744);
    }

    private static int a() {
        try {
            return d.a(f59515a, "KEY_NEED_UPLOAD_LAUNCHLOG", 0).getInt("json_data", 0);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static b a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        f59515a = applicationContext;
        return f59516c.b();
    }

    public final void a(Uri uri) {
        Uri parse;
        try {
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("needlaunchlog", false);
            int a2 = a();
            if (booleanQueryParameter && a2 > 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str : uri.getQueryParameterNames()) {
                    if (!TextUtils.isEmpty(str)) {
                        linkedHashMap.put(str, uri.getQueryParameter(str));
                    }
                }
                String queryParameter = uri.getQueryParameter("params_url");
                if (!TextUtils.isEmpty(queryParameter) && (parse = Uri.parse(queryParameter)) != null) {
                    for (String str2 : parse.getQueryParameterNames()) {
                        if (!TextUtils.isEmpty(str2)) {
                            linkedHashMap.put(str2, parse.getQueryParameter(str2));
                        }
                    }
                }
                linkedHashMap.put("launchlog_protocol", uri.getScheme());
                linkedHashMap.put("launchlog_authority", uri.getAuthority());
                linkedHashMap.put("launchlog_path", uri.getPath());
                a aVar = this.f59517b;
                if (aVar != null) {
                    aVar.onEvent(linkedHashMap);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
