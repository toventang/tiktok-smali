package com.ss.android.ugc.aweme.kids.choosemusic.e;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.kids.a.e.e;
import com.ss.android.ugc.aweme.kids.choosemusic.g.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f105619a;

    static {
        Covode.recordClassIndex(67656);
    }

    m(a aVar) {
        this.f105619a = aVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        a aVar = this.f105619a;
        aVar.f105595g = false;
        if (iVar.c()) {
            aVar.f105590b.a("refresh_status_hot_music_list", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            e eVar = (e) iVar.d();
            b bVar = new b();
            bVar.a("refresh_status_hot_music_list", 0).a("list_cursor", Integer.valueOf(eVar.a())).a("list_hasmore", Integer.valueOf(eVar.f105318e)).a("action_type", 1).a("list_data", d.a(eVar.f105314a));
            aVar.f105590b.a("hot_music_list_data", bVar);
            return null;
        }
    }
}
