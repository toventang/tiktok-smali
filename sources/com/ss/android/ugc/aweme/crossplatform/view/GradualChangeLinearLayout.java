package com.ss.android.ugc.aweme.crossplatform.view;

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
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class GradualChangeLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public Space f78960a;

    /* renamed from: b  reason: collision with root package name */
    public int f78961b;

    /* renamed from: c  reason: collision with root package name */
    public int f78962c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f78963d;

    /* renamed from: e  reason: collision with root package name */
    private SingleWebView f78964e;

    /* renamed from: f  reason: collision with root package name */
    private CrossPlatformTitleBar f78965f;

    /* renamed from: g  reason: collision with root package name */
    private int f78966g;

    /* renamed from: h  reason: collision with root package name */
    private int f78967h;

    static {
        Covode.recordClassIndex(48999);
    }

    public GradualChangeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final CrossPlatformTitleBar getTitleBar() {
        return this.f78965f;
    }

    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GradualChangeLinearLayout f78968a;

        static {
            Covode.recordClassIndex(49000);
        }

        public final void onGlobalLayout() {
            GradualChangeLinearLayout gradualChangeLinearLayout = this.f78968a;
            gradualChangeLinearLayout.f78961b = GradualChangeLinearLayout.a(gradualChangeLinearLayout).getHeight();
            GradualChangeLinearLayout.a(this.f78968a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(GradualChangeLinearLayout gradualChangeLinearLayout) {
            this.f78968a = gradualChangeLinearLayout;
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.csm);
        l.b(findViewById, "");
        Space space = (Space) findViewById;
        this.f78960a = space;
        if (space == null) {
            l.a("space");
        }
        space.getViewTreeObserver().addOnGlobalLayoutListener(new a(this));
        View findViewById2 = findViewById(R.id.ah_);
        l.b(findViewById2, "");
        SingleWebView a2 = ((j) ((CrossPlatformWebView) findViewById2).a(j.class)).a();
        l.b(a2, "");
        this.f78964e = a2;
        if (a2 == null) {
            l.a("webView");
        }
        a2.setWebScrollListener(new b(this));
    }

    public final void setTitleBar(CrossPlatformTitleBar crossPlatformTitleBar) {
        this.f78965f = crossPlatformTitleBar;
    }

    public static final class b implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GradualChangeLinearLayout f78969a;

        static {
            Covode.recordClassIndex(49001);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(GradualChangeLinearLayout gradualChangeLinearLayout) {
            this.f78969a = gradualChangeLinearLayout;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.view.b
        public final void a(int i2, int i3) {
            this.f78969a.f78962c = i2;
        }
    }

    public static final /* synthetic */ Space a(GradualChangeLinearLayout gradualChangeLinearLayout) {
        Space space = gradualChangeLinearLayout.f78960a;
        if (space == null) {
            l.a("space");
        }
        return space;
    }

    public final void setGradualChangeMode(boolean z) {
        this.f78963d = z;
        Space space = this.f78960a;
        if (space == null) {
            l.a("space");
        }
        if (space.getHeight() != this.f78961b) {
            Space space2 = this.f78960a;
            if (space2 == null) {
                l.a("space");
            }
            ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
            layoutParams.height = this.f78961b;
            Space space3 = this.f78960a;
            if (space3 == null) {
                l.a("space");
            }
            space3.setLayoutParams(layoutParams);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (!this.f78963d) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getActionMasked())) == null)) {
            if (valueOf.intValue() == 0) {
                this.f78966g = (int) motionEvent.getY();
                this.f78967h = (int) motionEvent.getY();
            } else if (valueOf.intValue() == 2) {
                int y = (int) motionEvent.getY();
                int i2 = y - this.f78967h;
                Space space = this.f78960a;
                if (space == null) {
                    l.a("space");
                }
                int height = space.getHeight();
                this.f78967h = y;
                if (height > 0 && i2 < 0) {
                    Space space2 = this.f78960a;
                    if (space2 == null) {
                        l.a("space");
                    }
                    ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
                    layoutParams.height += i2;
                    if (layoutParams.height < 0) {
                        layoutParams.height = 0;
                    }
                    Space space3 = this.f78960a;
                    if (space3 == null) {
                        l.a("space");
                    }
                    space3.setLayoutParams(layoutParams);
                    CrossPlatformTitleBar crossPlatformTitleBar = this.f78965f;
                    if (crossPlatformTitleBar != null) {
                        crossPlatformTitleBar.setBackgroundAlpha(((float) layoutParams.height) / ((float) this.f78961b));
                    }
                    return true;
                } else if (height < this.f78961b && this.f78962c == 0 && i2 > 0) {
                    Space space4 = this.f78960a;
                    if (space4 == null) {
                        l.a("space");
                    }
                    ViewGroup.LayoutParams layoutParams2 = space4.getLayoutParams();
                    layoutParams2.height += i2;
                    int i3 = layoutParams2.height;
                    int i4 = this.f78961b;
                    if (i3 > i4) {
                        layoutParams2.height = i4;
                    }
                    CrossPlatformTitleBar crossPlatformTitleBar2 = this.f78965f;
                    if (crossPlatformTitleBar2 != null) {
                        crossPlatformTitleBar2.setBackgroundAlpha(((float) layoutParams2.height) / ((float) this.f78961b));
                    }
                    Space space5 = this.f78960a;
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
        MethodCollector.i(11903);
        MethodCollector.o(11903);
    }
}
