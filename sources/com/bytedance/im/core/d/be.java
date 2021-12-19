package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.a.p;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.b.a.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class be {

    /* renamed from: a  reason: collision with root package name */
    public static be f37893a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, Long> f37894b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, e> f37895c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public Map<String, Boolean> f37896d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public p f37897e;

    /* renamed from: f  reason: collision with root package name */
    private Set<Object> f37898f = new CopyOnWriteArraySet();

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f37899g = false;

    static {
        Covode.recordClassIndex(22734);
    }

    private be() {
    }

    public static be a() {
        MethodCollector.i(12625);
        if (f37893a == null) {
            synchronized (be.class) {
                try {
                    if (f37893a == null) {
                        f37893a = new be();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12625);
                    throw th;
                }
            }
        }
        be beVar = f37893a;
        MethodCollector.o(12625);
        return beVar;
    }

    public final void b() {
        if (!this.f37898f.isEmpty()) {
            f.b("imsdk", "UnReadCountHelpernotify unread map update", (Throwable) null);
            Iterator<Object> it = this.f37898f.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        f.b("imsdk", "UnReadCountHelpershould add unread observer", (Throwable) null);
    }

    public final int c() {
        int i2 = 0;
        for (Map.Entry<String, Long> entry : this.f37894b.entrySet()) {
            if (entry.getValue().longValue() > 0) {
                i2 = (int) (((long) i2) + entry.getValue().longValue());
            }
        }
        return i2;
    }

    public final void a(String str) {
        this.f37894b.remove(str);
        this.f37896d.remove(str);
        this.f37895c.remove(str);
    }

    public final void c(h hVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hVar);
        a((List<h>) arrayList, true);
    }

    public final void a(h hVar) {
        this.f37894b.remove(hVar.getConversationId());
        this.f37895c.remove(hVar.getConversationId());
        this.f37896d.remove(hVar.getConversationId());
        b();
    }

    public final void b(h hVar) {
        this.f37894b.remove(hVar.getConversationId());
        this.f37895c.remove(hVar.getConversationId());
        this.f37896d.remove(hVar.getConversationId());
        b();
    }

    public final void a(List<h> list) {
        a(list, false);
        if (!this.f37899g && d.a().b().T && !d.a().f37562b.n()) {
            this.f37899g = true;
            x.a();
            x.a((long) c());
        }
    }

    public static long a(h hVar, p pVar) {
        long unreadCount;
        String concat;
        if (hVar == null) {
            f.a("imsdk", "UnReadCountHelpercalculateUnreadCount, conversation is null", (Throwable) null);
            return 0;
        }
        if (pVar != null) {
            unreadCount = pVar.a();
        } else if (hVar.isMute()) {
            return 0;
        } else {
            unreadCount = hVar.getUnreadCount();
        }
        if (unreadCount <= 0) {
            return unreadCount;
        }
        StringBuilder sb = new StringBuilder("UnReadCountHelpercalculateUnreadCount by ");
        if (pVar == null) {
            concat = "default";
        } else {
            concat = "calculator:".concat(String.valueOf(pVar));
        }
        f.a("imsdk", sb.append(concat).append(", cid:").append(hVar.getConversationId()).append(", unreadCount:").append(unreadCount).toString(), (Throwable) null);
        return unreadCount;
    }

    public final void a(List<h> list, boolean z) {
        e b2;
        if (list == null || list.isEmpty()) {
            f.b("imsdk", "UnReadCountHelperconversationList is empty", (Throwable) null);
            return;
        }
        for (h hVar : list) {
            if (hVar != null) {
                a();
                long a2 = a(hVar, this.f37897e);
                p pVar = this.f37897e;
                if (!(pVar == null || (b2 = pVar.b()) == null)) {
                    this.f37895c.put(hVar.getConversationId(), b2);
                }
                if (a2 > 0) {
                    this.f37894b.put(hVar.getConversationId(), Long.valueOf(a2));
                } else {
                    this.f37894b.remove(hVar.getConversationId());
                }
                p pVar2 = this.f37897e;
                if (pVar2 != null) {
                    boolean c2 = pVar2.c();
                    f.a("imsdk", "UnReadCountHelpernotify, conversationID:" + hVar.getConversationId() + ", shouldNotify:" + c2, (Throwable) null);
                    this.f37896d.put(hVar.getConversationId(), Boolean.valueOf(c2));
                }
            }
        }
        if (z) {
            b();
        }
    }
}
