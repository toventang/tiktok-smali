package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class WatermarkStruct {
    @c(a = "end_watermark_string")
    private String endWatermarkString;
    @c(a = "end_watermark_substring")
    private String endWatermarkSubstring;
    @c(a = "fps")
    private String fps;
    @c(a = "md5")
    private String md5;
    @c(a = "resource_url")
    private UrlModel resourceUrl;

    static {
        Covode.recordClassIndex(63114);
    }

    public String getEndWatermarkString() {
        String str = this.endWatermarkString;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getEndWatermarkSubstring() {
        String str = this.endWatermarkSubstring;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getFps() {
        String str = this.fps;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getMd5() {
        String str = this.md5;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public UrlModel getResourceUrl() {
        UrlModel urlModel = this.resourceUrl;
        if (urlModel != null) {
            return urlModel;
        }
        throw new a();
    }
}
