package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgBubble;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileTabGuide;
import com.ss.android.ugc.aweme.money.growth.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class bb extends PopupWindow {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f94317i;

    /* renamed from: j  reason: collision with root package name */
    public static String f94318j = "";

    /* renamed from: k  reason: collision with root package name */
    public static int f94319k = 5000;

    /* renamed from: l  reason: collision with root package name */
    public static final long f94320l = 300;

    /* renamed from: m  reason: collision with root package name */
    public static final a f94321m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final View f94322a;

    /* renamed from: b  reason: collision with root package name */
    public final String f94323b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f94324c = new c(this);

    /* renamed from: d  reason: collision with root package name */
    public int f94325d;

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f94326e;

    /* renamed from: f  reason: collision with root package name */
    public final int f94327f;

    /* renamed from: g  reason: collision with root package name */
    public int f94328g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f94329h;
    private int n;
    private final TextView o;
    private final ImageView p;
    private final ImageView q;

    public static final class a {
        static {
            Covode.recordClassIndex(59922);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static boolean b(UgAwemeActivitySetting ugAwemeActivitySetting) {
            try {
                Boolean isNewUser = ugAwemeActivitySetting.getIsNewUser();
                if (isNewUser == null) {
                    l.b();
                }
                if (isNewUser.booleanValue()) {
                    return true;
                }
                return false;
            } catch (com.bytedance.ies.a e2) {
                e2.printStackTrace();
                return false;
            }
        }

        private static boolean c(UgAwemeActivitySetting ugAwemeActivitySetting) {
            try {
                UgProfileTabGuide profileTabGuide = ugAwemeActivitySetting.getProfileTabGuide();
                l.b(profileTabGuide, "");
                UgBubble bubble = profileTabGuide.getBubble();
                l.b(bubble, "");
                bb.f94318j = bubble.getText();
                UgBubble bubble2 = profileTabGuide.getBubble();
                l.b(bubble2, "");
                bb.f94319k = bubble2.getSeconds().intValue() * 1000;
                if (!TextUtils.isEmpty(bb.f94318j)) {
                    return true;
                }
                return false;
            } catch (com.bytedance.ies.a e2) {
                e2.printStackTrace();
                return false;
            }
        }

        public static boolean a(UgAwemeActivitySetting ugAwemeActivitySetting) {
            boolean z;
            if (ugAwemeActivitySetting == null || e.f110853g.f110856b.f110849b || !c(ugAwemeActivitySetting)) {
                return false;
            }
            try {
                if (!ugAwemeActivitySetting.getOverallSwitch().booleanValue()) {
                    return false;
                }
                if (b(ugAwemeActivitySetting)) {
                    s.a();
                    if (bb.f94317i) {
                        bb.f94317i = false;
                        z = true;
                    } else {
                        z = false;
                    }
                    Boolean a2 = s.a();
                    l.b(a2, "");
                    if (!a2.booleanValue() || z) {
                        return true;
                    }
                    return false;
                }
                return true;
            } catch (com.bytedance.ies.a e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bb f94331a;

        static {
            Covode.recordClassIndex(59924);
        }

        c(bb bbVar) {
            this.f94331a = bbVar;
        }

        public final void run() {
            this.f94331a.dismiss();
        }
    }

    static {
        Covode.recordClassIndex(59921);
    }

    public final void a() {
        Context context = this.f94329h;
        if (context != null && (context instanceof Activity) && !((Activity) context).isFinishing()) {
            super.dismiss();
        }
    }

    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bb f94332a;

        static {
            Covode.recordClassIndex(59925);
        }

        public d(bb bbVar) {
            this.f94332a = bbVar;
        }

        public final void run() {
            bb bbVar = this.f94332a;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(bbVar.f94326e, "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(bbVar.f94326e, "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(bbVar.f94326e, "alpha", 0.0f, 1.0f));
            animatorSet.setDuration(bb.f94320l);
            animatorSet.start();
        }
    }

    public final void dismiss() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f94326e, "scaleX", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f94326e, "scaleY", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f94326e, "alpha", 1.0f, 0.0f));
        animatorSet.setDuration(f94320l);
        animatorSet.addListener(new b(this));
        animatorSet.start();
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bb f94330a;

        static {
            Covode.recordClassIndex(59923);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(bb bbVar) {
            this.f94330a = bbVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f94330a.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bb(Context context, View view, String str) {
        super(context);
        l.d(context, "");
        l.d(view, "");
        l.d(str, "");
        MethodCollector.i(6582);
        this.f94329h = context;
        this.f94322a = view;
        this.f94323b = str;
        this.f94327f = (int) n.b(context, -8.0f);
        View inflate = LayoutInflater.from(context).inflate(R.layout.ml, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.exf);
        l.b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.o = textView;
        textView.setText(str);
        textView.setTextColor(context.getResources().getColor(R.color.f159928l));
        View findViewById2 = inflate.findViewById(R.id.b69);
        l.b(findViewById2, "");
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        this.f94326e = frameLayout;
        View findViewById3 = inflate.findViewById(R.id.bu8);
        l.b(findViewById3, "");
        ImageView imageView = (ImageView) findViewById3;
        this.p = imageView;
        View findViewById4 = inflate.findViewById(R.id.bu9);
        l.b(findViewById4, "");
        ImageView imageView2 = (ImageView) findViewById4;
        this.q = imageView2;
        Drawable a2 = androidx.core.content.b.a(context, (int) R.drawable.w2);
        if (a2 != null) {
            Drawable.ConstantState constantState = a2.getConstantState();
            if (constantState != null) {
                a2 = constantState.newDrawable();
                l.b(a2, "");
            }
            Drawable mutate = androidx.core.graphics.drawable.a.e(a2).mutate();
            l.b(mutate, "");
            androidx.core.graphics.drawable.a.a(mutate, context.getResources().getColor(R.color.bm));
            imageView.setImageDrawable(mutate);
        }
        Drawable a3 = androidx.core.content.b.a(context, (int) R.drawable.w3);
        if (a3 != null) {
            Drawable.ConstantState constantState2 = a3.getConstantState();
            if (constantState2 != null) {
                a3 = constantState2.newDrawable();
                l.b(a3, "");
            }
            Drawable mutate2 = androidx.core.graphics.drawable.a.e(a3).mutate();
            l.b(mutate2, "");
            androidx.core.graphics.drawable.a.a(mutate2, context.getResources().getColor(R.color.bm));
            imageView2.setImageDrawable(mutate2);
        }
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        l.b(inflate, "");
        this.f94325d = inflate.getMeasuredHeight();
        this.n = inflate.getMeasuredWidth();
        float b2 = n.b(context, 10.0f);
        View contentView = getContentView();
        l.b(contentView, "");
        int measuredWidth = contentView.getMeasuredWidth();
        View contentView2 = getContentView();
        l.b(contentView2, "");
        int measuredHeight = contentView2.getMeasuredHeight();
        ImageView imageView3 = (ImageView) getContentView().findViewById(R.id.bu8);
        ImageView imageView4 = (ImageView) getContentView().findViewById(R.id.bu9);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int a4 = n.a(context);
        int width = iArr[0] + (view.getWidth() / 2);
        this.f94328g = 0;
        int i2 = measuredWidth / 2;
        float f2 = (float) width;
        if (((float) i2) + b2 > f2) {
            this.f94328g = (int) (b2 - ((float) iArr[0]));
            l.b(imageView3, "");
            imageView3.getLayoutParams().width = (int) (f2 - b2);
            l.b(imageView4, "");
            imageView4.getLayoutParams().width = measuredWidth - imageView3.getLayoutParams().width;
        } else {
            float f3 = ((float) a4) - b2;
            if (((float) (width + i2)) > f3) {
                this.f94328g = (int) (f3 - ((float) (iArr[0] + measuredWidth)));
                l.b(imageView4, "");
                imageView4.getLayoutParams().width = (int) (f3 - f2);
                l.b(imageView3, "");
                imageView3.getLayoutParams().width = measuredWidth - imageView4.getLayoutParams().width;
            } else {
                this.f94328g = (view.getWidth() - measuredWidth) / 2;
                l.b(imageView3, "");
                imageView3.getLayoutParams().width = i2;
                l.b(imageView4, "");
                imageView4.getLayoutParams().width = i2;
            }
        }
        imageView3.getLayoutParams().height = measuredHeight;
        imageView4.getLayoutParams().height = measuredHeight;
        getContentView().measure(0, 0);
        View contentView3 = getContentView();
        l.b(contentView3, "");
        this.f94325d = contentView3.getMeasuredHeight();
        View contentView4 = getContentView();
        l.b(contentView4, "");
        this.n = contentView4.getMeasuredWidth();
        frameLayout.setPivotX((float) imageView3.getMeasuredWidth());
        frameLayout.setPivotY((float) measuredHeight);
        frameLayout.getPivotX();
        frameLayout.getPivotY();
        MethodCollector.o(6582);
    }
}
