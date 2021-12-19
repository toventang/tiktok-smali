package com.ss.android.ugc.aweme.ecommerce.coupon.vm;

import androidx.lifecycle.ac;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.utils.hl;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class CouponViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public VoucherInfo f85775a;

    /* renamed from: b  reason: collision with root package name */
    public final t<Voucher> f85776b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<Price> f85777c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final t<List<com.ss.android.ugc.aweme.ecommerce.coupon.b.a>> f85778d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public final t<Boolean> f85779e = new t<>();

    /* renamed from: f  reason: collision with root package name */
    public final t<Integer> f85780f = new a();

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.aweme.ecommerce.coupon.b.a f85781g;

    static {
        Covode.recordClassIndex(53654);
    }

    public static final class a extends t<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public boolean f85782a = true;

        static {
            Covode.recordClassIndex(53655);
        }

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
        public final /* bridge */ /* synthetic */ void setValue(Integer num) {
            this.f85782a = true;
            super.setValue(num);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.vm.CouponViewModel$a$a  reason: collision with other inner class name */
        static final class C2056a<T> implements u {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f85783a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ u f85784b;

            static {
                Covode.recordClassIndex(53656);
            }

            C2056a(a aVar, u uVar) {
                this.f85783a = aVar;
                this.f85784b = uVar;
            }

            @Override // androidx.lifecycle.u
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                if (this.f85783a.f85782a) {
                    this.f85783a.f85782a = false;
                    this.f85784b.onChanged(obj);
                }
            }
        }

        @Override // androidx.lifecycle.LiveData
        public final void observe(m mVar, u<? super Integer> uVar) {
            l.d(mVar, "");
            l.d(uVar, "");
            super.observe(mVar, new C2056a(this, uVar));
        }
    }

    public final void a(VoucherInfo voucherInfo) {
        List<Voucher> vouchers;
        this.f85781g = null;
        this.f85777c.setValue(voucherInfo != null ? voucherInfo.getLowestPrice() : null);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (!(voucherInfo == null || (vouchers = voucherInfo.getVouchers()) == null)) {
            for (T t : vouchers) {
                com.ss.android.ugc.aweme.ecommerce.coupon.b.a aVar = new com.ss.android.ugc.aweme.ecommerce.coupon.b.a(t);
                arrayList.add(aVar);
                String voucherID = t.getVoucherID();
                if (voucherID == null || !hl.a(voucherID)) {
                    int a2 = com.ss.android.ugc.aweme.ecommerce.coupon.a.a.a(t.getVoucherTypeID());
                    if (a2 != -1) {
                        aVar.f85758b = a2;
                    } else {
                        aVar.f85758b = 1;
                    }
                } else {
                    aVar.f85758b = 3;
                }
                if (l.a((Object) t.getSelected(), (Object) true) && this.f85781g == null) {
                    aVar.f85757a = true;
                    this.f85781g = aVar;
                    this.f85776b.setValue(t);
                }
            }
        }
        this.f85778d.setValue(arrayList);
        t<Boolean> tVar = this.f85779e;
        if (this.f85781g == null) {
            z = true;
        }
        tVar.setValue(Boolean.valueOf(z));
        this.f85780f.setValue(null);
        this.f85775a = voucherInfo;
    }
}
