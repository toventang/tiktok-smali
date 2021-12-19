package com.bytedance.ies.bullet.c.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.c.f;
import com.bytedance.ies.bullet.service.base.a.c;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.f.a.b.q;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.List;
import org.json.JSONObject;

public interface i extends j {
    static {
        Covode.recordClassIndex(18772);
    }

    z a();

    <T extends q> T a(Class<T> cls);

    void a(Uri uri, b<? super Uri, z> bVar, b<? super Throwable, z> bVar2);

    void a(String str, List<String> list, List<? extends JSONObject> list2);

    void a(Throwable th);

    void a(List<String> list, f fVar);

    <T extends c> T b(Class<T> cls);

    com.bytedance.ies.bullet.service.f.a.b.b b();

    com.bytedance.ies.bullet.c.e.a.b c();

    List<String> d();

    Uri e();

    boolean h();

    void i();

    void j();

    void k();

    void l();

    q o_();

    void onEvent(p pVar);

    Uri p_();

    public static final class a {
        static {
            Covode.recordClassIndex(18773);
        }

        public static void a(i iVar, String str, com.bytedance.ies.bullet.service.base.a.p pVar, String str2) {
            l.c(str, "");
            l.c(pVar, "");
            l.c(str2, "");
            j.b.a(iVar, str, pVar, str2);
        }

        public static void a(i iVar, Throwable th, String str) {
            l.c(th, "");
            l.c(str, "");
            j.b.a(iVar, th, str);
        }

        public static void a(i iVar) {
            com.bytedance.ies.bullet.c.f.a aVar = (com.bytedance.ies.bullet.c.f.a) iVar.c().c(com.bytedance.ies.bullet.c.f.a.class);
            if (aVar != null && iVar.p_() != null && iVar.o_() != null) {
                Uri p_ = iVar.p_();
                if (p_ == null) {
                    l.a();
                }
                q o_ = iVar.o_();
                if (o_ == null) {
                    l.a();
                }
                aVar.a(iVar, p_, o_);
            }
        }
    }
}
