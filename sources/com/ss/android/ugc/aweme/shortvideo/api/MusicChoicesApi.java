package com.ss.android.ugc.aweme.shortvideo.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.ies.ugc.aweme.network.f;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import java.util.concurrent.ExecutionException;

public final class MusicChoicesApi {

    /* renamed from: a  reason: collision with root package name */
    static f f124960a = a.a(Api.f66569d);

    interface RealApi {
        static {
            Covode.recordClassIndex(82094);
        }

        @l.b.f(a = "/aweme/v1/commerce/music/choices/")
        q<MusicList> getCommerceMusicList();

        @l.b.f(a = "/aweme/v1/music/choices/")
        q<MusicList> getMusicList();
    }

    static {
        Covode.recordClassIndex(82093);
    }

    public static MusicList a() {
        try {
            if (CommerceMediaServiceImpl.f().b()) {
                return ((RealApi) f124960a.a(RealApi.class)).getCommerceMusicList().get();
            }
            return ((RealApi) f124960a.a(RealApi.class)).getMusicList().get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }
}
