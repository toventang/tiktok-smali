package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class h<E> implements Iterable<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ boolean f155240e = true;

    /* renamed from: a  reason: collision with root package name */
    public final List<E> f155241a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f155242b;

    /* renamed from: c  reason: collision with root package name */
    public int f155243c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f155244d;

    class a implements i<E> {

        /* renamed from: b  reason: collision with root package name */
        private int f155246b;

        /* renamed from: c  reason: collision with root package name */
        private int f155247c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f155248d;

        static {
            Covode.recordClassIndex(103311);
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        private void a() {
            if (!this.f155248d) {
                this.f155248d = true;
                h.this.a();
            }
        }

        public final boolean hasNext() {
            int i2 = this.f155247c;
            while (i2 < this.f155246b && h.this.a(i2) == null) {
                i2++;
            }
            if (i2 < this.f155246b) {
                return true;
            }
            a();
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            while (true) {
                int i2 = this.f155247c;
                if (i2 >= this.f155246b || h.this.a(i2) != null) {
                    int i3 = this.f155247c;
                } else {
                    this.f155247c++;
                }
            }
            int i32 = this.f155247c;
            if (i32 < this.f155246b) {
                h hVar = h.this;
                this.f155247c = i32 + 1;
                return (E) hVar.a(i32);
            }
            a();
            throw new NoSuchElementException();
        }

        private a() {
            h.this.f155242b++;
            this.f155246b = h.this.f155241a.size();
        }

        /* synthetic */ a(h hVar, byte b2) {
            this();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return new a(this, (byte) 0);
    }

    static {
        Covode.recordClassIndex(103310);
    }

    private void b() {
        if (f155240e || this.f155242b == 0) {
            for (int size = this.f155241a.size() - 1; size >= 0; size--) {
                if (this.f155241a.get(size) == null) {
                    this.f155241a.remove(size);
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public final void a() {
        int i2 = this.f155242b - 1;
        this.f155242b = i2;
        if (!f155240e && i2 < 0) {
            throw new AssertionError();
        } else if (i2 <= 0 && this.f155244d) {
            this.f155244d = false;
            b();
        }
    }

    public final E a(int i2) {
        return this.f155241a.get(i2);
    }

    public final boolean a(E e2) {
        if (e2 == null || this.f155241a.contains(e2)) {
            return false;
        }
        boolean add = this.f155241a.add(e2);
        if (f155240e || add) {
            this.f155243c++;
            return true;
        }
        throw new AssertionError();
    }
}
