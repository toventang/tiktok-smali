package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.shortvideo.mapping.AVChallengeExtrasAdapterFactory;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class AVChallenge implements Parcelable, Serializable {
    public static final Parcelable.Creator<AVChallenge> CREATOR = new Parcelable.Creator<AVChallenge>() {
        /* class com.ss.android.ugc.aweme.shortvideo.AVChallenge.AnonymousClass1 */

        static {
            Covode.recordClassIndex(81948);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AVChallenge[] newArray(int i2) {
            return new AVChallenge[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AVChallenge createFromParcel(Parcel parcel) {
            return new AVChallenge(parcel);
        }
    };
    @c(a = "align")
    public int align;
    @c(a = "can_use_under_line")
    public boolean canUseUnderLine;
    @c(a = "cha_name")
    public String challengeName;
    @c(a = "cid")
    public String cid;
    @c(a = "game_tpl_id")
    public String dynamicRecordLynxChannel;
    @b(a = AVChallengeExtrasAdapterFactory.class)
    private HashMap<String, Serializable> extras;
    @c(a = "group_id")
    public String groupId;
    @c(a = "init_offset_isLeftAxis")
    public boolean initOffsetIsLeftAxis;
    @c(a = "init_offset_x")
    public float initOffsetX;
    @c(a = "init_offset_y")
    public float initOffsetY;
    @c(a = "is_commerce")
    public boolean isCommerce;
    @c(a = "is_status")
    public Boolean mStatus;
    @c(a = "with_sticker_on_edit_page")
    private int mWithStickerOnEditPage;
    @c(a = "music_id")
    public String musicId;
    @c(a = "mv_id")
    public String mvId;
    @c(a = "sticker_id")
    public String stickerId;
    @c(a = "text_color")
    public int textColor;
    @c(a = "text_size")
    public float textSize;
    @c(a = StringSet.type)
    public int type;
    @c(a = "user_count")
    public int userCount;
    @c(a = "view_count")
    public long viewCount;

    public int describeContents() {
        return 0;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getCid() {
        return this.cid;
    }

    public Map<String, Serializable> getExtras() {
        return this.extras;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public float getInitOffsetX() {
        return this.initOffsetX;
    }

    public float getInitOffsetY() {
        return this.initOffsetY;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getMvId() {
        return this.mvId;
    }

    public Boolean getStatus() {
        return this.mStatus;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getViewCount() {
        return this.viewCount;
    }

    public int getWithStickerOnEditPage() {
        return this.mWithStickerOnEditPage;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    static {
        Covode.recordClassIndex(81947);
    }

    public long getDisplayCount() {
        long viewCount2 = getViewCount();
        if (viewCount2 >= 0) {
            return viewCount2;
        }
        return (long) getUserCount();
    }

    public int hashCode() {
        String str = this.cid;
        if (str != null) {
            return str.hashCode();
        }
        String str2 = this.challengeName;
        if (str2 != null) {
            return str2.hashCode();
        }
        return super.hashCode();
    }

    public AVChallenge() {
        this.viewCount = -1;
        this.textSize = 24.0f;
        this.textColor = -1;
        this.align = 2;
        this.canUseUnderLine = true;
        this.mStatus = false;
        this.extras = new HashMap<>();
    }

    public void setWithStickerOnEditPage(int i2) {
        this.mWithStickerOnEditPage = i2;
    }

    public <T extends Serializable> T getFromExtra(String str) {
        Serializable serializable = this.extras.get(str);
        if (serializable == null) {
            return null;
        }
        return (T) serializable;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AVChallenge)) {
            return false;
        }
        AVChallenge aVChallenge = (AVChallenge) obj;
        if (!TextUtils.equals(aVChallenge.cid, this.cid) || !TextUtils.equals(aVChallenge.challengeName, this.challengeName)) {
            return false;
        }
        return true;
    }

    public boolean isNew(String str) {
        if (!TextUtils.isEmpty(this.cid) || TextUtils.isEmpty(str) || !str.equals(this.challengeName)) {
            return false;
        }
        return true;
    }

    protected AVChallenge(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.viewCount = -1;
        this.textSize = 24.0f;
        this.textColor = -1;
        this.align = 2;
        boolean z4 = true;
        this.canUseUnderLine = true;
        this.mStatus = false;
        this.extras = new HashMap<>();
        this.cid = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isCommerce = z;
        this.challengeName = parcel.readString();
        this.type = parcel.readInt();
        this.stickerId = parcel.readString();
        this.viewCount = parcel.readLong();
        this.userCount = parcel.readInt();
        this.musicId = parcel.readString();
        this.mvId = parcel.readString();
        this.mWithStickerOnEditPage = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mStatus = Boolean.valueOf(z2);
        this.extras = (HashMap) parcel.readSerializable();
        this.initOffsetX = parcel.readFloat();
        this.initOffsetY = parcel.readFloat();
        this.textSize = parcel.readFloat();
        this.textColor = parcel.readInt();
        this.align = parcel.readInt();
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.initOffsetIsLeftAxis = z3;
        this.canUseUnderLine = parcel.readInt() != 1 ? false : z4;
        this.dynamicRecordLynxChannel = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.cid);
        parcel.writeByte(this.isCommerce ? (byte) 1 : 0);
        parcel.writeString(this.challengeName);
        parcel.writeInt(this.type);
        parcel.writeString(this.stickerId);
        parcel.writeLong(this.viewCount);
        parcel.writeInt(this.userCount);
        parcel.writeString(this.musicId);
        parcel.writeString(this.mvId);
        parcel.writeInt(this.mWithStickerOnEditPage);
        parcel.writeByte(this.mStatus.booleanValue() ? (byte) 1 : 0);
        parcel.writeSerializable(this.extras);
        parcel.writeFloat(this.initOffsetX);
        parcel.writeFloat(this.initOffsetY);
        parcel.writeFloat(this.textSize);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.align);
        parcel.writeInt(this.initOffsetIsLeftAxis ? 1 : 0);
        parcel.writeInt(this.canUseUnderLine ? 1 : 0);
        parcel.writeString(this.dynamicRecordLynxChannel);
    }
}
