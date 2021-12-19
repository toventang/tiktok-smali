package com.ss.android.ugc.aweme.net.i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.zstd.c;
import com.bytedance.ies.ugc.network.partner.a;
import com.bytedance.ies.ugc.network.partner.b;
import com.bytedance.ies.ugc.network.partner.b.f;
import com.bytedance.ies.ugc.network.partner.b.g;
import com.bytedance.retrofit2.s;
import com.ss.android.ugc.aweme.base.o;
import h.f.b.l;

public final class m implements b.d, b.e, b.f {

    /* renamed from: a  reason: collision with root package name */
    public static final m f112382a = new m();

    private m() {
    }

    @Override // com.bytedance.ies.ugc.network.partner.b
    public final String a() {
        return b.c.a(this);
    }

    static {
        Covode.recordClassIndex(72222);
    }

    private Object a(a aVar) {
        l.d(aVar, "");
        return b.e.a.a(this, aVar);
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.e
    public final void a(f fVar, a aVar) {
        l.d(fVar, "");
        l.d(aVar, "");
        String b2 = c.f35049a.b(fVar.f35269b.f35297e.a());
        if (b2 != null) {
            l.d(aVar, "");
            l.d(aVar, "");
            b.c.a(this, aVar, b2);
            fVar.f35270c.b("accept-encoding", "gzip, deflate, br, ttzip");
            if (!TextUtils.isEmpty(b2)) {
                fVar.f35270c.b("ttzip-version", b2);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.f
    public final void a(g<?> gVar, a aVar) {
        s sVar;
        l.d(gVar, "");
        l.d(aVar, "");
        Object a2 = a(aVar);
        if (!(a2 instanceof String)) {
            a2 = null;
        }
        String str = (String) a2;
        if (str != null && (sVar = aVar.f35246b) != null) {
            com.bytedance.ies.ugc.network.partner.b.b bVar = gVar.f35285d;
            o.a("zstd_api_all", new com.ss.android.ugc.aweme.app.f.c().a("path", gVar.f35282a.f35297e.a()).a("logid", bVar.a("x-tt-logid")).a("request_ttzip_version", str).a("response_ttzip_version", bVar.a("ttzip-version")).a("stream_read_size", sVar.M.get("streamReadByteCount")).a("received_size", sVar.M.get("receivedByteCount")).a("stream_read_time", sVar.M.get("streamReadTime")).a("err_code", sVar.M.get("zstd_err_code")).a());
        }
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.d
    public final boolean a(f fVar, a aVar, Throwable th, boolean z) {
        s sVar;
        l.d(fVar, "");
        l.d(aVar, "");
        l.d(th, "");
        Object a2 = a(aVar);
        if (!(a2 instanceof String)) {
            a2 = null;
        }
        String str = (String) a2;
        if (str == null || (sVar = aVar.f35246b) == null) {
            return false;
        }
        com.bytedance.ies.ugc.network.partner.b.b bVar = fVar.f35270c;
        o.a("zstd_api_all", new com.ss.android.ugc.aweme.app.f.c().a("path", fVar.f35269b.f35297e.a()).a("logid", bVar.a("x-tt-logid")).a("request_ttzip_version", str).a("response_ttzip_version", bVar.a("ttzip-version")).a("stream_read_size", sVar.M.get("streamReadByteCount")).a("received_size", sVar.M.get("receivedByteCount")).a("stream_read_time", sVar.M.get("streamReadTime")).a("err_code", sVar.M.get("zstd_err_code")).a("err_msg", th.getMessage()).a());
        return false;
    }
}
