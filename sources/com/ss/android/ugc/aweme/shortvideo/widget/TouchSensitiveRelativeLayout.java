package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class TouchSensitiveRelativeLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private a f132874a;

    public interface a {
        static {
            Covode.recordClassIndex(86920);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(86919);
    }

    public void setNoBlockTouchListener(a aVar) {
        this.f132874a = aVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar = this.f132874a;
        if (aVar != null) {
            aVar.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public TouchSensitiveRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(9270);
        MethodCollector.o(9270);
    }
}
