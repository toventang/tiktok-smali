package com.ss.android.ugc.aweme.feed.feedwidget;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.experiment.hh;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.ui.dz;
import com.ss.android.ugc.aweme.feed.ui.ev;
import java.util.HashMap;

public final class VideoAuthorInfoWidget extends AbsAsyncFeedWidget {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, String> f93120a = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private final View.OnTouchListener f93121i;

    /* renamed from: j  reason: collision with root package name */
    private final String f93122j;

    static {
        Covode.recordClassIndex(59059);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final void a(b bVar) {
        this.f93129h.onChanged(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.u, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final /* synthetic */ void onChanged(b bVar) {
        onChanged(bVar);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final a b(View view) {
        if (!hh.b() || !TextUtils.equals(this.f93122j, "homepage_hot")) {
            return new ev(view, this.f93121i, af_(), this.f93120a);
        }
        return new dz(view, this.f93121i, af_(), this.f93120a);
    }

    public VideoAuthorInfoWidget(View.OnTouchListener onTouchListener, String str) {
        this.f93121i = onTouchListener;
        this.f93122j = str;
    }
}
