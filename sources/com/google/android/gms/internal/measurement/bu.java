package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final /* synthetic */ class bu implements cq {

    /* renamed from: a  reason: collision with root package name */
    private final Context f50731a;

    static {
        Covode.recordClassIndex(31687);
    }

    public bu(Context context) {
        this.f50731a = context;
    }

    @Override // com.google.android.gms.internal.measurement.cq
    public final Object a() {
        Context context = this.f50731a;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
            if (bc.a() && !context.isDeviceProtectedStorage()) {
                context = context.createDeviceProtectedStorageContext();
            }
            cm<File> a2 = bq.a(context);
            if (a2.zza()) {
                return cm.zza(bq.a(a2.zzb()));
            }
        }
        return cm.zzc();
    }
}
