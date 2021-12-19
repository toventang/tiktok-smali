package com.ss.android.ugc.aweme.commercialize.egg.service;

import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.egg.b.b;
import com.ss.android.ugc.aweme.commercialize.egg.e.a;
import com.ss.android.ugc.aweme.feed.model.ItemCommentEggGroup;

public interface ICommerceEggService {
    static {
        Covode.recordClassIndex(45596);
    }

    a a(ViewStub viewStub);

    String a(String str);

    void a();

    void a(b bVar);

    void a(com.ss.android.ugc.aweme.commercialize.egg.d.a aVar, String str);

    void a(String str, String str2, ItemCommentEggGroup itemCommentEggGroup);

    com.ss.android.ugc.aweme.commercialize.egg.c.a b();
}
