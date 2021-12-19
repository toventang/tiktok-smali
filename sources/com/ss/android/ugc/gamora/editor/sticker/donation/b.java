package com.ss.android.ugc.gamora.editor.sticker.donation;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class b implements Serializable {
    private final String contentSource;
    private final String contentType;
    private final String creationId;
    private final String shootWay;

    static {
        Covode.recordClassIndex(96419);
    }

    public static /* synthetic */ b copy$default(b bVar, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bVar.shootWay;
        }
        if ((i2 & 2) != 0) {
            str2 = bVar.creationId;
        }
        if ((i2 & 4) != 0) {
            str3 = bVar.contentSource;
        }
        if ((i2 & 8) != 0) {
            str4 = bVar.contentType;
        }
        return bVar.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.shootWay;
    }

    public final String component2() {
        return this.creationId;
    }

    public final String component3() {
        return this.contentSource;
    }

    public final String component4() {
        return this.contentType;
    }

    public final b copy(String str, String str2, String str3, String str4) {
        return new b(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.shootWay, bVar.shootWay) && l.a(this.creationId, bVar.creationId) && l.a(this.contentSource, bVar.contentSource) && l.a(this.contentType, bVar.contentType);
    }

    public final int hashCode() {
        String str = this.shootWay;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.creationId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.contentSource;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.contentType;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "DonationStickerMobParams(shootWay=" + this.shootWay + ", creationId=" + this.creationId + ", contentSource=" + this.contentSource + ", contentType=" + this.contentType + ")";
    }

    public final String getContentSource() {
        return this.contentSource;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public b(String str, String str2, String str3, String str4) {
        this.shootWay = str;
        this.creationId = str2;
        this.contentSource = str3;
        this.contentType = str4;
    }
}
