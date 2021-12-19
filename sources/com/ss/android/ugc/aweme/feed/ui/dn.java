package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.anchor.multi.ui.FeedMultiTagLayout;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.experiment.bv;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.c;
import com.ss.android.ugc.aweme.feed.x.g;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import org.json.JSONObject;

public final class dn extends a {

    /* renamed from: a  reason: collision with root package name */
    FeedMultiTagLayout f94605a;

    static {
        Covode.recordClassIndex(60046);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void i() {
        super.i();
        if (this.L != null && !TextUtils.isEmpty(this.L.getAnchorWikiOfflineText())) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.R).a(this.L.getAnchorWikiOfflineText()).a();
            this.L.setAnchorWikiOfflineText("");
        }
        c.a(this.L, this.R, Integer.valueOf(this.P));
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final boolean a(b bVar) {
        return g.a(bVar, Cdo.f94606a);
    }

    public dn(View view) {
        super(view, ((Boolean) bv.f89649g.getValue()).booleanValue());
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.a("on_page_selected", (u<b>) this.J);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        View a2 = com.a.b.c.a((Activity) this.R, (int) R.layout.aj5);
        this.f94605a = (FeedMultiTagLayout) a2.findViewById(R.id.b1p);
        this.T = a2;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void c(b bVar) {
        if (bVar != null) {
            p.f93149a.a(new r(false, new dq(this, bVar.f67014a)));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(b bVar) {
        MethodCollector.i(10264);
        if (!this.K) {
            this.K = true;
            if (this.S instanceof FrameLayout) {
                ((FrameLayout) this.S).addView(this.T);
            }
        }
        if (bVar == null) {
            MethodCollector.o(10264);
        } else if (((Integer) ((HashMap) bVar.a()).get("aweme_type_state")).intValue() == 0) {
            this.f94605a.c();
            MethodCollector.o(10264);
        } else {
            this.f94605a.a();
            MethodCollector.o(10264);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final b e(b bVar) {
        String str;
        b bVar2 = null;
        if (bVar == null) {
            return null;
        }
        super.e(bVar);
        if (TextUtils.equals(bVar.f67014a, "video_params")) {
            HashMap hashMap = new HashMap();
            bVar2 = new b("ui_state", hashMap);
            if (this.M == null) {
                com.bytedance.services.apm.api.a.a("widget event type null ");
                com.ss.android.ugc.aweme.framework.a.a.b(6, "VideoFeedTagView", "mEventType null");
            }
            this.f94605a.setOnInternalEventListener(new dp(this));
            if (TextUtils.isEmpty(this.M)) {
                str = "nullEventType";
            } else {
                str = this.M;
            }
            int a2 = this.f94605a.a(this.L, (Activity) this.R, str, this.N);
            hashMap.put("aweme_type_state", Integer.valueOf(a2));
            if (a2 == 0) {
                return bVar2;
            }
            Aweme aweme = this.L;
            JSONObject jSONObject = this.N;
            hashMap.put("aweme_state", aweme);
            hashMap.put("event_type_state", str);
            hashMap.put("req_id_state", jSONObject);
        }
        return bVar2;
    }
}
