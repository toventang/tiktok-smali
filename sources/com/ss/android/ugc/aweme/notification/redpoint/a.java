package com.ss.android.ugc.aweme.notification.redpoint;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.repo.api.NotificationApi;
import f.a.d.f;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a implements i, j {

    /* renamed from: a  reason: collision with root package name */
    static NoticeList f113787a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f113788b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f113789c = h.i.a((h.f.a.a) C2915a.f113791a);

    /* renamed from: d  reason: collision with root package name */
    private static Integer f113790d;

    private static f.a.b.a a() {
        return (f.a.b.a) f113789c.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(402, new g(a.class, "onRecordImMsgCountEvent", com.ss.android.ugc.aweme.notice.api.b.c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.redpoint.a$a  reason: collision with other inner class name */
    static final class C2915a extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2915a f113791a = new C2915a();

        static {
            Covode.recordClassIndex(73173);
        }

        C2915a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final e f113795a = new e();

        static {
            Covode.recordClassIndex(73177);
        }

        e() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Message obtain = Message.obtain();
            obtain.obj = a.f113787a;
            obtain.what = 0;
            h.b().handleMsg(obtain);
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(73172);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (com.ss.android.ugc.aweme.notification.redpoint.a.f113787a != null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void b() {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.redpoint.a.b():void");
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f113793a = new c();

        static {
            Covode.recordClassIndex(73175);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            NoticeList noticeList = (NoticeList) obj;
            a aVar = a.f113788b;
            l.b(noticeList, "");
            aVar.a(noticeList);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f113792a;

        static {
            Covode.recordClassIndex(73174);
        }

        b(int i2) {
            this.f113792a = i2;
        }

        @Override // f.a.w
        public final void subscribe(v<NoticeList> vVar) {
            l.d(vVar, "");
            try {
                vVar.a(NotificationApi.a(this.f113792a));
            } catch (Exception e2) {
                vVar.a(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f113794a = new d();

        static {
            Covode.recordClassIndex(73176);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            th.getMessage();
            com.ss.android.ugc.aweme.notification.e.a.b.a("ColdStartUnreadOptHelp", "queryUnreadNotifyCount " + th.getMessage());
        }
    }

    public final void a(NoticeList noticeList) {
        l.d(noticeList, "");
        com.ss.android.ugc.aweme.notification.e.a.b.a("ColdStartUnreadOptHelp", "multiUserCountPull: ".concat(String.valueOf(noticeList)));
        f113787a = noticeList;
        b();
    }

    @r(a = ThreadMode.MAIN)
    public final void onRecordImMsgCountEvent(com.ss.android.ugc.aweme.notice.api.b.c cVar) {
        l.d(cVar, "");
        f113790d = Integer.valueOf(cVar.f112673a);
        b();
    }

    public static void a(int i2) {
        com.ss.android.ugc.aweme.notification.e.a.b.a("ColdStartUnreadOptHelp", "queryUnreadNotifyCount  ".concat(String.valueOf(i2)));
        f.a.b.b a2 = t.a(new b(i2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(c.f113793a, d.f113794a);
        a().a();
        a().a(a2);
    }
}
