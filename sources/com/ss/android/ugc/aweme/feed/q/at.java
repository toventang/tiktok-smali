package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.video.i;
import f.a.d.f;
import org.json.JSONObject;

final /* synthetic */ class at implements f {

    /* renamed from: a  reason: collision with root package name */
    private final as f93772a;

    static {
        Covode.recordClassIndex(59661);
    }

    at(as asVar) {
        this.f93772a = asVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        al alVar = this.f93772a.f93769a.get();
        if (alVar != null) {
            i aN = alVar.aN();
            if (aN.o()) {
                a.b(6, "PlayerManagerMonitor", "panel:" + alVar + ",player:" + aN + ". is playing! should not be like this!");
                com.ss.android.ugc.aweme.f.a.a.a();
                b.a("aweme_player_monitor", new JSONObject());
            }
        }
    }
}
