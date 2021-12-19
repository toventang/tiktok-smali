package com.bytedance.android.live.liveinteract.multilive.anchor.d;

import com.bytedance.android.live.liveinteract.multilive.anchor.a.a;
import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import com.bytedance.android.live.network.e;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

public final class a extends a.AbstractC0233a {
    static {
        Covode.recordClassIndex(6311);
    }

    public a(a.b bVar) {
        super(bVar);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.d.a$a  reason: collision with other inner class name */
    static final class C0235a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11617a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11618b;

        static {
            Covode.recordClassIndex(6312);
        }

        C0235a(a aVar, int i2) {
            this.f11617a = aVar;
            this.f11618b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a.b bVar = (a.b) this.f11617a.f10031h;
            if (bVar != null) {
                bVar.a(this.f11618b);
            }
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11619a;

        static {
            Covode.recordClassIndex(6313);
        }

        b(a aVar) {
            this.f11619a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            a.b bVar = (a.b) this.f11619a.f10031h;
            if (bVar != null) {
                bVar.a(th);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.a.a.AbstractC0233a
    public final void a(Long l2, Long l3, com.bytedance.android.livesdk.chatroom.model.c.a aVar, int i2) {
        if (l2 == null || l3 == null || aVar == null) {
            a.b bVar = (a.b) this.f10031h;
            if (bVar != null) {
                bVar.a(new Throwable("param illegal."));
                return;
            }
            return;
        }
        ((MultiLiveApi) e.a().a(MultiLiveApi.class)).updateAnchorPanelSettings(l2.longValue(), l2.longValue(), l3.longValue(), aVar.f15740a, aVar.f15741b, aVar.f15742c, aVar.f15743d).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new C0235a(this, i2), new b(this));
    }
}
