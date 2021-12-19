package com.ss.android.ugc.aweme.photomovie;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class PhotoMovieContext extends BaseShortVideoContext implements Parcelable {
    public static final Parcelable.Creator<PhotoMovieContext> CREATOR = new Parcelable.Creator<PhotoMovieContext>() {
        /* class com.ss.android.ugc.aweme.photomovie.PhotoMovieContext.AnonymousClass1 */

        static {
            Covode.recordClassIndex(73908);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PhotoMovieContext[] newArray(int i2) {
            return new PhotoMovieContext[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PhotoMovieContext createFromParcel(Parcel parcel) {
            return new PhotoMovieContext(parcel);
        }
    };
    @c(a = "coverPublishModel")
    private CoverPublishModel coverPublishModel;
    @c(a = "creationId")
    public String creationId;
    @c(a = "draftId")
    public int draftId;
    @c(a = "extract_model")
    public ExtractFramesModel extractFramesModel;
    @c(a = "is_background_publish")
    public boolean isBackgroundPublish;
    @c(a = "isMusicIllegal")
    public boolean isMusicIllegal;
    @c(a = "is_open_foreground_publish")
    public boolean isOpenForegroundPublish;
    @c(a = "mCoverStartTm")
    public float mCoverStartTm;
    @c(a = "mFilterId")
    public int mFilterId;
    @c(a = "mFilterName")
    public String mFilterName;
    @c(a = "mFilterPath")
    public String mFilterPath;
    @c(a = "mFinalVideoTmpPath")
    public String mFinalVideoTmpPath;
    @c(a = "mFrom")
    public int mFrom;
    @c(a = "mHeight")
    public int mHeight;
    @c(a = "mImageList")
    public List<String> mImageList;
    @c(a = "mInputAudioPath")
    public String mInputAudioPath;
    @c(a = "mMusic")
    public com.ss.android.ugc.aweme.shortvideo.c mMusic;
    @c(a = "mMusicList")
    public List<com.ss.android.ugc.aweme.shortvideo.c> mMusicList = new ArrayList();
    @c(a = "mMusicPath")
    public String mMusicPath;
    @c(a = "mOutputVideoPath")
    public String mOutputVideoPath;
    @c(a = "mPlayType")
    public int mPlayType;
    @c(a = "mRealImageCount")
    public int mRealImageCount;
    @c(a = "save_model")
    public AVUploadSaveModel mSaveModel;
    @c(a = "mWidth")
    public int mWidth;
    @c(a = "music_origin")
    public String musicOrigin;
    @c(a = "newDraftId")
    public String newDraftId = "";
    @c(a = "photo_time")
    public int photoTime;
    @c(a = "shop_draft_id")
    public String shopDraftId;
    @c(a = "startTime")
    public long startTime;
    @c(a = "trans_time")
    public int transTime;
    @c(a = "video_cover_path")
    private String videoCoverPath;

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(73907);
    }

    public PhotoMovieContext() {
    }

    public CoverPublishModel getCoverPublishModel() {
        if (this.coverPublishModel == null) {
            this.coverPublishModel = new CoverPublishModel();
        }
        return this.coverPublishModel;
    }

    public int getImageCount() {
        List<String> list = this.mImageList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getLocalTempPath() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null) {
            return null;
        }
        return aVUploadSaveModel.getLocalTempPath();
    }

    public boolean isSaveLocal() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null || !aVUploadSaveModel.isSaveLocal()) {
            return false;
        }
        return true;
    }

    public boolean isSaveLocalWithWaterMark() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null || !aVUploadSaveModel.isSaveLocalWithWaterMark()) {
            return false;
        }
        return true;
    }

    public boolean isSaveLocalWithoutWaterMark() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null || aVUploadSaveModel.isWaterMark()) {
            return false;
        }
        return true;
    }

    public boolean isSaveToAlbum() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null || !aVUploadSaveModel.getSaveToAlbum()) {
            return false;
        }
        return true;
    }

    public boolean isSaveToLocalPathInsteadOfAlbum() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null || !aVUploadSaveModel.isSaveToAppPathInsteadOfAlbum()) {
            return false;
        }
        return true;
    }

    public void setCoverPublishModel(CoverPublishModel coverPublishModel2) {
        this.coverPublishModel = coverPublishModel2;
    }

    public static File com_ss_android_ugc_aweme_photomovie_PhotoMovieContext_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir(Context context) {
        if (d.f107194b != null && d.f107197e) {
            return d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        d.f107194b = cacheDir;
        return cacheDir;
    }

    private String generateTempCoverPath(Context context) {
        return getCacheDir(context) + getRandomFileName("_cover.png");
    }

    private String getCacheDir(Context context) {
        return com_ss_android_ugc_aweme_photomovie_PhotoMovieContext_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir(context).getPath() + File.separator;
    }

    public String getVideoCoverPath(Context context) {
        if (TextUtils.isEmpty(this.videoCoverPath)) {
            this.videoCoverPath = generateTempCoverPath(context);
        }
        return this.videoCoverPath;
    }

    private String getRandomFileName(String str) {
        return new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US).format(Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime()) + str;
    }

    public static PhotoMovieContext convertFromDraft(com.ss.android.ugc.aweme.draft.model.c cVar) {
        PhotoMovieContext photoMovieContext = cVar.f83182c;
        if (photoMovieContext == null || cVar.f83181b == null) {
            return null;
        }
        photoMovieContext.challenges = cVar.f83181b.f83163c;
        photoMovieContext.title = cVar.f83181b.f83161a;
        photoMovieContext.structList = cVar.f83181b.f83162b;
        photoMovieContext.isPrivate = cVar.D;
        photoMovieContext.excludeUserList = cVar.W.aT;
        photoMovieContext.allowRecommend = cVar.W.aV;
        photoMovieContext.geofencingSetting = cVar.W.aS;
        photoMovieContext.mIsFromDraft = true;
        photoMovieContext.mDraftToEditFrom = cVar.t;
        photoMovieContext.isMusicIllegal = cVar.f83182c.isMusicIllegal;
        photoMovieContext.mFrom = 1;
        photoMovieContext.mSaveModel = cVar.W.D;
        photoMovieContext.draftEditTransferModel = new DraftEditTransferModel(cVar.r(), null);
        return photoMovieContext;
    }

    protected PhotoMovieContext(Parcel parcel) {
        super(parcel);
        boolean z;
        this.mFinalVideoTmpPath = parcel.readString();
        this.mImageList = parcel.createStringArrayList();
        this.musicOrigin = parcel.readString();
        this.mMusicPath = parcel.readString();
        this.mHeight = parcel.readInt();
        this.mWidth = parcel.readInt();
        this.mPlayType = parcel.readInt();
        this.mOutputVideoPath = parcel.readString();
        this.mInputAudioPath = parcel.readString();
        this.mCoverStartTm = parcel.readFloat();
        this.mMusic = (com.ss.android.ugc.aweme.shortvideo.c) parcel.readSerializable();
        this.mFilterPath = parcel.readString();
        this.mFilterName = parcel.readString();
        this.mFilterId = parcel.readInt();
        this.mFrom = parcel.readInt();
        this.creationId = parcel.readString();
        this.draftId = parcel.readInt();
        this.newDraftId = parcel.readString();
        this.shopDraftId = parcel.readString();
        this.mSaveModel = (AVUploadSaveModel) parcel.readParcelable(AVUploadSaveModel.class.getClassLoader());
        this.extractFramesModel = (ExtractFramesModel) parcel.readSerializable();
        this.photoTime = parcel.readInt();
        this.transTime = parcel.readInt();
        this.mRealImageCount = parcel.readInt();
        this.coverPublishModel = (CoverPublishModel) parcel.readParcelable(CoverPublishModel.class.getClassLoader());
        this.videoCoverPath = parcel.readString();
        this.mDraftToEditFrom = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isMusicIllegal = z;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.mFinalVideoTmpPath);
        parcel.writeStringList(this.mImageList);
        parcel.writeString(this.musicOrigin);
        parcel.writeString(this.mMusicPath);
        parcel.writeInt(this.mHeight);
        parcel.writeInt(this.mWidth);
        parcel.writeInt(this.mPlayType);
        parcel.writeString(this.mOutputVideoPath);
        parcel.writeString(this.mInputAudioPath);
        parcel.writeFloat(this.mCoverStartTm);
        parcel.writeSerializable(this.mMusic);
        parcel.writeString(this.mFilterPath);
        parcel.writeString(this.mFilterName);
        parcel.writeInt(this.mFilterId);
        parcel.writeInt(this.mFrom);
        parcel.writeString(this.creationId);
        parcel.writeInt(this.draftId);
        parcel.writeString(this.newDraftId);
        parcel.writeString(this.shopDraftId);
        parcel.writeParcelable(this.mSaveModel, i2);
        parcel.writeSerializable(this.extractFramesModel);
        parcel.writeInt(this.photoTime);
        parcel.writeInt(this.transTime);
        parcel.writeInt(this.mRealImageCount);
        parcel.writeParcelable(this.coverPublishModel, i2);
        parcel.writeString(this.videoCoverPath);
        parcel.writeInt(this.mDraftToEditFrom);
        parcel.writeByte(this.isMusicIllegal ? (byte) 1 : 0);
    }
}
