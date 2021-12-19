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

public final class b extends com.bytedance.android.live.liveinteract.platform.common.e.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f11601b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Integer> f11602a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final e.a f11603d;

    static {
        Covode.recordClassIndex(6300);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6301);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b(e.a aVar) {
        l.d(aVar, "");
        this.f11603d = aVar;
    }

    @Override // com.ss.avframework.livestreamv2.core.Client.StreamMixer
    public final String mixStream(int i2, int i3, List<? extends Region> list) {
        String jSONObject;
        double d2;
        l.d(list, "");
        d a2 = d.a();
        l.b(a2, "");
        String str = a2.f14185f;
        f b2 = u.a().b();
        l.b(b2, "");
        long c2 = b2.c();
        this.f11602a.clear();
        boolean z = false;
        for (Region region : list) {
            region.size(0.0d, 0.0d);
            e.a aVar = this.f11603d;
            String interactId = region.getInteractId();
            l.b(interactId, "");
            boolean h2 = aVar.h(interactId);
            e.a aVar2 = this.f11603d;
            String interactId2 = region.getInteractId();
            l.b(interactId2, "");
            boolean i4 = aVar2.i(interactId2);
            int i5 = 1;
            if (TextUtils.equals(region.getInteractId(), str)) {
                region.size(1.0d, 1.0d).position(0.0d, 0.0d).userId(c2).mediaType(1).muteAudio(i4).muteVideo(false).status(0);
                z = h2;
            } else {
                e.a aVar3 = this.f11603d;
                String interactId3 = region.getInteractId();
                l.b(interactId3, "");
                int k2 = aVar3.k(interactId3);
                if (k2 >= 0) {
                    Map<String, Integer> map = this.f11602a;
                    String interactId4 = region.getInteractId();
                    l.b(interactId4, "");
                    map.put(interactId4, Integer.valueOf(k2));
                    double d3 = 0.7162491686987364d;
                    if (k2 == 1) {
                        d2 = 0.7068965517241379d;
                    } else if (k2 == 2) {
                        d2 = 0.5073891625615763d;
                    } else if (k2 != 3) {
                        d2 = 1.0d;
                        d3 = 1.0d;
                    } else {
                        d2 = 0.30788177339901485d;
                    }
                    p a3 = v.a(Double.valueOf(d3), Double.valueOf(d2));
                    Region position = region.size(0.2660164043449346d, 0.1921182266009852d).position(((Number) a3.getFirst()).doubleValue(), ((Number) a3.getSecond()).doubleValue());
                    if (h2) {
                        i5 = 2;
                    }
                    Region muteVideo = position.mediaType(i5).muteAudio(i4).muteVideo(h2);
                    e.a aVar4 = this.f11603d;
                    String interactId5 = region.getInteractId();
                    l.b(interactId5, "");
                    muteVideo.userId(aVar4.g(interactId5));
                }
            }
        }
        LiveCore.InteractConfig interactConfig = this.f11918c;
        l.b(interactConfig, "");
        interactConfig.setSeiVersion(11);
        JSONObject a4 = com.bytedance.android.live.liveinteract.platform.common.d.a.a(this.f11918c, list, i2, i3, this.f11602a, z);
        if (a4 == null || (jSONObject = a4.toString()) == null) {
            return "";
        }
        return jSONObject;
    }
}
