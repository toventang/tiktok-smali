package com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.utils.b;
import h.f.b.l;

public final class PreviewGestureViewPager extends ViewPager {

    /* renamed from: a  reason: collision with root package name */
    private float f129365a = -1.0f;

    /* renamed from: b  reason: collision with root package name */
    private a f129366b;

    /* renamed from: c  reason: collision with root package name */
    private float f129367c;

    public interface a {
        static {
            Covode.recordClassIndex(84912);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(84911);
    }

    public final void setGestureCallback(a aVar) {
        l.d(aVar, "");
        this.f129366b = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.f129365a = motionEvent.getX();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f2;
        Integer num;
        int i2;
        a aVar;
        if (motionEvent != null) {
            f2 = motionEvent.getX();
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            f2 = 0.0f;
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 2) {
                if (this.f129365a == -1.0f) {
                    this.f129365a = f2;
                }
            } else if (num.intValue() == 1) {
                PagerAdapter adapter = getAdapter();
                if (adapter != null) {
                    i2 = adapter.getCount();
                } else {
                    i2 = 0;
                }
                if (getCurrentItem() == 0 && f2 - this.f129365a > this.f129367c) {
                    a aVar2 = this.f129366b;
                    if (aVar2 != null) {
                        aVar2.a(true);
                    }
                } else if (getCurrentItem() == i2 - 1 && this.f129365a - f2 > this.f129367c && (aVar = this.f129366b) != null) {
                    aVar.a(false);
                }
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewGestureViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        this.f129367c = b.b(context, 10.0f);
    }
}
