package com.ss.android.ugc.aweme.net.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.network.partner.b;
import com.bytedance.ies.ugc.network.partner.b.e;
import com.bytedance.ies.ugc.network.partner.b.f;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.net.f.h;
import h.m.p;
import java.util.regex.Pattern;

public final class l implements b.e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f112381a = new a((byte) 0);

    static {
        Covode.recordClassIndex(72220);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72221);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.ugc.network.partner.b
    public final String a() {
        return b.c.a(this);
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.e
    public final void a(f fVar, com.bytedance.ies.ugc.network.partner.a aVar) {
        String str;
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(aVar, "");
        if (SettingsManager.a().a("debug_replace_http_to_https", true)) {
            SharePrefCache inst = SharePrefCache.inst();
            h.f.b.l.b(inst, "");
            aj<Boolean> useHttps = inst.getUseHttps();
            h.f.b.l.b(useHttps, "");
            Boolean c2 = useHttps.c();
            h.f.b.l.b(c2, "");
            if (c2.booleanValue() && !h.f.b.l.a((Object) "vas_ad_track", (Object) fVar.f35277j)) {
                fVar.f35269b.f35293a = "https";
            }
            String a2 = fVar.f35269b.f35297e.a();
            e eVar = fVar.f35269b.f35298f;
            if (p.a((CharSequence) a2, (CharSequence) "/passport/auth/login/", false) || p.a((CharSequence) a2, (CharSequence) "/passport/auth/login_only/", false)) {
                String a3 = eVar.a("access_token");
                if (a3 != null && !p.a((CharSequence) a3)) {
                    String replaceAll = Pattern.compile(" ").matcher(a3).replaceAll("+");
                    h.f.b.l.b(replaceAll, "");
                    eVar.a("access_token", replaceAll);
                }
            } else if (p.a((CharSequence) a2, (CharSequence) "/service/settings/v2/", false) || p.a((CharSequence) a2, (CharSequence) "/service/settings/v3/", false)) {
                fVar.f35269b.b(d.f34604k.f34586a);
            } else {
                if (p.a((CharSequence) a2, (CharSequence) "push/get_service_addrs", false)) {
                    fVar.f35269b.b(d.f34604k.f34586a);
                }
                if (p.a((CharSequence) a2, (CharSequence) "/service/settings/v2", false)) {
                    if (h.a()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    eVar.b("googleServiceEnable", str);
                }
            }
        }
    }
}
