package com.bytedance.im.core.internal.b.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.al;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.b.a.e;
import com.bytedance.im.core.internal.utils.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class d {

    /* renamed from: c  reason: collision with root package name */
    private static volatile d f38424c;

    /* renamed from: a  reason: collision with root package name */
    public List<ai> f38425a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    Handler f38426b = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.im.core.internal.b.a.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(22989);
        }

        public final void handleMessage(Message message) {
            if (message.what == 100) {
                x.a();
                List<ai> list = d.this.f38425a;
                AnonymousClass1 r1 = new b<List<al>>() {
                    /* class com.bytedance.im.core.internal.b.a.d.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(22990);
                    }

                    @Override // com.bytedance.im.core.a.a.b
                    public final void a(u uVar) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.im.core.a.a.b
                    public final /* synthetic */ void a(List<al> list) {
                        Iterator<Object> it = q.a().f38794h.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                };
                d.a();
                d.a(list, "on_get_ws_msg", r1);
                d.this.f38425a.clear();
            }
        }
    };

    static {
        Covode.recordClassIndex(22988);
    }

    private d() {
    }

    public static d a() {
        MethodCollector.i(9630);
        if (f38424c == null) {
            synchronized (d.class) {
                try {
                    if (f38424c == null) {
                        f38424c = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9630);
                    throw th;
                }
            }
        }
        d dVar = f38424c;
        MethodCollector.o(9630);
        return dVar;
    }

    public static void a(List<ai> list, String str, b<List<al>> bVar) {
        ArrayList arrayList;
        e eVar = new e();
        e.AnonymousClass1 r4 = new b<List<al>>(new ArrayList(), bVar) {
            /* class com.bytedance.im.core.internal.b.a.e.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f38430a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f38431b;

            static {
                Covode.recordClassIndex(22992);
            }

            @Override // com.bytedance.im.core.a.a.b
            public final void a(u uVar) {
                b bVar;
                e eVar = e.this;
                eVar.f38429a--;
                if (e.this.f38429a <= 0 && this.f38430a.isEmpty() && (bVar = this.f38431b) != null) {
                    bVar.a(uVar);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.a.a.b
            public final /* synthetic */ void a(List<al> list) {
                b bVar;
                e eVar = e.this;
                eVar.f38429a--;
                this.f38430a.addAll(list);
                if (e.this.f38429a <= 0 && (bVar = this.f38431b) != null) {
                    bVar.a(this.f38430a);
                }
            }

            {
                this.f38430a = r2;
                this.f38431b = r3;
            }
        };
        ArrayList<List<ai>> arrayList2 = new ArrayList();
        loop0:
        while (true) {
            arrayList = null;
            for (ai aiVar : list) {
                if (aiVar.getSender() == com.bytedance.im.core.a.d.a().f37562b.a()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aiVar);
                    if (arrayList.size() == 100) {
                        arrayList2.add(arrayList);
                    }
                }
            }
            break loop0;
        }
        for (List<ai> list2 : arrayList2) {
            eVar.f38429a++;
            new c(r4).a(list2, str);
        }
        if (arrayList != null) {
            eVar.f38429a++;
            new c(r4).a(arrayList, str);
        }
    }
}
