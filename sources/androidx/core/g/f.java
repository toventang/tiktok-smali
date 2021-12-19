package androidx.core.g;

import com.bytedance.covode.number.Covode;

public final class f {

    public interface a<T> {
        static {
            Covode.recordClassIndex(773);
        }

        T acquire();

        boolean release(T t);
    }

    static {
        Covode.recordClassIndex(772);
    }

    public static class c<T> extends b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f2401a = new Object();

        static {
            Covode.recordClassIndex(775);
        }

        @Override // androidx.core.g.f.b, androidx.core.g.f.a
        public T acquire() {
            T t;
            synchronized (this.f2401a) {
                t = (T) super.acquire();
            }
            return t;
        }

        public c(int i2) {
            super(i2);
        }

        @Override // androidx.core.g.f.b, androidx.core.g.f.a
        public boolean release(T t) {
            boolean release;
            synchronized (this.f2401a) {
                release = super.release(t);
            }
            return release;
        }
    }

    public static class b<T> implements a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Object[] f2399a;

        /* renamed from: b  reason: collision with root package name */
        private int f2400b;

        static {
            Covode.recordClassIndex(774);
        }

        @Override // androidx.core.g.f.a
        public T acquire() {
            int i2 = this.f2400b;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            Object[] objArr = this.f2399a;
            T t = (T) objArr[i3];
            objArr[i3] = null;
            this.f2400b = i2 - 1;
            return t;
        }

        public b(int i2) {
            if (i2 > 0) {
                this.f2399a = new Object[i2];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        @Override // androidx.core.g.f.a
        public boolean release(T t) {
            int i2 = 0;
            while (true) {
                int i3 = this.f2400b;
                if (i2 >= i3) {
                    Object[] objArr = this.f2399a;
                    if (i3 >= objArr.length) {
                        return false;
                    }
                    objArr[i3] = t;
                    this.f2400b = i3 + 1;
                    return true;
                } else if (this.f2399a[i2] == t) {
                    throw new IllegalStateException("Already in the pool!");
                } else {
                    i2++;
                }
            }
        }
    }
}
