package com.ss.android.ugc.aweme.filter;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FilterBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<FilterBean> CREATOR = new Parcelable.Creator<FilterBean>() {
        /* class com.ss.android.ugc.aweme.filter.FilterBean.AnonymousClass1 */

        static {
            Covode.recordClassIndex(60480);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FilterBean[] newArray(int i2) {
            return new FilterBean[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FilterBean createFromParcel(Parcel parcel) {
            return new FilterBean(parcel);
        }
    };
    @c(a = "resource")

    /* renamed from: a  reason: collision with root package name */
    private transient ToolsUrlModel f95455a;

    /* renamed from: b  reason: collision with root package name */
    private transient Uri f95456b;

    /* renamed from: c  reason: collision with root package name */
    private transient String f95457c;
    private String compareKey;

    /* renamed from: d  reason: collision with root package name */
    private transient List<String> f95458d;

    /* renamed from: e  reason: collision with root package name */
    private transient String f95459e = "";
    @c(a = "extra")
    private String extra = "";

    /* renamed from: f  reason: collision with root package name */
    private transient float f95460f = -1.0f;

    /* renamed from: g  reason: collision with root package name */
    private transient boolean f95461g;

    /* renamed from: h  reason: collision with root package name */
    private transient boolean f95462h = true;
    @c(a = "en_name")
    private String mEnName;
    @c(a = "filter_file_path")
    private String mFilterFilePath;
    @c(a = "filter_folder")
    private String mFilterFolder;
    @c(a = "id")
    private int mId;
    public transient int mIndex;
    @c(a = StringSet.name)
    private String mName;
    @c(a = "resource_id")
    private String resId = "";

    public int describeContents() {
        return 0;
    }

    public void resetCompareKey() {
        this.compareKey = null;
    }

    public String getCompareKey() {
        return this.compareKey;
    }

    public String getEnName() {
        return this.mEnName;
    }

    public boolean getExecuteSetFilterFolder() {
        return this.f95461g;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getFilterFilePath() {
        return this.mFilterFilePath;
    }

    public String getFilterFolder() {
        return this.mFilterFolder;
    }

    public int getId() {
        return this.mId;
    }

    public String getName() {
        return this.mName;
    }

    public String getResId() {
        return this.resId;
    }

    public ToolsUrlModel getResource() {
        return this.f95455a;
    }

    public String getTagUpdateAt() {
        return this.f95459e;
    }

    public String getThumbnailFilePath() {
        return this.f95457c;
    }

    public Uri getThumbnailFileUri() {
        return this.f95456b;
    }

    public boolean isSaveFilter2BeautySequence() {
        return this.f95462h;
    }

    static {
        Covode.recordClassIndex(60479);
    }

    public FilterBean() {
    }

    public List<String> getTags() {
        List<String> list = this.f95458d;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        return this.f95458d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mId), getCompareKey());
    }

    public String toString() {
        String str;
        ToolsUrlModel toolsUrlModel = this.f95455a;
        if (toolsUrlModel != null) {
            str = toolsUrlModel.toString();
        } else {
            str = "";
        }
        return "FilterBean{mId=" + this.mId + ", resId:" + this.resId + ", mName='" + this.mName + '\'' + ", mEnName='" + this.mEnName + '\'' + ", mResource=" + str + ", mIndex=" + this.mIndex + ", mThumbnailFileUri=" + this.f95456b + ", mThumbnailFilePath='" + this.f95457c + '\'' + ", mFilterFilePath='" + this.mFilterFilePath + '\'' + ", mFilterFolder='" + this.mFilterFolder + '\'' + ", tags=" + this.f95458d + ", mTagUpdateAt=" + this.f95459e + ", internalDefaultIntensity=" + this.f95460f + ", executeSetFilterFolder=" + this.f95461g + ", isSaveFilter2BeautySequence=" + this.f95462h + ", extra=" + this.extra + '}';
    }

    public void setCompareKey(String str) {
        this.compareKey = str;
    }

    public void setEnName(String str) {
        this.mEnName = str;
    }

    public void setExecuteSetFilterFolder(boolean z) {
        this.f95461g = z;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFilterFilePath(String str) {
        this.mFilterFilePath = str;
    }

    public void setFilterFolder(String str) {
        this.mFilterFolder = str;
    }

    public void setId(int i2) {
        this.mId = i2;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setResId(String str) {
        this.resId = str;
    }

    public void setResource(ToolsUrlModel toolsUrlModel) {
        this.f95455a = toolsUrlModel;
    }

    public void setSaveFilter2BeautySequence(boolean z) {
        this.f95462h = z;
    }

    public void setTagUpdateAt(String str) {
        this.f95459e = str;
    }

    public void setTags(List<String> list) {
        this.f95458d = list;
    }

    public void setThumbnailFilePath(String str) {
        this.f95457c = str;
    }

    public void setThumbnailFileUri(Uri uri) {
        this.f95456b = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterBean)) {
            return false;
        }
        FilterBean filterBean = (FilterBean) obj;
        if (this.mId != filterBean.mId || !TextUtils.equals(getCompareKey(), filterBean.getCompareKey())) {
            return false;
        }
        return true;
    }

    protected FilterBean(Parcel parcel) {
        this.mId = parcel.readInt();
        this.mName = parcel.readString();
        this.mEnName = parcel.readString();
        this.mFilterFilePath = parcel.readString();
        this.mFilterFolder = parcel.readString();
        this.resId = parcel.readString();
        this.extra = parcel.readString();
        this.f95458d = parcel.createStringArrayList();
        this.f95455a = (ToolsUrlModel) parcel.readParcelable(ToolsUrlModel.class.getClassLoader());
        this.f95456b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.mId);
        parcel.writeString(this.mName);
        parcel.writeString(this.mEnName);
        parcel.writeString(this.mFilterFilePath);
        parcel.writeString(this.mFilterFolder);
        parcel.writeString(this.resId);
        parcel.writeString(this.extra);
        parcel.writeStringList(this.f95458d);
        parcel.writeParcelable(this.f95455a, i2);
        parcel.writeParcelable(this.f95456b, i2);
    }
}
