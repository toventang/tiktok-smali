package com.ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.ui.dr;

public final class VideoRelationBtnWidget extends AbsAsyncFeedWidget {
    static {
        Covode.recordClassIndex(59071);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final void a(b bVar) {
        this.f93129h.onChanged(bVar);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final /* synthetic */ a b(View view) {
        return new dr(view);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.u, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final /* synthetic */ void onChanged(b bVar) {
        onChanged(bVar);
    }
}
