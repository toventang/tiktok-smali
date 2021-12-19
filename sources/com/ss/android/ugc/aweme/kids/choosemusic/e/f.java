package com.ss.android.ugc.aweme.kids.choosemusic.e;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.a.e.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f105610a;

    static {
        Covode.recordClassIndex(67649);
    }

    f(a aVar) {
        this.f105610a = aVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        a aVar = this.f105610a;
        if (iVar.c()) {
            aVar.f105590b.a("refresh_status_music_sheet", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            aVar.f105590b.a("refresh_status_music_sheet", (Object) 0);
            b bVar = (b) iVar.d();
            com.ss.android.ugc.aweme.arch.b bVar2 = new com.ss.android.ugc.aweme.arch.b();
            bVar2.a("list_cursor", Long.valueOf(bVar.f105305a)).a("list_hasmore", Boolean.valueOf(bVar.f105306b)).a("action_type", 1).a("list_data", bVar.a());
            aVar.f105590b.a("music_sheet_list", bVar2);
            return null;
        }
    }
}
