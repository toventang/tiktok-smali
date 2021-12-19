package com.ss.android.ugc.aweme.profile.widgets.common;

import com.bytedance.assem.arch.a.c;
import com.bytedance.assem.arch.extensions.o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import h.c.b.a.k;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.r;
import h.z;
import java.util.Map;
import kotlinx.coroutines.am;

public final class MineProfileInfoVM extends AssemViewModel<e> {

    /* renamed from: j  reason: collision with root package name */
    final h f117688j = c.a(this, b.f117689a);

    static {
        Covode.recordClassIndex(76159);
    }

    static final class b extends m implements h.f.a.a<com.bytedance.assem.arch.a.a<f>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f117689a = new b();

        static {
            Covode.recordClassIndex(76163);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.a.a<f> invoke() {
            return new d();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ e f() {
        return new e();
    }

    static final class a extends k implements h.f.a.m<am, d<? super z>, Object> {
        final /* synthetic */ g $action;
        final /* synthetic */ int $from;
        int label;
        final /* synthetic */ MineProfileInfoVM this$0;

        static {
            Covode.recordClassIndex(76160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(MineProfileInfoVM mineProfileInfoVM, int i2, g gVar, d dVar) {
            super(2, dVar);
            this.this$0 = mineProfileInfoVM;
            this.$from = i2;
            this.$action = gVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.this$0, this.$from, this.$action, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            final User user;
            String str;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                try {
                    int i3 = this.$from;
                    this.label = 1;
                    obj = ((f) ((com.bytedance.assem.arch.a.a) this.this$0.f117688j.getValue()).a()).a(i3);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("to_user_id", g2.getCurUserId()).a("enter_from", "personal_homepage").a("is_success", 0).a("fail_info", e2.getMessage());
                    l.b(a2, "");
                    if (e2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                        a2.a("response", ((com.ss.android.ugc.aweme.base.api.a.b.a) e2).getResponse());
                    }
                    Map<String, String> map = a2.f66730a;
                    com.ss.android.ugc.aweme.common.r.a("profile_request_response", map);
                    com.ss.android.ugc.aweme.framework.a.a.a(4, "aweme/v1/user", map.toString());
                    this.this$0.a(new h.f.a.b<e, e>() {
                        /* class com.ss.android.ugc.aweme.profile.widgets.common.MineProfileInfoVM.a.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(76162);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ e invoke(e eVar) {
                            e eVar2 = eVar;
                            l.d(eVar2, "");
                            return e.a(new com.bytedance.assem.arch.extensions.h(e2), eVar2.f117701b);
                        }
                    });
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UserResponse userResponse = (UserResponse) obj;
            String str2 = null;
            if (userResponse != null) {
                user = userResponse.getUser();
            } else {
                user = null;
            }
            com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
            if (user != null) {
                str2 = user.getUid();
            }
            com.ss.android.ugc.aweme.app.f.d a3 = dVar2.a("to_user_id", str2).a("enter_from", "personal_homepage").a("is_success", 1);
            if (user == null || (str = user.getRequestId()) == null) {
                str = "";
            }
            com.ss.android.ugc.aweme.common.r.a("profile_request_response", a3.a("log_pb", str).f66730a);
            com.ss.android.ugc.aweme.account.b.g().updateCurUser(user);
            this.this$0.a(new h.f.a.b<e, e>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.common.MineProfileInfoVM.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(76161);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ e invoke(e eVar) {
                    l.d(eVar, "");
                    return e.a(new o(user), this.this$0.$action);
                }
            });
            return z.f158842a;
        }
    }
}
