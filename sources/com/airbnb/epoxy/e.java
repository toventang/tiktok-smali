package com.airbnb.epoxy;

import androidx.c.d;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e implements Iterable<u> {

    /* renamed from: a  reason: collision with root package name */
    public final d<u> f5038a = new d<>();

    static {
        Covode.recordClassIndex(2124);
    }

    /* access modifiers changed from: package-private */
    public class a implements Iterator<u> {

        /* renamed from: b  reason: collision with root package name */
        private int f5040b;

        static {
            Covode.recordClassIndex(2125);
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final boolean hasNext() {
            if (this.f5040b < e.this.f5038a.b()) {
                return true;
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final /* synthetic */ u next() {
            if (hasNext()) {
                d<u> dVar = e.this.f5038a;
                int i2 = this.f5040b;
                this.f5040b = i2 + 1;
                return dVar.c(i2);
            }
            throw new NoSuchElementException();
        }

        private a() {
        }

        /* synthetic */ a(e eVar, byte b2) {
            this();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<u> iterator() {
        return new a(this, (byte) 0);
    }
}
