package com.ss.android.ugc.aweme.kids.choosemusic.e;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.kids.choosemusic.g.d;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f105602a;

    /* renamed from: b  reason: collision with root package name */
    private final o f105603b;

    static {
        Covode.recordClassIndex(67646);
    }

    public c(a aVar, o oVar) {
        this.f105602a = aVar;
        this.f105603b = oVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        a aVar = this.f105602a;
        o oVar = this.f105603b;
        aVar.f105591c = false;
        if (iVar.b()) {
            return null;
        }
        oVar.a(TimeUnit.MILLISECONDS);
        if (iVar.c()) {
            aVar.f105590b.a("collection_feed_status", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            p pVar = (p) iVar.d();
            aVar.f105590b.a("collection_feed_cursor", Integer.valueOf(pVar.f105626b));
            aVar.f105590b.a("collection_feed_has_more", Integer.valueOf(pVar.f105627c));
            List list = (List) aVar.f105590b.a("list");
            if (list == null) {
                aVar.f105590b.a("collection_feed_status", (Object) 1);
                return null;
            }
            for (o oVar2 : ((p) iVar.d()).f105625a) {
                list.add(new n(d.a(oVar2.f105624b), oVar2.f105623a, 2));
            }
            aVar.f105590b.a("list", list);
            aVar.f105590b.a("collection_feed_status", (Object) 0);
            return null;
        }
    }
}
