package com.ss.android.ugc.aweme.feed.ui.seekbar.a;

import android.view.ViewGroup;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;

public final class f {
    static {
        Covode.recordClassIndex(60270);
    }

    public static final void a(VideoSeekBar videoSeekBar, ViewGroup viewGroup) {
        int b2 = (int) n.b(videoSeekBar.getContext(), 20.0f);
        int b3 = (int) (n.b(videoSeekBar.getContext(), (float) c.f66193c) - ((((float) b2) - videoSeekBar.getProgressHeight()) / 2.0f));
        c.a(videoSeekBar, b2, -1, b3, 80);
        c.a(viewGroup, -2, (int) n.b(videoSeekBar.getContext(), 264.0f), (int) (((float) b3) + n.b(videoSeekBar.getContext(), 56.0f)), 81);
    }
}
