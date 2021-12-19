package com.ss.android.ugc.aweme.feed.feedwidget;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.ss.android.ugc.aweme.feed.ui.cv;

public class VideoDiggWidget extends AbsAsyncFeedWidget {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f93124a;

    /* renamed from: i  reason: collision with root package name */
    private final a f93125i;

    /* renamed from: j  reason: collision with root package name */
    private cv f93126j;

    public interface a {
        static {
            Covode.recordClassIndex(59064);
        }

        long a();
    }

    static {
        Covode.recordClassIndex(59063);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f67010e.a("awesome_update_data", (u<b>) this).a("awesome_update_backup_data", (u<b>) this);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final void a(b bVar) {
        this.f93126j.onChanged(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.u, com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public /* synthetic */ void onChanged(b bVar) {
        onChanged(bVar);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget
    public final com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a b(View view) {
        cv cvVar = new cv(view, this.f93124a, this.f93125i);
        this.f93126j = cvVar;
        return cvVar;
    }

    public VideoDiggWidget(Bundle bundle, a aVar) {
        this.f93124a = bundle;
        this.f93125i = aVar;
    }
}
