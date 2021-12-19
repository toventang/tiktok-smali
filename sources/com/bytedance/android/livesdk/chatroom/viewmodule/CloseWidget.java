package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.j.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.z;

public final class CloseWidget extends RoomWidget implements au {
    static {
        Covode.recordClassIndex(9006);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bh2;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
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
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.a(y.class, (h.f.a.b) new b(this));
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CloseWidget f16261a;

        static {
            Covode.recordClassIndex(9007);
        }

        a(CloseWidget closeWidget) {
            this.f16261a = closeWidget;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.an.a.a().a(new r(6));
            b.a.a("livesdk_exit_liveroom_click").a(this.f16261a.dataChannel).b();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ CloseWidget this$0;

        static {
            Covode.recordClassIndex(9008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CloseWidget closeWidget) {
            super(1);
            this.this$0 = closeWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            View view = this.this$0.getView();
            if (view != null) {
                view.setVisibility(intValue);
            }
            return z.f158842a;
        }
    }
}
