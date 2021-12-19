package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.s;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class DebugInfoView extends LinearLayout {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f94081c = true;

    /* renamed from: d  reason: collision with root package name */
    public static final a f94082d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ScrollView f94083a;

    /* renamed from: b  reason: collision with root package name */
    public Switch f94084b;

    /* renamed from: e  reason: collision with root package name */
    private RelativeLayout f94085e;

    public static final class a {
        static {
            Covode.recordClassIndex(59806);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(59805);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DebugInfoView(Context context) {
        this(context, null);
        l.d(context, "");
    }

    public static final /* synthetic */ ScrollView a(DebugInfoView debugInfoView) {
        ScrollView scrollView = debugInfoView.f94083a;
        if (scrollView == null) {
            l.a("mDebugInfoContainer");
        }
        return scrollView;
    }

    public static final /* synthetic */ Switch b(DebugInfoView debugInfoView) {
        Switch r1 = debugInfoView.f94084b;
        if (r1 == null) {
            l.a("mDebugSwitch");
        }
        return r1;
    }

    public final void setContent(String str) {
        MethodCollector.i(9023);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin() || !m.a(d.s, "lark_inhouse")) {
            MethodCollector.o(9023);
            return;
        }
        s sVar = s.a.f66880a;
        l.b(sVar, "");
        if (sVar.f66872f == null) {
            sVar.f66872f = new aj<>("debug_text", (Boolean) true);
        }
        aj<Boolean> ajVar = sVar.f66872f;
        l.b(ajVar, "");
        Boolean c2 = ajVar.c();
        l.b(c2, "");
        if (c2.booleanValue()) {
            com.a.a(LayoutInflater.from(getContext()), R.layout.tm, this, true);
            View findViewById = findViewById(R.id.eg9);
            l.b(findViewById, "");
            this.f94083a = (ScrollView) findViewById;
            View findViewById2 = findViewById(R.id.egp);
            l.b(findViewById2, "");
            this.f94084b = (Switch) findViewById2;
            View findViewById3 = findViewById(R.id.doe);
            l.b(findViewById3, "");
            this.f94085e = (RelativeLayout) findViewById3;
            Switch r1 = this.f94084b;
            if (r1 == null) {
                l.a("mDebugSwitch");
            }
            r1.setOnCheckedChangeListener(new b(this));
            RelativeLayout relativeLayout = this.f94085e;
            if (relativeLayout == null) {
                l.a("mDebugInfoAll");
            }
            relativeLayout.setVisibility(0);
            Switch r12 = this.f94084b;
            if (r12 == null) {
                l.a("mDebugSwitch");
            }
            r12.setChecked(f94081c);
            if (f94081c) {
                ScrollView scrollView = this.f94083a;
                if (scrollView == null) {
                    l.a("mDebugInfoContainer");
                }
                scrollView.setVisibility(0);
            } else {
                ScrollView scrollView2 = this.f94083a;
                if (scrollView2 == null) {
                    l.a("mDebugInfoContainer");
                }
                scrollView2.setVisibility(8);
            }
            Context context = getContext();
            l.b(context, "");
            TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
            tuxTextView.setText(str);
            tuxTextView.setTextColor(androidx.core.content.b.c(getContext(), R.color.a_));
            tuxTextView.setGravity(getLeft());
            tuxTextView.setTextAlignment(5);
            tuxTextView.setLineSpacing(0.0f, 1.5f);
            tuxTextView.setTextDirection(5);
            ScrollView scrollView3 = this.f94083a;
            if (scrollView3 == null) {
                l.a("mDebugInfoContainer");
            }
            scrollView3.removeAllViews();
            ScrollView scrollView4 = this.f94083a;
            if (scrollView4 == null) {
                l.a("mDebugInfoContainer");
            }
            scrollView4.addView(tuxTextView);
            MethodCollector.o(9023);
            return;
        }
        MethodCollector.o(9023);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(9207);
        MethodCollector.o(9207);
    }

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DebugInfoView f94086a;

        static {
            Covode.recordClassIndex(59807);
        }

        b(DebugInfoView debugInfoView) {
            this.f94086a = debugInfoView;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                DebugInfoView.a(this.f94086a).setVisibility(0);
                DebugInfoView.f94081c = true;
                DebugInfoView.b(this.f94086a).setChecked(DebugInfoView.f94081c);
                return;
            }
            DebugInfoView.a(this.f94086a).setVisibility(8);
            DebugInfoView.f94081c = false;
            DebugInfoView.b(this.f94086a).setChecked(DebugInfoView.f94081c);
        }
    }
}
