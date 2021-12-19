package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.b;
import com.twitter.sdk.android.core.h;
import com.twitter.sdk.android.core.identity.f;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.n;
import com.twitter.sdk.android.core.s;

final class c implements f.a {

    /* renamed from: a  reason: collision with root package name */
    final a f155929a;

    /* renamed from: b  reason: collision with root package name */
    TwitterAuthToken f155930b;

    /* renamed from: c  reason: collision with root package name */
    public final WebView f155931c;

    /* renamed from: d  reason: collision with root package name */
    public final TwitterAuthConfig f155932d;

    /* renamed from: e  reason: collision with root package name */
    public final OAuth1aService f155933e;

    /* renamed from: f  reason: collision with root package name */
    private final ProgressBar f155934f;

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(103604);
        }

        void a(int i2, Intent intent);
    }

    static {
        Covode.recordClassIndex(103601);
    }

    private void c() {
        this.f155934f.setVisibility(8);
    }

    private void b() {
        this.f155931c.stopLoading();
        c();
    }

    @Override // com.twitter.sdk.android.core.identity.f.a
    public final void a() {
        k.c().a();
        a(1, new n("OAuth web view completed with an error"));
        b();
    }

    @Override // com.twitter.sdk.android.core.identity.f.a
    public final void a(WebView webView) {
        c();
        webView.setVisibility(0);
    }

    @Override // com.twitter.sdk.android.core.identity.f.a
    public final void a(Bundle bundle) {
        k.c().b();
        String string = bundle.getString("oauth_verifier");
        if (string != null) {
            k.c().b();
            OAuth1aService oAuth1aService = this.f155933e;
            AnonymousClass2 r2 = new b<OAuthResponse>() {
                /* class com.twitter.sdk.android.core.identity.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(103603);
                }

                @Override // com.twitter.sdk.android.core.b
                public final void a(s sVar) {
                    k.c().a();
                    c.this.a(1, new n("Failed to get access token"));
                }

                @Override // com.twitter.sdk.android.core.b
                public final void a(h<OAuthResponse> hVar) {
                    Intent intent = new Intent();
                    T t = hVar.f155911a;
                    intent.putExtra("screen_name", t.f156006b);
                    intent.putExtra("user_id", t.f156007c);
                    intent.putExtra("tk", t.f156005a.f155894b);
                    intent.putExtra("ts", t.f156005a.f155895c);
                    c.this.f155929a.a(-1, intent);
                }
            };
            oAuth1aService.f155995a.getAccessToken(com.twitter.sdk.android.core.internal.oauth.b.a(oAuth1aService.f156016b.f156179e, this.f155930b, null, "POST", oAuth1aService.f156017c.f156021a + "/oauth/access_token", null), string).a(oAuth1aService.a(r2));
        } else {
            k.c().a();
            a(1, new n("Failed to get authorization, bundle incomplete"));
        }
        b();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, n nVar) {
        Intent intent = new Intent();
        intent.putExtra("auth_error", nVar);
        this.f155929a.a(i2, intent);
    }

    c(ProgressBar progressBar, WebView webView, TwitterAuthConfig twitterAuthConfig, OAuth1aService oAuth1aService, a aVar) {
        this.f155934f = progressBar;
        this.f155931c = webView;
        this.f155932d = twitterAuthConfig;
        this.f155933e = oAuth1aService;
        this.f155929a = aVar;
    }
}
