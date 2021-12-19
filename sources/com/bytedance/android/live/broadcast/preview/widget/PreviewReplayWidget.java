package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.i;
import com.bytedance.android.live.broadcast.preview.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class PreviewReplayWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    private m f8381a;

    static {
        Covode.recordClassIndex(4285);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.b9n;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void a() {
        m mVar = this.f8381a;
        if (mVar != null) {
            mVar.b();
        }
    }

    public final void b() {
        m mVar = this.f8381a;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        Context context = this.context;
        View view = getView();
        if (view != null) {
            l.b(view, "");
            DataChannel dataChannel = this.dataChannel;
            l.b(dataChannel, "");
            this.f8381a = new m(context, view, dataChannel);
        }
    }
}
