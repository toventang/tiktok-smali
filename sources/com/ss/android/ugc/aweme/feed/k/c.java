package com.ss.android.ugc.aweme.feed.k;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.language.d;
import h.f.b.l;
import h.m.p;
import java.io.IOException;
import java.util.Locale;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f93554a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(59262);
    }

    public static String a() {
        String str;
        String language;
        String[] list;
        String str2 = "";
        MethodCollector.i(8354);
        String str3 = null;
        try {
            String a2 = d.a();
            l.b(a2, str2);
            Locale locale = Locale.getDefault();
            l.b(locale, str2);
            if (a2 != null) {
                String lowerCase = a2.toLowerCase(locale);
                l.b(lowerCase, str2);
                Resources resources = com.bytedance.ies.ugc.appcontext.d.a().getResources();
                l.b(resources, str2);
                String[] list2 = resources.getAssets().list(str2);
                if (list2 != null) {
                    int length = list2.length;
                    String str4 = null;
                    for (int i2 = 0; i2 < length; i2++) {
                        String str5 = list2[i2];
                        l.b(str5, str2);
                        if (p.e((CharSequence) str5, (CharSequence) "i18#lang_") && (list = resources.getAssets().list(list2[i2])) != null) {
                            int length2 = list.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length2) {
                                    break;
                                } else if (TextUtils.equals(list[i3], lowerCase + ".json")) {
                                    str4 = list2[i2] + "/" + lowerCase + ".json";
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    if (str4 == null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            Configuration configuration = resources.getConfiguration();
                            l.b(configuration, str2);
                            Locale locale2 = configuration.getLocales().get(0);
                            l.b(locale2, str2);
                            language = locale2.getLanguage();
                            l.b(language, str2);
                        } else {
                            Locale locale3 = resources.getConfiguration().locale;
                            l.b(locale3, str2);
                            language = locale3.getLanguage();
                            l.b(language, str2);
                        }
                        if (TextUtils.isEmpty(language)) {
                            language = "en";
                        }
                        str2 = language;
                        str4 = "i18#lang_" + str2 + "/default.json";
                    }
                    str3 = a(com.bytedance.ies.ugc.appcontext.d.a(), str4);
                    com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("language", str2);
                    if (TextUtils.isEmpty(str3)) {
                        str = "default";
                    } else {
                        str = "languageDefault";
                    }
                    r.a("use_default_json", a3.a("isLanguageDefault", str).f66730a);
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = a(com.bytedance.ies.ugc.appcontext.d.a(), "feed_response.json");
                }
                MethodCollector.o(8354);
                return str3;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            MethodCollector.o(8354);
            throw nullPointerException;
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC, Splitter:B:25:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = 8358(0x20a6, float:1.1712E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            r4 = 0
            android.content.res.AssetManager r0 = r6.getAssets()     // Catch:{ IOException -> 0x0032, all -> 0x0030 }
            java.io.InputStream r3 = r0.open(r7)     // Catch:{ IOException -> 0x0032, all -> 0x0030 }
            int r0 = r3.available()     // Catch:{ IOException -> 0x002e }
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x002e }
            r3.read(r2)     // Catch:{ IOException -> 0x002e }
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)     // Catch:{ IOException -> 0x002e }
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)     // Catch:{ IOException -> 0x002e }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x002e }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x002e }
            r3.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r0
        L_0x002e:
            r0 = move-exception
            goto L_0x0034
        L_0x0030:
            r0 = move-exception
            goto L_0x003a
        L_0x0032:
            r0 = move-exception
            r3 = r4
        L_0x0034:
            r0.printStackTrace()     // Catch:{ all -> 0x0038 }
            goto L_0x0043
        L_0x0038:
            r0 = move-exception
            r4 = r3
        L_0x003a:
            if (r4 == 0) goto L_0x003f
            r4.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        L_0x0043:
            if (r3 == 0) goto L_0x0048
            r3.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.k.c.a(android.content.Context, java.lang.String):java.lang.String");
    }
}
