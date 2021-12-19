package com.ss.android.ugc.aweme.setting.page.backgroundaudio;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.experiment.c;
import com.zhiliaoapp.musically.R;

public enum b {
    PLAY_IN_ORDER(R.string.vu, R.raw.icon_list_arrow_down, c.a.PLAY_IN_ORDER),
    REPEAT(R.string.vv, R.raw.icon_repeat_1, c.a.REPEAT);
    
    private final int icon;
    private final c.a playOrder;
    private final int title;

    public final int getIcon() {
        return this.icon;
    }

    public final c.a getPlayOrder() {
        return this.playOrder;
    }

    public final int getTitle() {
        return this.title;
    }

    static {
        Covode.recordClassIndex(80284);
    }

    private b(int i2, int i3, c.a aVar) {
        this.title = i2;
        this.icon = i3;
        this.playOrder = aVar;
    }
}
