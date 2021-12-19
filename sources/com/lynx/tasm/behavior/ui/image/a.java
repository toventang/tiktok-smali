package com.lynx.tasm.behavior.ui.image;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.f;
import com.lynx.tasm.behavior.j;

public class a {
    static {
        Covode.recordClassIndex(35099);
    }

    public static String a(Context context, String str) {
        String a2;
        if ((context instanceof j) && !TextUtils.isEmpty(str)) {
            j a3 = com.lynx.tasm.utils.a.a(context);
            if (a3 == null) {
                LLog.a(6, "ImageUrlRedirectUtils", "redirecting url failed due to no context available");
                return str;
            }
            f fVar = a3.f55894b;
            if (!(fVar == null || (a2 = a(fVar, str, a3.f55904l)) == null)) {
                return b(a3, a2);
            }
        }
        return str;
    }

    private static String b(Context context, String str) {
        if (str.startsWith("res:///")) {
            for (int i2 = 7; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (charAt < '0' || charAt > '9') {
                    int indexOf = str.indexOf(46);
                    if (indexOf < 0) {
                        indexOf = str.length();
                    }
                    return "res:///".concat(String.valueOf(context.getResources().getIdentifier(str.substring(7, indexOf), "drawable", context.getPackageName())));
                }
            }
        }
        return str;
    }

    private static String a(f fVar, String str, String str2) {
        int lastIndexOf;
        TraceEvent.a(0, "Interceptor.shouldRedirectImageUrl");
        String d2 = fVar.d(str);
        TraceEvent.b(0, "Interceptor.shouldRedirectImageUrl");
        if (d2 != null) {
            return d2;
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("./") || TextUtils.isEmpty(str2) || (lastIndexOf = str2.lastIndexOf("/")) <= 0) {
            return null;
        }
        String str3 = str2.substring(0, lastIndexOf) + str.substring(1);
        LLog.a("ImageUrlRedirectUtils", "shouldRedirectImageUrl use local image url:".concat(String.valueOf(str3)));
        if (str3.startsWith("http") || str3.startsWith("file://") || str3.startsWith("content://") || str3.startsWith("res://") || str3.startsWith("data:")) {
            return str3;
        }
        if (str3.startsWith("assets:///")) {
            return str3.replace("assets:///", "asset:///");
        }
        if (str3.startsWith("assets://")) {
            return str3.replace("assets://", "asset:///");
        }
        if (str3.startsWith("asset:///")) {
            return str3;
        }
        return "file://".concat(String.valueOf(str3));
    }

    public static void a(Context context, String str, float f2, float f3, f.a aVar) {
        j a2 = com.lynx.tasm.utils.a.a(context);
        if (a2 == null) {
            LLog.a(6, "ImageUrlRedirectUtils", "load image failed due to no context available");
            return;
        }
        f fVar = a2.f55894b;
        if (fVar != null) {
            fVar.a(a2, null, str, f2, f3, null, aVar);
        } else {
            aVar.a(null, null);
        }
    }
}
