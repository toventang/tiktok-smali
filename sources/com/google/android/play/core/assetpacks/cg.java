package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.b;

/* access modifiers changed from: package-private */
public final class cg {

    /* renamed from: a  reason: collision with root package name */
    private static final b f52964a = new b("PackageStateCache");

    /* renamed from: b  reason: collision with root package name */
    private final Context f52965b;

    /* renamed from: c  reason: collision with root package name */
    private int f52966c = -1;

    static {
        Covode.recordClassIndex(32726);
    }

    cg(Context context) {
        this.f52965b = context;
    }

    public final synchronized int a() {
        int i2;
        MethodCollector.i(6466);
        if (this.f52966c == -1) {
            try {
                this.f52966c = this.f52965b.getPackageManager().getPackageInfo(this.f52965b.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f52964a.b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        i2 = this.f52966c;
        MethodCollector.o(6466);
        return i2;
    }
}
