package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import java.util.List;

public class MusicDetail extends BaseResponse {
    @c(a = "billboard_type")
    public int billboardType;
    @c(a = "bind_commerce_challenge")
    public boolean bindCommerceChallenge;
    @c(a = "edition_uid")
    public int editionUid;
    @c(a = "music_info")
    public Music music;
    @c(a = "rec_list")
    public List<RelatedChallengeMusic> relatedChallengeMusicList;
    @c(a = "similar_music_ids")
    public List<String> similarMusicIds;
    @c(a = "top_bodydance_avatars")
    public List<UrlModel> topBodydanceAvatars;

    static {
        Covode.recordClassIndex(71673);
    }
}
