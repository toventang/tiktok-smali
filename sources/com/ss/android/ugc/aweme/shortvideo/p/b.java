package com.ss.android.ugc.aweme.shortvideo.p;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import h.f.b.m;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public final class b implements e {

    /* renamed from: e  reason: collision with root package name */
    public static final a f129535e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f129536a;

    /* renamed from: b  reason: collision with root package name */
    public final Stack<String> f129537b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicInteger f129538c;

    /* renamed from: d  reason: collision with root package name */
    public final String f129539d;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f129540f = h.i.a((h.f.a.a) new c(this));

    /* renamed from: g  reason: collision with root package name */
    private final ExecutorService f129541g;

    static {
        Covode.recordClassIndex(85022);
    }

    public final Keva a() {
        return (Keva) this.f129540f.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85023);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129547a;

        static {
            Covode.recordClassIndex(85028);
        }

        f(b bVar) {
            this.f129547a = bVar;
        }

        public final void run() {
            this.f129547a.a().storeBoolean("exit_monitor_key_in_pipeline", true);
        }
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129553a;

        static {
            Covode.recordClassIndex(85031);
        }

        i(b bVar) {
            this.f129553a = bVar;
        }

        public final void run() {
            this.f129553a.a().storeBoolean("exit_monitor_key_in_pipeline", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.p.e
    public final String b() {
        String string = a().getString("exit_monitor_key_last_page", "");
        l.b(string, "");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.p.e
    public final void c() {
        this.f129541g.submit(new f(this));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.p.e
    public final void d() {
        this.f129541g.submit(new i(this));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.p.e
    public final void e() {
        this.f129541g.submit(new e(this, 1));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.p.e
    public final void f() {
        this.f129541g.submit(new d(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b$b  reason: collision with other inner class name */
    static final class RunnableC3376b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129542a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f129543b;

        static {
            Covode.recordClassIndex(85024);
        }

        RunnableC3376b(b bVar, int i2) {
            this.f129542a = bVar;
            this.f129543b = i2;
        }

        public final void run() {
            this.f129542a.a().storeInt("exit_monitor_key_publish_task", this.f129542a.f129538c.addAndGet(this.f129543b));
        }
    }

    static final class c extends m implements h.f.a.a<Keva> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(85025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo(this.this$0.f129539d + "_studio_abnormal_exit_repo");
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129545a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f129546b = 1;

        static {
            Covode.recordClassIndex(85027);
        }

        e(b bVar, int i2) {
            this.f129545a = bVar;
        }

        public final void run() {
            this.f129545a.a().storeInt("exit_monitor_key_publish_task", this.f129545a.f129538c.addAndGet(-this.f129546b));
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129548a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f129549b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f129550c;

        static {
            Covode.recordClassIndex(85029);
        }

        g(b bVar, boolean z, String str) {
            this.f129548a = bVar;
            this.f129549b = z;
            this.f129550c = str;
        }

        public final void run() {
            if (this.f129549b) {
                this.f129548a.f129537b.clear();
            }
            this.f129548a.f129537b.push(this.f129550c);
            this.f129548a.a().storeString("exit_monitor_key_last_page", this.f129550c);
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129551a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f129552b;

        static {
            Covode.recordClassIndex(85030);
        }

        h(b bVar, String str) {
            this.f129551a = bVar;
            this.f129552b = str;
        }

        public final void run() {
            if (l.a((Object) this.f129551a.f129537b.peek(), (Object) this.f129552b)) {
                this.f129551a.f129537b.pop();
                this.f129551a.a().storeString("exit_monitor_key_last_page", this.f129551a.f129537b.peek());
            }
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f129544a;

        static {
            Covode.recordClassIndex(85026);
        }

        d(b bVar) {
            this.f129544a = bVar;
        }

        public final void run() {
            boolean z = this.f129544a.a().getBoolean("exit_monitor_key_in_pipeline", false);
            int i2 = this.f129544a.a().getInt("exit_monitor_key_publish_task", 0);
            if (z || i2 > 0) {
                r.a("app_exit_from_camera", new com.ss.android.ugc.tools.f.b().a("last_status", this.f129544a.b()).a("pending_task_cnt", i2).a("shoot_page", this.f129544a.f129536a).f149193a);
            }
            if (l.a((Object) this.f129544a.b(), (Object) "after_click_publish") || l.a((Object) this.f129544a.f129539d, (Object) "story")) {
                this.f129544a.a().storeBoolean("exit_monitor_key_in_pipeline", false);
                this.f129544a.a().storeInt("exit_monitor_key_publish_task", 0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.p.e
    public final void a(int i2) {
        this.f129541g.submit(new RunnableC3376b(this, i2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.p.e
    public final void a(String str) {
        l.d(str, "");
        this.f129541g.submit(new h(this, str));
    }

    public b(String str) {
        String str2 = "";
        l.d(str, str2);
        this.f129539d = str;
        int hashCode = str.hashCode();
        if (hashCode != -1039745817) {
            if (hashCode == 109770997 && str.equals("story")) {
                str2 = "story_shoot_page";
            }
        } else if (str.equals("normal")) {
            str2 = "video_shoot_page";
        }
        this.f129536a = str2;
        this.f129541g = com.ss.android.ugc.aweme.cw.g.e();
        this.f129537b = new Stack<>();
        this.f129538c = new AtomicInteger(0);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.p.e
    public final void a(String str, boolean z) {
        l.d(str, "");
        this.f129541g.submit(new g(this, z, str));
    }
}
