package com.ss.android.ugc.aweme.commercialize.live.service;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.ss.android.ugc.aweme.commercialize.live.a.a;
import com.ss.android.ugc.aweme.commercialize.live.a.c;
import com.ss.android.ugc.aweme.commercialize.live.business.links.d.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.z;
import org.json.JSONObject;

public interface ICommercializeLiveService {
    static {
        Covode.recordClassIndex(46065);
    }

    b<c> a(String str, String str2, String str3);

    a a(AwemeRawAd awemeRawAd, String str);

    com.ss.android.ugc.aweme.commercialize.live.business.links.d.a a(d dVar, h.f.a.b<? super Bundle, z> bVar);

    com.ss.android.ugc.aweme.commercialize.live.feedLive.a a(FrameLayout frameLayout);

    String a(Aweme aweme);

    void a(Aweme aweme, EnterRoomConfig enterRoomConfig, int i2);

    void a(JSONObject jSONObject);

    boolean b(Aweme aweme);
}
