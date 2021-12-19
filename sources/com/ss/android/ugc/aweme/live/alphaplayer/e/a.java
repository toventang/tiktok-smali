package com.ss.android.ugc.aweme.live.alphaplayer.e;

import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.alphaplayer.c.a;
import com.ss.android.ugc.aweme.live.alphaplayer.c.b;
import com.ss.android.ugc.aweme.live.alphaplayer.d;
import java.util.List;

public interface a extends SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer, d.m {

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.e.a$a  reason: collision with other inner class name */
    public interface AbstractC2778a {
        static {
            Covode.recordClassIndex(69388);
        }

        void a();

        void a(Surface surface);

        int b();
    }

    static {
        Covode.recordClassIndex(69387);
    }

    void a();

    void a(float f2, float f3, float f4, float f5);

    void a(a.b bVar);

    void a(AbstractC2778a aVar);

    void a(List<b> list);

    void b();
}
