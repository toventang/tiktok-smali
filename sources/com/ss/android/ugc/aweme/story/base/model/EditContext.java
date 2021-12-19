package com.ss.android.ugc.aweme.story.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import h.f.b.g;
import h.f.b.l;
import java.io.File;
import java.io.Serializable;
import java.util.List;

public final class EditContext implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditContext> CREATOR = new a();
    private final List<String> arTextList;
    private final String cameraIds;
    private final List<String> cameraLensInfo;
    private final int cameraPosition;
    private final boolean containBackgroundVideo;
    private final ETParams etParams;
    private final ExtractFramesModel extractFramesModel;
    private final String isWestWindowExist;
    private final List<String> messageBubbleTexts;
    private final String metadataMapStr;
    private final boolean publishWithAnim;
    private final File recordTempDir;
    private final long shootTimestamp;
    private final StickerInfo stickerInfo;
    private final String stickers;
    private final String videoSegmentDesc;

    static {
        Covode.recordClassIndex(89474);
    }

    public EditContext() {
        this(null, null, null, false, null, null, null, null, 0, null, null, null, null, false, 0, null, 65535, null);
    }

    public static int com_ss_android_ugc_aweme_story_base_model_EditContext_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_story_base_model_EditContext_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ EditContext copy$default(EditContext editContext, ETParams eTParams, String str, ExtractFramesModel extractFramesModel2, boolean z, File file, List list, List list2, String str2, int i2, String str3, List list3, String str4, StickerInfo stickerInfo2, boolean z2, long j2, String str5, int i3, Object obj) {
        String str6 = str;
        ETParams eTParams2 = eTParams;
        List list4 = list;
        File file2 = file;
        boolean z3 = z;
        ExtractFramesModel extractFramesModel3 = extractFramesModel2;
        String str7 = str3;
        int i4 = i2;
        String str8 = str2;
        List list5 = list2;
        boolean z4 = z2;
        StickerInfo stickerInfo3 = stickerInfo2;
        String str9 = str4;
        List list6 = list3;
        String str10 = str5;
        long j3 = j2;
        if ((i3 & 1) != 0) {
            eTParams2 = editContext.etParams;
        }
        if ((i3 & 2) != 0) {
            str6 = editContext.stickers;
        }
        if ((i3 & 4) != 0) {
            extractFramesModel3 = editContext.extractFramesModel;
        }
        if ((i3 & 8) != 0) {
            z3 = editContext.publishWithAnim;
        }
        if ((i3 & 16) != 0) {
            file2 = editContext.recordTempDir;
        }
        if ((i3 & 32) != 0) {
            list4 = editContext.arTextList;
        }
        if ((i3 & 64) != 0) {
            list5 = editContext.messageBubbleTexts;
        }
        if ((i3 & 128) != 0) {
            str8 = editContext.videoSegmentDesc;
        }
        if ((i3 & 256) != 0) {
            i4 = editContext.cameraPosition;
        }
        if ((i3 & 512) != 0) {
            str7 = editContext.cameraIds;
        }
        if ((i3 & 1024) != 0) {
            list6 = editContext.cameraLensInfo;
        }
        if ((i3 & 2048) != 0) {
            str9 = editContext.metadataMapStr;
        }
        if ((i3 & 4096) != 0) {
            stickerInfo3 = editContext.stickerInfo;
        }
        if ((i3 & 8192) != 0) {
            z4 = editContext.containBackgroundVideo;
        }
        if ((i3 & 16384) != 0) {
            j3 = editContext.shootTimestamp;
        }
        if ((i3 & 32768) != 0) {
            str10 = editContext.isWestWindowExist;
        }
        return editContext.copy(eTParams2, str6, extractFramesModel3, z3, file2, list4, list5, str8, i4, str7, list6, str9, stickerInfo3, z4, j3, str10);
    }

    public final ETParams component1() {
        return this.etParams;
    }

    public final String component10() {
        return this.cameraIds;
    }

    public final List<String> component11() {
        return this.cameraLensInfo;
    }

    public final String component12() {
        return this.metadataMapStr;
    }

    public final StickerInfo component13() {
        return this.stickerInfo;
    }

    public final boolean component14() {
        return this.containBackgroundVideo;
    }

    public final long component15() {
        return this.shootTimestamp;
    }

    public final String component16() {
        return this.isWestWindowExist;
    }

    public final String component2() {
        return this.stickers;
    }

    public final ExtractFramesModel component3() {
        return this.extractFramesModel;
    }

    public final boolean component4() {
        return this.publishWithAnim;
    }

    public final File component5() {
        return this.recordTempDir;
    }

    public final List<String> component6() {
        return this.arTextList;
    }

    public final List<String> component7() {
        return this.messageBubbleTexts;
    }

    public final String component8() {
        return this.videoSegmentDesc;
    }

    public final int component9() {
        return this.cameraPosition;
    }

    public final EditContext copy(ETParams eTParams, String str, ExtractFramesModel extractFramesModel2, boolean z, File file, List<String> list, List<String> list2, String str2, int i2, String str3, List<String> list3, String str4, StickerInfo stickerInfo2, boolean z2, long j2, String str5) {
        l.d(str5, "");
        return new EditContext(eTParams, str, extractFramesModel2, z, file, list, list2, str2, i2, str3, list3, str4, stickerInfo2, z2, j2, str5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditContext)) {
            return false;
        }
        EditContext editContext = (EditContext) obj;
        return l.a(this.etParams, editContext.etParams) && l.a(this.stickers, editContext.stickers) && l.a(this.extractFramesModel, editContext.extractFramesModel) && this.publishWithAnim == editContext.publishWithAnim && l.a(this.recordTempDir, editContext.recordTempDir) && l.a(this.arTextList, editContext.arTextList) && l.a(this.messageBubbleTexts, editContext.messageBubbleTexts) && l.a(this.videoSegmentDesc, editContext.videoSegmentDesc) && this.cameraPosition == editContext.cameraPosition && l.a(this.cameraIds, editContext.cameraIds) && l.a(this.cameraLensInfo, editContext.cameraLensInfo) && l.a(this.metadataMapStr, editContext.metadataMapStr) && l.a(this.stickerInfo, editContext.stickerInfo) && this.containBackgroundVideo == editContext.containBackgroundVideo && this.shootTimestamp == editContext.shootTimestamp && l.a(this.isWestWindowExist, editContext.isWestWindowExist);
    }

    public final int hashCode() {
        ETParams eTParams = this.etParams;
        int i2 = 0;
        int hashCode = (eTParams != null ? eTParams.hashCode() : 0) * 31;
        String str = this.stickers;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        ExtractFramesModel extractFramesModel2 = this.extractFramesModel;
        int hashCode3 = (hashCode2 + (extractFramesModel2 != null ? extractFramesModel2.hashCode() : 0)) * 31;
        boolean z = this.publishWithAnim;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode3 + i4) * 31;
        File file = this.recordTempDir;
        int hashCode4 = (i7 + (file != null ? file.hashCode() : 0)) * 31;
        List<String> list = this.arTextList;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.messageBubbleTexts;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.videoSegmentDesc;
        int hashCode7 = (((hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_story_base_model_EditContext_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.cameraPosition)) * 31;
        String str3 = this.cameraIds;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list3 = this.cameraLensInfo;
        int hashCode9 = (hashCode8 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str4 = this.metadataMapStr;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31;
        StickerInfo stickerInfo2 = this.stickerInfo;
        int hashCode11 = (hashCode10 + (stickerInfo2 != null ? stickerInfo2.hashCode() : 0)) * 31;
        if (!this.containBackgroundVideo) {
            i3 = 0;
        }
        int com_ss_android_ugc_aweme_story_base_model_EditContext_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode11 + i3) * 31) + com_ss_android_ugc_aweme_story_base_model_EditContext_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.shootTimestamp)) * 31;
        String str5 = this.isWestWindowExist;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return com_ss_android_ugc_aweme_story_base_model_EditContext_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i2;
    }

    public final String toString() {
        return "EditContext(etParams=" + this.etParams + ", stickers=" + this.stickers + ", extractFramesModel=" + this.extractFramesModel + ", publishWithAnim=" + this.publishWithAnim + ", recordTempDir=" + this.recordTempDir + ", arTextList=" + this.arTextList + ", messageBubbleTexts=" + this.messageBubbleTexts + ", videoSegmentDesc=" + this.videoSegmentDesc + ", cameraPosition=" + this.cameraPosition + ", cameraIds=" + this.cameraIds + ", cameraLensInfo=" + this.cameraLensInfo + ", metadataMapStr=" + this.metadataMapStr + ", stickerInfo=" + this.stickerInfo + ", containBackgroundVideo=" + this.containBackgroundVideo + ", shootTimestamp=" + this.shootTimestamp + ", isWestWindowExist=" + this.isWestWindowExist + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        ETParams eTParams = this.etParams;
        if (eTParams != null) {
            parcel.writeInt(1);
            eTParams.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.stickers);
        parcel.writeSerializable(this.extractFramesModel);
        parcel.writeInt(this.publishWithAnim ? 1 : 0);
        parcel.writeSerializable(this.recordTempDir);
        parcel.writeStringList(this.arTextList);
        parcel.writeStringList(this.messageBubbleTexts);
        parcel.writeString(this.videoSegmentDesc);
        parcel.writeInt(this.cameraPosition);
        parcel.writeString(this.cameraIds);
        parcel.writeStringList(this.cameraLensInfo);
        parcel.writeString(this.metadataMapStr);
        parcel.writeSerializable(this.stickerInfo);
        parcel.writeInt(this.containBackgroundVideo ? 1 : 0);
        parcel.writeLong(this.shootTimestamp);
        parcel.writeString(this.isWestWindowExist);
    }

    public final List<String> getArTextList() {
        return this.arTextList;
    }

    public final String getCameraIds() {
        return this.cameraIds;
    }

    public final List<String> getCameraLensInfo() {
        return this.cameraLensInfo;
    }

    public final int getCameraPosition() {
        return this.cameraPosition;
    }

    public final boolean getContainBackgroundVideo() {
        return this.containBackgroundVideo;
    }

    public final ETParams getEtParams() {
        return this.etParams;
    }

    public final ExtractFramesModel getExtractFramesModel() {
        return this.extractFramesModel;
    }

    public final List<String> getMessageBubbleTexts() {
        return this.messageBubbleTexts;
    }

    public final String getMetadataMapStr() {
        return this.metadataMapStr;
    }

    public final boolean getPublishWithAnim() {
        return this.publishWithAnim;
    }

    public final File getRecordTempDir() {
        return this.recordTempDir;
    }

    public final long getShootTimestamp() {
        return this.shootTimestamp;
    }

    public final StickerInfo getStickerInfo() {
        return this.stickerInfo;
    }

    public final String getStickers() {
        return this.stickers;
    }

    public final String getVideoSegmentDesc() {
        return this.videoSegmentDesc;
    }

    public final String isWestWindowExist() {
        return this.isWestWindowExist;
    }

    public static class a implements Parcelable.Creator<EditContext> {
        static {
            Covode.recordClassIndex(89475);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EditContext[] newArray(int i2) {
            return new EditContext[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EditContext createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new EditContext(parcel.readInt() != 0 ? ETParams.CREATOR.createFromParcel(parcel) : null, parcel.readString(), (ExtractFramesModel) parcel.readSerializable(), parcel.readInt() != 0, (File) parcel.readSerializable(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), (StickerInfo) parcel.readSerializable(), parcel.readInt() != 0, parcel.readLong(), parcel.readString());
        }
    }

    public EditContext(ETParams eTParams, String str, ExtractFramesModel extractFramesModel2, boolean z, File file, List<String> list, List<String> list2, String str2, int i2, String str3, List<String> list3, String str4, StickerInfo stickerInfo2, boolean z2, long j2, String str5) {
        l.d(str5, "");
        this.etParams = eTParams;
        this.stickers = str;
        this.extractFramesModel = extractFramesModel2;
        this.publishWithAnim = z;
        this.recordTempDir = file;
        this.arTextList = list;
        this.messageBubbleTexts = list2;
        this.videoSegmentDesc = str2;
        this.cameraPosition = i2;
        this.cameraIds = str3;
        this.cameraLensInfo = list3;
        this.metadataMapStr = str4;
        this.stickerInfo = stickerInfo2;
        this.containBackgroundVideo = z2;
        this.shootTimestamp = j2;
        this.isWestWindowExist = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditContext(ETParams eTParams, String str, ExtractFramesModel extractFramesModel2, boolean z, File file, List list, List list2, String str2, int i2, String str3, List list3, String str4, StickerInfo stickerInfo2, boolean z2, long j2, String str5, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : eTParams, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : extractFramesModel2, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? null : file, (i3 & 32) != 0 ? null : list, (i3 & 64) != 0 ? null : list2, (i3 & 128) != 0 ? null : str2, (i3 & 256) != 0 ? 0 : i2, (i3 & 512) != 0 ? null : str3, (i3 & 1024) != 0 ? null : list3, (i3 & 2048) != 0 ? null : str4, (i3 & 4096) == 0 ? stickerInfo2 : null, (i3 & 8192) == 0 ? z2 : false, (i3 & 16384) != 0 ? -1 : j2, (i3 & 32768) != 0 ? "" : str5);
    }
}
