package com.ss.android.ugc.aweme.web.jsbridge;

import android.os.Build;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.ai;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import com.ss.android.ugc.aweme.utils.ic;
import h.f.b.l;
import org.json.JSONObject;

public final class ac extends f<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f145016a = new a((byte) 0);

    static {
        Covode.recordClassIndex(94817);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94818);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.c
    public final ai getPermissionGroup() {
        return ai.SECURE;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, g gVar) {
        l.d(jSONObject, "");
        l.d(gVar, "");
        Toast makeText = Toast.makeText(gVar.f35646a, "jsb test secure method success:\n" + gVar.f35647b, 0);
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(makeText);
        }
        makeText.show();
        return null;
    }
}
