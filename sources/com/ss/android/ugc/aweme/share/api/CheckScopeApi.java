package com.ss.android.ugc.aweme.share.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.ClientKeyScopesResponse;
import f.a.ab;
import l.b.c;
import l.b.e;
import l.b.o;

public interface CheckScopeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123364a = a.f123365a;

    static {
        Covode.recordClassIndex(81016);
    }

    @o(a = "/oauth/get_client_scopes/")
    @e
    ab<ClientKeyScopesResponse> checkScopeExist(@c(a = "client_key") String str, @c(a = "app_identity") String str2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f123365a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(81017);
        }
    }
}
