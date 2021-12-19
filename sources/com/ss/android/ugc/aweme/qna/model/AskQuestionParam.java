package com.ss.android.ugc.aweme.qna.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;

public final class AskQuestionParam implements IRouteArg, Serializable {
    public static final Parcelable.Creator<AskQuestionParam> CREATOR = new a();
    private boolean autoInvite;
    private boolean bannerShow;
    private String bannerText;
    private String enterFrom;
    private String enterMethod;
    private ArrayList<User> invitedUsers;
    private String question;
    private boolean recordShow;
    private String uid;

    static {
        Covode.recordClassIndex(77657);
    }

    public AskQuestionParam() {
        this(null, null, null, null, null, false, false, false, null, 511, null);
    }

    public AskQuestionParam(String str) {
        this(str, null, null, null, null, false, false, false, null, 510, null);
    }

    public AskQuestionParam(String str, String str2) {
        this(str, str2, null, null, null, false, false, false, null, 508, null);
    }

    public AskQuestionParam(String str, String str2, String str3) {
        this(str, str2, str3, null, null, false, false, false, null, 504, null);
    }

    public AskQuestionParam(String str, String str2, String str3, ArrayList<User> arrayList) {
        this(str, str2, str3, arrayList, null, false, false, false, null, 496, null);
    }

    public AskQuestionParam(String str, String str2, String str3, ArrayList<User> arrayList, String str4) {
        this(str, str2, str3, arrayList, str4, false, false, false, null, 480, null);
    }

    public AskQuestionParam(String str, String str2, String str3, ArrayList<User> arrayList, String str4, boolean z) {
        this(str, str2, str3, arrayList, str4, z, false, false, null, 448, null);
    }

    public AskQuestionParam(String str, String str2, String str3, ArrayList<User> arrayList, String str4, boolean z, boolean z2) {
        this(str, str2, str3, arrayList, str4, z, z2, false, null, 384, null);
    }

