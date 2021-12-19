package com.bytedance.helios.sdk.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.g;
import com.bytedance.helios.api.b.n;
import com.bytedance.helios.api.config.ControlConfig;
import com.bytedance.helios.sdk.d.f;
import com.bytedance.helios.sdk.d.h;
import com.bytedance.helios.sdk.d.j;
import com.bytedance.helios.sdk.d.q;
import com.bytedance.helios.sdk.d.u;
import com.bytedance.helios.sdk.utils.c;
import h.f.b.ad;
import h.f.b.l;
import h.m.p;
import h.w;
import java.util.Set;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f30810a;

    static {
        Covode.recordClassIndex(17902);
    }

    public a(b bVar) {
        l.c(bVar, "");
        this.f30810a = bVar;
    }

    @Override // com.bytedance.helios.api.b.g
    public final void a(n nVar) {
        l.c(nVar, "");
        if (l.a((Object) nVar.p, (Object) "SensitiveApiException")) {
            this.f30810a.a(nVar);
        }
        Set<Object> set = nVar.y.f30655g;
        if (set != null) {
            Set<ControlConfig> f2 = ad.f(set);
            for (ControlConfig controlConfig : f2) {
                String warningType = controlConfig.getWarningType();
                if (warningType != null && !p.a((CharSequence) warningType)) {
                    Set<String> set2 = nVar.u;
                    String warningType2 = controlConfig.getWarningType();
                    if (warningType2 == null) {
                        l.a();
                    }
                    set2.add(warningType2);
                }
                if (controlConfig.getUploadALog()) {
                    nVar.w = true;
                }
                if (controlConfig.getFilterEventExtraInfo()) {
                    nVar.x = true;
                }
            }
            if (!f2.isEmpty()) {
                nVar.n.put("hit_control_configs", c.a(f2));
            }
            if (nVar.u.contains("cross_region")) {
                nVar.n.put("location_timeline", com.bytedance.helios.sdk.e.c.a());
            }
            String str = nVar.f30672a;
            if (l.a((Object) str, (Object) j.f30895a)) {
                if (p.e((CharSequence) nVar.f30674c, (CharSequence) (j.f30896b + '2'))) {
                    nVar.k(j.f30896b + '2');
                } else {
                    nVar.k(j.f30896b);
                }
                com.bytedance.helios.api.b.a aVar = nVar.A;
                if (aVar != null && aVar.f30642a > 0) {
                    nVar.F.add("pair_not_close");
                }
            } else if (l.a((Object) str, (Object) f.f30878a) || l.a((Object) str, (Object) "nar")) {
                nVar.k(f.f30879b);
                com.bytedance.helios.api.b.a aVar2 = nVar.A;
                if (aVar2 != null && aVar2.f30642a > 0) {
                    nVar.F.add("pair_not_close");
                }
            } else if (l.a((Object) str, (Object) u.f30929a)) {
                nVar.k(u.f30930b);
            } else if (l.a((Object) str, (Object) q.f30917a)) {
                nVar.k(q.f30918b);
            } else if (l.a((Object) str, (Object) com.bytedance.helios.sdk.d.l.f30902a)) {
                nVar.k(com.bytedance.helios.sdk.d.l.f30903b);
            } else if (l.a((Object) str, (Object) h.f30884a)) {
                nVar.k(h.f30885b);
                nVar.F.add("service");
            }
            nVar.F.addAll(nVar.u);
            if (l.a((Object) nVar.C, (Object) "jsb")) {
                nVar.F.add("jsb");
            }
            if (p.b(nVar.p, "AppOpsException_", false)) {
                nVar.F.add("app_ops");
                String str2 = nVar.f30675d;
                switch (str2.hashCode()) {
                    case -1671423430:
                        if (!str2.equals("android:coarse_location")) {
                            return;
                        }
                        nVar.k(q.f30918b);
                        return;
                    case -1220541694:
                        if (!str2.equals("android:read_phone_state")) {
                            return;
                        }
                        nVar.k(u.f30930b);
                        return;
                    case -517868421:
                        if (!str2.equals("android:read_phone_numbers")) {
                            return;
                        }
                        nVar.k(u.f30930b);
                        return;
                    case -210165041:
                        if (!str2.equals("android:fine_location")) {
                            return;
                        }
                        nVar.k(q.f30918b);
                        return;
                    case 1191287187:
                        if (str2.equals("android:record_audio")) {
                            nVar.k(f.f30879b);
                            return;
                        }
                        return;
                    case 1528082064:
                        if (str2.equals("android:camera")) {
                            nVar.k(j.f30896b);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } else {
            throw new w("null cannot be cast to non-null type");
        }
    }
}
