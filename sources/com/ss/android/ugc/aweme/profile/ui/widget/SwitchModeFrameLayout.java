package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class SwitchModeFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private b f117386a;

    public static class a implements b {
        static {
            Covode.recordClassIndex(75845);
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout.b
        public void a(MotionEvent motionEvent) {
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(75846);
        }

        void a(MotionEvent motionEvent);
    }

    static {
        Covode.recordClassIndex(75844);
    }

    public void setIntercepter(b bVar) {
        this.f117386a = bVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b bVar = this.f117386a;
        if (bVar != null) {
            bVar.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public SwitchModeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(10054);
        MethodCollector.o(10054);
    }
}
