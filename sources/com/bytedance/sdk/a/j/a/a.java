package com.bytedance.sdk.a.j.a;

import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public class a extends Thread implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    protected static f f43344a = f.a();

    /* renamed from: b  reason: collision with root package name */
    protected static final AtomicInteger f43345b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    protected WeakHandler f43346c;

    /* renamed from: d  reason: collision with root package name */
    private final BlockingQueue<e> f43347d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f43348e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f43349f;

    /* renamed from: g  reason: collision with root package name */
    private String f43350g;

    public boolean b() {
        return this.f43349f;
    }

    public void a() {
        this.f43348e = true;
        interrupt();
    }

    public void d() {
        this.f43346c.removeMessages(0);
    }

    public void c() {
        d();
        this.f43346c.sendEmptyMessageDelayed(0, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
    }

    static {
        Covode.recordClassIndex(26566);
    }

    public void run() {
        String str;
        String str2;
        String str3;
        Process.setThreadPriority(10);
        while (true) {
            try {
                e take = this.f43347d.take();
                d();
                if (take != null && (take instanceof c)) {
                    c cVar = (c) take;
                    String str4 = null;
                    try {
                        this.f43349f = true;
                        a(cVar);
                        if (cVar.a()) {
                            this.f43349f = false;
                        } else {
                            str2 = Thread.currentThread().getName();
                            try {
                                str = cVar.f43359e;
                                if (!m.a(str) && !m.a(str2)) {
                                    Thread.currentThread().setName(str);
                                }
                                cVar.run();
                                c();
                            } catch (Throwable unused) {
                                str3 = null;
                                str4 = str2;
                                str2 = str4;
                                str = str3;
                                this.f43349f = false;
                                Thread.currentThread().setName(str2);
                            }
                            this.f43349f = false;
                            if (!m.a(str) && !m.a(str2)) {
                                Thread.currentThread().setName(str2);
                            }
                        }
                    } catch (Throwable unused2) {
                        str3 = null;
                        str2 = str4;
                        str = str3;
                        this.f43349f = false;
                        Thread.currentThread().setName(str2);
                    }
                }
            } catch (InterruptedException unused3) {
                if (this.f43348e) {
                    return;
                }
            }
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 0) {
                    f43344a.d();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(BlockingQueue<e> blockingQueue, String str, String str2) {
        super(TextUtils.isEmpty(str) ? "ApiDispatcher-Thread" : str);
        this.f43346c = new WeakHandler(Looper.getMainLooper(), this);
        this.f43348e = false;
        this.f43349f = false;
        this.f43350g = "ApiDispatcher";
        this.f43347d = blockingQueue;
        this.f43350g = str2;
    }
}
