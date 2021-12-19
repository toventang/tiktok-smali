package com.ss.android.ugc.aweme.watermark;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.festival.m;
import com.ss.android.ugc.aweme.shortvideo.festival.o;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class e {
    static {
        Covode.recordClassIndex(94687);
    }

    public static String[] a(c[] cVarArr, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < cVarArr.length; i2++) {
            String path = new File(str, str2 + i2 + ".png").getPath();
            if (cVarArr[i2].a(path)) {
                arrayList.add(path);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static c[] a(int i2, int i3, String str, boolean z, boolean z2, boolean z3, d dVar) {
        boolean z4;
        List<m> a2 = o.a(dVar.f144782b);
        if (h.a(a2)) {
            return b(i2, i3, str, z, z2, z3, dVar);
        }
        String concat = "@".concat(String.valueOf(str));
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < a2.size(); i4++) {
            c cVar = new c();
            String str2 = a2.get(i4).f128509b;
            if (!z2 || c.f115630i.a() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            cVar.a(i2, i3, concat, str2, z, z4, z3, dVar);
            arrayList.add(cVar);
        }
        return (c[]) arrayList.toArray(new c[arrayList.size()]);
    }

    private static c[] b(int i2, int i3, String str, boolean z, boolean z2, boolean z3, d dVar) {
        boolean z4;
        c cVar;
        MethodCollector.i(11067);
        TypedArray obtainTypedArray = c.f115622a.getResources().obtainTypedArray(R.array.b1);
        int length = obtainTypedArray.length();
        int[] iArr = new int[length];
        ArrayList arrayList = new ArrayList();
        String concat = "@".concat(String.valueOf(str));
        for (int i4 = 0; i4 < length; i4++) {
            c cVar2 = new c();
            iArr[i4] = obtainTypedArray.getResourceId(i4, 0);
            int i5 = iArr[i4];
            if (!z2 || c.f115630i.a() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            Bitmap decodeResource = BitmapFactory.decodeResource(c.f115622a.getResources(), i5, null);
            if (!z4) {
                cVar = cVar2;
                cVar2.a(i2, i3, concat, decodeResource, z, z3, dVar);
            } else {
                cVar = cVar2;
                concat = concat;
                cVar.a(i2, i3, concat, decodeResource, z, z3);
            }
            arrayList.add(cVar);
        }
        obtainTypedArray.recycle();
        c[] cVarArr = (c[]) arrayList.toArray(new c[arrayList.size()]);
        MethodCollector.o(11067);
        return cVarArr;
    }
}
