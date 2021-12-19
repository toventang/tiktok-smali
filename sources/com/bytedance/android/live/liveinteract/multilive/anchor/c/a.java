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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a extends com.bytedance.android.live.liveinteract.platform.common.e.a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0234a f11598b = new C0234a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Integer> f11599a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final e.a f11600d;

    static {
        Covode.recordClassIndex(6298);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.c.a$a  reason: collision with other inner class name */
    public static final class C0234a {
        static {
            Covode.recordClassIndex(6299);
        }

        private C0234a() {
        }

        public /* synthetic */ C0234a(byte b2) {
            this();
        }
    }

    public a(e.a aVar) {
        l.d(aVar, "");
        this.f11600d = aVar;
    }

    @Override // com.ss.avframework.livestreamv2.core.Client.StreamMixer
    public final String mixStream(int i2, int i3, List<? extends Region> list) {
        String jSONObject;
        double d2;
        double d3;
        int i4;
        l.d(list, "");
        d a2 = d.a();
        l.b(a2, "");
        String str = a2.f14185f;
        f b2 = u.a().b();
        l.b(b2, "");
        long c2 = b2.c();
        this.f11599a.clear();
        boolean z = false;
        for (Region region : list) {
            region.size(0.0d, 0.0d);
            e.a aVar = this.f11600d;
            String interactId = region.getInteractId();
            l.b(interactId, "");
            boolean h2 = aVar.h(interactId);
            e.a aVar2 = this.f11600d;
            String interactId2 = region.getInteractId();
            l.b(interactId2, "");
            boolean i5 = aVar2.i(interactId2);
            if (TextUtils.equals(region.getInteractId(), str)) {
                region.size(0.7535465256071171d, 0.7560780122896072d).position(0.0d, 0.24392198771039275d).userId(c2).mediaType(1).muteAudio(i5).muteVideo(false).status(0);
                z = h2;
            } else {
                e.a aVar3 = this.f11600d;
                String interactId3 = region.getInteractId();
                l.b(interactId3, "");
                int j2 = aVar3.j(interactId3);
                if (j2 >= 0) {
                    Map<String, Integer> map = this.f11599a;
                    String interactId4 = region.getInteractId();
                    l.b(interactId4, "");
                    map.put(interactId4, Integer.valueOf(j2));
                    Region size = region.size(0.24044241404183697d, 0.2497996259684745d);
                    if (j2 != 1) {
                        if (j2 == 2) {
                            d2 = 0.49706118087095913d;
                        } else if (j2 != 3) {
                            d3 = 0.759557585958163d;
                            d2 = 0.0d;
                        } else {
                            d2 = 0.7502003740315255d;
                        }
                        d3 = 0.759557585958163d;
                    } else {
                        d2 = 0.24392198771039272d;
                        d3 = 0.759557585958163d;
                    }
                    Region position = size.position(d3, d2);
                    if (!h2) {
                        i4 = 1;
                    } else {
                        i4 = 2;
                    }
                    Region muteVideo = position.mediaType(i4).muteAudio(i5).muteVideo(h2);
                    e.a aVar4 = this.f11600d;
                    String interactId5 = region.getInteractId();
                    l.b(interactId5, "");
                    muteVideo.userId(aVar4.g(interactId5));
                }
            }
        }
        LiveCore.InteractConfig interactConfig = this.f11918c;
        l.b(interactConfig, "");
        interactConfig.setSeiVersion(12);
        JSONObject a3 = com.bytedance.android.live.liveinteract.platform.common.d.a.a(this.f11918c, list, i2, i3, this.f11599a, z);
        if (a3 == null || (jSONObject = a3.toString()) == null) {
            return "";
        }
        return jSONObject;
    }
}
