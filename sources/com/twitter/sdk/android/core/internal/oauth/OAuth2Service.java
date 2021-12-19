package com.twitter.sdk.android.core.internal.oauth;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.h;
import com.twitter.sdk.android.core.internal.a.f;
import com.twitter.sdk.android.core.q;
import com.twitter.sdk.android.core.s;
import l.b;
import l.b.c;
import l.b.e;
import l.b.i;
import l.b.k;
import l.b.o;

public final class OAuth2Service extends d {

    /* renamed from: a  reason: collision with root package name */
    OAuth2Api f155998a = ((OAuth2Api) this.f156019e.a(OAuth2Api.class));

    /* access modifiers changed from: package-private */
    public interface OAuth2Api {
        static {
            Covode.recordClassIndex(103651);
        }

        @o(a = "/oauth2/token")
        @e
        @k(a = {"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        b<OAuth2Token> getAppAuthToken(@i(a = "Authorization") String str, @c(a = "grant_type") String str2);

        @o(a = "/1.1/guest/activate.json")
        b<a> getGuestToken(@i(a = "Authorization") String str);
    }

    static {
        Covode.recordClassIndex(103648);
    }

    private String a() {
        TwitterAuthConfig twitterAuthConfig = this.f156016b.f156179e;
        return "Basic " + k.i.encodeUtf8(f.b(twitterAuthConfig.f155892a) + ":" + f.b(twitterAuthConfig.f155893b)).base64();
    }

    private void b(com.twitter.sdk.android.core.b<OAuth2Token> bVar) {
        this.f155998a.getAppAuthToken(a(), "client_credentials").a(bVar);
    }

    public final void a(final com.twitter.sdk.android.core.b<GuestAuthToken> bVar) {
        b(new com.twitter.sdk.android.core.b<OAuth2Token>() {
            /* class com.twitter.sdk.android.core.internal.oauth.OAuth2Service.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103649);
            }

            @Override // com.twitter.sdk.android.core.b
            public final void a(s sVar) {
                com.twitter.sdk.android.core.k.c().a();
                com.twitter.sdk.android.core.b bVar = bVar;
                if (bVar != null) {
                    bVar.a(sVar);
                }
            }

            @Override // com.twitter.sdk.android.core.b
            public final void a(h<OAuth2Token> hVar) {
                final T t = hVar.f155911a;
                OAuth2Service.this.f155998a.getGuestToken("Bearer " + t.f156004d).a(new com.twitter.sdk.android.core.b<a>() {
                    /* class com.twitter.sdk.android.core.internal.oauth.OAuth2Service.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(103650);
                    }

                    @Override // com.twitter.sdk.android.core.b
                    public final void a(s sVar) {
                        com.twitter.sdk.android.core.k.c().a();
                        bVar.a(sVar);
                    }

                    @Override // com.twitter.sdk.android.core.b
                    public final void a(h<a> hVar) {
                        bVar.a(new h(new GuestAuthToken(t.f156003c, t.f156004d, hVar.f155911a.f156008a), null));
                    }
                });
            }
        });
    }

    public OAuth2Service(q qVar, com.twitter.sdk.android.core.internal.q qVar2) {
        super(qVar, qVar2);
    }
}
