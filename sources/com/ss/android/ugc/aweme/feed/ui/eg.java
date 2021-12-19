package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.u;
import com.a.b.c;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.cp.g;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r;
import com.ss.android.ugc.aweme.feed.guide.h;
import com.ss.android.ugc.aweme.feed.helper.l;
import com.ss.android.ugc.aweme.feed.helper.w;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.n.e;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.x.x;
import com.ss.android.ugc.aweme.im.service.c.k;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.share.ae;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.y;
import com.ss.android.ugc.aweme.utils.z;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public class eg extends a implements View.OnClickListener, s<ag>, e, i, j {

    /* renamed from: i  reason: collision with root package name */
    private static SharedPreferences f94687i;

    /* renamed from: a  reason: collision with root package name */
    RemoteImageView f94688a;

    /* renamed from: b  reason: collision with root package name */
    TextView f94689b;

    /* renamed from: c  reason: collision with root package name */
    View f94690c;

    /* renamed from: d  reason: collision with root package name */
    boolean f94691d;

    /* renamed from: e  reason: collision with root package name */
    boolean f94692e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f94693f;

    /* renamed from: g  reason: collision with root package name */
    private long f94694g;

    /* renamed from: h  reason: collision with root package name */
    private int f94695h;

    /* renamed from: j  reason: collision with root package name */
    private String f94696j;

    /* renamed from: k  reason: collision with root package name */
    private g f94697k;

    static {
        Covode.recordClassIndex(60088);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.feed.i.s
    public final /* bridge */ /* synthetic */ void a(ag agVar) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(6, new org.greenrobot.eventbus.g(eg.class, "onVideoPlayerEvent", com.ss.android.ugc.aweme.shortvideo.j.j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
        EventBus.a().b(this);
    }

    private g c() {
        if (this.f94697k == null) {
            this.f94697k = new g();
        }
        return this.f94697k;
    }

    private static int t() {
        return b.a().a(true, "share_guide_daily_limit", 0);
    }

    private void e() {
        if (this.V == null || !w.a((Activity) this.V.getActivity())) {
            o();
        } else {
            this.f94688a.setImageResource(2131231753);
        }
    }

    private static SharedPreferences s() {
        if (f94687i == null) {
            f94687i = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "sp_video_digg_record", 0);
        }
        return f94687i;
    }

    private void o() {
        this.f94690c.setAlpha(1.0f);
        this.f94688a.getLayoutParams().width = (int) n.b(this.R, 40.0f);
        this.f94688a.getLayoutParams().height = -1;
        this.f94688a.setImageResource(ae.a());
    }

    private boolean r() {
        User author;
        if (this.L == null || (author = this.L.getAuthor()) == null) {
            return false;
        }
        return TextUtils.equals(author.getUid(), com.ss.android.ugc.aweme.account.b.g().getCurUser().getUid());
    }

    private void v() {
        View view = this.f94690c;
        if (view != null && !this.f94692e) {
            this.f94692e = true;
            view.animate().scaleX(1.05f).scaleY(1.05f).setDuration(150).withEndAction(new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.ui.eg.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(60099);
                }

                public final void run() {
                    eg.this.f94690c.animate().scaleX(0.9f).scaleY(0.9f).setDuration(150).withEndAction(new Runnable() {
                        /* class com.ss.android.ugc.aweme.feed.ui.eg.AnonymousClass7.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(60100);
                        }

                        public final void run() {
                            ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.05f, 0.9f, 1.05f, 1, 0.5f, 1, 0.5f);
                            scaleAnimation.setDuration(600);
                            scaleAnimation.setRepeatMode(2);
                            scaleAnimation.setRepeatCount(-1);
                            eg.this.f94690c.startAnimation(scaleAnimation);
                        }
                    }).start();
                }
            }).start();
        }
    }

    private void u() {
        if (!this.f94692e && b.a().a(true, "interction_share_button_style", 0) == 0 && t() == 0 && !this.f94693f && !z.d(this.L) && !z.c(this.L) && !w.a(this.R)) {
            h.a.f93250a.b(ac.e(this.L));
            ai.b();
            this.f94691d = true;
            final Aweme aweme = this.L;
            final String str = this.M;
            p.f93149a.a(new r(false, new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.ui.eg.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(60092);
                }

                public final void run() {
                    eg.this.f94690c.animate().scaleX(0.0f).scaleY(0.0f).setDuration(300).withEndAction(new er(this, str, aweme)).start();
                }
            }));
        }
    }

    public final void b() {
        int t;
        this.f94695h++;
        if (!q() && !p() && (t = t()) != 0 && t != -2) {
            try {
                if (f.j() == this.V.getActivity()) {
                    TextUtils.equals(AwemeChangeCallBack.a((androidx.fragment.app.e) f.j()).getAid(), this.L.getAid());
                }
            } catch (Exception unused) {
            }
        }
    }

    private void d() {
        this.f94696j = ah.f123353b.d();
        boolean b2 = w.b(this.R);
        if (this.f94696j != null || !b2) {
            int a2 = b.a().a(true, "interction_share_button_style", 0);
            if (this.f94696j == null || a2 == 1) {
                o();
                return;
            }
            Drawable a3 = ah.f123353b.a((Activity) this.V.getActivity(), this.f94696j);
            if (a3 != null) {
                this.f94688a.getLayoutParams().width = (int) n.b(this.R, 36.0f);
                this.f94688a.getLayoutParams().height = (int) n.b(this.R, 36.0f);
                this.f94688a.setImageDrawable(a3);
                return;
            }
            return;
        }
        this.f94688a.getLayoutParams().width = (int) n.b(this.R, 36.0f);
        this.f94688a.getLayoutParams().height = (int) n.b(this.R, 36.0f);
        this.f94688a.setImageResource(2131231753);
    }

    private boolean p() {
        Drawable drawable;
        if (this.f94695h != 2) {
            return false;
        }
        try {
            if (f.j() != this.V.getActivity() || !TextUtils.equals(AwemeChangeCallBack.a((androidx.fragment.app.e) f.j()).getAid(), this.L.getAid())) {
                return false;
            }
            boolean b2 = w.b(this.R);
            int a2 = b.a().a(true, "interction_share_button_style", 0);
            if (a2 != 0 && (this.f94696j != null || b2)) {
                if (h.a.f93250a.a(this.L.getAid()) || y.f124429b) {
                    return true;
                }
                h.a.f93250a.b(this.L.getAid());
                this.f94688a.getLayoutParams().width = (int) n.b(this.R, 36.0f);
                this.f94688a.getLayoutParams().height = (int) n.b(this.R, 36.0f);
                if (TextUtils.isEmpty(this.f94696j) || this.V == null || this.V.getActivity() == null) {
                    drawable = this.R.getResources().getDrawable(2131231753);
                } else {
                    drawable = ah.f123353b.a((Activity) this.V.getActivity(), this.f94696j);
                }
                this.f94688a.setImageDrawable(drawable);
                if (a2 != 1 ? a2 == 2 : this.f94696j == null) {
                    v();
                    return true;
                } else if (a2 == 3) {
                    a(1.05f, 0.9f);
                    return true;
                } else if (!(a2 != 1 || this.f94696j == null || this.V == null || this.V.getActivity() == null)) {
                    a(1.05f, 0.9f);
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }

    private boolean q() {
        try {
            if (f.j() != this.V.getActivity() || !TextUtils.equals(AwemeChangeCallBack.a((androidx.fragment.app.e) f.j()).getAid(), this.L.getAid()) || !w.a(this.R) || !w.a(this.L) || h.a.f93250a.a(this.L.getAid())) {
                return false;
            }
            h.a.f93250a.b(this.L.getAid());
            int a2 = b.a().a(true, "interction_share_button_whatsapp_style", 0);
            if (!w.a((Activity) this.V.getActivity())) {
                this.f94688a.setImageResource(2131231753);
                if (a2 == 1) {
                    a(1.02f, 0.95f);
                } else if (a2 == 2) {
                    a(1.05f, 0.9f);
                }
            } else if (a2 == 1) {
                a(1.02f, 0.95f);
            } else if (a2 == 2) {
                v();
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public eg(View view) {
        super(view);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(VideoItemParams videoItemParams) {
        super.a(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.n.e
    public final String a_(boolean z) {
        return this.M;
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private void a(Aweme aweme) {
        TextView textView;
        if (com.ss.android.ugc.aweme.login.b.a.a(aweme) && (textView = this.f94689b) != null) {
            textView.setText("0");
        }
    }

    private CharSequence a(AwemeStatistics awemeStatistics) {
        String a2 = com.ss.android.ugc.aweme.i18n.b.a(awemeStatistics.getShareCount());
        if (!TextUtils.equals("0", a2) || this.R == null) {
            return a2;
        }
        return this.R.getResources().getText(R.string.haa);
    }

    @org.greenrobot.eventbus.r
    public void onVideoPlayerEvent(final com.ss.android.ugc.aweme.shortvideo.j.j jVar) {
        if (jVar.f128596c == 7 && TextUtils.equals(jVar.f128599f, this.L.getAid())) {
            p.f93149a.a(new r(false, new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.ui.eg.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(60090);
                }

                public final void run() {
                    MethodCollector.i(8286);
                    synchronized (eg.this) {
                        try {
                            eg.this.b();
                        } finally {
                            MethodCollector.o(8286);
                        }
                    }
                }
            }));
        }
    }

    private void h(Map<String, Object> map) {
        Aweme aweme;
        if (map != null) {
            aweme = (Aweme) map.get("aweme_state");
        } else {
            aweme = this.L;
        }
        if (aweme != null && aweme.getAuthor() != null && !k.c() && com.ss.android.ugc.aweme.account.b.g().isMe(aweme.getAuthor().getUid())) {
            this.f94688a.setImageResource(2131233138);
        } else if (w.a(this.R)) {
            e();
        } else if (b.a().a(true, "interction_share_button_style", 0) != 0) {
            d();
        } else {
            try {
                o();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void c(Map<String, Object> map) {
        if (this.f94692e) {
            this.f94692e = false;
            p.f93149a.a(new r(false, new ei(this, map)));
        }
        if (this.f94691d) {
            this.f94691d = false;
            p.f93149a.a(new r(false, new en(this, map)));
        }
        if (this.f94693f) {
            this.f94693f = false;
            p.f93149a.a(new r(false, new eo(this, map)));
        }
    }

    /* renamed from: d */
    public final void g(Map<String, Object> map) {
        Animation animation = this.f94690c.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        this.f94690c.clearAnimation();
        if (com.ss.android.ugc.aweme.aq.a.a.a()) {
            a(map);
        } else if (w.a(this.R)) {
            e();
        } else if (b.a().a(true, "interction_share_button_style", 0) != 0) {
            d();
        } else {
            o();
        }
        this.f94690c.setScaleX(1.0f);
        this.f94690c.setScaleY(1.0f);
        i(map);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final com.ss.android.ugc.aweme.arch.widgets.base.b e(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        boolean z;
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = null;
        if (bVar == null) {
            return null;
        }
        super.e(bVar);
        if (bVar.f67014a.equals("video_params")) {
            if (this.L == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            bVar2 = new com.ss.android.ugc.aweme.arch.widgets.base.b("ui_state", hashMap);
            hashMap.put("aweme_state", this.L);
            hashMap.put("isInActivityState", Boolean.valueOf(com.ss.android.ugc.aweme.aq.a.a.a()));
            hashMap.put("isSelfAweme", Boolean.valueOf(r()));
            if (r() || ((!z.d(this.L) && !z.c(this.L)) || x.a(this.L, this.P))) {
                z = false;
            } else {
                z = true;
            }
            hashMap.put("share_enable_state", Boolean.valueOf(z));
        }
        return bVar2;
    }

    private void i(Map<String, Object> map) {
        Aweme aweme = (Aweme) map.get("aweme_state");
        if (aweme != null) {
            User author = aweme.getAuthor();
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics == null || author == null) {
                this.f94689b.setVisibility(8);
            } else if (TextUtils.equals(com.ss.android.ugc.aweme.account.b.g().getCurUserId(), author.getUid())) {
                this.f94689b.setVisibility(8);
            } else if (b.a().a(true, "share_button_style", 2) == 2) {
                this.f94689b.setVisibility(0);
                this.f94689b.setTextSize(1, 10.0f);
                this.f94689b.setText(R.string.haa);
            } else if (b.a().a(true, "share_button_style", 2) == 3) {
                this.f94689b.setVisibility(0);
                this.f94689b.setTextSize(1, 12.0f);
                this.f94689b.setText(a(statistics));
                c();
                g.a(this.f94689b);
            } else {
                this.f94689b.setVisibility(8);
            }
            a(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        View a2 = c.a((Activity) this.R, (int) R.layout.t6);
        this.T = a2;
        this.f94688a = (RemoteImageView) this.T.findViewById(R.id.e10);
        this.f94689b = (TextView) this.T.findViewById(R.id.e0v);
        this.f94690c = this.T.findViewById(R.id.e0s);
        this.f94688a.setOnClickListener(this);
        this.f94688a.setOnTouchListener(new com.ss.android.ugc.aweme.ai.a(0.6f));
        this.f94689b.setOnClickListener(this);
        this.f94690c.setOnClickListener(this);
        EventBus.a(EventBus.a(), this);
        g c2 = c();
        c2.f78266a = this.S;
        c2.f78267b = a2;
        c2.f78268c = this.f94690c;
        c2.f78269d = this.f94688a;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        MethodCollector.i(9423);
        if (!this.K) {
            this.K = true;
            if (this.S instanceof FrameLayout) {
                ((FrameLayout) this.S).addView(this.T);
            }
        }
        if (bVar == null) {
            MethodCollector.o(9423);
            return;
        }
        HashMap hashMap = (HashMap) bVar.a();
        if (hashMap.get("aweme_state") != null) {
            this.f94690c.setVisibility(0);
            this.f94689b.setVisibility(0);
            a((Map<String, Object>) hashMap);
            if (x.a(this.L, this.P) || !z.d(this.L) || r()) {
                this.f94690c.setAlpha(1.0f);
                this.f94690c.setEnabled(true);
            } else {
                this.f94690c.setAlpha(0.5f);
                this.f94690c.setEnabled(false);
            }
            i(hashMap);
            this.f94695h = 0;
        }
        c().c();
        MethodCollector.o(9423);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
        dataCenter.a("video_show_share_guide_animation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("video_show_share_stay_home_animation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("video_hide_share_stay_home_animation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("update_diig_view", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("video_on_pause", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("pause_share_guide_animation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("recover_share_guide_animation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("on_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("on_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("video_digg", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("video_share_click", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("show_festival_activity_icon", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("awesome_update_backup_data", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("video_show_flip_share_drawable", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void c(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        char c2;
        User author;
        boolean a2;
        if (bVar != null) {
            String str = bVar.f67014a;
            str.hashCode();
            int i2 = 3;
            switch (str.hashCode()) {
                case -1618328215:
                    if (str.equals("video_digg")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1157435412:
                    if (str.equals("video_show_share_stay_home_animation")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 245017106:
                    if (str.equals("video_show_flip_share_drawable")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 249129690:
                    if (str.equals("video_on_pause")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 281945252:
                    if (str.equals("show_festival_activity_icon")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 350216171:
                    if (str.equals("on_page_selected")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 651229933:
                    if (str.equals("awesome_update_backup_data")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 920041496:
                    if (str.equals("pause_share_guide_animation")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1346787590:
                    if (str.equals("recover_share_guide_animation")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1628582276:
                    if (str.equals("on_page_unselected")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1863388195:
                    if (str.equals("video_show_share_guide_animation")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2084107761:
                    if (str.equals("video_hide_share_stay_home_animation")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    if (((Integer) bVar.a()).intValue() == 5 && t() != 0 && t() != -2 && t() != -1) {
                        String curUserId = com.ss.android.ugc.aweme.account.b.g().getCurUserId();
                        int t = t();
                        int i3 = s().getInt("video_digg_".concat(String.valueOf(curUserId)), 0);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!DateUtils.isToday(s().getLong("video_digg_time_".concat(String.valueOf(curUserId)), 0))) {
                            SharedPreferences.Editor edit = s().edit();
                            edit.putLong("video_digg_time_".concat(String.valueOf(curUserId)), currentTimeMillis);
                            edit.putInt("video_digg_".concat(String.valueOf(curUserId)), 1);
                            edit.apply();
                            return;
                        }
                        if (t > 3) {
                            i2 = t;
                        }
                        if (i3 <= i2) {
                            SharedPreferences.Editor edit2 = s().edit();
                            edit2.putInt("video_digg_".concat(String.valueOf(curUserId)), i3 + 1);
                            edit2.apply();
                            return;
                        }
                        return;
                    }
                    return;
                case 1:
                    p.f93149a.a(new r(false, new Runnable() {
                        /* class com.ss.android.ugc.aweme.feed.ui.eg.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(60097);
                        }

                        public final void run() {
                            if (eg.this.f94690c != null && eg.this.f94688a != null) {
                                eg.this.f94690c.animate().scaleX(0.0f).scaleY(0.0f).setDuration(300).withEndAction(new es(this)).start();
                            }
                        }
                    }));
                    return;
                case 2:
                    Aweme aweme = this.L;
                    if (aweme != null && com.ss.android.ugc.aweme.aq.a.a.b(aweme) && (author = aweme.getAuthor()) != null && !z.c(aweme) && !z.d(aweme)) {
                        if (com.ss.android.ugc.aweme.account.b.g().isMe(author.getUid())) {
                            a2 = com.ss.android.ugc.aweme.aq.a.a.a(aweme);
                        } else if (!author.isSecret()) {
                            a2 = com.ss.android.ugc.aweme.aq.a.a.a(SharePrefCache.inst().getFestivalShareDonationTime().c().longValue(), System.currentTimeMillis());
                        } else {
                            return;
                        }
                        if (a2 && this.L.getAuthor() != null && !this.f94693f) {
                            com.ss.android.ugc.aweme.account.b.g().isMe(this.L.getAuthor().getUid());
                            return;
                        }
                        return;
                    }
                    return;
                case 3:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    final HashMap hashMap = new HashMap();
                    hashMap.put("isInActivityState", Boolean.valueOf(com.ss.android.ugc.aweme.aq.a.a.a()));
                    hashMap.put("isSelfAweme", Boolean.valueOf(r()));
                    hashMap.put("aweme_state", this.L);
                    p.f93149a.a(new r(false, new Runnable() {
                        /* class com.ss.android.ugc.aweme.feed.ui.eg.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(60089);
                        }

                        public final void run() {
                            eg.this.c(hashMap);
                        }
                    }));
                    return;
                case 4:
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("isInActivityState", Boolean.valueOf(com.ss.android.ugc.aweme.aq.a.a.a()));
                    hashMap2.put("isSelfAweme", Boolean.valueOf(r()));
                    p.f93149a.a(new r(false, new eh(this, hashMap2)));
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (this.f94690c != null) {
                        p.f93149a.a(new r(false, new Runnable() {
                            /* class com.ss.android.ugc.aweme.feed.ui.eg.AnonymousClass6 */

                            static {
                                Covode.recordClassIndex(60098);
                            }

                            public final void run() {
                                eg.this.f94690c.setScaleX(1.0f);
                                eg.this.f94690c.setScaleY(1.0f);
                            }
                        }));
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (bVar.a() != null) {
                        onChanged(new com.ss.android.ugc.aweme.arch.widgets.base.b("video_params", bVar.a()));
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    final HashMap hashMap3 = new HashMap();
                    hashMap3.put("isInActivityState", Boolean.valueOf(com.ss.android.ugc.aweme.aq.a.a.a()));
                    hashMap3.put("isSelfAweme", Boolean.valueOf(r()));
                    if (this.f94691d) {
                        p.f93149a.a(new r(false, new Runnable() {
                            /* class com.ss.android.ugc.aweme.feed.ui.eg.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(60091);
                            }

                            public final void run() {
                                eg.this.g(hashMap3);
                            }
                        }));
                        return;
                    }
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    if (this.f94691d) {
                        u();
                        return;
                    }
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    u();
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    p.f93149a.a(new r(false, new ep(this)));
                    return;
                default:
                    return;
            }
        }
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        this.Q.a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", this.L.getAid());
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            com.ss.android.ugc.aweme.feed.assem.share.g.a();
            com.ss.android.ugc.aweme.common.r.a("verify_precise_exp", new com.ss.android.ugc.aweme.app.f.d().a("scene", "enter_share").f66730a);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f94694g < 800) {
                this.f94694g = 0;
                return;
            }
            this.f94694g = currentTimeMillis;
            if (this.L != null) {
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.aX(this.L)) {
                    new com.bytedance.tux.g.b(view).e(R.string.ob).b();
                } else if (((this.L.isCanPlay() && !this.L.isDelete()) || x.a(this.L, this.P) || com.ss.android.ugc.aweme.login.b.a.b(this.L)) && (this.P == 1000 || x.a(this.L, this.P) || !com.ss.android.ugc.aweme.login.b.a.a(this.L))) {
                    if (y.f124429b && !k.c()) {
                        y.c(this.L);
                    }
                    this.Q.a("video_share_click", (Object) null);
                    if (this.f94691d) {
                        com.ss.android.ugc.aweme.common.r.a("share_highlight_click", new com.ss.android.ugc.aweme.app.f.d().a("group_id", ac.e(this.L)).a("author_id", ac.a(this.L)).a("show_content", ah.f123353b.b((Activity) this.R)).a("is_pop_up", 0).f66730a);
                    } else {
                        l.a();
                        l.a(this.f94688a, this.M, ac.e(this.L), ac.a(this.L));
                    }
                    SecApiImpl.a().reportData("share");
                    Map<String, Object> hashMap = new HashMap<>();
                    hashMap.put("isInActivityState", Boolean.valueOf(com.ss.android.ugc.aweme.aq.a.a.a()));
                    hashMap.put("isSelfAweme", Boolean.valueOf(r()));
                    Aweme aweme = this.L;
                    hashMap.put("aweme_state", aweme);
                    c(hashMap);
                    String str = "";
                    if (this.M == null) {
                        this.M = str;
                    }
                    boolean c2 = k.c();
                    String str2 = this.M;
                    str2.hashCode();
                    if (str2.equals("homepage_follow")) {
                        a(this.R);
                        com.ss.android.ugc.aweme.common.r.a("click_share_button", "homepage_follow", this.L.getAid(), 0);
                        com.ss.android.ugc.aweme.metrics.f f2 = new com.ss.android.ugc.aweme.metrics.f(c2).a("homepage_follow").g(this.L);
                        f2.p = (String) this.Q.b("playlist_id", str);
                        f2.f109572e = (String) this.Q.b("playlist_id_key", str);
                        f2.f109571d = (String) this.Q.b("playlist_type", str);
                        com.ss.android.ugc.aweme.metrics.f fVar = (com.ss.android.ugc.aweme.metrics.f) f2.c((String) this.Q.b("tab_name", str)).d(ac.b(this.L, this.P));
                        if (this.L.getAuthor() != null) {
                            str = this.L.getAuthor().getUid();
                        }
                        fVar.f109569b = str;
                        fVar.f109570c = this.P;
                        fVar.f();
                    } else if (str2.equals("homepage_hot")) {
                        a(this.R);
                        com.ss.android.ugc.aweme.common.r.a("click_share_button", "homepage_hot", this.L.getAid(), 0);
                        com.ss.android.ugc.aweme.metrics.f f3 = new com.ss.android.ugc.aweme.metrics.f(c2).a("homepage_hot").g(this.L);
                        f3.p = (String) this.Q.b("playlist_id", str);
                        f3.f109572e = (String) this.Q.b("playlist_id_key", str);
                        f3.f109571d = (String) this.Q.b("playlist_type", str);
                        com.ss.android.ugc.aweme.metrics.f fVar2 = (com.ss.android.ugc.aweme.metrics.f) f3.c((String) this.Q.b("tab_name", str)).d(ac.b(this.L, this.P));
                        if (this.L.getAuthor() != null) {
                            str = this.L.getAuthor().getUid();
                        }
                        fVar2.f109569b = str;
                        fVar2.v = com.ss.android.ugc.aweme.story.d.a.b(this.L);
                        fVar2.V = com.ss.android.ugc.aweme.story.b.h.a(this.L.getAuthor());
                        fVar2.u = Boolean.valueOf(com.ss.android.ugc.aweme.story.d.a.g(this.L));
                        fVar2.f109570c = this.P;
                        com.ss.android.ugc.aweme.upvote.event.c.a(fVar2, this.L, "homepage_hot");
                        fVar2.f();
                        if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.L)) {
                            com.ss.android.ugc.aweme.commercialize.g.a().u(this.R, this.L);
                        }
                    } else if (this.W == 2) {
                        a(this.R);
                        com.ss.android.ugc.aweme.common.r.a("click_share_button", this.M, this.L.getAid(), 0);
                        String searchResultId = FeedParamProvider.a(this.R).getSearchResultId();
                        if (TextUtils.isEmpty(searchResultId)) {
                            searchResultId = ac.e(this.L);
                        }
                        com.ss.android.ugc.aweme.metrics.f f4 = new com.ss.android.ugc.aweme.metrics.f(c2).a(this.M).g(this.L);
                        f4.p = (String) this.Q.b("playlist_id", str);
                        f4.f109572e = (String) this.Q.b("playlist_id_key", str);
                        f4.f109571d = (String) this.Q.b("playlist_type", str);
                        com.ss.android.ugc.aweme.metrics.f fVar3 = (com.ss.android.ugc.aweme.metrics.f) f4.c((String) this.Q.b("tab_name", str)).d(ac.b(this.L, this.P));
                        if (this.L.getAuthor() != null) {
                            str = this.L.getAuthor().getUid();
                        }
                        fVar3.f109569b = str;
                        com.ss.android.ugc.aweme.metrics.f fVar4 = (com.ss.android.ugc.aweme.metrics.f) fVar3.l(FeedParamProvider.a(this.R).getSearchId()).f(searchResultId);
                        fVar4.f109570c = this.P;
                        com.ss.android.ugc.aweme.metrics.c a2 = fVar4.a(com.ss.android.ugc.aweme.utils.w.a(aweme, "click_more_button", this.M));
                        com.ss.android.ugc.aweme.upvote.event.c.a(a2, this.L, this.M);
                        a2.f();
                    }
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.main.b.a());
                } else if (this.L.isImage()) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.R).a(R.string.cjs).a();
                } else {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.R).a(com.ss.android.ugc.aweme.login.b.a.a(this.L, R.string.har)).a();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(Map<String, Object> map) {
        if (map == null ? !(!com.ss.android.ugc.aweme.aq.a.a.a() || r()) : !(!((Boolean) map.get("isInActivityState")).booleanValue() || ((Boolean) map.get("isSelfAweme")).booleanValue())) {
            if (!w.a(this.R)) {
                h(map);
                return;
            }
        }
        h(map);
    }

    private void a(float f2, float f3) {
        View view = this.f94690c;
        if (view != null && !this.f94692e) {
            this.f94692e = true;
            view.animate().scaleX(0.001f).scaleY(0.001f).setDuration(300).withEndAction(new eq(this, f3, f2)).start();
        }
    }
}
