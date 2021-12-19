package org.webrtc;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ScreenCapturerAndroid implements VideoCapturer, VideoSink {
    private Context mContext;
    private CountDownLatch mCountDownLatch = new CountDownLatch(1);

    static {
        Covode.recordClassIndex(106660);
    }

    public static int org_webrtc_ScreenCapturerAndroid_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
        MethodCollector.i(12163);
        if (Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().dispose();
            MethodCollector.o(12163);
            return;
        }
        Context context = this.mContext;
        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 5, null));
        try {
            this.mCountDownLatch.await(1500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        org_webrtc_ScreenCapturerAndroid_com_ss_android_ugc_aweme_lancet_LogLancet_i("ScreenCaptureAndroid", "dispose finish");
        MethodCollector.o(12163);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        MethodCollector.i(12161);
        if (Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().stopCapture();
            MethodCollector.o(12161);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("hc", this.mCountDownLatch.hashCode());
        Context context = this.mContext;
        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 2, intent));
        MethodCollector.o(12161);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().onFrame(videoFrame);
            return;
        }
        int addFrame = ScreenCaptureAndroidManager.INSTANCE().addFrame(videoFrame);
        Intent intent = new Intent();
        intent.putExtra("i", addFrame);
        Context context = this.mContext;
        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 4, intent));
    }

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        ScreenCaptureAndroidManager.INSTANCE().addLock(this.mCountDownLatch.hashCode(), this.mCountDownLatch);
        ScreenCaptureAndroidManager.INSTANCE().setData(intent, callback);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        MethodCollector.i(11858);
        this.mContext = context;
        ScreenCaptureAndroidManager.INSTANCE().initialize(surfaceTextureHelper, context, capturerObserver);
        MethodCollector.o(11858);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i2, int i3, int i4) {
        MethodCollector.i(12011);
        startCapture(i2, i3, i4, 4);
        MethodCollector.o(12011);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i2, int i3, int i4) {
        MethodCollector.i(12164);
        if (Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().changeCaptureFormat(i2, i3, i4);
            MethodCollector.o(12164);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("w", i2);
        intent.putExtra("h", i3);
        intent.putExtra("if", i4);
        Context context = this.mContext;
        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 3, intent));
        MethodCollector.o(12164);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i2, int i3, int i4, int i5) {
        MethodCollector.i(12010);
        if (Build.VERSION.SDK_INT <= 28) {
            ScreenCaptureAndroidManager.INSTANCE().startCapture(i2, i3, i4, i5);
            MethodCollector.o(12010);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("w", i2);
        intent.putExtra("h", i3);
        intent.putExtra("if", i4);
        if (i5 <= 0) {
            i5 = 4;
        }
        intent.putExtra("minfr", i5);
        Context context = this.mContext;
        context.startForegroundService(RXScreenCaptureService.getServiceIntent(context, 1, intent));
        MethodCollector.o(12010);
    }
}
