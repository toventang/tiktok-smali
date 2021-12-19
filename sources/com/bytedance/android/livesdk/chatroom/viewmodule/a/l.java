package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ap.a;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.j.bx;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.widget.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;

public final class l implements u<b>, f {

    /* renamed from: a  reason: collision with root package name */
    private Room f16429a;

    /* renamed from: b  reason: collision with root package name */
    private DataChannel f16430b;

    /* renamed from: c  reason: collision with root package name */
    private i f16431c;

    /* renamed from: d  reason: collision with root package name */
    private Context f16432d;

    static {
        Covode.recordClassIndex(9082);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
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

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* bridge */ /* synthetic */ void onChanged(b bVar) {
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public l(Context context) {
        this.f16432d = context;
    }

    public final void onClick(View view) {
        c.a((com.bytedance.android.livesdk.ao.c) a.bF, (Object) false);
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = c();
        }
        if (!j.f107229h) {
            ao.a(y.e(), (int) R.string.efp);
            return;
        }
        androidx.fragment.app.i iVar = (androidx.fragment.app.i) this.f16430b.b(com.bytedance.android.livesdk.j.ao.class);
        if (this.f16429a != null && iVar != null) {
            ((com.bytedance.android.live.adminsetting.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.adminsetting.b.class)).getAdminSettingDialog().show(iVar, "ToolbarManageBehavior");
            b.a.a("livesdk_anchor_set_page_click").a(this.f16430b).a("live_type", com.bytedance.android.livesdkapi.depend.model.live.j.a(this.f16429a.getStreamType())).b();
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        this.f16430b = dataChannel;
        this.f16429a = (Room) dataChannel.b(df.class);
        this.f16431c = (i) dataChannel.b(bx.class);
        com.bytedance.android.live.p.l.SETTING.setRedDotVisible(dataChannel, a.bF.a().booleanValue());
    }
}
