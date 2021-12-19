package com.ss.android.ugc.aweme.bullet.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.l.a.a.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.f.a.b.k;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.service.f.a.b.t;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class BulletCommonTitleBar extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private a f69546a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f69547b;

    public interface a {
        static {
            Covode.recordClassIndex(42893);
        }

        void a();

        void a(View view);

        void b();

        void c();

        void d();
    }

    static {
        Covode.recordClassIndex(42892);
    }

    public final View a(int i2) {
        if (this.f69547b == null) {
            this.f69547b = new HashMap();
        }
        View view = (View) this.f69547b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f69547b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final a getTitleWrap() {
        return this.f69546a;
    }

    public final void setTitleWrap(a aVar) {
        this.f69546a = aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BulletCommonTitleBar f69548a;

        static {
            Covode.recordClassIndex(42894);
        }

        b(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f69548a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a titleWrap = this.f69548a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BulletCommonTitleBar f69550a;

        static {
            Covode.recordClassIndex(42896);
        }

        d(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f69550a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a titleWrap = this.f69550a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BulletCommonTitleBar f69551a;

        static {
            Covode.recordClassIndex(42897);
        }

        e(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f69551a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a titleWrap = this.f69551a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BulletCommonTitleBar f69552a;

        static {
            Covode.recordClassIndex(42898);
        }

        f(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f69552a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a titleWrap = this.f69552a.getTitleWrap();
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
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BulletCommonTitleBar f69549a;

        static {
            Covode.recordClassIndex(42895);
        }

        c(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f69549a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a titleWrap = this.f69549a.getTitleWrap();
            if (titleWrap != null) {
                l.b(view, "");
                titleWrap.a(view);
            }
        }
    }

    public final void setTitle(CharSequence charSequence) {
        l.d(charSequence, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.title);
        l.b(tuxTextView, "");
        tuxTextView.setText(charSequence);
    }

    public final void a(com.bytedance.ies.bullet.service.f.a.b bVar) {
        String b2;
        int i2;
        int i3;
        if (bVar != null) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.title);
            l.b(tuxTextView, "");
            if (TextUtils.isEmpty(bVar.f32691g.b())) {
                Context context = getContext();
                l.b(context, "");
                Resources resources = context.getResources();
                if (resources != null) {
                    b2 = resources.getString(R.string.g4z);
                } else {
                    b2 = null;
                }
            } else {
                b2 = bVar.f32691g.b();
            }
            tuxTextView.setText(b2);
            ((AutoRTLImageView) a(R.id.dng)).setOnClickListener(new c(this));
            ((AutoRTLImageView) a(R.id.a7s)).setOnClickListener(new d(this));
            ((AutoRTLImageView) a(R.id.a7m)).setOnClickListener(new e(this));
            if (l.a(bVar.M.b(), (Object) true)) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) a(R.id.dng);
                l.b(autoRTLImageView, "");
                autoRTLImageView.setVisibility(8);
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) a(R.id.zo);
                l.b(autoRTLImageView2, "");
                autoRTLImageView2.setVisibility(8);
            }
            ((AutoRTLImageView) a(R.id.zo)).setOnClickListener(new f(this));
            if (l.a((Object) bVar.s.b(), (Object) true)) {
                AutoRTLImageView autoRTLImageView3 = (AutoRTLImageView) a(R.id.a7s);
                l.b(autoRTLImageView3, "");
                autoRTLImageView3.setVisibility(0);
            }
            t b3 = bVar.f32688d.b();
            if (!(b3 == null || (i3 = b3.f32728a) == -2)) {
                TuxTextView tuxTextView2 = (TuxTextView) a(R.id.title);
                l.b(tuxTextView2, "");
                tuxTextView2.setBackground(new ColorDrawable(i3));
                setBackgroundColor(i3);
            }
            t b4 = bVar.f32692h.b();
            if (!(b4 == null || (i2 = b4.f32728a) == -2)) {
                ((TuxTextView) a(R.id.title)).setTextColor(i2);
                Context context2 = getContext();
                if (context2 != null) {
                    i a2 = i.a(context2.getResources(), R.drawable.a3r, context2.getTheme());
                    if (a2 != null) {
                        a2.setTint(i2);
                    }
                    ((AutoRTLImageView) a(R.id.a7s)).setImageDrawable(a2);
                }
            }
            if (l.a(q.a(bVar, "show_report"), (Object) true)) {
                if (AwemeService.b().d((String) q.a(bVar, "aweme_id")) != null) {
                    AutoRTLImageView autoRTLImageView4 = (AutoRTLImageView) a(R.id.dll);
                    l.b(autoRTLImageView4, "");
                    autoRTLImageView4.setVisibility(0);
                    ((AutoRTLImageView) a(R.id.dll)).setOnClickListener(new b(this));
                }
                AutoRTLImageView autoRTLImageView5 = (AutoRTLImageView) a(R.id.zo);
                l.b(autoRTLImageView5, "");
                autoRTLImageView5.setVisibility(8);
            }
            if (bVar.f32693i.b() == k.SHARE) {
                AutoRTLImageView autoRTLImageView6 = (AutoRTLImageView) a(R.id.zo);
                l.b(autoRTLImageView6, "");
                autoRTLImageView6.setVisibility(0);
                AutoRTLImageView autoRTLImageView7 = (AutoRTLImageView) a(R.id.dll);
                l.b(autoRTLImageView7, "");
                autoRTLImageView7.setVisibility(8);
            } else if (bVar.f32693i.b() == k.REPORT) {
                AutoRTLImageView autoRTLImageView8 = (AutoRTLImageView) a(R.id.zo);
                l.b(autoRTLImageView8, "");
                autoRTLImageView8.setVisibility(8);
                AutoRTLImageView autoRTLImageView9 = (AutoRTLImageView) a(R.id.dll);
                l.b(autoRTLImageView9, "");
                autoRTLImageView9.setVisibility(0);
            }
            a(R.id.dng);
            l.d(bVar, "");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BulletCommonTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(12505);
        com.a.a(LayoutInflater.from(getContext()), R.layout.mb, this, true);
        setBackgroundResource(R.drawable.u6);
        setMinimumHeight((int) getResources().getDimension(R.dimen.tn));
        MethodCollector.o(12505);
    }
}
