package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class InnerEffectExtraConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectExtraConfig> CREATOR = new a();
    private final boolean forceUpdate;

    static {
        Covode.recordClassIndex(55593);
    }

    public InnerEffectExtraConfig() {
        this(false, 1, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.forceUpdate ? 1 : 0);
    }

    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public static class a implements Parcelable.Creator<InnerEffectExtraConfig> {
        static {
            Covode.recordClassIndex(55594);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InnerEffectExtraConfig[] newArray(int i2) {
            return new InnerEffectExtraConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InnerEffectExtraConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new InnerEffectExtraConfig(parcel.readInt() != 0);
        }
    }

    public InnerEffectExtraConfig(boolean z) {
        this.forceUpdate = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InnerEffectExtraConfig(boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z);
    }
}
