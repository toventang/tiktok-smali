package com.ss.android.ugc.aweme.share.improve.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.c.k;
import com.ss.android.ugc.aweme.im.service.share.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class p extends l implements a {

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f123801b;

    /* renamed from: c  reason: collision with root package name */
    private final String f123802c;

    /* renamed from: d  reason: collision with root package name */
    private final String f123803d;

    static {
        Covode.recordClassIndex(81250);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h, com.ss.android.ugc.aweme.share.improve.a.l
    public final int b() {
        if (k.b()) {
            return R.string.be6;
        }
        return super.b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Aweme aweme, String str, String str2) {
        super(aweme, str, str2);
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        this.f123801b = aweme;
        this.f123802c = str;
        this.f123803d = str2;
    }
}
