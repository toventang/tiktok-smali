package com.bytedance.android.live.base.model.b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public final class a extends IOException {
    private String message;
    public int statusCode;

    static {
        Covode.recordClassIndex(3584);
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public a(int i2, String str) {
        this.statusCode = i2;
        this.message = str;
    }

    public a(int i2, String str, String str2, Throwable th) {
        super(str2, th);
        this.statusCode = i2;
        this.message = str;
    }
}
