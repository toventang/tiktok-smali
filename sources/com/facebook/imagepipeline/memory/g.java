package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;

public final class g<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final SparseArray<a<T>> f48084a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    a<T> f48085b;

    /* renamed from: c  reason: collision with root package name */
    a<T> f48086c;

    static {
        Covode.recordClassIndex(29052);
    }

    /* access modifiers changed from: package-private */
    public static class a<I> {

        /* renamed from: a  reason: collision with root package name */
        a<I> f48087a;

        /* renamed from: b  reason: collision with root package name */
        int f48088b;

        /* renamed from: c  reason: collision with root package name */
        LinkedList<I> f48089c;

        /* renamed from: d  reason: collision with root package name */
        a<I> f48090d;

        static {
            Covode.recordClassIndex(29053);
        }

        public final String toString() {
            return "LinkedEntry(key: " + this.f48088b + ")";
        }

        private a(int i2, LinkedList<I> linkedList) {
            this.f48087a = null;
            this.f48088b = i2;
            this.f48089c = linkedList;
            this.f48090d = null;
        }

        /* synthetic */ a(int i2, LinkedList linkedList, byte b2) {
            this(i2, linkedList);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public final synchronized T a() {
        MethodCollector.i(14610);
        a<T> aVar = this.f48086c;
        if (aVar == null) {
            MethodCollector.o(14610);
            return null;
        }
        I pollLast = aVar.f48089c.pollLast();
        if (aVar.f48089c.isEmpty()) {
            a(aVar);
            this.f48084a.remove(aVar.f48088b);
        }
        MethodCollector.o(14610);
        return pollLast;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.facebook.imagepipeline.memory.g$a<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: com.facebook.imagepipeline.memory.g$a<T>, com.facebook.imagepipeline.memory.g$a<I> */
    private void b(a<T> aVar) {
        if (this.f48085b != aVar) {
            a(aVar);
            a aVar2 = (a<T>) this.f48085b;
            if (aVar2 == null) {
                this.f48085b = aVar;
                this.f48086c = aVar;
                return;
            }
            aVar.f48090d = aVar2;
            this.f48085b.f48087a = aVar;
            this.f48085b = aVar;
        }
    }

    private synchronized void a(a<T> aVar) {
        MethodCollector.i(14601);
        a aVar2 = (a<I>) aVar.f48087a;
        a aVar3 = (a<I>) aVar.f48090d;
        if (aVar2 != null) {
            aVar2.f48090d = aVar3;
        }
        if (aVar3 != null) {
            aVar3.f48087a = aVar2;
        }
        aVar.f48087a = null;
        aVar.f48090d = null;
        if (aVar == this.f48085b) {
            this.f48085b = aVar3;
        }
        if (aVar == this.f48086c) {
            this.f48086c = aVar2;
        }
        MethodCollector.o(14601);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public final synchronized T a(int i2) {
        MethodCollector.i(14595);
        a<T> aVar = this.f48084a.get(i2);
        if (aVar == null) {
            MethodCollector.o(14595);
            return null;
        }
        I pollFirst = aVar.f48089c.pollFirst();
        b(aVar);
        MethodCollector.o(14595);
        return pollFirst;
    }

    public final synchronized void a(int i2, T t) {
        MethodCollector.i(14600);
        a<T> aVar = this.f48084a.get(i2);
        if (aVar == null) {
            aVar = new a<>(i2, new LinkedList(), (byte) 0);
            this.f48084a.put(i2, aVar);
        }
        aVar.f48089c.addLast(t);
        b(aVar);
        MethodCollector.o(14600);
    }
}
