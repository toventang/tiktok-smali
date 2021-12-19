package com.ss.android.ugc.aweme.web;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.sdk.webview.m;
import com.ss.android.ugc.aweme.utils.dc;
import com.ss.android.ugc.aweme.video.e;
import java.io.File;

public final class k implements m {

    /* renamed from: a  reason: collision with root package name */
    public static k f145061a = new k();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f145062b = true;

    /* renamed from: c  reason: collision with root package name */
    private String f145063c;

    private k() {
    }

    static {
        Covode.recordClassIndex(94851);
    }

    public static File b() {
        File file = new File(a(d.a()), "offlineX");
        e.a(file);
        return file;
    }

    private static boolean d() {
        boolean equals = TextUtils.equals(d.s, "local_test");
        boolean equals2 = "online".equals(dc.g());
        if (!equals || equals2) {
            return false;
        }
        return true;
    }

    public final String c() {
        String str;
        if (TextUtils.isEmpty(this.f145063c)) {
            if (d()) {
                str = l.a();
            } else {
                str = "365b20e8f6c343df1eff65214a0e3e74";
            }
            this.f145063c = str;
        }
        return this.f145063c;
    }

    @Override // com.ss.android.sdk.webview.m
    public final String a() {
        File file = new File(b().getPath(), c());
        e.a(file);
        return file.getPath();
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    @Override // com.ss.android.sdk.webview.m
    public final String a(String str) {
        File file = new File(b().getPath(), str);
        e.a(file);
        return file.getPath();
    }
}
