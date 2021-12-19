package com.ss.android.ugc.effectmanager.model;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.ModelNameProcessor;
import java.io.File;

public class LocalModelInfo {
    private boolean mIsBuilt;
    private final Uri mUri;
    private String md5;
    private String name;
    private int size = -1;
    private String version;

    static {
        Covode.recordClassIndex(95596);
    }

    public Uri getUri() {
        return this.mUri;
    }

    public boolean isBuilt() {
        return this.mIsBuilt;
    }

    public LocalModelInfo() {
    }

    public int getSize() {
        Uri uri;
        if (this.size == -1 && (uri = this.mUri) != null) {
            this.size = ModelNameProcessor.getSizeOfModel(new File(uri.getPath()).getName());
        }
        return this.size;
    }

    public String getVersion() {
        Uri uri;
        String str = this.version;
        if ((str == null || str.isEmpty()) && (uri = this.mUri) != null) {
            this.version = getVersionOfModel(uri.getPath());
        }
        return this.version;
    }

    public String getMD5() {
        Uri uri;
        String str = this.md5;
        if ((str == null || str.isEmpty()) && (uri = this.mUri) != null) {
            this.md5 = ModelNameProcessor.getMD5OfModel(new File(uri.getPath()).getName());
        }
        return this.md5;
    }

    public String getName() {
        Uri uri;
        String str = this.name;
        if ((str == null || str.isEmpty()) && (uri = this.mUri) != null) {
            this.name = ModelNameProcessor.getNameOfModel(new File(uri.getPath()).getName());
        }
        return this.name;
    }

    public String toString() {
        return "LocalModelInfo{name=" + getName() + '\'' + ",version=" + getVersion() + '\'' + ",size=" + getSize() + '\'' + ",md5=" + getMD5() + '\'' + '}';
    }

    public void setBuilt(boolean z) {
        this.mIsBuilt = z;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSize(int i2) {
        this.size = i2;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    private LocalModelInfo(Uri uri) {
        this.mUri = uri;
    }

    public static LocalModelInfo fromFile(String str) {
        return new LocalModelInfo(Uri.parse("file://".concat(String.valueOf(str))));
    }

    private static String getVersionOfModel(String str) {
        int lastIndexOf;
        if (str == null) {
            return "1.0";
        }
        str.lastIndexOf("/");
        int lastIndexOf2 = str.lastIndexOf("_v");
        if (str.contains("size")) {
            lastIndexOf = str.lastIndexOf("_size");
        } else {
            lastIndexOf = str.lastIndexOf("_model");
        }
        if (lastIndexOf2 > 0) {
            return str.substring(lastIndexOf2 + 2, lastIndexOf).replace('_', '.');
        }
        return "1.0";
    }
}
