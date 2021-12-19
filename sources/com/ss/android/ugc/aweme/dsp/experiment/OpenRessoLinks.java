package com.ss.android.ugc.aweme.dsp.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class OpenRessoLinks {
    @c(a = "app_link")
    private final String appLink = "https://h5.resso.app?channel=tt&callback=tiktok%3A%2F%2F&entry_name=tt_dsp";
    @c(a = "deep_link")
    private final String deepLink = "resso://resso.com?channel=tt&callback=tiktok%3A%2F%2F&entry_name=tt_dsp";
    @c(a = "download_link")
    private final String downloadLink = "https://go.onelink.me/hDJ6?pid=tiktok_anchor&c=tiktok_anchor&af_dp=resso%3A%2F%2Fresso.com%3Fchannel%3Dtt%26callback%3Dtiktok%253A%252F%252F%26entry_name%3Dtt_dsp&af_force_deeplink=true";

    static {
        Covode.recordClassIndex(51940);
    }

    public final String getAppLink() {
        return this.appLink;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getDownloadLink() {
        return this.downloadLink;
    }
}
