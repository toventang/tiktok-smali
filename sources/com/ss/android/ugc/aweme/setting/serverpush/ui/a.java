package com.ss.android.ugc.aweme.setting.serverpush.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.be.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.dc.d;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.aweme.setting.serverpush.b.b;
import com.ss.android.ugc.aweme.setting.serverpush.b.c;
import com.ss.android.ugc.aweme.setting.serverpush.b.j;
import com.ss.android.ugc.aweme.setting.serverpush.b.m;
import com.ss.android.ugc.aweme.setting.services.h;
import com.ss.android.ugc.aweme.setting.ui.cell.CommonItemViewCell;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.fg;
import com.ss.android.ugc.aweme.utils.fh;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends com.ss.android.ugc.aweme.base.f.a implements b, c {
    d A;
    d B;
    d C;
    d D;
    n E;
    j F;
    private boolean G;
    private List<CommonItemView> H = new ArrayList();
    private m I;
    private List<String> J;
    private JSONObject K;

    /* renamed from: a  reason: collision with root package name */
    TextView f122599a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f122600b;

    /* renamed from: c  reason: collision with root package name */
    PowerList f122601c;

    /* renamed from: d  reason: collision with root package name */
    dm f122602d;

    /* renamed from: e  reason: collision with root package name */
    n f122603e;

    /* renamed from: j  reason: collision with root package name */
    n f122604j;

    /* renamed from: k  reason: collision with root package name */
    n f122605k;

    /* renamed from: l  reason: collision with root package name */
    n f122606l;

    /* renamed from: m  reason: collision with root package name */
    n f122607m;
    n n;
    n o;
    n p;
    n q;
    n r;
    n s;
    n t;
    n u;
    n v;
    com.ss.android.ugc.aweme.setting.unit.a.a w;
    d y;
    d z;

    static {
        Covode.recordClassIndex(80450);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
    public final void av_() {
    }

    private void c() {
        this.I.a(fg.a(getContext()));
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.F.cd_();
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
    public final void cf_() {
        new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.de2).a();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.a$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f122611a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 80452(0x13a44, float:1.12737E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.setting.serverpush.b.l[] r0 = com.ss.android.ugc.aweme.setting.serverpush.b.l.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.setting.serverpush.ui.a.AnonymousClass2.f122611a = r2
                com.ss.android.ugc.aweme.setting.serverpush.b.l r0 = com.ss.android.ugc.aweme.setting.serverpush.b.l.WITH_TEXT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.setting.serverpush.ui.a.AnonymousClass2.f122611a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.setting.serverpush.b.l r0 = com.ss.android.ugc.aweme.setting.serverpush.b.l.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.serverpush.ui.a.AnonymousClass2.<clinit>():void");
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        c();
        boolean a2 = fg.a(getContext());
        this.f122605k.c(a2);
        this.f122606l.c(a2);
        this.f122607m.c(a2);
        this.n.c(a2);
        this.f122603e.c(a2);
        this.o.c(a2);
        this.p.c(a2);
        this.q.c(a2);
        this.r.c(a2);
        this.u.c(a2);
        this.w.c(a2);
        this.t.c(a2);
        j jVar = this.F;
        if (jVar != null) {
            jVar.a(new Object[0]);
        }
    }

    public static boolean a(Context context) {
        if (fg.a(context)) {
            return true;
        }
        fh.a(context, true, null, true);
        return false;
    }

    private void b(f fVar) {
        if (this.G) {
            fVar.f122570i = 0;
            fVar.f122573l = 0;
            fVar.o = 0;
        }
        a(this.f122605k, fVar.f122562a);
        a(this.f122606l, fVar.f122563b);
        a(this.f122607m, fVar.f122564c);
        a(this.n, fVar.f122565d);
        a(this.f122603e, fVar.an);
        a(this.o, fVar.f122569h);
        a(this.p, fVar.f122570i);
        a(this.q, fVar.f122571j);
        a(this.r, fVar.n);
        a(this.E, fVar.f122573l);
        a(this.u, fVar.o);
        a(this.u, fVar.p);
        a(this.t, fVar.f122574m);
        NotificationManagerServiceImpl.d().c(Integer.valueOf(fVar.f122573l));
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    public final void a(f fVar) {
        try {
            this.K = new JSONObject(dg.a().b(fVar));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        b(fVar);
        h.f122675a.a(this.K);
    }

    private static void a(n nVar, int i2) {
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        nVar.b(z2);
    }

    private void a(final n nVar, String str) {
        nVar.a((Object) str);
        nVar.a((View.OnClickListener) new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.setting.serverpush.ui.a.AnonymousClass1 */

            /* renamed from: c  reason: collision with root package name */
            private f.a.l.c f122610c;

            static {
                Covode.recordClassIndex(80451);
            }

            public final void onClick(View view) {
                String str;
                String curUserId;
                String str2;
                String str3;
                ClickAgent.onClick(view);
                if (a.this.ab_() && a.this.getContext() != null) {
                    String str4 = (String) ((com.ss.android.ugc.aweme.be.h) nVar.f79368m).f68603g;
                    String str5 = "off";
                    if (TextUtils.equals(str4, "live_inner_push")) {
                        if (((com.ss.android.ugc.aweme.be.h) nVar.f79368m).f68599c) {
                            str3 = str5;
                        } else {
                            str3 = "on";
                        }
                        com.ss.android.ugc.aweme.im.f.b(str3);
                        NotificationManagerServiceImpl.d().c(Integer.valueOf(!((com.ss.android.ugc.aweme.be.h) nVar.f79368m).f68599c ? 1 : 0));
                    } else if (TextUtils.equals(str4, "im_inner_push")) {
                        if (((com.ss.android.ugc.aweme.be.h) nVar.f79368m).f68599c) {
                            str2 = str5;
                        } else {
                            str2 = "on";
                        }
                        com.ss.android.ugc.aweme.im.f.a(str2);
                        NotificationManagerServiceImpl.d().b(Integer.valueOf(!((com.ss.android.ugc.aweme.be.h) nVar.f79368m).f68599c ? 1 : 0));
                    } else if (TextUtils.equals(str4, "im_push")) {
                        if (((com.ss.android.ugc.aweme.be.h) nVar.f79368m).f68599c) {
                            str = str5;
                        } else {
                            str = "on";
                        }
                        com.ss.android.ugc.aweme.im.f.a(str);
                        NotificationManagerServiceImpl.d().a(Integer.valueOf(!((com.ss.android.ugc.aweme.be.h) nVar.f79368m).f68599c ? 1 : 0));
                        Boolean valueOf = Boolean.valueOf(((com.ss.android.ugc.aweme.be.h) nVar.f79368m).f68599c);
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
                    } else if (!a.a(a.this.getContext())) {
                        return;
                    }
                    if (this.f122610c == null) {
                        f.a.l.c cVar = new f.a.l.c();
                        this.f122610c = cVar;
                        cVar.d(400, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f(this));
                    }
                    n nVar = nVar;
                    nVar.b(true ^ ((com.ss.android.ugc.aweme.be.h) nVar.f79368m).f68599c);
                    h.f122675a.a(str4, ((com.ss.android.ugc.aweme.be.h) nVar.f79368m).f68599c ? 1 : 0);
                    this.f122610c.onNext(nVar);
                    if (((com.ss.android.ugc.aweme.be.h) nVar.f79368m).f68599c) {
                        str5 = "on";
                    }
                    r.a("notification_switch", new com.ss.android.ugc.aweme.app.f.d().a("label", str4).a("to_status", str5).f66730a);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.f122601c = (PowerList) view.findViewById(R.id.ddp);
        this.f122604j = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.f1r), new c(this), (byte) 0));
        this.y = new d(new e(getString(R.string.f1x)));
        this.z = new d(new e(getString(R.string.f1x), false, false));
        this.f122605k = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.f1o)));
        this.f122606l = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.f1n), "item_push_comment"));
        this.f122607m = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.f1p), "item_push_follow"));
        this.n = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.f1m)));
        this.f122603e = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.f99), (View.OnClickListener) null));
        this.A = new d(new e(getString(R.string.f1y)));
        this.r = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.f1u)));
        this.s = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.acs), (View.OnClickListener) null));
        this.t = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.f2m), (View.OnClickListener) null));
        this.B = new d(new e(getString(R.string.f1z)));
        this.o = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.f1q)));
        this.p = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.f1v)));
        this.C = new d(new e(getString(R.string.f1w)));
        this.q = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.f21)));
        this.E = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.acu)));
        this.w = new com.ss.android.ugc.aweme.setting.unit.a.a(new com.ss.android.ugc.aweme.setting.ui.b.a(0, getString(R.string.eg5), new d(this), null));
        this.D = new d(new e(getString(R.string.frm)));
        this.v = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.f8f)));
        this.u = new n(new com.ss.android.ugc.aweme.be.h(getString(R.string.frn)));
        dm dmVar = new dm(this.f122601c);
        this.f122602d = dmVar;
        dmVar.f82878a.a(CommonItemViewCell.class);
        this.f122602d.a(this.f122604j);
        this.f122602d.a(this.y);
        this.f122602d.a(this.z);
        this.f122602d.a(this.f122605k);
        this.f122602d.a(this.f122606l);
        this.f122602d.a(this.f122607m);
        this.f122602d.a(this.n);
        this.f122602d.a(this.f122603e);
        this.f122602d.a(this.A);
        this.f122602d.a(this.r);
        this.f122602d.a(this.s);
        this.f122602d.a(this.t);
        this.f122602d.a(this.B);
        this.f122602d.a(this.o);
        this.f122602d.a(this.p);
        this.f122602d.a(this.C);
        this.f122602d.a(this.q);
        this.f122602d.a(this.E);
        this.f122602d.a(this.w);
        this.f122602d.a(this.D);
        this.f122602d.a(this.v);
        this.f122602d.a(this.u);
        this.f122605k.b(getString(R.string.mk));
        this.v.c(getString(R.string.f8g));
        this.f122599a = (TextView) view.findViewById(R.id.title);
        this.f122600b = (ImageView) view.findViewById(R.id.qb);
        View findViewById = view.findViewById(R.id.qb);
        if (findViewById != null) {
            findViewById.setOnClickListener(new b(this));
        }
        super.onViewCreated(view, bundle);
        this.G = TextUtils.equals(getArguments().getString("enter_from"), "policy_notice");
        this.I = new m();
        this.f122599a.setText(R.string.fnl);
        this.I.f122594a.observe(this, new e(this));
        this.q.a(false);
        this.w.a(true);
        c();
        a(this.f122605k, "digg_push");
        a(this.f122606l, "comment_push");
        a(this.f122607m, "follow_push");
        a(this.n, "mention_push");
        a(this.f122603e, "friend_upvote_push");
        a(this.o, "follow_new_video_push");
        a(this.p, "recommend_video_push");
        a(this.q, "live_push");
        a(this.r, "im_push");
        a(this.E, "live_inner_push");
        a(this.u, "other_channel");
        a(this.v, "friend_suggestions");
        a(this.t, "im_push_preview");
        this.r.a(com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.f1u));
        this.q.a(com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.f21));
        this.s.a(false);
        this.s.a(false);
        if (com.ss.android.ugc.aweme.setting.a.a.a()) {
            this.E.a(getContext().getString(R.string.ug));
            this.E.a(true);
        } else {
            this.E.a(false);
        }
        if (com.ss.android.ugc.aweme.im.service.c.h.a()) {
            this.t.a(true);
        } else {
            this.t.a(false);
        }
        if (this.J == null) {
            this.J = com.ss.android.ugc.aweme.setting.services.e.f122670a.a();
        }
        List<String> list = this.J;
        if (list != null) {
            com.ss.android.ugc.aweme.setting.utils.d.a(this.f122602d, list);
            this.A.a(false);
            this.B.a(false);
            this.C.a(false);
        }
        f a2 = h.f122675a.a();
        if (a2 != null) {
            b(a2);
        }
        j jVar = new j();
        this.F = jVar;
        jVar.a_(this);
        this.F.a(new Object[0]);
        this.f122599a.setText(R.string.fra);
        this.f122604j.a(((Context) Objects.requireNonNull(getContext())).getString(R.string.fra));
        this.y.a(getString(R.string.fre));
        this.y.a(false);
        this.z.a(getString(R.string.fre));
        this.z.a(true);
        this.f122605k.a(getContext().getString(R.string.frf));
        this.f122606l.a(getContext().getString(R.string.frb));
        this.f122607m.a(getContext().getString(R.string.frd));
        this.n.a(getContext().getString(R.string.fri));
        this.A.a(getContext().getString(R.string.frj));
        if (com.ss.android.ugc.aweme.setting.serverpush.c.a.a()) {
            this.f122603e.a(true);
            this.f122603e.a(com.ss.android.ugc.aweme.setting.serverpush.c.a.b());
        } else {
            this.f122603e.a(false);
        }
        this.r.a(getContext().getString(R.string.frc));
        this.B.a(getString(R.string.frs));
        this.o.a(getContext().getString(R.string.frt));
        this.p.a(getContext().getString(R.string.fru));
        this.C.a(getString(R.string.frg));
        this.q.a(getContext().getString(R.string.frh));
        if (!com.bytedance.ies.abmock.b.a().a(true, "enable_other_push_settings", false)) {
            this.D.a(false);
            this.u.a(false);
        } else {
            this.D.a(true);
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
