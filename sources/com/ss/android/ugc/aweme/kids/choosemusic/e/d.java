package com.ss.android.ugc.aweme.kids.choosemusic.e;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.kids.a.e.e;
import java.util.List;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f105604a;

    static {
        Covode.recordClassIndex(67647);
    }

    public d(a aVar) {
        this.f105604a = aVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        a aVar = this.f105604a;
        aVar.f105595g = false;
        if (iVar.c()) {
            aVar.f105590b.a("loadmore_status_hot_music_list", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            e eVar = (e) iVar.d();
            List list = (List) ((b) aVar.f105590b.a("hot_music_list_data")).a("list_data");
            list.addAll(com.ss.android.ugc.aweme.kids.choosemusic.g.d.a(eVar.f105314a));
            b bVar = new b();
            bVar.a("loadmore_status_hot_music_list", 0).a("list_cursor", Integer.valueOf(eVar.a())).a("list_hasmore", Integer.valueOf(eVar.f105318e)).a("action_type", 2).a("list_data", list);
            aVar.f105590b.a("hot_music_list_data", bVar);
            return null;
        }
    }
}
