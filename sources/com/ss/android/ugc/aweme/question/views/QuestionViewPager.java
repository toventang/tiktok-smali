package com.ss.android.ugc.aweme.question.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.RtlViewPager;

public class QuestionViewPager extends RtlViewPager {

    /* renamed from: f  reason: collision with root package name */
    private boolean f120016f;

    static {
        Covode.recordClassIndex(77989);
    }

    public void setPagingEnable(boolean z) {
        this.f120016f = z;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f120016f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f120016f) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public QuestionViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
