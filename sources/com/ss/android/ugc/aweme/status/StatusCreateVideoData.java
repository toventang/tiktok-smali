package com.ss.android.ugc.aweme.status;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class StatusCreateVideoData implements Parcelable, Serializable {
    public static final a CREATOR = new a((byte) 0);
    @c(a = "status_background_selected_from")
    private String bgFrom;
    @c(a = "status_background_height")
    private int bgHeight;
    @c(a = "bg_id")
    private String bgId;
    @c(a = "bg_path")
    private String bgPath;
    @c(a = "status_background_size")
    private int bgSize;
    @c(a = "status_background_src_image")
    private String bgSrcImage;
    @c(a = "status_background_width")
    private int bgWidth;
    @c(a = "effect_id")
    private String effectId;
    @c(a = "effect_path")
    private String effectPath;
    @c(a = "status_music_ids")
    private List<String> musicIds;
    @c(a = "music_path")
    private String musicPath;
    @c(a = "key_status_type")
    private int statusType;
    @c(a = "status_template_text")
    private String templateText;
    @c(a = "status_user_text")
    private String userText;
    @c(a = "status_video_cover")
    private String videoCoverImgPath;
    @c(a = "status_video_cover_starttime")
    private int videoCoverStartTime;

    static {
        Covode.recordClassIndex(88019);
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable.Creator<StatusCreateVideoData> {
        static {
            Covode.recordClassIndex(88020);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StatusCreateVideoData[] newArray(int i2) {
            return new StatusCreateVideoData[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StatusCreateVideoData createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new StatusCreateVideoData(parcel);
        }
    }

    public final String getBgFrom() {
        return this.bgFrom;
    }

    public final int getBgHeight() {
        return this.bgHeight;
    }

    public final String getBgId() {
        return this.bgId;
    }

    public final String getBgPath() {
        return this.bgPath;
    }

    public final int getBgSize() {
        return this.bgSize;
    }

    public final String getBgSrcImage() {
        return this.bgSrcImage;
    }

    public final int getBgWidth() {
        return this.bgWidth;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getEffectPath() {
        return this.effectPath;
    }

    public final List<String> getMusicIds() {
        return this.musicIds;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final int getStatusType() {
        return this.statusType;
    }

    public final String getTemplateText() {
        return this.templateText;
    }

    public final String getUserText() {
        return this.userText;
    }

    public final String getVideoCoverImgPath() {
        return this.videoCoverImgPath;
    }

    public final int getVideoCoverStartTime() {
        return this.videoCoverStartTime;
    }

    public StatusCreateVideoData() {
        this.statusType = -1;
        this.bgPath = "";
        this.bgId = "";
        this.bgFrom = "template";
        this.bgSrcImage = "";
        this.musicPath = "";
        this.effectPath = "";
        this.effectId = "";
        this.musicIds = new ArrayList();
        this.templateText = "";
        this.userText = "";
    }

    public final void setBgHeight(int i2) {
        this.bgHeight = i2;
    }

    public final void setBgSize(int i2) {
        this.bgSize = i2;
    }

    public final void setBgWidth(int i2) {
        this.bgWidth = i2;
    }

    public final void setStatusType(int i2) {
        this.statusType = i2;
    }

    public final void setVideoCoverImgPath(String str) {
        this.videoCoverImgPath = str;
    }

    public final void setVideoCoverStartTime(int i2) {
        this.videoCoverStartTime = i2;
    }

    public final void setBgFrom(String str) {
        l.d(str, "");
        this.bgFrom = str;
    }

    public final void setBgId(String str) {
        l.d(str, "");
        this.bgId = str;
    }

    public final void setBgPath(String str) {
        l.d(str, "");
        this.bgPath = str;
    }

    public final void setBgSrcImage(String str) {
        l.d(str, "");
        this.bgSrcImage = str;
    }

    public final void setEffectId(String str) {
        l.d(str, "");
        this.effectId = str;
    }

    public final void setEffectPath(String str) {
        l.d(str, "");
        this.effectPath = str;
    }

    public final void setMusicIds(List<String> list) {
        l.d(list, "");
        this.musicIds = list;
    }

    public final void setMusicPath(String str) {
        l.d(str, "");
        this.musicPath = str;
    }

    public final void setTemplateText(String str) {
        l.d(str, "");
        this.templateText = str;
    }

    public final void setUserText(String str) {
        l.d(str, "");
        this.userText = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StatusCreateVideoData(Parcel parcel) {
        this();
        String str = "";
        l.d(parcel, str);
        this.statusType = parcel.readInt();
        String readString = parcel.readString();
        this.bgPath = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.bgId = readString2 == null ? str : readString2;
        String readString3 = parcel.readString();
        this.bgFrom = readString3 == null ? str : readString3;
        this.bgSize = parcel.readInt();
        this.bgWidth = parcel.readInt();
        this.bgHeight = parcel.readInt();
        String readString4 = parcel.readString();
        if (readString4 == null) {
            l.b();
        }
        this.bgSrcImage = readString4;
        String readString5 = parcel.readString();
        this.musicPath = readString5 == null ? str : readString5;
        String readString6 = parcel.readString();
        this.effectPath = readString6 == null ? str : readString6;
        String readString7 = parcel.readString();
        this.effectId = readString7 == null ? str : readString7;
        List<String> list = this.musicIds;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        parcel.readList(list, String.class.getClassLoader());
        String readString8 = parcel.readString();
        this.videoCoverImgPath = readString8 == null ? str : readString8;
        this.videoCoverStartTime = parcel.readInt();
        String readString9 = parcel.readString();
        this.templateText = readString9 == null ? str : readString9;
        String readString10 = parcel.readString();
        this.userText = readString10 != null ? readString10 : str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        if (parcel != null) {
            parcel.writeInt(this.statusType);
            parcel.writeString(this.bgPath);
            parcel.writeString(this.bgId);
            parcel.writeString(this.bgFrom);
            parcel.writeInt(this.bgSize);
            parcel.writeInt(this.bgWidth);
            parcel.writeInt(this.bgHeight);
            parcel.writeString(this.bgSrcImage);
            parcel.writeString(this.musicPath);
            parcel.writeString(this.effectPath);
            parcel.writeString(this.effectId);
            List<String> list = this.musicIds;
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            parcel.writeList(list);
            parcel.writeString(this.videoCoverImgPath);
            parcel.writeInt(this.videoCoverStartTime);
            parcel.writeString(this.templateText);
            parcel.writeString(this.userText);
        }
    }
}
