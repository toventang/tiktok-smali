package com.google.android.play.core.e;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.android.play.core.b.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class al {

    /* renamed from: a  reason: collision with root package name */
    private static final b f53235a = new b("SplitInstallInfoProvider");

    /* renamed from: b  reason: collision with root package name */
    private final Context f53236b;

    /* renamed from: c  reason: collision with root package name */
    private final String f53237c;

    static {
        Covode.recordClassIndex(32906);
    }

    public al(Context context) {
        this.f53236b = context;
        this.f53237c = context.getPackageName();
    }

    public final Set<String> a() {
        HashSet hashSet = new HashSet();
        for (String str : d()) {
            if (!a(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final Set<String> b() {
        ad c2 = c();
        if (c2 == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Set<String> d2 = d();
        d2.add("");
        Set<String> a2 = a();
        a2.add("");
        for (Map.Entry<String, Set<String>> entry : c2.a(a2).entrySet()) {
            if (d2.containsAll(entry.getValue())) {
                hashSet.add(entry.getKey());
            }
        }
        return hashSet;
    }

    public final ad c() {
        Bundle e2 = e();
        if (e2 == null) {
            f53235a.e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i2 = e2.getInt("com.android.vending.splits");
        if (i2 == 0) {
            f53235a.e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            ad a2 = ag.a(this.f53236b.getResources().getXml(i2), new ac());
            if (a2 == null) {
                f53235a.e("Can't parse languages metadata.", new Object[0]);
            }
            return a2;
        } catch (Resources.NotFoundException unused) {
            f53235a.e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    private final Set<String> d() {
        HashSet hashSet = new HashSet();
        Bundle e2 = e();
        if (e2 != null) {
            String string = e2.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f53235a.a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = null;
            try {
                PackageInfo packageInfo = this.f53236b.getPackageManager().getPackageInfo(this.f53237c, 0);
                if (packageInfo != null) {
                    strArr = packageInfo.splitNames;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f53235a.e("App is not found in PackageManager", new Object[0]);
            }
            if (strArr != null) {
                f53235a.a("Adding splits from package manager: %s", Arrays.toString(strArr));
                Collections.addAll(hashSet, strArr);
            } else {
                f53235a.a("No splits are found or app cannot be found in package manager.", new Object[0]);
            }
            aj ajVar = ak.f53234a.get();
            if (ajVar != null) {
                hashSet.addAll(ajVar.a());
            }
        }
        return hashSet;
    }

    private final Bundle e() {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = this.f53236b.getPackageManager();
            String str = this.f53237c;
            if (TextUtils.equals(str, d.a().getPackageName())) {
                if (com.ss.android.ugc.aweme.lancet.c.b.f107191a == null) {
                    com.ss.android.ugc.aweme.lancet.c.b.f107191a = packageManager.getApplicationInfo(str, 128);
                }
                applicationInfo = com.ss.android.ugc.aweme.lancet.c.b.f107191a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(str, 128);
            }
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
            f53235a.a("App has no applicationInfo or metaData", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            f53235a.e("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    public static boolean a(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }
}
