package com.bytedance.android.live.broadcast.widget;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.effect.IVideoEffectProcessor;

final /* synthetic */ class q implements IVideoEffectProcessor.FaceDetectListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoWidget2 f8818a;

    static {
        Covode.recordClassIndex(4501);
    }

    q(VideoWidget2 videoWidget2) {
        this.f8818a = videoWidget2;
    }

    @Override // com.ss.avframework.effect.IVideoEffectProcessor.FaceDetectListener
    public final void onFaceDetectResultCallback(int i2) {
        VideoWidget2 videoWidget2 = this.f8818a;
        if (videoWidget2.o && System.currentTimeMillis() - videoWidget2.p > 100) {
            videoWidget2.p = System.currentTimeMillis();
            videoWidget2.n.removeMessages(101);
            Message obtain = Message.obtain();
            obtain.what = 101;
            obtain.obj = Integer.valueOf(i2);
            videoWidget2.n.sendMessage(obtain);
        }
    }
}
