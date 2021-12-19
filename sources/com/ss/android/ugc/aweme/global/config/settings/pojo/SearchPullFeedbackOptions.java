package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class SearchPullFeedbackOptions {
    @c(a = "hashtag_tab")
    private List<String> hashtagTab = new ArrayList();
    @c(a = "sound_tab")
    private List<String> soundTab = new ArrayList();
    @c(a = "top_tab")
    private List<String> topTab = new ArrayList();
    @c(a = "user_tab")
    private List<String> userTab = new ArrayList();
    @c(a = "video_tab")
    private List<String> videoTab = new ArrayList();

    static {
        Covode.recordClassIndex(63071);
    }

    public List<String> getHashtagTab() {
        return this.hashtagTab;
    }

    public List<String> getSoundTab() {
        return this.soundTab;
    }

    public List<String> getTopTab() {
        return this.topTab;
    }

    public List<String> getUserTab() {
        return this.userTab;
    }

    public List<String> getVideoTab() {
        return this.videoTab;
    }
}
