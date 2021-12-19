package com.ss.ttvideoengine.j;

import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.w;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public interface e {
    static {
        Covode.recordClassIndex(101660);
    }

    int a(int i2);

    int a(String str);

    o a(w wVar, int i2, Map<Integer, String> map);

    o a(w wVar, int i2, Map<Integer, String> map, boolean z);

    o a(w wVar, Map<Integer, String> map);

    o a(w wVar, Map<Integer, String> map, boolean z);

    String a(w wVar);

    void a(HashMap<String, w> hashMap);

    boolean a();

    boolean a(a aVar);

    String b(int i2);

    List<o> b();

    String[] b(w wVar, Map<Integer, String> map);

    List<k> c();

    boolean c(int i2);

    long d(int i2);

    b d();

    float e(int i2);

    String e();

    String[] f();

    String g();

    String h();

    w[] i();

    JSONObject j();

    boolean k();

    boolean l();

    String m();

    JSONObject n();

    public enum b {
        None,
        LIVE,
        VOD,
        BARE;

        static {
            Covode.recordClassIndex(101662);
        }
    }

    public enum a {
        NONE,
        MP4,
        DASH,
        HLS,
        MP3;

        static {
            Covode.recordClassIndex(101661);
        }
    }
}
