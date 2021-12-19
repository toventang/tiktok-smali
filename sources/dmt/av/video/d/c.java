package dmt.av.video.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.vesdk.VEListener;
import h.f.b.l;
import org.json.JSONObject;

public final class c implements VEListener.d {
    static {
        Covode.recordClassIndex(104204);
    }

    @Override // com.ss.android.vesdk.VEListener.d
    public final void a(String str, JSONObject jSONObject, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a(str, jSONObject);
    }
}
