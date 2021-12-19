package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class IMUseOkHttpClientConfig {
    @c(a = "downloader_use_okhttpclient")
    private Boolean downloaderUseOkhttpclient;
    @c(a = "gif_manager_use_okhttpclient")
    private Boolean gifManagerUseOkhttpclient;
    @c(a = "uploader_use_okhttpclient")
    private Boolean uploaderUseOkhttpclient;

    static {
        Covode.recordClassIndex(63050);
    }

    public Boolean getDownloaderUseOkhttpclient() {
        Boolean bool = this.downloaderUseOkhttpclient;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getGifManagerUseOkhttpclient() {
        Boolean bool = this.gifManagerUseOkhttpclient;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getUploaderUseOkhttpclient() {
        Boolean bool = this.uploaderUseOkhttpclient;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }
}
