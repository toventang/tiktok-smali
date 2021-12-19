package com.bytedance.ies.im.core.api.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.a.c;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.proto.SortType;
import java.util.List;
import java.util.Map;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0745a f33949a = new C0745a((byte) 0);

    static {
        Covode.recordClassIndex(20184);
    }

    public abstract h a(String str);

    public abstract List<h> a();

    public abstract void a(long j2, SortType sortType, Boolean bool, com.bytedance.im.core.a.a.a<List<h>> aVar);

    public abstract void a(com.bytedance.ies.im.core.api.b.a.a aVar);

    public abstract void a(String str, long j2, int i2, b<h> bVar);

    public abstract void a(String str, b<h> bVar);

    public abstract void a(List<String> list);

    public abstract void a(List<String> list, Map<String, String> map, c<h> cVar);

    public abstract h b(String str);

    public abstract void b(com.bytedance.ies.im.core.api.b.a.a aVar);

    public abstract void b(String str, b<h> bVar);

    public abstract void c(String str);

    public abstract void c(String str, b<String> bVar);

    public abstract boolean d(String str);

    /* renamed from: com.bytedance.ies.im.core.api.b.a$a  reason: collision with other inner class name */
    public static final class C0745a {
        static {
            Covode.recordClassIndex(20185);
        }

        private C0745a() {
        }

        public static a a() {
            return com.bytedance.ies.im.core.api.c.f33958a.b();
        }

        public /* synthetic */ C0745a(byte b2) {
            this();
        }
    }
}
