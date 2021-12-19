package com.ss.android.ugc.aweme.discover.ui.d;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.router.SmartRouter;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.ui.av;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.search.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b {

    /* renamed from: c */
    public static final a f82544c = new a((byte) 0);

    /* renamed from: a */
    public Context f82545a;

    /* renamed from: b */
    public av<?> f82546b;

    static {
        Covode.recordClassIndex(51386);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51387);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final d a() {
        d dVar = new d.a(this.f82545a).a(2131232660).b(R.string.h36).c(R.string.h37).d(a.EMPTY.getType()).f33648a;
        l.b(dVar, "");
        return dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.d.b$b */
    public static final class View$OnClickListenerC1938b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Fragment f82547a;

        /* renamed from: b */
        final /* synthetic */ String f82548b;

        static {
            Covode.recordClassIndex(51388);
        }

        View$OnClickListenerC1938b(Fragment fragment, String str) {
            this.f82547a = fragment;
            this.f82548b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.login.c.a(this.f82547a, this.f82548b, "search_freq_control", AnonymousClass1.f82549a);
        }
    }

    public static final class c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ b f82550a;

        /* renamed from: b */
        final /* synthetic */ SearchApiResult f82551b;

        /* renamed from: c */
        final /* synthetic */ Activity f82552c;

        static {
            Covode.recordClassIndex(51390);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(androidx.core.content.b.c(this.f82550a.f82545a, R.color.jr));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("use_scenario", this.f82551b.globalDoodleConfig.getUseScenario());
            LogPbBean logPbBean = this.f82551b.logPb;
            l.b(logPbBean, "");
            r.a("tns_click_community_link", a2.a("search_id", logPbBean.getImprId()).a("search_type", j.a(this.f82550a.f82546b.B)).f66730a);
            g gVar = new g("https://www.tiktok.com/community-guidelines");
            gVar.a("lang", LocalServiceImpl.a().a(this.f82552c));
            SmartRouter.buildRoute(this.f82552c, "//webview").withParam("url", gVar.a()).withParam("title", this.f82552c.getString(R.string.as3)).open();
        }

        c(b bVar, SearchApiResult searchApiResult, Activity activity) {
            this.f82550a = bVar;
            this.f82551b = searchApiResult;
            this.f82552c = activity;
        }
    }

    public b(Context context, av<?> avVar) {
        l.d(context, "");
        l.d(avVar, "");
        this.f82545a = context;
        this.f82546b = avVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0146, code lost:
        if (r7 < 0) goto L_0x0148;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.ies.dmt.ui.widget.d a(com.ss.android.ugc.aweme.discover.model.SearchApiResult r12, java.lang.Exception r13) {
        /*
        // Method dump skipped, instructions count: 497
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.d.b.a(com.ss.android.ugc.aweme.discover.model.SearchApiResult, java.lang.Exception):com.bytedance.ies.dmt.ui.widget.d");
    }

    public static /* synthetic */ d a(b bVar, SearchApiResult searchApiResult, Exception exc, int i2) {
        if ((i2 & 1) != 0) {
            searchApiResult = null;
        }
        if ((i2 & 2) != 0) {
            exc = null;
        }
        return bVar.a(searchApiResult, exc);
    }
}
