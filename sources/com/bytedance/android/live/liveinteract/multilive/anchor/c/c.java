package com.bytedance.android.live.liveinteract.multilive.anchor.c;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multilive.anchor.c.e;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import h.f.b.l;
import h.p;
import h.v;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class c extends com.bytedance.android.live.liveinteract.platform.common.e.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f11604b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Integer> f11605a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final e.a f11606d;

    static {
        Covode.recordClassIndex(6302);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6303);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public c(e.a aVar) {
        l.d(aVar, "");
        this.f11606d = aVar;
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
        this.f11605a.clear();
        boolean z = false;
        for (Region region : list) {
            region.size(0.0d, 0.0d);
            e.a aVar = this.f11606d;
            String interactId = region.getInteractId();
            l.b(interactId, "");
            boolean h2 = aVar.h(interactId);
            e.a aVar2 = this.f11606d;
            String interactId2 = region.getInteractId();
            l.b(interactId2, "");
            boolean i4 = aVar2.i(interactId2);
            int i5 = 1;
            if (TextUtils.equals(region.getInteractId(), str)) {
                region.size(0.4965469613259669d, 0.42971147943523635d).position(0.0d, 0.06837016574585635d).userId(c2).mediaType(1).muteAudio(i4).muteVideo(false).status(0);
                z = h2;
            } else {
                e.a aVar3 = this.f11606d;
                String interactId3 = region.getInteractId();
                l.b(interactId3, "");
                int j2 = aVar3.j(interactId3);
                Map<String, Integer> map = this.f11605a;
                String interactId4 = region.getInteractId();
                l.b(interactId4, "");
                map.put(interactId4, Integer.valueOf(j2));
                double d2 = 0.5019183548189073d;
                double d3 = 0.5034530386740331d;
                if (j2 == 1) {
                    d2 = 0.06837016574585635d;
                } else if (j2 == 2) {
                    d3 = 0.0d;
                } else if (j2 != 3) {
                    d2 = 1.0d;
                    d3 = 1.0d;
                }
                p a3 = v.a(Double.valueOf(d3), Double.valueOf(d2));
                Region position = region.size(0.4965469613259669d, 0.42971147943523635d).position(((Number) a3.getFirst()).doubleValue(), ((Number) a3.getSecond()).doubleValue());
                if (h2) {
                    i5 = 2;
                }
                Region muteVideo = position.mediaType(i5).muteAudio(i4).muteVideo(h2);
                e.a aVar4 = this.f11606d;
                String interactId5 = region.getInteractId();
                l.b(interactId5, "");
                muteVideo.userId(aVar4.g(interactId5));
            }
        }
        LiveCore.InteractConfig interactConfig = this.f11918c;
        l.b(interactConfig, "");
        interactConfig.setSeiVersion(14);
        JSONObject a4 = com.bytedance.android.live.liveinteract.platform.common.d.a.a(this.f11918c, list, i2, i3, this.f11605a, z);
        if (a4 == null || (jSONObject = a4.toString()) == null) {
            return "";
        }
        return jSONObject;
    }
}
