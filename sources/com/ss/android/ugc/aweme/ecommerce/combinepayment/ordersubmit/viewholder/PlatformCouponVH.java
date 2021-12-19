package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.d;
import com.ss.android.ugc.aweme.ecommerce.coupon.a;
import com.ss.android.ugc.aweme.ecommerce.coupon.b;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.coupon.view.CouponTag;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.k.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class PlatformCouponVH extends JediSimpleViewHolder<d> implements IEventCenter.b, IEventCenter.b {

    /* renamed from: f  reason: collision with root package name */
    public final View f85108f;

    /* renamed from: g  reason: collision with root package name */
    private final h f85109g;

    static {
        Covode.recordClassIndex(53195);
    }

    public final OrderSubmitViewModel m() {
        return (OrderSubmitViewModel) this.f85109g.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        a.C2089a.a(this.f85108f, true);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<OrderSubmitViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ c $viewModelClass;
        final /* synthetic */ c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(53196);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, c cVar, c cVar2) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PlatformCouponVH.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_viewholder_PlatformCouponVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlatformCouponVH(View view) {
        super(view);
        l.d(view, "");
        this.f85108f = view;
        c a2 = h.f.b.ab.a(OrderSubmitViewModel.class);
        this.f85109g = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    public static final class b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85110a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f85111b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PlatformCouponVH f85112c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f85113d;

        static {
            Covode.recordClassIndex(53197);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            Object obj;
            if (view != null) {
                PlatformCouponVH platformCouponVH = this.f85112c;
                EventCenter.a().a("ec_voucher_confirm", platformCouponVH);
                EventCenter.a().a("ec_voucher_click_cover", platformCouponVH);
                EventCenter.a().a("ec_voucher_page_close", platformCouponVH);
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("discounts", this.f85112c.m().j(), "1", null, null, null, null, null, null, null, 1016);
                Context context = this.f85111b.getContext();
                l.b(context, "");
                HashMap<String, Object> hashMap = this.f85112c.m().F;
                String str = null;
                if (hashMap != null) {
                    obj = hashMap.get("entrance_info");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = obj;
                }
                HashMap<String, Object> hashMap2 = this.f85112c.m().F;
                VoucherInfo voucherInfo = this.f85113d.f84823a;
                l.d(context, "");
                b.a.a(context, 2, "order_submit", 3, str, hashMap2, voucherInfo, 2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view, PlatformCouponVH platformCouponVH, d dVar) {
            super(700);
            this.f85111b = view;
            this.f85112c = platformCouponVH;
            this.f85113d = dVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(d dVar) {
        List<Voucher> vouchers;
        d dVar2 = dVar;
        l.d(dVar2, "");
        View view = this.f85108f;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.d5c);
        l.b(relativeLayout, "");
        relativeLayout.setOnClickListener(new b(view, this, dVar2));
        VoucherInfo voucherInfo = dVar2.f84823a;
        Voucher voucher = null;
        if (!(voucherInfo == null || (vouchers = voucherInfo.getVouchers()) == null)) {
            Iterator<T> it = vouchers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (l.a((Object) next.getSelected(), (Object) true)) {
                    voucher = next;
                    break;
                }
            }
            voucher = voucher;
        }
        if (voucher != null) {
            CouponTag couponTag = (CouponTag) view.findViewById(R.id.d5e);
            l.b(couponTag, "");
            couponTag.setVisibility(0);
            ((CouponTag) view.findViewById(R.id.d5e)).setText(voucher.getDiscountText());
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.anx);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
        } else {
            CouponTag couponTag2 = (CouponTag) view.findViewById(R.id.d5e);
            l.b(couponTag2, "");
            couponTag2.setVisibility(8);
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.anx);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
        }
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.a("discounts", m().j(), "1", (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, 1016);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.b
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        int hashCode = str.hashCode();
        if (hashCode != 440904974) {
            if (hashCode != 882422714) {
                if (hashCode == 1943991438 && str.equals("ec_voucher_confirm")) {
                    try {
                        com.ss.android.ugc.aweme.ecommerce.coupon.a a2 = a.C2054a.a(str2);
                        if (a2 != null) {
                            OrderSubmitViewModel m2 = m();
                            List<Voucher> list = a2.f85752c;
                            Voucher voucher = null;
                            if (list != null) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    T next = it.next();
                                    if (l.a((Object) next.getSelected(), (Object) true)) {
                                        voucher = next;
                                        break;
                                    }
                                }
                                voucher = voucher;
                            }
                            m2.a(voucher);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        com.bytedance.services.apm.api.a.a(th);
                        return;
                    }
                } else {
                    return;
                }
            } else if (!str.equals("ec_voucher_page_close")) {
                return;
            }
        } else if (!str.equals("ec_voucher_click_cover")) {
            return;
        }
        IEventCenter a3 = EventCenter.a();
        a3.b("ec_voucher_confirm", this);
        a3.b("ec_voucher_click_cover", this);
        a3.b("ec_voucher_page_close", this);
    }
}
