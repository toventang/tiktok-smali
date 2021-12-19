package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import f.a.e.b.b;
import f.a.e.d.c;
import f.a.t;
import f.a.z;

public final class aa<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    final T[] f157413a;

    static {
        Covode.recordClassIndex(104598);
    }

    static final class a<T> extends c<T> {

        /* renamed from: a  reason: collision with root package name */
        final z<? super T> f157414a;

        /* renamed from: b  reason: collision with root package name */
        final T[] f157415b;

        /* renamed from: c  reason: collision with root package name */
        int f157416c;

        /* renamed from: d  reason: collision with root package name */
        boolean f157417d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f157418e;

        static {
            Covode.recordClassIndex(104599);
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f157418e = true;
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f157418e;
        }

        @Override // f.a.e.c.i
        public final void clear() {
            this.f157416c = this.f157415b.length;
        }

        @Override // f.a.e.c.i
        public final boolean isEmpty() {
            if (this.f157416c == this.f157415b.length) {
                return true;
            }
            return false;
        }

        @Override // f.a.e.c.i
        public final T poll() {
            int i2 = this.f157416c;
            T[] tArr = this.f157415b;
            if (i2 == tArr.length) {
                return null;
            }
            this.f157416c = i2 + 1;
            return (T) b.a((Object) tArr[i2], "The array element is null");
        }

        @Override // f.a.e.c.e
        public final int requestFusion(int i2) {
            if ((i2 & 1) == 0) {
                return 0;
            }
            this.f157417d = true;
            return 1;
        }

        a(z<? super T> zVar, T[] tArr) {
            this.f157414a = zVar;
            this.f157415b = tArr;
        }
    }

    public aa(T[] tArr) {
        this.f157413a = tArr;
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        a aVar = new a(zVar, this.f157413a);
        zVar.onSubscribe(aVar);
        if (!aVar.f157417d) {
            T[] tArr = aVar.f157415b;
            int length = tArr.length;
            for (int i2 = 0; i2 < length && !aVar.isDisposed(); i2++) {
                T t = tArr[i2];
                if (t == null) {
                    aVar.f157414a.onError(new NullPointerException("The " + i2 + "th element is null"));
                    return;
                } else {
                    aVar.f157414a.onNext(t);
                }
            }
            if (!aVar.isDisposed()) {
                aVar.f157414a.onComplete();
            }
        }
    }
}
