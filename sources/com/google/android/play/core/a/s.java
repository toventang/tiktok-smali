package com.google.android.play.core.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.au;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.bv;
import com.google.android.play.core.b.l;
import com.google.android.play.core.d.q;
import com.google.android.play.core.install.a;
import com.google.android.play.core.tasks.d;
import com.google.android.play.core.tasks.f;

/* access modifiers changed from: package-private */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    static final b f52726a = new b("AppUpdateService");

    /* renamed from: e  reason: collision with root package name */
    private static final Intent f52727e = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: b  reason: collision with root package name */
    l<bv> f52728b;

    /* renamed from: c  reason: collision with root package name */
    final String f52729c;

    /* renamed from: d  reason: collision with root package name */
    final u f52730d;

    /* renamed from: f  reason: collision with root package name */
    private final Context f52731f;

    static {
        Covode.recordClassIndex(32653);
    }

    public s(Context context, u uVar) {
        this.f52729c = context.getPackageName();
        this.f52731f = context;
        this.f52730d = uVar;
        if (au.a(context)) {
            this.f52728b = new l<>(q.a(context), f52726a, "AppUpdateService", f52727e, m.f52714a);
        }
    }

    static /* synthetic */ Bundle a(s sVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(b());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(sVar.f52731f.getPackageManager().getPackageInfo(sVar.f52731f.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f52726a.b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    static <T> d<T> a() {
        f52726a.b("onError(%d)", -9);
        return f.a((Exception) new a(-9));
    }

    static Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 10803);
        return bundle;
    }
}
