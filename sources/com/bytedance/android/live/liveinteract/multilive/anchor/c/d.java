package com.bytedance.android.live.liveinteract.multilive.anchor.c;

import com.bytedance.android.live.liveinteract.multilive.anchor.c.e;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class d extends com.bytedance.android.live.liveinteract.platform.common.e.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f11607b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Integer> f11608a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final e.a f11609d;

    static {
        Covode.recordClassIndex(6304);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6305);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public d(e.a aVar) {
        l.d(aVar, "");
        this.f11609d = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ss.avframework.livestreamv2.core.interact.model.Region a(int r18, com.ss.avframework.livestreamv2.core.interact.model.Region r19) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.anchor.c.d.a(int, com.ss.avframework.livestreamv2.core.interact.model.Region):com.ss.avframework.livestreamv2.core.interact.model.Region");
    }

    @Override // com.ss.avframework.livestreamv2.core.Client.StreamMixer
    public final String mixStream(int i2, int i3, List<? extends Region> list) {
        String jSONObject;
        l.d(list, "");
        f b2 = u.a().b();
        l.b(b2, "");
        long c2 = b2.c();
        this.f11608a.clear();
        for (Region region : list) {
            region.size(0.0d, 0.0d);
        }
        int size = list.size();
        if (size == 1) {
            a(0, (Region) list.get(0)).userId(c2).mediaType(1).status(0);
        } else if (size == 2) {
            a(5, (Region) list.get(0)).userId(c2).mediaType(1).status(0);
            a(6, (Region) list.get(1));
        } else if (size != 3) {
            a(1, (Region) list.get(0)).userId(c2).mediaType(1).status(0);
            a(2, (Region) list.get(1));
            a(3, (Region) list.get(2));
            a(4, (Region) list.get(3));
        } else {
            a(5, (Region) list.get(0)).userId(c2).mediaType(1).status(0);
            a(3, (Region) list.get(1));
            a(4, (Region) list.get(2));
        }
        LiveCore.InteractConfig interactConfig = this.f11918c;
        l.b(interactConfig, "");
        interactConfig.setSeiVersion(13);
        e.a aVar = this.f11609d;
        String interactId = ((Region) list.get(0)).getInteractId();
        l.b(interactId, "");
        JSONObject a2 = com.bytedance.android.live.liveinteract.platform.common.d.a.a(this.f11918c, list, i2, i3, this.f11608a, aVar.h(interactId));
        if (a2 == null || (jSONObject = a2.toString()) == null) {
            return "";
        }
        return jSONObject;
    }
}
