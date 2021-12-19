package com.bytedance.android.live.broadcast.api.d;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.SurfaceView;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import java.util.List;

public interface a {

    /* renamed from: com.bytedance.android.live.broadcast.api.d.a$a  reason: collision with other inner class name */
    public static class C0102a {

        /* renamed from: a  reason: collision with root package name */
        public int f7527a;

        /* renamed from: b  reason: collision with root package name */
        private final int f7528b = 1;

        /* renamed from: c  reason: collision with root package name */
        private final int f7529c = 2;

        /* renamed from: d  reason: collision with root package name */
        private final int f7530d = 3;

        /* renamed from: e  reason: collision with root package name */
        private final int f7531e = 4;

        /* renamed from: f  reason: collision with root package name */
        private final int f7532f = 5;

        /* renamed from: g  reason: collision with root package name */
        private final int f7533g = 6;

        static {
            Covode.recordClassIndex(3710);
        }
    }

    static {
        Covode.recordClassIndex(3709);
    }

    int a(float f2);

    Client a(LiveCore.InteractConfig interactConfig);

    void a();

    void a(int i2, int i3, int i4, long j2);

    void a(int i2, PrivacyCert privacyCert);

    void a(Bitmap bitmap, PrivacyCert privacyCert);

    void a(Bundle bundle, ILiveStream.CatchPicCallback catchPicCallback);

    void a(Bundle bundle, ILiveStream.CatchVideoCallback catchVideoCallback);

    void a(SurfaceView surfaceView);

    void a(b bVar);

    void a(PrivacyCert privacyCert);

    void a(ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener);

    void a(ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener);

    void a(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener);

    void a(String str);

    void a(List<String> list);

    void a(boolean z, PrivacyCert privacyCert);

    IFilterManager b();

    void b(PrivacyCert privacyCert);

    void c();

    void c(PrivacyCert privacyCert);

    int d();

    void d(PrivacyCert privacyCert);

    LiveCore e();

    void e(PrivacyCert privacyCert);

    void f(PrivacyCert privacyCert);

    void g(PrivacyCert privacyCert);

    void h(PrivacyCert privacyCert);

    void i(PrivacyCert privacyCert);

    void j(PrivacyCert privacyCert);

    void k(PrivacyCert privacyCert);
}
