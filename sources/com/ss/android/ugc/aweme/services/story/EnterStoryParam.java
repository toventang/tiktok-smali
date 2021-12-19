package com.ss.android.ugc.aweme.services.story;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class EnterStoryParam implements Parcelable {
    public static final Parcelable.Creator<EnterStoryParam> CREATOR = new Creator();
    private final String enterFrom;
    private final String enterMethod;
    private final boolean isStory;
    private final boolean isWestWindowExist;
    private final boolean launchAsActivity;
    private final boolean needPublishWithAnim;
    private final String shootWay;

    public static class Creator implements Parcelable.Creator<EnterStoryParam> {
        static {
            Covode.recordClassIndex(79819);
        }

        @Override // android.os.Parcelable.Creator
        public final EnterStoryParam createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new EnterStoryParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final EnterStoryParam[] newArray(int i2) {
            return new EnterStoryParam[i2];
        }
    }

    static {
        Covode.recordClassIndex(79818);
    }

    public EnterStoryParam() {
        this(null, null, null, false, false, false, false, 127, null);
    }

    public static /* synthetic */ EnterStoryParam copy$default(EnterStoryParam enterStoryParam, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = enterStoryParam.shootWay;
        }
        if ((i2 & 2) != 0) {
            str2 = enterStoryParam.enterMethod;
        }
        if ((i2 & 4) != 0) {
            str3 = enterStoryParam.enterFrom;
        }
        if ((i2 & 8) != 0) {
            z = enterStoryParam.needPublishWithAnim;
        }
        if ((i2 & 16) != 0) {
            z2 = enterStoryParam.launchAsActivity;
        }
        if ((i2 & 32) != 0) {
            z3 = enterStoryParam.isWestWindowExist;
        }
        if ((i2 & 64) != 0) {
            z4 = enterStoryParam.isStory;
        }
        return enterStoryParam.copy(str, str2, str3, z, z2, z3, z4);
    }

    public final String component1() {
        return this.shootWay;
    }

    public final String component2() {
        return this.enterMethod;
    }

    public final String component3() {
        return this.enterFrom;
    }

    public final boolean component4() {
        return this.needPublishWithAnim;
    }

    public final boolean component5() {
        return this.launchAsActivity;
    }

    public final boolean component6() {
        return this.isWestWindowExist;
    }

    public final boolean component7() {
        return this.isStory;
    }

    public final EnterStoryParam copy(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        l.d(str2, "");
        l.d(str3, "");
        return new EnterStoryParam(str, str2, str3, z, z2, z3, z4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterStoryParam)) {
            return false;
        }
        EnterStoryParam enterStoryParam = (EnterStoryParam) obj;
        return l.a(this.shootWay, enterStoryParam.shootWay) && l.a(this.enterMethod, enterStoryParam.enterMethod) && l.a(this.enterFrom, enterStoryParam.enterFrom) && this.needPublishWithAnim == enterStoryParam.needPublishWithAnim && this.launchAsActivity == enterStoryParam.launchAsActivity && this.isWestWindowExist == enterStoryParam.isWestWindowExist && this.isStory == enterStoryParam.isStory;
    }

    public final int hashCode() {
        String str = this.shootWay;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.enterMethod;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.enterFrom;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.needPublishWithAnim;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (i3 + i5) * 31;
        boolean z2 = this.launchAsActivity;
        if (z2) {
            z2 = true;
        }
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = z2 ? 1 : 0;
        int i12 = (i8 + i9) * 31;
        boolean z3 = this.isWestWindowExist;
        if (z3) {
            z3 = true;
        }
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = z3 ? 1 : 0;
        int i16 = (i12 + i13) * 31;
        if (!this.isStory) {
            i4 = 0;
        }
        return i16 + i4;
    }

    public final String toString() {
        return "EnterStoryParam(shootWay=" + this.shootWay + ", enterMethod=" + this.enterMethod + ", enterFrom=" + this.enterFrom + ", needPublishWithAnim=" + this.needPublishWithAnim + ", launchAsActivity=" + this.launchAsActivity + ", isWestWindowExist=" + this.isWestWindowExist + ", isStory=" + this.isStory + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.shootWay);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.enterFrom);
        parcel.writeInt(this.needPublishWithAnim ? 1 : 0);
        parcel.writeInt(this.launchAsActivity ? 1 : 0);
        parcel.writeInt(this.isWestWindowExist ? 1 : 0);
        parcel.writeInt(this.isStory ? 1 : 0);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final boolean getLaunchAsActivity() {
        return this.launchAsActivity;
    }

    public final boolean getNeedPublishWithAnim() {
        return this.needPublishWithAnim;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final boolean isStory() {
        return this.isStory;
    }

    public final boolean isWestWindowExist() {
        return this.isWestWindowExist;
    }

    public EnterStoryParam(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        l.d(str2, "");
        l.d(str3, "");
        this.shootWay = str;
        this.enterMethod = str2;
        this.enterFrom = str3;
        this.needPublishWithAnim = z;
        this.launchAsActivity = z2;
        this.isWestWindowExist = z3;
        this.isStory = z4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EnterStoryParam(java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14, boolean r15, boolean r16, int r17, h.f.b.g r18) {
        /*
            r9 = this;
            r7 = r15
            r2 = r10
            r8 = r16
            r3 = r11
            r5 = r13
            r6 = r14
            r0 = r17 & 1
            if (r0 == 0) goto L_0x000c
            r2 = 0
        L_0x000c:
            r0 = r17 & 2
            java.lang.String r4 = "unknown"
            if (r0 == 0) goto L_0x0013
            r3 = r4
        L_0x0013:
            r0 = r17 & 4
            if (r0 == 0) goto L_0x0032
        L_0x0017:
            r1 = r17 & 8
            r0 = 1
            if (r1 == 0) goto L_0x001d
            r5 = 1
        L_0x001d:
            r1 = r17 & 16
            r0 = 0
            if (r1 == 0) goto L_0x0023
            r6 = 0
        L_0x0023:
            r0 = r17 & 32
            if (r0 == 0) goto L_0x0028
            r7 = 0
        L_0x0028:
            r0 = r17 & 64
            if (r0 == 0) goto L_0x002d
            r8 = 1
        L_0x002d:
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0032:
            r4 = r12
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.story.EnterStoryParam.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, int, h.f.b.g):void");
    }
}
