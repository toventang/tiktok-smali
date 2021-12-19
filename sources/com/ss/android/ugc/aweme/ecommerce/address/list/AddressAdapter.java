package com.ss.android.ugc.aweme.ecommerce.address.list;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.h.v;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import java.util.LinkedHashMap;
import java.util.Objects;

public final class AddressAdapter extends com.ss.android.ugc.aweme.base.arch.c<Object> {

    /* renamed from: d  reason: collision with root package name */
    public final m f84517d;

    public static final class a {
        static {
            Covode.recordClassIndex(52744);
        }
    }

    static {
        Covode.recordClassIndex(52735);
    }

    public final class AddAddressBarHolder extends JediSimpleViewHolder<a> implements au {

        /* renamed from: f  reason: collision with root package name */
        final h f84518f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ AddressAdapter f84519g;

        static {
            Covode.recordClassIndex(52736);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void e() {
            super.e();
            View view = this.itemView;
            View view2 = this.itemView;
            l.b(view2, "");
            v.a(view, com.bytedance.ies.dmt.ui.common.c.c(view2.getContext()));
        }

        public static final class a extends h.f.b.m implements h.f.a.a<AddressListViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(52737);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter.AddAddressBarHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_address_list_AddressAdapter$AddAddressBarHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        public static final class b extends bp {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f84520a = 700;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AddAddressBarHolder f84521b;

            static {
                Covode.recordClassIndex(52738);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(AddAddressBarHolder addAddressBarHolder) {
                super(700);
                this.f84521b = addAddressBarHolder;
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                if (view != null) {
                    ((AddressListViewModel) this.f84521b.f84518f.getValue()).b();
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(a aVar) {
            l.d(aVar, "");
            View view = this.itemView;
            l.b(view, "");
            boolean z = true;
            if (this.f39676i == this.f84519g.getItemCount() - 1) {
                z = false;
            }
            a.C2089a.a(view, z);
            View view2 = this.itemView;
            l.b(view2, "");
            view2.setOnClickListener(new b(this));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AddAddressBarHolder(com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                h.f.b.l.d(r6, r3)
                r4.f84519g = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558935(0x7f0d0217, float:1.87432E38)
                r0 = 0
                android.view.View r0 = com.a.a(r2, r1, r6, r0)
                h.f.b.l.b(r0, r3)
                r4.<init>(r0)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddAddressBarHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddAddressBarHolder$a
                r0.<init>(r4, r1, r1)
                h.h r0 = h.i.a(r0)
                r4.f84518f = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter.AddAddressBarHolder.<init>(com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter, android.view.ViewGroup):void");
        }
    }

    public final class AddressViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ AddressAdapter f84522f;

        /* renamed from: g  reason: collision with root package name */
        private final h f84523g;

        static {
            Covode.recordClassIndex(52739);
        }

        public final AddressListViewModel m() {
            return (AddressListViewModel) this.f84523g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        public static final class a extends h.f.b.m implements h.f.a.a<AddressListViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(52740);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter.AddressViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_address_list_AddressAdapter$AddressViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        public static final class d extends bp {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f84534a = 700;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AddressViewHolder f84535b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Address f84536c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d f84537d;

            static {
                Covode.recordClassIndex(52743);
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                if (view != null) {
                    this.f84535b.m().a(this.f84537d.f85925b);
                    this.f84535b.a(this.f84536c.a(), "edit");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(AddressViewHolder addressViewHolder, Address address, com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar) {
                super(700);
                this.f84535b = addressViewHolder;
                this.f84536c = address;
                this.f84537d = dVar;
            }
        }

        public static final class c extends bp {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f84529a = 700;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AddressInfoCard f84530b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AddressViewHolder f84531c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Address f84532d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d f84533e;

            static {
                Covode.recordClassIndex(52742);
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                String hintText;
                if (view != null && (hintText = this.f84530b.getHintText()) != null && hintText.length() != 0) {
                    this.f84531c.a(this.f84532d.a(), "other");
                    this.f84531c.m().a(this.f84533e.f85925b);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(AddressInfoCard addressInfoCard, AddressViewHolder addressViewHolder, Address address, com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar) {
                super(700);
                this.f84530b = addressInfoCard;
                this.f84531c = addressViewHolder;
                this.f84532d = address;
                this.f84533e = dVar;
            }
        }

        public static final class b extends bp {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f84524a = 700;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AddressInfoCard f84525b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AddressViewHolder f84526c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Address f84527d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d f84528e;

            static {
                Covode.recordClassIndex(52741);
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                if (view != null) {
                    this.f84526c.a(this.f84527d.a(), "other");
                    String hintText = this.f84525b.getHintText();
                    if (hintText == null || hintText.length() == 0) {
                        AddressListViewModel m2 = this.f84526c.m();
                        Address address = this.f84528e.f85925b;
                        l.d(address, "");
                        m2.c(new AddressListViewModel.b(address));
                        return;
                    }
                    this.f84526c.m().a(this.f84528e.f85925b);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(AddressInfoCard addressInfoCard, AddressViewHolder addressViewHolder, Address address, com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar) {
                super(700);
                this.f84525b = addressInfoCard;
                this.f84526c = addressViewHolder;
                this.f84527d = address;
                this.f84528e = dVar;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar) {
            boolean z;
            String str;
            com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar2 = dVar;
            l.d(dVar2, "");
            View view = this.itemView;
            l.b(view, "");
            if (this.f39676i != this.f84522f.getItemCount() - 1) {
                z = true;
            } else {
                z = false;
            }
            a.C2089a.a(view, z);
            Address address = dVar2.f85925b;
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard");
            AddressInfoCard addressInfoCard = (AddressInfoCard) view2;
            addressInfoCard.setUiMode("show_all");
            String a2 = address.a(StringSet.name);
            if (a2 == null) {
                a2 = "";
            }
            addressInfoCard.setNameText(a2);
            String a3 = address.a("phone");
            if (a3 == null) {
                a3 = "";
            }
            addressInfoCard.setPhoneText(a3);
            String a4 = address.a("email");
            if (a4 == null) {
                a4 = "";
            }
            addressInfoCard.setEmailText(a4);
            addressInfoCard.setAddressDetailText(address.b());
            addressInfoCard.setRegionText(Address.a(address));
            String a5 = address.a("zipcode");
            if (a5 == null) {
                a5 = "";
            }
            addressInfoCard.setZipcodeText(a5);
            addressInfoCard.setHasPrefix(false);
            addressInfoCard.setSuffixType(1);
            addressInfoCard.setDefault(address.a());
            if (l.a((Object) dVar2.f85927d, (Object) false)) {
                str = dVar2.f85926c;
            } else {
                str = "";
            }
            addressInfoCard.setHintText(str);
            addressInfoCard.setPaddingVertical(22);
            AddressListViewModel m2 = m();
            if (((Boolean) m2.f84547b.a(m2, AddressListViewModel.f84546a[0])).booleanValue()) {
                addressInfoCard.setOnClickListener(new b(addressInfoCard, this, address, dVar2));
            } else {
                addressInfoCard.setOnClickListener(new c(addressInfoCard, this, address, dVar2));
            }
            TuxTextView tuxTextView = (TuxTextView) addressInfoCard.b(R.id.ars);
            l.b(tuxTextView, "");
            tuxTextView.setOnClickListener(new d(this, address, dVar2));
            boolean a6 = address.a();
            int i2 = this.f39676i - 1;
            Boolean bool = dVar2.f85927d;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(a.f84553a);
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("page_name", "shipping_info");
            linkedHashMap.put("module_name", "address");
            if (bool != null) {
                bool.booleanValue();
                linkedHashMap.put("is_valid", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            linkedHashMap.put("is_default", Integer.valueOf(a6 ? 1 : 0));
            linkedHashMap.put("rank", Integer.valueOf(i2));
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_module_show", linkedHashMap);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AddressViewHolder(com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r6, r0)
                r4.f84522f = r5
                com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard r3 = new com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard
                android.content.Context r2 = r6.getContext()
                h.f.b.l.b(r2, r0)
                r1 = 0
                r0 = 6
                r3.<init>(r2, r1, r0)
                r4.<init>(r3)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddressViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddressViewHolder$a
                r0.<init>(r4, r1, r1)
                h.h r0 = h.i.a(r0)
                r4.f84523g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter.AddressViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter, android.view.ViewGroup):void");
        }

        public final void a(boolean z, String str) {
            int i2 = this.f39676i - 1;
            Boolean bool = ((com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d) aI_()).f85927d;
            l.d(str, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(a.f84553a);
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("page_name", "shipping_info");
            linkedHashMap.put("module_name", "address");
            if (bool != null) {
                bool.booleanValue();
                linkedHashMap.put("is_valid", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            linkedHashMap.put("is_default", Integer.valueOf(z ? 1 : 0));
            linkedHashMap.put("rank", Integer.valueOf(i2));
            linkedHashMap.put("click_area", str);
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_module_click", linkedHashMap);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h, com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        return ((com.ss.android.ugc.aweme.base.arch.d) this).f67986a.b(i2);
    }

    static final class c extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends g, ?>> {
        final /* synthetic */ AddressAdapter this$0;

        static {
            Covode.recordClassIndex(52746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AddressAdapter addressAdapter) {
            super(1);
            this.this$0 = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new AddressViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends g, ?>> {
        final /* synthetic */ AddressAdapter this$0;

        static {
            Covode.recordClassIndex(52748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AddressAdapter addressAdapter) {
            super(1);
            this.this$0 = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new AddAddressBarHolder(this.this$0, viewGroup2);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ AddressAdapter this$0;

        static {
            Covode.recordClassIndex(52745);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AddressAdapter addressAdapter) {
            super(1);
            this.this$0 = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ AddressAdapter this$0;

        static {
            Covode.recordClassIndex(52747);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AddressAdapter addressAdapter) {
            super(1);
            this.this$0 = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressAdapter(m mVar) {
        super(mVar, new d(), 4);
        l.d(mVar, "");
        this.f84517d = mVar;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h
    public final void a(com.bytedance.jedi.ext.adapter.b.g<JediViewHolder<? extends g, ?>> gVar) {
        l.d(gVar, "");
        com.bytedance.jedi.ext.adapter.b.g unused = gVar.a(new b(this), null, new c(this));
        com.bytedance.jedi.ext.adapter.b.g unused2 = gVar.a(new d(this), null, new e(this));
    }
}
