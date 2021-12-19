package com.ss.android.ugc.aweme.effect;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.shortvideo.ar;
import f.a.d.f;
import h.f.b.l;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.json.JSONObject;

public final class v {

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f88983a = new a();

        static {
            Covode.recordClassIndex(55963);
        }

        a() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(55962);
    }

    public static final class c implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f88985a = new c();

        static {
            Covode.recordClassIndex(55965);
        }

        c() {
        }

        @Override // f.a.d.a
        public final void a() {
            q.a("effect_provider_notify_dealer_error_rate", 0, (JSONObject) null);
        }
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f88984a = new b();

        static {
            Covode.recordClassIndex(55964);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            com.ss.android.ugc.tools.utils.q.a("ProviderEffect", th);
            q.a("effect_provider_notify_dealer_error_rate", 1, new ar().a("errorMsg", Log.getStackTraceString(th)).a());
        }
    }

    public static final class d implements Callback {
        static {
            Covode.recordClassIndex(55966);
        }

        @Override // okhttp3.Callback
        public final void onFailure(Call call, IOException iOException) {
            l.d(call, "");
            l.d(iOException, "");
            call.cancel();
        }

        @Override // okhttp3.Callback
        public final void onResponse(Call call, Response response) {
            l.d(call, "");
            l.d(response, "");
            call.cancel();
        }
    }
}
