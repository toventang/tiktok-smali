package com.ss.android.ugc.aweme.dsp.playpage.playview.b.a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.g.e;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.dsp.playpage.model.g;
import com.ss.android.ugc.aweme.feed.assem.digg.l;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.u.aa;
import com.ss.android.ugc.aweme.feed.u.w;
import com.ss.android.ugc.aweme.feed.x.d;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.z;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public final class b implements w, i, j {

    /* renamed from: a  reason: collision with root package name */
    public final t<l> f83789a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public final t<com.bytedance.assem.arch.extensions.a<Boolean>> f83790b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public long f83791c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f83792d;

    /* renamed from: e  reason: collision with root package name */
    private final c f83793e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.feed.x.a f83794f;

    /* renamed from: g  reason: collision with root package name */
    private final WeakReference<Context> f83795g;

    /* renamed from: h  reason: collision with root package name */
    private final c f83796h;

    /* renamed from: i  reason: collision with root package name */
    private final g f83797i;

    static {
        Covode.recordClassIndex(52267);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(234, new org.greenrobot.eventbus.g(b.class, "onDiggUpdateEvent", r.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f83798a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f83799b;

        static {
            Covode.recordClassIndex(52268);
        }

        a(b bVar, String str) {
            this.f83798a = bVar;
            this.f83799b = str;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f83798a.a(this.f83799b);
        }
    }

    private final Context b() {
        return this.f83795g.get();
    }

    public final Aweme a() {
        return this.f83796h.c().getAweme();
    }

    private final void c() {
        AwemeStatistics statistics = a().getStatistics();
        h.f.b.l.b(statistics, "");
        this.f83791c = statistics.getDiggCount();
        boolean z = true;
        if (a().getUserDigg() != 1) {
            z = false;
        }
        this.f83792d = z;
        a(false);
    }

    @org.greenrobot.eventbus.r
    public final void onDiggUpdateEvent(r rVar) {
        h.f.b.l.d(rVar, "");
        if (TextUtils.equals(rVar.f93490a, a().getAid())) {
            c();
        }
    }

    private final void b(String str) {
        if (this.f83792d) {
            this.f83791c--;
            this.f83792d = false;
            a(true);
            a(a(), str);
        } else {
            this.f83791c++;
            this.f83792d = true;
            a(true);
            b(a(), str);
        }
        Context b2 = b();
        if (b2 != null) {
            com.ss.android.ugc.aweme.feed.x.a.a(b2, b2.getString(R.string.kx), false, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.u.w
    public final void a(e<String, Integer> eVar) {
        h.f.b.l.d(eVar, "");
        ag agVar = new ag(13, eVar.f2397a);
        Bundle bundle = new Bundle();
        S s = eVar.f2398b;
        if (s == null) {
            s = -1;
        }
        h.f.b.l.b(s, "");
        bundle.putInt("user_digged", s.intValue());
        agVar.f93452c = bundle;
        com.ss.android.ugc.d.a.c.a(agVar);
    }

    @Override // com.ss.android.ugc.aweme.feed.u.w
    public final void a(Exception exc) {
        int i2;
        c();
        aa aaVar = (aa) this.f83793e.f76396h;
        boolean z = false;
        if (aaVar != null && aaVar.f93968a == 1) {
            z = true;
        }
        Context b2 = b();
        if (z) {
            i2 = R.string.b7d;
        } else {
            i2 = R.string.h48;
        }
        com.ss.android.ugc.aweme.app.api.b.a.a(b2, (Throwable) exc, i2);
    }

    public final void a(boolean z) {
        boolean z2 = true;
        if (z) {
            a(this.f83790b, new com.bytedance.assem.arch.extensions.a(true));
        }
        String a2 = a(this.f83791c, a());
        boolean z3 = this.f83792d;
        if (a().isDelete() && this.f83791c <= 0) {
            z2 = false;
        }
        a(this.f83789a, new l(a2, z3, z2));
    }

    public final boolean a(String str) {
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.base.utils.f fVar = f.a.f68431a;
        h.f.b.l.b(fVar, "");
        Activity activity = null;
        if (!fVar.c()) {
            Context b2 = b();
            if (b2 != null) {
                while (true) {
                    if (!(b2 instanceof Activity)) {
                        if (b2 instanceof ContextWrapper) {
                            b2 = ((ContextWrapper) b2).getBaseContext();
                            if (b2 == null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Activity activity2 = (Activity) b2;
                        if (activity2 != null) {
                            new com.bytedance.tux.g.b(activity2).e(R.string.de8).b();
                        }
                    }
                }
            }
            return false;
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        if (!g2.isLogin()) {
            Context b3 = b();
            if (b3 instanceof Activity) {
                activity = b3;
            }
            com.ss.android.ugc.aweme.login.c.a(activity, this.f83797i.f83747a, str, new ap().a("group_id", a().getAid()).a("log_pb", ac.c(a().getAid())).f142646a, new a(this, str));
            return false;
        } else if (com.ss.android.ugc.aweme.login.b.a.a(a()) && !a().isLike()) {
            Context b4 = b();
            if (b4 instanceof Activity) {
                new com.bytedance.tux.g.b((Activity) b4).a(com.ss.android.ugc.aweme.login.b.a.a(a(), R.string.har)).b();
            }
            return false;
        } else if (!a().isCanPlay() && !a().isLike()) {
            if (a().isImage()) {
                Context b5 = b();
                if (b5 != null) {
                    while (true) {
                        if (!(b5 instanceof Activity)) {
                            if (b5 instanceof ContextWrapper) {
                                b5 = ((ContextWrapper) b5).getBaseContext();
                                if (b5 == null) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            Activity activity3 = (Activity) b5;
                            if (activity3 != null) {
                                new com.bytedance.tux.g.b(activity3).e(R.string.cjs).b();
                            }
                        }
                    }
                }
            } else {
                Context b6 = b();
                if (b6 != null) {
                    while (true) {
                        if (!(b6 instanceof Activity)) {
                            if (b6 instanceof ContextWrapper) {
                                b6 = ((ContextWrapper) b6).getBaseContext();
                                if (b6 == null) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            Activity activity4 = (Activity) b6;
                            if (activity4 != null) {
                                new com.bytedance.tux.g.b(activity4).e(R.string.har).b();
                            }
                        }
                    }
                }
            }
            return false;
        } else if (a().isDelete() && !a().isLike()) {
            Context b7 = b();
            if (b7 != null) {
                while (true) {
                    if (!(b7 instanceof Activity)) {
                        if (b7 instanceof ContextWrapper) {
                            b7 = ((ContextWrapper) b7).getBaseContext();
                            if (b7 == null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Activity activity5 = (Activity) b7;
                        if (activity5 != null) {
                            new com.bytedance.tux.g.b(activity5).e(R.string.har).b();
                        }
                    }
                }
            }
            return false;
        } else if (a().getVideoControl() != null && a().getVideoControl().timerStatus == 0) {
            return false;
        } else {
            if (a().isProhibited()) {
                Context b8 = b();
                if (b8 != null) {
                    while (true) {
                        if (!(b8 instanceof Activity)) {
                            if (b8 instanceof ContextWrapper) {
                                b8 = ((ContextWrapper) b8).getBaseContext();
                                if (b8 == null) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            Activity activity6 = (Activity) b8;
                            if (activity6 != null) {
                                new com.bytedance.tux.g.b(activity6).e(R.string.cw6).b();
                            }
                        }
                    }
                }
                return false;
            } else if (m.a(a()) && z.d(a()) && (b() instanceof androidx.fragment.app.e)) {
                Context b9 = b();
                Objects.requireNonNull(b9, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                new com.bytedance.tux.g.b((androidx.fragment.app.e) b9).e(R.string.evj).b();
                return false;
            } else if (a().isLike() || !z.c(a()) || !z.a(a())) {
                b(str);
                return true;
            } else {
                Context b10 = b();
                if (b10 != null) {
                    while (true) {
                        if (!(b10 instanceof Activity)) {
                            if (b10 instanceof ContextWrapper) {
                                b10 = ((ContextWrapper) b10).getBaseContext();
                                if (b10 == null) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            Activity activity7 = (Activity) b10;
                            if (activity7 != null) {
                                new com.bytedance.tux.g.b(activity7).e(R.string.hfj).b();
                            }
                        }
                    }
                }
                return false;
            }
        }
    }

    private static String a(long j2, Aweme aweme) {
        if (com.ss.android.ugc.aweme.login.b.a.a(aweme)) {
            return "0";
        }
        String a2 = com.ss.android.ugc.aweme.i18n.b.a(j2);
        h.f.b.l.b(a2, "");
        return a2;
    }

    private static <T> void a(t<T> tVar, T t) {
        if (h.f.b.l.a(Looper.getMainLooper(), Looper.myLooper())) {
            tVar.setValue(t);
        } else {
            tVar.postValue(t);
        }
    }

    private final void b(Aweme aweme, String str) {
        if (aweme.getAwemeType() != 34) {
            com.ss.android.ugc.aweme.dsp.common.b.a.a(this.f83796h.d(), this.f83797i.f83747a, str);
            String aid = aweme.getAid();
            h.f.b.l.b(aid, "");
            a(aid, 1, aweme);
        }
    }

    private final void a(Aweme aweme, String str) {
        if (aweme.getAwemeType() != 34) {
            com.ss.android.ugc.aweme.dsp.common.b.a.b(this.f83796h.d(), this.f83797i.f83747a, str);
            String aid = aweme.getAid();
            h.f.b.l.b(aid, "");
            a(aid, 0, aweme);
        }
    }

    public b(Context context, c cVar, g gVar) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(gVar, "");
        this.f83796h = cVar;
        this.f83797i = gVar;
        c cVar2 = new c();
        this.f83793e = cVar2;
        this.f83794f = new com.ss.android.ugc.aweme.feed.x.a();
        this.f83795g = new WeakReference<>(context);
        cVar2.a(new aa());
        cVar2.a_(this);
        c();
        cg.a(this);
    }

    private final void a(String str, int i2, Aweme aweme) {
        String str2;
        String str3;
        Long creativeId;
        Long adId;
        HashMap hashMap = new HashMap();
        hashMap.put("aweme_id", str);
        hashMap.put(StringSet.type, String.valueOf(i2));
        hashMap.put("channel_id", String.valueOf(com.ss.android.ugc.aweme.app.c.c.a(this.f83797i.f83747a)));
        String str4 = null;
        if (aweme.isAd()) {
            Context b2 = b();
            if (b2 != null) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    str2 = awemeRawAd.getLogExtra();
                } else {
                    str2 = null;
                }
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 == null || (adId = awemeRawAd2.getAdId()) == null) {
                    str3 = null;
                } else {
                    str3 = String.valueOf(adId.longValue());
                }
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (!(awemeRawAd3 == null || (creativeId = awemeRawAd3.getCreativeId()) == null)) {
                    str4 = String.valueOf(creativeId.longValue());
                }
                d.a(b2, str2, str3, str4, hashMap);
            }
        } else {
            d.a(this.f83797i.f83747a, null, hashMap);
        }
        this.f83793e.a(hashMap);
    }
}
