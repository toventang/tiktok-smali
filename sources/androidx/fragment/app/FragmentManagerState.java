package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator<FragmentManagerState>() {
        /* class androidx.fragment.app.FragmentManagerState.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1029);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FragmentManagerState[] newArray(int i2) {
            return new FragmentManagerState[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public FragmentState[] f2885a;

    /* renamed from: b  reason: collision with root package name */
    int[] f2886b;

    /* renamed from: c  reason: collision with root package name */
    BackStackState[] f2887c;

    /* renamed from: d  reason: collision with root package name */
    int f2888d = -1;

    /* renamed from: e  reason: collision with root package name */
    int f2889e;

    public final int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
    }

    static {
        Covode.recordClassIndex(1028);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f2885a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f2886b = parcel.createIntArray();
        this.f2887c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f2888d = parcel.readInt();
        this.f2889e = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedArray(this.f2885a, i2);
        parcel.writeIntArray(this.f2886b);
        parcel.writeTypedArray(this.f2887c, i2);
        parcel.writeInt(this.f2888d);
        parcel.writeInt(this.f2889e);
    }
}
