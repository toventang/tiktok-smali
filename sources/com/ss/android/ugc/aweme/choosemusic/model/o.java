package com.ss.android.ugc.aweme.choosemusic.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import java.util.List;

public final /* synthetic */ class o implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f70676a;

    static {
        Covode.recordClassIndex(43575);
    }

    public o(b bVar) {
        this.f70676a = bVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        b bVar = this.f70676a;
        if (iVar.c()) {
            bVar.f70641b.a("loadmore_status_music_sheet", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            bVar.f70641b.a("loadmore_status_music_sheet", (Object) 0);
            MusicCollection musicCollection = (MusicCollection) iVar.d();
            List list = (List) ((b) bVar.f70641b.a("music_sheet_list")).a("list_data");
            list.addAll(musicCollection.getItems());
            b bVar2 = new b();
            bVar2.a("list_cursor", Long.valueOf(musicCollection.cursor)).a("list_hasmore", Boolean.valueOf(musicCollection.hasMore)).a("action_type", 2).a("list_data", list);
            bVar.f70641b.a("music_sheet_list", bVar2);
            return null;
        }
    }
}
