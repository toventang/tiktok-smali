package com.bytedance.android.live.design.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.design.app.LifecycleAwareDialog;
import com.bytedance.android.live.design.app.b.d;
import com.bytedance.android.live.design.app.b.e;
import com.bytedance.android.live.design.app.b.h;
import com.bytedance.android.live.design.app.b.i;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;

public class LiveDialog extends LifecycleAwareDialog implements au {
    private boolean A;
    private ColorStateList B;
    private d C;
    private e D;
    private com.bytedance.android.live.design.app.c.b E;
    private LinearLayout F;

    /* renamed from: a  reason: collision with root package name */
    private View f9362a;

    /* renamed from: b  reason: collision with root package name */
    private View f9363b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f9364c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f9365d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f9366e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f9367f;

    /* renamed from: g  reason: collision with root package name */
    private View f9368g;

    /* renamed from: h  reason: collision with root package name */
    private FrameLayout f9369h;

    /* renamed from: i  reason: collision with root package name */
    private LiveTextView f9370i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f9371j;

    /* renamed from: k  reason: collision with root package name */
    private FrameLayout f9372k;

    /* renamed from: l  reason: collision with root package name */
    private com.bytedance.android.live.design.app.a.a f9373l;

    /* renamed from: m  reason: collision with root package name */
    private FrameLayout f9374m;
    private boolean n;
    private CharSequence o;
    private CharSequence p;
    private View q;
    private Drawable r;
    private Drawable s;
    private int t;
    private int u;
    private Drawable v;
    private int w;
    private boolean x;
    private float y;
    private boolean z;

    public interface b {
        static {
            Covode.recordClassIndex(4778);
        }

        void a(DialogInterface dialogInterface);
    }

