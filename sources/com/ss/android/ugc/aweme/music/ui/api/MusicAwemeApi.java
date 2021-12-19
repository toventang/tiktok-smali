package com.ss.android.ugc.aweme.music.ui.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.ui.d.g;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.t;
import h.f.b.l;

public interface MusicAwemeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f111894a = a.f111895a;

    static {
        Covode.recordClassIndex(71917);
    }

    @h(a = "/aweme/v1/music/aweme/")
    t<MusicAwemeList> queryMusicAwemeList(@z(a = "music_id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2, @z(a = "type") int i3);

    @h(a = "/aweme/v1/music/discovery/")
    t<g> queryMusicList(@z(a = "music_id") String str, @z(a = "cursor") long j2, @z(a = "count") int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f111895a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(71918);
        }

        public static MusicAwemeApi a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(MusicAwemeApi.class);
            l.b(create, "");
            return (MusicAwemeApi) create;
        }
    }
}
