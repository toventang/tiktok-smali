package com.bytedance.android.live.liveinteract.multilive.anchor.c;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multilive.anchor.c.e;
import com.bytedance.android.live.liveinteract.platform.common.e.a;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class g extends a {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Integer> f11615a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final e.a f11616b;

    static {
        Covode.recordClassIndex(6310);
    }

    public g(e.a aVar) {
        l.d(aVar, "");
        this.f11616b = aVar;
    }

    @Override // com.ss.avframework.livestreamv2.core.Client.StreamMixer
    public final String mixStream(int i2, int i3, List<? extends Region> list) {
        String jSONObject;
        l.d(list, "");
        d a2 = d.a();
        l.b(a2, "");
        String str = a2.f14185f;
        f b2 = u.a().b();
        l.b(b2, "");
        long c2 = b2.c();
        this.f11615a.clear();
        boolean z = false;
        for (Region region : list) {
            if (TextUtils.equals(region.getInteractId(), str)) {
                e.a aVar = this.f11616b;
                String interactId = region.getInteractId();
                l.b(interactId, "");
                z = aVar.h(interactId);
                region.size(1.0d, 1.0d).position(0.0d, 0.0d).userId(c2).mediaType(1).status(0);
            }
        }
        LiveCore.InteractConfig interactConfig = this.f11918c;
        l.b(interactConfig, "");
        interactConfig.setSeiVersion(15);
        JSONObject a3 = com.bytedance.android.live.liveinteract.platform.common.d.a.a(this.f11918c, list, i2, i3, this.f11615a, z);
        if (a3 == null || (jSONObject = a3.toString()) == null) {
            return "";
        }
        return jSONObject;
    }
}
