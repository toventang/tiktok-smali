package com.facebook.internal.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class a {
    static {
        Covode.recordClassIndex(29302);
    }

    public static String a(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb = new StringBuilder();
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            for (Signature signature : signatureArr) {
                instance.update(signature.toByteArray());
                sb.append(Base64.encodeToString(instance.digest(), 0));
                sb.append(":");
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            return sb.toString();
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
