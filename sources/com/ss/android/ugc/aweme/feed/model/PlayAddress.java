package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class PlayAddress implements Serializable {
    @c(a = "data_size")
    public Long dataSize;
    @c(a = "file_cs")
    public String fileCS;
    @c(a = "file_hash")
    public String fileHash;
    @c(a = "height")
    public Integer height;
    @c(a = "player_access_key")
    public String playerAccessKey;
    @c(a = "uri")
    public String uri;
    @c(a = "url_key")
    public String urlKey;
    @c(a = "url_list")
    public List<String> urlList;
    @c(a = "width")
    public Integer width;

    static {
        Covode.recordClassIndex(59440);
    }

    public PlayAddress() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.PlayAddress */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayAddress copy$default(PlayAddress playAddress, String str, List list, Integer num, Integer num2, String str2, Long l2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = playAddress.uri;
        }
        if ((i2 & 2) != 0) {
            list = playAddress.urlList;
        }
        if ((i2 & 4) != 0) {
            num = playAddress.width;
        }
        if ((i2 & 8) != 0) {
            num2 = playAddress.height;
        }
        if ((i2 & 16) != 0) {
            str2 = playAddress.urlKey;
        }
        if ((i2 & 32) != 0) {
            l2 = playAddress.dataSize;
        }
        if ((i2 & 64) != 0) {
            str3 = playAddress.fileHash;
        }
        if ((i2 & 128) != 0) {
            str4 = playAddress.fileCS;
        }
        if ((i2 & 256) != 0) {
            str5 = playAddress.playerAccessKey;
        }
        return playAddress.copy(str, list, num, num2, str2, l2, str3, str4, str5);
    }

    public final String component1() {
        return this.uri;
    }

    public final List<String> component2() {
        return this.urlList;
    }

    public final Integer component3() {
        return this.width;
    }

    public final Integer component4() {
        return this.height;
    }

    public final String component5() {
        return this.urlKey;
    }

    public final Long component6() {
        return this.dataSize;
    }

    public final String component7() {
        return this.fileHash;
    }

    public final String component8() {
        return this.fileCS;
    }

    public final String component9() {
        return this.playerAccessKey;
    }

    public final PlayAddress copy(String str, List<String> list, Integer num, Integer num2, String str2, Long l2, String str3, String str4, String str5) {
        return new PlayAddress(str, list, num, num2, str2, l2, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayAddress)) {
            return false;
        }
        PlayAddress playAddress = (PlayAddress) obj;
        return l.a(this.uri, playAddress.uri) && l.a(this.urlList, playAddress.urlList) && l.a(this.width, playAddress.width) && l.a(this.height, playAddress.height) && l.a(this.urlKey, playAddress.urlKey) && l.a(this.dataSize, playAddress.dataSize) && l.a(this.fileHash, playAddress.fileHash) && l.a(this.fileCS, playAddress.fileCS) && l.a(this.playerAccessKey, playAddress.playerAccessKey);
    }

    public final int hashCode() {
        String str = this.uri;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.urlList;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.width;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.height;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str2 = this.urlKey;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l2 = this.dataSize;
        int hashCode6 = (hashCode5 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str3 = this.fileHash;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.fileCS;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.playerAccessKey;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "PlayAddress(uri=" + this.uri + ", urlList=" + this.urlList + ", width=" + this.width + ", height=" + this.height + ", urlKey=" + this.urlKey + ", dataSize=" + this.dataSize + ", fileHash=" + this.fileHash + ", fileCS=" + this.fileCS + ", playerAccessKey=" + this.playerAccessKey + ")";
    }

    public final Long getDataSize() {
        return this.dataSize;
    }

    public final String getFileCS() {
        return this.fileCS;
    }

    public final String getFileHash() {
        return this.fileHash;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getPlayerAccessKey() {
        return this.playerAccessKey;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getUrlKey() {
        return this.urlKey;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public PlayAddress(String str, List<String> list, Integer num, Integer num2, String str2, Long l2, String str3, String str4, String str5) {
        this.uri = str;
        this.urlList = list;
        this.width = num;
        this.height = num2;
        this.urlKey = str2;
        this.dataSize = l2;
        this.fileHash = str3;
        this.fileCS = str4;
        this.playerAccessKey = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlayAddress(String str, List list, Integer num, Integer num2, String str2, Long l2, String str3, String str4, String str5, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : l2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) == 0 ? str5 : null);
    }
}
