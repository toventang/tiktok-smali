package com.ss.android.ugc.aweme.profile.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.b;
import androidx.core.h.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.commercialize.log.al;
import com.ss.android.ugc.aweme.common.a.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.f.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.i;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.y;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Locale;

public final class c extends a {
    private View A;
    private TextView B;
    private View C;
    private Drawable D;
    private boolean E = true;
    private i F = new i();
    private View G;

    /* renamed from: a  reason: collision with root package name */
    public String f115820a;

    /* renamed from: b  reason: collision with root package name */
    public String f115821b = "";

    /* renamed from: c  reason: collision with root package name */
    public boolean f115822c = false;

    /* renamed from: d  reason: collision with root package name */
    public int f115823d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f115824e = 0;

    /* renamed from: f  reason: collision with root package name */
    private Context f115825f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f115826g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f115827h;

    /* renamed from: i  reason: collision with root package name */
    private FrameLayout f115828i;

    /* renamed from: j  reason: collision with root package name */
    private View f115829j;
    private View q;
    private TuxIconView r;
    private TuxTextView s;
    private TuxTextView t;
    private ImageView u;
    private TuxIconView v;
    private ViewGroup w;
    private View x;
    private View y;
    private TextView z;

    static {
        Covode.recordClassIndex(74714);
    }

    @Override // com.ss.android.ugc.aweme.common.a.g
    public final void c() {
        f();
    }

    @Override // com.ss.android.ugc.aweme.common.a.a
    public final int[] b() {
        return em.a(200);
    }

    private void g() {
        this.E = true;
        this.B.setVisibility(8);
        this.t.setVisibility(8);
        this.w.setVisibility(0);
        if (this.x.getVisibility() == 0) {
            this.x.setVisibility(8);
        }
    }

    public final void f() {
        if (this.f76353m != null) {
            Video video = ((Aweme) this.f76353m).getVideo();
            if (video == null || !video.isCallback()) {
                d((Aweme) this.f76353m);
            } else {
                a(video);
            }
        }
    }

    public static void a(Aweme aweme) {
        if (aweme != null) {
            boolean z2 = al.a().f74742b;
        }
    }

