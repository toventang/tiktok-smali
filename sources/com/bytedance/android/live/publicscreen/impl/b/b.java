package com.bytedance.android.live.publicscreen.impl.b;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

public final class b extends com.bytedance.ies.a.b<a> {

    /* renamed from: a  reason: collision with root package name */
    f.a.b.b f12230a;

    public interface a extends com.bytedance.ies.a.a {
        static {
            Covode.recordClassIndex(6736);
        }

        void a();

        void a(com.bytedance.android.live.base.model.user.b bVar);
    }

    static {
        Covode.recordClassIndex(6735);
    }

    @Override // com.bytedance.ies.a.b
    public final void b() {
        super.b();
        f.a.b.b bVar = this.f12230a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.b.b$b  reason: collision with other inner class name */
    static final class C0257b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f12231a;

        static {
            Covode.recordClassIndex(6737);
        }

        C0257b(b bVar) {
            this.f12231a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.base.model.user.b bVar = (com.bytedance.android.live.base.model.user.b) obj;
            a aVar = (a) this.f12231a.y;
            if (aVar != null) {
                aVar.a(bVar);
            }
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f12232a;

        static {
            Covode.recordClassIndex(6738);
        }

        c(b bVar) {
            this.f12232a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a aVar = (a) this.f12232a.y;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
