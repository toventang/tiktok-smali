package com.ss.android.ugc.aweme.miniapp_api.model.a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class a implements Serializable {
    public int code;
    public String message;
    public boolean success;
    public String type;

    static {
        Covode.recordClassIndex(70216);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean isSuccess() {
        return this.success;
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.a.a$a  reason: collision with other inner class name */
    public static final class C2809a {

        /* renamed from: a  reason: collision with root package name */
        public String f109667a;

        /* renamed from: b  reason: collision with root package name */
        public int f109668b;

        /* renamed from: c  reason: collision with root package name */
        public String f109669c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f109670d;

        static {
            Covode.recordClassIndex(70217);
        }

        public final a a() {
            a aVar = new a();
            aVar.type = this.f109667a;
            aVar.message = this.f109669c;
            aVar.code = this.f109668b;
            aVar.success = this.f109670d;
            return aVar;
        }
    }

    public final void setCode(int i2) {
        this.code = i2;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setSuccess(boolean z) {
        this.success = z;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
