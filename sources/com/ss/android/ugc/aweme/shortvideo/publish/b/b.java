package com.ss.android.ugc.aweme.shortvideo.publish.b;

import androidx.core.d.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.bl;
import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.aweme.utils.gr;
import h.f.b.l;

final /* synthetic */ class b implements a.AbstractC0029a {

    /* renamed from: a  reason: collision with root package name */
    private final a f129766a;

    static {
        Covode.recordClassIndex(85182);
    }

    b(a aVar) {
        this.f129766a = aVar;
    }

    @Override // androidx.core.d.a.AbstractC0029a
    public final void a() {
        a aVar = this.f129766a;
        if (aVar.f128567c == 1 && aVar.e()) {
            com.bytedance.apm.b.a("aweme_movie_publish_error_rate_parallel", -39993, bl.b(aVar.r).a("is_hd_video", Integer.valueOf(aVar.q ? 1 : 0)).a());
            d.a("parallel_publish_result", bl.a(aVar.r).a("status", -39993).a("retry_publish", aVar.f128569e ? "1" : "0").a("shoot_way", aVar.f129743i).a("publish_id", aVar.f128568d).f149193a);
            String str = aVar.f128568d;
            l.d(str, "");
            gr.a(str, BehaviorType.CANCEL, "WT", "-39993", null, 16);
        }
    }
}
