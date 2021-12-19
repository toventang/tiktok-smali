package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.cr;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class PreviewLiveStudioTipsWidget extends LiveWidget implements au {
    static {
        Covode.recordClassIndex(4282);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhi;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        if (view != null) {
            view.setOnClickListener(new a(this));
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        String str;
        com.bytedance.android.livesdkapi.depend.model.live.i iVar;
        super.show();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (iVar = (com.bytedance.android.livesdkapi.depend.model.live.i) dataChannel.b(x.class)) == null) {
            str = "";
        } else {
            str = j.a(iVar);
        }
        l.d(str, "");
        b.a.a("livesdk_live_studio_available_show").a("anchor_id", com.bytedance.android.live.broadcast.preview.a.a.a()).a(str).b();
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewLiveStudioTipsWidget f8379a;

        static {
            Covode.recordClassIndex(4283);
        }

        a(PreviewLiveStudioTipsWidget previewLiveStudioTipsWidget) {
            this.f8379a = previewLiveStudioTipsWidget;
        }

        public final void onClick(View view) {
            DataChannel dataChannel = this.f8379a.dataChannel;
            if (dataChannel != null) {
                dataChannel.c(cr.class);
            }
        }
    }
}
