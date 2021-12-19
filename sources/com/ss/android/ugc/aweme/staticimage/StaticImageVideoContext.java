package com.ss.android.ugc.aweme.staticimage;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class StaticImageVideoContext implements Serializable {
    private final int duration;
    private final int imageHeight;
    private String imagePath;
    private final int imageWidth;
    private final boolean isFromAvatarChanging;
    private final boolean isFromBackgroundChanging;
    private final boolean isFromShoot;
    private String uploadFrameImagePath;

    static {
        Covode.recordClassIndex(88010);
    }

    public static /* synthetic */ StaticImageVideoContext copy$default(StaticImageVideoContext staticImageVideoContext, String str, boolean z, int i2, boolean z2, boolean z3, int i3, int i4, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = staticImageVideoContext.imagePath;
        }
        if ((i5 & 2) != 0) {
            z = staticImageVideoContext.isFromShoot;
        }
        if ((i5 & 4) != 0) {
            i2 = staticImageVideoContext.duration;
        }
        if ((i5 & 8) != 0) {
            z2 = staticImageVideoContext.isFromAvatarChanging;
        }
        if ((i5 & 16) != 0) {
            z3 = staticImageVideoContext.isFromBackgroundChanging;
        }
        if ((i5 & 32) != 0) {
            i3 = staticImageVideoContext.imageWidth;
        }
        if ((i5 & 64) != 0) {
            i4 = staticImageVideoContext.imageHeight;
        }
        if ((i5 & 128) != 0) {
            str2 = staticImageVideoContext.uploadFrameImagePath;
        }
        return staticImageVideoContext.copy(str, z, i2, z2, z3, i3, i4, str2);
    }

    public final String component1() {
        return this.imagePath;
    }

    public final boolean component2() {
        return this.isFromShoot;
    }

    public final int component3() {
        return this.duration;
    }

    public final boolean component4() {
        return this.isFromAvatarChanging;
    }

    public final boolean component5() {
        return this.isFromBackgroundChanging;
    }

    public final int component6() {
        return this.imageWidth;
    }

    public final int component7() {
        return this.imageHeight;
    }

    public final String component8() {
        return this.uploadFrameImagePath;
    }

    public final StaticImageVideoContext copy(String str, boolean z, int i2, boolean z2, boolean z3, int i3, int i4, String str2) {
        l.d(str, "");
        return new StaticImageVideoContext(str, z, i2, z2, z3, i3, i4, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaticImageVideoContext)) {
            return false;
        }
        StaticImageVideoContext staticImageVideoContext = (StaticImageVideoContext) obj;
        return l.a(this.imagePath, staticImageVideoContext.imagePath) && this.isFromShoot == staticImageVideoContext.isFromShoot && this.duration == staticImageVideoContext.duration && this.isFromAvatarChanging == staticImageVideoContext.isFromAvatarChanging && this.isFromBackgroundChanging == staticImageVideoContext.isFromBackgroundChanging && this.imageWidth == staticImageVideoContext.imageWidth && this.imageHeight == staticImageVideoContext.imageHeight && l.a(this.uploadFrameImagePath, staticImageVideoContext.uploadFrameImagePath);
    }

    public final int hashCode() {
        String str = this.imagePath;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isFromShoot;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (((hashCode + i4) * 31) + this.duration) * 31;
        boolean z2 = this.isFromAvatarChanging;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        if (!this.isFromBackgroundChanging) {
            i3 = 0;
        }
        int i12 = (((((i11 + i3) * 31) + this.imageWidth) * 31) + this.imageHeight) * 31;
        String str2 = this.uploadFrameImagePath;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i12 + i2;
    }

    public final String toString() {
        return "StaticImageVideoContext(imagePath=" + this.imagePath + ", isFromShoot=" + this.isFromShoot + ", duration=" + this.duration + ", isFromAvatarChanging=" + this.isFromAvatarChanging + ", isFromBackgroundChanging=" + this.isFromBackgroundChanging + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", uploadFrameImagePath=" + this.uploadFrameImagePath + ")";
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final String getUploadFrameImagePath() {
        return this.uploadFrameImagePath;
    }

    public final boolean isFromAvatarChanging() {
        return this.isFromAvatarChanging;
    }

    public final boolean isFromBackgroundChanging() {
        return this.isFromBackgroundChanging;
    }

    public final boolean isFromShoot() {
        return this.isFromShoot;
    }

    public final void setUploadFrameImagePath(String str) {
        this.uploadFrameImagePath = str;
    }

    public final void setImagePath(String str) {
        l.d(str, "");
        this.imagePath = str;
    }

    public StaticImageVideoContext(String str, boolean z, int i2, boolean z2, boolean z3, int i3, int i4, String str2) {
        l.d(str, "");
        this.imagePath = str;
        this.isFromShoot = z;
        this.duration = i2;
        this.isFromAvatarChanging = z2;
        this.isFromBackgroundChanging = z3;
        this.imageWidth = i3;
        this.imageHeight = i4;
        this.uploadFrameImagePath = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StaticImageVideoContext(String str, boolean z, int i2, boolean z2, boolean z3, int i3, int i4, String str2, int i5, g gVar) {
        this(str, z, (i5 & 4) != 0 ? 10000 : i2, (i5 & 8) != 0 ? false : z2, (i5 & 16) != 0 ? false : z3, (i5 & 32) != 0 ? 720 : i3, (i5 & 64) != 0 ? 1080 : i4, (i5 & 128) != 0 ? null : str2);
    }
}
