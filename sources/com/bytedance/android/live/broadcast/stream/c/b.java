package com.bytedance.android.live.broadcast.stream.c;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

public class b implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public Handler f8518a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f8519b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8520c;

    /* renamed from: d  reason: collision with root package name */
    private a f8521d;

    /* renamed from: e  reason: collision with root package name */
    private int f8522e;

    static {
        Covode.recordClassIndex(4376);
    }

    public final void a() {
        if (!this.f8519b) {
            this.f8522e = 2;
            b(0);
            this.f8519b = true;
        }
    }

    public final void b() {
        if (this.f8519b) {
            a(2, 0);
        }
    }

    public final void c() {
        if (this.f8519b) {
            a(3, 0);
        }
    }

    public b(a aVar) {
        this(aVar, (byte) 0);
    }

    public boolean handleMessage(Message message) {
        if (102 != message.what) {
            return true;
        }
        b(0);
        return true;
    }

    private void b(int i2) {
        this.f8518a.removeMessages(102);
        this.f8521d.a(this.f8522e, i2);
        if (4 != this.f8522e) {
            this.f8518a.sendEmptyMessageDelayed(102, this.f8520c);
        }
    }

    public final void a(int i2) {
        if (this.f8519b) {
            this.f8518a.removeMessages(102);
            this.f8519b = false;
            a(4, i2);
        }
    }

    private void a(int i2, int i3) {
        this.f8522e = i2;
        b(i3);
    }

    private b(a aVar, byte b2) {
        this.f8522e = 1;
        this.f8518a = new Handler(this);
        this.f8520c = 5000;
        this.f8521d = aVar;
    }
}
