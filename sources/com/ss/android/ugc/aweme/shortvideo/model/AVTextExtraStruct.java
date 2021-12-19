package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public class AVTextExtraStruct implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<AVTextExtraStruct> CREATOR = new Parcelable.Creator<AVTextExtraStruct>() {
        /* class com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct.AnonymousClass1 */

        static {
            Covode.recordClassIndex(84402);
        }

        @Override // android.os.Parcelable.Creator
        public final AVTextExtraStruct[] newArray(int i2) {
            return new AVTextExtraStruct[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final AVTextExtraStruct createFromParcel(Parcel parcel) {
            return new AVTextExtraStruct(parcel);
        }
    };
    @c(a = "at_user_type")
    String atUserType;
    @c(a = "aweme_id")
    String awemeId;
    String cid;
    @c(a = "end")
    int end;
    @c(a = "hashtag_name")
    String hashTagName;
    boolean isStarAtlasTag;
    @c(a = "line_idx")
    int lineIndex;
    @c(a = "sec_uid")
    String mSecUid;
    @c(a = "start")
    int start;
    @c(a = "sub_type")
    int subType;
    @c(a = StringSet.type)
    int type;
    @c(a = "user_id")
    String userId;

    public int describeContents() {
        return 0;
    }

    public AVTextExtraStruct() {
    }

    public String getAtUserType() {
        return this.atUserType;
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getCid() {
        return this.cid;
    }

    public int getEnd() {
        return this.end;
    }

    public String getHashTagName() {
        return this.hashTagName;
    }

    public int getLineIndex() {
        return this.lineIndex;
    }

    public int getStart() {
        return this.start;
    }

    public int getSubType() {
        return this.subType;
    }

    public int getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getmSecUid() {
        return this.mSecUid;
    }

    public boolean isStarAtlasTag() {
        return this.isStarAtlasTag;
    }

    static {
        Covode.recordClassIndex(84401);
    }

    @Override // java.lang.Object
    public AVTextExtraStruct clone() {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.setStart(this.start);
        aVTextExtraStruct.setEnd(this.end);
        aVTextExtraStruct.setUserId(this.userId);
        aVTextExtraStruct.setType(this.type);
        aVTextExtraStruct.setAtUserType(this.atUserType);
        aVTextExtraStruct.setHashTagName(this.hashTagName);
        aVTextExtraStruct.setAwemeId(this.awemeId);
        aVTextExtraStruct.setSubType(this.subType);
        aVTextExtraStruct.setmSecUid(this.mSecUid);
        aVTextExtraStruct.setLineIndex(this.lineIndex);
        return aVTextExtraStruct;
    }

    public int hashCode() {
        int i2;
        int i3;
        String str = this.userId;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (((i2 + 0) * 31) + this.type + this.subType) * 31;
        String str2 = this.atUserType;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        String str3 = this.hashTagName;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i6 + i4;
    }

    public String toString() {
        return "AVTextExtraStruct{isStarAtlasTag=" + this.isStarAtlasTag + ", start=" + this.start + ", end=" + this.end + ", userId='" + this.userId + '\'' + ", type=" + this.type + ", atUserType='" + this.atUserType + '\'' + ", hashTagName='" + this.hashTagName + '\'' + ", awemeId='" + this.awemeId + '\'' + ", subType=" + this.subType + ", mSecUid='" + this.mSecUid + '\'' + ", lineIndex=" + this.lineIndex + ", cid='" + this.cid + '\'' + '}';
    }

    public void setAtUserType(String str) {
        this.atUserType = str;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setEnd(int i2) {
        this.end = i2;
    }

    public void setHashTagName(String str) {
        this.hashTagName = str;
    }

    public void setLineIndex(int i2) {
        this.lineIndex = i2;
    }

    public void setStarAtlasTag(boolean z) {
        this.isStarAtlasTag = z;
    }

    public void setStart(int i2) {
        this.start = i2;
    }

    public void setSubType(int i2) {
        this.subType = i2;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setmSecUid(String str) {
        this.mSecUid = str;
    }

    protected AVTextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readString();
        this.type = parcel.readInt();
        this.atUserType = parcel.readString();
        this.hashTagName = parcel.readString();
        this.awemeId = parcel.readString();
        this.subType = parcel.readInt();
        this.mSecUid = parcel.readString();
        this.lineIndex = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AVTextExtraStruct)) {
            return false;
        }
        AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) obj;
        if (this.type != aVTextExtraStruct.type || this.subType != aVTextExtraStruct.subType) {
            return false;
        }
        String str = this.userId;
        if (str == null ? aVTextExtraStruct.userId != null : !str.equals(aVTextExtraStruct.userId)) {
            return false;
        }
        if (!TextUtils.equals(this.hashTagName, aVTextExtraStruct.hashTagName)) {
            return false;
        }
        String str2 = this.atUserType;
        String str3 = aVTextExtraStruct.atUserType;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeString(this.userId);
        parcel.writeInt(this.type);
        parcel.writeString(this.atUserType);
        parcel.writeString(this.hashTagName);
        parcel.writeString(this.awemeId);
        parcel.writeInt(this.subType);
        parcel.writeString(this.mSecUid);
        parcel.writeInt(this.lineIndex);
    }
}
