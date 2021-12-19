package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.sticker.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseShortVideoContext implements Parcelable {
    public int allowAutoCaptionSetting;
    public int allowDownloadSetting;
    public int allowRecommend;
    public ArrayList<String> arTextList;
    private AVETParameter avetParameter;
    public int brandedContentType = -1;
    public String chain;
    public List<AVChallenge> challenges;
    public boolean changeStickerStruct = false;
    public String city;
    public int commentSetting;
    public String commerceData;
    public List<String> contentDesc;
    public List<AVTextExtraStruct> contentDescExtra;
    public CutSameEditData cutSameEditData;
    public boolean disableDeleteChain;
    public DraftEditTransferModel draftEditTransferModel;
    public List<User> excludeUserList;
    public String fromPropId;
    public List<String> geofencingSetting;
    public String globalData;
    public List<String> hashTagTextList;
    public Boolean isCommentDeleted = false;
    public boolean isDefaultProp;
    public int isPrivate;
    public int mDraftToEditFrom = -1;
    public boolean mIsFromDraft;
    private String mShootFrom;
    public String mShootWay;
    public String mSyncPlatforms;
    private int mVideoLength;
    private String mainBusinessData;
    public List<String> mentionTextList;
    public ArrayList<String> messageBubbleTexts;
    public String playlist_id;
    public String playlist_item_count;
    public String playlist_name;
    public int reactDuetSetting;
    public List<AVTextExtraStruct> returnCaptionStructList;
    public String returnCaptionTitle;
    public String socialData;
    public StickerInfo stickerInfo;
    public int stitchSetting;
    public List<AVTextExtraStruct> structList;
    public String tagId;
    public String techData;
    public String title;
    public String ugData;
    public long userClickPublishTime;

    static {
        Covode.recordClassIndex(81949);
    }

    public int describeContents() {
        return 0;
    }

    public String getMainBusinessData() {
        return this.mainBusinessData;
    }

    public String getShootFrom() {
        return this.mShootFrom;
    }

    public int getVideoLength() {
        return this.mVideoLength;
    }

    public AVETParameter getAvetParameter() {
        if (this.avetParameter == null) {
            this.avetParameter = new AVETParameter();
        }
        return this.avetParameter;
    }

    public String getDraftPrimaryKey() {
        DraftEditTransferModel draftEditTransferModel2 = this.draftEditTransferModel;
        if (draftEditTransferModel2 != null) {
            return draftEditTransferModel2.getPrimaryKey();
        }
        return null;
    }

    public String getPropGradeKey() {
        StickerInfo stickerInfo2 = this.stickerInfo;
        if (stickerInfo2 == null) {
            return "";
        }
        return stickerInfo2.getGradeKey();
    }

    public boolean useMusicBeatSticker() {
        StickerInfo stickerInfo2 = this.stickerInfo;
        if (stickerInfo2 == null || !stickerInfo2.isMusicBeatSticker()) {
            return false;
        }
        return true;
    }

    public BaseShortVideoContext() {
    }

    public String getPropSource() {
        StickerInfo stickerInfo2 = this.stickerInfo;
        if (stickerInfo2 == null) {
            return "";
        }
        return n.a(stickerInfo2.getPropSource(), true);
    }

    public void setAvetParameter(AVETParameter aVETParameter) {
        this.avetParameter = aVETParameter;
    }

    public void setMainBusinessData(String str) {
        this.mainBusinessData = str;
    }

    public void setShootFrom(String str) {
        this.mShootFrom = str;
    }

    public void setVideoLength(int i2) {
        this.mVideoLength = i2;
    }

    public BaseShortVideoContext(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        ArrayList arrayList = new ArrayList();
        this.challenges = arrayList;
        parcel.readList(arrayList, AVChallenge.class.getClassLoader());
        this.tagId = parcel.readString();
        this.fromPropId = parcel.readString();
        this.title = parcel.readString();
        this.structList = parcel.createTypedArrayList(AVTextExtraStruct.CREATOR);
        this.city = parcel.readString();
        this.isPrivate = parcel.readInt();
        this.excludeUserList = (List) parcel.readSerializable();
        this.allowRecommend = parcel.readInt();
        this.mVideoLength = parcel.readInt();
        this.mSyncPlatforms = parcel.readString();
        this.mShootWay = parcel.readString();
        this.mShootFrom = parcel.readString();
        this.stickerInfo = (StickerInfo) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsFromDraft = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isDefaultProp = z2;
        this.brandedContentType = parcel.readInt();
        this.commentSetting = parcel.readInt();
        this.reactDuetSetting = parcel.readInt();
        this.allowAutoCaptionSetting = parcel.readInt();
        this.geofencingSetting = parcel.createStringArrayList();
        setMainBusinessData(parcel.readString());
        this.socialData = parcel.readString();
        this.commerceData = parcel.readString();
        this.ugData = parcel.readString();
        this.techData = parcel.readString();
        this.globalData = parcel.readString();
        this.avetParameter = (AVETParameter) parcel.readSerializable();
        this.arTextList = parcel.createStringArrayList();
        this.messageBubbleTexts = parcel.createStringArrayList();
        this.draftEditTransferModel = (DraftEditTransferModel) parcel.readParcelable(DraftEditTransferModel.class.getClassLoader());
        this.userClickPublishTime = parcel.readLong();
        this.allowDownloadSetting = parcel.readInt();
        this.chain = parcel.readString();
        this.disableDeleteChain = parcel.readByte() != 0 ? true : z3;
        this.cutSameEditData = (CutSameEditData) parcel.readParcelable(CutSameEditData.class.getClassLoader());
        this.stitchSetting = parcel.readInt();
        this.mDraftToEditFrom = parcel.readInt();
        this.playlist_id = parcel.readString();
        this.playlist_item_count = parcel.readString();
        this.playlist_name = parcel.readString();
        this.mentionTextList = parcel.createStringArrayList();
        this.hashTagTextList = parcel.createStringArrayList();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.challenges);
        parcel.writeString(this.tagId);
        parcel.writeString(this.fromPropId);
        parcel.writeString(this.title);
        parcel.writeTypedList(this.structList);
        parcel.writeString(this.city);
        parcel.writeInt(this.isPrivate);
        parcel.writeSerializable((Serializable) this.excludeUserList);
        parcel.writeInt(this.allowRecommend);
        parcel.writeInt(this.mVideoLength);
        parcel.writeString(this.mSyncPlatforms);
        parcel.writeString(this.mShootWay);
        parcel.writeString(this.mShootFrom);
        parcel.writeSerializable(this.stickerInfo);
        parcel.writeByte(this.mIsFromDraft ? (byte) 1 : 0);
        parcel.writeByte(this.isDefaultProp ? (byte) 1 : 0);
        parcel.writeInt(this.brandedContentType);
        parcel.writeInt(this.commentSetting);
        parcel.writeInt(this.reactDuetSetting);
        parcel.writeInt(this.allowAutoCaptionSetting);
        parcel.writeStringList(this.geofencingSetting);
        parcel.writeString(getMainBusinessData());
        parcel.writeString(this.socialData);
        parcel.writeString(this.commerceData);
        parcel.writeString(this.ugData);
        parcel.writeString(this.techData);
        parcel.writeString(this.globalData);
        parcel.writeSerializable(this.avetParameter);
        parcel.writeStringList(this.arTextList);
        parcel.writeStringList(this.messageBubbleTexts);
        parcel.writeParcelable(this.draftEditTransferModel, i2);
        parcel.writeLong(this.userClickPublishTime);
        parcel.writeInt(this.allowDownloadSetting);
        parcel.writeString(this.chain);
        parcel.writeByte(this.disableDeleteChain ? (byte) 1 : 0);
        parcel.writeParcelable(this.cutSameEditData, i2);
        parcel.writeInt(this.stitchSetting);
        parcel.writeInt(this.mDraftToEditFrom);
        parcel.writeString(this.playlist_id);
        parcel.writeString(this.playlist_name);
        parcel.writeString(this.playlist_item_count);
        parcel.writeStringList(this.mentionTextList);
        parcel.writeStringList(this.hashTagTextList);
    }
}
