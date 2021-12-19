package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.util.i;
import h.f.b.l;
import java.io.Serializable;

public final class BillInfoResponse extends com.ss.android.ugc.aweme.ecommerce.api.model.a<BillInfoData> implements Serializable {
    public static final a Companion = new a((byte) 0);

    static {
        Covode.recordClassIndex(53106);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53107);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String toJson() {
        String b2 = i.a().b(this);
        if (b2 == null) {
            return "{}";
        }
        return b2;
    }

    public final boolean isValid() {
        if (!isCodeOK() || this.data == null || this.data.isEmpty()) {
            return false;
        }
        return true;
    }

    public final BillInfoResponse merge(BillInfoResponse billInfoResponse, BillInfoRequest billInfoRequest) {
        BillInfoData billInfoData;
        l.d(billInfoResponse, "");
        l.d(billInfoRequest, "");
        int i2 = this.code;
        String str = this.message;
        T t = this.data;
        if (t != null) {
            billInfoData = t.merge(billInfoResponse.data, billInfoRequest);
        } else {
            billInfoData = null;
        }
        return new BillInfoResponse(i2, str, billInfoData);
    }

    public BillInfoResponse(int i2, String str, BillInfoData billInfoData) {
        super(i2, str, billInfoData);
    }
}
