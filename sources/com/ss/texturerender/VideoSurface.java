package com.ss.texturerender;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

public class VideoSurface extends Surface implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public p f151767a;

    /* renamed from: b  reason: collision with root package name */
    public a f151768b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f151769c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<b> f151770d;

    /* renamed from: e  reason: collision with root package name */
    private Object f151771e;

    /* renamed from: f  reason: collision with root package name */
    private Bundle f151772f;

    public interface a {
        static {
            Covode.recordClassIndex(101222);
        }

        void a();
    }

    public interface b {
        static {
            Covode.recordClassIndex(101223);
        }

        void a(int i2);
    }

    public interface c extends Serializable {
        static {
            Covode.recordClassIndex(101224);
        }

        int onFrame(ByteBuffer byteBuffer, int i2, int i3);
    }

    static {
        Covode.recordClassIndex(101221);
    }

    public final int a() {
        return c(10, -1);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.Surface, java.lang.Object
    public void finalize() {
        b();
        super.finalize();
    }

    private synchronized void b() {
        MethodCollector.i(13168);
        p pVar = this.f151767a;
        if (pVar != null) {
            pVar.releaseOffScreenSurface(false);
            this.f151767a = null;
        }
        MethodCollector.o(13168);
    }

    public void release() {
        MethodCollector.i(13250);
        l.a("VideoSurface", this + "release");
        super.release();
        b();
        synchronized (this.f151771e) {
            try {
                this.f151768b = null;
                this.f151769c = null;
                ArrayList<b> arrayList = this.f151770d;
                if (arrayList != null) {
                    arrayList.clear();
                }
            } finally {
                MethodCollector.o(13250);
            }
        }
    }

    public final void b(int i2) {
        p pVar = this.f151767a;
        if (pVar != null) {
            pVar.setSuperResolutionMode(i2);
        }
    }

    public final void b(boolean z) {
        p pVar = this.f151767a;
        if (pVar != null) {
            pVar.ignoreSRResolutionCheck(z);
        }
    }

    public VideoSurface(p pVar) {
        super(pVar);
        this.f151767a = pVar;
        if (Looper.myLooper() != null) {
            this.f151769c = new Handler(this);
        } else {
            this.f151769c = new Handler(Looper.getMainLooper(), this);
        }
        this.f151771e = new Object();
        this.f151772f = new Bundle();
    }

    public final void a(int i2) {
        MethodCollector.i(13072);
        ArrayList<b> arrayList = this.f151770d;
        if (arrayList == null || arrayList.isEmpty()) {
            MethodCollector.o(13072);
            return;
        }
        synchronized (this.f151771e) {
            try {
                Message obtainMessage = this.f151769c.obtainMessage(4097);
                obtainMessage.arg1 = i2;
                obtainMessage.sendToTarget();
            } finally {
                MethodCollector.o(13072);
            }
        }
    }

    public boolean handleMessage(Message message) {
        ArrayList<b> arrayList;
        int i2 = message.what;
        if (i2 != 4096) {
            if (i2 != 4097 || (arrayList = this.f151770d) == null || arrayList.isEmpty() || this.f151767a == null) {
                return true;
            }
            int i3 = message.arg1;
            Iterator<b> it = this.f151770d.iterator();
            while (it.hasNext()) {
                it.next().a(i3);
            }
            return true;
        } else if (this.f151768b == null || this.f151767a == null) {
            return true;
        } else {
            int i4 = message.arg1;
            int serial = this.f151767a.getSerial();
            if (i4 != serial) {
                l.a("VideoSurface", "serial change :" + i4 + ", " + serial);
                return true;
            }
            message.getData().getLong("timeStamp");
            this.f151768b.a();
            return true;
        }
    }

    public final void a(Bundle bundle) {
        p pVar = this.f151767a;
        if (pVar != null) {
            pVar.setEffect(bundle);
        }
    }

    public final void a(Surface surface) {
        p pVar = this.f151767a;
        if (pVar != null) {
            pVar.updateSurface(surface);
        }
    }

    public final void a(b bVar) {
        if (this.f151770d == null) {
            this.f151770d = new ArrayList<>();
        }
        if (!this.f151770d.contains(bVar)) {
            this.f151770d.add(bVar);
        }
    }

    public final void a(boolean z) {
        p pVar = this.f151767a;
        if (pVar != null) {
            pVar.pause(z, true);
        }
    }

    public final void a(int i2, float f2) {
        p pVar = this.f151767a;
        if (pVar != null) {
            pVar.setOption(i2, f2);
        }
    }

    public final int c(int i2, int i3) {
        p pVar = this.f151767a;
        if (pVar != null) {
            return pVar.getIntOption(i2, i3);
        }
        return -1;
    }

    public final void a(int i2, int i3) {
        p pVar = this.f151767a;
        if (pVar != null) {
            pVar.updateTexDimension(i2, i3);
        }
    }

    public final void b(int i2, int i3) {
        if (i2 != 1) {
            p pVar = this.f151767a;
            if (pVar != null) {
                pVar.setOption(i2, i3);
                return;
            }
            return;
        }
        p pVar2 = this.f151767a;
        if (pVar2 != null) {
            pVar2.updateVideoState(i3);
        }
    }

    public final void a(int i2, long j2) {
        MethodCollector.i(13166);
        if (this.f151768b == null) {
            MethodCollector.o(13166);
            return;
        }
        synchronized (this.f151771e) {
            try {
                Message obtainMessage = this.f151769c.obtainMessage(4096);
                this.f151772f.putLong("timeStamp", j2);
                obtainMessage.arg1 = i2;
                obtainMessage.setData(this.f151772f);
                obtainMessage.sendToTarget();
            } finally {
                MethodCollector.o(13166);
            }
        }
    }
}
