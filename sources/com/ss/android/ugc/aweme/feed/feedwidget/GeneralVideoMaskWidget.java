package com.ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.ui.ar;
import java.util.Objects;

public final class GeneralVideoMaskWidget extends AbsAsyncFeedWidget {

    /* renamed from: a  reason: collision with root package name */
    private ar f93117a;

    static {
        Covode.recordClassIndex(59053);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final void a(b bVar) {
        ar arVar = this.f93117a;
        if (arVar != null) {
            arVar.onChanged(bVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.u, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final /* synthetic */ void onChanged(b bVar) {
        onChanged(bVar);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final /* synthetic */ a b(View view) {
        if (this.f93117a == null) {
            this.f93117a = new ar(view);
        }
        ar arVar = this.f93117a;
        Objects.requireNonNull(arVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.GeneralVideoMaskView");
        return arVar;
    }
}
