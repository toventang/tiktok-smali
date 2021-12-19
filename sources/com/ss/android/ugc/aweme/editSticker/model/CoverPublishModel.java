package com.ss.android.ugc.aweme.editSticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class CoverPublishModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CoverPublishModel> CREATOR = new a();
    @c(a = "ai_cover_index")
    private int aiCoverIndex;
    @c(a = "ai_cover_start_time")
    private float aiCoverStartTime;
    @c(a = "effect_text_model")
    private final EffectTextModel effectTextModel;
    @c(a = "image_cover_view_trans_x")
    private float imageCoverViewTransX;
    @c(a = "image_cover_view_trans_y")
    private float imageCoverViewTransY;
    @c(a = "image_current_index")
    private int imageCurrentIndex;
    @c(a = "is_ai_recommend_cover")
    private boolean isAiRecommendCover;
    @c(a = "need_expand_compiled_size")
    private boolean needExpandCompiledSize;
    @c(a = "cover_recommend_title")
    private List<RecCoverTitleBean> recTitleList;
    @c(a = "save_rec_title_id")
    private String saveTitleId;
    @c(a = "video_cover_view_trans_x")
    private float videoCoverViewTransX;
    @c(a = "video_cover_view_trans_y")
    private float videoCoverViewTransY;
    @c(a = "video_cover_view_x")
    private float videoCoverViewX;
    @c(a = "video_cover_crop_path")
    private String videoCropCoverPath;

    static {
        Covode.recordClassIndex(55459);
    }

    public CoverPublishModel() {
        this(null, 0.0f, 0.0f, 0.0f, null, false, 0.0f, 0, false, null, null, 0, 0.0f, 0.0f, 16383, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeParcelable(this.effectTextModel, i2);
        parcel.writeFloat(this.videoCoverViewX);
        parcel.writeFloat(this.videoCoverViewTransX);
        parcel.writeFloat(this.videoCoverViewTransY);
        parcel.writeString(this.videoCropCoverPath);
        parcel.writeInt(this.needExpandCompiledSize ? 1 : 0);
        parcel.writeFloat(this.aiCoverStartTime);
        parcel.writeInt(this.aiCoverIndex);
        parcel.writeInt(this.isAiRecommendCover ? 1 : 0);
        List<RecCoverTitleBean> list = this.recTitleList;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (RecCoverTitleBean recCoverTitleBean : list) {
                recCoverTitleBean.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.saveTitleId);
        parcel.writeInt(this.imageCurrentIndex);
        parcel.writeFloat(this.imageCoverViewTransX);
        parcel.writeFloat(this.imageCoverViewTransY);
    }

    public final int getAiCoverIndex() {
        return this.aiCoverIndex;
    }

    public final float getAiCoverStartTime() {
        return this.aiCoverStartTime;
    }

    public final EffectTextModel getEffectTextModel() {
        return this.effectTextModel;
    }

    public final float getImageCoverViewTransX() {
        return this.imageCoverViewTransX;
    }

    public final float getImageCoverViewTransY() {
        return this.imageCoverViewTransY;
    }

    public final int getImageCurrentIndex() {
        return this.imageCurrentIndex;
    }

    public final boolean getNeedExpandCompiledSize() {
        return this.needExpandCompiledSize;
    }

    public final List<RecCoverTitleBean> getRecTitleList() {
        return this.recTitleList;
    }

    public final String getSaveTitleId() {
        return this.saveTitleId;
    }

    public final float getVideoCoverViewTransX() {
        return this.videoCoverViewTransX;
    }

    public final float getVideoCoverViewTransY() {
        return this.videoCoverViewTransY;
    }

    public final float getVideoCoverViewX() {
        return this.videoCoverViewX;
    }

    public final String getVideoCropCoverPath() {
        return this.videoCropCoverPath;
    }

    public final boolean isAiRecommendCover() {
        return this.isAiRecommendCover;
    }

    public static class a implements Parcelable.Creator<CoverPublishModel> {
        static {
            Covode.recordClassIndex(55460);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CoverPublishModel[] newArray(int i2) {
            return new CoverPublishModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CoverPublishModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            l.d(parcel, "");
            EffectTextModel effectTextModel = (EffectTextModel) parcel.readParcelable(CoverPublishModel.class.getClassLoader());
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            float readFloat3 = parcel.readFloat();
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            float readFloat4 = parcel.readFloat();
            int readInt = parcel.readInt();
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList.add(RecCoverTitleBean.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            } else {
                arrayList = null;
            }
            return new CoverPublishModel(effectTextModel, readFloat, readFloat2, readFloat3, readString, z, readFloat4, readInt, z2, arrayList, parcel.readString(), parcel.readInt(), parcel.readFloat(), parcel.readFloat());
        }
    }

    public final void setAiCoverIndex(int i2) {
        this.aiCoverIndex = i2;
    }

    public final void setAiCoverStartTime(float f2) {
        this.aiCoverStartTime = f2;
    }

    public final void setAiRecommendCover(boolean z) {
        this.isAiRecommendCover = z;
    }

    public final void setImageCoverViewTransX(float f2) {
        this.imageCoverViewTransX = f2;
    }

    public final void setImageCoverViewTransY(float f2) {
        this.imageCoverViewTransY = f2;
    }

    public final void setImageCurrentIndex(int i2) {
        this.imageCurrentIndex = i2;
    }

    public final void setNeedExpandCompiledSize(boolean z) {
        this.needExpandCompiledSize = z;
    }

    public final void setRecTitleList(List<RecCoverTitleBean> list) {
        this.recTitleList = list;
    }

    public final void setSaveTitleId(String str) {
        this.saveTitleId = str;
    }

    public final void setVideoCoverViewTransX(float f2) {
        this.videoCoverViewTransX = f2;
    }

    public final void setVideoCoverViewTransY(float f2) {
        this.videoCoverViewTransY = f2;
    }

    public final void setVideoCoverViewX(float f2) {
        this.videoCoverViewX = f2;
    }

    public final void setVideoCropCoverPath(String str) {
        this.videoCropCoverPath = str;
    }

    public CoverPublishModel(EffectTextModel effectTextModel2, float f2, float f3, float f4, String str, boolean z, float f5, int i2, boolean z2, List<RecCoverTitleBean> list, String str2, int i3, float f6, float f7) {
        l.d(effectTextModel2, "");
        this.effectTextModel = effectTextModel2;
        this.videoCoverViewX = f2;
        this.videoCoverViewTransX = f3;
        this.videoCoverViewTransY = f4;
        this.videoCropCoverPath = str;
        this.needExpandCompiledSize = z;
        this.aiCoverStartTime = f5;
        this.aiCoverIndex = i2;
        this.isAiRecommendCover = z2;
        this.recTitleList = list;
        this.saveTitleId = str2;
        this.imageCurrentIndex = i3;
        this.imageCoverViewTransX = f6;
        this.imageCoverViewTransY = f7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoverPublishModel(EffectTextModel effectTextModel2, float f2, float f3, float f4, String str, boolean z, float f5, int i2, boolean z2, List list, String str2, int i3, float f6, float f7, int i4, g gVar) {
        this((i4 & 1) != 0 ? new EffectTextModel(false, null, null, null, null, 31, null) : effectTextModel2, (i4 & 2) != 0 ? 0.0f : f2, (i4 & 4) != 0 ? 0.0f : f3, (i4 & 8) != 0 ? 0.0f : f4, (i4 & 16) != 0 ? null : str, (i4 & 32) != 0 ? false : z, (i4 & 64) == 0 ? f5 : 0.0f, (i4 & 128) != 0 ? -1 : i2, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? null : list, (i4 & 1024) == 0 ? str2 : null, (i4 & 2048) == 0 ? i3 : 0, (i4 & 4096) != 0 ? -1.0f : f6, (i4 & 8192) == 0 ? f7 : -1.0f);
    }
}
