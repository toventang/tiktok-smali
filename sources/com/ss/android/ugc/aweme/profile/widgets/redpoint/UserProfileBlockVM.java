package com.ss.android.ugc.aweme.profile.widgets.redpoint;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.userservice.UserService;
import h.c.b.a.k;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.r;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public final class UserProfileBlockVM extends AssemViewModel<a> {

    /* renamed from: j  reason: collision with root package name */
    final h f118086j = com.bytedance.assem.arch.a.c.a(this, b.f118087a);

    static {
        Covode.recordClassIndex(76664);
    }

    static final class b extends m implements h.f.a.a<com.bytedance.assem.arch.a.a<c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f118087a = new b();

        static {
            Covode.recordClassIndex(76668);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.a.a<c> invoke() {
            return new b();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ a f() {
        return new a();
    }

    public static final class c extends m implements h.f.a.b<a, a> {
        final /* synthetic */ BlockStruct $blockStruct;

        static {
            Covode.recordClassIndex(76669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(BlockStruct blockStruct) {
            super(1);
            this.$blockStruct = blockStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return a.a(aVar2, this.$blockStruct, null, 2);
        }
    }

    static final class a extends k implements h.f.a.m<am, d<? super z>, Object> {
        final /* synthetic */ int $blockType;
        final /* synthetic */ String $secUserId;
        final /* synthetic */ String $userId;
        int label;
        final /* synthetic */ UserProfileBlockVM this$0;

        static {
            Covode.recordClassIndex(76665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(UserProfileBlockVM userProfileBlockVM, String str, String str2, int i2, d dVar) {
            super(2, dVar);
            this.this$0 = userProfileBlockVM;
            this.$userId = str;
            this.$secUserId = str2;
            this.$blockType = i2;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.this$0, this.$userId, this.$secUserId, this.$blockType, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            int i2;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i3 = this.label;
            if (i3 == 0) {
                r.a(obj);
                try {
                    String str = this.$userId;
                    String str2 = this.$secUserId;
                    int i4 = this.$blockType;
                    this.label = 1;
                    obj = ((c) ((com.bytedance.assem.arch.a.a) this.this$0.f118086j.getValue()).a()).a(str, str2, i4);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception e2) {
                    this.this$0.a(new h.f.a.b<a, a>() {
                        /* class com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM.a.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(76667);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ a invoke(a aVar) {
                            a aVar2 = aVar;
                            l.d(aVar2, "");
                            return a.a(aVar2, null, e2, 1);
                        }
                    });
                }
            } else if (i3 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final BlockStruct blockStruct = (BlockStruct) obj;
            com.ss.android.ugc.aweme.arch.widgets.base.c<BlockStatus> c2 = UserService.d().c();
            String str3 = this.$userId;
            if (blockStruct != null) {
                i2 = blockStruct.blockStatus;
            } else {
                i2 = 0;
            }
            c2.postValue(new BlockStatus(str3, i2));
            this.this$0.a(new h.f.a.b<a, a>() {
                /* class com.ss.android.ugc.aweme.profile.widgets.redpoint.UserProfileBlockVM.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(76666);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ a invoke(a aVar) {
                    a aVar2 = aVar;
                    l.d(aVar2, "");
                    return a.a(aVar2, blockStruct, null, 2);
                }
            });
            return z.f158842a;
        }
    }

    public final void a(String str, String str2, int i2) {
        bz unused = i.a(aH_(), null, null, new a(this, str, str2, i2, null), 3);
    }
}
