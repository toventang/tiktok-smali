package com.ss.android.ugc.aweme.commercialize.profile.talent;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.profile.talent.a.c;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import org.json.JSONObject;

public interface ITalentAdRevenueShareService {
    static {
        Covode.recordClassIndex(46432);
    }

    int a();

    void a(AwemeRawAd awemeRawAd);

    void a(String str);

    void a(String str, AwemeRawAd awemeRawAd);

    void a(String str, List<String> list, int i2, c cVar, d dVar);

    void a(String str, JSONObject jSONObject);

    void a(JSONObject jSONObject, AwemeRawAd awemeRawAd);

    void a(boolean z, String str);

    boolean a(int i2);

    List<String> b();

    boolean c();

    void d();
}
