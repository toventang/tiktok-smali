package com.ss.android.ugc.aweme.im.sdk.group.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.d.u;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final Map<Long, Boolean> f102629a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final a f102630b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(65704);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.a$a  reason: collision with other inner class name */
    public static final class C2580a implements b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Long f102631a;

        static {
            Covode.recordClassIndex(65705);
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
        }

        public C2580a(Long l2) {
            this.f102631a = l2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(Boolean bool) {
            a.f102629a.put(this.f102631a, Boolean.valueOf(l.a((Object) bool, (Object) true)));
        }
    }

    public static Boolean a(long j2) {
        return f102629a.get(Long.valueOf(j2));
    }

    public static void a(long j2, boolean z) {
        f102629a.put(Long.valueOf(j2), Boolean.valueOf(z));
    }
}
