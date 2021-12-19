package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class ak extends e<a, Object> {

    public static final class a {
        @c(a = StringSet.type)

        /* renamed from: a  reason: collision with root package name */
        public final String f14510a;

        static {
            Covode.recordClassIndex(8067);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && l.a(this.f14510a, ((a) obj).f14510a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f14510a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Params(type=" + this.f14510a + ")";
        }
    }

    static {
        Covode.recordClassIndex(8066);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(a aVar, g gVar) {
        a aVar2 = aVar;
        l.d(aVar2, "");
        l.d(gVar, "");
        String str = aVar2.f14510a;
        if (str.hashCode() == -990193242 && str.equals("anchor_submit_success")) {
            finishWithSuccess();
        } else {
            finishWithFailure();
        }
    }
}
