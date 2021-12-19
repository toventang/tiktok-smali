package com.ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class PublishOutput {
    private final String creationId;
    private final String filePath;
    private final boolean isCommercialMusic;
    private final boolean isOriginalSound;
    private final String musicId;

    static {
        Covode.recordClassIndex(79788);
    }

    public static /* synthetic */ PublishOutput copy$default(PublishOutput publishOutput, String str, String str2, String str3, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = publishOutput.creationId;
        }
        if ((i2 & 2) != 0) {
            str2 = publishOutput.filePath;
        }
        if ((i2 & 4) != 0) {
            str3 = publishOutput.musicId;
        }
        if ((i2 & 8) != 0) {
            z = publishOutput.isCommercialMusic;
        }
        if ((i2 & 16) != 0) {
            z2 = publishOutput.isOriginalSound;
        }
        return publishOutput.copy(str, str2, str3, z, z2);
    }

    public static /* synthetic */ void getFilePath$annotations() {
    }

    public final String component1() {
        return this.creationId;
    }

    public final String component2() {
        return this.filePath;
    }

    public final String component3() {
        return this.musicId;
    }

    public final boolean component4() {
        return this.isCommercialMusic;
    }

    public final boolean component5() {
        return this.isOriginalSound;
    }

    public final PublishOutput copy(String str, String str2, String str3, boolean z, boolean z2) {
        return new PublishOutput(str, str2, str3, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishOutput)) {
            return false;
        }
        PublishOutput publishOutput = (PublishOutput) obj;
        return l.a(this.creationId, publishOutput.creationId) && l.a(this.filePath, publishOutput.filePath) && l.a(this.musicId, publishOutput.musicId) && this.isCommercialMusic == publishOutput.isCommercialMusic && this.isOriginalSound == publishOutput.isOriginalSound;
    }

    public final int hashCode() {
        String str = this.creationId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.filePath;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.musicId;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.isCommercialMusic;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (i3 + i5) * 31;
        if (!this.isOriginalSound) {
            i4 = 0;
        }
        return i8 + i4;
    }

    public final String toString() {
        return "PublishOutput(creationId=" + this.creationId + ", filePath=" + this.filePath + ", musicId=" + this.musicId + ", isCommercialMusic=" + this.isCommercialMusic + ", isOriginalSound=" + this.isOriginalSound + ")";
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final boolean isCommercialMusic() {
        return this.isCommercialMusic;
    }

    public final boolean isOriginalSound() {
        return this.isOriginalSound;
    }

    public PublishOutput(String str, String str2, String str3, boolean z, boolean z2) {
        this.creationId = str;
        this.filePath = str2;
        this.musicId = str3;
        this.isCommercialMusic = z;
        this.isOriginalSound = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PublishOutput(String str, String str2, String str3, boolean z, boolean z2, int i2, g gVar) {
        this(str, str2, str3, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? true : z2);
    }
}
