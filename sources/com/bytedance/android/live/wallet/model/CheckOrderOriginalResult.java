package com.bytedance.android.live.wallet.model;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class CheckOrderOriginalResult extends com.bytedance.android.live.network.response.b<a, b> {
    private Exception exception;
    private String orderId;
    private String payChannel;
    private int retry;

    static {
        Covode.recordClassIndex(7326);
    }

    public Exception getException() {
        return this.exception;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPayChannel() {
        return this.payChannel;
    }

    public int getRetry() {
        return this.retry;
    }

    public a getData() {
        return (a) this.data;
    }

    public b getExtra() {
        return (b) this.extra;
    }

    public int getStatus() {
        if (this.data == null) {
            return 0;
        }
        return ((a) this.data).f13198a;
    }

    public static class a {
        @c(a = "status")

        /* renamed from: a  reason: collision with root package name */
        public int f13198a;

        static {
            Covode.recordClassIndex(7327);
        }

        public String toString() {
            return "CheckOrderData{status=" + this.f13198a + '}';
        }
    }

    public static class b extends Extra {
        @c(a = "coupon")

        /* renamed from: a  reason: collision with root package name */
        public String f13199a;
        @c(a = "coupon_description")

        /* renamed from: b  reason: collision with root package name */
        public String f13200b;
        @c(a = "coupon_detail")

        /* renamed from: c  reason: collision with root package name */
        public List<Object> f13201c;

        static {
            Covode.recordClassIndex(7328);
        }

        public String toString() {
            return "CheckOrderExtra{coupon='" + this.f13199a + '\'' + ", couponDescription='" + this.f13200b + '\'' + '}';
        }
    }

    public String toString() {
        return "CheckOrderOriginalResult{data=" + this.data + ", extra=" + this.extra + ", retry=" + this.retry + ", orderId='" + this.orderId + '\'' + ", exception=" + this.exception + '}';
    }

    public void setData(a aVar) {
        this.data = aVar;
    }

    public CheckOrderOriginalResult setException(Exception exc) {
        this.exception = exc;
        return this;
    }

    public void setExtra(b bVar) {
        this.extra = bVar;
    }

    public CheckOrderOriginalResult setOrderId(String str) {
        this.orderId = str;
        return this;
    }

    public void setPayChannel(String str) {
        this.payChannel = str;
    }

    public CheckOrderOriginalResult setRetry(int i2) {
        this.retry = i2;
        return this;
    }

    public CheckOrderOriginalResult setStatus(int i2) {
        if (this.data == null) {
            this.data = new a();
        }
        ((a) this.data).f13198a = i2;
        return this;
    }
}
