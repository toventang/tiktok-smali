package com.ss.android.ugc.aweme.dsp.widget.vvpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;

public final class MDFilterScrollVerticalVPager extends MDVerticalViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84057a = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private b f84058h;

    /* renamed from: i  reason: collision with root package name */
    private int f84059i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f84060j;

    public interface b {
        static {
            Covode.recordClassIndex(52412);
        }

        boolean a();

        boolean b();
    }

    static {
        Covode.recordClassIndex(52410);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52411);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void setFilterScrollInterceptor(b bVar) {
        this.f84058h = bVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            this.f84059i = 0;
            this.f84060j = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 2 && this.f84060j) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    public MDFilterScrollVerticalVPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager
    public final void a(int i2, float f2, int i3) {
        int i4;
        boolean z;
        b bVar;
        super.a(i2, f2, i3);
        if (this.f84067e && !this.f84060j) {
            float f3 = ((float) i2) + f2;
            if (f3 < ((float) getCurrentItem())) {
                i4 = 1;
            } else if (f3 > ((float) getCurrentItem())) {
                i4 = -1;
            } else {
                i4 = 0;
            }
            if (this.f84059i != i4) {
                if (i4 == -1) {
                    b bVar2 = this.f84058h;
                    if (bVar2 != null) {
                        z = bVar2.a();
                    }
                } else if (i4 == 1 && (bVar = this.f84058h) != null) {
                    z = bVar.b();
                }
                if (!z) {
                    this.f84060j = true;
                    a(getCurrentItem(), false, true, 0);
                }
            }
            this.f84059i = i4;
        }
    }
}
