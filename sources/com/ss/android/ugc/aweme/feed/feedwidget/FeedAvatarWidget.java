package com.ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.m;

public class FeedAvatarWidget extends AbsAsyncFeedWidget {
    static {
        Covode.recordClassIndex(59051);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f67010e.a("awesome_update_data", (u<b>) this);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final a b(View view) {
        return new m(view);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.u, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public /* synthetic */ void onChanged(b bVar) {
        onChanged(bVar);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final void a(b bVar) {
        this.f93129h.onChanged(bVar);
        if (bVar != null && bVar.a() != null) {
            boolean z = bVar.a() instanceof VideoItemParams;
        }
    }
}
