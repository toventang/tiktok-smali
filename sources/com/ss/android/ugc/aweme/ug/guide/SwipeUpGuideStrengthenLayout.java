package com.ss.android.ugc.aweme.ug.guide;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.common.widget.e;
import h.f.b.l;

public final class SwipeUpGuideStrengthenLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private float f141877a;

    /* renamed from: b  reason: collision with root package name */
    private float f141878b;

    /* renamed from: c  reason: collision with root package name */
    private e f141879c;

    /* renamed from: d  reason: collision with root package name */
    private final float f141880d;

    /* renamed from: e  reason: collision with root package name */
    private float f141881e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f141882f;

    static {
        Covode.recordClassIndex(92713);
    }

    public SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final float getDensity() {
        return this.f141880d;
    }

    public final float getDisAmount() {
        return this.f141881e;
    }

    public final Runnable getFallBackRunnable() {
        return this.f141882f;
    }

    public final float getPreviousY() {
        return this.f141878b;
    }

    public final e getViewPager() {
        return this.f141879c;
    }

    public final float getYDown() {
        return this.f141877a;
    }

    public final void setDisAmount(float f2) {
        this.f141881e = f2;
    }

    public final void setFallBackRunnable(Runnable runnable) {
        this.f141882f = runnable;
    }

    public final void setPreviousY(float f2) {
        this.f141878b = f2;
    }

    public final void setViewPager(e eVar) {
        this.f141879c = eVar;
    }

    public final void setYDown(float f2) {
        this.f141877a = f2;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                float y = motionEvent.getY();
                this.f141877a = y;
                this.f141878b = y;
                e eVar5 = this.f141879c;
                if (eVar5 != null) {
                    eVar5.c();
                }
            } else if (action == 1) {
                e eVar6 = this.f141879c;
                if (!(eVar6 == null || !eVar6.b() || (eVar = this.f141879c) == null)) {
                    eVar.d();
                }
                this.f141877a = 0.0f;
                this.f141881e = 0.0f;
                e eVar7 = this.f141879c;
                if (!(eVar7 instanceof VerticalViewPager)) {
                    eVar7 = null;
                }
                VerticalViewPager verticalViewPager = (VerticalViewPager) eVar7;
                if (!(verticalViewPager == null || verticalViewPager.getChildCount() != 1 || (runnable = this.f141882f) == null)) {
                    runnable.run();
                }
            } else if (action == 2) {
                float y2 = motionEvent.getY() - this.f141878b;
                this.f141878b = motionEvent.getY();
                if (y2 < 0.0f || this.f141881e < 0.0f) {
                    e eVar8 = this.f141879c;
                    if (!(eVar8 == null || eVar8.b() || (eVar2 = this.f141879c) == null)) {
                        eVar2.c();
                    }
                    e eVar9 = this.f141879c;
                    if (eVar9 != null) {
                        eVar9.a(y2);
                    }
                    this.f141881e += y2;
                }
            } else if (action == 3 && (eVar3 = this.f141879c) != null && eVar3.b() && (eVar4 = this.f141879c) != null) {
                eVar4.d();
            }
        }
        return true;
    }

    private /* synthetic */ SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(8630);
        Resources resources = context.getResources();
        l.b(resources, "");
        this.f141880d = resources.getDisplayMetrics().density;
        MethodCollector.o(8630);
    }
}
