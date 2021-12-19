package com.bytedance.im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.an;
import com.bytedance.im.core.d.ar;
import com.bytedance.im.core.d.ay;
import com.bytedance.im.core.d.bf;
import com.bytedance.im.core.d.bg;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.r;
import com.bytedance.im.core.d.s;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.d.v;
import com.bytedance.im.core.d.w;
import com.bytedance.im.core.d.x;
import com.bytedance.im.core.internal.b.a.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class q {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f38785i;

    /* renamed from: j  reason: collision with root package name */
    private static q f38786j;

    /* renamed from: a  reason: collision with root package name */
    public v f38787a;

    /* renamed from: b  reason: collision with root package name */
    public r f38788b;

    /* renamed from: c  reason: collision with root package name */
    public s f38789c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, List<r>> f38790d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public Map<String, List<com.bytedance.im.core.d.q>> f38791e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    public Set<w> f38792f = new CopyOnWriteArraySet();

    /* renamed from: g  reason: collision with root package name */
    public Set<x> f38793g = new CopyOnWriteArraySet();

    /* renamed from: h  reason: collision with root package name */
    public Set<Object> f38794h = new CopyOnWriteArraySet();

    /* renamed from: k  reason: collision with root package name */
    private Map<String, List<v>> f38795k = new ConcurrentHashMap();

    /* renamed from: l  reason: collision with root package name */
    private Set<Object> f38796l = new CopyOnWriteArraySet();

    /* access modifiers changed from: package-private */
    public interface a<T> {
        static {
            Covode.recordClassIndex(23165);
        }

        void a(T t);
    }

    static {
        Covode.recordClassIndex(23140);
    }

    public final void a(String str, v vVar) {
        List<v> list = this.f38795k.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!list.contains(vVar)) {
            list.add(vVar);
        }
        this.f38795k.put(str, list);
    }

    public final void a(final h hVar) {
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId())) {
            b(hVar.getConversationId(), new a<r>() {
                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(23141);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.utils.q.a
                public final /* synthetic */ void a(r rVar) {
                    rVar.b(hVar);
                }
            });
        }
    }

    public final void a(final h hVar, final int i2) {
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId())) {
            b(hVar.getConversationId(), new a<r>() {
                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass12 */

                static {
                    Covode.recordClassIndex(23144);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.utils.q.a
                public final /* bridge */ /* synthetic */ void a(r rVar) {
                    rVar.a(hVar, i2);
                }
            });
        }
    }

    public final void a(final String str, final List<ah> list) {
        if (!TextUtils.isEmpty(str)) {
            b(str, new a<r>() {
                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass21 */

                static {
                    Covode.recordClassIndex(23154);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.utils.q.a
                public final /* bridge */ /* synthetic */ void a(r rVar) {
                    rVar.a(str, list);
                }
            });
        }
    }

    public final void a(List<ai> list, final int i2, final ar arVar) {
        if (!(list == null || list.isEmpty())) {
            final ArrayList arrayList = new ArrayList();
            for (ai aiVar : list) {
                if (aiVar != null && aiVar.getSvrStatus() == 0) {
                    arrayList.add(aiVar);
                }
            }
            if (!arrayList.isEmpty()) {
                a(list.get(0).getConversationId(), new a<v>() {
                    /* class com.bytedance.im.core.internal.utils.q.AnonymousClass7 */

                    static {
                        Covode.recordClassIndex(23162);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.im.core.internal.utils.q.a
                    public final /* bridge */ /* synthetic */ void a(v vVar) {
                        vVar.a(arrayList, i2, arVar);
                    }
                });
            }
        }
    }

    public final void a(List<ai> list) {
        a(list, new HashMap());
    }

    public final void a(final List<ai> list, final Map<String, Map<String, String>> map) {
        if (list != null && !list.isEmpty()) {
            a(list.get(0).getConversationId(), new a<v>() {
                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass11 */

                static {
                    Covode.recordClassIndex(23143);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.utils.q.a
                public final /* bridge */ /* synthetic */ void a(v vVar) {
                    vVar.a(list, map);
                }
            });
        }
    }

    public final void a(String str, a<v> aVar) {
        List<v> list = this.f38795k.get(str);
        if (list != null) {
            for (v vVar : list) {
                aVar.a(vVar);
            }
        }
        v vVar2 = this.f38787a;
        if (vVar2 != null) {
            aVar.a(vVar2);
        }
    }

    public final void b() {
        Iterator<Object> it = this.f38796l.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void c() {
        Iterator<Object> it = this.f38796l.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private q() {
    }

    public static q a() {
        MethodCollector.i(11129);
        if (f38786j == null) {
            synchronized (q.class) {
                try {
                    if (f38786j == null) {
                        f38786j = new q();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11129);
                    throw th;
                }
            }
        }
        q qVar = f38786j;
        MethodCollector.o(11129);
        return qVar;
    }

    private void a(a<s> aVar) {
        s sVar = this.f38789c;
        if (sVar != null) {
            aVar.a(sVar);
        }
    }

    public static void a(boolean z) {
        if (z) {
            bf.b();
            bg.a();
        }
    }

    public final void b(final h hVar) {
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId())) {
            b(hVar.getConversationId(), new a<r>() {
                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass18 */

                static {
                    Covode.recordClassIndex(23150);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.utils.q.a
                public final /* bridge */ /* synthetic */ void a(r rVar) {
                    rVar.a(hVar);
                }
            });
        }
    }

    public final void c(final h hVar) {
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId())) {
            b(hVar.getConversationId(), new a<r>() {
                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass19 */

                static {
                    Covode.recordClassIndex(23151);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.utils.q.a
                public final /* synthetic */ void a(r rVar) {
                    rVar.d(hVar);
                }
            });
        }
    }

    public final void a(int i2) {
        f.b("imsdk", "handleInitMessageEnd:".concat(String.valueOf(i2)), (Throwable) null);
        d.a();
        com.bytedance.im.core.internal.b.a.f38237k.add(Integer.valueOf(i2));
        if (e.b() == com.bytedance.im.core.internal.b.a.f38237k.size()) {
            f.b("imsdk", "all inbox message init end", (Throwable) null);
            f38785i = true;
        }
        if (!com.bytedance.im.core.internal.b.a.k(i2)) {
            b(i2);
        }
        d.a().f();
    }

    public final void b(int i2) {
        f.b("imsdk", "onInitEnd:".concat(String.valueOf(i2)), (Throwable) null);
        d.a();
        com.bytedance.im.core.internal.b.a.f38238l.add(Integer.valueOf(i2));
        if (e.b() == com.bytedance.im.core.internal.b.a.f38238l.size() && !d.a().f37562b.o()) {
            f.b("imsdk", "all inbox init end", (Throwable) null);
            if (com.bytedance.im.core.internal.a.m()) {
                com.bytedance.im.core.f.a.e();
            } else {
                new n(new b<Void>() {
                    /* class com.bytedance.im.core.internal.utils.q.AnonymousClass17 */

                    static {
                        Covode.recordClassIndex(23149);
                    }

                    @Override // com.bytedance.im.core.a.a.b
                    public final void a(u uVar) {
                        com.bytedance.im.core.f.a.e();
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.im.core.a.a.b
                    public final /* synthetic */ void a(Void r1) {
                        com.bytedance.im.core.f.a.e();
                    }
                }).c();
            }
        }
    }

    public final void a(final ai aiVar) {
        if (aiVar != null && !TextUtils.isEmpty(aiVar.getConversationId())) {
            a(aiVar.getConversationId(), new a<v>() {
                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(23163);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.utils.q.a
                public final /* bridge */ /* synthetic */ void a(v vVar) {
                    vVar.a(aiVar);
                }
            });
        }
    }

    public final void b(final List<ah> list) {
        if (list != null && !list.isEmpty()) {
            a(new a<s>() {
                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass15 */

                static {
                    Covode.recordClassIndex(23147);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.utils.q.a
                public final /* bridge */ /* synthetic */ void a(s sVar) {
                    sVar.a(list);
                }
            });
        }
    }

    public final void b(String str, final List<ai> list) {
        if (!TextUtils.isEmpty(str)) {
            a(str, new a<v>() {
                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(23164);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.utils.q.a
                public final /* bridge */ /* synthetic */ void a(v vVar) {
                    vVar.a(list, true);
                }
            });
        }
    }

    public final void c(String str, final List<ai> list) {
        if (!TextUtils.isEmpty(str)) {
            a(str, new a<v>() {
                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass10 */

                static {
                    Covode.recordClassIndex(23142);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.utils.q.a
                public final /* synthetic */ void a(v vVar) {
                    vVar.b(list, true);
                }
            });
        }
    }

    public final void c(String str, a<com.bytedance.im.core.d.q> aVar) {
        List<com.bytedance.im.core.d.q> list = this.f38791e.get(str);
        if (!(list == null || list.isEmpty())) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                com.bytedance.im.core.d.q qVar = list.get(i2);
                if (qVar != null) {
                    aVar.a(qVar);
                }
            }
        }
    }

    public final void b(String str, v vVar) {
        List<v> list = this.f38795k.get(str);
        if (list != null) {
            list.remove(vVar);
            this.f38795k.put(str, list);
        }
    }

    public final void a(final int i2, final an anVar) {
        if (anVar != null && !TextUtils.isEmpty(anVar.getConversationId())) {
            a(anVar.getConversationId(), new a<v>() {
                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass13 */

                static {
                    Covode.recordClassIndex(23145);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.utils.q.a
                public final /* bridge */ /* synthetic */ void a(v vVar) {
                    vVar.a(i2, anVar);
                }
            });
        }
    }

    public final void b(String str, a<r> aVar) {
        List<r> list = this.f38790d.get(str);
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                aVar.a(list.get(i2));
            }
        }
        r rVar = this.f38788b;
        if (rVar != null) {
            aVar.a(rVar);
        }
    }

    public final void a(final ai aiVar, final boolean z) {
        if (aiVar != null && !TextUtils.isEmpty(aiVar.getConversationId())) {
            a(aiVar.getConversationId(), new a<v>() {
                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(23160);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.utils.q.a
                public final /* bridge */ /* synthetic */ void a(v vVar) {
                    vVar.a(aiVar, z);
                }
            });
        }
    }

    public final void a(int i2, int i3, ai aiVar) {
        for (x xVar : this.f38793g) {
            if (xVar != null) {
                xVar.a(i2, i3, aiVar);
            }
        }
    }

    public final void a(final int i2, final ai aiVar, final ay ayVar) {
        if (aiVar != null && !TextUtils.isEmpty(aiVar.getConversationId())) {
            a(aiVar.getConversationId(), new a<v>() {
                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(23159);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.utils.q.a
                public final /* bridge */ /* synthetic */ void a(v vVar) {
                    vVar.a(i2, aiVar, ayVar);
                }
            });
        }
    }
}
