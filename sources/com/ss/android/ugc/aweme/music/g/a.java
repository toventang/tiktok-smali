package com.ss.android.ugc.aweme.music.g;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.ui.MusicDetailActivity;
import h.f.b.l;

public abstract class a implements com.ss.android.ugc.aweme.base.a.a {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f111503a;

    static {
        Covode.recordClassIndex(71620);
    }

    public a(Activity activity) {
        l.d(activity, "");
        this.f111503a = activity;
    }

    public final void a(boolean z) {
        if (z) {
            Activity activity = this.f111503a;
            if (activity instanceof MusicDetailActivity) {
                ((MusicDetailActivity) activity).registerActivityOnKeyDownListener(this);
                return;
            }
            return;
        }
        Activity activity2 = this.f111503a;
        if (activity2 instanceof MusicDetailActivity) {
            ((MusicDetailActivity) activity2).unRegisterActivityOnKeyDownListener(this);
        }
    }
}
