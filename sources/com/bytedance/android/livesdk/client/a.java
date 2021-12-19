package com.bytedance.android.livesdk.client;

import com.bytedance.android.live.network.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.u;
import com.ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.ss.ugc.live.sdk.msg.b.f;
import com.ss.ugc.live.sdk.msg.d.f;
import f.a.d.f;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class a implements IMessageClient {

    /* renamed from: a  reason: collision with root package name */
    public final String f16678a = "AbsMessageClient";

    /* renamed from: b  reason: collision with root package name */
    private final IMessageApi f16679b = ((IMessageApi) e.a().a(IMessageApi.class));

    static {
        Covode.recordClassIndex(9257);
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.live.sdk.msg.b.c f16682a;

        static {
            Covode.recordClassIndex(9259);
        }

        b(com.ss.ugc.live.sdk.msg.b.c cVar) {
            this.f16682a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f16682a.a(f.a.a(new Exception((Throwable) obj)));
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.live.sdk.msg.b.c f16685a;

        static {
            Covode.recordClassIndex(9261);
        }

        d(com.ss.ugc.live.sdk.msg.b.c cVar) {
            this.f16685a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f16685a.a(f.a.a(new Exception((Throwable) obj)));
        }
    }

    public static String a(com.bytedance.retrofit2.client.c cVar) {
        List<com.bytedance.retrofit2.client.b> list;
        T t;
        String str;
        if (cVar == null || (list = cVar.f42476d) == null) {
            return "";
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            l.b(t2, "");
            if (l.a((Object) "x-tt-logid", (Object) t2.f42471a)) {
                break;
            }
        }
        T t3 = t;
        if (t3 == null || (str = t3.f42472b) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: com.bytedance.android.livesdk.client.a$a  reason: collision with other inner class name */
    static final class C0334a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16680a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.live.sdk.msg.b.c f16681b;

        static {
            Covode.recordClassIndex(9258);
        }

        C0334a(a aVar, com.ss.ugc.live.sdk.msg.b.c cVar) {
            this.f16680a = aVar;
            this.f16681b = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.ugc.live.sdk.msg.d.f<com.ss.ugc.live.sdk.msg.b.f, ? extends Exception> fVar;
            com.bytedance.retrofit2.client.c cVar = ((u) obj).f42629a;
            l.b(cVar, "");
            if (cVar.a()) {
                TypedInput typedInput = cVar.f42477e;
                Objects.requireNonNull(typedInput, "null cannot be cast to non-null type com.bytedance.retrofit2.mime.TypedByteArray");
                byte[] bytes = ((TypedByteArray) typedInput).getBytes();
                Iterable iterable = cVar.f42476d;
                if (iterable == null) {
                    iterable = z.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(n.a(iterable, 10));
                for (T t : iterable) {
                    l.b(t, "");
                    arrayList.add(new com.ss.ugc.live.sdk.msg.b.b(t.f42471a, t.f42472b));
                }
                fVar = f.a.a(new f.a().a(cVar.f42474b).a(cVar.f42475c).a((List<com.ss.ugc.live.sdk.msg.b.b>) arrayList).a(bytes).f154126a);
            } else {
                com.bytedance.android.live.core.c.a.a(6, this.f16680a.f16678a, "http post response failed, code: " + cVar.f42474b + ". logId: " + a.a(cVar));
                fVar = f.a.a(new Exception("response failed"));
            }
            this.f16681b.a(fVar);
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16683a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.live.sdk.msg.b.c f16684b;

        static {
            Covode.recordClassIndex(9260);
        }

        c(a aVar, com.ss.ugc.live.sdk.msg.b.c cVar) {
            this.f16683a = aVar;
            this.f16684b = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.ugc.live.sdk.msg.d.f<com.ss.ugc.live.sdk.msg.b.f, ? extends Exception> fVar;
            com.bytedance.retrofit2.client.c cVar = ((u) obj).f42629a;
            l.b(cVar, "");
            if (cVar.a()) {
                TypedInput typedInput = cVar.f42477e;
                Objects.requireNonNull(typedInput, "null cannot be cast to non-null type com.bytedance.retrofit2.mime.TypedByteArray");
                byte[] bytes = ((TypedByteArray) typedInput).getBytes();
                Iterable iterable = cVar.f42476d;
                if (iterable == null) {
                    iterable = z.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(n.a(iterable, 10));
                for (T t : iterable) {
                    l.b(t, "");
                    arrayList.add(new com.ss.ugc.live.sdk.msg.b.b(t.f42471a, t.f42472b));
                }
                fVar = f.a.a(new f.a().a(cVar.f42474b).a(cVar.f42475c).a((List<com.ss.ugc.live.sdk.msg.b.b>) arrayList).a(bytes).f154126a);
            } else {
                com.bytedance.android.live.core.c.a.a(6, this.f16683a.f16678a, "http post response failed, code: " + cVar.f42474b + ". logId: " + a.a(cVar));
                fVar = f.a.a(new Exception("response failed"));
            }
            this.f16684b.a(fVar);
        }
    }

    @Override // com.ss.ugc.live.sdk.msg.b.g
    public final void b(com.ss.ugc.live.sdk.msg.b.e eVar, com.ss.ugc.live.sdk.msg.b.c cVar) {
        l.d(eVar, "");
        l.d(cVar, "");
        IMessageApi iMessageApi = this.f16679b;
        String str = eVar.f154110b;
        l.b(str, "");
        Map<String, String> map = eVar.f154111c;
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = eVar.f154112d;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        iMessageApi.doGetAsync(str, map, map2).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new C0334a(this, cVar), new b(cVar));
    }

    @Override // com.ss.ugc.live.sdk.msg.b.g
    public final void a(com.ss.ugc.live.sdk.msg.b.e eVar, com.ss.ugc.live.sdk.msg.b.c cVar) {
        l.d(eVar, "");
        l.d(cVar, "");
        TypedByteArray typedByteArray = new TypedByteArray(eVar.f154115g, com.ss.ugc.live.sdk.msg.d.d.a(eVar), new String[0]);
        IMessageApi iMessageApi = this.f16679b;
        String str = eVar.f154110b;
        l.b(str, "");
        Map<String, String> map = eVar.f154111c;
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = eVar.f154112d;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        iMessageApi.doPostAsync(str, map, map2, typedByteArray).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new c(this, cVar), new d(cVar));
    }
}
