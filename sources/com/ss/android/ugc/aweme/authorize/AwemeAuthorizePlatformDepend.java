package com.ss.android.ugc.aweme.authorize;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.t;
import com.bytedance.sdk.a.b.a.a;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.openauthorize.h;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class AwemeAuthorizePlatformDepend implements a {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<h> f67097a;

    /* renamed from: b  reason: collision with root package name */
    private AuthorizeApi f67098b = ((AuthorizeApi) RetrofitFactory.a().b(b.f59141e).d().a(AuthorizeApi.class));

    /* renamed from: c  reason: collision with root package name */
    private ExecutorService f67099c = g.a();

    public interface AuthorizeApi {
        static {
            Covode.recordClassIndex(41341);
        }

        @com.bytedance.retrofit2.b.h
        q<String> doGet(@ag String str);

        @t
        @com.bytedance.retrofit2.b.g
        q<String> doPost(@ag String str, @f Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(41340);
    }

    @Override // com.bytedance.sdk.a.b.a.a
    public final String b() {
        l.b("open16-va.tiktokv.com", "");
        return "open16-va.tiktokv.com";
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.a.b.a.a
    public final boolean a() {
        d.a();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = c();
        }
        return j.f107229h;
    }

    public final void a(Runnable runnable) {
        this.f67099c.execute(runnable);
    }

    @Override // com.bytedance.sdk.a.b.a.a
    public final String a(String str) {
        String str2 = this.f67098b.doGet(str).get();
        l.b(str2, "");
        return str2;
    }

    public AwemeAuthorizePlatformDepend(h hVar) {
        this.f67097a = new WeakReference<>(hVar);
    }

    @Override // com.bytedance.sdk.a.b.a.a
    public final void a(String str, JSONObject jSONObject) {
        r.a(str, jSONObject);
    }

    @Override // com.bytedance.sdk.a.b.a.a
    public final String a(String str, Map<String, String> map) {
        String str2 = this.f67098b.doPost(str, map).get();
        l.b(str2, "");
        return str2;
    }
}
