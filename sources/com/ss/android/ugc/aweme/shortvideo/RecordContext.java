package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.StrArray;
import h.f.b.l;

public final class RecordContext implements Parcelable {
    public static final Parcelable.Creator<RecordContext> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final StrArray f124740a;

    /* renamed from: b  reason: collision with root package name */
    public final StrArray f124741b;

    /* renamed from: c  reason: collision with root package name */
    public final StrArray f124742c;

    /* renamed from: d  reason: collision with root package name */
    public final StrArray f124743d;

    /* renamed from: e  reason: collision with root package name */
    public final StrArray f124744e;

    /* renamed from: f  reason: collision with root package name */
    public final StrArray f124745f;

    /* renamed from: g  reason: collision with root package name */
    public final StrArray f124746g;

    static {
        Covode.recordClassIndex(81975);
    }

    public RecordContext() {
        this(null, null, null, null, null, null, null, 127);
    }

    public RecordContext(StrArray strArray, StrArray strArray2, StrArray strArray3, StrArray strArray4, StrArray strArray5, StrArray strArray6) {
        this(strArray, strArray2, strArray3, strArray4, strArray5, strArray6, null, 64);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordContext)) {
            return false;
        }
        RecordContext recordContext = (RecordContext) obj;
        return l.a(this.f124740a, recordContext.f124740a) && l.a(this.f124741b, recordContext.f124741b) && l.a(this.f124742c, recordContext.f124742c) && l.a(this.f124743d, recordContext.f124743d) && l.a(this.f124744e, recordContext.f124744e) && l.a(this.f124745f, recordContext.f124745f) && l.a(this.f124746g, recordContext.f124746g);
    }

    public final int hashCode() {
        StrArray strArray = this.f124740a;
        int i2 = 0;
        int hashCode = (strArray != null ? strArray.hashCode() : 0) * 31;
        StrArray strArray2 = this.f124741b;
        int hashCode2 = (hashCode + (strArray2 != null ? strArray2.hashCode() : 0)) * 31;
        StrArray strArray3 = this.f124742c;
        int hashCode3 = (hashCode2 + (strArray3 != null ? strArray3.hashCode() : 0)) * 31;
        StrArray strArray4 = this.f124743d;
        int hashCode4 = (hashCode3 + (strArray4 != null ? strArray4.hashCode() : 0)) * 31;
        StrArray strArray5 = this.f124744e;
        int hashCode5 = (hashCode4 + (strArray5 != null ? strArray5.hashCode() : 0)) * 31;
        StrArray strArray6 = this.f124745f;
        int hashCode6 = (hashCode5 + (strArray6 != null ? strArray6.hashCode() : 0)) * 31;
        StrArray strArray7 = this.f124746g;
        if (strArray7 != null) {
            i2 = strArray7.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "RecordContext(filterLabels=" + this.f124740a + ", filterIds=" + this.f124741b + ", filterValues=" + this.f124742c + ", smoothSkinLabels=" + this.f124743d + ", reshapeLabels=" + this.f124744e + ", eyesLables=" + this.f124745f + ", tanningLabels=" + this.f124746g + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeParcelable(this.f124740a, i2);
        parcel.writeParcelable(this.f124741b, i2);
        parcel.writeParcelable(this.f124742c, i2);
        parcel.writeParcelable(this.f124743d, i2);
        parcel.writeParcelable(this.f124744e, i2);
        parcel.writeParcelable(this.f124745f, i2);
        parcel.writeParcelable(this.f124746g, i2);
    }

    public static class a implements Parcelable.Creator<RecordContext> {
        static {
            Covode.recordClassIndex(81976);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RecordContext[] newArray(int i2) {
            return new RecordContext[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RecordContext createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new RecordContext((StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()));
        }
    }

    public RecordContext(StrArray strArray, StrArray strArray2, StrArray strArray3, StrArray strArray4, StrArray strArray5, StrArray strArray6, StrArray strArray7) {
        l.d(strArray, "");
        l.d(strArray2, "");
        l.d(strArray3, "");
        l.d(strArray4, "");
        l.d(strArray5, "");
        l.d(strArray6, "");
        l.d(strArray7, "");
        this.f124740a = strArray;
        this.f124741b = strArray2;
        this.f124742c = strArray3;
        this.f124743d = strArray4;
        this.f124744e = strArray5;
        this.f124745f = strArray6;
        this.f124746g = strArray7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ RecordContext(StrArray strArray, StrArray strArray2, StrArray strArray3, StrArray strArray4, StrArray strArray5, StrArray strArray6, StrArray strArray7, int i2) {
        this((i2 & 1) != 0 ? new StrArray() : strArray, (i2 & 2) != 0 ? new StrArray() : strArray2, (i2 & 4) != 0 ? new StrArray() : strArray3, (i2 & 8) != 0 ? new StrArray() : strArray4, (i2 & 16) != 0 ? new StrArray() : strArray5, (i2 & 32) != 0 ? new StrArray() : strArray6, (i2 & 64) != 0 ? new StrArray() : strArray7);
    }
}
