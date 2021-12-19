package com.bytedance.android.live.broadcast.preview.widget;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.widget.Widget;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.z;

public final class PreviewLoadEndWidget extends Widget implements au {

    /* renamed from: a  reason: collision with root package name */
    public a<z> f8380a;

    static {
        Covode.recordClassIndex(4284);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bde;
    }

    @Override // com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        a<z> aVar = this.f8380a;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
