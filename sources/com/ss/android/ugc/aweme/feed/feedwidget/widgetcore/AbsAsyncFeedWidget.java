package com.ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

public abstract class AbsAsyncFeedWidget extends GenericWidget {

    /* renamed from: h  reason: collision with root package name */
    protected a f93129h;

    static {
        Covode.recordClassIndex(59077);
    }

    /* access modifiers changed from: protected */
    public abstract a b(View view);

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onPause() {
        a aVar = this.f93129h;
        if (aVar != null && aVar.I) {
            p.f93149a.a(new r(aVar.I, new f(aVar)));
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onResume() {
        a aVar = this.f93129h;
        if (aVar != null && aVar.I) {
            p.f93149a.a(new r(aVar.I, new c(aVar)));
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onStart() {
        a aVar = this.f93129h;
        if (aVar != null && aVar.I) {
            p.f93149a.a(new r(aVar.I, new b(aVar)));
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onStop() {
        a aVar = this.f93129h;
        if (aVar == null) {
            return;
        }
        if (aVar.I) {
            p.f93149a.a(new r(aVar.I, new g(aVar)));
        } else {
            aVar.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        a aVar = this.f93129h;
        if (aVar != null) {
            aVar.Q.a("video_params", (u<b>) aVar.J).a("on_viewpager_page_selected", (u<b>) aVar.J).a("async_widget_unsafe_data", (u<b>) aVar.J);
            if (aVar.I) {
                p.f93149a.a(new r(aVar.I, new j(aVar)));
                return;
            }
            Object a2 = aVar.Q.a("video_params");
            aVar.f();
            if (a2 != null) {
                aVar.onChanged(new b("video_params", a2));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        a aVar = this.f93129h;
        if (aVar == null) {
            super.onDestroy();
        } else if (aVar.I) {
            a aVar2 = this.f93129h;
            if (aVar2.I) {
                p.f93149a.a(new r(aVar2.I, new h(aVar2)));
            } else {
                aVar2.h();
            }
            a aVar3 = this.f93129h;
            if (aVar3.I) {
                p.f93149a.a(new r(false, new i(aVar3)));
            } else {
                aVar3.a();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.u
    public /* synthetic */ void onChanged(b bVar) {
        onChanged(bVar);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(View view) {
        p.f93149a.a();
        super.a(view);
        a b2 = b(view);
        this.f93129h = b2;
        b2.J = this;
        this.f93129h.b(this.f67010e);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget
    public void a(b bVar) {
        if (bVar != null) {
            String str = bVar.f67014a;
            str.hashCode();
            if (str.equals("on_viewpager_page_selected")) {
                a aVar = this.f93129h;
                if (aVar != null) {
                    aVar.i();
                }
            } else if (str.equals("video_params")) {
                VideoItemParams videoItemParams = (VideoItemParams) bVar.a();
                a aVar2 = this.f93129h;
                if (aVar2 != null) {
                    aVar2.a(videoItemParams);
                }
            }
        }
    }
}
