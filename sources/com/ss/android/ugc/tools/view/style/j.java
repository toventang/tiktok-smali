package com.ss.android.ugc.tools.view.style;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.c.d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class j extends LinearLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final a f150203c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDraweeView f150204a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f150205b;

    /* renamed from: d  reason: collision with root package name */
    private final h f150206d;

    /* renamed from: e  reason: collision with root package name */
    private int f150207e;

    /* renamed from: f  reason: collision with root package name */
    private int f150208f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f150209g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f150210h;

    static {
        Covode.recordClassIndex(98844);
    }

    private final View getDotView() {
        return (View) this.f150206d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(98845);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getSelectColor() {
        return this.f150207e;
    }

    public final TextView getTextView() {
        return this.f150205b;
    }

    public final int getUnSelectColor() {
        return this.f150208f;
    }

    private final int getIconHeight() {
        Context context = getContext();
        l.b(context, "");
        return (int) r.a(context, 24.0f);
    }

    static final class b extends m implements h.f.a.a<View> {
        final /* synthetic */ Context $context;
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(98846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, Context context) {
            super(0);
            this.this$0 = jVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            View a2 = com.a.a(LayoutInflater.from(this.$context), R.layout.b4v, this.this$0, false);
            this.this$0.addView(a2);
            l.b(a2, "");
            a2.setBackground(j.a(this.$context.getResources().getColor(R.color.t8)));
            return a2;
        }
    }

    private final void a() {
        int i2;
        if (this.f150209g) {
            i2 = this.f150207e;
        } else {
            i2 = this.f150208f;
        }
        this.f150205b.setTextColor(i2);
        this.f150204a.setImageAlpha(Color.alpha(i2));
    }

    private final void b() {
        if (!this.f150210h) {
            g.a(this.f150205b);
        } else if (this.f150209g) {
            g.a(this.f150205b);
            this.f150205b.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            this.f150205b.setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    public static final class c extends com.facebook.drawee.c.c<f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f150211a;

        static {
            Covode.recordClassIndex(98847);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(j jVar) {
            this.f150211a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
            this.f150211a.a(fVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
            this.f150211a.a(fVar);
        }
    }

    public final void a(boolean z) {
        int i2;
        View dotView = getDotView();
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        dotView.setVisibility(i2);
    }

    public final void b(int i2) {
        this.f150205b.setTextColor(i2);
        this.f150204a.setImageAlpha(Color.alpha(i2));
    }

    public final void setDotColor(int i2) {
        getDotView().setBackground(a(i2));
    }

    public final void setImage(int i2) {
        setImageVisibility(true);
        this.f150204a.setImageResource(i2);
    }

    public final void setImageVisibility(boolean z) {
        int i2;
        SimpleDraweeView simpleDraweeView = this.f150204a;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        simpleDraweeView.setVisibility(i2);
    }

    public final void setOnlyBoldOnSelection(boolean z) {
        if (z != this.f150210h) {
            this.f150210h = z;
            b();
        }
    }

    public final void setSelectColor(int i2) {
        if (this.f150207e != i2) {
            this.f150207e = i2;
            if (this.f150209g) {
                a();
            }
        }
    }

    public final void setSelected(boolean z) {
        super.setSelected(z);
        this.f150209g = z;
        a();
        b();
    }

    public final void setTextVisibility(boolean z) {
        int i2;
        TextView textView = this.f150205b;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public final void setUnSelectColor(int i2) {
        if (this.f150208f != i2) {
            this.f150208f = i2;
            if (!this.f150209g) {
                a();
            }
        }
    }

    public static GradientDrawable a(int i2) {
        return b.a.a().a(1).b(i2).a(i2, 0).a();
    }

    public final void setImage(Drawable drawable) {
        setImageVisibility(true);
        this.f150204a.setImageDrawable(drawable);
    }

    public final void setText(int i2) {
        Context context = getContext();
        l.b(context, "");
        String string = context.getResources().getString(i2);
        l.b(string, "");
        setText(string);
    }

    public final void setImage(UrlModel urlModel) {
        l.d(urlModel, "");
        setImageVisibility(true);
        com.ss.android.ugc.tools.c.a.a(this.f150204a, urlModel, Bitmap.Config.ARGB_8888, true, (d<f>) new c(this));
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            setTextVisibility(true);
            this.f150205b.setText(str);
            return;
        }
        setTextVisibility(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private j(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(7326);
        this.f150206d = i.a((h.f.a.a) new b(this, context));
        this.f150207e = context.getResources().getColor(R.color.ub);
        this.f150208f = context.getResources().getColor(R.color.uc);
        this.f150210h = true;
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.b4w, this, true);
        View findViewById = a2.findViewById(R.id.eha);
        l.b(findViewById, "");
        this.f150204a = (SimpleDraweeView) findViewById;
        View findViewById2 = a2.findViewById(R.id.ehc);
        l.b(findViewById2, "");
        TextView textView = (TextView) findViewById2;
        this.f150205b = textView;
        textView.setTextSize(15.0f);
        a();
        b();
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        com.ss.android.ugc.tools.a.c.a(textView);
        MethodCollector.o(7326);
    }

    public final void a(f fVar) {
        if (fVar != null && (this.f150204a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = this.f150204a.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int iconHeight = getIconHeight();
            float height = ((float) iconHeight) / ((float) fVar.getHeight());
            marginLayoutParams.height = iconHeight;
            marginLayoutParams.width = (int) (((float) fVar.getWidth()) * height);
            this.f150204a.setAspectRatio(((float) fVar.getWidth()) / ((float) fVar.getHeight()));
            this.f150204a.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setImage(String str) {
        l.d(str, "");
        setImageVisibility(true);
        com.ss.android.ugc.tools.c.a.a(this.f150204a, str);
    }

    public /* synthetic */ j(Context context, byte b2) {
        this(context);
    }
}
