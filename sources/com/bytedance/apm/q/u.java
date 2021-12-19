package com.bytedance.apm.q;

import com.bytedance.covode.number.Covode;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public final class u<E extends Comparable> {

    /* renamed from: a  reason: collision with root package name */
    private PriorityQueue<E> f25281a;

    /* renamed from: b  reason: collision with root package name */
    private int f25282b;

    static {
        Covode.recordClassIndex(14721);
    }

    public final List<E> a() {
        ArrayList arrayList = new ArrayList(this.f25281a);
        Collections.sort(arrayList);
        return arrayList;
    }

    public u(int i2) {
        if (i2 > 0) {
            this.f25282b = i2;
            this.f25281a = new PriorityQueue<>(i2, new Comparator<E>() {
                /* class com.bytedance.apm.q.u.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14722);
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((Comparable) obj).compareTo(obj2);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(E e2) {
        if (this.f25281a.size() < this.f25282b) {
            this.f25281a.add(e2);
        } else if (e2.compareTo(this.f25281a.peek()) > 0) {
            this.f25281a.poll();
            this.f25281a.add(e2);
        }
    }
}
