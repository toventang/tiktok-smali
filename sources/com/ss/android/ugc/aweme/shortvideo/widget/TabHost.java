package com.ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.utils.de;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public class TabHost extends FrameLayout implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static final String f132860a = TabHost.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public int f132861b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f132862c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f132863d;

    /* renamed from: e  reason: collision with root package name */
    List<Integer> f132864e;

    /* renamed from: f  reason: collision with root package name */
    Scroller f132865f;

    /* renamed from: g  reason: collision with root package name */
    public LinearLayout f132866g;

    /* renamed from: h  reason: collision with root package name */
    public a f132867h;

    /* renamed from: i  reason: collision with root package name */
    public de f132868i;

    /* renamed from: j  reason: collision with root package name */
    public int f132869j;

    /* renamed from: k  reason: collision with root package name */
    public View f132870k;

    /* renamed from: l  reason: collision with root package name */
    private GestureDetector f132871l;

    /* renamed from: m  reason: collision with root package name */
    private b f132872m;
    private c n;
    private float o;
    private float p;
    private float q;
    private float r;
    private int s;
    private int t;
    private int u;
    private int v;

    public interface a {
        static {
            Covode.recordClassIndex(86916);
        }

        void a(Object obj, int i2, int i3, boolean z, boolean z2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(86917);
        }

        void a(String str);
    }

    public interface c {
        static {
            Covode.recordClassIndex(86918);
        }
    }

    public int getCurrentIndex() {
        return this.f132861b;
    }

    static {
        Covode.recordClassIndex(86914);
    }

    public int getTabCount() {
        LinearLayout linearLayout = this.f132866g;
        if (linearLayout == null) {
            return 0;
        }
        return linearLayout.getChildCount();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f132866g = (LinearLayout) findViewById(R.id.ad7);
    }

    public final boolean a() {
        ShortVideoContext shortVideoContext;
        Activity activity = (Activity) getContext();
        if (activity == null || (shortVideoContext = ((ShortVideoContextViewModel) ae.a((e) activity, (ad.b) null).a(ShortVideoContextViewModel.class)).f124769a) == null || !shortVideoContext.b()) {
            return false;
        }
        return true;
    }

    public void setOnIndexChangedListener(a aVar) {
        this.f132867h = aVar;
    }

    public void setScrollEnabled(boolean z) {
        this.f132862c = z;
    }

    public void setSharedARTabChangeListener(b bVar) {
        this.f132872m = bVar;
    }

    public void setTouchEventWrapper(c cVar) {
        this.n = cVar;
    }

    public void setUISwitchEnabled(boolean z) {
        this.f132863d = z;
    }

    private void c(int i2) {
        if (this.f132866g != null) {
            for (int i3 = 0; i3 < this.f132866g.getChildCount(); i3++) {
                if (i3 != i2) {
                    a(i3, false);
                }
            }
            a(i2, true);
        }
    }

    public final Object b(int i2) {
        View childAt;
        LinearLayout linearLayout = this.f132866g;
        if (linearLayout == null || (childAt = linearLayout.getChildAt(i2)) == null) {
            return null;
        }
        return childAt.getTag();
    }

    public void setStartMargin(int i2) {
        this.v = i2;
        LinearLayout linearLayout = this.f132866g;
        if (linearLayout != null && (linearLayout instanceof ScrollableLinearLayout)) {
            ScrollableLinearLayout scrollableLinearLayout = (ScrollableLinearLayout) linearLayout;
            scrollableLinearLayout.f132846a = i2;
            scrollableLinearLayout.requestLayout();
        }
        requestLayout();
    }

    public final Object a(int i2) {
        View childAt;
        LinearLayout linearLayout = this.f132866g;
        if (linearLayout == null || (childAt = linearLayout.getChildAt(i2)) == null) {
            return null;
        }
        return childAt.getTag();
    }

    public TabHost(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private void a(int i2, boolean z) {
        View childAt;
        LinearLayout linearLayout = this.f132866g;
        if (linearLayout != null && (childAt = linearLayout.getChildAt(i2)) != null) {
            if (childAt instanceof n) {
                ((n) childAt).setTabSelected(z);
            } else if (childAt instanceof TextView) {
                childAt.setSelected(z);
            }
        }
    }

    private void b(int i2, int i3) {
        View childAt;
        LinearLayout linearLayout = this.f132866g;
        if (linearLayout != null && (childAt = linearLayout.getChildAt(i2)) != null) {
            int i4 = 0;
            if (childAt instanceof n) {
                n nVar = (n) childAt;
                nVar.setTextColor(i3);
                int alpha = Color.alpha(i3);
                Drawable[] compoundDrawables = nVar.getTextView().getCompoundDrawables();
                int length = compoundDrawables.length;
                while (i4 < length) {
                    Drawable drawable = compoundDrawables[i4];
                    if (drawable != null) {
                        drawable.setAlpha(alpha);
                        i4++;
                    } else {
                        return;
                    }
                }
            } else if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextColor(i3);
                int alpha2 = Color.alpha(i3);
                Drawable[] compoundDrawables2 = textView.getCompoundDrawables();
                int length2 = compoundDrawables2.length;
                while (i4 < length2) {
                    Drawable drawable2 = compoundDrawables2[i4];
                    if (drawable2 != null) {
                        drawable2.setAlpha(alpha2);
                        i4++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void a(int i2, int i3) {
        a aVar;
        int i4;
        b bVar;
        if (!a() || (bVar = this.f132872m) == null) {
            for (int i5 = 0; i5 < this.f132866g.getChildCount(); i5++) {
                if (i5 == i2) {
                    i4 = this.s;
                } else {
                    i4 = this.t;
                }
                b(i5, i4);
                c(i2);
            }
            int i6 = this.f132861b;
            if (!(i6 == i2 || (aVar = this.f132867h) == null)) {
                aVar.a(b(i6), i2, i3, false, true);
            }
            com.ss.android.ugc.aweme.df.e.a("withoutAnim the set index is " + i2 + " mCurIndex:" + this.f132861b);
            this.f132861b = i2;
            if (!this.f132864e.isEmpty() && i2 >= 0 && i2 < this.f132864e.size()) {
                ValueAnimator ofInt = ValueAnimator.ofInt(this.f132866g.getScrollX(), this.f132864e.get(i2).intValue() - this.f132864e.get(0).intValue());
                ofInt.setDuration(150L);
                ofInt.addUpdateListener(new m(this));
                ofInt.start();
                return;
            }
            return;
        }
        bVar.a((String) b(i2));
    }

    private void c(int i2, int i3) {
        int childCount = this.f132866g.getChildCount();
        this.f132864e.clear();
        int i4 = i2;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = this.f132866g.getChildAt(i5);
            if (childAt != null) {
                if (i5 == 0) {
                    i4 = ((i4 + ((i3 - i2) / 2)) - (childAt.getWidth() / 2)) - this.v;
                }
                if (childAt instanceof n) {
                    n nVar = (n) childAt;
                    this.f132864e.add(Integer.valueOf(nVar.getTextView().getPaddingLeft() + i4 + (((nVar.getTextView().getWidth() - nVar.getTextView().getPaddingLeft()) - nVar.getTextView().getPaddingRight()) / 2)));
                } else if (childAt instanceof TextView) {
                    this.f132864e.add(Integer.valueOf((childAt.getWidth() / 2) + i4));
                }
                childAt.layout(i4, childAt.getTop(), childAt.getWidth() + i4, childAt.getBottom());
                i4 += childAt.getWidth();
            }
        }
        com.ss.android.ugc.aweme.df.e.a("the xPivots size is " + childCount + " mCurIndex:" + this.f132861b);
        int a2 = androidx.core.b.a.a(this.f132861b, 0, childCount - 1);
        try {
            this.f132866g.scrollTo(this.f132864e.get(a2).intValue() - this.f132864e.get(0).intValue(), 0);
            if (this.f132861b > a2) {
                com.ss.android.ugc.aweme.df.e.a("mCurIndex is dangerous， modify it !!! safeIndex: " + a2 + " mCurIndex:" + this.f132861b);
                this.f132861b = a2;
            }
        } catch (IndexOutOfBoundsException e2) {
            StringBuilder sb = new StringBuilder();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = this.f132866g.getChildAt(i6);
                sb.append("index ");
                sb.append(i6);
                sb.append(' ');
                sb.append(childAt2.getClass());
                sb.append(' ');
                sb.append(childAt2.getTag());
                sb.append('\n');
            }
            throw new IllegalStateException("Inconsistency detected. children are ".concat(String.valueOf(sb)), e2);
        }
    }

    public final void a(View view, int i2) {
        MethodCollector.i(10134);
        LinearLayout linearLayout = this.f132866g;
        if (linearLayout == null || linearLayout.getChildCount() < i2) {
            MethodCollector.o(10134);
            return;
        }
        this.f132866g.addView(view, i2);
        int i3 = this.f132861b;
        if (i2 <= i3) {
            this.f132861b = i3 + 1;
        }
        requestLayout();
        MethodCollector.o(10134);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d4, code lost:
        r2 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 577
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.widget.TabHost.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void a(int i2, boolean z, boolean z2) {
        a(i2, z, false, z2);
    }

    private TabHost(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9975);
        this.f132862c = true;
        this.f132863d = true;
        this.f132868i = new de();
        this.s = androidx.core.content.b.c(getContext(), R.color.a9);
        this.t = androidx.core.content.b.c(getContext(), R.color.ac);
        this.u = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f132864e = new ArrayList();
        setOnTouchListener(this);
        this.f132865f = new Scroller(getContext());
        this.f132871l = new GestureDetector(getContext(), new GestureDetector.OnGestureListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.widget.TabHost.AnonymousClass1 */

            static {
                Covode.recordClassIndex(86915);
            }

            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            public final void onLongPress(MotionEvent motionEvent) {
            }

            public final void onShowPress(MotionEvent motionEvent) {
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                TabHost tabHost = TabHost.this;
                if (tabHost.equals(tabHost.f132870k) || TabHost.this.f132866g.equals(TabHost.this.f132870k) || !TabHost.this.f132868i.a(TabHost.this.f132870k) || !TabHost.this.f132863d) {
                    return false;
                }
                TabHost tabHost2 = TabHost.this;
                tabHost2.a(tabHost2.f132869j, 0);
                return false;
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                if (TabHost.this.f132862c && !TabHost.this.a() && f3 < 20.0f) {
                    TabHost.this.f132865f.fling(TabHost.this.f132865f.getFinalX(), TabHost.this.f132865f.getFinalY(), (int) f3, 0, 500, (int) f2, 0, TabHost.this.getHeight());
                }
                return false;
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                if (!TabHost.this.f132862c || TabHost.this.a()) {
                    return false;
                }
                if (f3 < 20.0f) {
                    f3 = 20.0f;
                }
                TabHost.this.f132866g.scrollBy((int) ((f2 * 20.0f) / f3), 0);
                TabHost.this.invalidate();
                return true;
            }
        });
        MethodCollector.o(9975);
    }

    public final void a(int i2, boolean z, boolean z2, boolean z3) {
        a aVar;
        int i3;
        for (int i4 = 0; i4 < this.f132866g.getChildCount(); i4++) {
            if (i4 == i2) {
                i3 = this.s;
            } else {
                i3 = this.t;
            }
            b(i4, i3);
            c(i2);
        }
        int i5 = this.f132861b;
        if (!(i5 == i2 || (aVar = this.f132867h) == null || !z)) {
            aVar.a(b(i5), i2, 0, z2, z3);
        }
        com.ss.android.ugc.aweme.df.e.a("the set index is " + i2 + " mCurIndex:" + this.f132861b);
        this.f132861b = i2;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MethodCollector.i(10316);
        super.onLayout(z, i2, i3, i4, i5);
        if (com.ss.android.ugc.aweme.tools.c.a(getContext())) {
            int childCount = this.f132866g.getChildCount();
            this.f132864e.clear();
            int i6 = i4;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f132866g.getChildAt(i7);
                if (childAt != null) {
                    if (i7 == 0) {
                        int i8 = i4 - i2;
                        i6 = (i6 - (i8 / 2)) + (childAt.getWidth() / 2) + ((this.f132866g.getRight() - this.f132866g.getLeft()) - i8) + this.v;
                    }
                    this.f132864e.add(Integer.valueOf(i6 - (childAt.getWidth() / 2)));
                    childAt.layout(i6 - childAt.getWidth(), childAt.getTop(), i6, childAt.getBottom());
                    i6 -= childAt.getWidth();
                }
            }
            com.ss.android.ugc.aweme.df.e.a("the xPivots size is " + childCount + " mCurIndex:" + this.f132861b);
            int a2 = androidx.core.b.a.a(this.f132861b, 0, childCount - 1);
            try {
                this.f132866g.scrollTo(this.f132864e.get(a2).intValue() - this.f132864e.get(0).intValue(), 0);
                if (this.f132861b > a2) {
                    com.ss.android.ugc.aweme.df.e.a("mCurIndex is dangerous， modify it !!! safeIndex: " + a2 + " mCurIndex:" + this.f132861b);
                    this.f132861b = a2;
                }
                MethodCollector.o(10316);
            } catch (IndexOutOfBoundsException e2) {
                StringBuilder sb = new StringBuilder();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt2 = this.f132866g.getChildAt(i9);
                    sb.append("index ");
                    sb.append(i9);
                    sb.append(' ');
                    sb.append(childAt2.getClass());
                    sb.append(' ');
                    sb.append(childAt2.getTag());
                    sb.append('\n');
                }
                IllegalStateException illegalStateException = new IllegalStateException("Inconsistency detected. children are ".concat(String.valueOf(sb)), e2);
                MethodCollector.o(10316);
                throw illegalStateException;
            }
        } else {
            c(i2, i4);
            MethodCollector.o(10316);
        }
    }
}
