package com.ss.android.ugc.aweme.mvtheme;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.io.Serializable;

public final class e implements Serializable {
    public static final a Companion = new a((byte) 0);
    public static final String VIDEO = "video";
    @c(a = "duration")
    private long duration;
    @c(a = "height")
    private int height;
    @c(a = "mvItemCrop")
    private MvItemCrop mvItemCrop;
    @c(a = "origin_file_path")
    private String originFilePath = "";
    @c(a = "photo_path")
    private final String photoPath;
    @c(a = "source")
    private String source = "";
    @c(a = "sourceStartTime")
    private long sourceStartTime;
    @c(a = StringSet.type)
    private String type = "";
    @c(a = "width")
    private int width;

    static {
        Covode.recordClassIndex(72100);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72101);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    public final MvItemCrop getMvItemCrop() {
        return this.mvItemCrop;
    }

    public final String getOriginFilePath() {
        return this.originFilePath;
    }

    public final String getPhotoPath() {
        return this.photoPath;
    }

    public final String getSource() {
        return this.source;
    }

    public final long getSourceStartTime() {
        return this.sourceStartTime;
    }

    public final String getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setDuration(long j2) {
        this.duration = j2;
    }

    public final void setHeight(int i2) {
        this.height = i2;
    }

    public final void setMvItemCrop(MvItemCrop mvItemCrop2) {
        this.mvItemCrop = mvItemCrop2;
    }

    public final void setSourceStartTime(long j2) {
        this.sourceStartTime = j2;
    }

    public final void setWidth(int i2) {
        this.width = i2;
    }

    public final void setOriginFilePath(String str) {
        l.d(str, "");
        this.originFilePath = str;
    }

    public final void setSource(String str) {
        l.d(str, "");
        this.source = str;
    }

    public final void setType(String str) {
        l.d(str, "");
        this.type = str;
    }

    public e(String str) {
        l.d(str, "");
        this.photoPath = str;
    }
}
