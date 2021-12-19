package com.ss.android.ugc.aweme.ecommerce.address.edit;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import h.a.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class AddressEditViewModel extends JediViewModel<AddressEditState> {

    /* renamed from: a  reason: collision with root package name */
    public Region f84354a;

    /* renamed from: b  reason: collision with root package name */
    public Address f84355b;

    /* renamed from: c  reason: collision with root package name */
    public List<Region> f84356c;

    /* renamed from: d  reason: collision with root package name */
    public String f84357d = "0";

    /* renamed from: e  reason: collision with root package name */
    public boolean f84358e;

    /* renamed from: f  reason: collision with root package name */
    public String f84359f = "";

    /* renamed from: g  reason: collision with root package name */
    public HashMap<String, Object> f84360g;

    /* renamed from: k  reason: collision with root package name */
    public i f84361k;

    /* renamed from: l  reason: collision with root package name */
    public j f84362l;

    /* renamed from: m  reason: collision with root package name */
    public h.p<String, Address> f84363m;
    public AddressPageStarter.AddressEditEnterParams n;
    public List<com.ss.android.ugc.aweme.ecommerce.address.a.a> o = z.INSTANCE;
    public boolean p;
    public Address q;

    static {
        Covode.recordClassIndex(52598);
    }

    public static final class k extends com.google.gson.b.a<HashMap<String, Object>> {
        static {
            Covode.recordClassIndex(52612);
        }

        k() {
        }
    }

    public final Address g() {
        return a(this.o, true);
    }

    private static boolean h() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean h2 = h();
        com.ss.android.ugc.aweme.lancet.j.f107226e = h2;
        return h2;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ AddressEditState d() {
        return new AddressEditState(0, null, null, null, null, false, 0, false, 255, null);
    }

    public final void a() {
        if (!b()) {
            a(2);
            return;
        }
        a(0);
        f.a.b.b a2 = com.ss.android.ugc.aweme.ecommerce.track.b.a(AddressApi.a.a(this.f84354a), "shipping_address", new h.p[0]).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new i(this), new j(this));
        h.f.b.l.b(a2, "");
        a(a2);
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddressEditViewModel f84368a;

        static {
            Covode.recordClassIndex(52603);
        }

        c(AddressEditViewModel addressEditViewModel) {
            this.f84368a = addressEditViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f84368a.c(AnonymousClass1.f84369a);
        }
    }

    public static final class e implements f.a.z<com.bytedance.retrofit2.u<com.ss.android.ugc.aweme.ecommerce.api.model.a<com.ss.android.ugc.aweme.ecommerce.address.dto.c>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f84370a;

        static {
            Covode.recordClassIndex(52606);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            h.f.b.l.d(bVar, "");
        }

        e(h.c.d dVar) {
            this.f84370a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(com.bytedance.retrofit2.u<com.ss.android.ugc.aweme.ecommerce.api.model.a<com.ss.android.ugc.aweme.ecommerce.address.dto.c>> uVar) {
            h.f.b.l.d(uVar, "");
            this.f84370a.resumeWith(h.q.m223constructorimpl(uVar));
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            h.f.b.l.d(th, "");
            this.f84370a.resumeWith(h.q.m223constructorimpl(h.r.a(th)));
        }
    }

    public static final class f implements f.a.z<com.bytedance.retrofit2.u<com.ss.android.ugc.aweme.ecommerce.api.model.a<com.ss.android.ugc.aweme.ecommerce.address.dto.e>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f84371a;

        static {
            Covode.recordClassIndex(52607);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            h.f.b.l.d(bVar, "");
        }

        f(h.c.d dVar) {
            this.f84371a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(com.bytedance.retrofit2.u<com.ss.android.ugc.aweme.ecommerce.api.model.a<com.ss.android.ugc.aweme.ecommerce.address.dto.e>> uVar) {
            h.f.b.l.d(uVar, "");
            this.f84371a.resumeWith(h.q.m223constructorimpl(uVar));
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            h.f.b.l.d(th, "");
            this.f84371a.resumeWith(h.q.m223constructorimpl(h.r.a(th)));
        }
    }

    static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddressEditViewModel f84373a;

        static {
            Covode.recordClassIndex(52611);
        }

        j(AddressEditViewModel addressEditViewModel) {
            this.f84373a = addressEditViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f84373a.a(3);
        }
    }

    static final class p<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddressEditViewModel f84379a;

        static {
            Covode.recordClassIndex(52621);
        }

        p(AddressEditViewModel addressEditViewModel) {
            this.f84379a = addressEditViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f84379a.c(AnonymousClass1.f84380a);
        }
    }

    public static final class y<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddressEditViewModel f84386a;

        static {
            Covode.recordClassIndex(52633);
        }

        public y(AddressEditViewModel addressEditViewModel) {
            this.f84386a = addressEditViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f84386a.c(AnonymousClass1.f84387a);
        }
    }

    public final void a(List<com.ss.android.ugc.aweme.ecommerce.address.a.a> list) {
        h.f.b.l.d(list, "");
        this.o = list;
    }

    static final class a extends h.f.b.m implements h.f.a.b<AddressEditState, AddressEditState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f84364a = new a();

        static {
            Covode.recordClassIndex(52599);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            h.f.b.l.d(addressEditState2, "");
            return AddressEditState.copy$default(addressEditState2, 0, null, 0, null, null, false, 0, false, 251, null);
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddressEditViewModel f84365a;

        static {
            Covode.recordClassIndex(52600);
        }

        b(AddressEditViewModel addressEditViewModel) {
            this.f84365a = addressEditViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (!((com.ss.android.ugc.aweme.ecommerce.api.model.a) obj).isCodeOK()) {
                this.f84365a.c(AnonymousClass1.f84366a);
            } else {
                this.f84365a.c(AnonymousClass2.f84367a);
            }
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<AddressEditState, AddressEditState> {
        final /* synthetic */ List $inputItemVOListNew$inlined;
        final /* synthetic */ AddressEditViewModel this$0;

        static {
            Covode.recordClassIndex(52605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AddressEditViewModel addressEditViewModel, List list) {
            super(1);
            this.this$0 = addressEditViewModel;
            this.$inputItemVOListNew$inlined = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            h.f.b.l.d(addressEditState2, "");
            return AddressEditState.copy$default(addressEditState2, 0, null, null, null, this.$inputItemVOListNew$inlined, false, 0, false, 239, null);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<AddressEditState, AddressEditState> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f84374a = new n();

        static {
            Covode.recordClassIndex(52615);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            h.f.b.l.d(addressEditState2, "");
            return AddressEditState.copy$default(addressEditState2, 0, null, null, 0, null, false, 0, false, 247, null);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<AddressEditState, AddressEditState> {
        final /* synthetic */ boolean $visible;

        static {
            Covode.recordClassIndex(52623);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(boolean z) {
            super(1);
            this.$visible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            h.f.b.l.d(addressEditState2, "");
            return AddressEditState.copy$default(addressEditState2, 0, null, null, null, null, this.$visible, 0, false, 223, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.f.b.m implements h.f.a.b<AddressEditState, h.z> {
        final /* synthetic */ AddressEditViewModel this$0;

        static {
            Covode.recordClassIndex(52625);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(AddressEditViewModel addressEditViewModel) {
            super(1);
            this.this$0 = addressEditViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            h.f.b.l.d(addressEditState2, "");
            this.this$0.a(addressEditState2.getInputItemVOList());
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u extends h.f.b.m implements h.f.a.b<AddressEditState, AddressEditState> {
        final /* synthetic */ int $status;

        static {
            Covode.recordClassIndex(52627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(int i2) {
            super(1);
            this.$status = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            h.f.b.l.d(addressEditState2, "");
            return AddressEditState.copy$default(addressEditState2, this.$status, null, null, null, null, false, 0, false, 254, null);
        }
    }

    public static final class w extends h.f.b.m implements h.f.a.b<AddressEditState, AddressEditState> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f84381a = new w();

        static {
            Covode.recordClassIndex(52629);
        }

        w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            h.f.b.l.d(addressEditState2, "");
            return AddressEditState.copy$default(addressEditState2, 0, 0, null, null, null, false, 0, false, 253, null);
        }
    }

    public final void a(int i2) {
        c(new u(i2));
    }

    public static final class g extends h.f.b.m implements h.f.a.b<AddressEditState, h.z> {
        final /* synthetic */ h.f.a.b $block;
        final /* synthetic */ String $itemKey;
        final /* synthetic */ AddressEditViewModel this$0;

        static {
            Covode.recordClassIndex(52608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(AddressEditViewModel addressEditViewModel, String str, h.f.a.b bVar) {
            super(1);
            this.this$0 = addressEditViewModel;
            this.$itemKey = str;
            this.$block = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(AddressEditState addressEditState) {
            AddressEditState addressEditState2 = addressEditState;
            h.f.b.l.d(addressEditState2, "");
            AddressEditViewModel addressEditViewModel = this.this$0;
            String str = this.$itemKey;
            Address a2 = addressEditViewModel.a(addressEditState2, true);
            h.f.a.b bVar = this.$block;
            h.f.b.l.d(bVar, "");
            if (!(!AddressEditViewModel.b() || str == null || str.length() == 0 || a2 == null)) {
                bz unused = kotlinx.coroutines.i.a(bs.f159054a, kotlinx.coroutines.internal.o.f159148a, null, new h(addressEditViewModel, str, a2, bVar, null), 2);
            }
            return h.z.f158842a;
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddressEditViewModel f84372a;

        static {
            Covode.recordClassIndex(52610);
        }

        i(AddressEditViewModel addressEditViewModel) {
            this.f84372a = addressEditViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            T t = ((com.bytedance.retrofit2.u) obj).f42630b;
            T t2 = t.data;
            if (!t.isCodeOK() || t2 == null) {
                this.f84372a.a(3);
                return;
            }
            this.f84372a.a(-1);
            this.f84372a.a((InputItemData) t2);
        }
    }

    public static final class x<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddressEditViewModel f84382a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Region f84383b;

        static {
            Covode.recordClassIndex(52630);
        }

        public x(AddressEditViewModel addressEditViewModel, Region region) {
            this.f84382a = addressEditViewModel;
            this.f84383b = region;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            T t = ((com.bytedance.retrofit2.u) obj).f42630b;
            T t2 = t.data;
            if (!t.isCodeOK() || t2 == null) {
                this.f84382a.c(AnonymousClass1.f84384a);
                return;
            }
            this.f84382a.f84354a = this.f84383b;
            this.f84382a.f84358e = true;
            this.f84382a.c(AnonymousClass2.f84385a);
            this.f84382a.a((InputItemData) t2);
        }
    }

    public final void a(Address address) {
        c(new v(this, address));
    }

    static final class h extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ Address $address;
        final /* synthetic */ h.f.a.b $block;
        final /* synthetic */ String $itemKey;
        int label;
        final /* synthetic */ AddressEditViewModel this$0;

        static {
            Covode.recordClassIndex(52609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(AddressEditViewModel addressEditViewModel, String str, Address address, h.f.a.b bVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = addressEditViewModel;
            this.$itemKey = str;
            this.$address = address;
            this.$block = bVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new h(this.this$0, this.$itemKey, this.$address, this.$block, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((h) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            T t;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                try {
                    com.ss.android.ugc.aweme.ecommerce.address.dto.f fVar = new com.ss.android.ugc.aweme.ecommerce.address.dto.f(this.$itemKey, this.$address);
                    this.label = 1;
                    h.c.h hVar = new h.c.h(h.c.a.b.a(this));
                    h.f.b.l.d(fVar, "");
                    ((AddressApi) AddressApi.a.f84265a.a(AddressApi.class)).getCandInput(fVar).b(f.a.h.a.b(f.a.k.a.f158006c)).b(new f(hVar));
                    obj = hVar.a();
                    if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                        h.f.b.l.d(this, "");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Throwable unused) {
                }
            } else if (i2 == 1) {
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bytedance.retrofit2.u uVar = (com.bytedance.retrofit2.u) obj;
            if (uVar.f42630b.isCodeOK() && (t = uVar.f42630b.data) != null) {
                this.$block.invoke(t);
            }
            return h.z.f158842a;
        }
    }

    public static final class t extends h.f.b.m implements h.f.a.b<AddressEditState, AddressEditState> {
        final /* synthetic */ boolean $isFocused;

        static {
            Covode.recordClassIndex(52626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public t(boolean z) {
            super(1);
            this.$isFocused = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
            int i2;
            AddressEditState addressEditState2 = addressEditState;
            h.f.b.l.d(addressEditState2, "");
            if (this.$isFocused) {
                Iterator<T> it = addressEditState2.getInputItemVOList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (h.f.b.l.a((Object) next.f84261a.f84310d, (Object) "address")) {
                        if (next != null) {
                            i2 = addressEditState2.getInputItemVOList().indexOf(next);
                        }
                    }
                }
            }
            i2 = -1;
            return AddressEditState.copy$default(addressEditState2, 0, null, null, null, null, false, i2, this.$isFocused, 63, null);
        }
    }

    public static final class l extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ String $autocompleteAddressId;
        final /* synthetic */ h.f.a.b $block;
        final /* synthetic */ String $sessionKey;
        final /* synthetic */ Address $shippingAddress;
        int label;
        final /* synthetic */ AddressEditViewModel this$0;

        static {
            Covode.recordClassIndex(52613);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(AddressEditViewModel addressEditViewModel, Address address, String str, String str2, h.f.a.b bVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = addressEditViewModel;
            this.$shippingAddress = address;
            this.$sessionKey = str;
            this.$autocompleteAddressId = str2;
            this.$block = bVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new l(this.this$0, this.$shippingAddress, this.$sessionKey, this.$autocompleteAddressId, this.$block, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((l) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            T t;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                try {
                    com.ss.android.ugc.aweme.ecommerce.address.dto.b bVar = new com.ss.android.ugc.aweme.ecommerce.address.dto.b(this.$shippingAddress, this.$sessionKey, this.$autocompleteAddressId);
                    this.label = 1;
                    h.c.h hVar = new h.c.h(h.c.a.b.a(this));
                    h.f.b.l.d(bVar, "");
                    ((AddressApi) AddressApi.a.f84265a.a(AddressApi.class)).getCandDetailPlace(bVar).b(f.a.h.a.b(f.a.k.a.f158006c)).b(new e(hVar));
                    obj = hVar.a();
                    if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                        h.f.b.l.d(this, "");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Throwable unused) {
                    com.bytedance.services.apm.api.a.a("queryCandDetailPlace fail");
                }
            } else if (i2 == 1) {
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bytedance.retrofit2.u uVar = (com.bytedance.retrofit2.u) obj;
            if (uVar.f42630b.isCodeOK() && (t = uVar.f42630b.data) != null) {
                this.$block.invoke(t);
            }
            return h.z.f158842a;
        }
    }

    static final class o<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddressEditViewModel f84375a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Address f84376b;

        static {
            Covode.recordClassIndex(52616);
        }

        o(AddressEditViewModel addressEditViewModel, Address address) {
            this.f84375a = addressEditViewModel;
            this.f84376b = address;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            T t = ((com.bytedance.retrofit2.u) obj).f42630b;
            final T t2 = t.data;
            if (!t.isCodeOK() || t2 == null) {
                this.f84375a.c(AnonymousClass1.f84377a);
                return;
            }
            List<com.ss.android.ugc.aweme.ecommerce.address.dto.i> list = t2.f84346b;
            if (list == null || list.isEmpty()) {
                EventCenter.a().a("ec_address_change", new AddressPageStarter.a(t2.f84345a, !h.f.b.l.a(this.f84375a.f84357d, "0") ? 1 : 0).a());
                AddressEditViewModel addressEditViewModel = this.f84375a;
                String str = t2.f84345a;
                h.f.b.l.d(str, "");
                addressEditViewModel.f84357d = str;
                this.f84375a.f84363m = h.v.a(t2.f84345a, this.f84376b);
                this.f84375a.c(AnonymousClass2.f84378a);
                i iVar = this.f84375a.f84361k;
                if (iVar != null) {
                    iVar.a(true, (List<String>) z.INSTANCE);
                }
                j jVar = this.f84375a.f84362l;
                if (jVar != null) {
                    jVar.a(true, (List<String>) z.INSTANCE);
                    return;
                }
                return;
            }
            this.f84375a.c(new h.f.a.b<AddressEditState, AddressEditState>() {
                /* class com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.o.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(52619);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ AddressEditState invoke(AddressEditState addressEditState) {
                    T t;
                    AddressEditState addressEditState2 = addressEditState;
                    h.f.b.l.d(addressEditState2, "");
                    List<com.ss.android.ugc.aweme.ecommerce.address.a.a> inputItemVOList = addressEditState2.getInputItemVOList();
                    ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) inputItemVOList, 10));
                    Iterator<T> it = inputItemVOList.iterator();
                    while (it.hasNext()) {
                        String str = null;
                        com.ss.android.ugc.aweme.ecommerce.address.a.a a2 = com.ss.android.ugc.aweme.ecommerce.address.a.a.a(it.next(), null, null, null, 7);
                        Iterator<T> it2 = t2.f84346b.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            if (h.f.b.l.a((Object) t.f84342a, (Object) a2.f84261a.f84310d)) {
                                break;
                            }
                        }
                        T t2 = t;
                        if (t2 != null) {
                            str = t2.f84343b;
                        }
                        a2.f84263c = str;
                        arrayList.add(a2);
                    }
                    return AddressEditState.copy$default(addressEditState2, 0, null, null, 3, arrayList, false, 0, false, 231, null);
                }
            });
            this.f84375a.b_(new h.f.a.b<AddressEditState, h.z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.o.AnonymousClass4 */
                final /* synthetic */ o this$0;

                static {
                    Covode.recordClassIndex(52620);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(AddressEditState addressEditState) {
                    AddressEditState addressEditState2 = addressEditState;
                    h.f.b.l.d(addressEditState2, "");
                    this.this$0.f84375a.a(addressEditState2.getInputItemVOList());
                    return h.z.f158842a;
                }
            });
            i iVar2 = this.f84375a.f84361k;
            if (iVar2 != null) {
                List<com.ss.android.ugc.aweme.ecommerce.address.dto.i> list2 = t2.f84346b;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    String str2 = it.next().f84342a;
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
                iVar2.a(false, (List<String>) arrayList);
            }
            j jVar2 = this.f84375a.f84362l;
            if (jVar2 != null) {
                List<com.ss.android.ugc.aweme.ecommerce.address.dto.i> list3 = t2.f84346b;
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    String str3 = it2.next().f84342a;
                    if (str3 != null) {
                        arrayList2.add(str3);
                    }
                }
                jVar2.a(false, (List<String>) arrayList2);
            }
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<AddressEditState, h.z> {
        final /* synthetic */ AddressEditViewModel this$0;

        static {
            Covode.recordClassIndex(52614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(AddressEditViewModel addressEditViewModel) {
            super(1);
            this.this$0 = addressEditViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0115, code lost:
            r5 = r10.this$0.a(r11, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x011b, code lost:
            if (r5 == null) goto L_0x017b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x011d, code lost:
            r4 = r10.this$0;
            r4.c(com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.n.f84374a);
            h.f.b.l.d(r5, "");
            r0 = com.ss.android.ugc.aweme.ecommerce.track.b.a(((com.ss.android.ugc.aweme.ecommerce.address.api.AddressApi) com.ss.android.ugc.aweme.ecommerce.address.api.AddressApi.a.f84265a.a(com.ss.android.ugc.aweme.ecommerce.address.api.AddressApi.class)).saveAddress(new com.ss.android.ugc.aweme.ecommerce.address.dto.l(r5)), "shipping_address", new h.p[0]).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.o(r4, r5), new com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.p(r4));
            h.f.b.l.b(r0, "");
            r4.a(r0);
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditState r11) {
            /*
            // Method dump skipped, instructions count: 382
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.m.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.b<AddressEditState, AddressEditState> {
        final /* synthetic */ InputItemData $inputItemData;
        final /* synthetic */ AddressEditViewModel this$0;

        static {
            Covode.recordClassIndex(52624);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(AddressEditViewModel addressEditViewModel, InputItemData inputItemData) {
            super(1);
            this.this$0 = addressEditViewModel;
            this.$inputItemData = inputItemData;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x018b, code lost:
            if (r13.equals("region") != false) goto L_0x008e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x015b  */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditState invoke(com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditState r27) {
            /*
            // Method dump skipped, instructions count: 464
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.r.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class v extends h.f.b.m implements h.f.a.b<AddressEditState, AddressEditState> {
        final /* synthetic */ Address $address;
        final /* synthetic */ AddressEditViewModel this$0;

        static {
            Covode.recordClassIndex(52628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(AddressEditViewModel addressEditViewModel, Address address) {
            super(1);
            this.this$0 = addressEditViewModel;
            this.$address = address;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x003a A[SYNTHETIC] */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditState invoke(com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditState r24) {
            /*
            // Method dump skipped, instructions count: 340
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.v.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(InputItemData inputItemData) {
        Region region;
        if (Region.a.a(this.f84354a, inputItemData.f84318b)) {
            region = inputItemData.f84318b;
        } else {
            region = null;
        }
        this.f84354a = region;
        c(new r(this, inputItemData));
        b_(new s(this));
    }

    public final void a(boolean z) {
        c(new q(z));
    }

    public final Address a(AddressEditState addressEditState, boolean z) {
        return a(addressEditState.getInputItemVOList(), z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.util.List<com.ss.android.ugc.aweme.ecommerce.address.dto.Rule> r8, java.lang.Object r9) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.a(java.util.List, java.lang.Object):java.lang.String");
    }

    private final Address a(List<com.ss.android.ugc.aweme.ecommerce.address.a.a> list, boolean z) {
        T t2;
        T t3;
        T t4;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (h.f.b.l.a((Object) t2.f84261a.f84310d, (Object) "region")) {
                break;
            }
        }
        T t5 = t2;
        Object obj = t5 != null ? t5.f84262b : null;
        if (!(obj instanceof Region)) {
            obj = null;
        }
        Region region = (Region) obj;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t3 = null;
                break;
            }
            t3 = it2.next();
            if (h.f.b.l.a((Object) t3.f84261a.f84310d, (Object) "districts")) {
                break;
            }
        }
        T t6 = t3;
        Object obj2 = t6 != null ? t6.f84262b : null;
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list2 = (List) obj2;
        ArrayList arrayList = new ArrayList();
        for (T t7 : list) {
            String str = t7.f84261a.f84310d;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -934795532) {
                    if (hashCode != 106642798) {
                        if (hashCode == 367869605 && str.equals("districts")) {
                        }
                    } else if (str.equals("phone")) {
                    }
                } else if (str.equals("region")) {
                }
                String str2 = t7.f84261a.f84310d;
                Object obj3 = t7.f84262b;
                if (!(obj3 instanceof String)) {
                    obj3 = null;
                }
                String str3 = (String) obj3;
                if (!(str2 == null || str3 == null)) {
                    arrayList.add(new AddressItem(str2, str3));
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                t4 = null;
                break;
            }
            t4 = it3.next();
            if (h.f.b.l.a((Object) t4.f84261a.f84310d, (Object) "phone")) {
                break;
            }
        }
        T t8 = t4;
        if (t8 != null) {
            Object obj4 = t8.f84262b;
            if (!(obj4 instanceof h.p)) {
                obj4 = null;
            }
            h.p pVar = (h.p) obj4;
            if (pVar != null) {
                arrayList2 = h.a.n.g((Collection) arrayList2);
                String str4 = (String) pVar.getFirst();
                if (str4 != null) {
                    arrayList2.add(new AddressItem("phone_region_code", str4));
                }
                String str5 = (String) pVar.getSecond();
                if (str5 != null) {
                    arrayList2.add(new AddressItem("phone", str5));
                }
            }
        }
        if ((region == null || list2 == null) && !z) {
            return null;
        }
        return new Address(this.f84357d, arrayList2, region, list2);
    }
}
