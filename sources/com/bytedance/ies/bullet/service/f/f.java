package com.bytedance.ies.bullet.service.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.ae;
import java.util.ArrayList;
import java.util.List;

public final class f implements ae {

    /* renamed from: a  reason: collision with root package name */
    private final String f32762a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f32763b;

    /* renamed from: c  reason: collision with root package name */
    private final h.f.a.a<List<String>> f32764c;

    static {
        Covode.recordClassIndex(19578);
    }

    @Override // com.bytedance.ies.bullet.service.base.ae
    public final String a() {
        return this.f32762a;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f32765a = "unknown";

        /* renamed from: b  reason: collision with root package name */
        private List<String> f32766b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private h.f.a.a<? extends List<String>> f32767c;

        static {
            Covode.recordClassIndex(19579);
        }

        public final f a() {
            return new f(this.f32765a, this.f32766b, this.f32767c, (byte) 0);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.ae
    public final List<String> b() {
        List<String> invoke;
        h.f.a.a<List<String>> aVar = this.f32764c;
        if (aVar == null || (invoke = aVar.invoke()) == null) {
            return this.f32763b;
        }
        return invoke;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    private f(String str, List<String> list, h.f.a.a<? extends List<String>> aVar) {
        this.f32762a = str;
        this.f32763b = list;
        this.f32764c = aVar;
    }

    public /* synthetic */ f(String str, List list, h.f.a.a aVar, byte b2) {
        this(str, list, aVar);
    }
}
