package com.bytedance.android.livesdk.usercard;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.livesdk.at.k;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final f f21853a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21854b;

    static {
        Covode.recordClassIndex(12868);
    }

    l(f fVar, String str) {
        this.f21853a = fVar;
        this.f21854b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        f fVar = this.f21853a;
        String str = this.f21854b;
        dialogInterface.dismiss();
        if (fVar.f21836d.getFollowInfo() != null) {
            y yVar = fVar.f21844l;
            Activity activity = fVar.f21834b;
            yVar.f21896a.a(u.a().b().a(((k.b) ((k.a) new k.b().a(activity).a(fVar.f21839g)).a((int) fVar.f21836d.getFollowInfo().getFollowStatus()).a(str).b(fVar.f21840h.getId())).c()).a(new aj(yVar), new ab(yVar)));
            fVar.f21842j.a(false, fVar.f21839g, fVar.n, fVar.f21838f, fVar.f21837e, b.a.a().f9941f == fVar.f21836d.getId(), fVar.f21836d.getFollowInfo().getFollowStatus(), fVar.f21843k);
            if (a.a(fVar.f21835c) && fVar.f21840h.getOwner() != null && fVar.f21839g == fVar.f21840h.getOwner().getId()) {
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", String.valueOf(fVar.f21840h.getOwner().getId()));
                hashMap.put("room_id", String.valueOf(fVar.f21840h.getId()));
                a.a("live_ad", "unfollow", null, hashMap);
            }
        }
    }
}
