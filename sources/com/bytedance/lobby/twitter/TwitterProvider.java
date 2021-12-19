package com.bytedance.lobby.twitter;

import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.a;
import com.bytedance.lobby.d;
import com.bytedance.lobby.internal.BaseProvider;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.o;

/* access modifiers changed from: package-private */
public class TwitterProvider<T> extends BaseProvider<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f40270b = a.f40144a;

    /* renamed from: d  reason: collision with root package name */
    private Application f40271d;

    static {
        Covode.recordClassIndex(24820);
    }

    @Override // com.bytedance.lobby.internal.BaseProvider
    public final void d() {
        String str;
        String str2 = this.f40228c.f40177c;
        Bundle bundle = this.f40228c.f40178d;
        if (bundle != null) {
            str = bundle.getString("twitter_consumer_secret");
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            o.a aVar = new o.a(this.f40271d);
            aVar.f156169b = Boolean.valueOf(f40270b);
            aVar.f156168a = new TwitterAuthConfig(this.f40228c.f40177c, str);
            k.a(aVar.a());
        } else if (f40270b) {
            throw new NullPointerException("Cannot initialize Twitter SDK with an incomplete consumer credentials.");
        }
    }

    TwitterProvider(Application application, d dVar) {
        super(application, dVar);
        this.f40271d = application;
    }
}
