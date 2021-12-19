package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class SearchResultView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private a f70758a;

    public interface a {
        static {
            Covode.recordClassIndex(43617);
        }

        void a(MotionEvent motionEvent);
    }

    static {
        Covode.recordClassIndex(43616);
    }

    public SearchResultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setOnDispatchTouchEventListener(a aVar) {
        l.d(aVar, "");
        this.f70758a = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        a aVar = this.f70758a;
        if (aVar != null) {
            aVar.a(motionEvent);
        }
        return dispatchTouchEvent;
    }

    private /* synthetic */ SearchResultView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchResultView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(5844);
        MethodCollector.o(5844);
    }
}
