package com.bytedance.android.live.broadcast.widget;

import android.view.SurfaceView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.api.d.a;
import com.bytedance.android.live.broadcast.stream.capture.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;

public class CaptureWidget2 extends AbsCaptureWidget implements au {

    /* renamed from: c  reason: collision with root package name */
    f f8680c;

    /* renamed from: d  reason: collision with root package name */
    SurfaceView f8681d;

    static {
        Covode.recordClassIndex(4448);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bfk;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget
    public void onDestroy() {
        super.onDestroy();
        this.f8680c = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget
    public void onCreate() {
        super.onCreate();
        this.f8681d = (SurfaceView) getView();
    }

    CaptureWidget2(f fVar, a aVar) {
        super(aVar);
        this.f8680c = fVar;
    }
}
