package com.ss.android.ugc.aweme.question;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;

public final class QuestionInfo implements Parcelable {
    public static final Parcelable.Creator<QuestionInfo> CREATOR = new a();
    @c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public Long f119889a;
    @c(a = "item_id")

    /* renamed from: b  reason: collision with root package name */
    public Long f119890b;
    @c(a = "user_id")

    /* renamed from: c  reason: collision with root package name */
    public Long f119891c;
    @c(a = "username")

    /* renamed from: d  reason: collision with root package name */
    public String f119892d;
    @c(a = "content")

    /* renamed from: e  reason: collision with root package name */
    public String f119893e;
    @c(a = "user_avatar")

    /* renamed from: f  reason: collision with root package name */
    public UrlModel f119894f;
    @c(a = "sec_uid")

    /* renamed from: g  reason: collision with root package name */
    public String f119895g;

    static {
        Covode.recordClassIndex(77897);
    }

    public QuestionInfo() {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionInfo)) {
            return false;
        }
        QuestionInfo questionInfo = (QuestionInfo) obj;
        return l.a(this.f119889a, questionInfo.f119889a) && l.a(this.f119890b, questionInfo.f119890b) && l.a(this.f119891c, questionInfo.f119891c) && l.a(this.f119892d, questionInfo.f119892d) && l.a(this.f119893e, questionInfo.f119893e) && l.a(this.f119894f, questionInfo.f119894f) && l.a(this.f119895g, questionInfo.f119895g);
    }

    public final int hashCode() {
        Long l2 = this.f119889a;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        Long l3 = this.f119890b;
        int hashCode2 = (hashCode + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.f119891c;
        int hashCode3 = (hashCode2 + (l4 != null ? l4.hashCode() : 0)) * 31;
        String str = this.f119892d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f119893e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f119894f;
        int hashCode6 = (hashCode5 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str3 = this.f119895g;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "QuestionInfo(id=" + this.f119889a + ", item_id=" + this.f119890b + ", user_id=" + this.f119891c + ", userName=" + this.f119892d + ", content=" + this.f119893e + ", userAvatar=" + this.f119894f + ", secId=" + this.f119895g + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        Long l2 = this.f119889a;
        if (l2 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        } else {
            parcel.writeInt(0);
        }
        Long l3 = this.f119890b;
        if (l3 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        } else {
            parcel.writeInt(0);
        }
        Long l4 = this.f119891c;
        if (l4 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f119892d);
        parcel.writeString(this.f119893e);
        parcel.writeSerializable(this.f119894f);
        parcel.writeString(this.f119895g);
    }

    public static class a implements Parcelable.Creator<QuestionInfo> {
        static {
            Covode.recordClassIndex(77898);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ QuestionInfo[] newArray(int i2) {
            return new QuestionInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ QuestionInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            Long l2 = null;
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            Long valueOf2 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            if (parcel.readInt() != 0) {
                l2 = Long.valueOf(parcel.readLong());
            }
            return new QuestionInfo(valueOf, valueOf2, l2, parcel.readString(), parcel.readString(), (UrlModel) parcel.readSerializable(), parcel.readString());
        }
    }

    public QuestionInfo(Long l2, Long l3, Long l4, String str, String str2, UrlModel urlModel, String str3) {
        this.f119889a = l2;
        this.f119890b = l3;
        this.f119891c = l4;
        this.f119892d = str;
        this.f119893e = str2;
        this.f119894f = urlModel;
        this.f119895g = str3;
    }
}
