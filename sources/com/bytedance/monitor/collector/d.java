package com.bytedance.monitor.collector;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static Handler f41457a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f41458b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public static Object f41459c = null;

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f41460d = false;

    /* renamed from: e  reason: collision with root package name */
    public static int f41461e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static int f41462f = 1;

    /* access modifiers changed from: package-private */
    public static class a extends Handler {
        static {
            Covode.recordClassIndex(25399);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void handleMessage(Message message) {
            d.f41457a.handleMessage(message);
        }

        public final boolean sendMessageAtTime(Message message, long j2) {
            if (message.getCallback() != d.f41459c || !d.f41460d) {
                return super.sendMessageAtTime(message, j2);
            }
            if (d.f41462f == 0) {
                return sendMessageAtFrontOfQueue(message);
            }
            Message a2 = i.a(i.a());
            if (a2 == null) {
                return sendMessageAtFrontOfQueue(message);
            }
            return super.sendMessageAtTime(message, Math.min(a2.getWhen() + ((long) d.f41461e), j2));
        }
    }

    static {
        Covode.recordClassIndex(25398);
    }
}
