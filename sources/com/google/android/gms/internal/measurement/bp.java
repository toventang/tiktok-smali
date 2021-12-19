package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;

public final class bp {

    /* renamed from: a  reason: collision with root package name */
    private static volatile cm<Boolean> f50715a = cm.zzc();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f50716b = new Object();

    static {
        Covode.recordClassIndex(31682);
    }

    private static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            TextUtils.equals("com.google.android.gms", d.a().getPackageName());
            if ((packageManager.getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean a(Context context, Uri uri) {
        ProviderInfo resolveContentProvider;
        MethodCollector.i(7629);
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            String.valueOf(authority).length();
            MethodCollector.o(7629);
            return false;
        } else if (f50715a.zza()) {
            boolean booleanValue = f50715a.zzb().booleanValue();
            MethodCollector.o(7629);
            return booleanValue;
        } else {
            synchronized (f50716b) {
                try {
                    if (f50715a.zza()) {
                        return f50715a.zzb().booleanValue();
                    }
                    if (("com.google.android.gms".equals(context.getPackageName()) || ((resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0)) != null && "com.google.android.gms".equals(resolveContentProvider.packageName))) && a(context)) {
                        z = true;
                    }
                    f50715a = cm.zza(Boolean.valueOf(z));
                    boolean booleanValue2 = f50715a.zzb().booleanValue();
                    MethodCollector.o(7629);
                    return booleanValue2;
                } finally {
                    MethodCollector.o(7629);
                }
            }
        }
    }
}
