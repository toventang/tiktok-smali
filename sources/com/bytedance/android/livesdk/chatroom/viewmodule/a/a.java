package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskListUrlSetting;
import com.bytedance.android.livesdk.model.utils.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private Context f16346a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.android.live.core.widget.a f16347b;

    static {
        Covode.recordClassIndex(9046);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
    }

    public a(Context context) {
        this.f16346a = context;
    }

    public final void onClick(View view) {
        b bVar = new b(LiveBroadcastTaskListUrlSetting.INSTANCE.getValue());
        bVar.a("enter_from", "mission_entrance");
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        int i2 = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
        com.bytedance.android.live.core.widget.a aVar = this.f16347b;
        if (!(aVar == null || aVar.getDialog() == null || !aVar.getDialog().isShowing())) {
            this.f16347b.dismissAllowingStateLoss();
            this.f16347b = null;
        }
        d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
        d.b a2 = e.a(bVar.a());
        a2.f14301b = i2;
        a2.f14302c = 400;
        d.b a3 = a2.a(8, 8, 0, 0);
        a3.n = false;
        a3.f14303d = 0;
        a3.f14309j = 80;
        com.bytedance.android.live.core.widget.a a4 = webViewManager.a(a3);
        this.f16347b = a4;
        if (a4 != null) {
            Context context = this.f16346a;
            if (context instanceof androidx.fragment.app.e) {
                com.bytedance.android.live.core.widget.a.a((androidx.fragment.app.e) context, a4);
            }
        }
        b.a.a("livesdk_anchor_mission_entrance_click").a("_param_live_platform", "live").b();
    }
}
