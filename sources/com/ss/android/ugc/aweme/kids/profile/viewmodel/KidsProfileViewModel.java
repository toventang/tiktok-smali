package com.ss.android.ugc.aweme.kids.profile.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.profile.e;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.ah;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class KidsProfileViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public bz f106791a;

    /* renamed from: b  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.kids.api.account.a.a> f106792b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<List<e>> f106793c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final t<Integer> f106794d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.kids.profile.a.a f106795e;

    static {
        Covode.recordClassIndex(68272);
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        bz bzVar;
        super.onCleared();
        bz bzVar2 = this.f106791a;
        if ((bzVar2 == null || !bzVar2.l()) && (bzVar = this.f106791a) != null) {
            bzVar.a((CancellationException) null);
        }
    }

    public static final class b<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f106796a = new b();

        static {
            Covode.recordClassIndex(68275);
        }

        b() {
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            if (l.a((Object) ((com.ss.android.ugc.aweme.kids.api.account.a.a) obj).isKidsMode(), (Object) true)) {
                return a.NONE;
            }
            return a.RESTART;
        }
    }

    public KidsProfileViewModel(com.ss.android.ugc.aweme.kids.profile.a.a aVar) {
        l.d(aVar, "");
        this.f106795e = aVar;
    }

    public static final class a extends k implements m<am, d<? super z>, Object> {
        int label;
        final /* synthetic */ KidsProfileViewModel this$0;

        static {
            Covode.recordClassIndex(68273);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(KidsProfileViewModel kidsProfileViewModel, d dVar) {
            super(2, dVar);
            this.this$0 = kidsProfileViewModel;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                ah ahVar = bf.f159041b;
                AnonymousClass1 r1 = new m<am, d<? super z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel.a.AnonymousClass1 */
                    Object L$0;
                    int label;
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(68274);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final d<z> create(Object obj, d<?> dVar) {
                        l.d(dVar, "");
                        return 
                    }
