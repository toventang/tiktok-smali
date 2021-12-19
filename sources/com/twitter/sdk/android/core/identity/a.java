package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.b;
import com.twitter.sdk.android.core.h;
import com.twitter.sdk.android.core.n;
import com.twitter.sdk.android.core.s;
import com.twitter.sdk.android.core.u;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final int f155925a = 140;

    /* renamed from: b  reason: collision with root package name */
    public final TwitterAuthConfig f155926b;

    /* renamed from: c  reason: collision with root package name */
    public final b<u> f155927c;

    static {
        Covode.recordClassIndex(103599);
    }

    public abstract boolean a(Activity activity);

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    a(TwitterAuthConfig twitterAuthConfig, b<u> bVar, int i2) {
        this.f155926b = twitterAuthConfig;
        this.f155927c = bVar;
    }

    public final boolean a(int i2, int i3, Intent intent) {
        if (this.f155925a != i2) {
            return false;
        }
        b<u> bVar = this.f155927c;
        if (bVar == null) {
            return true;
        }
        if (i3 == -1) {
            String a2 = a(intent, "tk");
            String a3 = a(intent, "ts");
            String a4 = a(intent, "screen_name");
            bVar.a(new h<>(new u(new TwitterAuthToken(a2, a3), intent.getLongExtra("user_id", 0), a4), null));
            return true;
        } else if (intent == null || !intent.hasExtra("auth_error")) {
            bVar.a(new n("Authorize failed."));
            return true;
        } else {
            bVar.a((s) intent.getSerializableExtra("auth_error"));
            return true;
        }
    }
}
