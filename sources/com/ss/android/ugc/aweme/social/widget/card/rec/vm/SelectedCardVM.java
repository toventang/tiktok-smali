package com.ss.android.ugc.aweme.social.widget.card.rec.vm;

import android.app.Activity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.f;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.widget.card.c.c;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.a.ag;
import h.a.n;
import h.c.b.a.k;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.q;
import h.r;
import h.v;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.cs;
import kotlinx.coroutines.cu;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.z;

public final class SelectedCardVM extends ac {

    /* renamed from: a  reason: collision with root package name */
    public String f133896a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f133897b = "";

    /* renamed from: c  reason: collision with root package name */
    public u.c f133898c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f133899d;

    /* renamed from: e  reason: collision with root package name */
    public final am f133900e;

    /* renamed from: f  reason: collision with root package name */
    final IUserService f133901f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<List<com.ss.android.ugc.aweme.social.widget.card.rec.cell.b>> f133902g;

    /* renamed from: h  reason: collision with root package name */
    public final LiveData<List<com.ss.android.ugc.aweme.social.widget.card.rec.cell.b>> f133903h;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> f133904i;

    /* renamed from: j  reason: collision with root package name */
    public final LiveData<Integer> f133905j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<List<IMUser>> f133906k;

    /* renamed from: l  reason: collision with root package name */
    public final LiveData<List<IMUser>> f133907l;

    /* renamed from: m  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> f133908m;
    public final LiveData<Boolean> n;
    public final Set<String> o;
    private final z p;

    static {
        Covode.recordClassIndex(87600);
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.p.a((CancellationException) null);
    }

    public SelectedCardVM() {
        z a2 = cu.a();
        this.p = a2;
        this.f133900e = an.a(o.f159148a.plus(a2));
        this.f133901f = UserService.d();
        com.ss.android.ugc.aweme.arch.widgets.base.c<List<com.ss.android.ugc.aweme.social.widget.card.rec.cell.b>> cVar = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();
        this.f133902g = cVar;
        this.f133903h = cVar;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> cVar2 = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();
        this.f133904i = cVar2;
        this.f133905j = cVar2;
        com.ss.android.ugc.aweme.arch.widgets.base.c<List<IMUser>> cVar3 = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();
        this.f133906k = cVar3;
        this.f133907l = cVar3;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> cVar4 = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();
        this.f133908m = cVar4;
        this.n = cVar4;
        this.o = new LinkedHashSet();
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.social.widget.b.a, com.ss.android.ugc.aweme.social.widget.b.a> {
        final /* synthetic */ List $targetUserList;

