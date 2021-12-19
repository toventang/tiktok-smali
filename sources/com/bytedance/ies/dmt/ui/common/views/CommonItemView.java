package com.bytedance.ies.dmt.ui.common.views;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.h.a.d;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.ies.dmt.ui.common.views.b;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch;
import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.b.e;
import com.squareup.b.t;
import com.squareup.b.x;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public class CommonItemView extends RelativeLayout {
    private int A;
    private int B;
    private int C;
    private View D;

    /* renamed from: a  reason: collision with root package name */
    public TextView f33353a;

    /* renamed from: b  reason: collision with root package name */
    protected TextView f33354b;

    /* renamed from: c  reason: collision with root package name */
    public SimpleDraweeView f33355c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f33356d;

    /* renamed from: e  reason: collision with root package name */
    public a f33357e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f33358f;

    /* renamed from: g  reason: collision with root package name */
    public int f33359g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f33360h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f33361i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f33362j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f33363k;

    /* renamed from: l  reason: collision with root package name */
    private ViewGroup f33364l;

    /* renamed from: m  reason: collision with root package name */
    private ViewGroup f33365m;
    private DmtSettingSwitch n;
    private CharSequence o;
    private CharSequence p;
    private CharSequence q;
    private CharSequence r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private b x;
    private int y;
    private int z;

    static {
        Covode.recordClassIndex(19919);
    }

    public SimpleDraweeView getIvwLeft() {
        return this.f33355c;
    }

    public ImageView getIvwRight() {
        return this.f33356d;
    }

    public int getResLeft() {
        return this.y;
    }

    public int getResRight() {
        return this.z;
    }

    public DmtSettingSwitch getSwitchRight() {
        return this.n;
    }

    public CharSequence getTextDesc() {
        return this.q;
    }

    public CharSequence getTextLeft() {
        return this.o;
    }

    public CharSequence getTextRight() {
        return this.p;
    }

    public TextView getTvwDesc() {
        return this.f33363k;
    }

    public TextView getTvwLeft() {
        return this.f33353a;
    }

    public TextView getTvwRight() {
        return this.f33354b;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final boolean d() {
        DmtSettingSwitch dmtSettingSwitch = this.n;
        if (dmtSettingSwitch == null) {
            return false;
        }
        return dmtSettingSwitch.f33701b;
    }

    private boolean k() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) a(getContext(), "accessibility");
        if (accessibilityManager != null) {
            return accessibilityManager.isEnabled();
        }
        return false;
    }

    public enum a {
        CIRCULAR,
        DEFAULT;

        static {
            Covode.recordClassIndex(19922);
        }
    }

    /* access modifiers changed from: package-private */
    public enum b {
        NONE,
        IMAGE,
        ICON;

        static {
            Covode.recordClassIndex(19923);
        }
    }

    private void f() {
        if (this.w == 1) {
            i();
        } else {
            h();
        }
        if (this.y == 0) {
            this.f33355c.setVisibility(8);
        } else {
            this.f33355c.setVisibility(0);
            this.f33355c.setImageResource(this.y);
        }
        this.f33353a.setText(this.o);
        this.f33353a.setTextColor(this.A);
        g();
    }

    public final void c() {
        TextView textView;
        this.f33358f = false;
        a aVar = this.f33357e;
        if (aVar != null) {
            aVar.setVisibility(8);
            int i2 = this.f33359g;
            if ((i2 == 3 || i2 == 2) && (textView = this.f33354b) != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                marginLayoutParams.rightMargin = 0;
                int i3 = Build.VERSION.SDK_INT;
                marginLayoutParams.setMarginEnd(marginLayoutParams.rightMargin);
                this.f33360h = true;
            }
        }
    }

    private void e() {
        MethodCollector.i(10895);
        if (this.v) {
            View view = this.D;
            if (view != null) {
                view.setVisibility(0);
                MethodCollector.o(10895);
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) n.b(getContext(), 0.5f));
            layoutParams.topMargin = (int) n.b(getContext(), 16.0f);
            layoutParams.addRule(3, R.id.ch9);
            View view2 = new View(getContext());
            this.D = view2;
            view2.setBackgroundColor(androidx.core.content.b.c(view2.getContext(), R.color.b6));
            addView(this.D, layoutParams);
            MethodCollector.o(10895);
            return;
        }
        View view3 = this.D;
        if (view3 != null) {
            view3.setVisibility(4);
        }
        MethodCollector.o(10895);
    }

    private void j() {
        Context context;
        int i2;
        if (k()) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.o)) {
                sb.append(this.o);
            }
            if (!TextUtils.isEmpty(this.p)) {
                sb.append(this.p);
            }
            DmtSettingSwitch dmtSettingSwitch = this.n;
            if (dmtSettingSwitch != null && dmtSettingSwitch.getVisibility() == 0) {
                if (this.n.f33701b) {
                    context = getContext();
                    i2 = R.string.dm3;
                } else {
                    context = getContext();
                    i2 = R.string.dlu;
                }
                sb.append(context.getString(i2));
            }
            if (!TextUtils.isEmpty(this.q)) {
                sb.append(this.q);
            }
            String sb2 = sb.toString();
            this.r = sb2;
            setContentDescription(sb2);
        }
    }

    private void g() {
        if (this.q == null) {
            TextView textView = this.f33363k;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f33363k == null) {
            DmtTextView dmtTextView = new DmtTextView(getContext());
            this.f33363k = dmtTextView;
            dmtTextView.setId(R.id.f_z);
            this.f33363k.setLineSpacing(n.b(getContext(), 2.0f), 1.0f);
            this.f33363k.setTextSize(1, 13.0f);
            this.f33363k.setTextColor(this.C);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = (int) n.b(getContext(), 6.0f);
            layoutParams.addRule(3, R.id.ch9);
            addView(this.f33363k, layoutParams);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f33363k.setBreakStrategy(0);
            }
            View view = this.D;
            if (view != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                layoutParams2.addRule(3, this.f33363k.getId());
                this.D.setLayoutParams(layoutParams2);
            }
        }
        this.f33363k.setText(this.q);
        this.f33363k.setVisibility(0);
        this.f33362j = true;
    }

    private void h() {
        float f2;
        MethodCollector.i(11225);
        DmtSettingSwitch dmtSettingSwitch = this.n;
        if (dmtSettingSwitch != null) {
            dmtSettingSwitch.setVisibility(8);
        }
        if (this.p == null && this.x == b.NONE) {
            this.f33364l.setVisibility(8);
            MethodCollector.o(11225);
            return;
        }
        if (!this.u && this.f33356d == null) {
            AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
            this.f33356d = autoRTLImageView;
            autoRTLImageView.setId(R.id.c38);
            Context context = getContext();
            if (this.x == b.ICON) {
                f2 = 20.0f;
            } else {
                f2 = 32.0f;
            }
            int b2 = (int) n.b(context, f2);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b2, b2);
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.addRule(21);
            this.f33364l.addView(this.f33356d, layoutParams);
        }
        if (!this.u && this.f33356d != null) {
            if (this.x == b.NONE) {
                this.f33356d.setVisibility(8);
            } else {
                if (this.x == b.ICON) {
                    this.f33356d.setImageResource(this.z);
                }
                this.f33356d.setVisibility(0);
            }
        }
        if (this.p != null && this.f33354b == null) {
            DmtTextView dmtTextView = new DmtTextView(getContext());
            this.f33354b = dmtTextView;
            dmtTextView.setId(R.id.fa1);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(15);
            int i3 = Build.VERSION.SDK_INT;
            layoutParams2.addRule(16, R.id.c38);
            this.f33354b.setTextColor(this.B);
            this.f33354b.setEllipsize(TextUtils.TruncateAt.END);
            this.f33354b.setMaxLines(1);
            this.f33354b.setTextSize(1, 15.0f);
            this.f33364l.addView(this.f33354b, layoutParams2);
        }
        CharSequence charSequence = this.p;
        if (charSequence != null) {
            this.f33354b.setText(charSequence);
            this.f33354b.setVisibility(0);
        } else {
            TextView textView = this.f33354b;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        this.f33364l.setVisibility(0);
        MethodCollector.o(11225);
    }

    private void i() {
        MethodCollector.i(11229);
        ImageView imageView = this.f33356d;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView = this.f33354b;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (this.n == null) {
            DmtSettingSwitch dmtSettingSwitch = new DmtSettingSwitch(getContext());
            this.n = dmtSettingSwitch;
            dmtSettingSwitch.setId(R.id.egb);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) n.b(getContext(), 36.0f), -2);
            layoutParams.addRule(15);
            this.n.setTrackRadius((int) n.b(getContext(), 42.0f));
            this.n.setEnableTouch(false);
            this.n.setTrackPadding((int) n.b(getContext(), 3.0f));
            this.n.setThumbDrawable(getResources().getDrawable(R.drawable.cde));
            this.n.setTrackTintList(a(getContext()));
            this.f33364l.addView(this.n, layoutParams);
        }
        this.f33364l.setVisibility(0);
        this.n.setVisibility(0);
        MethodCollector.o(11229);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f33365m = (ViewGroup) findViewById(R.id.ch9);
        this.f33364l = (ViewGroup) findViewById(R.id.ch_);
        this.f33353a = (TextView) this.f33365m.findViewById(R.id.fa2);
        this.f33355c = (SimpleDraweeView) this.f33365m.findViewById(R.id.c36);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f33353a.setBreakStrategy(0);
        }
        e();
        f();
    }

    public final void b() {
        if (this.f33357e == null) {
            a aVar = new a(getContext());
            this.f33357e = aVar;
            addView(aVar, new RelativeLayout.LayoutParams(-2, -2));
        }
        int i2 = this.f33359g;
        if (i2 == 3 || i2 == 2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f33357e.getLayoutParams();
            int i3 = Build.VERSION.SDK_INT;
            layoutParams.addRule(21);
            layoutParams.addRule(10);
            int measuredHeight = this.f33364l.getMeasuredHeight();
            if (measuredHeight == 0) {
                measuredHeight = this.f33353a.getLineHeight();
            }
            if (this.f33359g == 3) {
                layoutParams.topMargin = (measuredHeight - this.f33357e.getMeasuredHeight()) / 2;
            } else {
                layoutParams.topMargin = 0;
            }
            if (this.w == 1) {
                layoutParams.rightMargin = (int) (((float) a(this.f33364l)) + n.b(getContext(), 8.0f));
                int i4 = Build.VERSION.SDK_INT;
                layoutParams.setMarginEnd(layoutParams.rightMargin);
            } else {
                ImageView imageView = this.f33356d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    layoutParams.rightMargin = 0;
                } else {
                    layoutParams.rightMargin = this.f33356d.getMeasuredWidth();
                }
                int i5 = Build.VERSION.SDK_INT;
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                TextView textView = this.f33354b;
                if (textView != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                    marginLayoutParams.rightMargin = (int) n.b(getContext(), 10.0f);
                    int i6 = Build.VERSION.SDK_INT;
                    marginLayoutParams.setMarginEnd(marginLayoutParams.rightMargin);
                    this.f33360h = true;
                }
            }
        } else if (!this.o.equals(this.f33353a.getText())) {
            this.f33357e.setVisibility(0);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.o);
            spannableStringBuilder.append((CharSequence) " ");
            b bVar = new b();
            bVar.f33378a = new b.a() {
                /* class com.bytedance.ies.dmt.ui.common.views.CommonItemView.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(19921);
                }

                @Override // com.bytedance.ies.dmt.ui.common.views.b.a
                public final void a(int i2, int i3) {
                    if (CommonItemView.this.f33358f) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) CommonItemView.this.f33357e.getLayoutParams();
                        int b2 = (int) n.b(CommonItemView.this.getContext(), 1.0f);
                        Layout layout = CommonItemView.this.f33353a.getLayout();
                        if (layout != null && layout.getLineCount() > 0) {
                            i2 = (int) layout.getLineWidth(layout.getLineCount() - 1);
                        }
                        if (CommonItemView.this.f33359g == 1) {
                            i3 += (CommonItemView.this.f33353a.getLineHeight() - CommonItemView.this.f33357e.getMeasuredHeight()) / 2;
                            i2 = (int) (((float) i2) + n.b(CommonItemView.this.getContext(), 4.0f));
                        }
                        if (CommonItemView.this.f33355c.getVisibility() == 0) {
                            int i4 = Build.VERSION.SDK_INT;
                            i2 = i2 + ((ViewGroup.MarginLayoutParams) CommonItemView.this.f33355c.getLayoutParams()).getMarginEnd() + CommonItemView.this.f33355c.getMeasuredWidth();
                        }
                        marginLayoutParams.leftMargin = i2 + b2;
                        int i5 = Build.VERSION.SDK_INT;
                        marginLayoutParams.setMarginStart(marginLayoutParams.leftMargin);
                        marginLayoutParams.topMargin = (int) (CommonItemView.this.f33353a.getY() + ((float) i3));
                        CommonItemView.this.f33357e.requestLayout();
                    }
                }
            };
            spannableStringBuilder.setSpan(bVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            this.f33353a.setText(spannableStringBuilder);
        }
        this.f33358f = true;
    }

    public void setLeftIcon(int i2) {
        b(this.o, i2);
    }

    public void setLeftText(CharSequence charSequence) {
        b(charSequence, this.y);
    }

    public void setOnCheckedChangeListener(DmtSettingSwitch.a aVar) {
        this.n.setOnCheckedChangeListener(aVar);
    }

    public void setRightIconRes(int i2) {
        a(this.p, i2);
    }

    public void setRightText(CharSequence charSequence) {
        a(charSequence, this.z);
    }

    public void setShowBottomDivider(boolean z2) {
        this.v = z2;
        e();
    }

    public void setDesc(CharSequence charSequence) {
        this.q = charSequence;
        g();
        j();
    }

    private static ColorStateList a(Context context) {
        int i2;
        Resources resources = context.getResources();
        if (com.bytedance.ies.dmt.ui.common.b.b(context)) {
            i2 = R.color.fi;
        } else {
            i2 = R.color.fh;
        }
        return resources.getColorStateList(i2);
    }

    public void setLeftIconImageUrl(String str) {
        this.f33355c.setVisibility(0);
        this.f33355c.setImageURI(str);
        this.f33360h = true;
        this.f33361i = true;
    }

    private static int a(ViewGroup viewGroup) {
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = i2 + childAt.getMeasuredWidth();
            int i4 = Build.VERSION.SDK_INT;
            i2 = measuredWidth + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
        }
        return i2;
    }

    public void setChecked(boolean z2) {
        DmtSettingSwitch dmtSettingSwitch = this.n;
        if (dmtSettingSwitch != null) {
            boolean z3 = dmtSettingSwitch.f33701b;
            this.n.setChecked(z2);
            j();
            if (z3 != z2 && k()) {
                if (Build.VERSION.SDK_INT < 21) {
                    AccessibilityNodeInfo createAccessibilityNodeInfo = createAccessibilityNodeInfo();
                    if (createAccessibilityNodeInfo != null && d.a(createAccessibilityNodeInfo).a()) {
                        this.n.announceForAccessibility(this.r);
                    }
                } else if (isAccessibilityFocused()) {
                    this.n.announceForAccessibility(this.r);
                }
            }
        }
    }

    public CommonItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int a(Context context, int i2) {
        return context.getResources().getColor(i2);
    }

    private void b(CharSequence charSequence, int i2) {
        this.y = i2;
        if (i2 != 0) {
            this.f33355c.setImageResource(i2);
            if (this.f33355c.getVisibility() != 0) {
                this.f33355c.setVisibility(0);
            }
        }
        this.o = charSequence;
        this.f33353a.setText(charSequence);
        if (this.f33358f) {
            b();
        }
        this.f33360h = true;
        this.f33361i = true;
        j();
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11386);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(11386);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public void a(Context context, AttributeSet attributeSet) {
        com.a.a(LayoutInflater.from(context), R.layout.bhz, this, true);
        b(context, attributeSet);
        a();
    }

    /* access modifiers changed from: protected */
    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.r9, R.attr.r_, R.attr.vm, R.attr.a1w, R.attr.a1x, R.attr.a1y, R.attr.a_6, R.attr.a_7, R.attr.a_8, R.attr.a_9, R.attr.ac_, R.attr.acj, R.attr.ast, R.attr.asu, R.attr.aug});
        this.o = obtainStyledAttributes.getString(4);
        this.p = obtainStyledAttributes.getString(7);
        int i2 = 0;
        this.q = obtainStyledAttributes.getString(0);
        this.y = obtainStyledAttributes.getResourceId(3, 0);
        this.z = obtainStyledAttributes.getResourceId(6, R.drawable.cc6);
        this.A = obtainStyledAttributes.getColor(5, a(getContext(), (int) R.color.bx));
        this.B = obtainStyledAttributes.getColor(8, a(getContext(), (int) R.color.c5));
        this.C = obtainStyledAttributes.getColor(1, a(getContext(), (int) R.color.c5));
        this.s = obtainStyledAttributes.getBoolean(13, true);
        this.t = obtainStyledAttributes.getBoolean(12, true);
        this.f33358f = obtainStyledAttributes.getBoolean(11, false);
        this.u = obtainStyledAttributes.getBoolean(2, false);
        this.v = obtainStyledAttributes.getBoolean(10, false);
        this.w = obtainStyledAttributes.getInt(9, 0);
        this.f33359g = obtainStyledAttributes.getInt(14, 0);
        obtainStyledAttributes.recycle();
        if (this.s) {
            int b2 = (int) n.b(context, 16.0f);
            if (!this.v) {
                i2 = b2;
            }
            setPadding(b2, b2, b2, i2);
        }
        if (this.t) {
            setBackground(c.c(context));
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        TextView textView;
        MethodCollector.i(11392);
        boolean z2 = this.f33360h;
        if (z2 || this.f33362j) {
            if (z2) {
                if (this.f33364l.getVisibility() == 8) {
                    this.f33365m.getLayoutParams().width = -1;
                } else {
                    int size = (View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight();
                    if (this.w == 1) {
                        this.f33364l.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i3);
                        this.f33365m.getLayoutParams().width = size - a(this.f33364l);
                    } else {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                        this.f33365m.measure(makeMeasureSpec, i3);
                        this.f33364l.measure(makeMeasureSpec, i3);
                        int measuredWidth = this.f33365m.getMeasuredWidth();
                        int a2 = a(this.f33364l);
                        if (measuredWidth + a2 <= size) {
                            this.f33365m.getLayoutParams().width = measuredWidth;
                            this.f33364l.getLayoutParams().width = size - measuredWidth;
                        } else {
                            double d2 = (double) size;
                            Double.isNaN(d2);
                            int i4 = (int) (0.204d * d2);
                            if (a2 <= i4) {
                                this.f33364l.getLayoutParams().width = i4;
                                this.f33365m.getLayoutParams().width = size - i4;
                            } else if (measuredWidth <= i4) {
                                this.f33364l.getLayoutParams().width = size - i4;
                                this.f33365m.getLayoutParams().width = i4;
                            } else {
                                Double.isNaN(d2);
                                int i5 = (int) (0.372d * d2);
                                if (measuredWidth <= i5) {
                                    this.f33365m.getLayoutParams().width = i5;
                                    this.f33364l.getLayoutParams().width = size - i5;
                                } else if (a2 <= i5) {
                                    this.f33365m.getLayoutParams().width = size - i5;
                                    this.f33364l.getLayoutParams().width = i5;
                                } else {
                                    Double.isNaN(d2);
                                    int i6 = (int) (d2 * 0.29d);
                                    this.f33365m.getLayoutParams().width = size - i6;
                                    this.f33364l.getLayoutParams().width = i6;
                                }
                            }
                        }
                    }
                }
                this.f33360h = false;
            }
            if (this.f33361i) {
                n.b(getContext(), 8.0f);
                if (this.x == b.IMAGE) {
                    this.f33365m.setPadding(0, (int) n.b(getContext(), 6.0f), 0, 0);
                } else {
                    this.f33365m.setPadding(0, 0, 0, 0);
                }
                this.f33361i = false;
            }
            if (!(!this.f33362j || (textView = this.f33363k) == null || textView.getVisibility() == 8)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f33363k.getLayoutParams();
                if (this.f33355c.getVisibility() != 0) {
                    marginLayoutParams.leftMargin = 0;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f33355c.getLayoutParams();
                    marginLayoutParams.leftMargin = marginLayoutParams2.rightMargin + marginLayoutParams2.width;
                }
                int i7 = Build.VERSION.SDK_INT;
                marginLayoutParams.setMarginStart(marginLayoutParams.leftMargin);
                this.f33362j = false;
            }
            if (this.f33358f) {
                b();
            }
        } else if (this.f33358f) {
            b();
        }
        super.onMeasure(i2, i3);
        MethodCollector.o(11392);
    }

    public final void a(CharSequence charSequence, int i2) {
        this.p = charSequence;
        this.z = i2;
        if (this.w != 1) {
            if (i2 == 0) {
                this.x = b.NONE;
            } else {
                this.x = b.ICON;
            }
            h();
            this.f33360h = true;
            j();
        }
    }

    public final void a(String str, final a aVar) {
        if (str != null && !str.isEmpty() && this.w != 1) {
            this.x = b.IMAGE;
            h();
            this.f33360h = true;
            this.f33361i = true;
            j();
            t a2 = t.a(getContext());
            if (str.trim().length() != 0) {
                new x(a2, Uri.parse(str)).a(this.f33356d, new e() {
                    /* class com.bytedance.ies.dmt.ui.common.views.CommonItemView.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(19920);
                    }

                    @Override // com.squareup.b.e
                    public final void a() {
                        if (aVar == a.CIRCULAR) {
                            Bitmap bitmap = ((BitmapDrawable) CommonItemView.this.f33356d.getDrawable()).getBitmap();
                            androidx.core.graphics.drawable.b a2 = androidx.core.graphics.drawable.d.a(CommonItemView.this.getResources(), bitmap);
                            a2.f2436h = true;
                            a2.f2435g = true;
                            a2.b();
                            a2.f2431c.setShader(a2.f2432d);
                            a2.invalidateSelf();
                            a2.a(((float) Math.max(bitmap.getWidth(), bitmap.getHeight())) / 2.0f);
                            CommonItemView.this.f33356d.setImageDrawable(a2);
                        }
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Path must not be empty.");
        }
    }

    public CommonItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        MethodCollector.i(10893);
        this.f33360h = true;
        this.f33361i = true;
        this.f33362j = true;
        this.s = true;
        this.t = true;
        this.w = -1;
        this.x = b.NONE;
        a(context, attributeSet);
        MethodCollector.o(10893);
    }
}
