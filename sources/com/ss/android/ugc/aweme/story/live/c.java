package com.ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.deeplink.a;
import com.ss.android.ugc.aweme.live.deeplink.b;
import com.ss.android.ugc.aweme.live.livehostimpl.e;
import com.ss.android.ugc.aweme.profile.model.User;

public final class c implements b {
    static {
        Covode.recordClassIndex(90242);
    }

    @Override // com.ss.android.ugc.aweme.story.live.b
    public final void b() {
        Live.switchLocale();
    }

    @Override // com.ss.android.ugc.aweme.story.live.b
    public final a c() {
        return b.f108348a;
    }

    @Override // com.ss.android.ugc.aweme.story.live.b
    public final String a() {
        return Live.getLiveDomain();
    }

    @Override // com.ss.android.ugc.aweme.story.live.b
    public final boolean a(User user) {
        return Live.showLive(user);
    }

    @Override // com.ss.android.ugc.aweme.story.live.b
    public final void a(String str, Bundle bundle, Context context) {
        new e().openLiveBrowser(str, bundle, context);
    }
}
