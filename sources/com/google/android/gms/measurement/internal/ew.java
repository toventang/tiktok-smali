package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;

public final class ew {

    /* renamed from: a  reason: collision with root package name */
    public final ev f51563a;

    static {
        Covode.recordClassIndex(32217);
    }

    public ew(ev evVar) {
        r.a(evVar);
        this.f51563a = evVar;
    }

    public static boolean a(Context context) {
        ActivityInfo receiverInfo;
        r.a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
