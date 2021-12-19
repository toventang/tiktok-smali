package com.ss.android.ugc.aweme.comment.widgets;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public abstract class BaseSearchGifWidget extends BaseCommentJediWidget implements au {
    static {
        Covode.recordClassIndex(44992);
    }

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract CharSequence o();

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentJediWidget, com.bytedance.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public abstract boolean p();
}