    static {
        Covode.recordClassIndex(4776);
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static class a extends LifecycleAwareDialog.a<a> {
        private com.bytedance.android.live.design.app.b.i A;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f9375c;

        /* renamed from: d  reason: collision with root package name */
        public View f9376d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f9377e;

        /* renamed from: f  reason: collision with root package name */
        public Drawable f9378f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable f9379g;

        /* renamed from: h  reason: collision with root package name */
        public int f9380h;

        /* renamed from: i  reason: collision with root package name */
        public int f9381i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f9382j;

        /* renamed from: k  reason: collision with root package name */
        public int f9383k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f9384l;

        /* renamed from: m  reason: collision with root package name */
        public float f9385m;
        public boolean n;
        public boolean o;
        public ColorStateList p;
        public boolean q = true;
        public boolean r = true;
        public DialogInterface.OnShowListener s;
        public DialogInterface.OnDismissListener t;
        public DialogInterface.OnCancelListener u;
        public DialogInterface.OnKeyListener v;
        public com.bytedance.android.live.design.app.a.a w;
        public d x;
        public com.bytedance.android.live.design.app.c.b y;
        private h z;

        static {
            Covode.recordClassIndex(4777);
        }

        private a b() {
            d.a aVar = new d.a();
            aVar.a(this.z);
            aVar.a(this.A);
            return a(aVar.a());
        }

        public final LiveDialog a() {
            return new LiveDialog(this.f9361b, this, (byte) 0);
        }

        public a(Context context) {
            super(com.bytedance.android.live.design.a.a.a(context));
        }

        public final a a(int i2) {
            this.f9375c = this.f9361b.getResources().getString(i2);
            return this;
        }

        public final a b(int i2) {
            return a(this.f9361b.getResources().getString(i2));
        }

        public final a a(d dVar) {
            if (!(this.x == null && dVar == null)) {
                this.x = dVar;
                this.y = null;
            }
            return this;
        }

        public final a a(CharSequence charSequence) {
            if (!TextUtils.isEmpty(this.f9377e) || !TextUtils.isEmpty(charSequence)) {
                this.f9377e = charSequence;
                this.f9376d = null;
            }
            return this;
        }

        public final a a(int i2, b bVar) {
            String string = this.f9361b.getResources().getString(i2);
            h.a aVar = new h.a();
            aVar.f9396a = string;
            aVar.f9398c = bVar;
            this.z = aVar.a();
            return b();
        }

        public final a b(int i2, b bVar) {
            String string = this.f9361b.getResources().getString(i2);
            i.a aVar = new i.a();
            aVar.f9396a = string;
            aVar.f9398c = bVar;
            this.A = aVar.a();
            return b();
        }
    }

    private void b() {
        ImageView imageView = this.f9366e;
        if (imageView != null) {
            ConstraintLayout.a aVar = (ConstraintLayout.a) imageView.getLayoutParams();
            if (this.x) {
                aVar.height = this.w;
                aVar.B = null;
            } else if (this.z) {
                aVar.height = 0;
                aVar.B = "w, " + this.y;
            } else {
                aVar.height = -2;
                aVar.B = null;
            }
            this.f9366e.setLayoutParams(aVar);
        }
    }

    private void c() {
        MethodCollector.i(5154);
        List unmodifiableList = Collections.unmodifiableList(this.E.f9421a);
        int size = unmodifiableList.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.bytedance.android.live.design.app.c.a aVar = (com.bytedance.android.live.design.app.c.a) unmodifiableList.get(i2);
            LiveButton liveButton = new LiveButton(getContext());
            liveButton.b(aVar.f9418b);
            if (aVar.f9419c != null) {
                liveButton.setOnClickListener(new c(this, aVar));
            }
            liveButton.setText(aVar.f9417a);
            liveButton.setEnabled(aVar.f9420d);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (i2 > 0) {
                layoutParams.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.nb);
            }
            liveButton.setLayoutParams(layoutParams);
            this.F.addView(liveButton);
        }
        if (size > 1) {
            LinearLayout linearLayout = this.F;
            linearLayout.setPadding(linearLayout.getPaddingLeft(), this.F.getPaddingTop(), this.F.getPaddingRight(), getContext().getResources().getDimensionPixelSize(R.dimen.o3));
            MethodCollector.o(5154);
            return;
        }
        LinearLayout linearLayout2 = this.F;
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), this.F.getPaddingTop(), this.F.getPaddingRight(), getContext().getResources().getDimensionPixelSize(R.dimen.nk));
        MethodCollector.o(5154);
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setTitle(int i2) {
        setTitle(getContext().getResources().getString(i2));
    }

    public void setCanceledOnTouchOutside(boolean z2) {
        super.setCanceledOnTouchOutside(z2);
        this.n = z2;
        View view = this.f9362a;
        if (view == null) {
            return;
        }
        if (z2) {
            view.setOnClickListener(new b(this));
        } else {
            view.setOnClickListener(null);
        }
    }

    private void a(Drawable drawable) {
        ImageView imageView = this.f9364c;
        if (imageView != null && this.f9363b != null) {
            if (drawable == null) {
                imageView.setImageDrawable(null);
                this.f9364c.setVisibility(8);
                this.f9363b.setVisibility(8);
                return;
            }
            imageView.setImageDrawable(drawable);
            this.f9364c.setVisibility(0);
            this.f9363b.setVisibility(0);
        }
    }

    private void c(Drawable drawable) {
        ImageView imageView = this.f9366e;
        if (imageView != null && this.f9363b != null) {
            if (drawable == null) {
                imageView.setImageDrawable(null);
                this.f9366e.setVisibility(8);
                this.f9363b.setVisibility(8);
                return;
            }
            imageView.setImageDrawable(drawable);
            this.f9366e.setVisibility(0);
            this.f9363b.setVisibility(0);
        }
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.o = charSequence;
        if (this.f9367f != null) {
            if (TextUtils.isEmpty(charSequence)) {
                this.f9367f.setText("");
                this.f9367f.setVisibility(8);
            } else {
                this.f9367f.setText(this.o);
                this.f9367f.setVisibility(0);
            }
        }
        a(this.p, this.q);
    }

    private void b(Drawable drawable) {
        ImageView imageView = this.f9365d;
        if (imageView != null && this.f9363b != null) {
            if (drawable == null) {
                imageView.setImageDrawable(null);
                this.f9365d.setVisibility(8);
                this.f9363b.setVisibility(8);
                return;
            }
            imageView.setImageDrawable(drawable);
            this.f9365d.setVisibility(0);
            this.f9363b.setVisibility(0);
        }
    }

    public final void a(com.bytedance.android.live.design.app.a.a aVar) {
        MethodCollector.i(5133);
        this.f9373l = aVar;
        FrameLayout frameLayout = this.f9372k;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            com.bytedance.android.live.design.app.a.a aVar2 = this.f9373l;
            if (aVar2 != null) {
                View a2 = aVar2.a(getContext());
                ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                } else if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                    layoutParams = new FrameLayout.LayoutParams(layoutParams);
                }
                this.f9372k.addView(a2, layoutParams);
                this.f9372k.setVisibility(0);
                MethodCollector.o(5133);
                return;
            }
            this.f9372k.setVisibility(8);
        }
        MethodCollector.o(5133);
    }

    @Override // androidx.appcompat.app.h
    public void onCreate(Bundle bundle) {
        MethodCollector.i(5018);
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                window.addFlags(Integer.MIN_VALUE);
                if (Build.VERSION.SDK_INT < 23) {
                    window.addFlags(67108864);
                    window.addFlags(134217728);
                }
            }
            window.getDecorView().setSystemUiVisibility(512);
            window.setLayout(-1, -1);
        }
        setContentView(View.inflate(getContext(), R.layout.ajv, null), new ViewGroup.LayoutParams(-1, -1));
        this.f9362a = findViewById(R.id.cct);
        setCanceledOnTouchOutside(this.n);
        this.f9363b = findViewById(R.id.ccn);
        this.f9364c = (ImageView) findViewById(R.id.ccl);
        this.f9365d = (ImageView) findViewById(R.id.ccm);
        this.f9366e = (ImageView) findViewById(R.id.cck);
        Drawable drawable = this.r;
        if (drawable != null) {
            b(null);
            c(null);
            this.r = drawable;
            a(drawable);
        } else {
            Drawable drawable2 = this.s;
            if (drawable2 != null) {
                int i2 = this.t;
                int i3 = this.u;
                a((Drawable) null);
                c(null);
                this.s = drawable2;
                b(drawable2);
                this.t = i2;
                this.u = i3;
                ImageView imageView = this.f9365d;
                if (imageView != null) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    layoutParams.width = this.t;
                    layoutParams.height = this.u;
                    this.f9365d.setLayoutParams(layoutParams);
                }
            } else {
                Drawable drawable3 = this.v;
                if (drawable3 != null) {
                    if (this.x) {
                        int i4 = this.w;
                        a((Drawable) null);
                        b(null);
                        this.v = drawable3;
                        c(drawable3);
                        this.w = i4;
                        this.x = true;
                        this.z = false;
                        b();
                    } else if (this.z) {
                        float f2 = this.y;
                        a((Drawable) null);
                        b(null);
                        this.v = drawable3;
                        c(drawable3);
                        this.y = f2;
                        this.z = true;
                        this.x = false;
                        b();
                    }
                }
            }
        }
        this.f9367f = (TextView) findViewById(R.id.ccs);
        setTitle(this.o);
        this.f9368g = findViewById(R.id.ccq);
        this.f9369h = (FrameLayout) findViewById(R.id.ccp);
        LiveTextView liveTextView = (LiveTextView) findViewById(R.id.ccr);
        this.f9370i = liveTextView;
        liveTextView.setMovementMethod(LinkMovementMethod.getInstance());
        a(this.p, this.q);
        ImageView imageView2 = (ImageView) findViewById(R.id.cci);
        this.f9371j = imageView2;
        imageView2.setOnClickListener(new a(this));
        boolean z2 = this.A;
        this.A = z2;
        ImageView imageView3 = this.f9371j;
        if (imageView3 != null) {
            if (z2) {
                imageView3.setVisibility(0);
            } else {
                imageView3.setVisibility(8);
            }
        }
        ColorStateList colorStateList = this.B;
        this.B = colorStateList;
        ImageView imageView4 = this.f9371j;
        if (imageView4 != null) {
            androidx.core.widget.e.a(imageView4, colorStateList);
        }
        this.f9372k = (FrameLayout) findViewById(R.id.ccg);
        a(this.f9373l);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.cch);
        this.f9374m = frameLayout;
        d dVar = this.C;
        if (dVar != null) {
            this.E = null;
            this.C = dVar;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                if (this.C != null) {
                    if (this.D == null) {
                        this.D = new e(getContext());
                    }
                    this.D.a(this, Collections.unmodifiableList(this.C.f9401a));
                    this.D.setOrientation(this.C.f9402b);
                    this.f9374m.addView(this.D, -1, -2);
                } else {
                    e eVar = this.D;
                    if (eVar != null) {
                        eVar.a(this, Collections.emptyList());
                    }
                }
            }
        }
        com.bytedance.android.live.design.app.c.b bVar = this.E;
        if (bVar != null) {
            this.C = null;
            this.E = bVar;
            FrameLayout frameLayout2 = this.f9374m;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
                if (this.E != null) {
                    LinearLayout linearLayout = this.F;
                    if (linearLayout == null) {
                        LinearLayout linearLayout2 = new LinearLayout(getContext());
                        linearLayout2.setOrientation(1);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams2.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.na);
                        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.o0);
                        layoutParams2.rightMargin = dimensionPixelSize;
                        layoutParams2.leftMargin = dimensionPixelSize;
                        linearLayout2.setLayoutParams(layoutParams2);
                        this.F = linearLayout2;
                    } else {
                        linearLayout.removeAllViews();
                    }
                    c();
                    this.f9374m.addView(this.F);
                    MethodCollector.o(5018);
                    return;
                }
                this.F.removeAllViews();
            }
        }
        MethodCollector.o(5018);
    }

    private LiveDialog(Context context, a aVar) {
        super(context, aVar);
        this.r = aVar.f9378f;
        this.s = aVar.f9379g;
        this.t = aVar.f9380h;
        this.u = aVar.f9381i;
        this.v = aVar.f9382j;
        this.w = aVar.f9383k;
        this.y = aVar.f9385m;
        this.x = aVar.f9384l;
        this.z = aVar.n;
        this.o = aVar.f9375c;
        this.p = aVar.f9377e;
        this.q = aVar.f9376d;
        this.A = aVar.o;
        this.B = aVar.p;
        this.f9373l = aVar.w;
        setOnShowListener(aVar.s);
        setOnCancelListener(aVar.u);
        setOnDismissListener(aVar.t);
        setOnKeyListener(aVar.v);
        setCancelable(aVar.r);
        setCanceledOnTouchOutside(aVar.q);
        this.C = aVar.x;
        this.E = aVar.y;
    }

    private void a(CharSequence charSequence, View view) {
        FrameLayout frameLayout;
        MethodCollector.i(5124);
        if (this.f9368g == null || this.f9370i == null || (frameLayout = this.f9369h) == null) {
            MethodCollector.o(5124);
            return;
        }
        View view2 = this.q;
        if (view2 != null) {
            frameLayout.removeView(view2);
        }
        this.p = charSequence;
        this.q = view;
        if (!TextUtils.isEmpty(charSequence)) {
            this.f9370i.setText(this.p);
            if (TextUtils.isEmpty(this.o)) {
                this.f9370i.a(R.style.tl);
            } else {
                this.f9370i.a(R.style.to);
            }
            this.f9370i.setVisibility(0);
            this.f9368g.setVisibility(0);
            MethodCollector.o(5124);
            return;
        }
        View view3 = this.q;
        if (view3 != null) {
            this.f9369h.addView(view3, -1, -2);
            this.f9370i.setText("");
            this.f9370i.setVisibility(8);
            this.f9368g.setVisibility(0);
            MethodCollector.o(5124);
            return;
        }
        this.f9370i.setText("");
        this.f9370i.setVisibility(8);
        this.f9368g.setVisibility(8);
        MethodCollector.o(5124);
    }

    /* synthetic */ LiveDialog(Context context, a aVar, byte b2) {
        this(context, aVar);
    }
}
