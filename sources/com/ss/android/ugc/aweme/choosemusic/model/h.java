package com.ss.android.ugc.aweme.choosemusic.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.choosemusic.utils.c;
import com.ss.android.ugc.aweme.music.model.MusicList;
import java.util.List;

public final /* synthetic */ class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f70660a;

    static {
        Covode.recordClassIndex(43568);
    }

    public h(b bVar) {
        this.f70660a = bVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        b bVar = this.f70660a;
        bVar.f70647h = false;
        if (iVar.c()) {
            bVar.f70641b.a("loadmore_status_hot_music_list", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            MusicList musicList = (MusicList) iVar.d();
            List list = (List) ((b) bVar.f70641b.a("hot_music_list_data")).a("list_data");
            list.addAll(c.a(musicList.items));
            b bVar2 = new b();
            bVar2.a("loadmore_status_hot_music_list", 0).a("list_cursor", Integer.valueOf(musicList.getCursor())).a("list_hasmore", Integer.valueOf(musicList.hasMore)).a("action_type", 2).a("list_data", list);
            bVar.f70641b.a("hot_music_list_data", bVar2);
            return null;
        }
    }
}
