package com.ss.android.ugc.aweme.sticker.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class DuetStickerUserStruct implements Parcelable {
    public static final Parcelable.Creator<DuetStickerUserStruct> CREATOR = new a();
    @c(a = "nick_name")

    /* renamed from: a  reason: collision with root package name */
    public final String f134784a;
    @c(a = "user_name")

    /* renamed from: b  reason: collision with root package name */
    public final String f134785b;
    @c(a = "avatar_url")

    /* renamed from: c  reason: collision with root package name */
    public final UrlModel f134786c;
    @c(a = "sec_uid")

    /* renamed from: d  reason: collision with root package name */
    public final String f134787d;
    @c(a = "uid")

    /* renamed from: e  reason: collision with root package name */
    public final String f134788e;

    static {
        Covode.recordClassIndex(88097);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetStickerUserStruct)) {
            return false;
        }
        DuetStickerUserStruct duetStickerUserStruct = (DuetStickerUserStruct) obj;
        return l.a(this.f134784a, duetStickerUserStruct.f134784a) && l.a(this.f134785b, duetStickerUserStruct.f134785b) && l.a(this.f134786c, duetStickerUserStruct.f134786c) && l.a(this.f134787d, duetStickerUserStruct.f134787d) && l.a(this.f134788e, duetStickerUserStruct.f134788e);
    }

    public final int hashCode() {
        String str = this.f134784a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f134785b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f134786c;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str3 = this.f134787d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f134788e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "DuetStickerUserStruct(nickName=" + this.f134784a + ", userName=" + this.f134785b + ", avatarUrl=" + this.f134786c + ", secUid=" + this.f134787d + ", uid=" + this.f134788e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f134784a);
        parcel.writeString(this.f134785b);
        parcel.writeSerializable(this.f134786c);
        parcel.writeString(this.f134787d);
        parcel.writeString(this.f134788e);
    }

    public static class a implements Parcelable.Creator<DuetStickerUserStruct> {
        static {
            Covode.recordClassIndex(88098);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DuetStickerUserStruct[] newArray(int i2) {
            return new DuetStickerUserStruct[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DuetStickerUserStruct createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new DuetStickerUserStruct(parcel.readString(), parcel.readString(), (UrlModel) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }
    }

    public final User a() {
        User user = new User();
        user.setNickname(this.f134784a);
        user.setUniqueId(this.f134785b);
        user.setAvatarThumb(this.f134786c);
        user.setSecUid(this.f134787d);
        user.setUid(this.f134788e);
        return user;
    }

    public DuetStickerUserStruct(String str, String str2, UrlModel urlModel, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(urlModel, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f134784a = str;
        this.f134785b = str2;
        this.f134786c = urlModel;
        this.f134787d = str3;
        this.f134788e = str4;
    }
}
