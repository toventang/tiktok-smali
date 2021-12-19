package com.ss.android.ugc.aweme.feed.p.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f93675a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public static AtomicBoolean f93676b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    public static AtomicBoolean f93677c = new AtomicBoolean(true);

    /* renamed from: d  reason: collision with root package name */
    public static a f93678d;

    /* renamed from: e  reason: collision with root package name */
    public static Object f93679e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static AtomicBoolean f93680f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    private static AtomicBoolean f93681g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    private static AtomicBoolean f93682h = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    private static AtomicBoolean f93683i = new AtomicBoolean(true);

    public static Boolean a() {
        if (!com.ss.android.ugc.aweme.feed.p.b.a()) {
            return true;
        }
        return Boolean.valueOf(f93675a.get());
    }

    static {
        Covode.recordClassIndex(59608);
    }

    public static Boolean b() {
        if (!com.ss.android.ugc.aweme.feed.p.b.a()) {
            return false;
        }
        if (f93680f.get()) {
            return Boolean.valueOf(f93676b.get());
        }
        if (f93681g.get()) {
            return Boolean.valueOf(f93677c.get());
        }
        if (f93682h.get()) {
            return Boolean.valueOf(f93683i.get());
        }
        return false;
    }

    static class b extends RuntimeException {
        static {
            Covode.recordClassIndex(59610);
        }

        b(String str) {
            super(str);
        }
    }

    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public Handler f93684a;

        static {
            Covode.recordClassIndex(59609);
        }

        private a(Handler handler) {
            this.f93684a = handler;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            f.f93678d = null;
            this.f93684a.handleMessage(message);
        }

        public /* synthetic */ a(Handler handler, byte b2) {
            this(handler);
        }
    }

    public static void a(Boolean bool) {
        f93680f.set(bool.booleanValue());
    }

    public static void b(Boolean bool) {
        f93681g.set(bool.booleanValue());
    }
}
