package com.ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.g;

public abstract class AbsFeedWidget extends GenericWidget implements u<b> {

    /* renamed from: a  reason: collision with root package name */
    private g f93114a;

    static {
        Covode.recordClassIndex(59050);
    }

    /* access modifiers changed from: protected */
    public abstract g b(View view);

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStop() {
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        g gVar = this.f93114a;
        if (gVar != null) {
            gVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f67010e.a("video_params", (u<b>) this).a("on_viewpager_page_selected", (u<b>) this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.u
    public /* synthetic */ void onChanged(b bVar) {
        onChanged(bVar);
    }

    /* access modifiers changed from: protected */
    public final void b(b bVar) {
        VideoItemParams videoItemParams = (VideoItemParams) bVar.a();
        g gVar = this.f93114a;
        if (gVar != null) {
            gVar.a(videoItemParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(View view) {
        super.a(view);
        g b2 = b(view);
        this.f93114a = b2;
        b2.b(this.f67010e);
        VideoItemParams videoItemParams = (VideoItemParams) this.f67010e.a("video_params");
        if (videoItemParams != null) {
            this.f93114a.a(videoItemParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget
    public void a(b bVar) {
        if (bVar != null) {
            String str = bVar.f67014a;
            str.hashCode();
            if (str.equals("on_viewpager_page_selected")) {
                g gVar = this.f93114a;
                if (gVar != null) {
                    gVar.b();
                }
            } else if (str.equals("video_params")) {
                b(bVar);
            }
        }
    }
}
