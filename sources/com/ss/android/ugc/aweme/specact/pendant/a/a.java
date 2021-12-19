package com.ss.android.ugc.aweme.specact.pendant.a;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.specact.pendant.h.k;
import com.ss.android.ugc.aweme.specact.popup.a.k;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements com.ss.android.ugc.aweme.specact.pendant.g.b {

    /* renamed from: j  reason: collision with root package name */
    public static final h f134083j = i.a(m.SYNCHRONIZED, b.f134095a);

    /* renamed from: k  reason: collision with root package name */
    public static final C3477a f134084k = new C3477a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f134085a = Keva.getRepo("pendant_global_timer_reducer");

    /* renamed from: b  reason: collision with root package name */
    public long f134086b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends UgActivityTasks> f134087c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final String f134088d = "SpecActBackgroundTask";

    /* renamed from: e  reason: collision with root package name */
    public UgAwemeActivitySetting f134089e;

    /* renamed from: f  reason: collision with root package name */
    public UgActivityTasks f134090f;

    /* renamed from: g  reason: collision with root package name */
    public int f134091g;

    /* renamed from: h  reason: collision with root package name */
    public List<String> f134092h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public String f134093i = "";

    /* renamed from: l  reason: collision with root package name */
    private final h f134094l = i.a((h.f.a.a) f.f134097a);

    private final com.ss.android.ugc.aweme.specact.b.c d() {
        return (com.ss.android.ugc.aweme.specact.b.c) this.f134094l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.a.a$a  reason: collision with other inner class name */
    public static final class C3477a {
        static {
            Covode.recordClassIndex(87708);
        }

        public static a a() {
            return (a) a.f134083j.getValue();
        }

        private C3477a() {
        }

        public /* synthetic */ C3477a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f134095a = new b();

        static {
            Covode.recordClassIndex(87709);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.specact.b.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f134097a = new f();

        static {
            Covode.recordClassIndex(87713);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.specact.b.c invoke() {
            return new com.ss.android.ugc.aweme.specact.b.c();
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134096a;

        static {
            Covode.recordClassIndex(87712);
        }

        e(a aVar) {
            this.f134096a = aVar;
        }

        public final void run() {
            UgActivityTasks a2 = this.f134096a.a();
            if (a2 != null) {
                this.f134096a.f134090f = a2;
            }
        }
    }

    static {
        Covode.recordClassIndex(87707);
    }

    private final boolean e() {
        if (this.f134092h.size() != this.f134087c.size() || !f()) {
            return false;
        }
        return true;
    }

    private final boolean f() {
        if (k.b() == this.f134085a.getLong(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_date"), 0)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.g.b
    public final void b() {
        this.f134085a.storeLong(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_time"), this.f134086b);
        e.a.f91018a.a(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_total_time"), (Object) String.valueOf(this.f134086b));
        this.f134085a.storeLong(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_date"), k.b());
    }

    public final UgActivityTasks a() {
        boolean z;
        List<? extends UgActivityTasks> list = this.f134087c;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        for (UgActivityTasks ugActivityTasks : this.f134087c) {
            if (((long) ugActivityTasks.getTime().intValue()) <= this.f134086b) {
                String taskId = ugActivityTasks.getTaskId();
                l.b(taskId, "");
                if (!a(taskId)) {
                }
            }
            return ugActivityTasks;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.g.b
    public final void c() {
        this.f134090f = null;
        this.f134086b = 0;
        this.f134091g = 0;
        this.f134093i = "";
        this.f134092h.clear();
        this.f134085a.storeString(com.ss.android.ugc.aweme.specact.pendant.h.m.a("completed_task_id_list"), "");
        this.f134085a.storeLong(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_time"), this.f134086b);
        e.a.f91018a.a(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_total_time"), (Object) String.valueOf(this.f134086b));
        this.f134085a.storeInt(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_finished_stage"), -1);
        this.f134085a.storeLong(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_date"), k.b());
        this.f134085a.storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("do_like_or_comment_tribute_action"), false);
        this.f134085a.storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("has_report_like_and_comment_tribute"), false);
        new Handler(Looper.getMainLooper()).postDelayed(new e(this), ((long) new Random().nextInt(5)) * 1000);
    }

    private final boolean a(String str) {
        return this.f134092h.contains(str);
    }

    private static boolean a(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (ugAwemeActivitySetting != null && !com.ss.android.ugc.aweme.specact.pendant.h.a.c(ugAwemeActivitySetting) && com.ss.android.ugc.aweme.specact.pendant.h.a.a(ugAwemeActivitySetting)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.specact.b.a, z> {
        final /* synthetic */ String $taskId;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, String str) {
            super(1);
            this.this$0 = aVar;
            this.$taskId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.specact.b.a aVar) {
            String str;
            UgActivityTasks a2;
            com.ss.android.ugc.aweme.specact.b.a aVar2 = aVar;
            l.d(aVar2, "");
            if (aVar2.f134053a != 10009) {
                this.this$0.b();
                this.this$0.f134085a.storeInt(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_finished_stage"), this.this$0.f134091g);
                this.this$0.f134091g++;
                a aVar3 = this.this$0;
                if (aVar3.f134093i.length() == 0) {
                    str = this.$taskId;
                } else {
                    str = this.this$0.f134093i + ',' + this.$taskId;
                }
                aVar3.f134093i = str;
                this.this$0.f134092h.add(this.$taskId);
                this.this$0.f134085a.storeString(com.ss.android.ugc.aweme.specact.pendant.h.m.a("completed_task_id_list"), this.this$0.f134093i);
                if (this.this$0.f134092h.size() < this.this$0.f134087c.size() && (a2 = this.this$0.a()) != null) {
                    this.this$0.f134090f = a2;
                }
            } else {
                this.this$0.b();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.g.b
    public final void a(Aweme aweme) {
        l.d(aweme, "");
        if (!e() && this.f134090f != null && com.ss.android.ugc.aweme.specact.pendant.h.l.a(aweme)) {
            UgActivityTasks ugActivityTasks = this.f134090f;
            if (ugActivityTasks == null) {
                l.b();
            }
            int b2 = com.ss.android.ugc.aweme.specact.pendant.h.a.b(ugActivityTasks);
            long j2 = this.f134086b;
            if (j2 >= ((long) b2)) {
                UgActivityTasks ugActivityTasks2 = this.f134090f;
                if (ugActivityTasks2 == null) {
                    l.b();
                }
                UgActivityTasks clone = ugActivityTasks2.clone();
                this.f134090f = null;
                l.b(clone, "");
                a(clone);
                return;
            }
            this.f134086b = j2 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.specact.b.a, z> {
        final /* synthetic */ String $taskFinishPush;
        final /* synthetic */ String $taskId;
        final /* synthetic */ int $taskTime;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(87711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, String str, int i2, String str2) {
            super(1);
            this.this$0 = aVar;
            this.$taskFinishPush = str;
            this.$taskTime = i2;
            this.$taskId = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.specact.b.a aVar) {
            String str;
            UgActivityTasks a2;
            String str2;
            boolean z;
            boolean z2;
            View view;
            MethodCollector.i(11228);
            com.ss.android.ugc.aweme.specact.b.a aVar2 = aVar;
            l.d(aVar2, "");
            boolean z3 = false;
            if (!(com.bytedance.ies.ugc.appcontext.f.j() == null || this.$taskFinishPush == null || !com.ss.android.ugc.aweme.specact.pendant.h.d.a() || (str2 = aVar2.f134054b) == null)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    int optInt = jSONObject.optInt("display_amount");
                    String optString = jSONObject.optString("display_cash_amount_i18n");
                    if (optInt > 0) {
                        l.b(optString, "");
                        if (optString.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            String str3 = com.ss.android.ugc.aweme.specact.popup.e.a.a(com.ss.android.ugc.aweme.specact.pendant.h.a.h(this.this$0.f134089e), "enter_from", "inapp_push") + "#unified_watch_video";
                            String a3 = com.a.a(this.$taskFinishPush, Arrays.copyOf(new Object[]{Integer.valueOf(optInt), optString, Integer.valueOf(this.$taskTime / 60)}, 3));
                            l.b(a3, "");
                            if (this.this$0.f134091g == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            com.ss.android.ugc.aweme.specact.popup.d.a aVar3 = new com.ss.android.ugc.aweme.specact.popup.d.a("", a3, z2, str3, (byte) 0);
                            Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                            if (j2 == null) {
                                l.b();
                            }
                            l.d(j2, "");
                            l.d(aVar3, "");
                            com.ss.android.ugc.aweme.specact.popup.d.b bVar = new com.ss.android.ugc.aweme.specact.popup.d.b(j2, aVar3);
                            PullUpLayout pullUpLayout = bVar.f134632f;
                            if (pullUpLayout == null) {
                                l.a("mPullUpLayout");
                            }
                            pullUpLayout.a();
                            if (!bVar.f134634h.isFinishing() && !bVar.isShowing()) {
                                bVar.f134629c = System.currentTimeMillis() + ((long) bVar.f134627a);
                                PullUpLayout pullUpLayout2 = bVar.f134632f;
                                if (pullUpLayout2 == null) {
                                    l.a("mPullUpLayout");
                                }
                                pullUpLayout2.postDelayed(bVar.f134630d, (long) bVar.f134627a);
                                if (bVar.f134631e.getParent() != null) {
                                    ViewParent parent = bVar.f134631e.getParent();
                                    if (parent != null) {
                                        ((ViewGroup) parent).removeView(bVar.f134631e);
                                    } else {
                                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                                        MethodCollector.o(11228);
                                        throw nullPointerException;
                                    }
                                }
                                try {
                                    Window window = bVar.f134634h.getWindow();
                                    if (window != null) {
                                        view = window.getDecorView();
                                    } else {
                                        view = null;
                                    }
                                    int i2 = Build.VERSION.SDK_INT;
                                    bVar.showAtLocation(view, 48, 0, -n.e(com.bytedance.ies.ugc.appcontext.d.a()));
                                    r.onEventV3("watch_task_push_show");
                                    com.ss.android.ugc.aweme.specact.popup.d.b.f134625i = true;
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                    }
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
            this.this$0.f134085a.storeInt(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_finished_stage"), this.this$0.f134091g);
            this.this$0.f134085a.storeLong(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_time"), this.this$0.f134086b);
            a aVar4 = this.this$0;
            if (aVar4.f134093i.length() == 0) {
                z3 = true;
            }
            if (z3) {
                str = this.$taskId;
            } else {
                str = this.this$0.f134093i + ',' + this.$taskId;
            }
            aVar4.f134093i = str;
            this.this$0.f134092h.add(this.$taskId);
            this.this$0.f134085a.storeString(com.ss.android.ugc.aweme.specact.pendant.h.m.a("completed_task_id_list"), this.this$0.f134093i);
            e.a.f91018a.a(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_total_time"), (Object) String.valueOf(this.this$0.f134086b));
            this.this$0.f134091g++;
            if (this.this$0.f134092h.size() < this.this$0.f134087c.size() && (a2 = this.this$0.a()) != null) {
                this.this$0.f134090f = a2;
            }
            z zVar = z.f158842a;
            MethodCollector.o(11228);
            return zVar;
        }
    }

    public final void a(UgActivityTasks ugActivityTasks) {
        int b2 = com.ss.android.ugc.aweme.specact.pendant.h.a.b(ugActivityTasks);
        String c2 = com.ss.android.ugc.aweme.specact.pendant.h.a.c(ugActivityTasks);
        String a2 = com.ss.android.ugc.aweme.specact.pendant.h.a.a(ugActivityTasks);
        if (!TextUtils.isEmpty(c2)) {
            d dVar = new d(this, a2, b2, c2);
            c cVar = new c(this, c2);
            if (!l.a((Object) c2, (Object) "like_comment_tribute")) {
                d();
                com.ss.android.ugc.aweme.specact.b.c.a(c2, b2, true, dVar, cVar);
            } else if (this.f134085a.getBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("do_like_or_comment_tribute_action"), false)) {
                d();
                com.ss.android.ugc.aweme.specact.b.c.a(c2, b2, true, dVar, cVar);
                this.f134085a.storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("has_report_like_and_comment_tribute"), true);
                r.a("interact_task_complete", new com.ss.android.ugc.aweme.app.f.d().a("task_name", "complete").a("task_id", c2).f66730a);
            } else {
                r.a("interact_task_complete", new com.ss.android.ugc.aweme.app.f.d().a("task_name", "watch_video").a("task_id", c2).f66730a);
            }
        }
    }

    public final void a(List<k.i> list) {
        try {
            if (!com.ss.android.ugc.aweme.specact.pendant.h.m.a()) {
                return;
            }
            if (a(this.f134089e)) {
                this.f134086b = this.f134085a.getLong(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_time"), 0);
                this.f134091g = this.f134085a.getInt(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_finished_stage"), -1) + 1;
                String string = this.f134085a.getString(com.ss.android.ugc.aweme.specact.pendant.h.m.a("completed_task_id_list"), "");
                l.b(string, "");
                this.f134093i = string;
                if (string.length() > 0) {
                    this.f134092h = h.a.n.g((Collection) p.b(this.f134093i, new String[]{","}));
                }
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f134089e;
                if (ugAwemeActivitySetting == null) {
                    l.b();
                }
                List<UgActivityTasks> a2 = com.ss.android.ugc.aweme.specact.pendant.h.f.a(ugAwemeActivitySetting.getActivityTasks(), list);
                if (!a2.isEmpty()) {
                    this.f134087c = a2;
                    if (!e() && !f()) {
                        this.f134086b = 0;
                        this.f134091g = 0;
                        this.f134093i = "";
                        this.f134092h.clear();
                        this.f134085a.storeString(com.ss.android.ugc.aweme.specact.pendant.h.m.a("completed_task_id_list"), "");
                        this.f134085a.storeInt(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_finished_stage"), -1);
                        this.f134085a.storeLong(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_date"), com.ss.android.ugc.aweme.specact.pendant.h.k.b());
                        this.f134085a.storeLong(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_time"), 0);
                        e.a.f91018a.a(com.ss.android.ugc.aweme.specact.pendant.h.m.a("background_task_total_time"), (Object) String.valueOf(this.f134086b));
                        this.f134085a.storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("do_like_or_comment_tribute_action"), false);
                        this.f134085a.storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("has_report_like_and_comment_tribute"), false);
                    }
                    com.ss.android.ugc.aweme.specact.pendant.f.c.a(this);
                    UgActivityTasks a3 = a();
                    if (a3 != null) {
                        this.f134090f = a3;
                    }
                }
            }
        } catch (com.bytedance.ies.a unused) {
        }
    }
}
