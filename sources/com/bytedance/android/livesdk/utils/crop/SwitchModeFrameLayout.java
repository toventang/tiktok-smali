package com.bytedance.android.livesdk.utils.crop;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class SwitchModeFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private b f22310a;

    public static class a implements b {
        static {
            Covode.recordClassIndex(13169);
        }

        @Override // com.bytedance.android.livesdk.utils.crop.SwitchModeFrameLayout.b
        public void a(MotionEvent motionEvent) {
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(13170);
        }

        void a(MotionEvent motionEvent);
    }

    static {
        Covode.recordClassIndex(13168);
    }

    public void setIntercepter(b bVar) {
        this.f22310a = bVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b bVar = this.f22310a;
        if (bVar != null) {
            bVar.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public SwitchModeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(10971);
        MethodCollector.o(10971);
    }
}
