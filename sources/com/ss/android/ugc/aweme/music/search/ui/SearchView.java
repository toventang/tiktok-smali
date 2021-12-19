package com.ss.android.ugc.aweme.music.search.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class SearchView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private a f111728a;

    public interface a {
        static {
            Covode.recordClassIndex(71845);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(71844);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final a getDispatchTouchEventListener() {
        return this.f111728a;
    }

    public final void setDispatchTouchEventListener(a aVar) {
        this.f111728a = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar = this.f111728a;
        if (aVar != null) {
            aVar.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private /* synthetic */ SearchView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(8083);
        MethodCollector.o(8083);
    }
}
