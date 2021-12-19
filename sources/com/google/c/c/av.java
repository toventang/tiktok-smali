package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.i;
import com.google.c.a.k;
import com.google.c.c.au;
import com.google.c.c.bk;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class av {
    static {
        Covode.recordClassIndex(33444);
    }

    static abstract class a<E> implements au.a<E> {
        static {
            Covode.recordClassIndex(33445);
        }

        a() {
        }

        public int hashCode() {
            int hashCode;
            E a2 = a();
            if (a2 == null) {
                hashCode = 0;
            } else {
                hashCode = a2.hashCode();
            }
            return hashCode ^ b();
        }

        public String toString() {
            String valueOf = String.valueOf(a());
            int b2 = b();
            if (b2 == 1) {
                return valueOf;
            }
            return valueOf + " x " + b2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof au.a) {
                au.a aVar = (au.a) obj;
                if (b() != aVar.b() || !i.a(a(), aVar.a())) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    static abstract class b<E> extends bk.a<E> {
        static {
            Covode.recordClassIndex(33446);
        }

        /* access modifiers changed from: package-private */
        public abstract au<E> a();

        b() {
        }

        public void clear() {
            a().clear();
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public int size() {
            return a().entrySet().size();
        }

        public boolean contains(Object obj) {
            return a().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return a().containsAll(collection);
        }

        public boolean remove(Object obj) {
            if (a().remove(obj, Integer.MAX_VALUE) > 0) {
                return true;
            }
            return false;
        }
    }

    static abstract class c<E> extends bk.a<au.a<E>> {
        static {
            Covode.recordClassIndex(33447);
        }

        /* access modifiers changed from: package-private */
        public abstract au<E> a();

        c() {
        }

        public void clear() {
            a().clear();
        }

        public boolean remove(Object obj) {
            if (obj instanceof au.a) {
                au.a aVar = (au.a) obj;
                E e2 = (E) aVar.a();
                int b2 = aVar.b();
                if (b2 != 0) {
                    return a().setCount(e2, b2, 0);
                }
            }
            return false;
        }

        public boolean contains(Object obj) {
            if (obj instanceof au.a) {
                au.a aVar = (au.a) obj;
                if (aVar.b() > 0 && a().count(aVar.a()) == aVar.b()) {
                    return true;
                }
            }
            return false;
        }
    }

    static class d<E> extends a<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        private final E element;

        static {
            Covode.recordClassIndex(33448);
        }

        @Override // com.google.c.c.au.a
        public final E a() {
            return this.element;
        }

        @Override // com.google.c.c.au.a
        public final int b() {
            return this.count;
        }

        d(E e2, int i2) {
            this.element = e2;
            this.count = i2;
            k.a(i2, "count");
        }
    }

    static final class e<E> implements Iterator<E> {

        /* renamed from: a  reason: collision with root package name */
        private final au<E> f53950a;

        /* renamed from: b  reason: collision with root package name */
        private final Iterator<au.a<E>> f53951b;

        /* renamed from: c  reason: collision with root package name */
        private au.a<E> f53952c;

        /* renamed from: d  reason: collision with root package name */
        private int f53953d;

        /* renamed from: e  reason: collision with root package name */
        private int f53954e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f53955f;

        static {
            Covode.recordClassIndex(33449);
        }

        public final boolean hasNext() {
            if (this.f53953d > 0 || this.f53951b.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            if (hasNext()) {
                if (this.f53953d == 0) {
                    au.a<E> next = this.f53951b.next();
                    this.f53952c = next;
                    int b2 = next.b();
                    this.f53953d = b2;
                    this.f53954e = b2;
                }
                this.f53953d--;
                this.f53955f = true;
                return this.f53952c.a();
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            k.b(this.f53955f, "no calls to next() since the last call to remove()");
            if (this.f53954e == 1) {
                this.f53951b.remove();
            } else {
                this.f53950a.remove(this.f53952c.a());
            }
            this.f53954e--;
            this.f53955f = false;
        }

        e(au<E> auVar, Iterator<au.a<E>> it) {
            this.f53950a = auVar;
            this.f53951b = it;
        }
    }

    static boolean a(au<?> auVar, Object obj) {
        if (obj == auVar) {
            return true;
        }
        if (obj instanceof au) {
            au auVar2 = (au) obj;
            if (auVar.size() == auVar2.size() && auVar.entrySet().size() == auVar2.entrySet().size()) {
                for (au.a aVar : auVar2.entrySet()) {
                    if (auVar.count(aVar.a()) != aVar.b()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
