package com.ss.android.ugc.aweme.dependence.beauty.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.List;

public final class BeautyComposerInfo implements Parcelable {
    public static final a CREATOR = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f79584a;

    /* renamed from: b  reason: collision with root package name */
    public final String f79585b;

    /* renamed from: c  reason: collision with root package name */
    public final String f79586c;

    static {
        Covode.recordClassIndex(49438);
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.f79584a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f79585b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f79586c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "BeautyComposerInfo(nodePath=" + this.f79584a + ", extra=" + this.f79585b + ", effectId=" + this.f79586c + ")";
    }

    public static final class a implements Parcelable.Creator<BeautyComposerInfo> {
        static {
            Covode.recordClassIndex(49439);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BeautyComposerInfo[] newArray(int i2) {
            return new BeautyComposerInfo[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BeautyComposerInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new BeautyComposerInfo(parcel);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BeautyComposerInfo(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            java.lang.String r2 = r5.readString()
            if (r2 != 0) goto L_0x000c
            r2 = r3
        L_0x000c:
            h.f.b.l.b(r2, r3)
            java.lang.String r1 = r5.readString()
            if (r1 != 0) goto L_0x0016
            r1 = r3
        L_0x0016:
            h.f.b.l.b(r1, r3)
            java.lang.String r0 = r5.readString()
            if (r0 != 0) goto L_0x0020
            r0 = r3
        L_0x0020:
            h.f.b.l.b(r0, r3)
            r4.<init>(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BeautyComposerInfo) {
            BeautyComposerInfo beautyComposerInfo = (BeautyComposerInfo) obj;
            if (l.a((Object) this.f79584a, (Object) beautyComposerInfo.f79584a)) {
                return true;
            }
            List<String> b2 = p.b(this.f79584a, new String[]{":"});
            List<String> b3 = p.b(beautyComposerInfo.f79584a, new String[]{":"});
            if (b2.size() < 2 || b3.size() < 2 || !l.a((Object) b2.get(0), (Object) b3.get(0)) || !l.a((Object) b2.get(1), (Object) b3.get(1))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f79584a);
        parcel.writeString(this.f79585b);
        parcel.writeString(this.f79586c);
    }

    public BeautyComposerInfo(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f79584a = str;
        this.f79585b = str2;
        this.f79586c = str3;
    }
}
