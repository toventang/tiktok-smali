package com.android.billingclient.api;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public String f5858a;

    /* renamed from: b  reason: collision with root package name */
    public String f5859b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f5860c;

    static {
        Covode.recordClassIndex(2453);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f5861a;

        /* renamed from: b  reason: collision with root package name */
        private List<String> f5862b;

        static {
            Covode.recordClassIndex(2454);
        }

        private a() {
        }

        public final l a() {
            if (this.f5861a == null) {
                throw new IllegalArgumentException("SKU type must be set");
            } else if (this.f5862b != null) {
                l lVar = new l();
                lVar.f5858a = this.f5861a;
                lVar.f5860c = this.f5862b;
                lVar.f5859b = null;
                return lVar;
            } else {
                throw new IllegalArgumentException("SKUs list must be set");
            }
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final a a(List<String> list) {
            this.f5862b = new ArrayList(list);
            return this;
        }
    }

    public static a a() {
        return new a((byte) 0);
    }
}
