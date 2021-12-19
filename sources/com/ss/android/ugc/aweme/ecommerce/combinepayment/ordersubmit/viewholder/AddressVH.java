package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import java.util.LinkedHashMap;

public final class AddressVH extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.a> implements au {

    /* renamed from: f  reason: collision with root package name */
    public final View f85078f;

    /* renamed from: g  reason: collision with root package name */
    private final h f85079g;

    /* renamed from: j  reason: collision with root package name */
    private String f85080j;

    static {
        Covode.recordClassIndex(53177);
    }

    public final OrderSubmitViewModel m() {
        return (OrderSubmitViewModel) this.f85079g.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        a.C2089a.a(this.f85078f, true);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<OrderSubmitViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(53178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.AddressVH.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_viewholder_AddressVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressVH(View view) {
        super(view);
        l.d(view, "");
        this.f85078f = view;
        h.k.c a2 = h.f.b.ab.a(OrderSubmitViewModel.class);
        this.f85079g = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    public static final class c extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85085a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f85086b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AddressVH f85087c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.a f85088d;

        static {
            Covode.recordClassIndex(53180);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("add_new_shipping", this.f85087c.m().j(), null, null, null, null, null, null, null, null, 1020);
                this.f85087c.m().a(this.f85086b.getContext());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view, AddressVH addressVH, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.a aVar) {
            super(700);
            this.f85086b = view;
            this.f85087c = addressVH;
            this.f85088d = aVar;
        }
    }

    public static final class b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85081a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f85082b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AddressVH f85083c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.a f85084d;

        static {
            Covode.recordClassIndex(53179);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            DynamicSchema schemaInfo;
            if (view != null) {
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("edit_shipping", this.f85083c.m().j(), null, null, null, null, null, null, null, null, 1020);
                OrderSubmitViewModel m2 = this.f85083c.m();
                Context context = this.f85082b.getContext();
                m2.r = "next";
                m2.y = true;
                String i2 = m2.i();
                BillInfoData billInfoData = m2.f84735k;
                if (billInfoData == null || (schemaInfo = billInfoData.getSchemaInfo()) == null) {
                    str = null;
                } else {
                    str = schemaInfo.getAddressListSchema();
                }
                if (context != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (i2 != null) {
                        linkedHashMap.put("trackParams", i2);
                    }
                    linkedHashMap.put("is_select_mode", true);
                    if (str == null || str.length() == 0) {
                        str = "aweme://ec/address/list";
                    }
                    j.a(context, str, linkedHashMap, false).open();
                }
                m2.b_(OrderSubmitViewModel.t.f84751a);
                m2.B = true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view, AddressVH addressVH, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.a aVar) {
            super(700);
            this.f85082b = view;
            this.f85083c = addressVH;
            this.f85084d = aVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.a aVar) {
        String str;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.a aVar2 = aVar;
        l.d(aVar2, "");
        if (aVar2.f84807f) {
            str = "edit_shipping";
        } else {
            str = "add_new_shipping";
        }
        if (!l.a((Object) str, (Object) this.f85080j)) {
            com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a(str, m().j(), (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, 1020);
            this.f85080j = str;
        }
        View view = this.f85078f;
        if (aVar2.f84807f) {
            AddressInfoCard addressInfoCard = (AddressInfoCard) view.findViewById(R.id.beg);
            l.b(addressInfoCard, "");
            addressInfoCard.setVisibility(0);
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.cve);
            l.b(constraintLayout, "");
            constraintLayout.setVisibility(8);
            ((AddressInfoCard) view.findViewById(R.id.beg)).setNameText(aVar2.f84802a);
            ((AddressInfoCard) view.findViewById(R.id.beg)).setPhoneText(aVar2.f84803b);
            ((AddressInfoCard) view.findViewById(R.id.beg)).setEmailText(aVar2.f84808g);
            ((AddressInfoCard) view.findViewById(R.id.beg)).setRegionText(aVar2.f84804c);
            ((AddressInfoCard) view.findViewById(R.id.beg)).setAddressDetailText(aVar2.f84805d);
            ((AddressInfoCard) view.findViewById(R.id.beg)).setZipcodeText(aVar2.f84806e);
            if (l.a((Object) aVar2.f84811j, (Object) false)) {
                ((AddressInfoCard) view.findViewById(R.id.beg)).setHintText(aVar2.f84809h);
            } else {
                ((AddressInfoCard) view.findViewById(R.id.beg)).setHintText("");
            }
            AddressInfoCard addressInfoCard2 = (AddressInfoCard) view.findViewById(R.id.beg);
            l.b(addressInfoCard2, "");
            addressInfoCard2.setOnClickListener(new b(view, this, aVar2));
            return;
        }
        AddressInfoCard addressInfoCard3 = (AddressInfoCard) view.findViewById(R.id.beg);
        l.b(addressInfoCard3, "");
        addressInfoCard3.setVisibility(8);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.cve);
        l.b(constraintLayout2, "");
        constraintLayout2.setVisibility(0);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) view.findViewById(R.id.cve);
        l.b(constraintLayout3, "");
        constraintLayout3.setOnClickListener(new c(view, this, aVar2));
    }
}
