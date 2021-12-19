package com.bytedance.android.live.core.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class a extends com.bytedance.android.live.a.a.b.a {
    private String url;
    private String xTtLogId;

    static {
        Covode.recordClassIndex(4586);
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // com.bytedance.android.live.a.a.b.a, com.bytedance.android.live.a.a.a
    public final String getMessage() {
        return " TYPE = CustomApiServerException, url = " + this.url + ", xTtLogId = " + this.xTtLogId + "  " + super.getMessage();
    }

    public a(int i2, String str, String str2) {
        super(i2);
        if (TextUtils.isEmpty(str)) {
            this.url = "";
        } else {
            this.url = str;
        }
        if (TextUtils.isEmpty(str2)) {
            this.xTtLogId = "";
        } else {
            this.xTtLogId = str2;
        }
    }
}
