package com.ss.android.ugc.aweme.ecommerce.address.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class Rule implements Parcelable {
    public static final Parcelable.Creator<Rule> CREATOR = new a();
    @c(a = "error")

    /* renamed from: a  reason: collision with root package name */
    public final String f84323a;
    @c(a = "regex")

    /* renamed from: b  reason: collision with root package name */
    public final String f84324b;

    static {
        Covode.recordClassIndex(52575);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rule)) {
            return false;
        }
        Rule rule = (Rule) obj;
        return l.a(this.f84323a, rule.f84323a) && l.a(this.f84324b, rule.f84324b);
    }

    public final int hashCode() {
        String str = this.f84323a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84324b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Rule(error=" + this.f84323a + ", regex=" + this.f84324b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f84323a);
        parcel.writeString(this.f84324b);
    }

    public static class a implements Parcelable.Creator<Rule> {
        static {
            Covode.recordClassIndex(52576);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Rule[] newArray(int i2) {
            return new Rule[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Rule createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new Rule(parcel.readString(), parcel.readString());
        }
    }

    public Rule(String str, String str2) {
        this.f84323a = str;
        this.f84324b = str2;
    }
}
