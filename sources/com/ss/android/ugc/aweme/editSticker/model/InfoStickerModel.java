package com.ss.android.ugc.aweme.editSticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.tools.utils.d;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class InfoStickerModel implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<InfoStickerModel> CREATOR = new Parcelable.Creator<InfoStickerModel>() {
        /* class com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel.AnonymousClass1 */

        static {
            Covode.recordClassIndex(55468);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InfoStickerModel[] newArray(int i2) {
            return new InfoStickerModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InfoStickerModel createFromParcel(Parcel parcel) {
            return new InfoStickerModel(parcel);
        }
    };
    @c(a = "sticker_dir")
    public String infoStickerDraftDir;
    @c(a = "text_align")
    public int mAlign = 2;
    @c(a = "bg_mode")
    public int mBgMode = 1;
    @c(a = "bg_color")
    public int mColor = -1;
    @c(a = "text_font_id")
    public String mFontId;
    @c(a = "text_font_path")
    public String mFontPath;
    @c(a = "text_font")
    public String mFontType;
    @c(a = "text_audio_length")
    public int mTextAudioLength;
    @c(a = "stickers")
    public List<StickerItemModel> stickers;

    public static int com_ss_android_ugc_aweme_editSticker_model_InfoStickerModel_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    public void clearSticker() {
        this.stickers.clear();
    }

    static {
        Covode.recordClassIndex(55467);
    }

    public InfoStickerModel() {
    }

    @Override // java.lang.Object
    public InfoStickerModel clone() {
        try {
            return (InfoStickerModel) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String getInfoStickerIds() {
        if (d.a(this.stickers)) {
            return "";
        }
        return getNotEmptyInfoStickerIds();
    }

    public StickerItemModel getLyricStickerModel() {
        if (d.a(this.stickers)) {
            return null;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel.isLyric()) {
                return stickerItemModel;
            }
        }
        return null;
    }

    public String getNotEmptyInfoStickerIds() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (!TextUtils.isEmpty(stickerItemModel.stickerId) && stickerItemModel.type != 2) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(stickerItemModel.stickerId);
            }
        }
        return sb.toString();
    }

    public int getSubtitleRule() {
        if (d.a(this.stickers)) {
            return -1;
        }
        for (int i2 = 0; i2 < this.stickers.size(); i2++) {
            if (this.stickers.get(i2).isSubtitleRule()) {
                return i2;
            }
        }
        return -1;
    }

    public boolean hasAnimTimestampSticker() {
        if (d.a(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel.isAnimTimestampSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasImageSticker() {
        if (d.a(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel.isImageSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasLocalHashTagSticker() {
        if (d.a(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel.isLocalHashTagSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasLyricSticker() {
        if (d.a(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel.isLyric()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSubtitle() {
        if (d.a(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel.isSubtitle()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "InfoStickerModel{infoStickerDraftDir='" + this.infoStickerDraftDir + '\'' + ", stickers=" + this.stickers + '}';
    }

    public String getOtherEffect() {
        if (d.a(this.stickers)) {
            return "[]";
        }
        JSONArray jSONArray = new JSONArray();
        for (StickerItemModel stickerItemModel : this.stickers) {
            try {
                if (stickerItemModel.type == 10) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", stickerItemModel.stickerId);
                    jSONObject.put(StringSet.type, "giphy");
                    jSONArray.put(jSONObject);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public void addSticker(StickerItemModel stickerItemModel) {
        this.stickers.add(stickerItemModel);
    }

    public void removeSticker(StickerItemModel stickerItemModel) {
        this.stickers.remove(stickerItemModel);
    }

    public InfoStickerModel(InfoStickerModel infoStickerModel) {
        this.infoStickerDraftDir = infoStickerModel.infoStickerDraftDir;
        this.stickers = new ArrayList(infoStickerModel.stickers);
        this.mFontType = infoStickerModel.mFontType;
        this.mFontId = infoStickerModel.mFontId;
        this.mFontPath = infoStickerModel.mFontPath;
        this.mColor = infoStickerModel.mColor;
        this.mBgMode = infoStickerModel.mBgMode;
        this.mAlign = infoStickerModel.mAlign;
        this.mTextAudioLength = infoStickerModel.mTextAudioLength;
    }

    protected InfoStickerModel(Parcel parcel) {
        this.infoStickerDraftDir = parcel.readString();
        this.stickers = parcel.createTypedArrayList(StickerItemModel.CREATOR);
        this.mFontType = parcel.readString();
        this.mFontId = parcel.readString();
        this.mFontPath = parcel.readString();
        this.mColor = parcel.readInt();
        this.mBgMode = parcel.readInt();
        this.mAlign = parcel.readInt();
        this.mTextAudioLength = parcel.readInt();
    }

    public InfoStickerModel(String str) {
        com_ss_android_ugc_aweme_editSticker_model_InfoStickerModel_com_ss_android_ugc_aweme_lancet_LogLancet_d("InfoStickerModel", "InfoStickerModel: ".concat(String.valueOf(str)));
        if (str.endsWith(File.separator)) {
            this.infoStickerDraftDir = str;
        } else {
            this.infoStickerDraftDir = str + File.separator;
        }
        this.stickers = new ArrayList();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.infoStickerDraftDir);
        parcel.writeTypedList(this.stickers);
        parcel.writeString(this.mFontType);
        parcel.writeString(this.mFontId);
        parcel.writeString(this.mFontPath);
        parcel.writeInt(this.mColor);
        parcel.writeInt(this.mBgMode);
        parcel.writeInt(this.mAlign);
        parcel.writeInt(this.mTextAudioLength);
    }
}
