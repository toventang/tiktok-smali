package com.bytedance.android.live.broadcast.b;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.model.o;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f7560a;

    static {
        Covode.recordClassIndex(3730);
    }

    b(a aVar) {
        this.f7560a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f7560a;
        o oVar = (o) ((d) obj).data;
        if (oVar != null && !TextUtils.isEmpty(oVar.f7947i)) {
            aVar.f7549b = oVar.f7947i;
            c.a.a("ttlive_fetch_room_info_all").b("pc_broadcast").a("addtional_prompt", aVar.f7549b).a();
            if (!aVar.isShowing()) {
                aVar.a();
            }
        }
    }
}