        static {
            Covode.recordClassIndex(87603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(List list) {
            super(1);
            this.$targetUserList = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.social.widget.b.a invoke(com.ss.android.ugc.aweme.social.widget.b.a aVar) {
            com.ss.android.ugc.aweme.social.widget.b.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.a(this.$targetUserList);
            return aVar2;
        }
    }

    public static void b(List<? extends User> list) {
        com.bytedance.provider.b a2 = com.bytedance.provider.impl.c.f42017b.a().a("source_default_key", com.ss.android.ugc.aweme.social.widget.b.a.class);
        if (a2 != null) {
            a2.a(new c(list));
        }
    }

    public final void a(List<? extends User> list) {
        for (T t : list) {
            String str = this.f133896a;
            String str2 = this.f133897b;
            l.d(t, "");
            l.d(str, "");
            l.d(str2, "");
            i.b(new c.d(t, str, str2), i.f4824a);
            com.ss.android.ugc.aweme.social.widget.card.c.c.a(t, this.f133896a, this.f133897b, u.a.FOLLOW, this.f133898c);
        }
    }

    public static final class b extends k implements h.f.a.m<am, d<? super h.z>, Object> {
        final /* synthetic */ List $targetUserList;
        int label;
        final /* synthetic */ SelectedCardVM this$0;

        static {
            Covode.recordClassIndex(87602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(SelectedCardVM selectedCardVM, List list, d dVar) {
            super(2, dVar);
            this.this$0 = selectedCardVM;
            this.$targetUserList = list;
        }

        @Override // h.c.b.a.a
        public final d<h.z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, this.$targetUserList, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super h.z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                SelectedCardVM selectedCardVM = this.this$0;
                List list = this.$targetUserList;
                this.label = 1;
                a aVar = new a(selectedCardVM, list, null);
                cs csVar = new cs(getContext(), this);
                Object a2 = kotlinx.coroutines.b.b.a(csVar, csVar, aVar);
                if (a2 == h.c.a.a.COROUTINE_SUSPENDED) {
                    l.d(this, "");
                }
                if (a2 != h.c.a.a.COROUTINE_SUSPENDED) {
                    a2 = h.z.f158842a;
                }
                if (a2 == obj2) {
                    return obj2;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return h.z.f158842a;
        }
    }

    public final void a(String str) {
        int i2;
        String str2 = this.f133896a;
        List<com.ss.android.ugc.aweme.social.widget.card.rec.cell.b> value = this.f133903h.getValue();
        if (value != null) {
            i2 = value.size();
        } else {
            i2 = 0;
        }
        Integer value2 = this.f133905j.getValue();
        if (value2 == null) {
            value2 = 0;
        }
        l.b(value2, "");
        int intValue = value2.intValue();
        l.d(str2, "");
        l.d(str, "");
        com.ss.android.ugc.aweme.common.r.a("send_message_pop_up", ag.a(v.a("enter_from", str2), v.a("action_type", str), v.a("user_show_num", String.valueOf(i2)), v.a("user_select_num", String.valueOf(intValue))));
    }

    /* access modifiers changed from: package-private */
    public static final class a extends k implements h.f.a.m<am, d<? super h.z>, Object> {
        final /* synthetic */ List $targetUserList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SelectedCardVM this$0;

        static {
            Covode.recordClassIndex(87601);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SelectedCardVM selectedCardVM, List list, d dVar) {
            super(2, dVar);
            this.this$0 = selectedCardVM;
            this.$targetUserList = list;
        }

        @Override // h.c.b.a.a
        public final d<h.z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            a aVar = new a(this.this$0, this.$targetUserList, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super h.z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            if (this.label == 0) {
                r.a(obj);
                if (l.a((Object) this.this$0.f133908m.getValue(), (Object) true)) {
                    return h.z.f158842a;
                }
                this.this$0.f133908m.postValue(true);
                try {
                    List<User> list = this.$targetUserList;
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                    for (User user : list) {
                        IUserService iUserService = this.this$0.f133901f;
                        String uid = user.getUid();
                        l.b(uid, "");
                        int a2 = com.ss.android.ugc.aweme.social.widget.a.a.a(user);
                        String secUid = user.getSecUid();
                        l.b(secUid, "");
                        FollowStatus a3 = iUserService.a(uid, a2, secUid);
                        if (a3 == null || ((FollowStatus) a3.checkValid()) == null) {
                            throw new IllegalStateException("follow result is illegal");
                        }
                        user.setFollowStatus(com.ss.android.ugc.aweme.social.widget.a.a.a(user));
                        arrayList.add(com.ss.android.ugc.aweme.social.c.b.a(user));
                    }
                    this.this$0.f133906k.postValue(arrayList);
                    SelectedCardVM.b(this.$targetUserList);
                    obj2 = q.m223constructorimpl(h.c.b.a.b.a(0));
                } catch (Throwable th) {
                    obj2 = q.m223constructorimpl(r.a(th));
                }
                Throwable r2 = q.m226exceptionOrNullimpl(obj2);
                if (r2 != null) {
                    f.a("SelectCard", "follow net work error!", r2);
                    Activity topActivity = ActivityStack.getTopActivity();
                    l.b(topActivity, "");
                    com.ss.android.ugc.aweme.common.l.a(topActivity, r2);
                    this.this$0.f133899d = false;
                }
                this.this$0.f133908m.postValue(false);
                return h.z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
