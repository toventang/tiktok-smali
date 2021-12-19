package com.bytedance.android.live.wallet.base;

import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class SubOrderResultStruct {
    @c(a = "status")
    public int status;
    @c(a = "sub_info")
    public a subChargeInfo;

    public class a {
        @c(a = "sub_level")

        /* renamed from: a  reason: collision with root package name */
        public b f13063a;

        static {
            Covode.recordClassIndex(7256);
        }
    }

    public class b {
        @c(a = "badge")

        /* renamed from: a  reason: collision with root package name */
        public SubscribeBadge f13064a;

        static {
            Covode.recordClassIndex(7257);
        }
    }

    static {
        Covode.recordClassIndex(7255);
    }
}
