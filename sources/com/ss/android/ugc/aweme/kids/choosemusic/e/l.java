package com.ss.android.ugc.aweme.kids.choosemusic.e;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.kids.choosemusic.g.d;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import java.util.List;

public final /* synthetic */ class l implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f105618a;

    static {
        Covode.recordClassIndex(67655);
    }

    public l(a aVar) {
        this.f105618a = aVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        a aVar = this.f105618a;
        aVar.f105594f = false;
        if (iVar.c()) {
            aVar.f105590b.a("loadmore_status_user_collected_music", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            CollectedMusicList collectedMusicList = (CollectedMusicList) iVar.d();
            List list = (List) ((b) aVar.f105590b.a("user_collected_music_list")).a("list_data");
            list.addAll(d.a(collectedMusicList.items));
            b bVar = new b();
            bVar.a("loadmore_status_user_collected_music", 0).a("list_cursor", Integer.valueOf(collectedMusicList.cursor)).a("list_hasmore", Integer.valueOf(collectedMusicList.hasMore)).a("action_type", 2).a("list_data", list);
            aVar.f105590b.a("user_collected_music_list", bVar);
            return null;
        }
    }
}
