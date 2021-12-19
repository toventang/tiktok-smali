package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new Parcelable.ClassLoaderCreator<AbsSavedState>() {
        /* class androidx.customview.view.AbsSavedState.AnonymousClass2 */

        static {
            Covode.recordClassIndex(916);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            return new AbsSavedState[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }

        private static AbsSavedState a(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f2666c;
            }
            throw new IllegalStateException("superState must be null");
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static final AbsSavedState f2666c = new AbsSavedState() {
        /* class androidx.customview.view.AbsSavedState.AnonymousClass1 */

        static {
            Covode.recordClassIndex(915);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public final Parcelable f2667d;

    public int describeContents() {
        return 0;
    }

    private AbsSavedState() {
    }

    static {
        Covode.recordClassIndex(914);
    }

    /* synthetic */ AbsSavedState(byte b2) {
        this();
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2667d = parcelable == f2666c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f2667d, i2);
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2667d = readParcelable == null ? f2666c : readParcelable;
    }
}
