package com.ss.android.ugc.aweme.shortvideo.l;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f128677a;

    static {
        Covode.recordClassIndex(84347);
    }

    c(Aweme aweme) {
        this.f128677a = aweme;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return AVExternalServiceImpl.a().configService().privacyConfig().checkDuetReactPermission(this.f128677a.getAid(), 1);
    }
}
