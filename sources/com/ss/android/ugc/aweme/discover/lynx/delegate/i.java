package com.ss.android.ugc.aweme.discover.lynx.delegate;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.helper.ae;
import com.ss.android.ugc.aweme.discover.m.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import org.json.JSONObject;

public final class i extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81501a = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f81502c;

    static {
        Covode.recordClassIndex(50658);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50659);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ com.ss.android.ugc.aweme.discover.lynx.a.b $bulletContext;

        static {
            Covode.recordClassIndex(50660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
            super(0);
            this.$bulletContext = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new b.a<com.bytedance.android.live.base.a.a>(this) {
                /* class com.ss.android.ugc.aweme.discover.lynx.delegate.i.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f81503a;

                static {
                    Covode.recordClassIndex(50661);
                }

                @Override // com.ss.android.ugc.aweme.discover.m.b.a
                public final Class<com.bytedance.android.live.base.a.a> a() {
                    return com.bytedance.android.live.base.a.a.class;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f81503a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.aweme.discover.m.b.a
                public final /* synthetic */ void a(com.bytedance.android.live.base.a.a aVar) {
                    com.bytedance.android.live.base.a.a aVar2 = aVar;
                    l.d(aVar2, "");
                    long j2 = aVar2.f7362a;
                    com.ss.android.ugc.aweme.discover.lynx.a.b bVar = this.f81503a.$bulletContext;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("room_id_str", String.valueOf(j2));
                    bVar.a("updateLiveCloseState", jSONObject);
                }
            };
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.delegate.b
    public final void a() {
        ae.f81066a.a((b.a) this.f81502c.getValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
        this.f81502c = h.i.a((h.f.a.a) new b(bVar));
    }
}
