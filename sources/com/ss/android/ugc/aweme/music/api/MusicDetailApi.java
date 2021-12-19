package com.ss.android.ugc.aweme.music.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.music.model.MusicDetail;

public final class MusicDetailApi {

    /* renamed from: a  reason: collision with root package name */
    public static final DetailApi f111099a = ((DetailApi) RetrofitFactory.a().a(Api.f66569d).a(DetailApi.class));

    public interface DetailApi {
        static {
            Covode.recordClassIndex(71294);
        }

        @h(a = "/aweme/v1/music/detail/")
        q<MusicDetail> queryMusic(@z(a = "music_id") String str, @z(a = "click_reason") int i2);

        @h(a = "/aweme/v1/music/partner/detail/")
        q<MusicDetail> queryPartnerMusic(@z(a = "partner_music_id") String str, @z(a = "partner_name") String str2);
    }

    static {
        Covode.recordClassIndex(71293);
    }
}
