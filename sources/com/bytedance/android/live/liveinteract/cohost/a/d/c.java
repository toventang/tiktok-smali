package com.bytedance.android.live.liveinteract.cohost.a.d;

import com.bytedance.android.live.liveinteract.cohost.a.a.c;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.t;

public final class c extends c.a {
    static {
        Covode.recordClassIndex(5306);
    }

    public c(c.b bVar) {
        super(bVar);
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f10113a;

        static {
            Covode.recordClassIndex(5307);
        }

        a(c cVar) {
            this.f10113a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            c.b bVar = (c.b) this.f10113a.f10031h;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f10114a;

        static {
            Covode.recordClassIndex(5308);
        }

        b(c cVar) {
            this.f10114a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            c.b bVar = (c.b) this.f10114a.f10031h;
            if (bVar != null) {
                bVar.a(th);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.c$c  reason: collision with other inner class name */
    static final class C0163c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f10115a;

        static {
            Covode.recordClassIndex(5309);
        }

        C0163c(c cVar) {
            this.f10115a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            c.b bVar = (c.b) this.f10115a.f10031h;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f10116a;

        static {
            Covode.recordClassIndex(5310);
        }

        d(c cVar) {
            this.f10116a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            c.b bVar = (c.b) this.f10116a.f10031h;
            if (bVar != null) {
                bVar.b(th);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.c.a
    public final void a(boolean z) {
        t<com.bytedance.android.live.network.response.d<Void>> a2 = com.bytedance.android.live.liveinteract.platform.common.api.a.a(0, z);
        if (a2 != null) {
            ((z) a2.a(f())).a(new a(this), new b(this));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.c.a
    public final void b(boolean z) {
        t<com.bytedance.android.live.network.response.d<Void>> a2 = com.bytedance.android.live.liveinteract.platform.common.api.a.a(2, z);
        if (a2 != null) {
            ((z) a2.a(f())).a(new C0163c(this), new d(this));
        }
    }
}
