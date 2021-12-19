package com.bytedance.ies.bullet.service.e;

import android.app.Application;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.ab;
import com.bytedance.ies.bullet.service.base.ad;
import com.bytedance.ies.bullet.service.base.am;
import com.bytedance.ies.bullet.service.base.d.a.c;
import com.bytedance.ies.bullet.service.base.u;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.Iterator;
import java.util.List;

public final class b extends com.bytedance.ies.bullet.service.base.b.a implements ad {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32680a = new a((byte) 0);

    static {
        Covode.recordClassIndex(19429);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19430);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b(Application application) {
        l.c(application, "");
    }

    /* renamed from: com.bytedance.ies.bullet.service.e.b$b  reason: collision with other inner class name */
    static final class C0705b extends m implements h.f.a.b<ab, z> {
        final /* synthetic */ z.a $result;
        final /* synthetic */ long $startTimeMs;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(19431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0705b(b bVar, long j2, z.a aVar) {
            super(1);
            this.this$0 = bVar;
            this.$startTimeMs = j2;
            this.$result = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ab abVar) {
            ab abVar2 = abVar;
            if (abVar2 != null) {
                b bVar = this.this$0;
                a.a(bVar.f32574d, abVar2.f(), "page", "success", (String) null, System.currentTimeMillis() - this.$startTimeMs, 162);
                this.$result.element = true;
            }
            return h.z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<ab, h.z> {
        final /* synthetic */ z.a $result;
        final /* synthetic */ long $startTimeMs;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(19432);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, long j2, z.a aVar) {
            super(1);
            this.this$0 = bVar;
            this.$startTimeMs = j2;
            this.$result = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ab abVar) {
            ab abVar2 = abVar;
            if (abVar2 != null) {
                b bVar = this.this$0;
                a.a(bVar.f32574d, abVar2.f(), "popup", "success", (String) null, System.currentTimeMillis() - this.$startTimeMs, 162);
                this.$result.element = true;
            }
            return h.z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.m<Boolean, am, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(19433);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(Boolean bool, am amVar) {
            boolean booleanValue = bool.booleanValue();
            am amVar2 = amVar;
            l.c(amVar2, "");
            j.b.a(this.this$0, "preload finish, success: " + booleanValue + ", code: " + amVar2.name(), null, null, 6);
            return h.z.f158842a;
        }
    }

    private final boolean a(String str, String str2) {
        boolean z = false;
        for (T t : c.a.a().a()) {
            if (l.a((Object) t.a(), (Object) this.f32574d) && l.a((Object) t.b(), (Object) str) && l.a((Object) t.c(), (Object) str2)) {
                t.d();
                z = true;
            }
        }
        return z;
    }

    private final boolean b(String str, String str2) {
        List<ab> b2;
        u uVar = (u) a(u.class);
        boolean z = false;
        if (!(uVar == null || (b2 = uVar.b()) == null)) {
            z = false;
            for (T t : b2) {
                if (l.a((Object) t.a(), (Object) this.f32574d) && l.a((Object) t.b(), (Object) str) && l.a((Object) t.c(), (Object) str2)) {
                    t.d();
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.bytedance.ies.bullet.service.base.ad
    public final boolean a(String str, com.bytedance.ies.bullet.service.base.d.a.a aVar) {
        List<ab> b2;
        l.c(str, "");
        l.c(aVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        z.a aVar2 = new z.a();
        aVar2.element = false;
        if (str.length() == 0) {
            a.a(this.f32574d, (Uri) null, "unknown", "fail", "container id is empty", System.currentTimeMillis() - currentTimeMillis, 134);
            return false;
        }
        C0705b bVar = new C0705b(this, currentTimeMillis, aVar2);
        Iterator<T> it = c.a.a().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar.invoke(null);
                break;
            }
            T next = it.next();
            if (l.a((Object) next.e(), (Object) str)) {
                bVar.invoke(next);
                next.d();
                break;
            }
        }
        c cVar = new c(this, currentTimeMillis, aVar2);
        u uVar = (u) a(u.class);
        if (uVar != null && (b2 = uVar.b()) != null) {
            Iterator<T> it2 = b2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next2 = it2.next();
                if (l.a((Object) next2.e(), (Object) str)) {
                    cVar.invoke(next2);
                    next2.d();
                    break;
                }
            }
        }
        cVar.invoke(null);
        if (!aVar2.element) {
            a.a(this.f32574d, (Uri) null, "unknown", "fail", "container not found", System.currentTimeMillis() - currentTimeMillis, 134);
        }
        return aVar2.element;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c3 A[ADDED_TO_REGION] */
    @Override // com.bytedance.ies.bullet.service.base.ad
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.content.Context r26, android.net.Uri r27, com.bytedance.ies.bullet.service.base.d.a.b r28) {
        /*
        // Method dump skipped, instructions count: 527
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.e.b.a(android.content.Context, android.net.Uri, com.bytedance.ies.bullet.service.base.d.a.b):boolean");
    }
}
