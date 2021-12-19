package com.bytedance.im.core.d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.b.b;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.d.f;
import com.bytedance.im.core.i.f;
import com.bytedance.im.core.internal.a.i;
import com.bytedance.im.core.internal.b.a.s;
import com.bytedance.im.core.internal.b.a.x;
import com.bytedance.im.core.internal.c.a;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.internal.utils.u;
import com.bytedance.im.core.internal.utils.v;
import com.bytedance.im.core.proto.ConversationType;
import com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody;
import com.bytedance.im.core.proto.GetUserConversationListRequestBody;
import com.bytedance.im.core.proto.ParticipantMinIndex;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.SortType;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

public final class j {

    /* renamed from: l  reason: collision with root package name */
    private static j f37958l;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, h> f37959a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, h> f37960b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public boolean f37961c = false;

    /* renamed from: d  reason: collision with root package name */
    public Set<String> f37962d = new CopyOnWriteArraySet();

    /* renamed from: e  reason: collision with root package name */
    public Set<p> f37963e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    public boolean f37964f = false;

    /* renamed from: g  reason: collision with root package name */
    public Set<Object> f37965g = new CopyOnWriteArraySet();

    /* renamed from: h  reason: collision with root package name */
    public boolean f37966h;

    /* renamed from: i  reason: collision with root package name */
    public long f37967i;

    /* renamed from: j  reason: collision with root package name */
    public long f37968j;

    /* renamed from: k  reason: collision with root package name */
    public long f37969k;

    static {
        Covode.recordClassIndex(22765);
    }

    public final void a(boolean z) {
        if (!d.a().b().ae || !d.a().f37565e) {
            c(z);
        } else {
            b(z);
        }
    }

    public final void a(h hVar) {
        if (hVar != null) {
            if (hVar.isStranger()) {
                f.a().b(hVar);
                return;
            } else if (b.b() && b.a().b(hVar)) {
                return;
            }
        }
        a(hVar);
        e(hVar);
    }

    public final void a(h hVar, int i2) {
        if (hVar != null) {
            com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel onUpdateConversation, cid:" + hVar.getConversationId() + ", reason:" + i2 + ", isStranger:" + hVar.isStranger() + ", isInBox:" + hVar.isInBox(), (Throwable) null);
            f(hVar);
            if (hVar.isStranger()) {
                f.a().a(hVar, i2);
            } else if (!b.b() || !b.a().a(hVar)) {
                a(hVar);
                q.a().a(hVar, i2);
                for (p pVar : this.f37963e) {
                    pVar.a(hVar, i2);
                }
                be.a().c(hVar);
            }
        }
    }

