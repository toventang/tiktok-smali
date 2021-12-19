package com.ss.android.ugc.aweme.kids.setting.items.language.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f107073a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(68481);
    }

    public static String a() {
        String b2 = b("key_current_locale", "");
        if (TextUtils.isEmpty(b2)) {
            return "en";
        }
        return b2;
    }

    private static SharedPreferences a(Context context) {
        SharedPreferences a2 = d.a(context, "key_language_sp_key", 0);
        l.b(a2, "");
        return a2;
    }

    private static String b(String str, String str2) {
        String string = a(com.bytedance.ies.ugc.appcontext.d.a()).getString(str, str2);
        if (string == null) {
            return "";
        }
        return string;
    }

    public static void a(String str, String str2) {
        a(com.bytedance.ies.ugc.appcontext.d.a()).edit().putString(str, str2).apply();
    }

    public static void a(Context context, String str, String str2) {
        if (context == null) {
            l.b();
        }
        a(context).edit().putString(str, str2).apply();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Locale a(java.lang.String r13, java.lang.String r14, android.content.Context r15) {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.setting.items.language.d.b.a(java.lang.String, java.lang.String, android.content.Context):java.util.Locale");
    }
}
