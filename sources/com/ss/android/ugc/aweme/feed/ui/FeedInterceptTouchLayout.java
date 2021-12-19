package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.tux.a.i.a;
import h.f.b.l;

public final class FeedInterceptTouchLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public int f94087a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f94088b;

    static {
        Covode.recordClassIndex(59809);
    }

    public FeedInterceptTouchLayout(Context context, byte b2) {
        this(context);
    }

    public final boolean getGroupClickable() {
        return this.f94088b;
    }

    public final int getHintTextRes() {
        return this.f94087a;
    }

    public final void setGroupClickable(boolean z) {
        this.f94088b = z;
    }

    public final void setHintTextRes(int i2) {
        this.f94087a = i2;
    }

    private /* synthetic */ FeedInterceptTouchLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f94088b) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedInterceptTouchLayout(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(10422);
        this.f94088b = true;
        this.f94087a = -1;
        setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.feed.ui.FeedInterceptTouchLayout.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FeedInterceptTouchLayout f94089a;

            static {
                Covode.recordClassIndex(59810);
            }

            {
                this.f94089a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f94089a.f94087a != -1) {
                    new a(context).a(this.f94089a.f94087a).a();
                }
            }
        });
        MethodCollector.o(10422);
    }
}
