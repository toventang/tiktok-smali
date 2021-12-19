package com.ss.android.ugc.aweme.feed;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.e.d;
import com.ss.android.ugc.aweme.share.q;

public abstract class e extends d implements q {
    static {
        Covode.recordClassIndex(58921);
    }

    public abstract void a();

    public abstract void a(String str);

    public e(String str, int i2) {
        super(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.feed.e.d
    public final void a(Activity activity, Fragment fragment) {
        if (activity == null) {
            com.ss.android.ugc.aweme.comment.a.e.b("ATTACH ACTIVITY == NULL");
        }
        this.f92897b = activity;
        this.f92898c = fragment;
    }
}
