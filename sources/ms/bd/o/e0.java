package ms.bd.o;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

public class e0 {

    /* renamed from: b  reason: collision with root package name */
    protected String f159496b = "";

    /* renamed from: c  reason: collision with root package name */
    protected String f159497c = "";

    /* renamed from: d  reason: collision with root package name */
    protected String f159498d = "";

    /* renamed from: e  reason: collision with root package name */
    protected String f159499e = "";

    /* renamed from: f  reason: collision with root package name */
    protected String f159500f = "";

    /* renamed from: g  reason: collision with root package name */
    protected String f159501g = "";

    /* renamed from: h  reason: collision with root package name */
    protected String f159502h = "";

    /* renamed from: i  reason: collision with root package name */
    protected String f159503i = "";

    /* renamed from: j  reason: collision with root package name */
    protected String f159504j = "";

    /* renamed from: k  reason: collision with root package name */
    protected int f159505k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f159506l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f159507m = 0;
    protected Map<String, String> n = new HashMap();
    protected Map<String, String> o = new HashMap();

    public static abstract class a<T extends b> extends e0 implements b {
        static {
            Covode.recordClassIndex(105899);
        }

        public a(String str, String str2) {
            this.f159496b = str;
            this.f159504j = str2;
            this.f159507m = 5;
            if (TextUtils.isEmpty(str) || "0".equals(str) || TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("appID or license must be set.");
            }
        }

        public final T a(String str) {
            this.f159497c = str;
            return this;
        }

        public final T b() {
            this.f159505k = 0;
            return this;
        }

        public final e0 c() {
            if (this.f159505k != -1) {
                return this;
            }
            throw new IllegalArgumentException("MSConfig init error");
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(105900);
        }
    }

    static {
        Covode.recordClassIndex(105898);
    }

    private static String a(String str) {
        return str == null ? "" : str.trim();
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(a(this.f159496b));
        jSONArray.put(a(this.f159503i));
        jSONArray.put(a(this.f159502h));
        jSONArray.put(a(this.f159504j));
        jSONArray.put(a(this.f159497c));
        jSONArray.put(a(this.f159498d));
        jSONArray.put(a(this.f159499e));
        jSONArray.put(a(this.f159500f));
        jSONArray.put(a(this.f159501g));
        jSONArray.put(String.valueOf(this.f159505k));
        jSONArray.put(String.valueOf(this.f159506l));
        jSONArray.put(String.valueOf(this.f159507m));
        JSONArray jSONArray2 = new JSONArray();
        for (Map.Entry<String, String> entry : this.n.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                jSONArray2.put(a(entry.getKey()));
                jSONArray2.put(a(entry.getValue()));
            }
        }
        jSONArray.put(jSONArray2);
        JSONArray jSONArray3 = new JSONArray();
        for (Map.Entry<String, String> entry2 : this.o.entrySet()) {
            if (!TextUtils.isEmpty(entry2.getKey())) {
                jSONArray3.put(a(entry2.getKey()));
                jSONArray3.put(a(entry2.getValue()));
            }
        }
        jSONArray.put(jSONArray3);
        return jSONArray.toString();
    }
}
