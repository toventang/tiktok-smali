package com.ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.ui.bd;
import java.util.Objects;

public final class PhotosensitiveVideoMaskWidget extends AbsAsyncFeedWidget {

    /* renamed from: a  reason: collision with root package name */
    private bd f93118a;

    static {
        Covode.recordClassIndex(59054);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final void a(b bVar) {
        bd bdVar = this.f93118a;
        if (bdVar != null) {
            bdVar.onChanged(bVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.u, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final /* synthetic */ void onChanged(b bVar) {
        onChanged(bVar);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final /* synthetic */ a b(View view) {
        if (this.f93118a == null) {
            this.f93118a = new bd(view);
        }
        bd bdVar = this.f93118a;
        Objects.requireNonNull(bdVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.PhotosensitiveVideoMaskView");
        return bdVar;
    }
}
