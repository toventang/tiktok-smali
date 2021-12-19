package com.bytedance.ies.xelement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.a.c;
import h.f.a.a;
import h.f.a.q;
import h.f.b.g;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;

public abstract class DeclarativeVideoPlayBoxViewDelegate extends RelativeLayout {
    private HashMap _$_findViewCache;

    static {
        Covode.recordClassIndex(21904);
    }

    public DeclarativeVideoPlayBoxViewDelegate(Context context) {
        this(context, null, 0, 6, null);
    }

    public DeclarativeVideoPlayBoxViewDelegate(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i2) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this._$_findViewCache.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void destroy() {
    }

    public int getDuration() {
        return 0;
    }

    public abstract void onPropsUpdateOnce();

    public abstract void pause();

    public abstract void performZoom();

    public abstract void performZoomOut();

    public abstract void playReal(a<z> aVar);

    public abstract void seek(int i2, boolean z);

    public void setAutoLifecycle(boolean z) {
    }

    public abstract void setAutoPlay(boolean z);

    public void setBorderRadius(float[] fArr) {
    }

    public abstract void setDeviceChangeAware(boolean z);

    public void setEnablePlayListener(boolean z) {
    }

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

    public void setResourceLoader(com.bytedance.ies.xelement.a.a<c> aVar) {
        l.c(aVar, "");
    }

    public abstract void setSinglePlayer(boolean z);

    public abstract void setSrc(String str);

    public void setStateChangeReporter(q<? super String, ? super Map<String, ? extends Object>, ? super DeclarativeVideoPlayBoxViewDelegate, z> qVar) {
    }

    public void setVideoHeight(int i2) {
    }

    public void setVideoTag(String str) {
    }

    public void setVideoWidth(int i2) {
    }

    public abstract void setVolume(float f2);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeclarativeVideoPlayBoxViewDelegate(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ies.xelement.DeclarativeVideoPlayBoxViewDelegate */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playReal$default(DeclarativeVideoPlayBoxViewDelegate declarativeVideoPlayBoxViewDelegate, a aVar, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                aVar = null;
            }
            declarativeVideoPlayBoxViewDelegate.playReal(aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playReal");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeclarativeVideoPlayBoxViewDelegate(Context context, AttributeSet attributeSet, int i2, int i3, g gVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
