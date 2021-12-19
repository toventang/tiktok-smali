package com.ss.android.ugc.aweme.setting.serverpush.ui;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.be.e;
import com.ss.android.ugc.aweme.be.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.dc.d;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.aweme.setting.serverpush.b.b;
import com.ss.android.ugc.aweme.setting.serverpush.b.c;
import com.ss.android.ugc.aweme.setting.serverpush.b.i;
import com.ss.android.ugc.aweme.setting.serverpush.b.j;
import com.ss.android.ugc.aweme.setting.serverpush.b.m;
import com.ss.android.ugc.aweme.setting.ui.cell.CommonItemViewCell;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.fg;
import com.ss.android.ugc.aweme.utils.fh;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class g extends com.ss.android.ugc.aweme.base.f.a implements b, c {
    d A;
    d B;
    d C;
    n D;
    com.ss.android.ugc.aweme.setting.unit.a.a E;
    j F;
    i G;
    PackageManager H;
    public JSONObject I;
    private m J;
    private List<n> K = new ArrayList();
    private f.a.l.c<n> L;
    private boolean M = false;
    private List<String> N;
    private NotificationManager O;
    private Keva P = null;

    /* renamed from: a  reason: collision with root package name */
    TextView f122617a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f122618b;

    /* renamed from: c  reason: collision with root package name */
    n f122619c;

    /* renamed from: d  reason: collision with root package name */
    n f122620d;

    /* renamed from: e  reason: collision with root package name */
    PowerList f122621e;

    /* renamed from: j  reason: collision with root package name */
    dm f122622j;

    /* renamed from: k  reason: collision with root package name */
    n f122623k;

    /* renamed from: l  reason: collision with root package name */
    n f122624l;

    /* renamed from: m  reason: collision with root package name */
    n f122625m;
    n n;
    n o;
    n p;
    n q;
    n r;
    n s;
    n t;
    n u;
    n v;
    d w;
    d y;
    d z;

    static {
        Covode.recordClassIndex(80458);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
    public final void av_() {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f122630a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f122631b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f122632c;

        static {
            Covode.recordClassIndex(80461);
        }

        public final boolean a() {
            if (!this.f122631b || !this.f122632c) {
                return false;
            }
            return true;
        }

        public a(String str) {
            this.f122630a = str;
        }
    }

    public final Keva c() {
        if (this.P == null) {
            this.P = Keva.getRepo("need_sync");
        }
        return this.P;
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
    public final void cf_() {
        new com.bytedance.tux.g.b(this).e(R.string.de2).b();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.F.cd_();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.g$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f122629a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 80460(0x13a4c, float:1.12748E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.setting.serverpush.b.l[] r0 = com.ss.android.ugc.aweme.setting.serverpush.b.l.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.setting.serverpush.ui.g.AnonymousClass2.f122629a = r2
                com.ss.android.ugc.aweme.setting.serverpush.b.l r0 = com.ss.android.ugc.aweme.setting.serverpush.b.l.WITH_TEXT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.setting.serverpush.ui.g.AnonymousClass2.f122629a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.setting.serverpush.b.l r0 = com.ss.android.ugc.aweme.setting.serverpush.b.l.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.serverpush.ui.g.AnonymousClass2.<clinit>():void");
        }
    }

    private f.a.l.c<n> e() {
        if (this.L == null) {
            f.a.l.c<n> cVar = new f.a.l.c<>();
            this.L = cVar;
            cVar.d(400, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new l(this));
        }
        return this.L;
    }

    private void d() {
        a aVar;
        String string = c().getString("need_sync_channel_name", "");
        if (this.I != null && !TextUtils.isEmpty(string) && a(string)) {
            n b2 = b(string);
            if (!(b2 == null || (aVar = (a) ((h) b2.f79368m).f68603g) == null || aVar.f122631b)) {
                int i2 = 1;
                b2.b(true);
                com.ss.android.ugc.aweme.setting.services.h.f122675a.a(aVar.f122630a, 1);
                aVar.f122631b = true;
                try {
                    JSONObject jSONObject = this.I;
                    String str = aVar.f122630a;
                    if (!aVar.f122631b) {
                        i2 = 0;
                    }
                    jSONObject.put(str, i2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                e().onNext(b2);
            }
            c().storeString("need_sync_channel_name", "");
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.J.a(fg.a(getContext()));
        boolean a2 = fg.a(getContext());
        this.f122623k.c(a2);
        this.f122624l.c(a2);
        this.f122625m.c(a2);
        this.n.c(a2);
        this.f122620d.c(a2);
        this.o.c(a2);
        this.p.c(a2);
        this.q.c(a2);
        this.r.c(a2);
        this.u.c(a2);
        this.E.c(a2);
        this.D.c(a2);
        this.t.c(a2);
        if (this.I != null) {
            for (n nVar : this.K) {
                try {
                    a(nVar, this.I.getInt(((a) ((h) nVar.f79368m).f68603g).f122630a));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        d();
    }

    public static boolean a(Context context) {
        if (fg.a(context)) {
            return true;
        }
        fh.a(context, true, null, true);
        return false;
    }

    private static boolean c(String str) {
        if (!com.ss.android.ugc.aweme.setting.utils.j.b()) {
            return true;
        }
        String[] c2 = com.ss.android.ugc.aweme.setting.utils.j.c();
        if (c2.length != 0) {
            return a(c2, str);
        }
        return true;
    }

    private n b(String str) {
        for (n nVar : this.K) {
            a aVar = (a) ((h) nVar.f79368m).f68603g;
            if (aVar != null && TextUtils.equals(str, aVar.f122630a)) {
                return nVar;
            }
        }
        return null;
    }

    private void b(f fVar) {
        if (this.M) {
            fVar.f122570i = 0;
            fVar.f122573l = 0;
            fVar.o = 0;
        }
        a(this.f122623k, fVar.f122562a);
        a(this.f122624l, fVar.f122563b);
        a(this.f122625m, fVar.f122564c);
        a(this.n, fVar.f122565d);
        a(this.f122620d, fVar.an);
        a(this.o, fVar.f122569h);
        a(this.p, fVar.f122570i);
        a(this.q, fVar.f122571j);
        a(this.r, fVar.n);
        a(this.u, fVar.o);
        a(this.v, fVar.p);
        a(this.D, fVar.f122573l);
        a(this.t, fVar.f122574m);
        NotificationManagerServiceImpl.d().c(Integer.valueOf(fVar.f122573l));
        d();
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    public final void a(f fVar) {
        try {
            this.I = new JSONObject(dg.a().b(fVar));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        b(fVar);
        com.ss.android.ugc.aweme.setting.services.h.f122675a.a(this.I);
        d();
    }

    public final boolean a(String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = this.O.getNotificationChannel(a(str, com.ss.android.ugc.aweme.setting.utils.j.a()))) == null || notificationChannel.getImportance() != 0) {
            return true;
        }
        return false;
    }

    private void a(n nVar, int i2) {
        a aVar = (a) ((h) nVar.f79368m).f68603g;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        aVar.f122631b = z2;
        aVar.f122632c = a(aVar.f122630a);
        nVar.b(aVar.a());
    }

    private void a(final n nVar, String str) {
        final a aVar = new a(str);
        nVar.a(aVar);
        nVar.a(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.setting.serverpush.ui.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(80459);
            }

            public final void onClick(View view) {
                String str;
                String curUserId;
                String str2;
                String str3;
                ClickAgent.onClick(view);
                if (g.this.ab_() && g.this.getContext() != null) {
                    a aVar = (a) ((h) nVar.f79368m).f68603g;
                    String str4 = aVar.f122630a;
                    if (g.a(g.this.getContext())) {
                        int i2 = 0;
                        String str5 = "off";
                        if (TextUtils.equals(str4, "live_inner_push")) {
                            if (((h) nVar.f79368m).f68599c) {
                                str3 = str5;
                            } else {
                                str3 = "on";
                            }
                            com.ss.android.ugc.aweme.im.f.b(str3);
                            NotificationManagerServiceImpl.d().c(Integer.valueOf(!((h) nVar.f79368m).f68599c ? 1 : 0));
                        } else if (TextUtils.equals(str4, "im_inner_push")) {
                            if (((h) nVar.f79368m).f68599c) {
                                str2 = str5;
                            } else {
                                str2 = "on";
                            }
                            com.ss.android.ugc.aweme.im.f.a(str2);
                            NotificationManagerServiceImpl.d().b(Integer.valueOf(!((h) nVar.f79368m).f68599c ? 1 : 0));
                        } else if (TextUtils.equals(str4, "im_push")) {
                            if (((h) nVar.f79368m).f68599c) {
                                str = str5;
                            } else {
                                str = "on";
                            }
                            com.ss.android.ugc.aweme.im.f.a(str);
                            NotificationManagerServiceImpl.d().a(Integer.valueOf(!((h) nVar.f79368m).f68599c ? 1 : 0));
                            Boolean valueOf = Boolean.valueOf(((h) nVar.f79368m).f68599c);
                            IAccountUserService e2 = AccountService.a().e();
                            if (AccountService.a().e() == null) {
                                curUserId = "-1";
                            } else {
                                curUserId = e2.getCurUserId();
                            }
                            SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(com.bytedance.ies.ugc.appcontext.d.a(), "imbase_".concat(String.valueOf(Long.parseLong(curUserId.toString()))), 0);
                            if (valueOf.booleanValue()) {
                                a2.edit().putBoolean("key_mt_inner_push_switch_on", false).commit();
                            } else {
                                a2.edit().putBoolean("key_mt_inner_push_switch_on", true).commit();
                            }
                        } else if (!g.a(g.this.getContext())) {
                            return;
                        }
                        if (Build.VERSION.SDK_INT < 26 || g.this.a(str4)) {
                            boolean z = !((h) nVar.f79368m).f68599c ? 1 : 0;
                            nVar.b(z);
                            aVar.f122631b = z;
                            com.ss.android.ugc.aweme.setting.services.h.f122675a.a(str4, z ? 1 : 0);
                            g.this.G.a(aVar.f122630a, Integer.valueOf(aVar.f122631b ? 1 : 0));
                            try {
                                if (g.this.I != null) {
                                    JSONObject jSONObject = g.this.I;
                                    String str6 = aVar.f122630a;
                                    if (aVar.f122631b) {
                                        i2 = 1;
                                    }
                                    jSONObject.put(str6, i2);
                                }
                            } catch (JSONException e3) {
                                e3.printStackTrace();
                            }
                            if (z) {
                                str5 = "on";
                            }
                            r.a("notification_switch", new com.ss.android.ugc.aweme.app.f.d().a("label", str4).a("to_status", str5).f66730a);
                            return;
                        }
                        if (!aVar.f122631b && !aVar.f122632c) {
                            g.this.c().storeString("need_sync_channel_name", str4);
                        }
                        g gVar = g.this;
                        if (Build.VERSION.SDK_INT >= 26) {
                            String a3 = g.a(str4, com.ss.android.ugc.aweme.setting.utils.j.a());
                            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                            intent.setFlags(268435456);
                            intent.putExtra("android.provider.extra.APP_PACKAGE", com.bytedance.ies.ugc.appcontext.d.a().getPackageName());
                            intent.putExtra("android.provider.extra.CHANNEL_ID", a3);
                            if (gVar.H == null) {
                                gVar.H = com.bytedance.ies.ugc.appcontext.d.a().getPackageManager();
                            }
                            if (gVar.H.resolveActivity(intent, 65536) != null) {
                                gVar.startActivity(intent);
                            }
                        }
                    }
                }
            }
        });
        this.K.add(nVar);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6474);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(6474);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static String a(String str, int i2) {
        c(str);
        if (i2 == 0) {
            int a2 = com.ss.android.ugc.aweme.setting.utils.j.a();
            if (a2 != 0 && c(str)) {
                return str + "_associated_" + a2;
            }
            return str;
        } else if (c(str)) {
            return str + "_associated_" + i2;
        } else {
            return str;
        }
    }

    private static boolean a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i2;
        this.f122617a = (TextView) view.findViewById(R.id.title);
        this.f122618b = (ImageView) view.findViewById(R.id.qb);
        this.f122621e = (PowerList) view.findViewById(R.id.ddp);
        this.f122619c = new n(new h(getString(R.string.f1r), new h(this), (byte) 0));
        this.f122623k = new n(new h(getString(R.string.f1o)));
        this.f122624l = new n(new h(getString(R.string.f1n), "item_push_comment"));
        this.f122625m = new n(new h(getString(R.string.f1p), "item_push_follow"));
        this.n = new n(new h(getString(R.string.f1m)));
        this.f122620d = new n(new h(getString(R.string.f99), (View.OnClickListener) null));
        this.o = new n(new h(getString(R.string.f1q)));
        this.p = new n(new h(getString(R.string.f1v)));
        this.q = new n(new h(getString(R.string.f21)));
        this.r = new n(new h(getString(R.string.f1u)));
        this.s = new n(new h(getString(R.string.acs), (View.OnClickListener) null));
        this.t = new n(new h(getString(R.string.f2m), (View.OnClickListener) null));
        this.u = new n(new h(getString(R.string.frn)));
        this.v = new n(new h(getString(R.string.f8f)));
        this.w = new d(new e(getString(R.string.f1x)));
        this.y = new d(new e(getString(R.string.f1x), false, false));
        this.z = new d(new e(getString(R.string.f1y)));
        this.A = new d(new e(getString(R.string.f1z)));
        this.B = new d(new e(getString(R.string.f1w)));
        this.C = new d(new e(getString(R.string.frm)));
        this.D = new n(new h(getString(R.string.acu)));
        this.E = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(0, getString(R.string.eg5), new i(this), null));
        dm dmVar = new dm(this.f122621e);
        this.f122622j = dmVar;
        dmVar.f82878a.a(CommonItemViewCell.class);
        this.f122622j.a(this.f122619c);
        this.f122622j.a(this.w);
        this.f122622j.a(this.y);
        this.f122622j.a(this.f122623k);
        this.f122622j.a(this.f122624l);
        this.f122622j.a(this.f122625m);
        this.f122622j.a(this.n);
        this.f122622j.a(this.f122620d);
        this.f122622j.a(this.z);
        this.f122622j.a(this.r);
        this.f122622j.a(this.s);
        this.f122622j.a(this.t);
        this.f122622j.a(this.A);
        this.f122622j.a(this.o);
        this.f122622j.a(this.p);
        this.f122622j.a(this.B);
        this.f122622j.a(this.q);
        this.f122622j.a(this.D);
        this.f122622j.a(this.E);
        this.f122622j.a(this.C);
        this.f122622j.a(this.v);
        this.f122622j.a(this.u);
        this.f122623k.b(getString(R.string.mk));
        this.v.c(getString(R.string.f8g));
        View findViewById = view.findViewById(R.id.qb);
        if (findViewById != null) {
            findViewById.setOnClickListener(new j(this));
        }
        super.onViewCreated(view, bundle);
        this.O = (NotificationManager) a(com.bytedance.ies.ugc.appcontext.d.a(), "notification");
        this.M = TextUtils.equals(getArguments().getString("enter_from"), "policy_notice");
        this.J = new m();
        this.f122617a.setText(R.string.fnl);
        this.J.f122594a.observe(this, new k(this));
        this.q.a(false);
        this.E.a(true);
        this.E.a(2131233734);
        a(this.f122623k, "digg_push");
        a(this.f122624l, "comment_push");
        a(this.f122625m, "follow_push");
        a(this.n, "mention_push");
        a(this.f122620d, "friend_upvote_push");
        a(this.o, "follow_new_video_push");
        a(this.p, "recommend_video_push");
        a(this.q, "live_push");
        a(this.r, "im_push");
        a(this.u, "other_channel");
        a(this.D, "live_inner_push");
        a(this.v, "friend_suggestions");
        a(this.t, "im_push_preview");
        this.r.a(com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.f1u));
        this.q.a(com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.f21));
        this.s.a(false);
        this.s.a(false);
        if (com.ss.android.ugc.aweme.setting.a.a.a()) {
            this.D.a(true);
        } else {
            this.D.a(false);
        }
        if (com.ss.android.ugc.aweme.im.service.c.h.a()) {
            this.t.a(true);
        } else {
            this.t.a(false);
        }
        if (this.N == null) {
            this.N = com.ss.android.ugc.aweme.setting.services.e.f122670a.a();
        }
        List<String> list = this.N;
        if (list != null) {
            com.ss.android.ugc.aweme.setting.utils.d.a(this.f122622j, list);
            this.z.a(false);
            this.A.a(false);
            this.B.a(false);
        }
        f a2 = com.ss.android.ugc.aweme.setting.services.h.f122675a.a();
        if (a2 != null) {
            b(a2);
        }
        j jVar = new j();
        this.F = jVar;
        jVar.a_(this);
        this.F.a(new Object[0]);
        com.ss.android.ugc.aweme.setting.serverpush.b.i iVar = new com.ss.android.ugc.aweme.setting.serverpush.b.i();
        this.G = iVar;
        iVar.a_(this);
        this.G.f76398j = false;
        this.f122617a.setText(R.string.fra);
        this.f122619c.a(getContext().getString(R.string.fra));
        this.w.a(getString(R.string.fre));
        this.w.a(false);
        this.y.a(getString(R.string.fre));
        this.y.a(true);
        this.f122623k.a(getContext().getString(R.string.frf));
        this.f122624l.a(getContext().getString(R.string.frb));
        this.f122625m.a(getContext().getString(R.string.frd));
        n nVar = this.n;
        Context context = getContext();
        if (com.ss.android.ugc.aweme.comment.d.g.d()) {
            i2 = R.string.d3d;
        } else {
            i2 = R.string.fri;
        }
        nVar.a(context.getString(i2));
        this.z.a(getString(R.string.frj));
        if (com.ss.android.ugc.aweme.setting.serverpush.c.a.a()) {
            this.f122620d.a(true);
            this.f122620d.a(com.ss.android.ugc.aweme.setting.serverpush.c.a.b());
        } else {
            this.f122620d.a(false);
        }
        this.r.a(getContext().getString(R.string.frc));
        this.A.a(getString(R.string.frs));
        this.o.a(getContext().getString(R.string.frt));
        this.p.a(getContext().getString(R.string.fru));
        this.B.a(getString(R.string.frg));
        this.q.a(getContext().getString(R.string.frh));
        this.D.a(getContext().getString(R.string.ug));
        this.C.a(getString(R.string.frm));
        if (!com.bytedance.ies.abmock.b.a().a(true, "enable_other_push_settings", false)) {
            this.C.a(false);
            this.u.a(false);
        } else {
            this.C.a(true);
            this.u.a(true);
            if (com.ss.android.ugc.aweme.setting.e.a.a()) {
                this.v.a(true);
                return;
            }
        }
        this.v.a(false);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.ays, viewGroup, false);
    }
}
