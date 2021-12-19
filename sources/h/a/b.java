package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.a.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class b<T> implements a, Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    private aq f158633a = aq.NotReady;

    /* renamed from: b  reason: collision with root package name */
    private T f158634b;

    static {
        Covode.recordClassIndex(105055);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f158633a = aq.Done;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f158633a = aq.NotReady;
            return this.f158634b;
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        if (this.f158633a != aq.Failed) {
            int i2 = c.f158635a[this.f158633a.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
            this.f158633a = aq.Failed;
            a();
            if (this.f158633a == aq.Ready) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* access modifiers changed from: protected */
    public final void a(T t) {
        this.f158634b = t;
        this.f158633a = aq.Ready;
    }
}
