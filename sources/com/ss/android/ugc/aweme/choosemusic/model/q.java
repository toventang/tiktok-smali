package com.ss.android.ugc.aweme.choosemusic.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.choosemusic.utils.c;
import com.ss.android.ugc.aweme.music.model.MusicList;
import java.util.List;

public final /* synthetic */ class q implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f70678a;

    static {
        Covode.recordClassIndex(43577);
    }

    public q(b bVar) {
        this.f70678a = bVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        b bVar = this.f70678a;
        bVar.f70645f = false;
        if (iVar.c()) {
            bVar.f70641b.a("loadmore_status_music_list", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            bVar.f70641b.a("loadmore_status_music_list", (Object) 0);
            MusicList musicList = (MusicList) iVar.d();
            List list = (List) ((b) bVar.f70641b.a("music_list")).a("list_data");
            list.addAll(c.a(musicList.items));
            b bVar2 = new b();
            bVar2.a("list_cursor", Integer.valueOf(musicList.getCursor())).a("list_hasmore", Integer.valueOf(musicList.hasMore)).a("action_type", 2).a("list_data", list);
            bVar.f70641b.a("music_list", bVar2);
            return null;
        }
    }
}
