package com.bytedance.ies.xelement.b;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import h.f.b.l;
import org.json.JSONObject;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0891a f36693a = new C0891a((byte) 0);

    static {
        Covode.recordClassIndex(22024);
    }

    /* renamed from: com.bytedance.ies.xelement.b.a$a  reason: collision with other inner class name */
    public static final class C0891a {
        static {
            Covode.recordClassIndex(22025);
        }

        private C0891a() {
        }

        public /* synthetic */ C0891a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(j jVar, int i2) {
        super("x_audio_error", i2, jVar);
        l.c(jVar, "");
    }

    public final void a(int i2, String str, boolean z, String str2, String str3, Integer num) {
        l.c(str, "");
        l.c(str2, "");
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "code", String.valueOf(i2));
        a(jSONObject, "playerType", str);
        a(jSONObject, "autoPlay", String.valueOf(z));
        a(jSONObject, "message", str2);
        if (str3 != null) {
            a(jSONObject, "src", str3);
        }
        if (num != null) {
            a(jSONObject, "playStatus", String.valueOf(num.intValue()));
        }
        a(jSONObject);
        b(jSONObject);
    }
}
