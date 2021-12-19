package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.j.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.z;

public final class BackRoomWidget extends RoomWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16244a = new a((byte) 0);

    static {
        Covode.recordClassIndex(8999);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bh1;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9000);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(Context context) {
            if (com.bytedance.android.livesdk.chatroom.backroom.b.f15002a.a(com.bytedance.android.live.core.f.a.a(context)).a() == null || !LiveDrawerSettings.INSTANCE.getValue().enableReturnBtn()) {
                return false;
            }
            return true;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean shouldAttach() {
        return a.a(getContext());
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        if (view != null) {
            view.setOnClickListener(new b(this));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.a(y.class, (h.f.a.b) new c(this));
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BackRoomWidget f16245a;

        static {
            Covode.recordClassIndex(9001);
        }

        b(BackRoomWidget backRoomWidget) {
            this.f16245a = backRoomWidget;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.an.a.a().a(new r(8));
            b.a.a("livesdk_topleft_return_click").a(this.f16245a.dataChannel).b();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ BackRoomWidget this$0;

        static {
            Covode.recordClassIndex(9002);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(BackRoomWidget backRoomWidget) {
            super(1);
            this.this$0 = backRoomWidget;
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
