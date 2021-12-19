package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.g.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import java.util.Iterator;
import org.json.JSONObject;

final /* synthetic */ class r implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f107992a;

    static {
        Covode.recordClassIndex(69230);
    }

    r(Context context) {
        this.f107992a = context;
    }

    @Override // com.bytedance.apm.g.a
    public final void a(String str, JSONObject jSONObject) {
        Context context = this.f107992a;
        if (com.ss.android.ugc.aweme.cb.a.f69776a == null) {
            com.ss.android.ugc.aweme.cb.a.f69776a = Boolean.valueOf(Keva.getRepo("optimize_config", 0).getBoolean("log_open", false));
        }
        if (com.ss.android.ugc.aweme.cb.a.f69776a.booleanValue() && TextUtils.equals("page_load", str)) {
            StringBuilder sb = new StringBuilder();
            try {
                String string = jSONObject.getJSONObject("extra_status").getString("scene");
                sb.append("Activity: ").append(string.substring(string.lastIndexOf(46))).append("\n");
                JSONObject jSONObject2 = jSONObject.getJSONObject("extra_values");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    sb.append(next).append(": ").append(jSONObject2.getInt(next)).append("\n");
                }
                sb.deleteCharAt(sb.lastIndexOf("\n"));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            f.a.a.a.a.a(f.a.a.b.a.f157156a).a(new s(context, sb));
        }
    }
}
