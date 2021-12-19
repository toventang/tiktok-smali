package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout;

public class BodyDancePullLayout extends PullUpLayout {

    /* renamed from: f  reason: collision with root package name */
    private float f132751f;

    static {
        Covode.recordClassIndex(86876);
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f132751f = motionEvent.getY();
            return false;
        } else if (motionEvent.getAction() != 2 || Math.abs(this.f132751f - motionEvent.getY()) <= ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop())) {
            return false;
        } else {
            return true;
        }
    }

    public BodyDancePullLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
