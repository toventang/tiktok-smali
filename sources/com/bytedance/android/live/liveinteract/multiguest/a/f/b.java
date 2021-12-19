package com.bytedance.android.live.liveinteract.multiguest.a.f;

import android.text.TextUtils;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.a.c;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.multiguest.a.b.a;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.live.liveinteract.platform.common.g.i;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.model.a;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;
import org.json.JSONObject;

final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f11147a;

    static {
        Covode.recordClassIndex(5986);
    }

    b(a aVar) {
        this.f11147a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f11147a;
        a aVar2 = (a) ((d) obj).data;
        aVar.f11137c = false;
        if (aVar.f11898g != null) {
            com.bytedance.android.livesdk.b.a.d.a().f14185f = aVar2.f15678b;
            g.a.f14199a.a(u.a().b().c(), aVar2.f15678b);
            com.bytedance.android.livesdk.b.a.d.a().f14186g = aVar2.f15679c;
            c.a().a((Integer) 1);
            c.a().f9959k = aVar.f11136b;
            c.a().f9960l = aVar2.f15680d;
            String b2 = e.a.f9628b.b(aVar2);
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_Guest_Apply_Success", b2);
            String str = "";
            l.d(b2, str);
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "response", b2);
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - i.f11978i);
            i iVar = i.f11979j;
            i.a((i) false, (boolean) "apply_succeed", (String) jSONObject, (JSONObject) 0);
            Object a2 = com.bytedance.android.live.liveinteract.api.c.e.f10014a.a("MULTI_GUEST_DATA_HOLDER");
            if (a2 instanceof com.bytedance.android.live.liveinteract.multiguest.opt.a.a) {
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = (com.bytedance.android.live.liveinteract.multiguest.opt.a.a) a2;
                aVar3.c().clear();
                aVar3.c().putAll(aVar2.f15682f);
                h.a(aVar.f11136b, aVar2.f15680d, aVar.f11135a.getOwner().getFollowInfo().getFollowStatus(), aVar.f11139e, aVar3.q);
            } else {
                h.a(aVar.f11136b, aVar2.f15680d, aVar.f11135a.getOwner().getFollowInfo().getFollowStatus(), aVar.f11139e, (n) null);
            }
            com.bytedance.android.livesdk.b.a.d.a().z = false;
            a.b bVar = (a.b) aVar.f11898g;
            if (!TextUtils.isEmpty(aVar2.f15681e)) {
                str = aVar2.f15681e;
            }
            bVar.a(str);
        }
    }
}
