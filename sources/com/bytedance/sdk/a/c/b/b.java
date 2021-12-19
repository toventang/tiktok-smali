package com.bytedance.sdk.a.c.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(26463);
    }

    public static String a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(list.get(i2));
        }
        return sb.toString();
    }

    public static List<String> a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList();
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                for (Signature signature : signatureArr) {
                    arrayList.add(a.a(signature.toByteArray()));
                }
                return arrayList;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
