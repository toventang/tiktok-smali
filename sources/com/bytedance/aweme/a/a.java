package com.bytedance.aweme.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;
import java.util.concurrent.ConcurrentHashMap;

public abstract class a {

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap<String, p<Long, Long>> f25784b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final C0546a f25785c = new C0546a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f25786a;

    public abstract com.bytedance.aweme.b.a.a a();

    /* renamed from: com.bytedance.aweme.a.a$a  reason: collision with other inner class name */
    public static final class C0546a {
        static {
            Covode.recordClassIndex(15056);
        }

        private C0546a() {
        }

        public /* synthetic */ C0546a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(15055);
    }

    public a() {
        String name = getClass().getName();
        l.a((Object) name, "");
        this.f25786a = name;
    }
}
