package com.bytedance.android.livesdk.aj;

import android.graphics.Point;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdkapi.depend.d.q;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public interface g {

    public interface a {
        static {
            Covode.recordClassIndex(7691);
        }

        void a(c cVar, int i2, String str);
    }

    public interface b {
        static {
            Covode.recordClassIndex(7692);
        }

        void h();

        void i();
    }

    static {
        Covode.recordClassIndex(7690);
    }

    void a();

    void a(int i2);

    void a(Surface surface);

    void a(SurfaceHolder surfaceHolder);

    void a(a aVar, b bVar);

    void a(com.bytedance.android.livesdkapi.depend.model.c.a aVar);

    void a(String str);

    void a(String str, q qVar);

    void a(String str, String str2);

    void a(String str, Map<String, String> map, d dVar);

    void a(boolean z);

    void a(boolean z, boolean z2, int i2);

    void b();

    void b(String str);

    void b(boolean z);

    void c();

    void c(String str);

    void c(boolean z);

    void d();

    void d(boolean z);

    void e();

    void e(boolean z);

    void f();

    boolean g();

    boolean h();

    Point i();

    JSONObject j();

    String k();

    public enum d {
        VIDEO,
        AUDIO,
        OBS,
        SCREENSHOT;

        static {
            Covode.recordClassIndex(7694);
        }
    }

    public enum c {
        PREPARED,
        PREPARE_FAILED,
        VIDEO_SIZE_CHANGED,
        PLAY_COMPLETED,
        MEDIA_ERROR,
        RENDERING_START,
        BUFFERING_START,
        BUFFERING_END,
        SEI_UPDATE,
        RESOLUTION_DEGRADE;

        static {
            Covode.recordClassIndex(7693);
        }
    }
}
