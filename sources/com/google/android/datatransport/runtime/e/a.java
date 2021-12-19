package com.google.android.datatransport.runtime.e;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.d;
import java.util.EnumMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<d> f49445a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static EnumMap<d, Integer> f49446b;

    static {
        Covode.recordClassIndex(30940);
        EnumMap<d, Integer> enumMap = new EnumMap<>(d.class);
        f49446b = enumMap;
        enumMap.put(d.DEFAULT, (Integer) 0);
        f49446b.put(d.VERY_LOW, (Integer) 1);
        f49446b.put(d.HIGHEST, (Integer) 2);
        for (d dVar : f49446b.keySet()) {
            f49445a.append(f49446b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f49446b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value ".concat(String.valueOf(dVar)));
    }

    public static d a(int i2) {
        d dVar = f49445a.get(i2);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value ".concat(String.valueOf(i2)));
    }
}
