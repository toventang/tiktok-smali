package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.util.k;
import com.google.firebase.b;
import java.util.List;

public class ae {

    /* renamed from: a  reason: collision with root package name */
    private final Context f54390a;

    /* renamed from: b  reason: collision with root package name */
    private String f54391b;

    /* renamed from: c  reason: collision with root package name */
    private String f54392c;

    /* renamed from: d  reason: collision with root package name */
    private int f54393d;

    /* renamed from: e  reason: collision with root package name */
    private int f54394e;

    static {
        Covode.recordClassIndex(33772);
    }

    public final synchronized String c() {
        String a2;
        MethodCollector.i(13350);
        a2 = a(this);
        MethodCollector.o(13350);
        return a2;
    }

    private synchronized String f() {
        String str;
        MethodCollector.i(13351);
        if (this.f54391b == null) {
            g();
        }
        str = this.f54391b;
        MethodCollector.o(13351);
        return str;
    }

    public final synchronized String d() {
        String str;
        MethodCollector.i(13352);
        if (this.f54392c == null) {
            g();
        }
        str = this.f54392c;
        MethodCollector.o(13352);
        return str;
    }

    public final synchronized int e() {
        int i2;
        PackageInfo a2;
        MethodCollector.i(13353);
        if (this.f54393d == 0 && (a2 = a("com.google.android.gms")) != null) {
            this.f54393d = a2.versionCode;
        }
        i2 = this.f54393d;
        MethodCollector.o(13353);
        return i2;
    }

    private synchronized void g() {
        MethodCollector.i(13354);
        PackageInfo a2 = a(this.f54390a.getPackageName());
        if (a2 != null) {
            this.f54391b = Integer.toString(a2.versionCode);
            this.f54392c = a2.versionName;
        }
        MethodCollector.o(13354);
    }

    public final boolean a() {
        if (b() != 0) {
            return true;
        }
        return false;
    }

    public final synchronized int b() {
        MethodCollector.i(13273);
        int i2 = this.f54394e;
        if (i2 != 0) {
            MethodCollector.o(13273);
            return i2;
        }
        PackageManager packageManager = this.f54390a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            MethodCollector.o(13273);
            return 0;
        }
        if (!k.e()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f54394e = 1;
                MethodCollector.o(13273);
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            if (k.e()) {
                this.f54394e = 2;
            } else {
                this.f54394e = 1;
            }
            int i3 = this.f54394e;
            MethodCollector.o(13273);
            return i3;
        }
        this.f54394e = 2;
        MethodCollector.o(13273);
        return 2;
    }

    public ae(Context context) {
        this.f54390a = context;
    }

    private static String a(ae aeVar) {
        try {
            return aeVar.f();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private PackageInfo a(String str) {
        try {
            return this.f54390a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String.valueOf(String.valueOf(e2)).length();
            return null;
        }
    }

    public static String a(b bVar) {
        String str = bVar.c().f54360e;
        if (str != null) {
            return str;
        }
        String str2 = bVar.c().f54357b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }
}
