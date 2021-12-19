package com.ss.android.ugc.aweme.feed.ui.seekbar.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.main.j;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.f.b.l;
import java.util.Objects;

public final class c {
    static {
        Covode.recordClassIndex(60267);
    }

    public static final boolean a(Aweme aweme) {
        VideoControl videoControl;
        if (aweme == null || (videoControl = aweme.getVideoControl()) == null || videoControl.showProgressBar == 0) {
            return false;
        }
        return true;
    }

    private static boolean d(Aweme aweme) {
        VideoControl videoControl;
        if (aweme == null || (videoControl = aweme.getVideoControl()) == null || videoControl.draftProgressBar == 0) {
            return false;
        }
        return true;
    }

    public static final void a(View view) {
        l.d(view, "");
        view.setPadding(0, view.getPaddingTop(), 0, view.getPaddingBottom());
    }

    public static final boolean b(Aweme aweme) {
        if (c(aweme)) {
            return false;
        }
        if (a.a()) {
            return true;
        }
        if (a.a() || !d(aweme)) {
            return false;
        }
        return true;
    }

    private static boolean c(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if ((aweme.getAwemeRawAd() == null || !aweme.isAd()) && !aweme.isLive()) {
            return false;
        }
        return true;
    }

    public static final boolean a(String str) {
        if ((l.a((Object) "homepage_hot", (Object) str) || l.a((Object) "homepage_follow", (Object) str) || l.a((Object) "homepage_learn", (Object) str)) && (ActivityStack.getValidTopActivity() instanceof j)) {
            return true;
        }
        return false;
    }

    public static final void a(View view, int i2, int i3, int i4, int i5) {
        l.d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (l.a(layoutParams, layoutParams2)) {
            layoutParams.width = i3;
            layoutParams.height = i2;
            layoutParams2.gravity = i5;
            layoutParams2.bottomMargin = i4;
        } else {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
            if (l.a(layoutParams, layoutParams3)) {
                layoutParams.width = i3;
                layoutParams.height = i2;
                if ((i5 & 80) != 0) {
                    layoutParams3.addRule(12);
                }
                if ((i5 & 1) != 0) {
                    layoutParams3.addRule(14);
                }
                layoutParams2.bottomMargin = i4;
            } else {
                layoutParams.width = i3;
                layoutParams.height = i2;
                layoutParams2.bottomMargin = i4;
            }
        }
        view.setLayoutParams(layoutParams);
    }
}
