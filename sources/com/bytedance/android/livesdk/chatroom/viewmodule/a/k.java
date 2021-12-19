package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.android.live.broadcast.preview.aj;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.p.f;
import com.bytedance.android.live.p.l;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ap.a;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.widget.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;

public final class k implements u<b>, f {

    /* renamed from: a  reason: collision with root package name */
    private DataChannel f16427a;

    /* renamed from: b  reason: collision with root package name */
    private Context f16428b;

    static {
        Covode.recordClassIndex(9081);
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

    public k(Context context) {
        this.f16428b = context;
    }

    public final void onClick(View view) {
        c.a((com.bytedance.android.livesdk.ao.c) a.cM, (Object) false);
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = c();
        }
        if (!j.f107229h) {
            ao.a(y.e(), (int) R.string.efp);
            return;
        }
        Context context = this.f16428b;
        if (!(context == null || this.f16427a == null)) {
            com.bytedance.android.live.core.widget.a.a(com.bytedance.android.live.core.f.a.b(context), aj.a(false));
        }
        b.a.a("livesdk_room_detail_setting").a().f("click").b();
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        this.f16427a = dataChannel;
        l.INTRO.setRedDotVisible(dataChannel, a.cM.a().booleanValue());
        b.a.a("livesdk_room_detail_setting").a().f("show").b();
    }
}
