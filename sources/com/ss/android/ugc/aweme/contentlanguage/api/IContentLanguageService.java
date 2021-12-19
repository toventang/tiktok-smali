package com.ss.android.ugc.aweme.contentlanguage.api;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.serverpush.a.a;
import java.util.List;

public interface IContentLanguageService {
    static {
        Covode.recordClassIndex(48458);
    }

    int a();

    Pair<Boolean, String> a(Context context);

    a a(List<String> list, List<a> list2);

    void a(Activity activity);

    void a(a aVar);

    void a(com.ss.android.ugc.aweme.setting.serverpush.a aVar);

    void a(String str);

    void a(boolean z);

    boolean a(Aweme aweme);

    Activity b();

    List<String> c();

    String d();

    String e();
}
