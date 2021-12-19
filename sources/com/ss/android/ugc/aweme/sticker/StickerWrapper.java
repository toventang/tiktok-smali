package com.ss.android.ugc.aweme.sticker;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public class StickerWrapper implements Parcelable {
    public static final Parcelable.Creator<StickerWrapper> CREATOR = new Parcelable.Creator<StickerWrapper>() {
        /* class com.ss.android.ugc.aweme.sticker.StickerWrapper.AnonymousClass1 */

        static {
            Covode.recordClassIndex(88034);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StickerWrapper[] newArray(int i2) {
            return new StickerWrapper[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StickerWrapper createFromParcel(Parcel parcel) {
            return new StickerWrapper(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public Effect f134687a;

    /* renamed from: b  reason: collision with root package name */
    public String f134688b;

    /* renamed from: c  reason: collision with root package name */
    public int f134689c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f134690d;

    /* renamed from: e  reason: collision with root package name */
    public int f134691e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f134692f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f134693g;

    public int describeContents() {
        return 0;
    }

    public StickerWrapper() {
    }

    public int hashCode() {
        return super.hashCode();
    }

    static {
        Covode.recordClassIndex(88033);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f134687a.equals(((StickerWrapper) obj).f134687a);
    }

    protected StickerWrapper(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f134687a = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.f134688b = parcel.readString();
        this.f134689c = parcel.readInt();
        boolean z3 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f134690d = z;
        this.f134691e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f134692f = z2;
        this.f134693g = parcel.readByte() == 0 ? false : z3;
    }

    public StickerWrapper(Effect effect, String str) {
        this.f134687a = effect;
        this.f134688b = str;
        this.f134689c = 3;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f134687a, i2);
        parcel.writeString(this.f134688b);
        parcel.writeInt(this.f134689c);
        parcel.writeByte(this.f134690d ? (byte) 1 : 0);
        parcel.writeInt(this.f134691e);
        parcel.writeByte(this.f134692f ? (byte) 1 : 0);
        parcel.writeByte(this.f134693g ? (byte) 1 : 0);
    }
}
