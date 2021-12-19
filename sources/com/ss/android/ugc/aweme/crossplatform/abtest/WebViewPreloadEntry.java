package com.ss.android.ugc.aweme.crossplatform.abtest;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public class WebViewPreloadEntry {
    @c(a = "delay")
    private long delay = 3000;
    @c(a = "preType")
    private String preType = "render";
    @c(a = StringSet.type)
    private String type = "BootFinished";
    @c(a = "url")
    private String url = "https://s16-ies.tiktok.com/ies-cdn-alisg/tiktok_activities/covid19/pages/coronavirus/index.html?hide_nav_bar=1&enter_from=topic_entrance";
    @c(a = "usePool")
    private boolean usePool = true;

    static {
        Covode.recordClassIndex(48756);
    }

    public long getDelay() {
        return this.delay;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isUsePool() {
        return this.usePool;
    }

    public boolean isBackground() {
        return TextUtils.equals("Background", this.type);
    }

    public boolean isNeedRender() {
        return TextUtils.equals("render", this.preType);
    }
}
