package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.a.b.c;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class ea extends com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f94677a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final View f94678b;

    static {
        Covode.recordClassIndex(60080);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
        l.d(dataCenter, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60081);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ea(View view) {
        super(view);
        l.d(view, "");
        this.f94678b = view;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ea f94679a;

        static {
            Covode.recordClassIndex(60082);
        }

        b(ea eaVar) {
            this.f94679a = eaVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Aweme aweme = this.f94679a.L;
            l.b(aweme, "");
            View view2 = this.f94679a.T;
            l.b(view2, "");
            com.ss.android.ugc.aweme.feed.assem.report.a.a(aweme, view2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        MethodCollector.i(7514);
        if (!this.K) {
            this.K = true;
            if (this.S instanceof FrameLayout) {
                ((FrameLayout) this.S).addView(this.T);
            }
        }
        MethodCollector.o(7514);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        l.d(view, "");
        Context context = this.R;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        this.T = c.a((Activity) context, (int) R.layout.sv);
        View view2 = this.T;
        l.b(view2, "");
        view2.setVisibility(0);
        this.T.setOnClickListener(new b(this));
    }
}
