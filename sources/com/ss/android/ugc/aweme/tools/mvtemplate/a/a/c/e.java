package com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.d;
import f.a.d.f;
import h.f.b.l;
import java.util.Collection;
import java.util.List;

public final class e extends com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f140688d = new a((byte) 0);

    static {
        Covode.recordClassIndex(91872);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91873);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f140689a;

        static {
            Covode.recordClassIndex(91874);
        }

        b(e eVar) {
            this.f140689a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
                long a2 = this.f140689a.f140641b.a("fetch hot music", "failed.");
                d dVar = this.f140689a.f140642c.f140677f;
                if (dVar != null) {
                    dVar.f140736e = (int) a2;
                }
                d dVar2 = this.f140689a.f140642c.f140677f;
                if (dVar2 != null) {
                    dVar2.f140743l = "hotmusic list null";
                }
                d dVar3 = this.f140689a.f140642c.f140677f;
                if (dVar3 != null) {
                    dVar3.f140742k = 5;
                }
                com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b bVar = this.f140689a.f140642c.f140680i;
                if (bVar != null) {
                    bVar.a();
                    return;
                }
                return;
            }
            long a3 = this.f140689a.f140641b.a("fetch hot music", "success");
            d dVar4 = this.f140689a.f140642c.f140677f;
            if (dVar4 != null) {
                dVar4.f140736e = (int) a3;
            }
            d dVar5 = this.f140689a.f140642c.f140677f;
            if (dVar5 != null) {
                dVar5.f140737f = list.size();
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e eVar = this.f140689a.f140640a;
            if (eVar != null) {
                l.b(list, "");
                eVar.a(list.get(0));
            }
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f140690a;

        static {
            Covode.recordClassIndex(91875);
        }

        c(e eVar) {
            this.f140690a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            long a2 = this.f140690a.f140641b.a("fetch hot music", "failed.");
            d dVar = this.f140690a.f140642c.f140677f;
            if (dVar != null) {
                dVar.f140736e = (int) a2;
            }
            d dVar2 = this.f140690a.f140642c.f140677f;
            if (dVar2 != null) {
                dVar2.f140743l = th.getMessage();
            }
            d dVar3 = this.f140690a.f140642c.f140677f;
            if (dVar3 != null) {
                dVar3.f140742k = 5;
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b bVar = this.f140690a.f140642c.f140680i;
            if (bVar != null) {
                bVar.a();
            }
            com.ss.android.ugc.aweme.df.e.a("Get Hot Music Failed. Reason:" + th.getMessage());
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e
    public final void a(Object obj) {
        if (this.f140642c.f140673b != null) {
            com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e eVar = this.f140640a;
            if (eVar != null) {
                eVar.a(this.f140642c.f140673b);
                return;
            }
            return;
        }
        this.f140641b.f140703a = System.currentTimeMillis();
        d dVar = this.f140642c.f140677f;
        if (dVar != null) {
            dVar.f140732a = 3;
        }
        aa aaVar = (aa) g.a().s();
        if (aaVar == null) {
            long a2 = this.f140641b.a("fetch hot music", "failed.");
            d dVar2 = this.f140642c.f140677f;
            if (dVar2 != null) {
                dVar2.f140736e = (int) a2;
            }
            d dVar3 = this.f140642c.f140677f;
            if (dVar3 != null) {
                dVar3.f140743l = "musicService null";
            }
            d dVar4 = this.f140642c.f140677f;
            if (dVar4 != null) {
                dVar4.f140742k = 5;
            }
            com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b bVar = this.f140642c.f140680i;
            if (bVar != null) {
                bVar.a();
                return;
            }
            return;
        }
        aaVar.k().a(5).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), new c(this));
    }
}
