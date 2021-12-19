package com.ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.ab;
import com.ss.android.ugc.aweme.feed.ui.g;

public class FeedLiveWindowWidget extends AbsFeedWidget {

    /* renamed from: a  reason: collision with root package name */
    public View f93115a;

    /* renamed from: h  reason: collision with root package name */
    private ab f93116h;

    static {
        Covode.recordClassIndex(59052);
    }

    public final FrameLayout e() {
        ab abVar = this.f93116h;
        if (abVar == null) {
            return null;
        }
        return abVar.f94217m;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.u, com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget
    public /* synthetic */ void onChanged(b bVar) {
        onChanged(bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget
    public final g b(View view) {
        ab abVar = new ab(view);
        this.f93116h = abVar;
        this.f93115a = abVar.f94775h;
        return this.f93116h;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget
    public final void a(b bVar) {
        super.a(bVar);
        if (bVar != null && bVar.a() != null && (bVar.a() instanceof VideoItemParams) && "awesome_update_data".equals(bVar.f67014a)) {
            b(bVar);
        }
    }
}
