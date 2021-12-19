package com.bytedance.android.livesdk.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class i {
    @c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public j f17893a;
    @c(a = "extra")

    /* renamed from: b  reason: collision with root package name */
    public a f17894b;

    static {
        Covode.recordClassIndex(9965);
    }

    public static final class a {
        @c(a = "log_id")

        /* renamed from: a  reason: collision with root package name */
        public String f17895a;

        static {
            Covode.recordClassIndex(9966);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f17895a != null) {
                sb.append(", log_id=").append(this.f17895a);
            }
            return sb.replace(0, 2, "Extra{").append('}').toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f17893a != null) {
            sb.append(", data=").append(this.f17893a);
        }
        if (this.f17894b != null) {
            sb.append(", extra=").append(this.f17894b);
        }
        return sb.replace(0, 2, "GiftListResponse{").append('}').toString();
    }
}
