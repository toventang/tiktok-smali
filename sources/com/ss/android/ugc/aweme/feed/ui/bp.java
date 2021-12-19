package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.a.b.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.x.g;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class bp extends g implements u<b> {

    /* renamed from: l  reason: collision with root package name */
    private View f94399l;

    static {
        Covode.recordClassIndex(59963);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a() {
    }

    private final boolean c() {
        if (!g.a(this.f94768a) || a.e().c() != 3) {
            return false;
        }
        return true;
    }

    public bp(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a(DataCenter dataCenter) {
        DataCenter a2;
        if (dataCenter != null && (a2 = dataCenter.a("on_viewpager_page_selected", (u<b>) this)) != null) {
            a2.a("startPlayAnimation", (u<b>) this);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(b bVar) {
        String str;
        b bVar2 = bVar;
        if (l.a((Object) "homepage_hot", (Object) this.f94769b) && this.f94772e == 0 && this.f94778k == 1) {
            if (bVar2 != null) {
                str = bVar2.f67014a;
            } else {
                str = null;
            }
            a(str);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a(View view) {
        MethodCollector.i(7100);
        View a2 = c.a((Activity) this.f94774g, (int) R.layout.ts);
        l.b(a2, "");
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a2);
        }
        this.f94399l = a2;
        if (a2 != null) {
            a2.setVisibility(8);
            MethodCollector.o(7100);
            return;
        }
        MethodCollector.o(7100);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.g
    public final void a(VideoItemParams videoItemParams) {
        super.a(videoItemParams);
        if (l.a((Object) "homepage_hot", (Object) this.f94769b) && this.f94772e == 0 && this.f94778k == 1) {
            a("on_viewpager_page_selected");
        }
    }

    private final void a(String str) {
        View view;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1180796502) {
                if (hashCode == 307897710 && str.equals("startPlayAnimation") && (view = this.f94399l) != null && view.getVisibility() == 0) {
                    i O = v.O();
                    l.b(O, "");
                    if (O.o()) {
                        v.O().B();
                    }
                }
            } else if (!str.equals("on_viewpager_page_selected")) {
            } else {
                if (c()) {
                    View view2 = this.f94399l;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    d a2 = new d().a("enter_from", this.f94769b);
                    Aweme aweme = this.f94768a;
                    l.b(aweme, "");
                    d a3 = a2.a("group_id", aweme.getAid());
                    Aweme aweme2 = this.f94768a;
                    l.b(aweme2, "");
                    r.a("opt_out_layer_show", a3.a("author_id", aweme2.getAuthorUid()).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.a(this.f94768a, this.f94772e))).f66730a);
                    return;
                }
                View view3 = this.f94399l;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
        }
    }
}
