package com.bytedance.android.livesdk.ah;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.ah.a.e;
import com.bytedance.android.livesdk.ah.c.e;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final Map<String, Integer> f13724a;

    static {
        Covode.recordClassIndex(7633);
        HashMap hashMap = new HashMap();
        f13724a = hashMap;
        hashMap.put("android.permission.CAMERA", Integer.valueOf((int) R.string.gxc));
        hashMap.put("android.permission.RECORD_AUDIO", Integer.valueOf((int) R.string.gxh));
        Integer valueOf = Integer.valueOf((int) R.string.gxg);
        hashMap.put("android.permission.READ_EXTERNAL_STORAGE", valueOf);
        hashMap.put("android.permission.WRITE_EXTERNAL_STORAGE", valueOf);
    }

    public static boolean a(Context context, String... strArr) {
        if (strArr == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 23 || e.a.f13723a.a()) {
            return e.a.f13706a.a(context, strArr);
        }
        return c.a(context, strArr);
    }

    public static String[] a(Activity activity, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!a((Context) activity, str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
