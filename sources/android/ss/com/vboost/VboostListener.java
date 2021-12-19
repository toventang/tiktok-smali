package android.ss.com.vboost;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class VboostListener {

    public interface a {
        static {
            Covode.recordClassIndex(6);
        }

        void a(String str, JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(5);
    }
}
