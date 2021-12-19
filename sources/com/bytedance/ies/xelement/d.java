package com.bytedance.ies.xelement;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;

public abstract class d extends RelativeLayout {
    static {
        Covode.recordClassIndex(22100);
    }

    public abstract void a();

    public abstract void a(int i2, boolean z);

    public abstract void a(a<z> aVar);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public int getDuration() {
        return 0;
    }

    public abstract void setAutoLifecycle(boolean z);

    public abstract void setAutoPlay(boolean z);

    public void setBorderRadius(float[] fArr) {
    }

    public abstract void setDeviceChangeAware(boolean z);

    public abstract void setInitTime(int i2);

    public void setLogExtra(HashMap<String, Object> hashMap) {
        l.c(hashMap, "");
    }

    public abstract void setLoop(boolean z);

    public abstract void setMuted(boolean z);

    public abstract void setObjectFit(String str);

    public void setPerformanceLog(String str) {
        l.c(str, "");
    }

    public abstract void setPoster(String str);

    public abstract void setPreload(boolean z);

    public abstract void setRate(int i2);

    public abstract void setSinglePlayer(boolean z);

    public abstract void setSrc(String str);

    public abstract void setStateChangeReporter(q<? super String, ? super Map<String, ? extends Object>, ? super d, z> qVar);

    public void setVideoHeight(int i2) {
    }

    public void setVideoWidth(int i2) {
    }

    public abstract void setVolume(float f2);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
    }
}
