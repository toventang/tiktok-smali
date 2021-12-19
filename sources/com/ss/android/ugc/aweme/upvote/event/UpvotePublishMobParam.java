package com.ss.android.ugc.aweme.upvote.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class UpvotePublishMobParam implements Parcelable {
    public static final Parcelable.Creator<UpvotePublishMobParam> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f142213a;

    /* renamed from: b  reason: collision with root package name */
    public String f142214b;

    /* renamed from: c  reason: collision with root package name */
    public String f142215c;

    /* renamed from: d  reason: collision with root package name */
    public String f142216d;

    /* renamed from: e  reason: collision with root package name */
    public String f142217e;

    static {
        Covode.recordClassIndex(92976);
    }

    public UpvotePublishMobParam() {
        this(null, null, null, null, null, 31);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvotePublishMobParam)) {
            return false;
        }
        UpvotePublishMobParam upvotePublishMobParam = (UpvotePublishMobParam) obj;
        return l.a(this.f142213a, upvotePublishMobParam.f142213a) && l.a(this.f142214b, upvotePublishMobParam.f142214b) && l.a(this.f142215c, upvotePublishMobParam.f142215c) && l.a(this.f142216d, upvotePublishMobParam.f142216d) && l.a(this.f142217e, upvotePublishMobParam.f142217e);
    }

    public final int hashCode() {
        String str = this.f142213a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f142214b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f142215c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f142216d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f142217e;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "UpvotePublishMobParam(enterFrom=" + this.f142213a + ", enterMethod=" + this.f142214b + ", groupId=" + this.f142215c + ", authorId=" + this.f142216d + ", followStatus=" + this.f142217e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f142213a);
        parcel.writeString(this.f142214b);
        parcel.writeString(this.f142215c);
        parcel.writeString(this.f142216d);
        parcel.writeString(this.f142217e);
    }

    public static class a implements Parcelable.Creator<UpvotePublishMobParam> {
        static {
            Covode.recordClassIndex(92977);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UpvotePublishMobParam[] newArray(int i2) {
            return new UpvotePublishMobParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UpvotePublishMobParam createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new UpvotePublishMobParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public final void a(String str) {
        l.d(str, "");
        this.f142214b = str;
    }

    public UpvotePublishMobParam(String str, String str2, String str3, String str4, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        this.f142213a = str;
        this.f142214b = str2;
        this.f142215c = str3;
        this.f142216d = str4;
        this.f142217e = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UpvotePublishMobParam(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r6 = this;
            r4 = r10
            r3 = r9
            r2 = r8
            r1 = r7
            r0 = r12 & 1
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x000b
            r1 = r5
        L_0x000b:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0010
            r2 = r5
        L_0x0010:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0015
            r3 = r5
        L_0x0015:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x001a
            r4 = r5
        L_0x001a:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0023
        L_0x001e:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0023:
            r5 = r11
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
