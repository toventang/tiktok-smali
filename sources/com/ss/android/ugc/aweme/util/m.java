package com.ss.android.ugc.aweme.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.api.EOYApi;
import com.ss.android.ugc.aweme.settings.f;
import f.a.d.g;
import f.a.t;
import f.a.z;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f142516a = new m();

    /* renamed from: b  reason: collision with root package name */
    private static f.a.l.a<JSONObject> f142517b;

    /* renamed from: c  reason: collision with root package name */
    private static long f142518c;

    private m() {
    }

    static {
        Covode.recordClassIndex(93206);
    }

    public static t<JSONObject> a() {
        if (f142517b == null || f142518c < System.currentTimeMillis()) {
            f.a.l.a<JSONObject> aVar = new f.a.l.a<>();
            f142517b = aVar;
            f142518c = System.currentTimeMillis() + (((long) f.a()) * 1000);
            EOYApi.a.a().questionCloud().b(f.a.h.a.b(f.a.k.a.f158006c)).d(a.f142519a).b((z<? super R>) aVar);
            l.b(aVar, "");
            return aVar;
        }
        f.a.l.a<JSONObject> aVar2 = f142517b;
        if (aVar2 != null) {
            return aVar2;
        }
        l.b();
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f142519a = new a();

        static {
            Covode.recordClassIndex(93207);
        }

        a() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Map map = (Map) obj;
            l.d(map, "");
            return new JSONObject(map);
        }
    }
}