    public AskQuestionParam(String str, String str2, String str3, ArrayList<User> arrayList, String str4, boolean z, boolean z2, boolean z3) {
        this(str, str2, str3, arrayList, str4, z, z2, z3, null, 256, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0092, code lost:
        if (r9 == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00aa, code lost:
        if (r8 == null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c2, code lost:
        if (r7 == null) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.qna.model.AskQuestionParam __fromBundle(android.os.Bundle r24) {
        /*
        // Method dump skipped, instructions count: 296
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.model.AskQuestionParam.__fromBundle(android.os.Bundle):com.ss.android.ugc.aweme.qna.model.AskQuestionParam");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.qna.model.AskQuestionParam */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AskQuestionParam copy$default(AskQuestionParam askQuestionParam, String str, String str2, String str3, ArrayList arrayList, String str4, boolean z, boolean z2, boolean z3, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = askQuestionParam.enterFrom;
        }
        if ((i2 & 2) != 0) {
            str2 = askQuestionParam.enterMethod;
        }
        if ((i2 & 4) != 0) {
            str3 = askQuestionParam.question;
        }
        if ((i2 & 8) != 0) {
            arrayList = askQuestionParam.invitedUsers;
        }
        if ((i2 & 16) != 0) {
            str4 = askQuestionParam.bannerText;
        }
        if ((i2 & 32) != 0) {
            z = askQuestionParam.bannerShow;
        }
        if ((i2 & 64) != 0) {
            z2 = askQuestionParam.recordShow;
        }
        if ((i2 & 128) != 0) {
            z3 = askQuestionParam.autoInvite;
        }
        if ((i2 & 256) != 0) {
            str5 = askQuestionParam.uid;
        }
        return askQuestionParam.copy(str, str2, str3, arrayList, str4, z, z2, z3, str5);
    }

    public final String component1() {
        return this.enterFrom;
    }

    public final String component2() {
        return this.enterMethod;
    }

    public final String component3() {
        return this.question;
    }

    public final ArrayList<User> component4() {
        return this.invitedUsers;
    }

    public final String component5() {
        return this.bannerText;
    }

    public final boolean component6() {
        return this.bannerShow;
    }

    public final boolean component7() {
        return this.recordShow;
    }

    public final boolean component8() {
        return this.autoInvite;
    }

    public final String component9() {
        return this.uid;
    }

    public final AskQuestionParam copy(String str, String str2, String str3, ArrayList<User> arrayList, String str4, boolean z, boolean z2, boolean z3, String str5) {
        return new AskQuestionParam(str, str2, str3, arrayList, str4, z, z2, z3, str5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AskQuestionParam)) {
            return false;
        }
        AskQuestionParam askQuestionParam = (AskQuestionParam) obj;
        return l.a(this.enterFrom, askQuestionParam.enterFrom) && l.a(this.enterMethod, askQuestionParam.enterMethod) && l.a(this.question, askQuestionParam.question) && l.a(this.invitedUsers, askQuestionParam.invitedUsers) && l.a(this.bannerText, askQuestionParam.bannerText) && this.bannerShow == askQuestionParam.bannerShow && this.recordShow == askQuestionParam.recordShow && this.autoInvite == askQuestionParam.autoInvite && l.a(this.uid, askQuestionParam.uid);
    }

    public final int hashCode() {
        String str = this.enterFrom;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.enterMethod;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.question;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ArrayList<User> arrayList = this.invitedUsers;
        int hashCode4 = (hashCode3 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        String str4 = this.bannerText;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.bannerShow;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode5 + i4) * 31;
        boolean z2 = this.recordShow;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        if (!this.autoInvite) {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        String str5 = this.uid;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return i12 + i2;
    }

    public final String toString() {
        return "AskQuestionParam(enterFrom=" + this.enterFrom + ", enterMethod=" + this.enterMethod + ", question=" + this.question + ", invitedUsers=" + this.invitedUsers + ", bannerText=" + this.bannerText + ", bannerShow=" + this.bannerShow + ", recordShow=" + this.recordShow + ", autoInvite=" + this.autoInvite + ", uid=" + this.uid + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.question);
        ArrayList<User> arrayList = this.invitedUsers;
        if (arrayList != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            for (User user : arrayList) {
                parcel.writeSerializable(user);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.bannerText);
        parcel.writeInt(this.bannerShow ? 1 : 0);
        parcel.writeInt(this.recordShow ? 1 : 0);
        parcel.writeInt(this.autoInvite ? 1 : 0);
        parcel.writeString(this.uid);
    }

    public final boolean getAutoInvite() {
        return this.autoInvite;
    }

    public final boolean getBannerShow() {
        return this.bannerShow;
    }

    public final String getBannerText() {
        return this.bannerText;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final ArrayList<User> getInvitedUsers() {
        return this.invitedUsers;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final boolean getRecordShow() {
        return this.recordShow;
    }

    public final String getUid() {
        return this.uid;
    }

    public AskQuestionParam(String str, String str2, String str3, ArrayList<User> arrayList, String str4, boolean z, boolean z2, boolean z3, String str5) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.question = str3;
        this.invitedUsers = arrayList;
        this.bannerText = str4;
        this.bannerShow = z;
        this.recordShow = z2;
        this.autoInvite = z3;
        this.uid = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AskQuestionParam(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.ArrayList r15, java.lang.String r16, boolean r17, boolean r18, boolean r19, java.lang.String r20, int r21, h.f.b.g r22) {
        /*
            r11 = this;
            r1 = r21
            r7 = r17
            r2 = r12
            r8 = r18
            r3 = r13
            r5 = r15
            r4 = r14
            r0 = r1 & 1
            java.lang.String r10 = ""
            if (r0 == 0) goto L_0x0011
            r2 = r10
        L_0x0011:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0016
            r3 = r10
        L_0x0016:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001b
            r4 = r10
        L_0x001b:
            r0 = r1 & 8
            r6 = 0
            if (r0 == 0) goto L_0x0021
            r5 = r6
        L_0x0021:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0043
        L_0x0025:
            r0 = r1 & 32
            r9 = 0
            if (r0 == 0) goto L_0x002b
            r7 = 0
        L_0x002b:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0030
            r8 = 1
        L_0x0030:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0040
        L_0x0034:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x003d
        L_0x0038:
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x003d:
            r10 = r20
            goto L_0x0038
        L_0x0040:
            r9 = r19
            goto L_0x0034
        L_0x0043:
            r6 = r16
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.model.AskQuestionParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, boolean, boolean, boolean, java.lang.String, int, h.f.b.g):void");
    }

    public static class a implements Parcelable.Creator<AskQuestionParam> {
        static {
            Covode.recordClassIndex(77658);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AskQuestionParam[] newArray(int i2) {
            return new AskQuestionParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AskQuestionParam createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(parcel.readSerializable());
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new AskQuestionParam(readString, readString2, readString3, arrayList, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }
    }

    public final void setAutoInvite(boolean z) {
        this.autoInvite = z;
    }

    public final void setBannerShow(boolean z) {
        this.bannerShow = z;
    }

    public final void setBannerText(String str) {
        this.bannerText = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setInvitedUsers(ArrayList<User> arrayList) {
        this.invitedUsers = arrayList;
    }

    public final void setQuestion(String str) {
        this.question = str;
    }

    public final void setRecordShow(boolean z) {
        this.recordShow = z;
    }

    public final void setUid(String str) {
        this.uid = str;
    }
}
