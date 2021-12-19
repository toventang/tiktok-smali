package com.ss.android.ugc.aweme.choosemusic.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.choosemusic.utils.c;
import com.ss.android.ugc.aweme.music.d.a;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class m implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f70673a;

    /* renamed from: b  reason: collision with root package name */
    private final o f70674b;

    static {
        Covode.recordClassIndex(43573);
    }

    public m(b bVar, o oVar) {
        this.f70673a = bVar;
        this.f70674b = oVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        b bVar = this.f70673a;
        o oVar = this.f70674b;
        bVar.f70642c = false;
        if (iVar.b()) {
            return null;
        }
        long a2 = oVar.a(TimeUnit.MILLISECONDS);
        if (iVar.c()) {
            bVar.f70641b.a("collection_feed_status", (Object) 1);
            bVar.f70644e.onEventV3("tool_performance_api", new d().a("api_type", "music_list").a("duration", a2).a("scene", "discover").a("status", 1).a("error_domain", a.f111394a).a("error_code", iVar.e().getMessage()).f66730a);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            af afVar = (af) iVar.d();
            bVar.f70641b.a("collection_feed_cursor", Integer.valueOf(afVar.f70614b));
            bVar.f70641b.a("collection_feed_has_more", Integer.valueOf(afVar.f70615c));
            List list = (List) bVar.f70641b.a("list");
            if (list == null) {
                bVar.f70641b.a("collection_feed_status", (Object) 1);
                return null;
            }
            for (ae aeVar : ((af) iVar.d()).f70613a) {
                list.add(new ad(c.a(aeVar.f70612b), aeVar.f70611a, 2));
            }
            bVar.f70641b.a("list", list);
            bVar.f70641b.a("collection_feed_status", (Object) 0);
            bVar.f70644e.onEventV3("tool_performance_api", new d().a("api_type", "music_list").a("duration", a2).a("scene", "discover").a("status", 0).f66730a);
            return null;
        }
    }
}
