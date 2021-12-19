package com.ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class f implements Serializable {
    @c(a = "height")
    private final Integer height;
    @c(a = "uri")
    private final String uri;
    @c(a = "url_list")
    private final List<String> urlList;
    @c(a = "width")
    private final Integer width;

    static {
        Covode.recordClassIndex(40841);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.api.f */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f copy$default(f fVar, String str, List list, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fVar.uri;
        }
        if ((i2 & 2) != 0) {
            list = fVar.urlList;
        }
        if ((i2 & 4) != 0) {
            num = fVar.width;
        }
        if ((i2 & 8) != 0) {
            num2 = fVar.height;
        }
        return fVar.copy(str, list, num, num2);
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

    public final f copy(String str, List<String> list, Integer num, Integer num2) {
        return new f(str, list, num, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.uri, fVar.uri) && l.a(this.urlList, fVar.urlList) && l.a(this.width, fVar.width) && l.a(this.height, fVar.height);
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
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "UrlModel(uri=" + this.uri + ", urlList=" + this.urlList + ", width=" + this.width + ", height=" + this.height + ")";
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public f(String str, List<String> list, Integer num, Integer num2) {
        this.uri = str;
        this.urlList = list;
        this.width = num;
        this.height = num2;
    }
}
