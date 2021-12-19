package com.ss.android.ugc.aweme.feed.service;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.o.d;
import com.ss.android.ugc.aweme.feed.adapter.an;
import com.ss.android.ugc.aweme.feed.e;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

public interface IFeedComponentService {
    static {
        Covode.recordClassIndex(59715);
    }

    d a(float f2);

    an a();

    e a(String str, int i2, s<ag> sVar, com.ss.android.ugc.aweme.feed.n.e eVar);

    Boolean a(Activity activity);

    <T> T a(Class<T> cls);

    boolean a(Aweme aweme);

    List<AnchorCommonStruct> b(Aweme aweme);
}
