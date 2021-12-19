package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.b;
import com.twitter.sdk.android.core.u;

final class d extends a {
    static {
        Covode.recordClassIndex(103605);
    }

    @Override // com.twitter.sdk.android.core.identity.a
    public final boolean a(Activity activity) {
        Intent intent = new Intent(activity, OAuthActivity.class);
        intent.putExtra("auth_config", this.f155926b);
        activity.startActivityForResult(intent, this.f155925a);
        return true;
    }

    d(TwitterAuthConfig twitterAuthConfig, b<u> bVar) {
        super(twitterAuthConfig, bVar, 140);
    }
}
