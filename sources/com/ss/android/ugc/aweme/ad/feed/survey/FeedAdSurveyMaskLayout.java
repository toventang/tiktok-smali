package com.ss.android.ugc.aweme.ad.feed.survey;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class FeedAdSurveyMaskLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66085a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f66086b;

    /* renamed from: c  reason: collision with root package name */
    private int f66087c;

    static {
        Covode.recordClassIndex(40624);
    }

    public FeedAdSurveyMaskLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40625);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return true;
        }
        Integer.valueOf(motionEvent.getAction());
        return true;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            Integer.valueOf(motionEvent.getAction());
            Integer valueOf = Integer.valueOf(motionEvent.getAction());
            if (valueOf != null) {
                if (valueOf.intValue() == 0) {
                    this.f66086b = (int) motionEvent.getX();
                    this.f66087c = (int) motionEvent.getY();
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                } else if (valueOf.intValue() == 2) {
                    if (Math.abs(motionEvent.getX() - ((float) this.f66086b)) > Math.abs(motionEvent.getY() - ((float) this.f66087c))) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        return true;
                    }
                    ViewParent parent3 = getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private /* synthetic */ FeedAdSurveyMaskLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FeedAdSurveyMaskLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(1004);
        MethodCollector.o(1004);
    }
}
