package com.bytedance.geckox.policy.loop;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.e;
import com.bytedance.geckox.e.i;
import com.bytedance.geckox.e.k;
import com.bytedance.geckox.g;
import com.bytedance.geckox.i.a;
import com.bytedance.geckox.policy.loop.c;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import com.bytedance.geckox.policy.loop.model.LoopRequestModel;
import com.bytedance.geckox.utils.o;
import com.bytedance.q.b.b;
import com.bytedance.q.h;
import java.util.List;
import java.util.Map;

public final class d implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public e f30001a;

    /* renamed from: b  reason: collision with root package name */
    public LoopInterval.a f30002b;

    static {
        Covode.recordClassIndex(17406);
    }

    @Override // com.bytedance.geckox.policy.loop.c.a
    public final void a(final Map<String, LoopRequestModel> map) {
        o.a().b().execute(new Runnable() {
            /* class com.bytedance.geckox.policy.loop.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17407);
            }

            public final void run() {
                try {
                    a.a("[loop]loop start checkUpdate");
                    e eVar = d.this.f30001a;
                    Map map = map;
                    LoopInterval.a aVar = d.this.f30002b;
                    a aVar2 = new a();
                    List<h> a2 = g.a();
                    h.a a3 = new h.a().a(i.class);
                    a3.f42381c = new Object[]{false};
                    a2.add(a3.a());
                    h.a a4 = new h.a().a(com.bytedance.geckox.e.e.class);
                    a4.f42381c = new Object[]{eVar, map, aVar, null, aVar2};
                    a4.f42380b = new b(com.bytedance.geckox.f.b.a(com.bytedance.geckox.e.e.class));
                    a2.add(a4.a());
                    a2.add(new h.a().a(com.bytedance.geckox.e.h.class).a());
                    a2.add(new h.a().a(k.class).a());
                    a2.addAll(g.b(eVar, null));
                    com.bytedance.q.b a5 = com.bytedance.q.c.a(a2);
                    a5.a("req_type", 3);
                    a5.a((Object) null);
                    a.a("[loop] checkUpdate success");
                } catch (Exception unused) {
                    a.a();
                }
            }
        });
    }

    public d(e eVar, LoopInterval.a aVar) {
        this.f30001a = eVar;
        this.f30002b = aVar;
    }
}
