package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class VEVideoStableFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoStableFilterParam> CREATOR = new Parcelable.Creator<VEVideoStableFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEVideoStableFilterParam.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99508);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVideoStableFilterParam[] newArray(int i2) {
            return new VEVideoStableFilterParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVideoStableFilterParam createFromParcel(Parcel parcel) {
            return new VEVideoStableFilterParam(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f151312a;

    /* renamed from: b  reason: collision with root package name */
    public String f151313b;

    /* renamed from: c  reason: collision with root package name */
    public int f151314c;

    /* renamed from: d  reason: collision with root package name */
    public int f151315d;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99507);
    }

    public VEVideoStableFilterParam() {
        this.filterName = "video stable filter";
        this.filterType = 27;
        this.filterDurationType = 1;
        this.f151312a = "";
        this.f151313b = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEVideoStableFilterParam{ptsMatrix=" + this.f151312a + ", videoStabMatrix='" + this.f151313b + '\'' + ", filterType=" + this.filterType + '\'' + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '\'' + ", width=" + this.f151314c + '\'' + ", height=" + this.f151315d + '\'' + '}';
    }

    protected VEVideoStableFilterParam(Parcel parcel) {
        super(parcel);
        this.f151312a = parcel.readString();
        this.f151313b = parcel.readString();
        this.f151314c = parcel.readInt();
        this.f151315d = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f151312a);
        parcel.writeString(this.f151313b);
        parcel.writeInt(this.f151314c);
        parcel.writeInt(this.f151315d);
    }
}
