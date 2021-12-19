package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public final class a<E> {

    /* renamed from: a  reason: collision with root package name */
    private List<E> f150871a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f150872b = false;

    /* renamed from: c  reason: collision with root package name */
    private List<E> f150873c = new ArrayList();

    static {
        Covode.recordClassIndex(99254);
    }

    public final synchronized void a() {
        MethodCollector.i(2580);
        this.f150872b = true;
        this.f150871a.clear();
        MethodCollector.o(2580);
    }

    public final synchronized boolean b() {
        boolean isEmpty;
        MethodCollector.i(2585);
        isEmpty = this.f150871a.isEmpty();
        MethodCollector.o(2585);
        return isEmpty;
    }

    public final synchronized List<E> c() {
        List<E> list;
        MethodCollector.i(2588);
        if (this.f150872b) {
            this.f150873c = new ArrayList(this.f150871a.size());
            for (E e2 : this.f150871a) {
                this.f150873c.add(e2);
            }
            this.f150872b = false;
        }
        list = this.f150873c;
        MethodCollector.o(2588);
        return list;
    }

    public final synchronized boolean a(E e2) {
        MethodCollector.i(2577);
        if (this.f150871a.contains(e2)) {
            MethodCollector.o(2577);
            return false;
        }
        this.f150872b = true;
        boolean add = this.f150871a.add(e2);
        MethodCollector.o(2577);
        return add;
    }

    public final synchronized boolean b(E e2) {
        boolean remove;
        MethodCollector.i(2579);
        this.f150872b = true;
        remove = this.f150871a.remove(e2);
        MethodCollector.o(2579);
        return remove;
    }
}
