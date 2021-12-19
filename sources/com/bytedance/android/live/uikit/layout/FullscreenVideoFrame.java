package com.bytedance.android.live.uikit.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class FullscreenVideoFrame extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private a f12903a;

    public interface a {
        static {
            Covode.recordClassIndex(7162);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(7161);
    }

    public void setListener(a aVar) {
        this.f12903a = aVar;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(12251);
        setFocusable(true);
        setFocusableInTouchMode(true);
        MethodCollector.o(12251);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        a aVar = this.f12903a;
        if (aVar == null) {
            return true;
        }
        aVar.a();
        return true;
    }
}
