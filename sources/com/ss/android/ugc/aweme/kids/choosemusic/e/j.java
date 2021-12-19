package com.ss.android.ugc.aweme.kids.choosemusic.e;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.kids.a.e.e;
import com.ss.android.ugc.aweme.kids.choosemusic.g.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f105614a;

    /* renamed from: b  reason: collision with root package name */
    private final int f105615b;

    static {
        Covode.recordClassIndex(67653);
    }

    j(a aVar, int i2) {
        this.f105614a = aVar;
        this.f105615b = i2;
    }

    @Override // b.g
    public final Object then(i iVar) {
        a aVar = this.f105614a;
        int i2 = this.f105615b;
        if (iVar.c()) {
            aVar.f105590b.a("status_second_level_music_list", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            aVar.f105590b.a("status_second_level_music_list", (Object) 0);
            e eVar = (e) iVar.d();
            b bVar = new b();
            bVar.a("list_cursor", Integer.valueOf(eVar.a())).a("list_hasmore", Integer.valueOf(eVar.f105318e)).a("action_type", 1).a("list_level", Integer.valueOf(i2)).a("list_collection_data", eVar.f105321h).a("list_data", d.a(eVar.f105314a));
            aVar.f105590b.a("second_level_music_list", bVar);
            return null;
        }
    }
}
