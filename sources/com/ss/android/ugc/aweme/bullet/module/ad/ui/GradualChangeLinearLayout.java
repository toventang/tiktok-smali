package com.ss.android.ugc.aweme.bullet.module.ad.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.Space;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class GradualChangeLinearLayout extends LinearLayout implements SSWebView.b {

    /* renamed from: a  reason: collision with root package name */
    public Space f69378a;

    /* renamed from: b  reason: collision with root package name */
    public int f69379b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f69380c;

    /* renamed from: d  reason: collision with root package name */
    private int f69381d;

    /* renamed from: e  reason: collision with root package name */
    private int f69382e;

    /* renamed from: f  reason: collision with root package name */
    private int f69383f;

    /* renamed from: g  reason: collision with root package name */
    private BulletCommonTitleBar f69384g;

    static {
        Covode.recordClassIndex(42777);
    }

    public GradualChangeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final BulletCommonTitleBar getTitleBar() {
        return this.f69384g;
    }

    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GradualChangeLinearLayout f69385a;

        static {
            Covode.recordClassIndex(42778);
        }

        public final void onGlobalLayout() {
            GradualChangeLinearLayout gradualChangeLinearLayout = this.f69385a;
            gradualChangeLinearLayout.f69379b = GradualChangeLinearLayout.a(gradualChangeLinearLayout).getHeight();
            GradualChangeLinearLayout.a(this.f69385a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(GradualChangeLinearLayout gradualChangeLinearLayout) {
            this.f69385a = gradualChangeLinearLayout;
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.csm);
        l.b(findViewById, "");
        Space space = (Space) findViewById;
        this.f69378a = space;
        if (space == null) {
            l.a("space");
        }
        space.getViewTreeObserver().addOnGlobalLayoutListener(new a(this));
    }

    public final void setTitleBar(BulletCommonTitleBar bulletCommonTitleBar) {
        this.f69384g = bulletCommonTitleBar;
    }

    public static final /* synthetic */ Space a(GradualChangeLinearLayout gradualChangeLinearLayout) {
        Space space = gradualChangeLinearLayout.f69378a;
        if (space == null) {
            l.a("space");
        }
        return space;
    }

    public final void setGradualChangeMode(boolean z) {
        this.f69380c = z;
        Space space = this.f69378a;
        if (space == null) {
            l.a("space");
        }
        if (space.getHeight() != this.f69379b) {
            Space space2 = this.f69378a;
            if (space2 == null) {
                l.a("space");
            }
            ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
            layoutParams.height = this.f69379b;
            Space space3 = this.f69378a;
            if (space3 == null) {
                l.a("space");
            }
            space3.setLayoutParams(layoutParams);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (!this.f69380c) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getActionMasked())) == null)) {
            if (valueOf.intValue() == 0) {
                this.f69381d = (int) motionEvent.getY();
                this.f69382e = (int) motionEvent.getY();
            } else if (valueOf.intValue() == 2) {
                int y = (int) motionEvent.getY();
                int i2 = y - this.f69382e;
                Space space = this.f69378a;
                if (space == null) {
                    l.a("space");
                }
                int height = space.getHeight();
                this.f69382e = y;
                if (height > 0 && i2 < 0) {
                    Space space2 = this.f69378a;
                    if (space2 == null) {
                        l.a("space");
                    }
                    ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
                    layoutParams.height += i2;
                    if (layoutParams.height < 0) {
                        layoutParams.height = 0;
                    }
                    Space space3 = this.f69378a;
                    if (space3 == null) {
                        l.a("space");
                    }
                    space3.setLayoutParams(layoutParams);
                    BulletCommonTitleBar bulletCommonTitleBar = this.f69384g;
                    if (bulletCommonTitleBar != null) {
                        bulletCommonTitleBar.setBackgroundAlpha(((float) layoutParams.height) / ((float) this.f69379b));
                    }
                    return true;
                } else if (height < this.f69379b && this.f69383f == 0 && i2 > 0) {
                    Space space4 = this.f69378a;
                    if (space4 == null) {
                        l.a("space");
                    }
                    ViewGroup.LayoutParams layoutParams2 = space4.getLayoutParams();
                    layoutParams2.height += i2;
                    int i3 = layoutParams2.height;
                    int i4 = this.f69379b;
                    if (i3 > i4) {
                        layoutParams2.height = i4;
                    }
                    BulletCommonTitleBar bulletCommonTitleBar2 = this.f69384g;
                    if (bulletCommonTitleBar2 != null) {
                        bulletCommonTitleBar2.setBackgroundAlpha(((float) layoutParams2.height) / ((float) this.f69379b));
                    }
                    Space space5 = this.f69378a;
                    if (space5 == null) {
                        l.a("space");
                    }
                    space5.setLayoutParams(layoutParams2);
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private /* synthetic */ GradualChangeLinearLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private GradualChangeLinearLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(12626);
        MethodCollector.o(12626);
    }

    @Override // com.bytedance.ies.bullet.kit.web.SSWebView.b
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        this.f69383f = i3;
    }
}
