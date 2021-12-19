package com.ss.android.ugc.aweme.feed.feedwidget;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.ui.df;
import h.f.b.l;
import java.util.Objects;

public final class VideoDuetWidget extends AbsAsyncFeedWidget {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f93127a;

    /* renamed from: i  reason: collision with root package name */
    private df f93128i;

    static {
        Covode.recordClassIndex(59065);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final void a(b bVar) {
        df dfVar = this.f93128i;
        if (dfVar != null) {
            dfVar.onChanged(bVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.u, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final /* synthetic */ void onChanged(b bVar) {
        onChanged(bVar);
    }

    public VideoDuetWidget(Bundle bundle) {
        l.d(bundle, "");
        this.f93127a = bundle;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final a b(View view) {
        if (this.f93128i == null) {
            this.f93128i = new df(view, this.f93127a);
        }
        df dfVar = this.f93128i;
        Objects.requireNonNull(dfVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.VideoDuetView");
        return dfVar;
    }
}
