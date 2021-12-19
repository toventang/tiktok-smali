package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.a.b;
import androidx.browser.a.d;
import androidx.browser.a.e;
import com.bytedance.covode.number.Covode;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public static e f48854a;

    /* renamed from: b  reason: collision with root package name */
    private static b f48855b;

    static {
        Covode.recordClassIndex(29455);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    private static void a() {
        b bVar;
        if (f48854a == null && (bVar = f48855b) != null) {
            f48854a = bVar.b();
        }
    }

    public static void a(Uri uri) {
        if (f48854a == null) {
            a();
        }
        e eVar = f48854a;
        if (eVar != null) {
            eVar.a(uri, null);
        }
    }

    @Override // androidx.browser.a.d
    public final void a(b bVar) {
        f48855b = bVar;
        bVar.a();
        a();
    }
}
