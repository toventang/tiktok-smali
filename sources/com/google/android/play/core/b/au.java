package com.google.android.play.core.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.d.q;

public final class au {

    /* renamed from: a  reason: collision with root package name */
    private static final b f53120a = new b("PhoneskyVerificationUtils");

    static {
        Covode.recordClassIndex(32802);
    }

    public static boolean a(Context context) {
        int length;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
            if (signatureArr == null || (length = signatureArr.length) == 0) {
                f53120a.e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                return false;
            }
            int i2 = 0;
            do {
                String a2 = q.a(signatureArr[i2].toByteArray());
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a2)) {
                    return true;
                }
                if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a2)) {
                    return true;
                }
                i2++;
            } while (i2 < length);
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
