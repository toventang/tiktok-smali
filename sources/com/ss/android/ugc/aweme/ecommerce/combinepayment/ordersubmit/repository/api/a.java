package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.OrderSubmitApi;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.r;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.y;
import f.a.d.f;
import f.a.d.g;
import f.a.t;
import h.f.b.l;

public final class a extends com.bytedance.jedi.a.f.a<BillInfoRequest, BillInfoResponse, BillInfoRequest, BillInfoResponse> {

    /* renamed from: a  reason: collision with root package name */
    public BillInfoResponse f84926a;

    static {
        Covode.recordClassIndex(53100);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return obj;
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f84929a = new b();

        static {
            Covode.recordClassIndex(53102);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            T t;
            r paymentMethods;
            BillInfoResponse billInfoResponse = (BillInfoResponse) obj;
            if (billInfoResponse.isValid() && (t = billInfoResponse.data) != null && (paymentMethods = t.getPaymentMethods()) != null) {
                y.a(paymentMethods);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.a$a  reason: collision with other inner class name */
    static final class C2034a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f84927a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BillInfoRequest f84928b;

        static {
            Covode.recordClassIndex(53101);
        }

        C2034a(a aVar, BillInfoRequest billInfoRequest) {
            this.f84927a = aVar;
            this.f84928b = billInfoRequest;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            BillInfoResponse billInfoResponse = (BillInfoResponse) obj;
            l.d(billInfoResponse, "");
            BillInfoResponse billInfoResponse2 = this.f84927a.f84926a;
            if (billInfoResponse2 == null || !billInfoResponse.isValid()) {
                if (billInfoResponse.isValid()) {
                    this.f84927a.f84926a = billInfoResponse;
                }
                return billInfoResponse;
            }
            BillInfoResponse merge = billInfoResponse2.merge(billInfoResponse, this.f84928b);
            if (merge.isValid()) {
                this.f84927a.f84926a = merge;
            }
            return merge;
        }
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<BillInfoResponse> a(BillInfoRequest billInfoRequest) {
        BillInfoRequest billInfoRequest2 = billInfoRequest;
        l.d(billInfoRequest2, "");
        l.d(billInfoRequest2, "");
        t<R> b2 = ((OrderSubmitApi) OrderSubmitApi.a.f84924a.a(OrderSubmitApi.class)).getBillInfo(billInfoRequest2).d(new C2034a(this, billInfoRequest2)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(b.f84929a);
        l.b(b2, "");
        return b2;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        return obj2;
    }
}
