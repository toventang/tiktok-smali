package com.ss.android.ugc.aweme.app.e.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.client.c;
import com.bytedance.retrofit2.l;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.u;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66715a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(41067);
    }

    private static String a(b<TypedInput> bVar, u<TypedInput> uVar) {
        if (!(bVar == null || uVar == null || !(bVar instanceof l))) {
            ((l) bVar).doCollect();
            c cVar = uVar.f42629a;
            h.f.b.l.b(cVar, "");
            Object obj = cVar.f42478f;
            if (obj instanceof com.bytedance.ttnet.d.b) {
                return ((com.bytedance.ttnet.d.b) obj).y;
            }
        }
        return null;
    }

    public static final void a(String str, long j2, int i2, String str2, b<TypedInput> bVar, u<TypedInput> uVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        a(str, j2, i2, str2, bVar, uVar, null);
    }

    public static final void a(String str, long j2, int i2, String str2, String str3, String str4) {
        h.f.b.l.d(str, "");
        com.bytedance.apm.b.a("downloader_monitor", i2, new com.ss.android.ugc.aweme.app.f.c().a("duration", Long.valueOf(System.currentTimeMillis() - j2)).a("downloader_scene", str2).a("request_log", str3).a("error_msg", str4).a("network_client", str).a());
    }

    public static final void a(String str, long j2, int i2, String str2, b<TypedInput> bVar, u<TypedInput> uVar, String str3) {
        h.f.b.l.d(str, "");
        a(str, j2, i2, str2, a(bVar, uVar), str3);
    }
}
