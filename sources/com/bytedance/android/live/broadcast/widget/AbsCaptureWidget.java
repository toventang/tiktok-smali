package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.api.d.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;

public abstract class AbsCaptureWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f8678a;

    /* renamed from: b  reason: collision with root package name */
    protected a f8679b;

    static {
        Covode.recordClassIndex(4447);
    }

    public void b() {
        this.f8678a = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        if (!this.f8678a) {
            this.f8678a = true;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        if (this.f8678a) {
            b();
        }
    }

    public AbsCaptureWidget(a aVar) {
        this.f8679b = aVar;
    }
}
