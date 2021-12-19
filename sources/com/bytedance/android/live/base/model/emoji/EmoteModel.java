package com.bytedance.android.live.base.model.emoji;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class EmoteModel extends a implements Parcelable {
    public static final Parcelable.Creator<EmoteModel> CREATOR = new Parcelable.Creator<EmoteModel>() {
        /* class com.bytedance.android.live.base.model.emoji.EmoteModel.AnonymousClass1 */

        static {
            Covode.recordClassIndex(3593);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EmoteModel[] newArray(int i2) {
            return new EmoteModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EmoteModel createFromParcel(Parcel parcel) {
            return new EmoteModel(parcel);
        }
    };
    @c(a = "emote_id")

    /* renamed from: g  reason: collision with root package name */
    public String f7390g;
    @c(a = "image")

    /* renamed from: h  reason: collision with root package name */
    public ImageModel f7391h;
    @c(a = "audit_status")

    /* renamed from: i  reason: collision with root package name */
    public int f7392i;
    @c(a = "uuid")

    /* renamed from: j  reason: collision with root package name */
    public String f7393j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7394k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7395l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f7396m;

    public int describeContents() {
        return 0;
    }

    public EmoteModel() {
    }

    static {
        Covode.recordClassIndex(3592);
    }

    protected EmoteModel(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.f7390g = parcel.readString();
        this.f7391h = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.f7392i = parcel.readInt();
        this.f7393j = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f7394k = z;
        this.f7395l = parcel.readByte() == 0 ? false : z2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f7390g);
        parcel.writeParcelable(this.f7391h, i2);
        parcel.writeInt(this.f7392i);
        parcel.writeString(this.f7393j);
        parcel.writeByte(this.f7394k ? (byte) 1 : 0);
        parcel.writeByte(this.f7395l ? (byte) 1 : 0);
    }
}
