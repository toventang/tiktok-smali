package com.ss.android.ugc.aweme.infosticker;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Objects;

public final class InfoStickerCategoryParams implements Parcelable, Serializable {
    public static final a CREATOR = new a((byte) 0);
    @c(a = "info_sticker_category")
    private LinkedHashMap<String, String> infoStickerCategoryMap;

    static {
        Covode.recordClassIndex(67092);
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable.Creator<InfoStickerCategoryParams> {
        static {
            Covode.recordClassIndex(67093);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InfoStickerCategoryParams[] newArray(int i2) {
            return new InfoStickerCategoryParams[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InfoStickerCategoryParams createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new InfoStickerCategoryParams(parcel);
        }
    }

    public final LinkedHashMap<String, String> getInfoStickerCategoryMap() {
        return this.infoStickerCategoryMap;
    }

    public InfoStickerCategoryParams() {
        this.infoStickerCategoryMap = new LinkedHashMap<>();
    }

    public final void setInfoStickerCategoryMap(LinkedHashMap<String, String> linkedHashMap) {
        l.d(linkedHashMap, "");
        this.infoStickerCategoryMap = linkedHashMap;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InfoStickerCategoryParams(Parcel parcel) {
        this();
        l.d(parcel, "");
        Serializable readSerializable = parcel.readSerializable();
        Objects.requireNonNull(readSerializable, "null cannot be cast to non-null type kotlin.collections.LinkedHashMap<kotlin.String, kotlin.String> /* = java.util.LinkedHashMap<kotlin.String, kotlin.String> */");
        this.infoStickerCategoryMap = (LinkedHashMap) readSerializable;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeSerializable(this.infoStickerCategoryMap);
    }
}
