package com.ss.android.ugc.aweme.kids.choosemusic.e;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.a.e.b;
import java.util.List;

public final /* synthetic */ class g implements b.g {

    /* renamed from: a  reason: collision with root package name */
    private final a f105611a;

    static {
        Covode.recordClassIndex(67650);
    }

    public g(a aVar) {
        this.f105611a = aVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        a aVar = this.f105611a;
        if (iVar.c()) {
            aVar.f105590b.a("loadmore_status_music_sheet", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            aVar.f105590b.a("loadmore_status_music_sheet", (Object) 0);
            b bVar = (b) iVar.d();
            List list = (List) ((com.ss.android.ugc.aweme.arch.b) aVar.f105590b.a("music_sheet_list")).a("list_data");
            list.addAll(bVar.a());
            com.ss.android.ugc.aweme.arch.b bVar2 = new com.ss.android.ugc.aweme.arch.b();
            bVar2.a("list_cursor", Long.valueOf(bVar.f105305a)).a("list_hasmore", Boolean.valueOf(bVar.f105306b)).a("action_type", 2).a("list_data", list);
            aVar.f105590b.a("music_sheet_list", bVar2);
            return null;
        }
    }
}
