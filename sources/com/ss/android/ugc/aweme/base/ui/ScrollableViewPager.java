package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.base.utils.o;
import dmt.viewpager.DmtRtlViewPager;
import java.util.ArrayList;

public class ScrollableViewPager extends DmtRtlViewPager {

    /* renamed from: a  reason: collision with root package name */
    public int f68309a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f68310b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f68311c = true;

    /* renamed from: d  reason: collision with root package name */
    float f68312d;

    /* renamed from: e  reason: collision with root package name */
    float f68313e;

    /* renamed from: f  reason: collision with root package name */
    public a f68314f = new a() {
        /* class com.ss.android.ugc.aweme.base.ui.ScrollableViewPager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(42061);
        }

        @Override // com.ss.android.ugc.aweme.base.ui.ScrollableViewPager.a
        public final boolean a(int i2) {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.base.ui.ScrollableViewPager.a
        public final boolean a(float f2, float f3) {
            if (Math.abs(f2) <= ((float) ScrollableViewPager.this.f68309a) || Math.abs(f2) <= Math.abs(f3)) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private boolean f68315m;
    private k n;
    private boolean o;

    static {
        Covode.recordClassIndex(42060);
    }

    public interface a {

        /* renamed from: b  reason: collision with root package name */
        public static final int f68317b = n.a(8.0d);

        boolean a(float f2, float f3);

        boolean a(int i2);

        static {
            Covode.recordClassIndex(42062);
        }
    }

    private void a() {
        this.f68309a = n.a(8.0d);
        setDefaultGutterSize(0);
    }

    public int getItemCount() {
        PagerAdapter adapter = getAdapter();
        if (adapter == null) {
            return 0;
        }
        return adapter.getCount();
    }

    public void setBlockCanScroll(boolean z) {
        this.o = z;
    }

    public void setEnableDispatchTouchEventCheck(boolean z) {
        this.f68315m = z;
    }

    public void setOnFlingEndListener(k kVar) {
        this.n = kVar;
    }

    public void setPagingMainValve(boolean z) {
        this.f68311c = z;
    }

    public ScrollableViewPager(Context context) {
        super(context);
        a();
    }

    @Override // dmt.viewpager.DmtViewPager
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f68311c && this.f68310b && this.f68315m) {
            if (motionEvent.getAction() == 0) {
                this.f68312d = motionEvent.getX();
                this.f68313e = motionEvent.getY();
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                a(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // dmt.viewpager.DmtViewPager, dmt.viewpager.DmtRtlViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((this.f68311c && this.f68310b && a(motionEvent)) || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // dmt.viewpager.DmtViewPager, dmt.viewpager.DmtRtlViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((this.f68311c && this.f68310b && a(motionEvent)) || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r5 == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.ScrollableViewPager.a(android.view.MotionEvent):boolean");
    }

    public ScrollableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    @Override // android.view.View, dmt.viewpager.DmtViewPager, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        try {
            super.addFocusables(arrayList, i2, i3);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            b.a(e2);
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public final boolean a(View view, boolean z, int i2, int i3, int i4) {
        if (this.o || !o.a(view) || !super.a(view, z, i2, i3, i4)) {
            return false;
        }
        return true;
    }
}
