package com.ss.android.account.token;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.b;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.ss.android.d;
import com.ss.android.token.c;
import java.util.ArrayList;
import java.util.List;

public class TTTokenUtils {
    static {
        Covode.recordClassIndex(36194);
    }

    public static void addTokenInterceptor() {
        RetrofitUtils.a(new TTTokenInterceptor());
        d.a("TTTokenUtils", "call addTokenInterceptor");
    }

    public static List<c> a(List<b> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar : list) {
            if (bVar != null && !TextUtils.isEmpty(bVar.f42471a) && !TextUtils.isEmpty(bVar.f42472b)) {
                arrayList.add(new c(bVar.f42471a, bVar.f42472b));
            }
        }
        return arrayList;
    }
}
