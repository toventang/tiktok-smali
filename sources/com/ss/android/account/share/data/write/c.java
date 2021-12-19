package com.ss.android.account.share.data.write;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.account.share.data.a;
import h.f.b.l;
import h.w;
import java.security.MessageDigest;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f58242a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(36189);
    }

    public static String a(Context context, String str) {
        l.c(context, "");
        l.c(str, "");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            l.a((Object) packageInfo, "");
            Signature signature = packageInfo.signatures[0];
            l.a((Object) signature, "");
            return a(signature, "SHA256");
        } catch (Exception e2) {
            e2.printStackTrace();
            a.a().a("share_sdk_get_pkg_sign_failed").a("err_msg", e2.getMessage()).a("err_msg_stack", Log.getStackTraceString(e2)).b();
            return null;
        }
    }

    private static String a(Signature signature, String str) {
        l.c(signature, "");
        byte[] byteArray = signature.toByteArray();
        l.a((Object) byteArray, "");
        try {
            StringBuffer stringBuffer = new StringBuffer();
            MessageDigest instance = MessageDigest.getInstance(str);
            if (instance == null) {
                return "";
            }
            instance.reset();
            instance.update(byteArray);
            byte[] digest = instance.digest();
            l.a((Object) digest, "");
            int length = digest.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (Integer.toHexString(digest[i2] & 255).length() == 1) {
                    stringBuffer.append("0").append(Integer.toHexString(digest[i2] & 255));
                } else {
                    stringBuffer.append(Integer.toHexString(digest[i2] & 255));
                }
            }
            String stringBuffer2 = stringBuffer.toString();
            l.a((Object) stringBuffer2, "");
            if (stringBuffer2 != null) {
                String upperCase = stringBuffer2.toUpperCase();
                l.a((Object) upperCase, "");
                return upperCase;
            }
            throw new w("null cannot be cast to non-null type");
        } catch (Exception e2) {
            e2.printStackTrace();
            a.a().a("share_sdk_get_pkg_sign_failed").a("err_msg", e2.getMessage()).a("err_msg_stack", Log.getStackTraceString(e2)).b();
            return "";
        }
    }
}
