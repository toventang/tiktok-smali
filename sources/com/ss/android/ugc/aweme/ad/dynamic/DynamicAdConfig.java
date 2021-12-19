package com.ss.android.ugc.aweme.ad.dynamic;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class DynamicAdConfig {
    @c(a = "lynx_view_pre_render_gap")
    private int lynxViewPreRenderGap = 6;
    @c(a = "lynx_view_release_gap")
    private int lynxViewReleaseGap = 8;

    static {
        Covode.recordClassIndex(40425);
    }

    public final int getLynxViewPreRenderGap() {
        return this.lynxViewPreRenderGap;
    }

    public final int getLynxViewReleaseGap() {
        return this.lynxViewReleaseGap;
    }

    public final void setLynxViewPreRenderGap(int i2) {
        this.lynxViewPreRenderGap = i2;
    }

    public final void setLynxViewReleaseGap(int i2) {
        this.lynxViewReleaseGap = i2;
    }
}
