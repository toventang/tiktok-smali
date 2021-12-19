package androidx.core.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class e {
    static {
        Covode.recordClassIndex(730);
    }

    static class a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* renamed from: a  reason: collision with root package name */
        private final f<T> f2295a;

        static {
            Covode.recordClassIndex(731);
        }

        a(f<T> fVar) {
            this.f2295a = fVar;
        }

        @Override // android.os.Parcelable.Creator
        public final T createFromParcel(Parcel parcel) {
            return this.f2295a.a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final T[] newArray(int i2) {
            return this.f2295a.a(i2);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f2295a.a(parcel, classLoader);
        }
    }

    public static <T> Parcelable.Creator<T> a(f<T> fVar) {
        return new a(fVar);
    }
}
