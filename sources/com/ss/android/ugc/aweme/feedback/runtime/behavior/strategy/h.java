package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.b;
import com.ss.android.ugc.aweme.runtime.behavior.c;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f95422a = new a((byte) 0);

    static {
        Covode.recordClassIndex(60439);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String a() {
        return "abnor_player";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60440);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final long b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String c() {
        long currentTimeMillis = System.currentTimeMillis() - b();
        List<c> a2 = b.a("block", currentTimeMillis);
        List<c> a3 = b.a("error", currentTimeMillis);
        JSONObject jSONObject = new JSONObject();
        if (!a2.isEmpty()) {
            jSONObject.put("block_count", a2.size());
        }
        if (!a3.isEmpty()) {
            jSONObject.put("error_count", a3.size());
            JSONArray jSONArray = new JSONArray();
            for (c cVar : a3) {
                if (cVar != null) {
                    jSONArray.put(new JSONObject(cVar.f120725d));
                }
            }
            jSONObject.put("error_code_msg", jSONArray);
        }
        String jSONObject2 = jSONObject.toString();
        l.b(jSONObject2, "");
        return jSONObject2;
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final boolean a(String str) {
        l.d(str, "");
        int hashCode = str.hashCode();
        if (hashCode != 93832333) {
            if (hashCode == 96784904 && str.equals("error")) {
                return true;
            }
            return false;
        } else if (str.equals("block")) {
            return true;
        } else {
            return false;
        }
    }
}
