package androidx.constraintlayout.a;

import com.bytedance.covode.number.Covode;

final class g {

    /* access modifiers changed from: package-private */
    public interface a<T> {
        static {
            Covode.recordClassIndex(610);
        }

        T a();

        void a(T[] tArr, int i2);

        boolean a(T t);
    }

    static {
        Covode.recordClassIndex(609);
    }

    /* access modifiers changed from: package-private */
    public static class b<T> implements a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Object[] f2012a = new Object[256];

        /* renamed from: b  reason: collision with root package name */
        private int f2013b;

        static {
            Covode.recordClassIndex(611);
        }

        b() {
        }

        @Override // androidx.constraintlayout.a.g.a
        public final T a() {
            int i2 = this.f2013b;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            Object[] objArr = this.f2012a;
            T t = (T) objArr[i3];
            objArr[i3] = null;
            this.f2013b = i2 - 1;
            return t;
        }

        @Override // androidx.constraintlayout.a.g.a
        public final boolean a(T t) {
            int i2 = this.f2013b;
            Object[] objArr = this.f2012a;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = t;
            this.f2013b = i2 + 1;
            return true;
        }

        @Override // androidx.constraintlayout.a.g.a
        public final void a(T[] tArr, int i2) {
            if (i2 > tArr.length) {
                i2 = tArr.length;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                T t = tArr[i3];
                int i4 = this.f2013b;
                Object[] objArr = this.f2012a;
                if (i4 < objArr.length) {
                    objArr[i4] = t;
                    this.f2013b = i4 + 1;
                }
            }
        }
    }
}
