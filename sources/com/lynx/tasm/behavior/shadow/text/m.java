package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Picture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public class m extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    volatile Handler f56020a;

    static {
        Covode.recordClassIndex(35005);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static m f56021a = new m((byte) 0);

        static {
            Covode.recordClassIndex(35006);
        }
    }

    private m() {
        super("TextLayoutWarmer", 10);
        start();
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.f56020a = new b(Looper.myLooper(), (byte) 0);
    }

    /* synthetic */ m(byte b2) {
        this();
    }

    static final class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final Picture f56022a;

        static {
            Covode.recordClassIndex(35007);
        }

        private b(Looper looper) {
            super(looper);
            Picture picture;
            try {
                picture = new Picture();
            } catch (RuntimeException unused) {
                picture = null;
            }
            this.f56022a = picture;
        }

        public final void handleMessage(Message message) {
            Layout layout;
            if (this.f56022a != null) {
                try {
                    if (message.what == 0 && (layout = (Layout) ((WeakReference) message.obj).get()) != null) {
                        layout.draw(this.f56022a.beginRecording(layout.getWidth(), layout.getHeight()));
                        this.f56022a.endRecording();
                    }
                } catch (Exception unused) {
                }
            }
        }

        /* synthetic */ b(Looper looper, byte b2) {
            this(looper);
        }
    }
}
