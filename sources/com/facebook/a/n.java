package com.facebook.a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

final class n implements Serializable {
    private static final long serialVersionUID = 20160629001L;
    private HashMap<a, List<c>> events;

    static {
        Covode.recordClassIndex(28540);
    }

    static class a implements Serializable {
        private static final long serialVersionUID = 20160629001L;
        private final HashMap<a, List<c>> proxyEvents;

        static {
            Covode.recordClassIndex(28541);
        }

        private Object readResolve() {
            return new n(this.proxyEvents);
        }

        private a(HashMap<a, List<c>> hashMap) {
            this.proxyEvents = hashMap;
        }

        /* synthetic */ a(HashMap hashMap, byte b2) {
            this(hashMap);
        }
    }

    public n() {
        this.events = new HashMap<>();
    }

    private Object writeReplace() {
        if (com.facebook.internal.a.b.a.a(this)) {
            return null;
        }
        try {
            return new a(this.events, (byte) 0);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, this);
            return null;
        }
    }

    public final Set<a> a() {
        if (com.facebook.internal.a.b.a.a(this)) {
            return null;
        }
        try {
            return this.events.keySet();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, this);
            return null;
        }
    }

    public n(HashMap<a, List<c>> hashMap) {
        HashMap<a, List<c>> hashMap2 = new HashMap<>();
        this.events = hashMap2;
        hashMap2.putAll(hashMap);
    }

    public final List<c> a(a aVar) {
        if (com.facebook.internal.a.b.a.a(this)) {
            return null;
        }
        try {
            return this.events.get(aVar);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, this);
            return null;
        }
    }

    public final void a(a aVar, List<c> list) {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                if (!this.events.containsKey(aVar)) {
                    this.events.put(aVar, list);
                } else {
                    this.events.get(aVar).addAll(list);
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }
}
