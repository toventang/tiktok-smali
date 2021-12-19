package com.ss.android.ugc.aweme.commercialize.playfun;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget;

public abstract class AbsAdPlayFunWidget extends AbsAdFeedWidget implements au {
    static {
        Covode.recordClassIndex(46201);
    }

    public abstract void a(boolean z);

    public abstract void e();

    public abstract void f();

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }
}
