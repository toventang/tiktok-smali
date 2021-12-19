package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new Parcelable.Creator<ParcelImpl>() {
        /* class androidx.versionedparcelable.ParcelImpl.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1710);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ParcelImpl[] newArray(int i2) {
            return new ParcelImpl[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final c f4417a;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(1709);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f4417a = new b(parcel).i();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        new b(parcel).b(this.f4417a);
    }
}
