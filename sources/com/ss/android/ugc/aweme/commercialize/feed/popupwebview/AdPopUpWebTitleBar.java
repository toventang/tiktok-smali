package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.aa;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class AdPopUpWebTitleBar extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74348a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private b f74349b;

    /* renamed from: c  reason: collision with root package name */
    private String f74350c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f74351d;

    public interface b {
        static {
            Covode.recordClassIndex(45875);
        }

        void a();

        void b();

        void c();

        void d();
    }

    static {
        Covode.recordClassIndex(45873);
    }

    public AdPopUpWebTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.f74351d == null) {
            this.f74351d = new HashMap();
        }
        View view = (View) this.f74351d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f74351d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45874);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getDefTitle() {
        return this.f74350c;
    }

    public final b getTitleBarListener() {
        return this.f74349b;
    }

    public final void b() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) a(R.id.d72);
        l.b(autoRTLImageView, "");
        autoRTLImageView.setVisibility(0);
        aa.f75531b = true;
    }

    public final void c() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) a(R.id.d72);
        l.b(autoRTLImageView, "");
        autoRTLImageView.setVisibility(8);
        aa.f75531b = false;
    }

    public final void a() {
        int a2 = n.a(12.0d);
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) a(R.id.d7d);
        l.b(autoRTLImageView, "");
        autoRTLImageView.setVisibility(0);
        TuxIconView tuxIconView = (TuxIconView) a(R.id.d7a);
        l.b(tuxIconView, "");
        tuxIconView.setVisibility(8);
        ((TuxIconView) a(R.id.d71)).setPadding(a2, a2, a2, a2);
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.d7h);
        l.b(constraintLayout, "");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.height = n.a(52.5d);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) a(R.id.d7h);
        l.b(constraintLayout2, "");
        constraintLayout2.setLayoutParams(layoutParams);
        ((ConstraintLayout) a(R.id.d7h)).setBackgroundResource(R.drawable.ph);
    }

    public final void setDefTitle(String str) {
        this.f74350c = str;
    }

    public final void setTitleBarListener(b bVar) {
        this.f74349b = bVar;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebTitleBar f74352a;

        static {
            Covode.recordClassIndex(45876);
        }

        c(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f74352a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b titleBarListener = this.f74352a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.b();
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebTitleBar f74353a;

        static {
            Covode.recordClassIndex(45877);
        }

        d(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f74353a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b titleBarListener = this.f74353a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.a();
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebTitleBar f74354a;

        static {
            Covode.recordClassIndex(45878);
        }

        e(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f74354a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b titleBarListener = this.f74354a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.c();
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebTitleBar f74355a;

        static {
            Covode.recordClassIndex(45879);
        }

        f(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f74355a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b titleBarListener = this.f74355a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.a();
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebTitleBar f74356a;

        static {
            Covode.recordClassIndex(45880);
        }

        g(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f74356a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b titleBarListener = this.f74356a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.d();
            }
        }
    }

    public final void b(String str) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.d7f);
        l.b(tuxTextView, "");
        if (str == null && (str = this.f74350c) == null) {
            str = getContext().getString(R.string.g4z);
        }
        tuxTextView.setText(str);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = getContext().getString(R.string.g4z);
        }
        this.f74350c = str;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.d7f);
        l.b(tuxTextView, "");
        tuxTextView.setText(this.f74350c);
    }

    private /* synthetic */ AdPopUpWebTitleBar(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdPopUpWebTitleBar(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(10419);
        com.a.a(LayoutInflater.from(context), R.layout.bjz, this, true);
        MethodCollector.o(10419);
    }
}
