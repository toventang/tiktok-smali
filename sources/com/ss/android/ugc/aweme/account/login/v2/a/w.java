package com.ss.android.ugc.aweme.account.login.v2.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import h.f.b.g;
import h.f.b.l;
import org.json.JSONObject;

public final class w extends Throwable {
    public static final a Companion = new a((byte) 0);
    private final String detailErrorMsg;
    private final int errorCode;
    private final String errorMsg;
    private JSONObject extra;
    private final j scene;
    private final k step;

    static {
        Covode.recordClassIndex(39598);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39599);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static w a(j jVar, k kVar) {
            l.d(jVar, "");
            l.d(kVar, "");
            return new w(-1, "no data", jVar, kVar, null, "no data");
        }
    }

    public final String getDetailErrorMsg() {
        return this.detailErrorMsg;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final JSONObject getExtra() {
        return this.extra;
    }

    public final j getScene() {
        return this.scene;
    }

    public final k getStep() {
        return this.step;
    }

    public final void setExtra(JSONObject jSONObject) {
        this.extra = jSONObject;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(int i2, String str, j jVar, k kVar, JSONObject jSONObject, String str2) {
        super(str);
        l.d(jVar, "");
        l.d(kVar, "");
        l.d(str2, "");
        this.errorCode = i2;
        this.errorMsg = str;
        this.scene = jVar;
        this.step = kVar;
        this.extra = jSONObject;
        this.detailErrorMsg = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i2, String str, j jVar, k kVar, JSONObject jSONObject, String str2, int i3, g gVar) {
        this(i2, str, jVar, kVar, jSONObject, (i3 & 32) != 0 ? "" : str2);
    }
}
