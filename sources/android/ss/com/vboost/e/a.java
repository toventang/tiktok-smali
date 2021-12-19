package android.ss.com.vboost.e;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static AbstractC0000a f566a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f567b;

    /* renamed from: android.ss.com.vboost.e.a$a  reason: collision with other inner class name */
    public interface AbstractC0000a {
        static {
            Covode.recordClassIndex(63);
        }

        void a(String str, JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(62);
    }

    public static boolean a() {
        if (f566a != null) {
            return true;
        }
        return false;
    }

    public static void a(String str, JSONObject jSONObject) {
        if (f566a != null) {
            try {
                jSONObject.put("sdkVersion", "2.0.0.8.d-rc.46-mt");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            if (f567b) {
                f566a.a(str, jSONObject);
            }
            f566a.a(str, jSONObject);
        }
    }
}
