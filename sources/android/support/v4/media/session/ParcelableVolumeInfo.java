package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() {
        /* class android.support.v4.media.session.ParcelableVolumeInfo.AnonymousClass1 */

        static {
            Covode.recordClassIndex(165);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ParcelableVolumeInfo[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f738a;

    /* renamed from: b  reason: collision with root package name */
    public int f739b;

    /* renamed from: c  reason: collision with root package name */
    public int f740c;

    /* renamed from: d  reason: collision with root package name */
    public int f741d;

    /* renamed from: e  reason: collision with root package name */
    public int f742e;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(164);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f738a = parcel.readInt();
        this.f740c = parcel.readInt();
        this.f741d = parcel.readInt();
        this.f742e = parcel.readInt();
        this.f739b = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f738a);
        parcel.writeInt(this.f740c);
        parcel.writeInt(this.f741d);
        parcel.writeInt(this.f742e);
        parcel.writeInt(this.f739b);
    }

    public ParcelableVolumeInfo(int i2, int i3, int i4, int i5, int i6) {
        this.f738a = i2;
        this.f739b = i3;
        this.f740c = i4;
        this.f741d = i5;
        this.f742e = i6;
    }
}
