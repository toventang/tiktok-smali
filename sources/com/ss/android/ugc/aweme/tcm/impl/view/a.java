package com.ss.android.ugc.aweme.tcm.impl.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.a.b.c;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.util.d;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.tcm.impl.d.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a implements com.ss.android.ugc.aweme.tcm.api.service.a {

    /* renamed from: a  reason: collision with root package name */
    public View f138648a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f138649b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f138650c;

    static {
        Covode.recordClassIndex(90709);
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.a
    public final void b() {
        View view = this.f138648a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.a
    public final View a() {
        MethodCollector.i(8431);
        ViewGroup viewGroup = this.f138649b;
        if (viewGroup instanceof FrameLayout) {
            this.f138648a = c.a((Activity) this.f138650c, R.layout.wf, viewGroup, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = (int) n.b(this.f138650c, 6.0f);
            this.f138649b.addView(this.f138648a, layoutParams);
            View view = this.f138648a;
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (viewGroup instanceof RelativeLayout) {
            this.f138648a = c.a((Activity) this.f138650c, R.layout.wf, viewGroup, false);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(14);
            layoutParams2.addRule(12);
            layoutParams2.bottomMargin = (int) n.b(this.f138650c, 6.0f);
            this.f138649b.addView(this.f138648a, layoutParams2);
            View view2 = this.f138648a;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        View view3 = this.f138648a;
        MethodCollector.o(8431);
        return view3;
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.view.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC3659a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f138651a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f138652b;

        static {
            Covode.recordClassIndex(90710);
        }

        View$OnClickListenerC3659a(a aVar, Aweme aweme) {
            this.f138651a = aVar;
            this.f138652b = aweme;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                Bundle bundle = new Bundle();
                bundle.putString("itemID", this.f138652b.getAid());
                bundle.putString("enter_from", "video_play");
                Context context = this.f138651a.f138650c;
                BrandedContentToolSchema a2 = b.a();
                if (a2 == null || (str = a2.baViewInsightsSchema) == null) {
                    str = "";
                }
                SmartRouter.buildRoute(context, d.a(str, bundle)).open();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.service.a
    public final void a(Aweme aweme) {
        BrandedContentToolSchema a2;
        View view;
        long j2;
        if (aweme != null && (a2 = b.a()) != null && a2.baViewInsightsSchema != null && (view = this.f138648a) != null) {
            TextView textView = (TextView) view.findViewById(R.id.ew2);
            AwemeStatistics statistics = aweme.getStatistics();
            long j3 = 0;
            if (statistics != null) {
                j2 = statistics.getPlayCount();
            } else {
                j2 = 0;
            }
            String quantityString = this.f138650c.getResources().getQuantityString(R.plurals.s, (int) j2, com.ss.android.ugc.aweme.tcm.impl.e.a.a(j2));
            l.b(quantityString, "");
            if (statistics != null) {
                j3 = statistics.getShareCount();
            }
            String quantityString2 = this.f138650c.getResources().getQuantityString(R.plurals.r, (int) j3, com.ss.android.ugc.aweme.tcm.impl.e.a.a(j3));
            l.b(quantityString2, "");
            String string = this.f138650c.getResources().getString(R.string.b9o);
            l.b(string, "");
            if (textView != null) {
                textView.setText(quantityString + string + ' ' + quantityString2);
            }
            View view2 = this.f138648a;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.f138648a;
            if (view3 != null) {
                view3.setOnClickListener(new View$OnClickListenerC3659a(this, aweme));
            }
        }
    }

    public a(ViewGroup viewGroup, Context context) {
        l.d(viewGroup, "");
        l.d(context, "");
        this.f138649b = viewGroup;
        this.f138650c = context;
    }
}
