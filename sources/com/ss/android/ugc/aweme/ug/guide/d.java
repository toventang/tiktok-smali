package com.ss.android.ugc.aweme.ug.guide;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ClientExpManager;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.common.widget.e;
import com.ss.android.ugc.aweme.share.viewmodel.a;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.d.k;
import f.a.t;
import h.f.b.l;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class d extends com.ss.android.ugc.aweme.main.e.a.a {

    /* renamed from: m  reason: collision with root package name */
    public static final a f141895m = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.share.viewmodel.a f141896b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f141897c;

    /* renamed from: d  reason: collision with root package name */
    public final String f141898d;

    /* renamed from: e  reason: collision with root package name */
    public View f141899e;

    /* renamed from: f  reason: collision with root package name */
    public AnimationImageView f141900f;

    /* renamed from: g  reason: collision with root package name */
    public GuideView f141901g;

    /* renamed from: h  reason: collision with root package name */
    public SwipeUpGuideStrengthenLayout f141902h;

    /* renamed from: i  reason: collision with root package name */
    public final ViewGroup f141903i;

    /* renamed from: j  reason: collision with root package name */
    public final e f141904j;

    /* renamed from: k  reason: collision with root package name */
    public final String f141905k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f141906l;
    private final boolean n;

    static {
        Covode.recordClassIndex(92723);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92724);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f141909a;

        static {
            Covode.recordClassIndex(92726);
        }

        public c(d dVar) {
            this.f141909a = dVar;
        }

        public final void run() {
            this.f141909a.a();
        }
    }

    public final boolean b() {
        View view = this.f141899e;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f141907a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f141908b;

        static {
            Covode.recordClassIndex(92725);
        }

        b(View view, d dVar) {
            this.f141907a = view;
            this.f141908b = dVar;
        }

        public final void run() {
            this.f141907a.setVisibility(8);
            this.f141908b.f141900f = null;
            GuideView guideView = this.f141908b.f141901g;
            if (guideView != null) {
                guideView.f141847a.removeAllListeners();
                guideView.f141848b.removeAllListeners();
                guideView.f141847a.end();
                guideView.f141848b.end();
                PlayView playView = guideView.f141849c;
                playView.f141875m.removeAllUpdateListeners();
                playView.f141875m.end();
            }
            this.f141908b.f141901g = null;
            this.f141908b.f141896b.a("swipe_up_guide", false);
            SpecActServiceImpl.i().a(false);
        }
    }

    public final void a() {
        if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
            View view = this.f141899e;
            if (view != null) {
                view.animate().alpha(0.0f).setDuration(300).withEndAction(new b(view, this)).start();
                return;
            }
            return;
        }
        String stackTraceString = Log.getStackTraceString(new Throwable("execute UI not in main Thread"));
        l.b(stackTraceString, "");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_stack", stackTraceString);
            jSONObject.put("error_type", "UI_not_in_main");
            o.a("aweme_error_find_bug", jSONObject);
        } catch (Exception unused) {
            com.ss.android.ugc.aweme.u.b.a(stackTraceString);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.d$d  reason: collision with other inner class name */
    public static final class RunnableC3778d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f141910a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f141911b;

        static {
            Covode.recordClassIndex(92727);
        }

        public RunnableC3778d(View view, d dVar) {
            this.f141910a = view;
            this.f141911b = dVar;
        }

        public final void run() {
            this.f141911b.f141900f = (AnimationImageView) this.f141910a.findViewById(R.id.bxd);
            this.f141911b.f141901g = (GuideView) this.f141910a.findViewById(R.id.bxe);
            if (this.f141911b.f141897c) {
                GuideView guideView = this.f141911b.f141901g;
                if (guideView != null) {
                    guideView.setVisibility(0);
                }
                AnimationImageView animationImageView = this.f141911b.f141900f;
                if (animationImageView != null) {
                    animationImageView.setVisibility(8);
                }
                GuideView guideView2 = this.f141911b.f141901g;
                if (guideView2 != null) {
                    guideView2.f141847a.start();
                    guideView2.f141849c.f141875m.start();
                }
            } else {
                AnimationImageView animationImageView2 = this.f141911b.f141900f;
                if (animationImageView2 != null) {
                    animationImageView2.b(true);
                }
                AnimationImageView animationImageView3 = this.f141911b.f141900f;
                if (animationImageView3 != null) {
                    animationImageView3.setAnimation(this.f141911b.f141905k);
                }
                AnimationImageView animationImageView4 = this.f141911b.f141900f;
                if (animationImageView4 != null) {
                    animationImageView4.a();
                }
            }
            if (this.f141911b.f141906l) {
                t.b(6000, TimeUnit.MILLISECONDS).a(new k(this) {
                    /* class com.ss.android.ugc.aweme.ug.guide.d.RunnableC3778d.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ RunnableC3778d f141912a;

                    static {
                        Covode.recordClassIndex(92728);
                    }

                    {
                        this.f141912a = r1;
                    }

                    @Override // f.a.d.k
                    public final /* synthetic */ boolean a(Object obj) {
                        l.d(obj, "");
                        View view = this.f141912a.f141911b.f141899e;
                        if (view == null || view.getVisibility() != 0) {
                            return false;
                        }
                        return true;
                    }
                }).b(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f(this) {
                    /* class com.ss.android.ugc.aweme.ug.guide.d.RunnableC3778d.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ RunnableC3778d f141913a;

                    static {
                        Covode.recordClassIndex(92729);
                    }

                    {
                        this.f141913a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f141913a.f141911b.a();
                    }
                });
            }
            SpecActServiceImpl.i().a(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ViewGroup viewGroup, e eVar, String str, boolean z, boolean z2) {
        super(viewGroup);
        l.d(viewGroup, "");
        l.d(eVar, "");
        l.d(str, "");
        this.f141903i = viewGroup;
        this.f141904j = eVar;
        this.f141905k = str;
        this.f141906l = z;
        this.n = z2;
        Context context = viewGroup.getContext();
        l.b(context, "");
        this.f141896b = a.C3244a.a(context);
        this.f141897c = com.bytedance.ies.abmock.b.a().a("launch_opt_swipeup", ClientExpManager.launch_opt_swipeup()) != 1 ? false : true;
        this.f141898d = "swipeStrengthLayout";
    }
}
