package com.ss.android.ugc.aweme.xsearch;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static int f145150a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static final d f145151b = new d();

    /* renamed from: c  reason: collision with root package name */
    private static int f145152c;

    /* renamed from: d  reason: collision with root package name */
    private static final SparseArray<c> f145153d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    private static final SparseArray<List<Integer>> f145154e = new SparseArray<>();

    private d() {
    }

    static {
        Covode.recordClassIndex(94916);
    }

    public final synchronized c b(int i2) {
        c cVar;
        MethodCollector.i(574);
        cVar = f145153d.get(i2);
        MethodCollector.o(574);
        return cVar;
    }

    public final synchronized int a(c cVar) {
        MethodCollector.i(569);
        l.d(cVar, "");
        if (f145150a == -1) {
            MethodCollector.o(569);
            return -1;
        }
        int i2 = f145152c;
        f145152c = i2 + 1;
        f145153d.put(i2, cVar);
        cVar.f145140a = Integer.valueOf(i2);
        SparseArray<List<Integer>> sparseArray = f145154e;
        List<Integer> list = sparseArray.get(f145150a);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(Integer.valueOf(i2));
        sparseArray.put(f145150a, list);
        MethodCollector.o(569);
        return i2;
    }

    public final synchronized boolean a(int i2) {
        MethodCollector.i(572);
        if (f145150a == -1) {
            MethodCollector.o(572);
            return false;
        }
        SparseArray<c> sparseArray = f145153d;
        c cVar = sparseArray.get(i2);
        if (cVar == null) {
            MethodCollector.o(572);
            return false;
        }
        cVar.f145140a = null;
        sparseArray.remove(i2);
        SparseArray<List<Integer>> sparseArray2 = f145154e;
        List<Integer> list = sparseArray2.get(f145150a);
        if (list != null) {
            list.remove(Integer.valueOf(i2));
            sparseArray2.put(f145150a, list);
        }
        MethodCollector.o(572);
        return true;
    }
}
