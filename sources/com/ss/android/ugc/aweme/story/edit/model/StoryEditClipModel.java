package com.ss.android.ugc.aweme.story.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.c;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.story.record.recordcontrol.StoryWorkspaceImpl;
import h.f.b.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class StoryEditClipModel implements Parcelable, Serializable {
    public static final a CREATOR = new a((byte) 0);
    private String aiMusicRequestTaskId;
    private ArrayList<String> cacheFileList;
    private CanvasVideoData canvasVideoData;
    private final String clipId;
    private CoverPublishModel coverPublishModel;
    private String creationId;
    private StoryEditMusicModel editMusicModel;
    private ArrayList<EffectPointModel> effectList;
    private String encodedAudioOutputFile;
    private List<String> hashTagTextList;
    private InfoStickerModel infoStickerModel;
    private boolean isFastImport;
    private String mCurFilterIds;
    private String mCurFilterLabels;
    private String mSelectedFilterId;
    private float mSelectedFilterIntensity;
    private String mSelectedFilterLabel;
    private String mSelectedFilterResId;
    private String mainBusinessContextStr;
    private List<String> mentionTextList;
    private MultiEditVideoStatusRecordData multiEditVideoRecordData;
    private float musicVolume;
    private int outVideoHeight;
    private int outVideoWidth;
    private String outputFile;
    private String parallelUploadOutputFile;
    private final EditPreviewInfo previewMediaInfo;
    private int selectFilterIndex;
    private final String sessionId;
    private final int sourceContentType;
    private HashMap<String, String> stickerCacheDirMap;
    private String textEffectIds;
    private String textTypes;
    private int videoCanvasHeight;
    private int videoCanvasWidth;
    private final int videoEditorType;
    private float voiceVolume;
    private final h workspace$delegate;

    static {
        Covode.recordClassIndex(90008);
    }

    public final int describeContents() {
        return 0;
    }

    public final Workspace getWorkspace() {
        return (Workspace) this.workspace$delegate.getValue();
    }

    public static final class a implements Parcelable.Creator<StoryEditClipModel> {
        static {
            Covode.recordClassIndex(90009);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StoryEditClipModel[] newArray(int i2) {
            return new StoryEditClipModel[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StoryEditClipModel createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new StoryEditClipModel(parcel);
        }
    }

    public final String getAiMusicRequestTaskId() {
        return this.aiMusicRequestTaskId;
    }

    public final ArrayList<String> getCacheFileList() {
        return this.cacheFileList;
    }

    public final CanvasVideoData getCanvasVideoData() {
        return this.canvasVideoData;
    }

    public final String getClipId() {
        return this.clipId;
    }

    public final CoverPublishModel getCoverPublishModel() {
        return this.coverPublishModel;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final StoryEditMusicModel getEditMusicModel() {
        return this.editMusicModel;
    }

    public final ArrayList<EffectPointModel> getEffectList() {
        return this.effectList;
    }

    public final String getEncodedAudioOutputFile() {
        return this.encodedAudioOutputFile;
    }

    public final List<String> getHashTagTextList() {
        return this.hashTagTextList;
    }

    public final String getMCurFilterIds() {
        return this.mCurFilterIds;
    }

    public final String getMCurFilterLabels() {
        return this.mCurFilterLabels;
    }

    public final String getMSelectedFilterId() {
        return this.mSelectedFilterId;
    }

    public final float getMSelectedFilterIntensity() {
        return this.mSelectedFilterIntensity;
    }

    public final String getMSelectedFilterLabel() {
        return this.mSelectedFilterLabel;
    }

    public final String getMSelectedFilterResId() {
        return this.mSelectedFilterResId;
    }

    public final String getMainBusinessContextStr() {
        return this.mainBusinessContextStr;
    }

    public final List<String> getMentionTextList() {
        return this.mentionTextList;
    }

    public final MultiEditVideoStatusRecordData getMultiEditVideoRecordData() {
        return this.multiEditVideoRecordData;
    }

    public final float getMusicVolume() {
        return this.musicVolume;
    }

    public final int getOutVideoHeight() {
        return this.outVideoHeight;
    }

    public final int getOutVideoWidth() {
        return this.outVideoWidth;
    }

    public final String getOutputFile() {
        return this.outputFile;
    }

    public final String getParallelUploadOutputFile() {
        return this.parallelUploadOutputFile;
    }

    public final EditPreviewInfo getPreviewMediaInfo() {
        return this.previewMediaInfo;
    }

    public final int getSelectFilterIndex() {
        return this.selectFilterIndex;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSourceContentType() {
        return this.sourceContentType;
    }

    public final HashMap<String, String> getStickerCacheDirMap() {
        return this.stickerCacheDirMap;
    }

    public final String getTextEffectIds() {
        return this.textEffectIds;
    }

    public final String getTextTypes() {
        return this.textTypes;
    }

    public final int getVideoCanvasHeight() {
        return this.videoCanvasHeight;
    }

    public final int getVideoCanvasWidth() {
        return this.videoCanvasWidth;
    }

    public final int getVideoEditorType() {
        return this.videoEditorType;
    }

    public final float getVoiceVolume() {
        return this.voiceVolume;
    }

    public final boolean isFastImport() {
        return this.isFastImport;
    }

    static final class b extends m implements h.f.a.a<Workspace> {
        final /* synthetic */ StoryEditClipModel this$0;

        static {
            Covode.recordClassIndex(90010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(StoryEditClipModel storyEditClipModel) {
            super(0);
            this.this$0 = storyEditClipModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Workspace invoke() {
            return c.a(new StoryWorkspaceImpl(this.this$0.getSessionId()));
        }
    }

    public final InfoStickerModel getInfoStickerModel() {
        if (this.infoStickerModel == null) {
            this.infoStickerModel = new InfoStickerModel(a.a(this));
        }
        return this.infoStickerModel;
    }

    public final void setAiMusicRequestTaskId(String str) {
        this.aiMusicRequestTaskId = str;
    }

    public final void setCanvasVideoData(CanvasVideoData canvasVideoData2) {
        this.canvasVideoData = canvasVideoData2;
    }

    public final void setEffectList(ArrayList<EffectPointModel> arrayList) {
        this.effectList = arrayList;
    }

    public final void setFastImport(boolean z) {
        this.isFastImport = z;
    }

    public final void setHashTagTextList(List<String> list) {
        this.hashTagTextList = list;
    }

    public final void setInfoStickerModel(InfoStickerModel infoStickerModel2) {
        this.infoStickerModel = infoStickerModel2;
    }

    public final void setMCurFilterIds(String str) {
        this.mCurFilterIds = str;
    }

    public final void setMCurFilterLabels(String str) {
        this.mCurFilterLabels = str;
    }

    public final void setMSelectedFilterId(String str) {
        this.mSelectedFilterId = str;
    }

    public final void setMSelectedFilterIntensity(float f2) {
        this.mSelectedFilterIntensity = f2;
    }

    public final void setMSelectedFilterLabel(String str) {
        this.mSelectedFilterLabel = str;
    }

    public final void setMSelectedFilterResId(String str) {
        this.mSelectedFilterResId = str;
    }

    public final void setMainBusinessContextStr(String str) {
        this.mainBusinessContextStr = str;
    }

    public final void setMentionTextList(List<String> list) {
        this.mentionTextList = list;
    }

    public final void setMultiEditVideoRecordData(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        this.multiEditVideoRecordData = multiEditVideoStatusRecordData;
    }

    public final void setMusicVolume(float f2) {
        this.musicVolume = f2;
    }

    public final void setOutVideoHeight(int i2) {
        this.outVideoHeight = i2;
    }

    public final void setOutVideoWidth(int i2) {
        this.outVideoWidth = i2;
    }

    public final void setSelectFilterIndex(int i2) {
        this.selectFilterIndex = i2;
    }

    public final void setVideoCanvasHeight(int i2) {
        this.videoCanvasHeight = i2;
    }

    public final void setVideoCanvasWidth(int i2) {
        this.videoCanvasWidth = i2;
    }

    public final void setVoiceVolume(float f2) {
        this.voiceVolume = f2;
    }

    public final void setCoverPublishModel(CoverPublishModel coverPublishModel2) {
        l.d(coverPublishModel2, "");
        this.coverPublishModel = coverPublishModel2;
    }

    public final void setCreationId(String str) {
        l.d(str, "");
        this.creationId = str;
    }

    public final void setEditMusicModel(StoryEditMusicModel storyEditMusicModel) {
        l.d(storyEditMusicModel, "");
        this.editMusicModel = storyEditMusicModel;
    }

    public final void setEncodedAudioOutputFile(String str) {
        l.d(str, "");
        this.encodedAudioOutputFile = str;
    }

    public final void setOutputFile(String str) {
        l.d(str, "");
        this.outputFile = str;
    }

    public final void setParallelUploadOutputFile(String str) {
        l.d(str, "");
        this.parallelUploadOutputFile = str;
    }

    public final void setStickerCacheDirMap(HashMap<String, String> hashMap) {
        l.d(hashMap, "");
        this.stickerCacheDirMap = hashMap;
    }

    public final void setTextEffectIds(String str) {
        l.d(str, "");
        this.textEffectIds = str;
    }

    public final void setTextTypes(String str) {
        l.d(str, "");
        this.textTypes = str;
    }

    public final void addCacheFile(String str) {
        l.d(str, "");
        this.cacheFileList.add(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StoryEditClipModel(android.os.Parcel r21) {
        /*
        // Method dump skipped, instructions count: 416
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.sessionId);
        parcel.writeParcelable(this.previewMediaInfo, i2);
        parcel.writeInt(this.videoEditorType);
        parcel.writeInt(this.sourceContentType);
        parcel.writeString(this.clipId);
        parcel.writeString(this.creationId);
        parcel.writeFloat(this.voiceVolume);
        parcel.writeFloat(this.musicVolume);
        parcel.writeParcelable(this.coverPublishModel, i2);
        parcel.writeByte(this.isFastImport ? (byte) 1 : 0);
        parcel.writeInt(this.outVideoWidth);
        parcel.writeInt(this.outVideoHeight);
        parcel.writeInt(this.videoCanvasWidth);
        parcel.writeInt(this.videoCanvasHeight);
        parcel.writeInt(this.selectFilterIndex);
        parcel.writeString(this.mCurFilterLabels);
        parcel.writeString(this.mCurFilterIds);
        parcel.writeString(this.mSelectedFilterId);
        parcel.writeString(this.mSelectedFilterLabel);
        parcel.writeString(this.mSelectedFilterResId);
        parcel.writeFloat(this.mSelectedFilterIntensity);
        parcel.writeString(this.outputFile);
        parcel.writeString(this.parallelUploadOutputFile);
        parcel.writeString(this.encodedAudioOutputFile);
        parcel.writeTypedList(this.effectList);
        parcel.writeParcelable(this.editMusicModel, i2);
        parcel.writeParcelable(getInfoStickerModel(), i2);
        parcel.writeString(this.mainBusinessContextStr);
        parcel.writeString(this.aiMusicRequestTaskId);
        parcel.writeParcelable(this.multiEditVideoRecordData, i2);
        parcel.writeString(this.textTypes);
        parcel.writeString(this.textEffectIds);
        parcel.writeStringList(this.mentionTextList);
        parcel.writeStringList(this.hashTagTextList);
        parcel.writeSerializable(this.canvasVideoData);
        parcel.writeSerializable(this.stickerCacheDirMap);
        parcel.writeStringList(this.cacheFileList);
    }

    public StoryEditClipModel(String str, EditPreviewInfo editPreviewInfo, int i2, int i3, String str2) {
        float f2;
        l.d(editPreviewInfo, "");
        l.d(str2, "");
        this.sessionId = str;
        this.previewMediaInfo = editPreviewInfo;
        this.videoEditorType = i2;
        this.sourceContentType = i3;
        this.clipId = str2;
        this.workspace$delegate = i.a((h.f.a.a) new b(this));
        this.creationId = "";
        if (i3 == 2) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        this.voiceVolume = f2;
        this.musicVolume = 1.0f;
        this.coverPublishModel = new CoverPublishModel(null, 0.0f, 0.0f, 0.0f, null, false, 0.0f, 0, false, null, null, 0, 0.0f, 0.0f, 16383, null);
        this.mSelectedFilterIntensity = -1.0f;
        File h2 = c.a().h();
        l.b(h2, "");
        String path = h2.getPath();
        l.b(path, "");
        this.outputFile = path;
        File j2 = getWorkspace().j();
        l.b(j2, "");
        String path2 = j2.getPath();
        l.b(path2, "");
        this.parallelUploadOutputFile = path2;
        File i4 = getWorkspace().i();
        l.b(i4, "");
        String path3 = i4.getPath();
        l.b(path3, "");
        this.encodedAudioOutputFile = path3;
        this.editMusicModel = new StoryEditMusicModel(null, null, null, 0, 0, 0, 0, 0, false, null, 1023, null);
        this.textTypes = "";
        this.textEffectIds = "";
        this.stickerCacheDirMap = new HashMap<>();
        this.cacheFileList = new ArrayList<>();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryEditClipModel(String str, EditPreviewInfo editPreviewInfo, int i2, int i3, String str2, int i4, g gVar) {
        this(str, editPreviewInfo, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 1 : i3, (i4 & 16) != 0 ? String.valueOf(SystemClock.elapsedRealtimeNanos()) : str2);
    }
}
