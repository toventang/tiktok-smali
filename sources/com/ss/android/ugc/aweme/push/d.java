package com.ss.android.ugc.aweme.push;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.g;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.push.f;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.in;
import f.a.t;
import h.f.b.l;
import h.f.b.z;
import h.m;
import h.z;
import java.util.concurrent.TimeUnit;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final h.h f118856d = h.i.a(m.SYNCHRONIZED, b.f118862a);

    /* renamed from: e  reason: collision with root package name */
    public static final a f118857e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    f.a.b.b f118858a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f118859b;

    /* renamed from: c  reason: collision with root package name */
    String f118860c;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f118861f = h.i.a((h.f.a.a) c.f118863a);

    /* access modifiers changed from: package-private */
    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final h f118874a = new h();

        static {
            Covode.recordClassIndex(77220);
        }

        h() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public final e a() {
        return (e) this.f118861f.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77212);
        }

        public static d a() {
            return (d) d.f118856d.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f118862a = new b();

        static {
            Covode.recordClassIndex(77213);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f118863a = new c();

        static {
            Covode.recordClassIndex(77214);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e();
        }
    }

    static {
        Covode.recordClassIndex(77211);
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
        final /* synthetic */ boolean $isPaidEvent;
        final /* synthetic */ Activity $mContext;
        final /* synthetic */ String $trackInfo;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(77216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, String str, Activity activity, boolean z) {
            super(1);
            this.this$0 = dVar;
            this.$trackInfo = str;
            this.$mContext = activity;
            this.$isPaidEvent = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            String str;
            l.d(aVar, "");
            String str2 = this.$trackInfo;
            if (d.a(this.$mContext)) {
                str = "live_take_popup_in_room";
            } else {
                str = "live_take_popup_out_room";
            }
            f.a.a(str2, "cancel", str, this.$isPaidEvent);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final f f118864a = new f();

        static {
            Covode.recordClassIndex(77217);
        }

        f() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Long l2 = (Long) obj;
            l.d(l2, "");
            return Long.valueOf(l2.longValue() + 1);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
        final /* synthetic */ String $trackInfo;

        static {
            Covode.recordClassIndex(77221);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(1);
            this.$trackInfo = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            l.d(aVar, "");
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            s.d().t();
            f.a.a(this.$trackInfo, "go_live", "live_take_popup_in_room", true);
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
        final /* synthetic */ Activity $mContext;
        final /* synthetic */ String $trackInfo;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(77222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(d dVar, String str, Activity activity) {
            super(1);
            this.this$0 = dVar;
            this.$trackInfo = str;
            this.$mContext = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            String str;
            l.d(aVar, "");
            String str2 = this.$trackInfo;
            if (d.a(this.$mContext)) {
                str = "live_take_popup_in_room";
            } else {
                str = "live_take_popup_out_room";
            }
            f.a.a(str2, "cancel", str, true);
            return z.f158842a;
        }
    }

    public static boolean a(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (TextUtils.equals(activity.getLocalClassName(), "com.ss.android.ugc.aweme.live.LiveBroadcastActivity") || TextUtils.equals(activity.getLocalClassName(), "com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity")) {
            return true;
        }
        return false;
    }

    private static boolean b(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (TextUtils.equals(activity.getLocalClassName(), "com.ss.android.ugc.aweme.live.LivePlayActivity") || TextUtils.equals(activity.getLocalClassName(), "com.ss.android.ugc.aweme.live.LiveBroadcastActivity")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f118865a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f118866b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f118867c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f118868d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f118869e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f118870f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f118871g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.notice.api.bean.e f118872h;

        static {
            Covode.recordClassIndex(77218);
        }

        g(d dVar, z.e eVar, String str, String str2, String str3, String str4, String str5, com.ss.android.ugc.aweme.notice.api.bean.e eVar2) {
            this.f118865a = dVar;
            this.f118866b = eVar;
            this.f118867c = str;
            this.f118868d = str2;
            this.f118869e = str3;
            this.f118870f = str4;
            this.f118871g = str5;
            this.f118872h = eVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Long l2 = (Long) obj;
            if (this.f118865a.f118859b || l2.longValue() >= 60) {
                f.a.b.b bVar = this.f118865a.f118858a;
                if (bVar != null) {
                    bVar.dispose();
                    return;
                }
                return;
            }
            T t = this.f118866b.element;
            if (t != null) {
                t.runOnUiThread(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.push.d.g.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ g f118873a;

                    static {
                        Covode.recordClassIndex(77219);
                    }

                    {
                        this.f118873a = r1;
                    }

                    public final void run() {
                        this.f118873a.f118865a.a(false, this.f118873a.f118867c, this.f118873a.f118868d, this.f118873a.f118869e, this.f118873a.f118870f, this.f118873a.f118871g, this.f118873a.f118872h);
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.push.d$d  reason: collision with other inner class name */
    static final class C3046d extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, h.z> {
        final /* synthetic */ String $eventId;
        final /* synthetic */ boolean $isPaidEvent;
        final /* synthetic */ Activity $mContext;
        final /* synthetic */ String $openUrl;
        final /* synthetic */ String $trackInfo;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(77215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3046d(d dVar, Activity activity, String str, String str2, boolean z, String str3) {
            super(1);
            this.this$0 = dVar;
            this.$mContext = activity;
            this.$eventId = str;
            this.$trackInfo = str2;
            this.$isPaidEvent = z;
            this.$openUrl = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
            l.d(aVar, "");
            if (d.a(this.$mContext)) {
                ILiveOuterService s = LiveOuterService.s();
                l.b(s, "");
                s.d().e(this.$eventId);
                f.a.a(this.$trackInfo, "go_live", "live_take_popup_in_room", this.$isPaidEvent);
            } else {
                ILiveOuterService s2 = LiveOuterService.s();
                l.b(s2, "");
                s2.d().f(this.$openUrl);
                f.a.a(this.$trackInfo, "go_live", "live_take_popup_out_room", this.$isPaidEvent);
            }
            return h.z.f158842a;
        }
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(boolean z, String str, String str2, String str3, String str4, String str5, com.ss.android.ugc.aweme.notice.api.bean.e eVar) {
        boolean z2;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            g.a.a();
            boolean b2 = com.ss.android.ugc.aweme.im.g.b();
            z.e eVar2 = new z.e();
            eVar2.element = (T) com.bytedance.ies.ugc.appcontext.f.j();
            if (!in.d() && b2 && !com.bytedance.ies.ugc.appcontext.f.f34637l && !b(eVar2.element)) {
                boolean isRecording = AVExternalServiceImpl.a().configService().shortVideoConfig().isRecording();
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                if (eVar2.element instanceof MainActivity) {
                    Boolean isFollowFeed = eVar2.element.isFollowFeed();
                    l.b(isFollowFeed, "");
                    z2 = isFollowFeed.booleanValue();
                } else {
                    z2 = false;
                }
                if (!isRecording && ((!(eVar2.element instanceof MainActivity) || !eVar2.element.isADShowing() || z2) && (createIUserServicebyMonsterPlugin == null || createIUserServicebyMonsterPlugin.isLogin()))) {
                    try {
                        if (eVar2.element != null) {
                            if (!z) {
                                this.f118859b = true;
                            }
                            a().f118896e = eVar2.element;
                            a().a(str, str2, str3, str4, this.f118860c, str5, eVar);
                            a().c();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else if (z) {
                    this.f118859b = false;
                    this.f118858a = t.a(0, 60, 1, 1, TimeUnit.SECONDS).d(f.f118864a).a(new g(this, eVar2, str, str2, str3, str4, str5, eVar), h.f118874a);
                }
            }
        }
    }
}
