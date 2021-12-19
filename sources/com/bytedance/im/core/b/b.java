package com.bytedance.im.core.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.a.p;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.be;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.internal.a.c;
import com.bytedance.im.core.internal.utils.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class b {

    /* renamed from: f  reason: collision with root package name */
    private static volatile b f37616f;

    /* renamed from: a  reason: collision with root package name */
    public Set<Object> f37617a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public Set<Object> f37618b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, h> f37619c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public long f37620d;

    /* renamed from: e  reason: collision with root package name */
    public a f37621e = null;

    /* renamed from: g  reason: collision with root package name */
    private p f37622g;

    static {
        Covode.recordClassIndex(22630);
    }

    public static boolean b() {
        return d.a().b().aA;
    }

    public final int e() {
        if (b()) {
            return this.f37619c.size();
        }
        return 0;
    }

    private b() {
    }

    private boolean f() {
        f.b("imsdk", "ConversationBoxManager shouldDisplay", (Throwable) null);
        h h2 = h();
        if (!(h2 == null || h2.getLastMessage() == null)) {
            long max = Math.max(this.f37620d, h2.getLastMessage().getCreatedAt());
            s.a();
            if (max > s.j()) {
                return true;
            }
        }
        return false;
    }

    private a g() {
        if (!b() || this.f37619c.size() <= 0 || !f()) {
            return null;
        }
        f.b("imsdk", "ConversationBoxManager getConversationBox", (Throwable) null);
        return new a(a(new ArrayList(this.f37619c.values())), h());
    }

    public final void c() {
        if (b()) {
            f.b("imsdk", "ConversationBoxManager refreshConversationBox", (Throwable) null);
            this.f37621e = g();
            Iterator<Object> it = this.f37617a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            Iterator<Object> it2 = this.f37618b.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            be.a().b();
        }
    }

    public static b a() {
        MethodCollector.i(11439);
        if (f37616f == null) {
            synchronized (b.class) {
                try {
                    if (f37616f == null) {
                        f37616f = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11439);
                    throw th;
                }
            }
        }
        b bVar = f37616f;
        MethodCollector.o(11439);
        return bVar;
    }

    public static void d() {
        if (b()) {
            f.b("imsdk", "ConversationBoxManager getAllConversationFromDB", (Throwable) null);
            List<h> d2 = c.d();
            if (d2.isEmpty()) {
                return;
            }
            if (d2.isEmpty()) {
                f.b("ConversationBoxManager updateLoadedListToConversationBoxMemory", "conversationList is empty", (Throwable) null);
                return;
            }
            for (h hVar : d2) {
                if ("0".equals(hVar.getConversationId())) {
                    f.b("imsdk", "ConversationBoxManager updateLoadedListToConversationBoxMemory dirty conversation", (Throwable) null);
                    e.a("im_dirty_sync", hVar.getConversationId());
                } else {
                    hVar.setInBox(true);
                    a().b(hVar);
                }
            }
        }
    }

    private h h() {
        h hVar = null;
        f.b("imsdk", "ConversationBoxManager getLatestConversation", (Throwable) null);
        long j2 = 0;
        for (h hVar2 : new ArrayList(this.f37619c.values())) {
            if (hVar2.getLastMessage() != null && j2 < hVar2.getLastMessage().getCreatedAt()) {
                j2 = hVar2.getLastMessage().getCreatedAt();
                hVar = hVar2;
            }
        }
        return hVar;
    }

    private long a(List<h> list) {
        if (list.isEmpty()) {
            f.b("ConversationBoxManager calculateTotalUnread", "conversationList is empty", (Throwable) null);
            return 0;
        }
        f.b("imsdk", "ConversationBoxManager calculateTotalUnread", (Throwable) null);
        long j2 = 0;
        for (h hVar : list) {
            if (hVar != null) {
                be.a();
                long a2 = be.a(hVar, this.f37622g);
                if (a2 > 0) {
                    j2 += a2;
                }
            }
        }
        return j2;
    }

    public final boolean b(h hVar) {
        if (b() && hVar != null) {
            if (hVar.isInBox()) {
                f.b("ConversationBoxManager updateMemoryConversation", "conversation is in box", (Throwable) null);
                if (!this.f37619c.containsKey(hVar.getConversationId())) {
                    j.a().c().remove(hVar.getConversationId());
                }
                this.f37619c.put(hVar.getConversationId(), hVar);
                return true;
            }
            f.b("ConversationBoxManager updateMemoryConversation", "conversation is not in box", (Throwable) null);
            this.f37619c.remove(hVar.getConversationId());
        }
        return false;
    }

    public final void c(h hVar) {
        if (!b() || this.f37621e == null) {
            f.b("ConversationBoxManager deleteConversation", "delete conversation failure", (Throwable) null);
        } else if (hVar != null && this.f37619c.containsKey(hVar.getConversationId())) {
            f.b("imsdk", "ConversationBoxManager deleteConversation", (Throwable) null);
            this.f37619c.remove(hVar.getConversationId());
            this.f37621e.f37614a = a(new ArrayList(this.f37619c.values()));
            this.f37621e.f37615b = h();
            c();
        }
    }

    public final h a(String str) {
        if (!b() || TextUtils.isEmpty(str)) {
            f.b("ConversationBoxManager getConversation", "disable conversationBox or conversation id is empty", (Throwable) null);
            return null;
        }
        h hVar = this.f37619c.get(str);
        if (hVar == null) {
            f.b("imsdk", "ConversationBoxManager getConversation null ".concat(String.valueOf(str)), (Throwable) null);
        }
        return hVar;
    }

    public final boolean a(h hVar) {
        boolean z = false;
        if (b() && hVar != null) {
            if (hVar.isInBox()) {
                f.b("ConversationBoxManager onUpdateConversation", "conversation is in box", (Throwable) null);
                if (!this.f37619c.containsKey(hVar.getConversationId())) {
                    j.a().c().remove(hVar.getConversationId());
                }
                this.f37619c.put(hVar.getConversationId(), hVar);
                z = true;
            } else {
                f.b("ConversationBoxManager onUpdateConversation", "conversation is not in box", (Throwable) null);
                this.f37619c.remove(hVar.getConversationId());
            }
            c();
        }
        return z;
    }
}
