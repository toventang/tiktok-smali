package com.ss.android.ugc.aweme.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.api.EOYApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.b;
import com.ss.android.ugc.aweme.settings.f;
import f.a.d.g;
import f.a.t;
import f.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f142506a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static f.a.l.a<JSONObject> f142507b;

    /* renamed from: c  reason: collision with root package name */
    private static long f142508c;

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f142509a;

        static {
            Covode.recordClassIndex(93201);
        }

        a(int i2) {
            this.f142509a = i2;
        }

        /* renamed from: com.ss.android.ugc.aweme.util.k$a$a  reason: collision with other inner class name */
        public static final class C3810a extends com.google.gson.b.a<ArrayList<Aweme>> {
            static {
                Covode.recordClassIndex(93202);
            }

            C3810a() {
            }
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            Map map = (Map) obj;
            l.d(map, "");
            JSONObject jSONObject = new JSONObject(map);
            JSONArray optJSONArray = jSONObject.optJSONArray("aweme_list");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject optJSONObject3 = optJSONArray.optJSONObject(i2);
                    if (!(optJSONObject3 == null || (optJSONObject2 = optJSONObject3.optJSONObject("author")) == null)) {
                        optJSONObject2.remove("secret");
                        optJSONObject2.remove("need_recommend");
                        optJSONObject2.remove("watch_status");
                    }
                    JSONObject optJSONObject4 = optJSONArray.optJSONObject(i2);
                    if (!(optJSONObject4 == null || (optJSONObject = optJSONObject4.optJSONObject("video")) == null)) {
                        optJSONObject.remove("is_long_video");
                    }
                }
                ArrayList arrayList = (ArrayList) b.a().a(optJSONArray.toString(), new C3810a().type);
                if (this.f142509a == 0) {
                    j.f142504a.clear();
                }
                l.b(arrayList, "");
                for (T t : arrayList) {
                    l.d(t, "");
                    HashMap<String, Aweme> hashMap = j.f142504a;
                    String aid = t.getAid();
                    l.b(aid, "");
                    hashMap.put(aid, t);
                }
                jSONObject.remove("aweme_list");
            }
            return jSONObject;
        }
    }

    private k() {
    }

    static {
        Covode.recordClassIndex(93200);
    }

    private static t<JSONObject> a(int i2, int i3, String str, boolean z) {
        t<R> b2 = EOYApi.a.a().discoverMore(i2, i3, str, z).d(new a(i3)).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        return b2;
    }

    public static t<JSONObject> a(int i2, int i3, String str, boolean z, boolean z2) {
        if (z2) {
            f142508c = 0;
        }
        if (i3 != 0) {
            return a(i2, i3, str, z);
        }
        if (f142507b == null || f142508c < System.currentTimeMillis()) {
            f.a.l.a<JSONObject> aVar = new f.a.l.a<>();
            f142507b = aVar;
            f142508c = System.currentTimeMillis() + (((long) f.a()) * 1000);
            a(i2, i3, str, z).b((z<? super JSONObject>) aVar);
            l.b(aVar, "");
            return aVar;
        }
        f.a.l.a<JSONObject> aVar2 = f142507b;
        if (aVar2 != null) {
            return aVar2;
        }
        l.b();
        return aVar2;
    }
}
