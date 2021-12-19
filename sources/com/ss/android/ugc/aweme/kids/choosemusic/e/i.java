package com.ss.android.ugc.aweme.kids.choosemusic.e;

import b.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.kids.a.e.e;
import com.ss.android.ugc.aweme.kids.choosemusic.g.d;
import java.util.List;

public final /* synthetic */ class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f105613a;

    static {
        Covode.recordClassIndex(67652);
    }

    public i(a aVar) {
        this.f105613a = aVar;
    }

    @Override // b.g
    public final Object then(b.i iVar) {
        a aVar = this.f105613a;
        aVar.f105593e = false;
        if (iVar.c()) {
            aVar.f105590b.a("loadmore_status_music_list", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            aVar.f105590b.a("loadmore_status_music_list", (Object) 0);
            e eVar = (e) iVar.d();
            List list = (List) ((b) aVar.f105590b.a("music_list")).a("list_data");
            list.addAll(d.a(eVar.f105314a));
            b bVar = new b();
            bVar.a("list_cursor", Integer.valueOf(eVar.a())).a("list_hasmore", Integer.valueOf(eVar.f105318e)).a("action_type", 2).a("list_data", list);
            aVar.f105590b.a("music_list", bVar);
            return null;
        }
    }
}
