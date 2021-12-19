package com.bytedance.android.livesdk.gift.assets;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public class AssetsModel {
    @c(a = "describe")
    private String describe;
    @c(a = "download_type")
    private int downloadType;
    @c(a = "id")
    private long id;
    @c(a = "md5")
    private String md5;
    @c(a = StringSet.name)
    private String name;
    @c(a = "resource_url")
    private c resourceModel;
    @c(a = "resource_type")
    private int resourceType;
    @c(a = "resource_uri")
    private String resourceUri;
    @c(a = "size")
    private long size;

    static {
        Covode.recordClassIndex(9900);
    }

    public String getDescribe() {
        return this.describe;
    }

    public int getDownloadType() {
        return this.downloadType;
    }

    public long getId() {
        return this.id;
    }

    public String getMD5() {
        return this.md5;
    }

    public String getName() {
        return this.name;
    }

    public c getResourceModel() {
        return this.resourceModel;
    }

    public int getResourceType() {
        return this.resourceType;
    }

    public String getResourceUri() {
        return this.resourceUri;
    }

    public long getSize() {
        return this.size;
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        long j2 = this.id;
        int i6 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.name;
        int i7 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i6 + i2) * 31;
        String str2 = this.describe;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str3 = this.md5;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (((i9 + i4) * 31) + this.resourceType) * 31;
        String str4 = this.resourceUri;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        c cVar = this.resourceModel;
        if (cVar != null) {
            i7 = cVar.hashCode();
        }
        long j3 = this.size;
        return ((((i11 + i7) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.downloadType;
    }

    @c(a = "describe")
    public void setDescribe(String str) {
        this.describe = str;
    }

    @c(a = "download_type")
    public void setDownloadType(int i2) {
        this.downloadType = i2;
    }

    @c(a = "id")
    public void setId(long j2) {
        this.id = j2;
    }

    @c(a = "md5")
    public void setMD5(String str) {
        this.md5 = str;
    }

    @c(a = StringSet.name)
    public void setName(String str) {
        this.name = str;
    }

    @c(a = "resource_url")
    public void setResourceModel(c cVar) {
        this.resourceModel = cVar;
    }

    @c(a = "resource_type")
    public void setResourceType(int i2) {
        this.resourceType = i2;
    }

    @c(a = "resource_uri")
    public void setResourceUri(String str) {
        this.resourceUri = str;
    }

    @c(a = "size")
    public void setSize(long j2) {
        this.size = j2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AssetsModel)) {
            return false;
        }
        AssetsModel assetsModel = (AssetsModel) obj;
        if (this.id == assetsModel.id && this.md5.equals(assetsModel.getMD5()) && this.name.equals(assetsModel.getName()) && this.describe.equals(assetsModel.getDescribe()) && this.resourceType == assetsModel.getResourceType() && this.resourceUri.equals(assetsModel.getResourceUri()) && this.size == assetsModel.getSize() && this.downloadType == assetsModel.getDownloadType()) {
            return true;
        }
        return false;
    }
}
