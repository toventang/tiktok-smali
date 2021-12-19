package com.bytedance.r.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.r.a.a.b;
import java.util.ArrayList;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f42410a;

    /* renamed from: b  reason: collision with root package name */
    public final b f42411b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.r.a.a.a f42412c;

    /* renamed from: d  reason: collision with root package name */
    public long f42413d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f42414e;

    static {
        Covode.recordClassIndex(25920);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public b f42415a;

        /* renamed from: b  reason: collision with root package name */
        public com.bytedance.r.a.a.a f42416b;

        /* renamed from: c  reason: collision with root package name */
        private final List<String> f42417c;

        static {
            Covode.recordClassIndex(25921);
        }

        public final c a() {
            return new c(this.f42417c, this.f42415a, this.f42416b, (byte) 0);
        }

        public a(List<String> list) {
            ArrayList arrayList = new ArrayList();
            this.f42417c = arrayList;
            arrayList.addAll(list);
        }
    }

    private c(List<String> list, b bVar, com.bytedance.r.a.a.a aVar) {
        this.f42410a = list;
        this.f42411b = bVar;
        this.f42412c = aVar;
    }

    /* synthetic */ c(List list, b bVar, com.bytedance.r.a.a.a aVar, byte b2) {
        this(list, bVar, aVar);
    }
}
