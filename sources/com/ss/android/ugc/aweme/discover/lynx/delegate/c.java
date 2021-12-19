package com.ss.android.ugc.aweme.discover.lynx.delegate;

import androidx.fragment.app.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.helper.ae;
import com.ss.android.ugc.aweme.discover.m.b;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import org.json.JSONObject;

public final class c extends b implements u<BlockStatus> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81478a = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f81479c = i.a((h.f.a.a) C1900c.f81482a);

    /* renamed from: d  reason: collision with root package name */
    private final h f81480d = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(50635);
    }

    private final IUserService d() {
        return (IUserService) this.f81479c.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50636);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(50637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new b.a<BlockStatus>(this) {
                /* class com.ss.android.ugc.aweme.discover.lynx.delegate.c.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f81481a;

                static {
                    Covode.recordClassIndex(50638);
                }

                @Override // com.ss.android.ugc.aweme.discover.m.b.a
                public final Class<BlockStatus> a() {
                    return BlockStatus.class;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f81481a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.aweme.discover.m.b.a
                public final /* synthetic */ void a(BlockStatus blockStatus) {
                    BlockStatus blockStatus2 = blockStatus;
                    l.d(blockStatus2, "");
                    this.f81481a.this$0.onChanged(blockStatus2);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.c$c  reason: collision with other inner class name */
    static final class C1900c extends m implements h.f.a.a<IUserService> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1900c f81482a = new C1900c();

        static {
            Covode.recordClassIndex(50639);
        }

        C1900c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IUserService invoke() {
            return UserService.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.delegate.b
    public final void a() {
        if (!(this.f81477b.f81410a == null || d() == null)) {
            d().c().removeObserver(this);
            com.ss.android.ugc.aweme.arch.widgets.base.c<BlockStatus> c2 = d().c();
            e eVar = this.f81477b.f81410a;
            if (eVar == null) {
                l.b();
            }
            c2.observe(eVar, this);
        }
        ae.f81066a.a((b.a) this.f81480d.getValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    /* renamed from: a */
    public final void onChanged(BlockStatus blockStatus) {
        if (blockStatus != null) {
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar = this.f81477b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", blockStatus.userId);
            jSONObject.put("block_status", blockStatus.blockStatus);
            bVar.a("changeBlockState", jSONObject);
            if (blockStatus.blockStatus == 1) {
                com.ss.android.ugc.aweme.discover.lynx.a.b bVar2 = this.f81477b;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("uid", blockStatus.userId);
                jSONObject2.put("follow_status", 0);
                bVar2.a("changeFollowState", jSONObject2);
            }
        }
    }
}
