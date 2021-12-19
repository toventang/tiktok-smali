package com.ss.android.ugc.aweme.bullet.module.p001default;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.c.j;
import com.bytedance.ies.bullet.kit.rn.core.d;
import com.bytedance.ies.bullet.kit.rn.core.e;
import com.bytedance.ies.bullet.kit.rn.f;
import com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.c  reason: invalid package */
public final class c extends com.bytedance.ies.bullet.a.a.a.a {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.ies.bullet.c.e.a.b f69504a;

    static {
        Covode.recordClassIndex(42859);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.c$a */
    public static final class a implements com.bytedance.ies.bullet.kit.rn.c {
        static {
            Covode.recordClassIndex(42860);
        }

        a() {
        }

        @Override // com.bytedance.ies.bullet.kit.rn.c
        public final List<e<?>> b(f fVar, com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.d(fVar, "");
            l.d(bVar, "");
            return z.INSTANCE;
        }

        @Override // com.bytedance.ies.bullet.kit.rn.c
        public final List<com.bytedance.ies.bullet.kit.rn.core.b> a(f fVar, com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.d(fVar, "");
            l.d(bVar, "");
            return n.c(new RNCommonModule());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.c$c  reason: collision with other inner class name */
    public static final class C1570c implements com.bytedance.ies.bullet.kit.rn.e {
        static {
            Covode.recordClassIndex(42862);
        }

        C1570c() {
        }

        @Override // com.bytedance.ies.bullet.kit.rn.e
        public final List<d> a(f fVar, com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.d(fVar, "");
            l.d(bVar, "");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.ss.android.ugc.aweme.bullet.reactpackage.a.a());
            arrayList.add(new com.ss.android.ugc.aweme.bullet.reactpackage.b.b());
            return arrayList;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.rn.g, com.bytedance.ies.bullet.a.a.a.a
    public final com.bytedance.ies.bullet.kit.rn.c a() {
        return new a();
    }

    @Override // com.bytedance.ies.bullet.kit.rn.g, com.bytedance.ies.bullet.a.a.a.a
    public final com.bytedance.ies.bullet.kit.rn.e b() {
        return new C1570c();
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.c$b */
    public static final class b implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b f69505a;

        static {
            Covode.recordClassIndex(42861);
        }

        b(com.bytedance.ies.bullet.c.e.a.b bVar) {
            this.f69505a = bVar;
        }

        @Override // com.bytedance.ies.bullet.c.c.j
        public final void a(i iVar) {
            l.d(iVar, "");
            j.a.a(iVar);
        }

        @Override // com.bytedance.ies.bullet.c.c.j
        public final void a(i iVar, Uri uri) {
            l.d(iVar, "");
            l.d(uri, "");
            j.a.a(iVar, uri);
        }

        @Override // com.bytedance.ies.bullet.c.c.j
        public final void a(i iVar, Throwable th) {
            l.d(iVar, "");
            j.a.b(iVar);
        }

        @Override // com.bytedance.ies.bullet.c.c.j
        public final void a(i iVar, Uri uri, h.f.a.b<? super Uri, h.z> bVar, h.f.a.b<? super Throwable, h.z> bVar2) {
            l.d(iVar, "");
            l.d(uri, "");
            l.d(bVar, "");
            l.d(bVar2, "");
            j.a.a(iVar, uri, bVar, bVar2);
        }
    }

    public c(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        this.f69504a = bVar;
    }

    @Override // com.bytedance.ies.bullet.a.a.a.a, com.bytedance.ies.bullet.c.c.e
    public final j a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return new b(bVar);
    }
}