    private void b(Aweme aweme) {
        this.s.setVisibility(0);
        a(this.s, b.a(this.f115825f, 2131231739));
        this.s.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(aweme.getScheduleTime() * 1000)));
        this.s.setTuxFont(72);
    }

    private void c(Aweme aweme) {
        if (this.x.getVisibility() == 0) {
            this.v.setVisibility(8);
        } else if (this.r.getVisibility() == 0) {
            this.v.setVisibility(8);
        } else if (y.a(aweme)) {
            this.v.setVisibility(0);
        } else {
            this.v.setVisibility(8);
        }
    }

    private void d(Aweme aweme) {
        Bitmap.Config config;
        UrlModel a2 = this.F.a(aweme.getAid());
        if (a2 == null || a2.getUrlList().size() == 0 || TextUtils.isEmpty(a2.getUrlList().get(0))) {
            a(aweme.getVideo());
            return;
        }
        if (g.a()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = null;
        }
        a(a2, "AwemeViewHolder", config);
    }

    private void a(Video video) {
        Bitmap.Config config;
        if (video != null) {
            Bitmap.Config config2 = null;
            if (g.a()) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = null;
            }
            if (a(video, "AwemeViewHolder", config)) {
                this.o = true;
            } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty(video.getCover().getUrlList().get(0))) {
                this.n.setImageResource(R.color.f159926j);
            } else {
                UrlModel cover = video.getCover();
                if (g.a()) {
                    config2 = Bitmap.Config.ARGB_8888;
                }
                a(cover, "AwemeViewHolder", config2);
            }
        }
    }

    private void a(String str) {
        this.s.setVisibility(0);
        a(this.s, b.a(this.f115825f, 2131233428));
        this.s.setText(str);
        this.s.setTuxFont(72);
    }

    private static void a(TextView textView, Drawable drawable) {
        if (textView != null) {
            int i2 = Build.VERSION.SDK_INT;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    private void a(Aweme aweme, boolean z2, int i2) {
        if (z2 && i2 == 0 && m.a(aweme)) {
            if (!com.bytedance.common.utility.collection.b.a((Collection) aweme.getGeofencingRegions())) {
                ImageView imageView = this.u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    return;
                }
                return;
            }
            ImageView imageView2 = this.u;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
    }

    public c(View view, String str, final d dVar) {
        super(view);
        this.f115825f = view.getContext();
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.ugc.aweme.profile.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(74715);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            public final void onViewAttachedToWindow(View view) {
                if (c.this.f76353m != null && TextUtils.equals(((Aweme) c.this.f76353m).getAid(), c.this.f115821b) && !c.this.f115822c && c.this.f115824e == 0) {
                    r.a("just_watched_video_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "others_homepage").a("request_id", ((Aweme) c.this.f76353m).getRequestId()).a("group_id", ((Aweme) c.this.f76353m).getAid()).a("author_id", ((Aweme) c.this.f76353m).getAuthorUid()).a("order", c.this.f115823d + 1).f66730a);
                }
            }
        });
        this.f115820a = str;
        this.f115829j = view.findViewById(R.id.ad7);
        this.q = view.findViewById(R.id.d7o);
        this.n = (SmartImageView) view.findViewById(R.id.agf);
        this.s = (TuxTextView) view.findViewById(R.id.f4l);
        this.f115826g = (TextView) view.findViewById(R.id.f9s);
        this.f115827h = (TextView) view.findViewById(R.id.ey7);
        this.f115828i = (FrameLayout) view.findViewById(R.id.b55);
        this.r = (TuxIconView) view.findViewById(R.id.fgn);
        this.u = (ImageView) view.findViewById(R.id.fg6);
        this.v = (TuxIconView) view.findViewById(R.id.ffk);
        this.t = (TuxTextView) view.findViewById(R.id.dce);
        this.w = (ViewGroup) view.findViewById(R.id.fgh);
        this.y = view.findViewById(R.id.e9b);
        this.z = (TextView) view.findViewById(R.id.e9_);
        this.B = (TextView) view.findViewById(R.id.ehy);
        this.x = view.findViewById(R.id.ckm);
        this.G = view.findViewById(R.id.c3a);
        this.n.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.profile.a.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(74716);
            }

            public final void onClick(View view) {
                d dVar;
                ClickAgent.onClick(view);
                if (c.this.f76353m != null && (dVar = dVar) != null) {
                    dVar.a(view, (Aweme) c.this.f76353m, c.this.f115820a);
                }
            }
        });
        this.n.setAnimationListener(this.f76348l);
        this.A = view.findViewById(R.id.fft);
        this.C = view.findViewById(R.id.c4d);
    }

    private void a(Aweme aweme, boolean z2, int i2, boolean z3) {
        if (!z3 || (((!z2 || i2 != 0) && !m.a(aweme)) || aweme.getStatus().getPrivateStatus() == 0)) {
            this.r.setVisibility(8);
            return;
        }
        this.r.setVisibility(0);
        if (aweme.getStatus().getPrivateStatus() == 1) {
            this.r.setIconRes(R.raw.icon_lock_small);
        } else if (aweme.getStatus().getPrivateStatus() == 2) {
            this.r.setIconRes(R.raw.icon_two_person);
        }
    }

    public final void a(Aweme aweme, int i2, boolean z2, boolean z3, int i3, String str) {
        if (aweme != null && this.n != null) {
            this.f76353m = aweme;
            this.f115821b = str;
            this.f115822c = z3;
            this.f115823d = i2;
            this.f115824e = i3;
            g();
            if (com.ss.android.ugc.aweme.detail.transition.b.f79870a && this.f76353m != null) {
                v.a(this.n, ((Aweme) this.f76353m).getAid());
            }
            if (!TextUtils.equals(aweme.getAid(), str) || z3 || i3 != 0) {
                this.G.setVisibility(8);
            } else {
                this.G.setVisibility(0);
            }
            if (((Aweme) this.f76353m).isProhibited() && ac.h((Aweme) this.f76353m)) {
                this.t.setVisibility(0);
                this.w.setVisibility(8);
                this.x.setVisibility(0);
                this.t.setTuxFont(73);
                if (!TextUtils.isEmpty(((Aweme) this.f76353m).getCoverNotice())) {
                    this.t.setText(((Aweme) this.f76353m).getCoverNotice());
                } else {
                    n.a("notice_content_empty", "", new com.ss.android.ugc.aweme.app.f.c().a(StringSet.type, "cover_notice").a("log_id", ((Aweme) this.f76353m).getRequestId()).a("item_id", ((Aweme) this.f76353m).getAid()).a());
                }
            }
            AwemeStatistics statistics = aweme.getStatistics();
            if (aweme.getIsTop() == 1 && i3 == 0) {
                this.f115826g.setVisibility(0);
            } else {
                this.f115826g.setVisibility(8);
            }
            if (aweme.getCommerceVideoAuthInfo() == null || aweme.getCommerceVideoAuthInfo().getDarkPostStatus() != 1) {
                this.f115827h.setVisibility(8);
                this.f115828i.setVisibility(8);
            } else {
                this.f115827h.setVisibility(0);
                this.f115828i.setVisibility(0);
            }
            boolean booleanValue = SharePrefCache.inst().getIsPrivateAvailable().c().booleanValue();
            if (aweme.isScheduleVideo()) {
                b(aweme);
            } else {
                long j2 = 0;
                if (!z3 || i3 != 0) {
                    if (statistics != null) {
                        j2 = statistics.getPlayCount();
                    }
                    a(com.ss.android.ugc.aweme.i18n.b.a(j2));
                } else {
                    this.s.setVisibility(0);
                    if (statistics != null) {
                        j2 = statistics.getPlayCount();
                    }
                    String a2 = com.ss.android.ugc.aweme.i18n.b.a(j2);
                    if (this.D == null) {
                        this.D = b.a(this.f115825f, 2131233428);
                    }
                    a(this.s, this.D);
                    this.s.setText(a2);
                    this.s.setTextColor(b.c(this.f115825f, R.color.f159928l));
                    this.s.setTuxFont(72);
                }
            }
            a(aweme, z3, i3, booleanValue);
            a(aweme, z3, i3);
            c(aweme);
            if (com.ss.android.ugc.aweme.login.b.a.a(aweme)) {
                this.s.setVisibility(4);
            }
            if (z2) {
                f();
                if (!al.a().a(aweme.getAid())) {
                    al.a().b(aweme.getAid());
                    a(aweme);
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                this.n.setForeground(this.itemView.getContext().getDrawable(R.drawable.b6k));
            } else {
                com.ss.android.ugc.aweme.notification.g.a.a(this.n);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                this.n.setForeground(this.itemView.getContext().getDrawable(R.drawable.b6k));
            } else {
                com.ss.android.ugc.aweme.notification.g.a.a(this.n);
            }
            if (y.f((Aweme) this.f76353m)) {
                this.A.setVisibility(0);
            } else {
                this.A.setVisibility(8);
            }
        }
    }
}
