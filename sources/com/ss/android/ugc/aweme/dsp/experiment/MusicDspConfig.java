package com.ss.android.ugc.aweme.dsp.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class MusicDspConfig {
    @c(a = "copyright_restrictions")
    private final CopyrightRestrictions copyrightRestrictions = new CopyrightRestrictions();
    @c(a = "enable_comment")
    private final boolean enableComment = true;
    @c(a = "enable_music_seek_bar")
    private final boolean enableMusicSeekBar;
    @c(a = "enable_retry_play")
    private final boolean enableRetryPlay = true;
    @c(a = "open_resso_links")
    private final OpenRessoLinks links = new OpenRessoLinks();

    static {
        Covode.recordClassIndex(51938);
    }

    public final CopyrightRestrictions getCopyrightRestrictions() {
        return this.copyrightRestrictions;
    }

    public final boolean getEnableComment() {
        return this.enableComment;
    }

    public final boolean getEnableMusicSeekBar() {
        return this.enableMusicSeekBar;
    }

    public final boolean getEnableRetryPlay() {
        return this.enableRetryPlay;
    }

    public final OpenRessoLinks getLinks() {
        return this.links;
    }
}
