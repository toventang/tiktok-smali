package com.ss.android.ugc.aweme.im.sdk.common.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.tux.h.f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.R;

public class ImTextTitleBar extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public AvatarImageView f102530a;

    /* renamed from: b  reason: collision with root package name */
    public a f102531b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f102532c;

    /* renamed from: d  reason: collision with root package name */
    private String f102533d;

    /* renamed from: e  reason: collision with root package name */
    private String f102534e;

    /* renamed from: f  reason: collision with root package name */
    private String f102535f;

    /* renamed from: g  reason: collision with root package name */
    private int f102536g;

    /* renamed from: h  reason: collision with root package name */
    private int f102537h;

    /* renamed from: i  reason: collision with root package name */
    private int f102538i;

    /* renamed from: j  reason: collision with root package name */
    private int f102539j;

    /* renamed from: k  reason: collision with root package name */
    private TuxTextView f102540k;

    /* renamed from: l  reason: collision with root package name */
    private TuxTextView f102541l;

    /* renamed from: m  reason: collision with root package name */
    private AutoRTLImageView f102542m;
    private View n;
    private TuxTextView o;
    private boolean p;
    private RelativeLayout q;
    private TuxTextView r;
    private TuxTextView s;
    private ImageView t;
    private ViewGroup u;
    private ViewGroup v;
    private View.OnClickListener w;

    public interface a {
        static {
            Covode.recordClassIndex(65672);
        }

        void a();

        void a(int i2);

        void b();

        void c();
    }

    static {
        Covode.recordClassIndex(65666);
    }

    public TextView getRightTexView() {
        return this.f102541l;
    }

    public View getRightView() {
        return this.v;
    }

    private void a() {
        int i2;
        int i3;
        int a2 = n.a(getContext());
        if (this.u.getVisibility() == 8 && this.v.getVisibility() == 8) {
            i2 = (int) n.b(getContext(), 32.0f);
        } else {
            i2 = 0;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            if (this.u.getVisibility() != 8) {
                this.u.measure(makeMeasureSpec, makeMeasureSpec2);
                i3 = this.u.getMeasuredWidth();
            } else {
                i3 = 0;
            }
            if (this.v.getVisibility() != 8) {
                this.v.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = this.v.getMeasuredWidth();
            }
            if (this.p) {
                a2 -= i3;
            } else {
                i2 = Math.max(i3, i2) * 2;
            }
        }
        ViewGroup.LayoutParams layoutParams = this.n.getLayoutParams();
        layoutParams.width = a2 - i2;
        this.n.setLayoutParams(layoutParams);
    }

    public void setOnTitlebarClickListener(a aVar) {
        this.f102531b = aVar;
    }

    public void setRightDotVisibility(int i2) {
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.setVisibility(i2);
        }
    }

    public void setRightTextVisibility(int i2) {
        TuxTextView tuxTextView = this.f102541l;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(i2);
        }
    }

    public void setRightTuxFont(int i2) {
        TuxTextView tuxTextView = this.f102541l;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(i2);
        }
    }

    public void setTitleTextColor(int i2) {
        this.f102539j = i2;
        this.o.setTextColor(i2);
    }

    public void setHint(String str) {
        a.C0730a aVar = new a.C0730a();
        aVar.a(str);
        this.s.setText(aVar.f33382a);
    }

    public void setLeftIcon(int i2) {
        setLeftIcon(getContext().getResources().getDrawable(i2));
    }

    public void setLeftText(int i2) {
        setLeftText(getResources().getString(i2));
    }

    public void setLeftTextColor(int i2) {
        this.f102537h = i2;
        TuxTextView tuxTextView = this.f102540k;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(i2);
        }
    }

    public void setRightIcon(int i2) {
        setRightIcons(i2);
    }

    public void setRightText(int i2) {
        setRightText(getResources().getString(i2));
    }

    public void setRightTextColor(int i2) {
        this.f102538i = i2;
        TuxTextView tuxTextView = this.f102541l;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(i2);
        }
    }

    public void setTitle(int i2) {
        setTitle(getResources().getString(i2));
    }

    public void setRightIcon(com.bytedance.tux.c.a aVar) {
        setRightIcons(aVar);
    }

    public void setTitle(CharSequence charSequence) {
        String charSequence2;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        this.f102535f = charSequence2;
        this.o.setText(charSequence);
    }

    public void setRightIcons(int... iArr) {
        int length = iArr.length;
        com.bytedance.tux.c.a[] aVarArr = new com.bytedance.tux.c.a[length];
        for (int i2 = 0; i2 < length; i2++) {
            com.bytedance.tux.c.a aVar = new com.bytedance.tux.c.a();
            aVar.f44749a = iArr[i2];
            aVar.f44753e = Integer.valueOf((int) R.attr.bc);
            aVarArr[i2] = aVar;
        }
        setRightIcons(aVarArr);
    }

    public void setTitle(String str) {
        this.f102535f = str;
        if (this.p) {
            a.C0730a aVar = new a.C0730a();
            aVar.a(str);
            this.r.setText(aVar.f33382a);
        } else {
            this.o.setText(str);
        }
        this.o.requestLayout();
    }

    public void setLeftIcon(Drawable drawable) {
        MethodCollector.i(7676);
        if (this.f102542m == null) {
            this.f102542m = new AutoRTLImageView(getContext());
        }
        this.f102542m.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f102542m.setImageDrawable(drawable);
        this.u.removeAllViews();
        this.u.addView(this.f102542m);
        this.u.setVisibility(0);
        this.u.setContentDescription(getContext().getResources().getString(R.string.a2g));
        a();
        MethodCollector.o(7676);
    }

    public void setLeftText(String str) {
        MethodCollector.i(7661);
        this.f102533d = str;
        if (this.f102540k == null) {
            this.f102540k = new TuxTextView(getContext());
        }
        this.f102540k.setTuxFont(41);
        this.f102540k.setTextColor(this.f102537h);
        this.f102540k.setText(this.f102533d);
        this.u.removeAllViews();
        this.u.addView(this.f102540k);
        this.u.setVisibility(0);
        this.u.setContentDescription(this.f102533d);
        a();
        MethodCollector.o(7661);
    }

    public void setLeftTitleVisible(boolean z) {
        this.p = true;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.n.getLayoutParams();
        if (z) {
            this.o.setVisibility(8);
            this.q.setVisibility(0);
            layoutParams.addRule(17, R.id.c9s);
            layoutParams.addRule(1, R.id.c9s);
            layoutParams.addRule(13, 0);
            layoutParams.addRule(15);
        } else {
            this.o.setVisibility(0);
            this.q.setVisibility(8);
            layoutParams.addRule(17, 0);
            layoutParams.addRule(1, 0);
            layoutParams.addRule(13);
        }
        this.n.setLayoutParams(layoutParams);
    }

    public void setRightText(String str) {
        MethodCollector.i(7864);
        this.f102534e = str;
        if (this.f102541l == null) {
            this.f102541l = new TuxTextView(getContext());
        }
        this.f102541l.setTuxFont(41);
        this.f102541l.setTextColor(this.f102538i);
        this.f102541l.setText(this.f102534e);
        this.v.removeAllViews();
        this.v.addView(this.f102541l);
        this.v.setOnClickListener(this.w);
        this.v.setVisibility(0);
        this.v.setContentDescription(this.f102534e);
        a();
        MethodCollector.o(7864);
    }

    public void setRightIcons(com.bytedance.tux.c.a... aVarArr) {
        MethodCollector.i(7965);
        int length = aVarArr.length;
        TuxIconView[] tuxIconViewArr = new TuxIconView[length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            com.bytedance.tux.c.a aVar = aVarArr[i2];
            aVar.f44751c = f.b(24);
            aVar.f44750b = f.b(24);
            TuxIconView tuxIconView = new TuxIconView(getContext());
            tuxIconView.setTuxIcon(aVar);
            tuxIconView.setId(aVar.f44749a);
            if (i2 != aVarArr.length - 1) {
                tuxIconView.setPadding(0, 0, (int) n.b(getContext(), 16.0f), 0);
            }
            tuxIconViewArr[i2] = tuxIconView;
        }
        this.v.removeAllViews();
        this.v.setOnClickListener(null);
        for (int i3 = 0; i3 < length; i3++) {
            TuxIconView tuxIconView2 = tuxIconViewArr[i3];
            tuxIconView2.setOnClickListener(this.w);
            this.v.addView(tuxIconView2);
        }
        this.v.setVisibility(0);
        this.v.setContentDescription(getResources().getString(R.string.cg2));
        a();
        MethodCollector.o(7965);
    }

    public ImTextTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ImTextTitleBar(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(7626);
        this.f102532c = true;
        this.w = new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.AnonymousClass1 */

            static {
                Covode.recordClassIndex(65667);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (ImTextTitleBar.this.f102531b != null) {
                    ImTextTitleBar.this.f102531b.a(view.getId());
                }
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.w9, R.attr.w_, R.attr.wa, R.attr.wb, R.attr.wc, R.attr.wd, R.attr.we, R.attr.wf, R.attr.wg, R.attr.wh, R.attr.wi, R.attr.wj, R.attr.wk});
        this.f102532c = obtainStyledAttributes.getBoolean(12, true);
        this.f102533d = obtainStyledAttributes.getString(2);
        this.f102534e = obtainStyledAttributes.getString(7);
        this.f102535f = obtainStyledAttributes.getString(9);
        this.f102537h = obtainStyledAttributes.getColor(1, b.c(context, R.color.bx));
        if (TextUtils.isEmpty(this.f102534e)) {
            this.f102536g = obtainStyledAttributes.getResourceId(5, -1);
        }
        this.f102538i = obtainStyledAttributes.getColor(4, b.c(context, R.color.bx));
        this.f102539j = obtainStyledAttributes.getColor(10, b.c(context, R.color.bx));
        obtainStyledAttributes.recycle();
        inflate(context, R.layout.a76, this);
        this.u = (ViewGroup) findViewById(R.id.c9s);
        this.v = (ViewGroup) findViewById(R.id.dnc);
        this.n = findViewById(R.id.emo);
        this.o = (TuxTextView) findViewById(R.id.title_tv);
        this.t = (ImageView) findViewById(R.id.dnq);
        this.q = (RelativeLayout) findViewById(R.id.c_2);
        this.f102530a = (AvatarImageView) findViewById(R.id.bu0);
        this.r = (TuxTextView) findViewById(R.id.b3v);
        this.s = (TuxTextView) findViewById(R.id.dw9);
        if (!TextUtils.isEmpty(this.f102533d)) {
            setLeftText(this.f102533d);
            setLeftTextColor(this.f102537h);
        } else if (this.f102532c) {
            setLeftIcon(getResources().getDrawable(R.drawable.ccg));
        }
        if (!TextUtils.isEmpty(this.f102534e)) {
            setRightText(this.f102534e);
            setRightTextColor(this.f102538i);
        } else {
            int i2 = this.f102536g;
            if (i2 != -1) {
                setRightIcon(i2);
            }
        }
        if (!TextUtils.isEmpty(this.f102535f)) {
            setTitle(this.f102535f);
            setTitleTextColor(this.f102539j);
        }
        this.u.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.AnonymousClass2 */

            static {
                Covode.recordClassIndex(65668);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (ImTextTitleBar.this.f102531b != null) {
                    ImTextTitleBar.this.f102531b.a();
                }
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.AnonymousClass3 */

            static {
                Covode.recordClassIndex(65669);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (ImTextTitleBar.this.f102531b != null) {
                    ImTextTitleBar.this.f102531b.c();
                }
            }
        });
        this.r.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.AnonymousClass4 */

            static {
                Covode.recordClassIndex(65670);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (ImTextTitleBar.this.f102531b != null) {
                    ImTextTitleBar.this.f102531b.c();
                }
            }
        });
        this.f102530a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.AnonymousClass5 */

            static {
                Covode.recordClassIndex(65671);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (ImTextTitleBar.this.f102531b != null) {
                    ImTextTitleBar.this.f102531b.b();
                }
            }
        });
        this.v.setOnClickListener(this.w);
        ae.a(this.u);
        ae.a(this.v);
        MethodCollector.o(7626);
    }
}
