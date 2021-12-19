package com.bytedance.io.prefetcher;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<Pair<Long, Long>> f38934a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<Long> f38935b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Long, ArrayList<Boolean>> f38936c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public String f38937d;

    static {
        Covode.recordClassIndex(23851);
    }

    public static a[] a(File file, String str) {
        int i2;
        File file2 = new File(file, "base.vdex");
        File file3 = new File(file, "base.odex");
        File file4 = new File(file, "base.art");
        if (file3.exists()) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        if (file4.exists()) {
            i2++;
        }
        if (file2.exists()) {
            i2++;
        }
        a[] aVarArr = new a[i2];
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            aVarArr[i3] = new a();
        }
        aVarArr[0].f38937d = str;
        if (file3.exists()) {
            aVarArr[1].f38937d = file3.getAbsolutePath();
            if (System.currentTimeMillis() - file3.lastModified() < 5000) {
                z = true;
            }
        }
        if (file4.exists()) {
            aVarArr[2].f38937d = file4.getAbsolutePath();
            if (System.currentTimeMillis() - file4.lastModified() < 5000) {
                z = true;
            }
        }
        if (file2.exists()) {
            aVarArr[i2 - 1].f38937d = file2.getAbsolutePath();
            if (System.currentTimeMillis() - file2.lastModified() < 5000) {
                return null;
            }
        }
        if (z) {
            return null;
        }
        return aVarArr;
    }
}
