package com.bytedance.android.livesdk.model.message.d.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class a {
    @c(a = "from_user_id")

    /* renamed from: a  reason: collision with root package name */
    public long f19504a;
    @c(a = "to_user_id")

    /* renamed from: b  reason: collision with root package name */
    public long f19505b;
    @c(a = "cancel_type")

    /* renamed from: c  reason: collision with root package name */
    public int f19506c;

    static {
        Covode.recordClassIndex(11549);
    }

    /* renamed from: com.bytedance.android.livesdk.model.message.d.a.a$a  reason: collision with other inner class name */
    public enum EnumC0402a {
        TYPE_UNKNOWN(-1),
        INVITE_CANCEL(0),
        APPLY_CANCEL(1);
        
        public int code;

        static {
            Covode.recordClassIndex(11550);
        }

        private EnumC0402a(int i2) {
            this.code = i2;
        }
    }
}
