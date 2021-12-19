package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.c.ag;
import com.google.c.c.ai;
import com.google.c.c.au;
import com.google.c.c.ay;
import java.io.Serializable;

/* access modifiers changed from: package-private */
public class bd<E> extends ag<E> {

    /* renamed from: a  reason: collision with root package name */
    static final bd<Object> f53992a = new bd<>(new ay());

    /* renamed from: b  reason: collision with root package name */
    final transient ay<E> f53993b;

    /* renamed from: c  reason: collision with root package name */
    private final transient int f53994c;

    /* renamed from: d  reason: collision with root package name */
    private transient ai<E> f53995d;

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public final boolean a() {
        return false;
    }

    @Override // com.google.c.c.au
    public int size() {
        return this.f53994c;
    }

    /* access modifiers changed from: package-private */
    public final class a extends ai.b<E> {
        static {
            Covode.recordClassIndex(33466);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final boolean a() {
            return true;
        }

        public final int size() {
            return bd.this.f53993b.f53959c;
        }

        private a() {
        }

        @Override // com.google.c.c.x
        public final boolean contains(Object obj) {
            return bd.this.contains(obj);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.ai.b
        public final E a(int i2) {
            return bd.this.f53993b.b(i2);
        }

        /* synthetic */ a(bd bdVar, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ag, com.google.c.c.x
    public Object writeReplace() {
        return new b(this);
    }

    @Override // com.google.c.c.ag, com.google.c.c.ag, com.google.c.c.au
    public ai<E> elementSet() {
        ai<E> aiVar = this.f53995d;
        if (aiVar != null) {
            return aiVar;
        }
        a aVar = new a(this, (byte) 0);
        this.f53995d = aVar;
        return aVar;
    }

    static class b implements Serializable {
        private static final long serialVersionUID = 0;
        final int[] counts;
        final Object[] elements;

        static {
            Covode.recordClassIndex(33467);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.c.ag$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            ag.a aVar = new ag.a(this.elements.length);
            int i2 = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i2 >= objArr.length) {
                    return aVar.a();
                }
                aVar.a(objArr[i2], this.counts[i2]);
                i2++;
            }
        }

        b(au<?> auVar) {
            int size = auVar.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i2 = 0;
            for (au.a<?> aVar : auVar.entrySet()) {
                this.elements[i2] = aVar.a();
                this.counts[i2] = aVar.b();
                i2++;
            }
        }
    }

    static {
        Covode.recordClassIndex(33465);
    }

    @Override // com.google.c.c.au
    public int count(Object obj) {
        return this.f53993b.b(obj);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ag
    public final au.a<E> a(int i2) {
        ay<E> ayVar = this.f53993b;
        k.a(i2, ayVar.f53959c);
        return new ay.a(i2);
    }

    bd(ay<E> ayVar) {
        this.f53993b = ayVar;
        long j2 = 0;
        for (int i2 = 0; i2 < ayVar.f53959c; i2++) {
            j2 += (long) ayVar.c(i2);
        }
        this.f53994c = com.google.c.f.a.a(j2);
    }
}
