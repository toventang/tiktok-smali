package com.ss.android.ugc.aweme.shortvideo.ui.task;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    static final h f131923a = i.a((h.f.a.a) a.f131931a);

    /* renamed from: b  reason: collision with root package name */
    static d f131924b = d.RECORD_ON_NONE;

    /* renamed from: c  reason: collision with root package name */
    static final ConcurrentLinkedQueue<a> f131925c = new ConcurrentLinkedQueue<>();

    /* renamed from: d  reason: collision with root package name */
    static final b f131926d = new b();

    /* renamed from: e  reason: collision with root package name */
    static final d f131927e;

    /* renamed from: f  reason: collision with root package name */
    static final boolean f131928f = AVServiceImpl.a().avSettingsService().enableTaskDegradationOpti();

    /* renamed from: g  reason: collision with root package name */
    public static final f f131929g = new f();

    /* renamed from: h  reason: collision with root package name */
    private static final h f131930h;

    public enum c {
        TASK_EXEC;

        static {
            Covode.recordClassIndex(86440);
        }
    }

    private f() {
    }

    public static final class b extends Handler {
        static {
            Covode.recordClassIndex(86439);
        }

        public b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            l.d(message, "");
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == d.RECORD_ON_FIRST_FRAME.ordinal()) {
                d dVar = f.f131927e;
                Message obtain = Message.obtain();
                obtain.what = c.TASK_EXEC.ordinal();
                dVar.sendMessageDelayed(obtain, 200);
            }
            if (i2 == d.RECORD_ON_DESTROY.ordinal()) {
                f.f131924b = d.RECORD_ON_NONE;
                f.f131925c.clear();
                f.f131926d.removeCallbacksAndMessages(null);
                f.f131927e.removeCallbacksAndMessages(null);
            }
        }
    }

    static final class a extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f131931a = new a();

        static {
            Covode.recordClassIndex(86438);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            long j2;
            if (f.f131928f) {
                j2 = 500;
            } else {
                j2 = 100;
            }
            return Long.valueOf(j2);
        }
    }

    static final class e extends m implements h.f.a.a<HandlerThread> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f131933a = new e();

        static {
            Covode.recordClassIndex(86442);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HandlerThread invoke() {
            HandlerThread handlerThread = new HandlerThread("record_task_manager");
            handlerThread.start();
            return handlerThread;
        }
    }

    static {
        Covode.recordClassIndex(86437);
        h a2 = i.a((h.f.a.a) e.f131933a);
        f131930h = a2;
        Looper looper = ((HandlerThread) a2.getValue()).getLooper();
        l.b(looper, "");
        f131927e = new d(looper);
    }

    public static final class d extends Handler {
        static {
            Covode.recordClassIndex(86441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Looper looper) {
            super(looper);
            l.d(looper, "");
        }

        public final void handleMessage(Message message) {
            a poll;
            l.d(message, "");
            super.handleMessage(message);
            if (message.what == c.TASK_EXEC.ordinal() && (poll = f.f131925c.poll()) != null) {
                e.a(poll);
                d dVar = f.f131927e;
                Message obtain = Message.obtain();
                obtain.what = c.TASK_EXEC.ordinal();
                dVar.sendMessageDelayed(obtain, ((Number) f.f131923a.getValue()).longValue());
            }
        }
    }

    private static boolean a(int i2) {
        if (i2 == d.RECORD_ON_FIRST_FRAME.ordinal()) {
            return true;
        }
        return false;
    }

    public static final void a(d dVar) {
        l.d(dVar, "");
        f131924b = dVar;
        b bVar = f131926d;
        Message obtain = Message.obtain();
        obtain.what = f131924b.ordinal();
        bVar.sendMessage(obtain);
    }

    public static final f a(a aVar) {
        l.d(aVar, "");
        if (a(f131924b.ordinal()) || aVar.b()) {
            e.a(aVar);
        } else {
            f131925c.add(aVar);
        }
        return f131929g;
    }
}
