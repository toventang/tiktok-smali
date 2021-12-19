package com.ss.android.ugc.aweme.crossplatform.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.l.a.a.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class CrossPlatformTitleBar extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private a f78927a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.crossplatform.d.a.a f78928b;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f78929c;

    public interface a {
        static {
            Covode.recordClassIndex(48981);
        }

        void a();

        void a(View view);

        void b();

        void c();

        void d();

        void e();
    }

    static {
        Covode.recordClassIndex(48980);
    }

    private View a(int i2) {
        if (this.f78929c == null) {
            this.f78929c = new SparseArray();
        }
        View view = (View) this.f78929c.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f78929c.put(i2, findViewById);
        return findViewById;
    }

    public final com.ss.android.ugc.aweme.crossplatform.d.a.a getCrossPlatformParams() {
        return this.f78928b;
    }

    public final a getTitleWrap() {
        return this.f78927a;
    }

    public final void c() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) a(R.id.a7m);
        l.b(autoRTLImageView, "");
        autoRTLImageView.setVisibility(0);
    }

    public final void d() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) a(R.id.a7m);
        l.b(autoRTLImageView, "");
        autoRTLImageView.setVisibility(8);
    }

    public final void a() {
        com.ss.android.ugc.aweme.crossplatform.d.f fVar;
        setBackgroundColor(0);
        View a2 = a(R.id.so);
        l.b(a2, "");
        a2.setVisibility(8);
        com.ss.android.ugc.aweme.crossplatform.d.a.a aVar = this.f78928b;
        if (!(aVar == null || (fVar = aVar.f78744d) == null || !fVar.G)) {
            View a3 = a(R.id.so);
            l.b(a3, "");
            a3.setVisibility(8);
        }
        TuxTextView tuxTextView = (TuxTextView) a(R.id.title);
        l.b(tuxTextView, "");
        tuxTextView.setVisibility(8);
        ((TuxIconView) a(R.id.a7s)).setIconRes(R.raw.icon_arrow_left_ltr);
        ((TuxIconView) a(R.id.a7s)).setTintColorRes(R.attr.f159902m);
        ((TuxIconView) a(R.id.a7s)).a(true);
        ((AutoRTLImageView) a(R.id.a7m)).setImageResource(2131231848);
        ((AutoRTLImageView) a(R.id.zo)).setImageResource(2131231855);
        ((TuxIconView) a(R.id.dll)).setIconRes(R.raw.icon_flag);
        ((TuxIconView) a(R.id.dll)).setTintColorRes(R.attr.f159902m);
        ((TuxIconView) a(R.id.dll)).a(true);
        ((AutoRTLImageView) a(R.id.dng)).setImageResource(2131231850);
    }

    public final void b() {
        com.ss.android.ugc.aweme.crossplatform.d.a.a aVar = this.f78928b;
        if (aVar != null) {
            if (aVar.f78744d.f78798f != -2) {
                setBackgroundColor(aVar.f78744d.f78798f);
            } else {
                setBackgroundResource(R.drawable.b03);
            }
            if (aVar.f78744d.f78800h != -2) {
                ((TuxTextView) a(R.id.title)).setTextColor(aVar.f78744d.f78800h);
                Context context = getContext();
                if (context != null) {
                    i a2 = i.a(context.getResources(), R.drawable.a3r, context.getTheme());
                    if (a2 != null) {
                        a2.setTint(aVar.f78744d.f78800h);
                    }
                    ((TuxIconView) a(R.id.a7s)).setImageDrawable(a2);
                }
            } else {
                ((TuxIconView) a(R.id.a7s)).setIconRes(R.raw.icon_arrow_left_ltr);
            }
            View a3 = a(R.id.so);
            l.b(a3, "");
            a3.setVisibility(8);
            TuxTextView tuxTextView = (TuxTextView) a(R.id.title);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            ((AutoRTLImageView) a(R.id.a7m)).setImageResource(2131231849);
            ((AutoRTLImageView) a(R.id.zo)).setImageResource(2131231857);
            ((TuxIconView) a(R.id.dll)).setIconRes(R.raw.icon_exclamation_mark_triangle_fill);
            ((AutoRTLImageView) a(R.id.dng)).setImageResource(2131231851);
        }
    }

    public final void setTitleWrap(a aVar) {
        this.f78927a = aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CrossPlatformTitleBar f78931a;

        static {
            Covode.recordClassIndex(48983);
        }

        c(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f78931a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a titleWrap = this.f78931a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CrossPlatformTitleBar f78932a;

        static {
            Covode.recordClassIndex(48984);
        }

        d(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f78932a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a titleWrap = this.f78932a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CrossPlatformTitleBar f78933a;

        static {
            Covode.recordClassIndex(48985);
        }

        e(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f78933a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a titleWrap = this.f78933a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CrossPlatformTitleBar f78934a;

        static {
            Covode.recordClassIndex(48986);
        }

        f(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f78934a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a titleWrap = this.f78934a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CrossPlatformTitleBar f78935a;

        static {
            Covode.recordClassIndex(48987);
        }

        g(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f78935a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a titleWrap = this.f78935a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.c();
            }
        }
    }

    public final void setBackgroundAlpha(float f2) {
        View a2 = a(R.id.so);
        l.b(a2, "");
        a2.setAlpha(f2);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CrossPlatformTitleBar f78930a;

        static {
            Covode.recordClassIndex(48982);
        }

        b(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f78930a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a titleWrap = this.f78930a.getTitleWrap();
            if (titleWrap != null) {
                l.b(view, "");
                titleWrap.a(view);
            }
        }
    }

    public final void setTitle(CharSequence charSequence) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.title);
        l.b(tuxTextView, "");
        tuxTextView.setText(charSequence);
    }

    public final void a(boolean z) {
        int i2;
        TuxIconView tuxIconView = (TuxIconView) a(R.id.dlu);
        l.b(tuxIconView, "");
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxIconView.setVisibility(i2);
    }

    public final void setCrossPlatformParams(com.ss.android.ugc.aweme.crossplatform.d.a.a aVar) {
        String str;
        this.f78928b = aVar;
        if (aVar != null) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.title);
            l.b(tuxTextView, "");
            if (TextUtils.isEmpty(aVar.f78744d.f78797e)) {
                str = getContext().getString(R.string.g4z);
            } else {
                str = aVar.f78744d.f78797e;
            }
            tuxTextView.setText(str);
            ((AutoRTLImageView) a(R.id.dng)).setOnClickListener(new b(this));
            ((TuxIconView) a(R.id.a7s)).setOnClickListener(new c(this));
            ((AutoRTLImageView) a(R.id.a7m)).setOnClickListener(new d(this));
            if (aVar.f78744d.f78795c) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) a(R.id.dng);
                l.b(autoRTLImageView, "");
                autoRTLImageView.setVisibility(8);
            }
            ((AutoRTLImageView) a(R.id.zo)).setOnClickListener(new e(this));
            if (TextUtils.equals(aVar.f78744d.f78802j, "1")) {
                TuxIconView tuxIconView = (TuxIconView) a(R.id.a7s);
                l.b(tuxIconView, "");
                tuxIconView.setVisibility(8);
            } else {
                TuxIconView tuxIconView2 = (TuxIconView) a(R.id.a7s);
                l.b(tuxIconView2, "");
                tuxIconView2.setVisibility(0);
            }
            if (aVar.f78744d.f78798f != -2) {
                TuxTextView tuxTextView2 = (TuxTextView) a(R.id.title);
                l.b(tuxTextView2, "");
                tuxTextView2.setBackground(new ColorDrawable(aVar.f78744d.f78798f));
                setBackgroundColor(aVar.f78744d.f78798f);
            }
            if (aVar.f78744d.f78800h != -2) {
                ((TuxTextView) a(R.id.title)).setTextColor(aVar.f78744d.f78800h);
                Context context = getContext();
                if (context != null) {
                    i a2 = i.a(context.getResources(), R.drawable.a3r, context.getTheme());
                    if (a2 != null) {
                        a2.setTint(aVar.f78744d.f78800h);
                    }
                    ((TuxIconView) a(R.id.a7s)).setImageDrawable(a2);
                }
            }
            if (aVar.f78744d.f78795c) {
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) a(R.id.zo);
                l.b(autoRTLImageView2, "");
                autoRTLImageView2.setVisibility(8);
            }
            if (aVar.f78744d.f78796d) {
                if (AwemeService.b().d(aVar.f78741a.f78737j) != null) {
                    TuxIconView tuxIconView3 = (TuxIconView) a(R.id.dll);
                    l.b(tuxIconView3, "");
                    tuxIconView3.setVisibility(0);
                    ((TuxIconView) a(R.id.dll)).setOnClickListener(new f(this));
                }
                AutoRTLImageView autoRTLImageView3 = (AutoRTLImageView) a(R.id.zo);
                l.b(autoRTLImageView3, "");
                autoRTLImageView3.setVisibility(8);
            }
            if (aVar.f78744d.D == 2) {
                AutoRTLImageView autoRTLImageView4 = (AutoRTLImageView) a(R.id.zo);
                l.b(autoRTLImageView4, "");
                autoRTLImageView4.setVisibility(0);
                TuxIconView tuxIconView4 = (TuxIconView) a(R.id.dll);
                l.b(tuxIconView4, "");
                tuxIconView4.setVisibility(8);
            } else if (aVar.f78744d.D == 1) {
                AutoRTLImageView autoRTLImageView5 = (AutoRTLImageView) a(R.id.zo);
                l.b(autoRTLImageView5, "");
                autoRTLImageView5.setVisibility(8);
                TuxIconView tuxIconView5 = (TuxIconView) a(R.id.dll);
                l.b(tuxIconView5, "");
                tuxIconView5.setVisibility(0);
            }
            View a3 = a(R.id.dng);
            l.b(a3, "");
            l.d(aVar, "");
            l.d(a3, "");
            if (!TextUtils.isEmpty(aVar.f78741a.o)) {
                TuxIconView tuxIconView6 = (TuxIconView) a(R.id.dlu);
                l.b(tuxIconView6, "");
                tuxIconView6.setVisibility(0);
                ((TuxIconView) a(R.id.dlu)).setOnClickListener(new g(this));
                TuxIconView tuxIconView7 = (TuxIconView) a(R.id.dll);
                l.b(tuxIconView7, "");
                tuxIconView7.setVisibility(8);
                AutoRTLImageView autoRTLImageView6 = (AutoRTLImageView) a(R.id.zo);
                l.b(autoRTLImageView6, "");
                autoRTLImageView6.setVisibility(8);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossPlatformTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(11875);
        com.a.a(LayoutInflater.from(getContext()), R.layout.vb, this, true);
        setBackgroundResource(R.drawable.b03);
        setMinimumHeight((int) getResources().getDimension(R.dimen.tn));
        MethodCollector.o(11875);
    }
}
