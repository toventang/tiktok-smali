package com.ss.android.ugc.aweme.feed.ui.progressguidance;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class NewUserFeedProgressBar extends RelativeLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final a f94974e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f94975a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f94976b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f94977c;

    /* renamed from: d  reason: collision with root package name */
    public ProgressBar f94978d;

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f94979a = new b();

        static {
            Covode.recordClassIndex(60239);
        }

        b() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(60237);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60238);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final RelativeLayout getProgressViewRoot() {
        RelativeLayout relativeLayout = this.f94975a;
        if (relativeLayout == null) {
            l.a("progressViewRoot");
        }
        return relativeLayout;
    }

    public final void a() {
        RelativeLayout relativeLayout = this.f94975a;
        if (relativeLayout == null) {
            l.a("progressViewRoot");
        }
        relativeLayout.setVisibility(8);
        RelativeLayout relativeLayout2 = this.f94975a;
        if (relativeLayout2 == null) {
            l.a("progressViewRoot");
        }
        relativeLayout2.setVisibility(8);
        RelativeLayout relativeLayout3 = this.f94975a;
        if (relativeLayout3 == null) {
            l.a("progressViewRoot");
        }
        relativeLayout3.setOnClickListener(b.f94979a);
    }

    public final void setProgressViewRoot(RelativeLayout relativeLayout) {
        l.d(relativeLayout, "");
        this.f94975a = relativeLayout;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewUserFeedProgressBar(Context context) {
        this(context, null);
        l.d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewUserFeedProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(9839);
        com.a.a(LayoutInflater.from(getContext()), R.layout.st, this, true);
        View findViewById = findViewById(R.id.dql);
        l.b(findViewById, "");
        this.f94975a = (RelativeLayout) findViewById;
        View findViewById2 = findViewById(R.id.a1t);
        l.b(findViewById2, "");
        this.f94976b = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.dby);
        l.b(findViewById3, "");
        this.f94977c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.edg);
        l.b(findViewById4, "");
        this.f94978d = (ProgressBar) findViewById4;
        MethodCollector.o(9839);
    }
}
