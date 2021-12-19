package com.ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.ui.bk;
import java.util.Objects;

public final class ReportVideoMaskWidget extends AbsAsyncFeedWidget {

    /* renamed from: a  reason: collision with root package name */
    private bk f93119a;

    static {
        Covode.recordClassIndex(59055);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final void a(b bVar) {
        bk bkVar = this.f93119a;
        if (bkVar != null) {
            bkVar.onChanged(bVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.u, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final /* synthetic */ void onChanged(b bVar) {
        onChanged(bVar);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final /* synthetic */ a b(View view) {
        if (this.f93119a == null) {
            this.f93119a = new bk(view);
        }
        bk bkVar = this.f93119a;
        Objects.requireNonNull(bkVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.ReportVideoMaskView");
        return bkVar;
    }
}
