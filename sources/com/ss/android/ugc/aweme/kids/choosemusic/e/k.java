package com.ss.android.ugc.aweme.kids.choosemusic.e;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.kids.choosemusic.g.d;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f105616a;

    /* renamed from: b  reason: collision with root package name */
    private final o f105617b;

    static {
        Covode.recordClassIndex(67654);
    }

    k(a aVar, o oVar) {
        this.f105616a = aVar;
        this.f105617b = oVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        a aVar = this.f105616a;
        o oVar = this.f105617b;
        aVar.f105594f = false;
        oVar.a(TimeUnit.MILLISECONDS);
        if (iVar.c()) {
            aVar.f105590b.a("refresh_status_user_collected_music", (Object) 1);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            CollectedMusicList collectedMusicList = (CollectedMusicList) iVar.d();
            b bVar = new b();
            bVar.a("refresh_status_user_collected_music", 0).a("list_cursor", Integer.valueOf(collectedMusicList.cursor)).a("list_hasmore", Integer.valueOf(collectedMusicList.hasMore)).a("action_type", 1).a("list_data", d.a(collectedMusicList.items));
            aVar.f105590b.a("user_collected_music_list", bVar);
            return null;
        }
    }
}
