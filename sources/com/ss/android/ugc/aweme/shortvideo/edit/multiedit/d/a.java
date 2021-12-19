package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.vesdk.VEUtils;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Handler f127872a = new Handler(Looper.myLooper()) {
        /* class com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(83823);
        }

        public final void handleMessage(Message message) {
            if (message.what == 2) {
                Bitmap bitmap = (Bitmap) message.getData().getParcelable("bitmap");
                String string = message.getData().getString("path");
                if (a.this.f127874c != null) {
                    a.this.f127874c.a(string, bitmap);
                }
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public Handler f127873b = new Handler(this.f127875d.getLooper()) {
        /* class com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(83822);
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                String str = (String) message.obj;
                if (e.b(str)) {
                    dmt.av.video.a.a("extracting_frame", "video_clip");
                    VEUtils.getVideoFrames(str, new int[]{0}, new b(this, str));
                }
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public AbstractC3334a f127874c;

    /* renamed from: d  reason: collision with root package name */
    private HandlerThread f127875d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a$a  reason: collision with other inner class name */
    public interface AbstractC3334a {
        static {
            Covode.recordClassIndex(83824);
        }

        void a(String str, Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(83821);
    }

    public final void a() {
        if (this.f127875d != null) {
            int i2 = Build.VERSION.SDK_INT;
            this.f127875d.quitSafely();
        }
    }

    public a() {
        HandlerThread handlerThread = new HandlerThread("multi_edit_cover_creator");
        this.f127875d = handlerThread;
        handlerThread.start();
    }
}
