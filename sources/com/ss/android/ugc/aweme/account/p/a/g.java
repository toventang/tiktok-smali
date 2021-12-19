package com.ss.android.ugc.aweme.account.p.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.profilebadge.UserGetApi;
import com.ss.android.ugc.aweme.account.profilebadge.UserGetResponse;
import f.a.d.f;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class g implements d {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f65274a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.ies.web.a.a f65275b;

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f65277a = new b();

        static {
            Covode.recordClassIndex(40141);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(40139);
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f65276a = new a();

        static {
            Covode.recordClassIndex(40140);
        }

        a() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            UserGetResponse userGetResponse = (UserGetResponse) obj;
            if (userGetResponse.getUser() != null) {
                AccountService.a().e().updateCurUser(userGetResponse.getUser());
            }
        }
    }

    public g(WeakReference<Context> weakReference, com.bytedance.ies.web.a.a aVar) {
        l.d(weakReference, "");
        l.d(aVar, "");
        this.f65274a = weakReference;
        this.f65275b = aVar;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        UserGetApi.a.a().getSelf().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(a.f65276a, b.f65277a);
    }
}
