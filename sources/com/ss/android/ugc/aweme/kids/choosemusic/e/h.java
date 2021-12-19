package com.ss.android.ugc.aweme.kids.choosemusic.e;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.kids.a.e.e;
import com.ss.android.ugc.aweme.kids.choosemusic.g.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f105612a;

    static {
        Covode.recordClassIndex(67651);
    }

    h(a aVar) {
        this.f105612a = aVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        a aVar = this.f105612a;
        aVar.f105593e = false;
        if (iVar.c()) {
            aVar.f105590b.a("refresh_status_music_list", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            aVar.f105590b.a("refresh_status_music_list", (Object) 0);
            e eVar = (e) iVar.d();
            b bVar = new b();
            bVar.a("list_cursor", Integer.valueOf(eVar.a())).a("list_hasmore", Integer.valueOf(eVar.f105318e)).a("action_type", 1).a("list_data", d.a(eVar.f105314a));
            aVar.f105590b.a("music_list", bVar);
            return null;
        }
    }
}
