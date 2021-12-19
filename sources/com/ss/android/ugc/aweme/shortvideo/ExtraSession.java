package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ExtraSession implements Parcelable {
    public static final Parcelable.Creator<ExtraSession> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f124733a;

    /* renamed from: b  reason: collision with root package name */
    public String f124734b;

    /* renamed from: c  reason: collision with root package name */
    public String f124735c;

    /* renamed from: d  reason: collision with root package name */
    public String f124736d;

    /* renamed from: e  reason: collision with root package name */
    public String f124737e;

    /* renamed from: f  reason: collision with root package name */
    public String f124738f;

    static {
        Covode.recordClassIndex(81967);
    }

    public ExtraSession(byte b2) {
        this();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraSession)) {
            return false;
        }
        ExtraSession extraSession = (ExtraSession) obj;
        return l.a(this.f124733a, extraSession.f124733a) && l.a(this.f124734b, extraSession.f124734b) && l.a(this.f124735c, extraSession.f124735c) && l.a(this.f124736d, extraSession.f124736d) && l.a(this.f124737e, extraSession.f124737e) && l.a(this.f124738f, extraSession.f124738f);
    }

    public final int hashCode() {
        String str = this.f124733a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f124734b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f124735c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f124736d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f124737e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f124738f;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "ExtraSession(mainBusinessData=" + this.f124733a + ", socialData=" + this.f124734b + ", commerceData=" + this.f124735c + ", ugData=" + this.f124736d + ", techData=" + this.f124737e + ", globalData=" + this.f124738f + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f124733a);
        parcel.writeString(this.f124734b);
        parcel.writeString(this.f124735c);
        parcel.writeString(this.f124736d);
        parcel.writeString(this.f124737e);
        parcel.writeString(this.f124738f);
    }

    public static class a implements Parcelable.Creator<ExtraSession> {
        static {
            Covode.recordClassIndex(81968);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ExtraSession[] newArray(int i2) {
            return new ExtraSession[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ExtraSession createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ExtraSession(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    private /* synthetic */ ExtraSession() {
        this(null, null, null, null, null, null);
    }

    public ExtraSession(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f124733a = str;
        this.f124734b = str2;
        this.f124735c = str3;
        this.f124736d = str4;
        this.f124737e = str5;
        this.f124738f = str6;
    }
}
