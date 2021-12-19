package com.ss.android.ugc.aweme.ecommerce.delivery.page.address;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.z;
import java.util.Objects;

public final class AddressAdapter extends com.ss.android.ugc.aweme.base.arch.c<Object> {

    /* renamed from: d  reason: collision with root package name */
    public final m f85831d;

    static {
        Covode.recordClassIndex(53708);
    }

    public final class UnReachableTitleViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.delivery.b.b> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ AddressAdapter f85838f;

        static {
            Covode.recordClassIndex(53713);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void e() {
            super.e();
            View view = this.itemView;
            l.b(view, "");
            a.C2089a.a(view, false);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.delivery.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnReachableTitleViewHolder(com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                h.f.b.l.d(r6, r3)
                r4.f85838f = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558959(0x7f0d022f, float:1.8743249E38)
                r0 = 0
                android.view.View r0 = com.a.a(r2, r1, r6, r0)
                h.f.b.l.b(r0, r3)
                r4.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter.UnReachableTitleViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter, android.view.ViewGroup):void");
        }
    }

    public final class AddressViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d> implements au {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ AddressAdapter f85832f;

        /* renamed from: g  reason: collision with root package name */
        private final h f85833g;

        static {
            Covode.recordClassIndex(53709);
        }

        public final AddressSelectViewModel m() {
            return (AddressSelectViewModel) this.f85833g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        public static final class a extends h.f.b.m implements h.f.a.a<AddressSelectViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(53710);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter.AddressViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_ecommerce_delivery_page_address_AddressAdapter$AddressViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
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
            final /* synthetic */ long f85834a = 700;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AddressViewHolder f85835b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Address f85836c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d f85837d;

            static {
                Covode.recordClassIndex(53711);
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                if (view != null) {
                    this.f85835b.m().a(this.f85837d);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(AddressViewHolder addressViewHolder, Address address, com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar) {
                super(700);
                this.f85835b = addressViewHolder;
                this.f85836c = address;
                this.f85837d = dVar;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar) {
            com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar2 = dVar;
            String str = "";
            l.d(dVar2, str);
            View view = this.itemView;
            l.b(view, str);
            boolean z = true;
            if (this.f39676i == this.f85832f.getItemCount() - 1) {
                z = false;
            }
            a.C2089a.a(view, z);
            Address address = dVar2.f85925b;
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard");
            AddressInfoCard addressInfoCard = (AddressInfoCard) view2;
            String a2 = address.a(StringSet.name);
            if (a2 == null) {
                a2 = str;
            }
            addressInfoCard.setNameText(a2);
            String a3 = address.a("phone");
            if (a3 == null) {
                a3 = str;
            }
            addressInfoCard.setPhoneText(a3);
            String a4 = address.a("email");
            if (a4 == null) {
                a4 = str;
            }
            addressInfoCard.setEmailText(a4);
            addressInfoCard.setAddressDetailText(address.b());
            addressInfoCard.setRegionText(Address.a(address));
            String a5 = address.a("zipcode");
            if (a5 != null) {
                str = a5;
            }
            addressInfoCard.setZipcodeText(str);
            addressInfoCard.setHasPrefix(false);
            addressInfoCard.setSuffixType(3);
            addressInfoCard.setReachable(dVar2.f85924a);
            addressInfoCard.setOnClickListener(new b(this, address, dVar2));
            addressInfoCard.setClickable(dVar2.f85924a);
            f.a.b.b unused = selectSubscribe(m(), a.f85840a, new ah(), new c(addressInfoCard, this, address, dVar2));
        }

        static final class c extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d>, com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d, z> {
            final /* synthetic */ Address $address$inlined;
            final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d $item$inlined;
            final /* synthetic */ AddressInfoCard $this_with;
            final /* synthetic */ AddressViewHolder this$0;

            static {
                Covode.recordClassIndex(53712);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(AddressInfoCard addressInfoCard, AddressViewHolder addressViewHolder, Address address, com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar) {
                super(2);
                this.$this_with = addressInfoCard;
                this.this$0 = addressViewHolder;
                this.$address$inlined = address;
                this.$item$inlined = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d> jediSimpleViewHolder, com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar) {
                String str;
                boolean z;
                Address address;
                com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d dVar2 = dVar;
                l.d(jediSimpleViewHolder, "");
                RadioButton radioButton = (RadioButton) this.$this_with.b(R.id.dgn);
                l.b(radioButton, "");
                if (dVar2 == null || (address = dVar2.f85925b) == null) {
                    str = null;
                } else {
                    str = address.f84298a;
                }
                if (!l.a((Object) str, (Object) this.$address$inlined.f84298a) || !dVar2.f85924a) {
                    z = false;
                } else {
                    z = true;
                }
                radioButton.setChecked(z);
                return z.f158842a;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AddressViewHolder(com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r6, r0)
                r4.f85832f = r5
                com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard r3 = new com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard
                android.content.Context r2 = r6.getContext()
                h.f.b.l.b(r2, r0)
                r1 = 0
                r0 = 6
                r3.<init>(r2, r1, r0)
                r4.<init>(r3)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$AddressViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$AddressViewHolder$a
                r0.<init>(r4, r1, r1)
                h.h r0 = h.i.a(r0)
                r4.f85833g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter.AddressViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter, android.view.ViewGroup):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h, com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        return ((com.ss.android.ugc.aweme.base.arch.d) this).f67986a.b(i2);
    }

    static final class b extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f85839a = new b();

        static {
            Covode.recordClassIndex(53715);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new ShipToBarHolder(viewGroup2, false);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends g, ?>> {
        final /* synthetic */ AddressAdapter this$0;

        static {
            Covode.recordClassIndex(53717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AddressAdapter addressAdapter) {
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

    static final class f extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends g, ?>> {
        final /* synthetic */ AddressAdapter this$0;

        static {
            Covode.recordClassIndex(53719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AddressAdapter addressAdapter) {
            super(1);
            this.this$0 = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new UnReachableTitleViewHolder(this.this$0, viewGroup2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressAdapter(m mVar) {
        super(mVar, (j.e) null, 6);
        l.d(mVar, "");
        this.f85831d = mVar;
    }

    static final class a extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ AddressAdapter this$0;

        static {
            Covode.recordClassIndex(53714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AddressAdapter addressAdapter) {
            super(1);
            this.this$0 = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.delivery.b.a);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ AddressAdapter this$0;

        static {
            Covode.recordClassIndex(53716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AddressAdapter addressAdapter) {
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

    static final class e extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ AddressAdapter this$0;

        static {
            Covode.recordClassIndex(53718);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AddressAdapter addressAdapter) {
            super(1);
            this.this$0 = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.this$0.a(num.intValue()) instanceof com.ss.android.ugc.aweme.ecommerce.delivery.b.b);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h
    public final void a(com.bytedance.jedi.ext.adapter.b.g<JediViewHolder<? extends g, ?>> gVar) {
        l.d(gVar, "");
        com.bytedance.jedi.ext.adapter.b.g unused = gVar.a(new a(this), null, b.f85839a);
        com.bytedance.jedi.ext.adapter.b.g unused2 = gVar.a(new c(this), null, new d(this));
        com.bytedance.jedi.ext.adapter.b.g unused3 = gVar.a(new e(this), null, new f(this));
    }
}
