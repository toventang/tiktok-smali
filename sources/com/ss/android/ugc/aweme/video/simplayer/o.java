package com.ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.f;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.player.sdk.api.g;
import f.a.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class o implements g {

    /* renamed from: a  reason: collision with root package name */
    public TTNetClientApi f143906a;

    /* renamed from: b  reason: collision with root package name */
    private f.a.b.a f143907b = new f.a.b.a();

    /* renamed from: c  reason: collision with root package name */
    private f f143908c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        JSONObject f143916a;

        /* renamed from: b  reason: collision with root package name */
        Exception f143917b;

        /* renamed from: c  reason: collision with root package name */
        int f143918c = -1;

        static {
            Covode.recordClassIndex(94162);
        }
    }

    static {
        Covode.recordClassIndex(94159);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.g
    public final Map a() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.g
    public final void b() {
        this.f143907b.a();
    }

    public o(f fVar) {
        this.f143908c = fVar;
        this.f143906a = (TTNetClientApi) fVar.a(TTNetClientApi.class);
    }

    public static List<b> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            arrayList.add(new b(str, map.get(str)));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.g
    public final void a(String str, g.a aVar) {
        b(str, null, null, 0, aVar);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.g
    public final void a(String str, Map<String, String> map, g.a aVar) {
        b(str, map, null, 0, aVar);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.g
    public final void a(String str, Map<String, String> map, JSONObject jSONObject, int i2, g.a aVar) {
        b(str, map, jSONObject, i2, aVar);
    }

    private void b(final String str, final Map<String, String> map, final JSONObject jSONObject, final int i2, final g.a aVar) {
        this.f143907b.a((f.a.b.b) t.c(new Callable<a>() {
            /* class com.ss.android.ugc.aweme.video.simplayer.o.AnonymousClass2 */

            static {
                Covode.recordClassIndex(94161);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public a call() {
                com.bytedance.retrofit2.b<String> post;
                a aVar = new a();
                try {
                    if (i2 != 1) {
                        post = o.this.f143906a.get(str, o.a(map));
                    } else {
                        post = o.this.f143906a.post(str, o.a(map), jSONObject);
                    }
                    u<String> execute = post.execute();
                    try {
                        aVar.f143916a = new JSONObject((String) execute.f42630b);
                    } catch (Exception e2) {
                        aVar.f143917b = e2;
                        aVar.f143918c = -2;
                    }
                    if (aVar.f143917b == null && !execute.f42629a.a()) {
                        aVar.f143917b = new Exception("http fail");
                        aVar.f143918c = execute.f42629a.f42474b;
                    }
                } catch (Exception e3) {
                    aVar.f143917b = e3;
                }
                return aVar;
            }
        }).b(f.a.h.a.b(f.a.k.a.f158006c)).c(new f.a.g.b<a>() {
            /* class com.ss.android.ugc.aweme.video.simplayer.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94160);
            }

            @Override // f.a.z
            public final void onComplete() {
                com.ss.android.ugc.aweme.player.sdk.a.a("ttnet doTask startTask onComplete");
            }

            @Override // f.a.z
            public final void onError(Throwable th) {
                com.ss.android.ugc.aweme.player.sdk.a.a("ttnet doTask startTask onError", th);
                aVar.a(null, new g.b(-1, "", th));
            }

            @Override // f.a.z
            public final /* synthetic */ void onNext(Object obj) {
                String str;
                a aVar = (a) obj;
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    StringBuilder sb = new StringBuilder("ttnet doTask startTask onNext:");
                    if (aVar.f143916a != null) {
                        str = aVar.f143916a.toString();
                    } else {
                        str = "json null.";
                    }
                    com.ss.android.ugc.aweme.player.sdk.a.a(sb.append(str).toString());
                }
                if (aVar.f143917b == null) {
                    aVar.a(aVar.f143916a, null);
                } else {
                    aVar.a(aVar.f143916a, new g.b(aVar.f143918c, "", aVar.f143917b));
                }
            }
        }));
    }
}
