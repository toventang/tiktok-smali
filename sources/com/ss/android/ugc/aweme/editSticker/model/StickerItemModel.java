package com.ss.android.ugc.aweme.editSticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class StickerItemModel implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<StickerItemModel> CREATOR = new Parcelable.Creator<StickerItemModel>() {
        /* class com.ss.android.ugc.aweme.editSticker.model.StickerItemModel.AnonymousClass1 */

        static {
            Covode.recordClassIndex(55472);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StickerItemModel[] newArray(int i2) {
            return new StickerItemModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StickerItemModel createFromParcel(Parcel parcel) {
            return new StickerItemModel(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private transient boolean f88242a;
    @c(a = "current_offsetX")
    public float currentOffsetX;
    @c(a = "current_offsetY")
    public float currentOffsetY;
    @c(a = "cutout")
    public boolean cutout;
    @c(a = "deletable")
    public boolean deletable;
    @c(a = "end_time")
    public int endTime;
    @c(a = "extra")
    public String extra;
    @c(a = "extra2")
    public String extra2;
    @c(a = "extra3")
    public String extra3;
    @c(a = "h")

    /* renamed from: h  reason: collision with root package name */
    public float f88243h;
    private int id;
    @c(a = "in_duration")
    public int inDuration;
    @c(a = "in_path")
    public String inPath;
    @c(a = "in_sticker_id")
    public String inStickerId;
    @c(a = "init_height")
    public float initHeight;
    @c(a = "init_width")
    public float initWidth;
    @c(a = "is_add_veeditor_success")
    public boolean isAddVEEditorSuccess;
    @c(a = "isAnimate")
    public boolean isAnimate;
    @c(a = "is_animation_loop")
    public boolean isAnimationLoop;
    @c(a = "is_enable_interaction")
    public boolean isEnableInteraction;
    public boolean isImageStickerLayer;
    @c(a = "is_pin")
    public boolean isPin;
    @c(a = "layer_weight")
    public int layerWeight;
    public transient String lyricSrtPath;
    @c(a = "lyric_color")
    public int mLyricColor;
    @c(a = "lyric_fontId")
    public String mLyricFontId;
    @c(a = "lyric_fontPath")
    public String mLyricFontPath;
    @c(a = "lyric_in_point")
    public int mLyricInPoint;
    @c(a = "lyric_info")
    public String mLyricInfo;
    @c(a = "lyric_music_loop")
    public boolean mLyricMusicLoop;
    @c(a = "lyric_out_point")
    public int mLyricOutPoint;
    @c(a = "lyric_start_time")
    public int mLyricStartTime;
    @c(a = "normalized_height")
    public float normalizedHeight;
    @c(a = "normalized_width")
    public float normalizedWidth;
    private int originalEndTime;
    private int originalStartTime;
    @c(a = "out_duration")
    public int outDuration;
    @c(a = "out_path")
    public String outPath;
    @c(a = "path")
    public String path;
    @c(a = "pin_algorithm_file")
    public String pinAlgorithmFile;
    @c(a = "angle")
    public float rotateAngle;
    @c(a = "scale")
    public float scale;
    @c(a = "start_time")
    public int startTime;
    @c(a = "stickerDrawScale")
    public float stickerDrawScale;
    @c(a = "sticker_id")
    public String stickerId;
    @c(a = "tab_id")
    public String tabId;
    public int type;
    @c(a = "ui_end_time")
    public int uiEndTime;
    @c(a = "ui_start_time")
    public int uiStartTime;
    @c(a = "uuid")
    public String uuid;
    public transient int viewHash;
    @c(a = "w")
    public float w;
    @c(a = "x")
    public float x;
    @c(a = "y")
    public float y;

    public int describeContents() {
        return 0;
    }

    public int getId() {
        return this.id;
    }

    public int getOriginalEndTime() {
        return this.originalEndTime;
    }

    public int getOriginalStartTime() {
        return this.originalStartTime;
    }

    public String getPinAlgorithmFile() {
        return this.pinAlgorithmFile;
    }

    public String getText() {
        return this.path;
    }

    public boolean isFromSearch() {
        return this.f88242a;
    }

    public boolean isPin() {
        return this.isPin;
    }

    static {
        Covode.recordClassIndex(55471);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public StickerItemModel clone() {
        try {
            return (StickerItemModel) super.clone();
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public boolean isAnimTimestampSticker() {
        if (this.type == 14) {
            return true;
        }
        return false;
    }

    public boolean isImageSticker() {
        if (this.type == 11) {
            return true;
        }
        return false;
    }

    public boolean isLocalHashTagSticker() {
        if (this.type == 13) {
            return true;
        }
        return false;
    }

    public boolean isLyric() {
        if (this.type == 3) {
            return true;
        }
        return false;
    }

    public boolean isMagnifier() {
        return "MagnifierSticker".equals(this.extra);
    }

    public boolean isSubtitle() {
        return "subtitle".equals(this.extra);
    }

    public boolean isSubtitleRule() {
        return "subtitle_rule".equals(this.extra);
    }

    public boolean isTextSticker() {
        int i2 = this.type;
        if (i2 == 2 || i2 == 20) {
            return true;
        }
        return false;
    }

    public StickerItemModel() {
        this.scale = 1.0f;
        this.stickerDrawScale = 1.0f;
        this.currentOffsetX = 0.5f;
        this.currentOffsetY = 0.5f;
        this.mLyricColor = -1;
        this.mLyricMusicLoop = true;
        this.tabId = "";
        this.w = 1.0f;
        this.f88243h = 1.0f;
        this.deletable = true;
        this.isEnableInteraction = true;
        this.normalizedWidth = -1.0f;
        this.normalizedHeight = -1.0f;
    }

    public int hashCode() {
        int i2;
        int i3;
        int id2 = getId() * 31;
        String str = this.stickerId;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (id2 + i2) * 31;
        String str2 = this.path;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        String str3 = this.extra;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i6 + i4;
    }

    public StickerItemModel dumpClonedData() {
        StickerItemModel stickerItemModel = new StickerItemModel(this.stickerId, this.path, this.extra, this.layerWeight, this.isAnimate, this.startTime, this.endTime, this.type);
        stickerItemModel.scale = this.scale;
        stickerItemModel.rotateAngle = this.rotateAngle;
        stickerItemModel.initHeight = this.initHeight;
        stickerItemModel.initWidth = this.initWidth;
        stickerItemModel.currentOffsetX = this.currentOffsetX;
        stickerItemModel.currentOffsetY = this.currentOffsetY;
        stickerItemModel.isAnimate = this.isAnimate;
        stickerItemModel.isImageStickerLayer = this.isImageStickerLayer;
        stickerItemModel.pinAlgorithmFile = this.pinAlgorithmFile;
        stickerItemModel.isPin = this.isPin;
        stickerItemModel.x = this.x;
        stickerItemModel.y = this.y;
        stickerItemModel.w = this.w;
        stickerItemModel.f88243h = this.f88243h;
        stickerItemModel.isAnimationLoop = this.isAnimationLoop;
        stickerItemModel.inStickerId = this.inStickerId;
        stickerItemModel.inPath = this.inPath;
        stickerItemModel.inDuration = this.inDuration;
        stickerItemModel.outPath = this.outPath;
        stickerItemModel.outDuration = this.outDuration;
        return stickerItemModel;
    }

    public String toString() {
        return "StickerItemModel{id=" + getId() + ", stickerId='" + this.stickerId + '\'' + ", path='" + this.path + '\'' + ", extra='" + this.extra + '\'' + ", scale=" + this.scale + ", rotateAngle=" + this.rotateAngle + ", layerWeight=" + this.layerWeight + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", initWidth=" + this.initWidth + ", initHeight=" + this.initHeight + ", currentOffsetX=" + this.currentOffsetX + ", currentOffsetY=" + this.currentOffsetY + ", normalizedWidth=" + this.normalizedWidth + ", normalizedHeight=" + this.normalizedHeight + '}';
    }

    public void setFromSearch(boolean z) {
        this.f88242a = z;
    }

    public void setId(int i2) {
        this.id = i2;
    }

    public void setOriginalEndTime(int i2) {
        this.originalEndTime = i2;
    }

    public void setOriginalStartTime(int i2) {
        this.originalStartTime = i2;
    }

    public void setPin(boolean z) {
        this.isPin = z;
    }

    public void setPinAlgorithmFile(String str) {
        this.pinAlgorithmFile = str;
    }

    public void updateLayerWeight(int i2) {
        this.layerWeight = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerItemModel)) {
            return false;
        }
        StickerItemModel stickerItemModel = (StickerItemModel) obj;
        if (TextUtils.isEmpty(this.uuid) || getId() == 0) {
            if (getId() != stickerItemModel.getId()) {
                return false;
            }
        } else if (!TextUtils.equals(this.uuid, stickerItemModel.uuid)) {
            return false;
        }
        if (!this.path.equals(stickerItemModel.path) || !this.stickerId.equals(stickerItemModel.stickerId)) {
            return false;
        }
        String str = this.extra;
        String str2 = stickerItemModel.extra;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    protected StickerItemModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        this.scale = 1.0f;
        this.stickerDrawScale = 1.0f;
        this.currentOffsetX = 0.5f;
        this.currentOffsetY = 0.5f;
        this.mLyricColor = -1;
        boolean z9 = true;
        this.mLyricMusicLoop = true;
        this.tabId = "";
        this.w = 1.0f;
        this.f88243h = 1.0f;
        this.deletable = true;
        this.isEnableInteraction = true;
        this.normalizedWidth = -1.0f;
        this.normalizedHeight = -1.0f;
        this.stickerId = parcel.readString();
        this.path = parcel.readString();
        this.extra = parcel.readString();
        this.extra2 = parcel.readString();
        this.extra3 = parcel.readString();
        this.scale = parcel.readFloat();
        this.stickerDrawScale = parcel.readFloat();
        this.rotateAngle = parcel.readFloat();
        this.layerWeight = parcel.readInt();
        this.startTime = parcel.readInt();
        this.endTime = parcel.readInt();
        this.uiStartTime = parcel.readInt();
        this.uiEndTime = parcel.readInt();
        this.initWidth = parcel.readFloat();
        this.initHeight = parcel.readFloat();
        this.currentOffsetX = parcel.readFloat();
        this.currentOffsetY = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAnimate = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isImageStickerLayer = z2;
        this.type = parcel.readInt();
        this.pinAlgorithmFile = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isPin = z3;
        this.mLyricInfo = parcel.readString();
        this.mLyricFontPath = parcel.readString();
        this.mLyricFontId = parcel.readString();
        this.mLyricColor = parcel.readInt();
        this.mLyricInPoint = parcel.readInt();
        this.mLyricStartTime = parcel.readInt();
        this.mLyricOutPoint = parcel.readInt();
        this.tabId = parcel.readString();
        this.x = parcel.readFloat();
        this.y = parcel.readFloat();
        this.w = parcel.readFloat();
        this.f88243h = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.cutout = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.deletable = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.isEnableInteraction = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.mLyricMusicLoop = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.isAnimationLoop = z8;
        this.inStickerId = parcel.readString();
        this.inPath = parcel.readString();
        this.inDuration = parcel.readInt();
        this.outPath = parcel.readString();
        this.outDuration = parcel.readInt();
        this.normalizedWidth = parcel.readFloat();
        this.normalizedHeight = parcel.readFloat();
        this.isAddVEEditorSuccess = parcel.readByte() == 0 ? false : z9;
        this.uuid = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.stickerId);
        parcel.writeString(this.path);
        parcel.writeString(this.extra);
        parcel.writeString(this.extra2);
        parcel.writeString(this.extra3);
        parcel.writeFloat(this.scale);
        parcel.writeFloat(this.stickerDrawScale);
        parcel.writeFloat(this.rotateAngle);
        parcel.writeInt(this.layerWeight);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeInt(this.uiStartTime);
        parcel.writeInt(this.uiEndTime);
        parcel.writeFloat(this.initWidth);
        parcel.writeFloat(this.initHeight);
        parcel.writeFloat(this.currentOffsetX);
        parcel.writeFloat(this.currentOffsetY);
        parcel.writeByte(this.isAnimate ? (byte) 1 : 0);
        parcel.writeByte(this.isImageStickerLayer ? (byte) 1 : 0);
        parcel.writeInt(this.type);
        parcel.writeString(this.pinAlgorithmFile);
        parcel.writeByte(this.isPin ? (byte) 1 : 0);
        parcel.writeString(this.mLyricInfo);
        parcel.writeString(this.mLyricFontPath);
        parcel.writeString(this.mLyricFontId);
        parcel.writeInt(this.mLyricColor);
        parcel.writeInt(this.mLyricInPoint);
        parcel.writeInt(this.mLyricStartTime);
        parcel.writeInt(this.mLyricOutPoint);
        parcel.writeString(this.tabId);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.w);
        parcel.writeFloat(this.f88243h);
        parcel.writeByte(this.cutout ? (byte) 1 : 0);
        parcel.writeByte(this.deletable ? (byte) 1 : 0);
        parcel.writeByte(this.isEnableInteraction ? (byte) 1 : 0);
        parcel.writeByte(this.mLyricMusicLoop ? (byte) 1 : 0);
        parcel.writeByte(this.isAnimationLoop ? (byte) 1 : 0);
        parcel.writeString(this.inStickerId);
        parcel.writeString(this.inPath);
        parcel.writeInt(this.inDuration);
        parcel.writeString(this.outPath);
        parcel.writeInt(this.outDuration);
        parcel.writeFloat(this.normalizedWidth);
        parcel.writeFloat(this.normalizedHeight);
        parcel.writeByte(this.isAddVEEditorSuccess ? (byte) 1 : 0);
        parcel.writeString(this.uuid);
    }

    public StickerItemModel(String str, String str2, String str3, int i2, boolean z, int i3, int i4, int i5) {
        this.scale = 1.0f;
        this.stickerDrawScale = 1.0f;
        this.currentOffsetX = 0.5f;
        this.currentOffsetY = 0.5f;
        this.mLyricColor = -1;
        this.mLyricMusicLoop = true;
        this.tabId = "";
        this.w = 1.0f;
        this.f88243h = 1.0f;
        this.deletable = true;
        this.isEnableInteraction = true;
        this.normalizedWidth = -1.0f;
        this.normalizedHeight = -1.0f;
        this.stickerId = str;
        this.path = str2;
        this.extra = str3;
        this.layerWeight = i2;
        this.isAnimate = z;
        this.startTime = i3;
        this.endTime = i4;
        this.type = i5;
    }
}
