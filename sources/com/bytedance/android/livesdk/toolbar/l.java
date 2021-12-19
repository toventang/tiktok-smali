package com.bytedance.android.livesdk.toolbar;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.b.a.a;
import com.bytedance.android.b;
import com.bytedance.android.live.p.h;
import com.bytedance.android.live.p.q;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.Stack;

public class l implements h {
    static {
        Covode.recordClassIndex(12812);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p.h
    public Class<LiveAudienceToolbarWidget> audienceToolbarWidget() {
        return LiveAudienceToolbarWidget.class;
    }

    @Override // com.bytedance.android.live.p.h
    public Class<LiveBroadcastToolbarWidget> broadcastToolbarWidget() {
        return LiveBroadcastToolbarWidget.class;
    }

    @Override // com.bytedance.android.live.p.h
    public k toolbarManager() {
        return k.f21737a;
    }

    @Override // com.bytedance.android.live.p.h
    public Class<LiveToolbarWidget> toolbarWidget() {
        return LiveToolbarWidget.class;
    }

    @Override // com.bytedance.android.live.p.h
    public void preloadAudienceToolbarWidget() {
        b.a((int) R.layout.bfg);
    }

    @Override // com.bytedance.android.live.p.h
    public void preloadBroadcastToolbarWidget() {
        b.a((int) R.layout.bff);
    }

    @Override // com.bytedance.android.live.p.h
    public void releaseToolbarView() {
        m.f21740a.clear();
        m.f21741b = null;
        m.f21742c = null;
    }

    @Override // com.bytedance.android.live.p.h
    public void preloadToolbarView(Context context, int i2, q qVar) {
        int i3;
        h.f.b.l.d(qVar, "");
        h.f.b.l.d(qVar, "");
        if (LiveLayoutPreloadSetting.INSTANCE.enable() && context != null) {
            m.f21741b = new a(new MutableContextWrapper(context));
            m.f21742c = LayoutInflater.from(new MutableContextWrapper(context));
            Stack<View> stack = m.f21740a.get(qVar);
            if (stack != null) {
                for (T t : stack) {
                    h.f.b.l.b(t, "");
                    Context context2 = t.getContext();
                    if (!(context2 instanceof MutableContextWrapper)) {
                        context2 = null;
                    }
                    MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) context2;
                    if (mutableContextWrapper != null) {
                        mutableContextWrapper.setBaseContext(context);
                    }
                }
            }
            Stack<View> stack2 = m.f21740a.get(qVar);
            if (stack2 != null) {
                i3 = stack2.size();
            } else {
                m.f21740a.put(qVar, new Stack<>());
                i3 = 0;
            }
            int i4 = i2 - i3;
            for (int i5 = 0; i5 < i4; i5++) {
                m.a(qVar);
            }
        }
    }
}
