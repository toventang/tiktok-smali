package com.bytedance.android.live.liveinteract.linkroom.a.c;

import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.linkroom.a.a.a;
import com.bytedance.android.live.network.e;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

public final class a extends a.AbstractC0188a {
    static {
        Covode.recordClassIndex(5587);
    }

    public a(a.b bVar) {
        super(bVar);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.c.a$a  reason: collision with other inner class name */
    static final class C0190a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10494a;

        static {
            Covode.recordClassIndex(5588);
        }

        C0190a(a aVar) {
            this.f10494a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a.b bVar = (a.b) this.f10494a.f10031h;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10495a;

        static {
            Covode.recordClassIndex(5589);
        }

        b(a aVar) {
            this.f10495a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            a.b bVar = (a.b) this.f10495a.f10031h;
            if (bVar != null) {
                bVar.a(th);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.a.a.AbstractC0188a
    public final void a(long j2) {
        ((CoHostApi) e.a().a(CoHostApi.class)).checkPermissionV3(j2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new C0190a(this), new b(this));
    }
}
