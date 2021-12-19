package com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.SimpleMusic;
import f.a.t;
import l.b.f;

public interface RecommendMusicApi {
    static {
        Covode.recordClassIndex(97277);
    }

    @f(a = "/aweme/v1/music/detail/")
    t<SimpleMusic> getMusicDetail(@l.b.t(a = "music_id") String str);

    @f(a = "/tiktok/v1/music/recommend/effect/")
    t<RecommendMusic> getRecommendMusic(@l.b.t(a = "effect_id") String str);
}
