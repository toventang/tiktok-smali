package com.bytedance.im.core.i;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.i.a.a;
import com.bytedance.im.core.i.a.c;
import com.bytedance.im.core.internal.b.a.x;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageType;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static int f38150a;

    /* renamed from: g  reason: collision with root package name */
    private static volatile f f38151g;

    /* renamed from: b  reason: collision with root package name */
    public e f38152b;

    /* renamed from: c  reason: collision with root package name */
    public b f38153c;

    /* renamed from: d  reason: collision with root package name */
    public int f38154d;

    /* renamed from: e  reason: collision with root package name */
    public LruCache<String, h> f38155e = new LruCache<>(d.a().b().ad);

    /* renamed from: f  reason: collision with root package name */
    public Set<String> f38156f = new CopyOnWriteArraySet();

    static {
        Covode.recordClassIndex(22855);
    }

    public final void a(String str, b<List<ai>> bVar) {
        h a2 = a(str);
        if (a2 == null) {
            com.bytedance.im.core.c.f.b("imsdk", "StrangerManager fetchStrangerMessages, but conversation is null, cid:".concat(String.valueOf(str)), (Throwable) null);
            bVar.a((u) null);
            return;
        }
        com.bytedance.im.core.c.f.b("imsdk", "StrangerManager fetchStrangerMessages, cid:".concat(String.valueOf(str)), (Throwable) null);
        new c(bVar).a(a2.getInboxType(), a2.getConversationShortId());
    }

    public final void a(h hVar, int i2) {
        String conversationId;
        StringBuilder sb = new StringBuilder("StrangerManager onUpdateConversation:");
        if (hVar == null) {
            conversationId = null;
        } else {
            conversationId = hVar.getConversationId();
        }
        com.bytedance.im.core.c.f.b("imsdk", sb.append(conversationId).append(", reason:").append(i2).toString(), (Throwable) null);
        if (hVar != null) {
            this.f38155e.put(hVar.getConversationId(), hVar);
        }
        e eVar = this.f38152b;
        if (eVar != null) {
            eVar.a(hVar, i2);
        }
    }

    private f() {
    }

    public final void b() {
        com.bytedance.im.core.c.f.b("imsdk", "StrangerManager getStrangerBox, notifyUpdate:true", (Throwable) null);
        new a(new com.bytedance.im.core.a.a.a<List<h>>(true) {
            /* class com.bytedance.im.core.i.f.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f38165a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f38166b = true;

            static {
                Covode.recordClassIndex(22859);
            }

            @Override // com.bytedance.im.core.a.a.b
            public final void a(u uVar) {
                com.bytedance.im.core.c.f.b("imsdk", "StrangerManager getStrangerBox onFailure", (Throwable) null);
                f.this.a(this.f38165a, this.f38166b);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, long, boolean] */
            @Override // com.bytedance.im.core.a.a.a
            public final /* synthetic */ void a(List<h> list, long j2, boolean z) {
                Integer valueOf;
                List<h> list2 = list;
                StringBuilder sb = new StringBuilder("StrangerManager getStrangerBox onSuccess, result:");
                if (list2 == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(list2.size());
                }
                com.bytedance.im.core.c.f.b("imsdk", sb.append(valueOf).toString(), (Throwable) null);
                f.this.a(this.f38165a, this.f38166b);
            }
        }).a(f38150a, 0L, 1L, true);
    }

    public static f a() {
        MethodCollector.i(9732);
        if (f38151g == null) {
            synchronized (com.bytedance.im.core.f.a.class) {
                try {
                    if (f38151g == null) {
                        f38151g = new f();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9732);
                    throw th;
                }
            }
        }
        f fVar = f38151g;
        MethodCollector.o(9732);
        return fVar;
    }

    public static boolean a(MessageBody messageBody) {
        if (messageBody == null || messageBody.message_type.intValue() != MessageType.MESSAGE_TYPE_MODE_CHANGE.getValue()) {
            return false;
        }
        return true;
    }

    public final void b(h hVar) {
        String conversationId;
        StringBuilder sb = new StringBuilder("StrangerManager updateMemoryConversation:");
        if (hVar == null) {
            conversationId = null;
        } else {
            conversationId = hVar.getConversationId();
        }
        com.bytedance.im.core.c.f.b("imsdk", sb.append(conversationId).toString(), (Throwable) null);
        if (hVar != null) {
            this.f38155e.put(hVar.getConversationId(), hVar);
        }
        e eVar = this.f38152b;
        if (eVar != null) {
            eVar.b(hVar);
        }
    }

    public final h a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        h hVar = this.f38155e.get(str);
        if (hVar == null) {
            e eVar = this.f38152b;
            if (eVar == null || (hVar = eVar.a(str)) == null) {
                com.bytedance.im.core.c.f.b("imsdk", "StrangerManager getConversation null ".concat(String.valueOf(str)), (Throwable) null);
            } else {
                this.f38155e.put(str, hVar);
            }
        }
        return hVar;
    }

    public final void b(String str) {
        com.bytedance.im.core.c.f.b("imsdk", "StrangerManager onStrangerTransferred:".concat(String.valueOf(str)), (Throwable) null);
        this.f38156f.remove(str);
        e eVar = this.f38152b;
        if (eVar != null) {
            com.bytedance.im.core.c.f.b("imsdk", "StrangerListModel onStrangerTransfer: ".concat(String.valueOf(str)), (Throwable) null);
            eVar.f38135b.remove(str);
        }
    }

    public final void a(h hVar) {
        String conversationId;
        StringBuilder sb = new StringBuilder("StrangerManager onDeleteConversation:");
        if (hVar == null) {
            conversationId = null;
        } else {
            conversationId = hVar.getConversationId();
        }
        com.bytedance.im.core.c.f.b("imsdk", sb.append(conversationId).toString(), (Throwable) null);
        if (hVar != null) {
            this.f38155e.remove(hVar.getConversationId());
        }
        e eVar = this.f38152b;
        if (eVar != null) {
            eVar.a(hVar);
        }
        b();
    }

    public final synchronized void a(int i2, MessageBody messageBody) {
        MethodCollector.i(9738);
        if (messageBody != null) {
            a(i2, messageBody.conversation_id, messageBody.conversation_short_id.longValue(), messageBody.conversation_type.intValue());
        }
        MethodCollector.o(9738);
    }

    public final void a(final b<d> bVar, final boolean z) {
        com.bytedance.im.core.c.f.b("imsdk", "StrangerManager loadStrangerBoxFromLocal, notifyUpdate:".concat(String.valueOf(z)), (Throwable) null);
        com.bytedance.im.core.internal.e.d.a(new com.bytedance.im.core.internal.e.c<h>() {
            /* class com.bytedance.im.core.i.f.AnonymousClass4 */

            static {
                Covode.recordClassIndex(22860);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ h a() {
                List<h> a2 = com.bytedance.im.core.internal.a.c.a(f.f38150a, 1);
                if (a2 == null || a2.isEmpty()) {
                    return null;
                }
                return a2.get(0);
            }
        }, new com.bytedance.im.core.internal.e.b<h>() {
            /* class com.bytedance.im.core.i.f.AnonymousClass5 */

            static {
                Covode.recordClassIndex(22861);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(h hVar) {
                d dVar;
                h hVar2 = hVar;
                if (hVar2 == null) {
                    com.bytedance.im.core.c.f.b("imsdk", "StrangerManager loadStrangerBoxFromLocal null", (Throwable) null);
                    dVar = null;
                } else {
                    com.bytedance.im.core.c.f.b("imsdk", "StrangerManager loadStrangerBoxFromLocal, totalUnread:" + f.this.f38154d + ", cid:" + hVar2.getConversationId(), (Throwable) null);
                    dVar = new d(f.this.f38154d, hVar2);
                }
                b bVar = bVar;
                if (bVar != null) {
                    bVar.a(dVar);
                }
                if (z) {
                    f fVar = f.this;
                    com.bytedance.im.core.c.f.b("imsdk", "StrangerManager notifyUpdateStrangerBox", (Throwable) null);
                    if (fVar.f38153c != null) {
                        fVar.f38153c.a(dVar);
                    }
                }
            }
        });
    }

    public final synchronized void a(final int i2, final String str, final long j2, final int i3) {
        MethodCollector.i(9741);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(9741);
            return;
        }
        com.bytedance.im.core.c.f.b("imsdk", "StrangerManager handleStrangerTransfer:".concat(String.valueOf(str)), (Throwable) null);
        if (this.f38156f.contains(str)) {
            com.bytedance.im.core.c.f.b("imsdk", "StrangerManager already transferring, ignore:".concat(String.valueOf(str)), (Throwable) null);
            MethodCollector.o(9741);
            return;
        }
        this.f38156f.add(str);
        h a2 = j.a().a(str);
        if (a2 == null || a2.isStranger()) {
            com.bytedance.im.core.internal.e.d.a(new com.bytedance.im.core.internal.e.c<h>() {
                /* class com.bytedance.im.core.i.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22856);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ h a() {
                    final h a2 = j.a().a(str);
                    if (!(a2 == null && (a2 = com.bytedance.im.core.internal.a.c.a(str, true)) == null)) {
                        if (!a2.isStranger()) {
                            f.this.f38156f.remove(str);
                            com.bytedance.im.core.c.f.b("imsdk", "StrangerManager find db already transferred, ignore:" + str, (Throwable) null);
                            return a2;
                        }
                        com.bytedance.im.core.c.f.b("imsdk", "StrangerManager find db stranger conversation, do transfer", (Throwable) null);
                        com.bytedance.im.core.internal.a.c.f(str);
                        a2.setStranger(false);
                        j.a().a(a2);
                    }
                    f.this.f38155e.remove(str);
                    x.a();
                    x.a(i2, str, j2, i3, new b<h>() {
                        /* class com.bytedance.im.core.i.f.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(22857);
                        }

                        @Override // com.bytedance.im.core.a.a.b
                        public final void a(u uVar) {
                            f.this.b(str);
                            j.a().a(a2, 5);
                            new com.bytedance.im.core.f.a.d(null).a(i2, str, j2, i3, 0);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.im.core.a.a.b
                        public final /* synthetic */ void a(h hVar) {
                            f.this.b(str);
                            new com.bytedance.im.core.f.a.d(null).a(i2, str, j2, i3, 0);
                        }
                    });
                    return a2;
                }
            }, new com.bytedance.im.core.internal.e.b<h>() {
                /* class com.bytedance.im.core.i.f.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(22858);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* bridge */ /* synthetic */ void a(h hVar) {
                    f.this.a(hVar);
                }
            });
            MethodCollector.o(9741);
            return;
        }
        this.f38156f.remove(str);
        com.bytedance.im.core.c.f.b("imsdk", "StrangerManager find memory already transferred, ignore:".concat(String.valueOf(str)), (Throwable) null);
        MethodCollector.o(9741);
    }
}
