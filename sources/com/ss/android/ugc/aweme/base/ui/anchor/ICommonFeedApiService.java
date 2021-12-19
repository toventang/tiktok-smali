package com.ss.android.ugc.aweme.base.ui.anchor;

import android.net.Uri;
import com.bytedance.assem.arch.b.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.k.c;
import java.util.List;

public interface ICommonFeedApiService {
    static {
        Covode.recordClassIndex(42076);
    }

    c<? extends v<? extends d>> a();

    List<AnchorCommonStruct> a(Aweme aweme);

    void a(Uri uri, boolean z);

    long b();

    boolean c();

    boolean d();

    boolean e();

    void f();
}
