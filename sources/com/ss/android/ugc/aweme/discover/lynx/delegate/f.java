package com.ss.android.ugc.aweme.discover.lynx.delegate;

import androidx.fragment.app.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.helper.ae;
import com.ss.android.ugc.aweme.discover.m.b;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import org.json.JSONObject;

public final class f extends b implements u<FollowStatus> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81488a = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f81489c = i.a((h.f.a.a) c.f81492a);

    /* renamed from: d  reason: collision with root package name */
    private final h f81490d = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(50646);
    }

    private final IUserService d() {
        return (IUserService) this.f81489c.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50647);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(50648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new b.a<FollowStatus>(this) {
                /* class com.ss.android.ugc.aweme.discover.lynx.delegate.f.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f81491a;

                static {
                    Covode.recordClassIndex(50649);
                }

                @Override // com.ss.android.ugc.aweme.discover.m.b.a
                public final Class<FollowStatus> a() {
                    return FollowStatus.class;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f81491a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.aweme.discover.m.b.a
                public final /* synthetic */ void a(FollowStatus followStatus) {
                    FollowStatus followStatus2 = followStatus;
                    l.d(followStatus2, "");
                    this.f81491a.this$0.onChanged(followStatus2);
                }
            };
        }
    }

    static final class c extends m implements h.f.a.a<IUserService> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f81492a = new c();

        static {
            Covode.recordClassIndex(50650);
        }

        c() {
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
            d().b().removeObserver(this);
            com.ss.android.ugc.aweme.arch.widgets.base.c<FollowStatus> b2 = d().b();
            e eVar = this.f81477b.f81410a;
            if (eVar == null) {
                l.b();
            }
            b2.observe(eVar, this);
        }
        ae.f81066a.a((b.a) this.f81490d.getValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    /* renamed from: a */
    public final void onChanged(FollowStatus followStatus) {
        if (followStatus != null) {
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar = this.f81477b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", followStatus.userId);
            jSONObject.put("follow_status", followStatus.followStatus);
            bVar.a("changeFollowState", jSONObject);
            if (followStatus.followStatus == 1 || followStatus.followStatus == 2 || followStatus.followStatus == 4) {
                com.ss.android.ugc.aweme.discover.lynx.a.b bVar2 = this.f81477b;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("uid", followStatus.userId);
                jSONObject2.put("block_status", 0);
                bVar2.a("changeBlockState", jSONObject2);
            }
        }
    }
}
