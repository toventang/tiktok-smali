package com.ss.android.ugc.aweme.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class AnchorCell implements Parcelable {
    public static final Parcelable.Creator<AnchorCell> CREATOR = new a();
    @c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public String f66453a;
    @c(a = "icon")

    /* renamed from: b  reason: collision with root package name */
    public AnchorIcon f66454b;
    @c(a = "title")

    /* renamed from: c  reason: collision with root package name */
    public String f66455c;
    @c(a = "sub_title")

    /* renamed from: d  reason: collision with root package name */
    public String f66456d;
    @c(a = "schema_url")

    /* renamed from: e  reason: collision with root package name */
    public String f66457e;
    @c(a = "extra")

    /* renamed from: f  reason: collision with root package name */
    public String f66458f;

    /* renamed from: g  reason: collision with root package name */
    public int f66459g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f66460h;

    static {
        Covode.recordClassIndex(40844);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f66453a);
        AnchorIcon anchorIcon = this.f66454b;
        if (anchorIcon != null) {
            parcel.writeInt(1);
            anchorIcon.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f66455c);
        parcel.writeString(this.f66456d);
        parcel.writeString(this.f66457e);
        parcel.writeString(this.f66458f);
        parcel.writeInt(this.f66459g);
        parcel.writeInt(this.f66460h ? 1 : 0);
    }

    public static class a implements Parcelable.Creator<AnchorCell> {
        static {
            Covode.recordClassIndex(40845);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AnchorCell[] newArray(int i2) {
            return new AnchorCell[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AnchorCell createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new AnchorCell(parcel.readString(), parcel.readInt() != 0 ? AnchorIcon.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }
    }

    private /* synthetic */ AnchorCell() {
        this(null, null, null, null, null, null, -100, false);
    }

    public final int hashCode() {
        String str = this.f66453a;
        if (str == null) {
            str = "";
        }
        return Integer.valueOf(str).intValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnchorCell) {
            return TextUtils.equals(this.f66453a, ((AnchorCell) obj).f66453a);
        }
        return false;
    }

    public AnchorCell(String str, AnchorIcon anchorIcon, String str2, String str3, String str4, String str5, int i2, boolean z) {
        this.f66453a = str;
        this.f66454b = anchorIcon;
        this.f66455c = str2;
        this.f66456d = str3;
        this.f66457e = str4;
        this.f66458f = str5;
        this.f66459g = i2;
        this.f66460h = z;
    }
}
