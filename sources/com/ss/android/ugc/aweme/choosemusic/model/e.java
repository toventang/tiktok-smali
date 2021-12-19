package com.ss.android.ugc.aweme.choosemusic.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.choosemusic.utils.c;
import com.ss.android.ugc.aweme.music.d.a;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f70656a;

    /* renamed from: b  reason: collision with root package name */
    private final o f70657b;

    static {
        Covode.recordClassIndex(43565);
    }

    e(b bVar, o oVar) {
        this.f70656a = bVar;
        this.f70657b = oVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        b bVar = this.f70656a;
        o oVar = this.f70657b;
        bVar.f70646g = false;
        long a2 = oVar.a(TimeUnit.MILLISECONDS);
        if (iVar.c()) {
            bVar.f70641b.a("refresh_status_user_collected_music", (Object) 1);
            bVar.f70644e.onEventV3("tool_performance_api", new d().a("api_type", "music_list").a("duration", a2).a("scene", "favorite").a("status", 1).a("error_domain", a.f111394a).a("error_code", -1).f66730a);
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            CollectedMusicList collectedMusicList = (CollectedMusicList) iVar.d();
            b bVar2 = new b();
            bVar2.a("refresh_status_user_collected_music", 0).a("list_cursor", Integer.valueOf(collectedMusicList.cursor)).a("list_hasmore", Integer.valueOf(collectedMusicList.hasMore)).a("action_type", 1).a("list_data", c.a(collectedMusicList.items));
            bVar.f70641b.a("user_collected_music_list", bVar2);
            bVar.f70644e.onEventV3("tool_performance_api", new d().a("api_type", "music_list").a("duration", a2).a("scene", "favorite").a("status", 0).f66730a);
            return null;
        }
    }
}
