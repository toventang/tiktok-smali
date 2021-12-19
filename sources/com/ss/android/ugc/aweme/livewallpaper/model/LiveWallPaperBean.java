package com.ss.android.ugc.aweme.livewallpaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.video.e;

public class LiveWallPaperBean implements Parcelable {
    public static final Parcelable.Creator<LiveWallPaperBean> CREATOR = new Parcelable.Creator<LiveWallPaperBean>() {
        /* class com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean.AnonymousClass1 */

        static {
            Covode.recordClassIndex(69755);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LiveWallPaperBean[] newArray(int i2) {
            return new LiveWallPaperBean[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LiveWallPaperBean createFromParcel(Parcel parcel) {
            return new LiveWallPaperBean(parcel);
        }
    };
    private boolean forceToPause;
    private int height;
    private String id;
    private boolean shouldMute;
    private String source;
    private String thumbnailPath;
    private UrlModel thumbnailUrlModel;
    private String videoPath;
    private String videoUri;
    private String videoUrl;
    private float volume;
    private int width;

    public int describeContents() {
        return 0;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f108934a;

        /* renamed from: b  reason: collision with root package name */
        public String f108935b;

        /* renamed from: c  reason: collision with root package name */
        public String f108936c;

        /* renamed from: d  reason: collision with root package name */
        public int f108937d;

        /* renamed from: e  reason: collision with root package name */
        public int f108938e;

        /* renamed from: f  reason: collision with root package name */
        public String f108939f;

        /* renamed from: g  reason: collision with root package name */
        public float f108940g;

        /* renamed from: h  reason: collision with root package name */
        public UrlModel f108941h;

        /* renamed from: i  reason: collision with root package name */
        public String f108942i;

        /* renamed from: j  reason: collision with root package name */
        public String f108943j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f108944k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f108945l;

        static {
            Covode.recordClassIndex(69756);
        }

        private a() {
        }

        public final LiveWallPaperBean a() {
            return new LiveWallPaperBean(this);
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.id;
    }

    public String getSource() {
        return this.source;
    }

    public String getThumbnailPath() {
        return this.thumbnailPath;
    }

    public UrlModel getThumbnailUrlModel() {
        return this.thumbnailUrlModel;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public String getVideoUri() {
        return this.videoUri;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public float getVolume() {
        return this.volume;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isForceToPause() {
        return this.forceToPause;
    }

    public boolean isShouldMute() {
        return this.shouldMute;
    }

    public static a newBuilder() {
        return new a((byte) 0);
    }

    static {
        Covode.recordClassIndex(69754);
    }

    public static LiveWallPaperBean buildEmptyBean() {
        a aVar = new a((byte) 0);
        aVar.f108934a = "";
        aVar.f108937d = 0;
        aVar.f108938e = 0;
        aVar.f108935b = "";
        aVar.f108936c = "";
        aVar.f108939f = "";
        aVar.f108940g = 0.0f;
        return aVar.a();
    }

    public boolean isValid() {
        if (TextUtils.isEmpty(this.id)) {
            return false;
        }
        if (e.b(this.thumbnailPath) && e.b(this.videoPath)) {
            return true;
        }
        if (this.thumbnailUrlModel == null || TextUtils.isEmpty(this.videoUrl) || TextUtils.isEmpty(this.videoUri)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "LiveWallPaperBean{id='" + this.id + '\'' + ", thumbnailPath='" + this.thumbnailPath + '\'' + ", videoPath='" + this.videoPath + '\'' + ", width=" + this.width + ", height=" + this.height + ", source=" + this.source + ", volume=" + this.volume + '}';
    }

    public void setForceToPause(boolean z) {
        this.forceToPause = z;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setShouldMute(boolean z) {
        this.shouldMute = z;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setThumbnailPath(String str) {
        this.thumbnailPath = str;
    }

    public void setThumbnailUrlModel(UrlModel urlModel) {
        this.thumbnailUrlModel = urlModel;
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }

    public void setVideoUri(String str) {
        this.videoUri = str;
    }

    public void setVideoUrl(String str) {
        this.videoUrl = str;
    }

    public void setVolume(float f2) {
        this.volume = f2;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    private LiveWallPaperBean(a aVar) {
        this.id = aVar.f108934a;
        this.thumbnailPath = aVar.f108935b;
        this.videoPath = aVar.f108936c;
        this.width = aVar.f108937d;
        this.height = aVar.f108938e;
        this.source = aVar.f108939f;
        this.volume = aVar.f108940g;
        this.thumbnailUrlModel = aVar.f108941h;
        this.videoUrl = aVar.f108942i;
        this.videoUri = aVar.f108943j;
        this.shouldMute = aVar.f108944k;
        this.forceToPause = aVar.f108945l;
    }

    private LiveWallPaperBean(Parcel parcel) {
        boolean z;
        this.id = parcel.readString();
        this.thumbnailPath = parcel.readString();
        this.videoPath = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.source = parcel.readString();
        this.volume = parcel.readFloat();
        this.thumbnailUrlModel = (UrlModel) parcel.readSerializable();
        this.videoUrl = parcel.readString();
        this.videoUri = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.shouldMute = z;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.id);
        parcel.writeString(this.thumbnailPath);
        parcel.writeString(this.videoPath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.source);
        parcel.writeFloat(this.volume);
        parcel.writeSerializable(this.thumbnailUrlModel);
        parcel.writeString(this.videoUrl);
        parcel.writeString(this.videoUri);
        parcel.writeByte(this.shouldMute ? (byte) 1 : 0);
    }
}
