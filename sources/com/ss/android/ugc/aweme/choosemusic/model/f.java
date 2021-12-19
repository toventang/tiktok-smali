package com.ss.android.ugc.aweme.choosemusic.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.choosemusic.utils.c;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import java.util.List;

public final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f70658a;

    static {
        Covode.recordClassIndex(43566);
    }

    public f(b bVar) {
        this.f70658a = bVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        b bVar = this.f70658a;
        bVar.f70646g = false;
        if (iVar.c()) {
            bVar.f70641b.a("loadmore_status_user_collected_music", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            CollectedMusicList collectedMusicList = (CollectedMusicList) iVar.d();
            List list = (List) ((b) bVar.f70641b.a("user_collected_music_list")).a("list_data");
            list.addAll(c.a(collectedMusicList.items));
            b bVar2 = new b();
            bVar2.a("loadmore_status_user_collected_music", 0).a("list_cursor", Integer.valueOf(collectedMusicList.cursor)).a("list_hasmore", Integer.valueOf(collectedMusicList.hasMore)).a("action_type", 2).a("list_data", list);
            bVar.f70641b.a("user_collected_music_list", bVar2);
            return null;
        }
    }
}
