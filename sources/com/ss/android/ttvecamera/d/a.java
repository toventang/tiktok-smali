package com.ss.android.ttvecamera.d;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public interface a {

    /* renamed from: com.ss.android.ttvecamera.d.a$a  reason: collision with other inner class name */
    public interface AbstractC1340a {
        static {
            Covode.recordClassIndex(37841);
        }

        void a(CaptureRequest.Builder builder);

        int f();

        int g();
    }

    static {
        Covode.recordClassIndex(37840);
    }

    int a();

    CameraCaptureSession.CaptureCallback a(CaptureRequest.Builder builder, AtomicBoolean atomicBoolean, boolean z);

    CameraCaptureSession.CaptureCallback a(boolean z);

    void a(CaptureRequest.Builder builder);

    void a(CaptureRequest.Builder builder, Rect rect);

    void b(CaptureRequest.Builder builder, Rect rect);
}
