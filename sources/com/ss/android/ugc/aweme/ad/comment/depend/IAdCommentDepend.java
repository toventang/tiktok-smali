package com.ss.android.ugc.aweme.ad.comment.depend;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.commercialize.j.b;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.model.s;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import h.z;
import java.util.List;

public interface IAdCommentDepend extends a {
    static {
        Covode.recordClassIndex(40413);
    }

    Widget a(h.f.a.a<z> aVar);

    String a();

    List<TextExtraStruct> a(Context context, Aweme aweme, s sVar);

    List<TextExtraStruct> a(s sVar);

    List<TextExtraStruct> a(s sVar, AwemeRawAd awemeRawAd, h.f.a.a<z> aVar);

    void a(Context context, ac acVar, Aweme aweme);

    void a(Context context, Aweme aweme);

    void a(Context context, Aweme aweme, String str);

    void a(Context context, Aweme aweme, String str, String str2);

    void a(Context context, User user);

    void a(Context context, String str);

    void a(Context context, String str, String str2);

    void a(Context context, String str, String str2, String str3);

    void a(AwemeRawAd awemeRawAd);

    void a(String str, Context context, ac acVar, Aweme aweme, String str2);

    void a(String str, String str2, Aweme aweme, boolean z);

    boolean a(Context context, Aweme aweme, int i2, b bVar);

    boolean a(Aweme aweme);

    boolean a(String str);

    Widget b(h.f.a.a<z> aVar);

    String b(s sVar);
}
