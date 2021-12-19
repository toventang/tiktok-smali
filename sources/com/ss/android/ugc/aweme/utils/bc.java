package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public final class bc<E> {

    /* renamed from: a  reason: collision with root package name */
    private List<E> f142663a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f142664b = false;

    /* renamed from: c  reason: collision with root package name */
    private List<E> f142665c = new ArrayList();

    static {
        Covode.recordClassIndex(93328);
    }

    public final synchronized List<E> a() {
        List<E> list;
        MethodCollector.i(407);
        if (this.f142664b) {
            this.f142665c = new ArrayList(this.f142663a.size());
            for (E e2 : this.f142663a) {
                this.f142665c.add(e2);
            }
            this.f142664b = false;
        }
        list = this.f142665c;
        MethodCollector.o(407);
        return list;
    }

    public final synchronized boolean a(E e2) {
        boolean add;
        MethodCollector.i(401);
        this.f142664b = true;
        add = this.f142663a.add(e2);
        MethodCollector.o(401);
        return add;
    }

    public final synchronized boolean b(E e2) {
        boolean remove;
        MethodCollector.i(402);
        this.f142664b = true;
        remove = this.f142663a.remove(e2);
        MethodCollector.o(402);
        return remove;
    }
}
