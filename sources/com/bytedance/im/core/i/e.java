package com.bytedance.im.core.i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.internal.e.b;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static int f38134a = 10;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, h> f38135b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: c  reason: collision with root package name */
    public c f38136c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f38137d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f38138e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f38139f;

    /* renamed from: g  reason: collision with root package name */
    public volatile long f38140g;

    static {
        Covode.recordClassIndex(22846);
    }

    public final void a() {
        f.b("imsdk", "StrangerListModel loadMoreFromLocal", (Throwable) null);
        if (this.f38135b.isEmpty()) {
            f.b("imsdk", "StrangerListModel loadMoreFromLocal un refreshed", (Throwable) null);
            this.f38137d = false;
            return;
        }
        ArrayList arrayList = new ArrayList(this.f38135b.values());
        final h hVar = (h) arrayList.get(arrayList.size() - 1);
        if (hVar == null) {
            f.b("imsdk", "StrangerListModel loadMoreFromLocal lastConversation null", (Throwable) null);
        } else {
            d.a(new c<List<h>>() {
                /* class com.bytedance.im.core.i.e.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(22853);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ List<h> a() {
                    return com.bytedance.im.core.internal.a.c.a(f.f38150a, e.f38134a, hVar.getUpdatedTime());
                }
            }, new b<List<h>>() {
                /* class com.bytedance.im.core.i.e.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(22854);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(List<h> list) {
                    Integer valueOf;
                    List<h> list2 = list;
                    e.this.f38137d = false;
                    e eVar = e.this;
                    StringBuilder sb = new StringBuilder("StrangerListModel onLoadMoreConversation:");
                    if (list2 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(list2.size());
                    }
                    f.b("imsdk", sb.append(valueOf).toString(), (Throwable) null);
                    eVar.a(list2);
                    if (eVar.f38136c != null) {
                        eVar.f38136c.b(list2, eVar.f38139f);
                    }
                }
            });
        }
    }

    public final h a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f38135b.get(str);
    }

    public final void a(h hVar) {
        String conversationId;
        StringBuilder sb = new StringBuilder("StrangerListModel onDeleteConversation:");
        if (hVar == null) {
            conversationId = null;
        } else {
            conversationId = hVar.getConversationId();
        }
        f.b("imsdk", sb.append(conversationId).toString(), (Throwable) null);
        if (hVar != null) {
            this.f38135b.remove(hVar.getConversationId());
        }
        c cVar = this.f38136c;
        if (cVar != null) {
            cVar.a(hVar);
        }
    }

    public final void b(h hVar) {
        String conversationId;
        StringBuilder sb = new StringBuilder("StrangerListModel updateMemoryConversation:");
        if (hVar == null) {
            conversationId = null;
        } else {
            conversationId = hVar.getConversationId();
        }
        f.b("imsdk", sb.append(conversationId).toString(), (Throwable) null);
        if (hVar != null) {
            this.f38135b.put(hVar.getConversationId(), hVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(List<h> list) {
        if (!(list == null || list.isEmpty())) {
            for (h hVar : list) {
                if (hVar != null) {
                    this.f38135b.put(hVar.getConversationId(), hVar);
                }
            }
        }
    }

    public final void a(h hVar, int i2) {
        String conversationId;
        StringBuilder sb = new StringBuilder("StrangerListModel onUpdateConversation:");
        if (hVar == null) {
            conversationId = null;
        } else {
            conversationId = hVar.getConversationId();
        }
        f.b("imsdk", sb.append(conversationId).append(", reason:").append(i2).toString(), (Throwable) null);
        if (hVar != null && this.f38135b.containsKey(hVar.getConversationId())) {
            this.f38135b.put(hVar.getConversationId(), hVar);
        }
        c cVar = this.f38136c;
        if (cVar != null) {
            cVar.a(hVar, i2);
        }
    }
}
