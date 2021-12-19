package com.bytedance.p.b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static long f41750a = 600000;

    /* renamed from: b  reason: collision with root package name */
    public static int f41751b = 10;

    /* renamed from: c  reason: collision with root package name */
    public static int f41752c = 3;

    /* renamed from: d  reason: collision with root package name */
    public static LinkedBlockingQueue<a> f41753d = new LinkedBlockingQueue<>(f41751b);

    static {
        Covode.recordClassIndex(25547);
    }

    public static String a(a aVar) {
        LinkedBlockingQueue<a> linkedBlockingQueue = f41753d;
        if (linkedBlockingQueue == null || linkedBlockingQueue.isEmpty()) {
            return aVar.f41748a;
        }
        StringBuilder sb = new StringBuilder(aVar.f41748a);
        ArrayList arrayList = new ArrayList();
        Iterator<a> it = f41753d.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next != null) {
                arrayList.add(next);
            }
        }
        Collections.sort(arrayList);
        int min = Math.min(f41752c, arrayList.size());
        for (int i2 = 0; i2 < min - 1; i2++) {
            if (arrayList.get(i2) != null) {
                sb.append("\n").append(((a) arrayList.get(i2)).f41748a);
            }
        }
        return sb.toString();
    }
}
