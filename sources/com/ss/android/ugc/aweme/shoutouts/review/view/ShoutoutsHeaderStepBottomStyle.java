package com.ss.android.ugc.aweme.shoutouts.review.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.setting.services.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class ShoutoutsHeaderStepBottomStyle extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f133447a;

    static {
        Covode.recordClassIndex(87270);
    }

    public ShoutoutsHeaderStepBottomStyle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.cgq).setOnClickListener(new a(this));
        findViewById(R.id.cff).setOnClickListener(new b(this));
    }

    public final void setOnlyView(boolean z) {
        this.f133447a = z;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsHeaderStepBottomStyle f133449a;

        static {
            Covode.recordClassIndex(87272);
        }

        b(ShoutoutsHeaderStepBottomStyle shoutoutsHeaderStepBottomStyle) {
            this.f133449a = shoutoutsHeaderStepBottomStyle;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f133449a.f133447a) {
                Context context = this.f133449a.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                new com.bytedance.tux.g.b((Activity) context).a(this.f133449a.getResources().getString(R.string.g0_)).b();
                return;
            }
            Context context2 = this.f133449a.getContext();
            l.b(context2, "");
            com.ss.android.ugc.aweme.shoutouts.b.a.a(context2);
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutoutsHeaderStepBottomStyle f133448a;

        static {
            Covode.recordClassIndex(87271);
        }

        a(ShoutoutsHeaderStepBottomStyle shoutoutsHeaderStepBottomStyle) {
            this.f133448a = shoutoutsHeaderStepBottomStyle;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f133448a.f133447a) {
                Context context = this.f133448a.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                new com.bytedance.tux.g.b((Activity) context).a(this.f133448a.getResources().getString(R.string.g0_)).b();
                return;
            }
            f fVar = f.f122672a;
            Context context2 = this.f133448a.getContext();
            Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
            fVar.a((Activity) context2);
        }
    }

    private /* synthetic */ ShoutoutsHeaderStepBottomStyle(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ShoutoutsHeaderStepBottomStyle(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(2461);
        MethodCollector.o(2461);
    }
}