    public final void a(boolean z, final int i2, final h... hVarArr) {
        if (hVarArr != null && hVarArr.length > 0) {
            com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel onUpdateConversation, conversations:" + hVarArr.length + ", reason:" + i2, (Throwable) null);
            for (final h hVar : hVarArr) {
                f(hVar);
                if (hVar != null && hVar.isStranger()) {
                    f.a().a(hVar, i2);
                } else if (!b.b() || hVar == null || !b.a().a(hVar)) {
                    if (z) {
                        e(hVar);
                    }
                    if (hVar != null) {
                        final String conversationId = hVar.getConversationId();
                        final h hVar2 = this.f37959a.get(conversationId);
                        if (i2 != 5 || hVar2 == null || hVar2.isStickTop() == hVar.isStickTop()) {
                            a(hVar);
                            q.a().a(hVar, i2);
                            for (p pVar : this.f37963e) {
                                pVar.a(hVar, i2);
                            }
                            be.a().a(Arrays.asList(hVarArr), true);
                        } else {
                            com.bytedance.im.core.internal.e.d.a(new c<h>() {
                                /* class com.bytedance.im.core.d.j.AnonymousClass6 */

                                static {
                                    Covode.recordClassIndex(22777);
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                @Override // com.bytedance.im.core.internal.e.c
                                public final /* synthetic */ h a() {
                                    if (!d.a().b().E || hVar2.getLastMessage() == null) {
                                        hVar.setUpdatedTime(System.currentTimeMillis());
                                    } else {
                                        hVar.setUpdatedTime(hVar2.getLastMessage().getCreatedAt());
                                    }
                                    com.bytedance.im.core.internal.a.c.a(conversationId, hVar.getUpdatedTime());
                                    com.bytedance.im.core.internal.a.c.c(hVar);
                                    return hVar;
                                }
                            }, new com.bytedance.im.core.internal.e.b<h>() {
                                /* class com.bytedance.im.core.d.j.AnonymousClass7 */

                                static {
                                    Covode.recordClassIndex(22778);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.bytedance.im.core.internal.e.b
                                public final /* synthetic */ void a(h hVar) {
                                    h hVar2 = hVar;
                                    j.this.a(hVar2);
                                    q.a().a(hVar2, i2);
                                    for (p pVar : j.this.f37963e) {
                                        pVar.a(hVar2, i2);
                                    }
                                    be.a().a(Arrays.asList(hVarArr), true);
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    public final void a(String str, List<ah> list) {
        q.a().a(str, list);
        for (p pVar : this.f37963e) {
            pVar.a(str, list);
        }
    }

    public final synchronized void a(h... hVarArr) {
        MethodCollector.i(12283);
        if (hVarArr != null && hVarArr.length > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            for (h hVar : hVarArr) {
                if (hVar != null) {
                    String conversationId = hVar.getConversationId();
                    stringBuffer.append(conversationId).append("_");
                    if (this.f37959a.get(conversationId) != null && this.f37959a.get(conversationId).getUpdatedTime() > hVar.getUpdatedTime()) {
                        com.bytedance.im.core.c.f.b("ConversationListModel insertOrUpdateConversation, replace by smaller updateTime, cid:", conversationId, (Throwable) null);
                    }
                    this.f37959a.put(conversationId, hVar);
                }
            }
            com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel insertOrUpdateConversation size:" + hVarArr.length + ", ids:" + ((Object) stringBuffer), (Throwable) null);
        }
        if (d.a().b().I) {
            u.a().c();
        }
        MethodCollector.o(12283);
    }

    public final synchronized Map<String, h> c() {
        Map<String, h> map;
        MethodCollector.i(11816);
        map = this.f37959a;
        MethodCollector.o(11816);
        return map;
    }

    public static j a() {
        MethodCollector.i(11653);
        if (f37958l == null) {
            synchronized (j.class) {
                try {
                    if (f37958l == null) {
                        f37958l = new j();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11653);
                    throw th;
                }
            }
        }
        j jVar = f37958l;
        MethodCollector.o(11653);
        return jVar;
    }

    private synchronized List<h> f() {
        ArrayList arrayList;
        MethodCollector.i(11979);
        arrayList = new ArrayList();
        for (h hVar : this.f37959a.values()) {
            d.a();
            arrayList.add(hVar);
        }
        com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel filterShowList:" + arrayList.size(), (Throwable) null);
        MethodCollector.o(11979);
        return arrayList;
    }

    public final synchronized List<h> b() {
        List<h> f2;
        MethodCollector.i(11655);
        com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel getAllConversationSync", (Throwable) null);
        f2 = f();
        if (f2.size() > 0) {
            a(f2);
        }
        MethodCollector.o(11655);
        return f2;
    }

    public final List<h> d() {
        long uptimeMillis = SystemClock.uptimeMillis();
        com.bytedance.im.core.a.f b2 = d.a().b();
        if (b2 != null) {
            i.b(b2.M);
        }
        List<h> b3 = com.bytedance.im.core.internal.a.c.b();
        b.a();
        b.d();
        be.a().a(b3);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
            e.a("im_sync_conversation_list_duration", jSONObject);
        } catch (Exception unused) {
        }
        this.f37968j = SystemClock.uptimeMillis() - uptimeMillis;
        this.f37964f = true;
        int i2 = d.a().b().V;
        com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel syncConversionList, totalCount:" + Integer.valueOf(b3.size()) + ", limit:" + i2, (Throwable) null);
        if (b3.isEmpty()) {
            return new ArrayList();
        }
        if (i2 > 0 && b3.size() > i2) {
            a(b3);
            b3 = b3.subList(0, i2);
            this.f37964f = false;
        }
        b(b3);
        return b3;
    }

    public final List<h> e() {
        long uptimeMillis = SystemClock.uptimeMillis();
        com.bytedance.im.core.a.f b2 = d.a().b();
        if (b2 != null) {
            i.b(b2.M);
        }
        List<h> b3 = com.bytedance.im.core.internal.a.c.b();
        b.a();
        b.d();
        be.a().a(b3);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
            e.a("im_pre_sync_conversation_list_duration", jSONObject);
        } catch (Exception unused) {
        }
        this.f37968j = SystemClock.uptimeMillis() - uptimeMillis;
        long uptimeMillis2 = SystemClock.uptimeMillis();
        int i2 = d.a().b().W;
        com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel preSyncConversionList, totalCount:" + Integer.valueOf(b3.size()) + ", limit:" + i2, (Throwable) null);
        if (b3.isEmpty()) {
            this.f37964f = true;
            this.f37966h = false;
            this.f37967i = Long.MAX_VALUE;
            this.f37969k = -1;
            return new ArrayList();
        } else if (i2 > 0) {
            a(b3);
            if (b3.size() > i2) {
                b3 = b3.subList(0, i2);
                this.f37964f = false;
                this.f37966h = true;
                this.f37967i = b3.get(i2 - 1).getSortOrder();
            } else {
                this.f37964f = true;
                this.f37966h = false;
                this.f37967i = b3.get(b3.size() - 1).getSortOrder();
            }
            b(b3);
            this.f37969k = SystemClock.uptimeMillis() - uptimeMillis2;
            return b3;
        } else {
            this.f37964f = false;
            this.f37966h = true;
            this.f37967i = Long.MAX_VALUE;
            this.f37969k = -1;
            return new ArrayList();
        }
    }

    public static void b(String str) {
        x.a();
        x.a(str);
    }

    private void f(final h hVar) {
        if (hVar != null && hVar.getSortOrder() != com.bytedance.im.core.internal.a.c.d(hVar)) {
            com.bytedance.im.core.internal.e.d.a(new c<Boolean>() {
                /* class com.bytedance.im.core.d.j.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(22776);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ Boolean a() {
                    return Boolean.valueOf(com.bytedance.im.core.internal.a.c.b(hVar.getConversationId(), hVar.getSortOrder()));
                }
            }, (com.bytedance.im.core.internal.e.b) null);
        }
    }

    public final void a(p pVar) {
        if (pVar != null) {
            com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel addObserver:".concat(String.valueOf(pVar)), (Throwable) null);
            this.f37963e.add(pVar);
        }
    }

    public final boolean c(String str) {
        if (TextUtils.isEmpty(str) || !this.f37962d.contains(str)) {
            return false;
        }
        return true;
    }

    private void b(final boolean z) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f37961c) {
            com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel preAsync already isSyncing", (Throwable) null);
            return;
        }
        this.f37961c = true;
        com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel start preAsync", (Throwable) null);
        com.bytedance.im.core.internal.e.d.a(new c<List<h>>() {
            /* class com.bytedance.im.core.d.j.AnonymousClass10 */

            static {
                Covode.recordClassIndex(22767);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ List<h> a() {
                return j.this.e();
            }
        }, new com.bytedance.im.core.internal.e.b<List<h>>() {
            /* class com.bytedance.im.core.d.j.AnonymousClass11 */

            static {
                Covode.recordClassIndex(22768);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(List<h> list) {
                List<h> list2 = list;
                com.bytedance.im.core.g.b.a(true, list2.size(), z, SystemClock.uptimeMillis() - uptimeMillis, j.this.f37968j, j.this.f37969k);
                if (b.b()) {
                    b.a().c();
                }
                if (!j.this.f37965g.isEmpty()) {
                    com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel preAsync onCallback IConversationPageListObserver", (Throwable) null);
                    Iterator<h> it = list2.iterator();
                    while (it.hasNext()) {
                        it.next();
                        d.a();
                    }
                    Iterator<Object> it2 = j.this.f37965g.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
                if (!j.this.f37963e.isEmpty()) {
                    com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel preAsync onCallback IConversationListObserver", (Throwable) null);
                    for (p pVar : j.this.f37963e) {
                        pVar.a(j.this.f37959a);
                    }
                }
                be.a().b();
                j.this.f37961c = false;
                a.a().c();
            }
        });
    }

    private void c(final boolean z) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f37961c) {
            com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel async, already isSyncing", (Throwable) null);
            return;
        }
        this.f37961c = true;
        com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel start async", (Throwable) null);
        com.bytedance.im.core.internal.e.d.a(new c<List<h>>() {
            /* class com.bytedance.im.core.d.j.AnonymousClass12 */

            static {
                Covode.recordClassIndex(22769);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ List<h> a() {
                return j.this.d();
            }
        }, new com.bytedance.im.core.internal.e.b<List<h>>() {
            /* class com.bytedance.im.core.d.j.AnonymousClass13 */

            static {
                Covode.recordClassIndex(22770);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(List<h> list) {
                com.bytedance.im.core.g.b.a(false, list.size(), z, SystemClock.uptimeMillis() - uptimeMillis, j.this.f37968j, 0);
                if (b.b()) {
                    b.a().c();
                }
                if (!j.this.f37963e.isEmpty()) {
                    com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel async onCallback", (Throwable) null);
                    for (p pVar : j.this.f37963e) {
                        pVar.a(j.this.f37959a);
                    }
                }
                be.a().b();
                j.this.f37961c = false;
                a.a().c();
                d a2 = d.a();
                l.a((Object) a2, "");
                if (a2.b().aJ) {
                    v.b(f.c.f37956a);
                }
            }
        });
    }

    private void d(String str) {
        this.f37959a.remove(str);
        be.a().a(str);
        this.f37960b.remove(str);
        if (d.a().b().I) {
            u.a().c();
        }
    }

    private void e(h hVar) {
        if (hVar != null && this.f37961c) {
            com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel recordConversationWhileSyncing:" + hVar.getConversationId(), (Throwable) null);
            this.f37960b.put(hVar.getConversationId(), hVar);
        }
    }

    private void b(List<h> list) {
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (h hVar : list) {
                if ("0".equals(hVar.getConversationId())) {
                    com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel updateLoadedListToMemory dirty conversation", (Throwable) null);
                    arrayList.add(hVar);
                    e.a("im_dirty_sync", hVar.getConversationId());
                }
            }
            if (!arrayList.isEmpty()) {
                list.removeAll(arrayList);
            }
            c(list);
            this.f37959a.putAll(this.f37960b);
            this.f37960b.clear();
            a((Collection<h>) list);
        }
    }

    public final void d(h hVar) {
        if (hVar != null) {
            com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel onDissolveConversation:" + hVar.getConversationId(), (Throwable) null);
            if (this.f37959a.containsKey(hVar.getConversationId())) {
                this.f37959a.put(hVar.getConversationId(), hVar);
            }
            q.a().c(hVar);
            for (p pVar : this.f37963e) {
                pVar.d(hVar);
            }
            be.a().b(hVar);
        }
    }

    private synchronized void a(Collection<h> collection) {
        MethodCollector.i(12131);
        if (collection == null || collection.isEmpty()) {
            MethodCollector.o(12131);
            return;
        }
        for (h hVar : collection) {
            if (hVar != null && hVar.isWaitingInfo()) {
                com.bytedance.im.core.c.f.b("imsdk", "retryWaitingInfoConversations - " + hVar.getConversationId(), (Throwable) null);
                com.bytedance.im.core.internal.b.a.a(hVar.getInboxType(), hVar.getConversationId(), hVar.getConversationShortId(), hVar.getConversationType(), hVar.getUpdatedTime());
            }
        }
        com.bytedance.im.core.internal.b.a.a();
        MethodCollector.o(12131);
    }

    private synchronized void c(List<h> list) {
        MethodCollector.i(12432);
        if (list != null && !list.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            for (h hVar : list) {
                if (hVar != null) {
                    String conversationId = hVar.getConversationId();
                    stringBuffer.append(conversationId).append("_");
                    if (this.f37959a.get(conversationId) != null && this.f37959a.get(conversationId).getUpdatedTime() > hVar.getUpdatedTime()) {
                        com.bytedance.im.core.c.f.b("ConversationListModel insertOrUpdateConversation, replace by smaller updateTime, cid:", conversationId, (Throwable) null);
                    }
                    this.f37959a.put(conversationId, hVar);
                }
            }
            com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel insertOrUpdateConversation size:" + list.size() + ", ids:" + ((Object) stringBuffer), (Throwable) null);
        }
        if (d.a().b().I) {
            u.a().c();
        }
        MethodCollector.o(12432);
    }

    private static void a(List<h> list) {
        if (list != null && !list.isEmpty()) {
            if (!d.a().b().ae || !d.a().f37565e) {
                Collections.sort(list, d.a().f37566f);
            } else {
                Collections.sort(list, new Comparator<h>() {
                    /* class com.bytedance.im.core.d.j.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(22766);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(h hVar, h hVar2) {
                        long sortOrder = hVar2.getSortOrder() - hVar.getSortOrder();
                        if (sortOrder > 0) {
                            return 1;
                        }
                        if (sortOrder < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
            }
        }
    }

    public final void b(h hVar) {
        if (hVar != null) {
            com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel onDeleteConversation:" + hVar.getConversationId() + ", isStranger:" + hVar.isStranger() + ", isInBox:" + hVar.isInBox(), (Throwable) null);
            if (hVar.isStranger()) {
                com.bytedance.im.core.i.f.a().a(hVar);
            } else if (!b.b() || !hVar.isInBox()) {
                d(hVar.getConversationId());
                q.a().a(hVar);
                be.a().a(hVar);
                for (p pVar : this.f37963e) {
                    pVar.b(hVar);
                }
            } else {
                b.a().c(hVar);
            }
        }
    }

    public final void c(h hVar) {
        if (hVar != null) {
            com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel onCreateConversation:" + hVar.getConversationId() + ", isStranger:" + hVar.isStranger() + ", isInBox:" + hVar.isInBox(), (Throwable) null);
            if (hVar.isStranger()) {
                d(hVar.getConversationId());
                com.bytedance.im.core.i.f.a().b(hVar);
                return;
            }
            if (b.b() && hVar.isInBox()) {
                if (hVar.isInBox()) {
                    d(hVar.getConversationId());
                    b.a().b(hVar);
                    return;
                }
                b.a().b(hVar);
            }
            a(hVar);
            q.a().b(hVar);
            for (p pVar : this.f37963e) {
                pVar.a(hVar);
            }
        }
    }

    public final h a(String str) {
        h hVar = this.f37959a.get(str);
        if (b.b()) {
            if (hVar != null) {
                return hVar;
            }
            hVar = b.a().a(str);
        }
        if (hVar == null) {
            return com.bytedance.im.core.i.f.a().a(str);
        }
        return hVar;
    }

    public final void a(int i2, h... hVarArr) {
        a(false, i2, hVarArr);
    }

    public static void a(String str, com.bytedance.im.core.a.a.b<List<ParticipantMinIndex>> bVar) {
        x.a();
        com.bytedance.im.core.internal.b.a.q qVar = new com.bytedance.im.core.internal.b.a.q(bVar);
        h a2 = a().a(str);
        if (a2 == null || a2.isLocal()) {
            qVar.b(k.a(-1017));
            return;
        }
        RequestBody build = new RequestBody.Builder().participants_min_index_body(new GetConversationParticipantsMinIndexV3RequestBody.Builder().conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).conversation_id(a2.getConversationId()).build()).build();
        qVar.a(a2.getInboxType(), build, null, a2);
    }

    public final void b(final String str, final com.bytedance.im.core.a.a.b<h> bVar) {
        com.bytedance.im.core.c.f.b("imsdk", "ConversationListModel getConversation async", (Throwable) null);
        h a2 = a(str);
        if (a2 == null) {
            com.bytedance.im.core.internal.e.d.a(new c<h>() {
                /* class com.bytedance.im.core.d.j.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(22779);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* bridge */ /* synthetic */ h a() {
                    return com.bytedance.im.core.internal.a.c.a(str, true);
                }
            }, new com.bytedance.im.core.internal.e.b<h>() {
                /* class com.bytedance.im.core.d.j.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(22780);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(h hVar) {
                    h hVar2 = hVar;
                    if (hVar2 != null) {
                        if (hVar2.isStranger()) {
                            com.bytedance.im.core.i.f.a().b(hVar2);
                        } else if (!b.b() || !b.a().b(hVar2)) {
                            j.this.a(hVar2);
                        }
                    }
                    com.bytedance.im.core.a.a.b bVar = bVar;
                    if (bVar != null) {
                        bVar.a(hVar2);
                    }
                }
            });
        } else if (bVar != null) {
            bVar.a(a2);
        }
    }

    public final synchronized void a(long j2, SortType sortType, Boolean bool, com.bytedance.im.core.a.a.a<List<h>> aVar) {
        MethodCollector.i(11815);
        x.a();
        s sVar = new s(aVar, 1);
        GetUserConversationListRequestBody.Builder cursor = new GetUserConversationListRequestBody.Builder().con_type(ConversationType.GROUP_CHAT).cursor(Long.valueOf(j2));
        if (sortType == null) {
            sortType = SortType.JOIN_TIME;
        }
        GetUserConversationListRequestBody.Builder sort_type = cursor.sort_type(sortType);
        if (bool != null) {
            sort_type.include_removed_group(bool);
        }
        sVar.a(sVar.f38557a, new RequestBody.Builder().get_conversation_list_body(sort_type.build()).build(), null, new Object[0]);
        MethodCollector.o(11815);
    }
}
