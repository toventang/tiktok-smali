package com.ss.android.ugc.aweme.im.sdk.common.data.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.f;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.g;
import com.ss.android.ugc.aweme.im.service.c.k;
import com.ss.android.ugc.aweme.im.service.j.b;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class c implements com.ss.android.ugc.aweme.im.service.j.b {
    static {
        Covode.recordClassIndex(65636);
    }

    static final class b extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ b.a $callback;

        static {
            Covode.recordClassIndex(65638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(b.a aVar) {
            super(1);
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.d(th, "");
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.j.b
    public final void a(b.a aVar) {
        com.ss.android.ugc.aweme.im.sdk.relations.data.core.a fVar;
        if (k.c()) {
            com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar = new com.ss.android.ugc.aweme.im.sdk.relations.data.b.c(2, false);
            cVar.f102982c = false;
            cVar.f102983d = true;
            cVar.f102984e = true;
            cVar.f102986g = true;
            fVar = new g(cVar);
        } else {
            com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar2 = new com.ss.android.ugc.aweme.im.sdk.relations.data.b.c(1, false);
            cVar2.f102982c = false;
            cVar2.f102983d = true;
            cVar2.f102984e = true;
            fVar = new f(cVar2);
        }
        a aVar2 = new a(aVar);
        b bVar = new b(aVar);
        a.h hVar = a.h.f103054a;
        a.i iVar = a.i.f103058a;
        l.d(aVar2, "");
        l.d(bVar, "");
        l.d(hVar, "");
        l.d(iVar, "");
        fVar.a(new a.j(aVar2, bVar, hVar, iVar)).g();
    }

    static final class a extends m implements h.f.a.m<List<IMContact>, Boolean, z> {
        final /* synthetic */ b.a $callback;
        final /* synthetic */ int $limit = 3;

        static {
            Covode.recordClassIndex(65637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b.a aVar) {
            super(2);
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(List<IMContact> list, Boolean bool) {
            String str;
            List<IMContact> list2 = list;
            bool.booleanValue();
            l.d(list2, "");
            User d2 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.d();
            if (d2 != null) {
                str = d2.getUid();
            } else {
                str = null;
            }
            int min = Math.min(list2.size(), this.$limit);
            b.a aVar = this.$callback;
            if (aVar != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : list2) {
                    if ((t instanceof IMUser) && (!l.a((Object) t.getUid(), (Object) str))) {
                        arrayList.add(t);
                    }
                    if (arrayList.size() >= min) {
                        break;
                    }
                }
                aVar.a(arrayList);
            }
            return z.f158842a;
        }
    }
}
