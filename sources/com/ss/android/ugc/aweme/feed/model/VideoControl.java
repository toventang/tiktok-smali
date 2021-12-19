package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class VideoControl implements Serializable {
    @c(a = "allow_download")
    public Boolean allowDownload;
    @c(a = "draft_progress_bar")
    public int draftProgressBar;
    @c(a = "allow_duet")
    public boolean isAllowDuet;
    @c(a = "allow_dynamic_wallpaper")
    public boolean isAllowDynamicWallpaper;
    @c(a = "allow_music")
    public boolean isAllowMusic = true;
    @c(a = "allow_react")
    public boolean isAllowReact;
    @c(a = "prevent_download_type")
    public int preventDownloadType;
    @c(a = "share_type")
    public int shareType;
    @c(a = "show_progress_bar")
    public int showProgressBar;
    @c(a = "timer_status")
    public int timerStatus = 1;

    static {
        Covode.recordClassIndex(59469);
    }
}
