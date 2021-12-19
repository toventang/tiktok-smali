package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public class GestureDetectLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public List<View.OnTouchListener> f22478a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private List<View.OnTouchListener> f22479b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<View.OnTouchListener> f22480c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private a f22481d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f22482e = false;

    public interface a {
        static {
            Covode.recordClassIndex(13272);
        }

        void a(int i2, int i3);
    }

    static {
        Covode.recordClassIndex(13271);
    }

    public final void a() {
        this.f22480c.clear();
        this.f22479b.clear();
        this.f22478a.clear();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setInterceptTouchEvent(boolean z) {
        this.f22482e = z;
    }

    public void setOnSizeChangedListener(a aVar) {
        this.f22481d = aVar;
    }

    public final void a(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.f22480c.add(onTouchListener);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        for (int size = this.f22479b.size() - 1; size >= 0; size--) {
            this.f22479b.get(size).onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        for (int size = this.f22480c.size() - 1; size >= 0; size--) {
            this.f22480c.get(size).onTouch(this, motionEvent);
        }
        return true;
    }

    public GestureDetectLayout(Context context) {
        super(context);
        MethodCollector.i(13175);
        MethodCollector.o(13175);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        for (int size = this.f22478a.size() - 1; size >= 0; size--) {
            this.f22478a.get(size).onTouch(this, motionEvent);
        }
        if (this.f22482e || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public GestureDetectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(13176);
        MethodCollector.o(13176);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        a aVar = this.f22481d;
        if (aVar != null) {
            aVar.a(i3, i5);
        }
    }
}
