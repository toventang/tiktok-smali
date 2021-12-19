package dmt.av.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.creativex.editor.preview.a;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.effect.MultiSegmentPropExtra;
import com.ss.android.ugc.aweme.mvtheme.d;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VEEditorModel;
import com.ss.android.vesdk.bg;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class VEPreviewParams implements Parcelable, a, Serializable {
    public static final Parcelable.Creator<VEPreviewParams> CREATOR = new Parcelable.Creator<VEPreviewParams>() {
        /* class dmt.av.video.VEPreviewParams.AnonymousClass1 */

        static {
            Covode.recordClassIndex(104102);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEPreviewParams[] newArray(int i2) {
            return new VEPreviewParams[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEPreviewParams createFromParcel(Parcel parcel) {
            return new VEPreviewParams(parcel);
        }
    };
    public long audioAecDelayTime;
    public CanvasVideoData canvasVideoPreviewData;
    private boolean enableMusicSync;
    public boolean isCutSameType;
    public boolean isFastImport;
    public boolean isFromCut;
    public boolean isMusicSyncMode;
    public boolean isStoryEditMode;
    public boolean isVideoImageMixFastImport;
    public String[] mAudioPaths;
    public int mCanvasHeight;
    public int mCanvasWidth;
    public long mEditorHandler;
    public VEEditorModel mEditorModel;
    public boolean mEnableAutoStart;
    public int mFps;
    public boolean mIsFromDraft;
    public int mMusicInPoint;
    public int mMusicOutPoint;
    public String mMusicPath;
    public float mMusicVolume;
    public int mPageType;
    public int mPreviewHeight;
    public int mPreviewWidth;
    public int[] mRotateArray;
    public float[] mSpeedArray;
    public bg mTimelineParams;
    public int[] mVTrimIn;
    public int[] mVTrimOut;
    public AudioEffectParam mVeAudioEffectParam;
    public AudioRecorderParam mVeAudioRecordParam;
    public String[] mVideoPaths;
    public float mVolume;
    public String mWorkspace;
    public d mvCreateVideoData;
    public boolean needVEUserConfig;
    public MultiEditVideoStatusRecordData recordData;
    public int sceneIn;
    public int sceneOut;
    public SingleImageCoverBitmapData singleImageCoverBitmapData;
    public StitchParams stitchParams;
    public VECherEffectParam veCherEffectParam;
    public int videoEditorType;

    public int describeContents() {
        return 0;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public MultiSegmentPropExtra getMultiSegmentPropInfo() {
        return null;
    }

    public String getRecordStickers() {
        return null;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public List<IAudioEffectParam> getVeAudioEffectParamList() {
        return null;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public boolean isCanvasVEEditorType() {
        return false;
    }

    public void setMultiSegmentPropInfo(MultiSegmentPropExtra multiSegmentPropExtra) {
    }

    public void setRecordStickers(String str) {
    }

    public void setVeAudioEffectParamList(List<? extends IAudioEffectParam> list) {
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public String[] getAudioPaths() {
        return this.mAudioPaths;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public int getCanvasHeight() {
        return this.mCanvasHeight;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public int getCanvasWidth() {
        return this.mCanvasWidth;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public long getEditorHandler() {
        return this.mEditorHandler;
    }

    public VEEditorModel getEditorModel() {
        return this.mEditorModel;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public boolean getEnableAutoStart() {
        return this.mEnableAutoStart;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public boolean getEnableMusicSync() {
        return this.enableMusicSync;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public int getFps() {
        return this.mFps;
    }

    public float getMusicVolume() {
        return this.mMusicVolume;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public boolean getNeedVEUserConfig() {
        return this.needVEUserConfig;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public int getPreviewHeight() {
        return this.mPreviewHeight;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public int getPreviewWidth() {
        return this.mPreviewWidth;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public int[] getRotateArray() {
        return this.mRotateArray;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public float[] getSpeedArray() {
        return this.mSpeedArray;
    }

    public bg getTimelineParams() {
        return this.mTimelineParams;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public int[] getVTrimIn() {
        return this.mVTrimIn;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public int[] getVTrimOut() {
        return this.mVTrimOut;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public IAudioEffectParam getVeAudioEffectParam() {
        return this.mVeAudioEffectParam;
    }

    public AudioRecorderParam getVeAudioRecordParam() {
        return this.mVeAudioRecordParam;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public String[] getVideoPaths() {
        return this.mVideoPaths;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public float getVolume() {
        return this.mVolume;
    }

    @Override // com.bytedance.creativex.editor.preview.a
    public String getWorkspace() {
        return this.mWorkspace;
    }

    static {
        Covode.recordClassIndex(104101);
    }

    public VEPreviewParams() {
        this.mFps = -1;
        this.mEnableAutoStart = true;
        this.mVolume = 1.0f;
    }

    public String toString() {
        return "VEPreviewParams{mVideoPaths=" + Arrays.toString(this.mVideoPaths) + ", mAudioPaths=" + Arrays.toString(this.mAudioPaths) + ", mWorkspace='" + this.mWorkspace + '\'' + ", mVolume=" + this.mVolume + ", mFps=" + this.mFps + ", mVTrimIn=" + this.mVTrimIn + ", mVTrimOut=" + this.mVTrimOut + ", sceneIn=" + this.sceneIn + ", sceneOut=" + this.sceneOut + ", canvasWidth=" + this.mCanvasWidth + ", canvasHeight=" + this.mCanvasHeight + '}';
    }

    public void setCanvasHeight(int i2) {
        this.mCanvasHeight = i2;
    }

    public void setCanvasWidth(int i2) {
        this.mCanvasWidth = i2;
    }

    public void setEditorHandler(long j2) {
        this.mEditorHandler = j2;
    }

    public void setEditorModel(VEEditorModel vEEditorModel) {
        this.mEditorModel = vEEditorModel;
    }

    public void setEnableAutoStart(boolean z) {
        this.mEnableAutoStart = z;
    }

    public void setEnableMusicSync(boolean z) {
        this.enableMusicSync = z;
    }

    public void setNeedVEUserConfig(boolean z) {
        this.needVEUserConfig = z;
    }

    public void setTimelineParams(bg bgVar) {
        this.mTimelineParams = bgVar;
    }

    public void setVeAudioRecordParam(AudioRecorderParam audioRecorderParam) {
        this.mVeAudioRecordParam = audioRecorderParam;
    }

    public void setVeAudioEffectParam(IAudioEffectParam iAudioEffectParam) {
        this.mVeAudioEffectParam = (AudioEffectParam) iAudioEffectParam;
    }

    protected VEPreviewParams(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        this.mFps = -1;
        boolean z8 = true;
        this.mEnableAutoStart = true;
        this.mVideoPaths = parcel.createStringArray();
        this.mAudioPaths = parcel.createStringArray();
        this.mWorkspace = parcel.readString();
        this.mVolume = parcel.readFloat();
        this.mMusicVolume = parcel.readFloat();
        this.mFps = parcel.readInt();
        this.mVTrimIn = parcel.createIntArray();
        this.mVTrimOut = parcel.createIntArray();
        this.sceneIn = parcel.readInt();
        this.sceneOut = parcel.readInt();
        this.videoEditorType = parcel.readInt();
        this.mvCreateVideoData = (d) parcel.readSerializable();
        this.mSpeedArray = parcel.createFloatArray();
        this.mRotateArray = parcel.createIntArray();
        this.veCherEffectParam = (VECherEffectParam) parcel.readParcelable(VECherEffectParam.class.getClassLoader());
        this.mCanvasWidth = parcel.readInt();
        this.mCanvasHeight = parcel.readInt();
        this.mMusicPath = parcel.readString();
        this.mMusicInPoint = parcel.readInt();
        this.mMusicOutPoint = parcel.readInt();
        this.mPageType = parcel.readInt();
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
        this.isCutSameType = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.needVEUserConfig = z3;
        this.mVeAudioRecordParam = (AudioRecorderParam) parcel.readParcelable(AudioRecorderParam.class.getClassLoader());
        this.recordData = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoStatusRecordData.class.getClassLoader());
        this.mPreviewWidth = parcel.readInt();
        this.mPreviewHeight = parcel.readInt();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isFastImport = z4;
        this.stitchParams = (StitchParams) parcel.readParcelable(StitchParams.class.getClassLoader());
        this.audioAecDelayTime = parcel.readLong();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.isStoryEditMode = z5;
        this.canvasVideoPreviewData = (CanvasVideoData) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.enableMusicSync = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.isMusicSyncMode = z7;
        this.isVideoImageMixFastImport = parcel.readByte() == 0 ? false : z8;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringArray(this.mVideoPaths);
        parcel.writeStringArray(this.mAudioPaths);
        parcel.writeString(this.mWorkspace);
        parcel.writeFloat(this.mVolume);
        parcel.writeFloat(this.mMusicVolume);
        parcel.writeInt(this.mFps);
        parcel.writeIntArray(this.mVTrimIn);
        parcel.writeIntArray(this.mVTrimOut);
        parcel.writeInt(this.sceneIn);
        parcel.writeInt(this.sceneOut);
        parcel.writeInt(this.videoEditorType);
        parcel.writeSerializable(this.mvCreateVideoData);
        parcel.writeFloatArray(this.mSpeedArray);
        parcel.writeIntArray(this.mRotateArray);
        parcel.writeParcelable(this.veCherEffectParam, i2);
        parcel.writeInt(this.mCanvasWidth);
        parcel.writeInt(this.mCanvasHeight);
        parcel.writeString(this.mMusicPath);
        parcel.writeInt(this.mMusicInPoint);
        parcel.writeInt(this.mMusicOutPoint);
        parcel.writeInt(this.mPageType);
        parcel.writeByte(this.mIsFromDraft ? (byte) 1 : 0);
        parcel.writeParcelable(this.mVeAudioRecordParam, i2);
        parcel.writeParcelable(this.recordData, i2);
        parcel.writeInt(this.mPreviewWidth);
        parcel.writeInt(this.mPreviewHeight);
        parcel.writeByte(this.isFastImport ? (byte) 1 : 0);
        parcel.writeByte(this.isCutSameType ? (byte) 1 : 0);
        parcel.writeByte(this.needVEUserConfig ? (byte) 1 : 0);
        parcel.writeParcelable(this.stitchParams, i2);
        parcel.writeLong(this.audioAecDelayTime);
        parcel.writeByte(this.isStoryEditMode ? (byte) 1 : 0);
        parcel.writeSerializable(this.canvasVideoPreviewData);
        parcel.writeByte(this.enableMusicSync ? (byte) 1 : 0);
        parcel.writeByte(this.isMusicSyncMode ? (byte) 1 : 0);
        parcel.writeByte(this.isVideoImageMixFastImport ? (byte) 1 : 0);
    }
}
