package com.ss.android.ugc.aweme.friends.widget.contact.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.g;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.recommend.f;
import com.zhiliaoapp.musically.R;
import h.c.b.a.k;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.r;
import h.z;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;

public final class InviteContactVM extends ContactVM implements g {

    /* renamed from: k  reason: collision with root package name */
    public static final a f97357k = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final t<List<com.ss.android.ugc.aweme.friends.widget.contact.a>> f97358c;

    /* renamed from: d  reason: collision with root package name */
    public final LiveData<List<com.ss.android.ugc.aweme.friends.widget.contact.a>> f97359d;

    /* renamed from: e  reason: collision with root package name */
    public final t<InboxAdapterWidget.b> f97360e;

    /* renamed from: f  reason: collision with root package name */
    public final LiveData<InboxAdapterWidget.b> f97361f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> f97362g;

    /* renamed from: h  reason: collision with root package name */
    public final LiveData<Boolean> f97363h;

    /* renamed from: i  reason: collision with root package name */
    public AtomicBoolean f97364i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    final h f97365j = i.a((h.f.a.a) c.f97367a);

    /* renamed from: l  reason: collision with root package name */
    private final String f97366l;

    static {
        Covode.recordClassIndex(61848);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61849);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.widget.contact.vm.ContactVM
    public final String a() {
        return this.f97366l;
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.friends.widget.contact.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f97367a = new c();

        static {
            Covode.recordClassIndex(61851);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.friends.widget.contact.h invoke() {
            return new com.ss.android.ugc.aweme.friends.widget.contact.h(R.string.cm8);
        }
    }

    private static boolean c() {
        return com.ss.android.ugc.aweme.friends.service.a.f97047a.d().c();
    }

    public final bz b() {
        return kotlinx.coroutines.i.a(this.f97348b, null, null, new b(this, null), 3);
    }

    @Override // androidx.lifecycle.ac, com.ss.android.ugc.aweme.friends.widget.contact.vm.ContactVM
    public final void onCleared() {
        super.onCleared();
        com.ss.android.ugc.aweme.friends.service.a.f97047a.b(this);
    }

    public InviteContactVM() {
        t<List<com.ss.android.ugc.aweme.friends.widget.contact.a>> tVar = new t<>();
        this.f97358c = tVar;
        this.f97359d = tVar;
        t<InboxAdapterWidget.b> tVar2 = new t<>();
        this.f97360e = tVar2;
        this.f97361f = tVar2;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> cVar = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();
        this.f97362g = cVar;
        this.f97363h = cVar;
        com.ss.android.ugc.aweme.friends.service.a.f97047a.a(this);
        this.f97366l = "direct";
    }

    @Override // com.ss.android.ugc.aweme.friends.widget.contact.vm.ContactVM
    public final int a(com.ss.android.ugc.aweme.friends.widget.contact.a aVar) {
        l.d(aVar, "");
        List<com.ss.android.ugc.aweme.friends.widget.contact.a> value = this.f97358c.getValue();
        if (value != null) {
            return value.indexOf(aVar);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends k implements h.f.a.m<am, d<? super z>, Object> {
        int label;
        final /* synthetic */ InviteContactVM this$0;

        static {
            Covode.recordClassIndex(61850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(InviteContactVM inviteContactVM, d dVar) {
            super(2, dVar);
            this.this$0 = inviteContactVM;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                List<com.ss.android.ugc.aweme.friends.widget.contact.a> value = this.this$0.f97358c.getValue();
                if (value == null || value.isEmpty()) {
                    this.this$0.f97360e.postValue(InboxAdapterWidget.b.EMPTY);
                }
                return z.f158842a;
            } else if (i2 == 1) {
                r.a(obj);
                return z.f158842a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.g
    public final void a(f fVar) {
        l.d(fVar, "");
        if (fVar != f.CONTACT) {
            return;
        }
        if (!this.f97364i.get() && c()) {
            b();
        } else if (this.f97364i.get() && !c()) {
            this.f97358c.postValue(h.a.z.INSTANCE);
            this.f97360e.postValue(InboxAdapterWidget.b.EMPTY);
        }
    }
}
