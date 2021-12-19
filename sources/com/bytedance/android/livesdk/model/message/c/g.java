package com.bytedance.android.livesdk.model.message.c;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class g {
    @c(a = "image")

    /* renamed from: a  reason: collision with root package name */
    public ImageModel f19446a;

    /* renamed from: b  reason: collision with root package name */
    public b f19447b = b.NetWork;

    /* renamed from: c  reason: collision with root package name */
    public a f19448c = a.NONE;

    static {
        Covode.recordClassIndex(11506);
    }

    public enum a {
        NONE,
        OTHER;

        static {
            Covode.recordClassIndex(11507);
        }
    }

    public enum b {
        Local,
        NetWork;

        static {
            Covode.recordClassIndex(11508);
        }
    }
}
