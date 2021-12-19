package com.ss.android.ugc.aweme.ecommerce.address.list;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.lancet.j;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.f.b.r;
import h.k.i;
import h.p;
import java.util.HashMap;
import java.util.List;

public final class AddressListViewModel extends JediViewModel<AddressListState> implements IEventCenter.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ i[] f84546a = {new r(AddressListViewModel.class, "isSelectMode", "isSelectMode()Z", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final h.h.e f84547b = h.h.a.a();

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, Object> f84548c;

    static {
        Covode.recordClassIndex(52761);
    }

    public final void b() {
        c(a.f84549a);
    }

    private static boolean g() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ AddressListState d() {
        return new AddressListState(0, null, null, null, null, null, 63, null);
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        EventCenter.a().b("ec_address_change", this);
    }

    public final void a() {
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = g();
        }
        if (!j.f107226e) {
            a(2);
            return;
        }
        a(0);
        f.a.b.b a2 = com.ss.android.ugc.aweme.ecommerce.track.b.a(((AddressApi) AddressApi.a.f84265a.a(AddressApi.class)).getAddressList(), "shipping_info", new p[0]).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this), new e(this));
        l.b(a2, "");
        a(a2);
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddressListViewModel f84551a;

        static {
            Covode.recordClassIndex(52767);
        }

        e(AddressListViewModel addressListViewModel) {
            this.f84551a = addressListViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f84551a.a(3);
        }
    }

    public final void a(int i2) {
        c(new g(i2));
    }

    static final class a extends m implements h.f.a.b<AddressListState, AddressListState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f84549a = new a();

        static {
            Covode.recordClassIndex(52762);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AddressListState invoke(AddressListState addressListState) {
            AddressListState addressListState2 = addressListState;
            l.d(addressListState2, "");
            return AddressListState.copy$default(addressListState2, 0, null, new b(), null, null, null, 59, null);
        }
    }

    static final class b extends m implements h.f.a.b<AddressListState, AddressListState> {
        final /* synthetic */ Address $address;

        static {
            Covode.recordClassIndex(52763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Address address) {
            super(1);
            this.$address = address;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AddressListState invoke(AddressListState addressListState) {
            AddressListState addressListState2 = addressListState;
            l.d(addressListState2, "");
            return AddressListState.copy$default(addressListState2, 0, null, null, null, new b(this.$address), null, 47, null);
        }
    }

    static final class c extends m implements h.f.a.b<AddressListState, AddressListState> {
        final /* synthetic */ Address $address;

        static {
            Covode.recordClassIndex(52764);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Address address) {
            super(1);
            this.$address = address;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AddressListState invoke(AddressListState addressListState) {
            AddressListState addressListState2 = addressListState;
            l.d(addressListState2, "");
            return AddressListState.copy$default(addressListState2, 0, null, null, new b(this.$address), null, null, 55, null);
        }
    }

    static final class f extends m implements h.f.a.b<AddressListState, AddressListState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f84552a = new f();

        static {
            Covode.recordClassIndex(52768);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AddressListState invoke(AddressListState addressListState) {
            AddressListState addressListState2 = addressListState;
            l.d(addressListState2, "");
            return AddressListState.copy$default(addressListState2, 0, null, null, null, null, new c(), 31, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<AddressListState, AddressListState> {
        final /* synthetic */ int $status;

        static {
            Covode.recordClassIndex(52769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(int i2) {
            super(1);
            this.$status = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AddressListState invoke(AddressListState addressListState) {
            AddressListState addressListState2 = addressListState;
            l.d(addressListState2, "");
            return AddressListState.copy$default(addressListState2, this.$status, null, null, null, null, null, 62, null);
        }
    }

    public final void a(Address address) {
        l.d(address, "");
        c(new c(address));
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddressListViewModel f84550a;

        static {
            Covode.recordClassIndex(52765);
        }

        d(AddressListViewModel addressListViewModel) {
            this.f84550a = addressListViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            T t = ((u) obj).f42630b;
            final T t2 = t.data;
            if (!t.isCodeOK() || t2 == null) {
                this.f84550a.a(3);
                return;
            }
            List<com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d> list = t2.f84325a;
            if (list == null || list.isEmpty()) {
                this.f84550a.a(4);
            } else {
                this.f84550a.a(-1);
            }
            this.f84550a.c(new h.f.a.b<AddressListState, AddressListState>() {
                /* class com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(52766);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ AddressListState invoke(AddressListState addressListState) {
                    AddressListState addressListState2 = addressListState;
                    l.d(addressListState2, "");
                    List list = t2.f84325a;
                    if (list == null) {
                        list = z.INSTANCE;
                    }
                    return AddressListState.copy$default(addressListState2, 0, list, null, null, null, null, 61, null);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.b
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (str.hashCode() == 1819520028 && str.equals("ec_address_change")) {
            int i2 = AddressPageStarter.a.C2012a.a(str2).f84260b;
            if (i2 == 0 || i2 == 1) {
                a();
            } else if (i2 == 2) {
                a();
                c(f.f84552a);
            }
        }
    }
}
