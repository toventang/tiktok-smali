package h.f.b;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* access modifiers changed from: package-private */
public final class a<T> implements h.f.b.a.a, Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f158709a;

    /* renamed from: b  reason: collision with root package name */
    private int f158710b;

    static {
        Covode.recordClassIndex(105199);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        if (this.f158710b < this.f158709a.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f158709a;
            int i2 = this.f158710b;
            this.f158710b = i2 + 1;
            return tArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f158710b--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public a(T[] tArr) {
        l.d(tArr, "");
        this.f158709a = tArr;
    }
}
