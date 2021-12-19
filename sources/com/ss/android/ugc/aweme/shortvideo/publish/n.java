package com.ss.android.ugc.aweme.shortvideo.publish;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.internal.AVUIUXBugsExperimentServiceDiff;
import com.ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.property.AVPreferences;
import com.ss.android.ugc.aweme.property.cz;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.setting.br;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.publish.i;
import com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.ax;
import com.ss.android.ugc.aweme.shortvideo.ui.ay;
import com.ss.android.ugc.aweme.shortvideo.ui.bd;
import com.ss.android.ugc.aweme.shortvideo.ui.be;
import com.ss.android.ugc.aweme.shortvideo.ui.bf;
import com.ss.android.ugc.aweme.shortvideo.util.bb;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import h.z;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class n {
    public static final a x = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Context f129810a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f129811b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f129812c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f129813d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f129814e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f129815f;

    /* renamed from: g  reason: collision with root package name */
    public ax f129816g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f129817h;

    /* renamed from: i  reason: collision with root package name */
    public h.f.a.a<z> f129818i;

    /* renamed from: j  reason: collision with root package name */
    public View f129819j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f129820k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f129821l;

    /* renamed from: m  reason: collision with root package name */
    public CommonItemView f129822m;
    public final boolean n;
    public List<v> o;
    public VideoPublishEditModel p;
    public String q;
    public View r;
    public final Fragment s;
    public final boolean t;
    public final int u = 5;
    public final boolean v;
    public final boolean w;
    private int y;
    private final com.ss.android.ugc.aweme.shortvideo.g.c z;

    static {
        Covode.recordClassIndex(85212);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85213);
        }

        private a() {
        }

        public static int b() {
            if (com.ss.android.ugc.aweme.shortvideo.k.a.a() || c()) {
                return 1;
            }
            return 0;
        }

        public static boolean a() {
            if (com.ss.android.ugc.aweme.property.b.i()) {
                IAVSettingService createIAVSettingServicebyMonsterPlugin = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false);
                h.f.b.l.b(createIAVSettingServicebyMonsterPlugin, "");
                if (!createIAVSettingServicebyMonsterPlugin.getSaveAtPost()) {
                    return c();
                }
            }
            return false;
        }

        private static boolean c() {
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                h.f.b.l.b(iESSettingsProxy, "");
                Boolean silentShareConfigurable = iESSettingsProxy.getSilentShareConfigurable();
                h.f.b.l.b(silentShareConfigurable, "");
                return silentShareConfigurable.booleanValue();
            } catch (com.bytedance.ies.a unused) {
                return true;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean a() {
        CommonItemView commonItemView = this.f129822m;
        if (commonItemView != null) {
            return commonItemView.d();
        }
        return false;
    }

    public final void a(boolean z2) {
        this.f129817h = z2;
        this.f129812c = !z2;
        this.f129813d = !z2;
    }

    public final void a(LinearLayout linearLayout, List<v> list, VideoPublishEditModel videoPublishEditModel) {
        T t2;
        T t3;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t3 = null;
                    break;
                }
                t3 = it.next();
                if (t3.f129894f == w.SAVE_LOCAL) {
                    break;
                }
            }
            t2 = t3;
        } else {
            t2 = null;
        }
        if (t2 != null) {
            String string = linearLayout.getContext().getString(R.string.fg_);
            h.f.b.l.b(string, "");
            h.f.b.l.d(string, "");
            t2.f129895g = string;
            h.f.b.l.d("", "");
            t2.f129896h = "";
        }
        if (e() && t2 != null) {
            t2.f129898j = false;
            if (t2.f129891c == null && t2 != null) {
                t2.f129891c = new C3383n(linearLayout);
            }
        }
        a(linearLayout);
        CommonItemView commonItemView = this.f129822m;
        if (commonItemView != null) {
            commonItemView.setOnClickListener(new o(this, list, videoPublishEditModel));
        }
        d(videoPublishEditModel);
    }

    public final void a(LinearLayout linearLayout, VideoPublishEditModel videoPublishEditModel) {
        MethodCollector.i(13320);
        boolean z2 = true;
        int i2 = 0;
        if (videoPublishEditModel == null || !videoPublishEditModel.hasSubtitle()) {
            View a2 = com.a.a(LayoutInflater.from(linearLayout.getContext()), R.layout.af4, linearLayout, false);
            if (a2 != null) {
                this.f129822m = (CommonItemView) a2;
                if (e() || i.a.a()) {
                    CommonItemView commonItemView = this.f129822m;
                    if (commonItemView == null) {
                        h.f.b.l.b();
                    }
                    commonItemView.setAlpha(0.34f);
                }
                if (!i.a.a() || !com.ss.android.ugc.aweme.shortvideo.k.a.a()) {
                    CommonItemView commonItemView2 = this.f129822m;
                    if (commonItemView2 != null) {
                        if (e() || com.ss.android.ugc.aweme.publish.t.b() <= 0) {
                            z2 = false;
                        }
                        commonItemView2.setChecked(z2);
                    }
                    CommonItemView commonItemView3 = this.f129822m;
                    if (commonItemView3 != null) {
                        commonItemView3.setOnClickListener(new l(this, videoPublishEditModel));
                    }
                } else {
                    CommonItemView commonItemView4 = this.f129822m;
                    if (commonItemView4 != null) {
                        commonItemView4.setChecked(false);
                    }
                    CommonItemView commonItemView5 = this.f129822m;
                    if (commonItemView5 != null) {
                        commonItemView5.setOnClickListener(new k(this, videoPublishEditModel));
                    }
                }
                linearLayout.addView(this.f129822m, new LinearLayout.LayoutParams(-1, a(52.0f)));
                MethodCollector.o(13320);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
            MethodCollector.o(13320);
            throw nullPointerException;
        }
        View a3 = com.a.a(LayoutInflater.from(linearLayout.getContext()), R.layout.af3, linearLayout, false);
        if (a3 != null) {
            CommonItemView commonItemView6 = (CommonItemView) a3;
            this.f129822m = commonItemView6;
            if (commonItemView6 != null) {
                if (e() || i.a.a()) {
                    CommonItemView commonItemView7 = this.f129822m;
                    if (commonItemView7 == null) {
                        h.f.b.l.b();
                    }
                    commonItemView7.setAlpha(0.34f);
                }
                if (!i.a.a() || !com.ss.android.ugc.aweme.shortvideo.k.a.a()) {
                    if (!e()) {
                        i2 = com.ss.android.ugc.aweme.publish.t.b();
                    }
                    b(i2);
                } else {
                    b(0);
                }
                CommonItemView commonItemView8 = this.f129822m;
                if (commonItemView8 != null) {
                    commonItemView8.setOnClickListener(new j(this, linearLayout, videoPublishEditModel));
                }
            }
            linearLayout.addView(this.f129822m, new LinearLayout.LayoutParams(-1, a(52.0f)));
            MethodCollector.o(13320);
            return;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
        MethodCollector.o(13320);
        throw nullPointerException2;
    }

    public final void a(VideoPublishEditModel videoPublishEditModel) {
        CommonItemView commonItemView = this.f129822m;
        if (commonItemView != null) {
            int i2 = !commonItemView.d();
            androidx.fragment.app.e requireActivity = this.s.requireActivity();
            h.f.b.l.b(requireActivity, "");
            bd.a(requireActivity, i2, videoPublishEditModel, "CheckDownload", new t(commonItemView));
        }
    }

    public final void a(Fragment fragment, VideoPublishEditModel videoPublishEditModel) {
        h.f.b.l.d(fragment, "");
        androidx.fragment.app.e activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        if (com.ss.android.ugc.aweme.shortvideo.k.c.a()) {
            bf bfVar = new bf(fragment, com.ss.android.ugc.aweme.publish.t.b(), i.a.a(), this.f129821l);
            int i2 = bfVar.f131482b;
            boolean z2 = bfVar.f131483c;
            boolean z3 = bfVar.f131484d;
            Bundle bundle = new Bundle();
            bundle.putInt("save_option", i2);
            bundle.putBoolean("mute_download", z2);
            bundle.putBoolean("download_grayTag", z3);
            be beVar = new be();
            beVar.setArguments(bundle);
            new a.C1112a().a(beVar).a(true).f45299a.show(bfVar.f131481a.getChildFragmentManager(), "SaveLocalWithCaptionSheet");
            return;
        }
        h.f.b.l.b(activity, "");
        int b2 = com.ss.android.ugc.aweme.publish.t.b();
        boolean a2 = i.a.a();
        boolean z4 = this.f129821l;
        h.f.b.l.d(activity, "");
        SelectSaveLocalOptionActivity.f131143d = videoPublishEditModel;
        Intent intent = new Intent(activity, SelectSaveLocalOptionActivity.class);
        intent.putExtra("extra_save_option", b2);
        intent.putExtra("mute_download", a2);
        intent.putExtra("download_gray_tag", z4);
        activity.startActivityForResult(intent, 7);
        if (!SettingsManager.a().a("enable_high_quality_video", false)) {
            activity.overridePendingTransition(R.anim.p, R.anim.o);
        }
    }

    public final SelectSaveLocalOptionActivity.b b() {
        return new v(this);
    }

    public final int f() {
        if (this.f129814e) {
            return 0;
        }
        return 3;
    }

    static final class s extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ View $anchorView;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(85235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(n nVar, View view) {
            super(0);
            this.this$0 = nVar;
            this.$anchorView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$anchorView.postDelayed(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.publish.n.s.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ s f129858a;

                static {
                    Covode.recordClassIndex(85236);
                }

                {
                    this.f129858a = r1;
                }

                public final void run() {
                    String string = n.a(this.f129858a.this$0).getString(R.string.b06);
                    h.f.b.l.b(string, "");
                    com.bytedance.tux.tooltip.a.b.a a2 = ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(n.a(this.f129858a.this$0)).b(this.f129858a.$anchorView).a(com.bytedance.tux.tooltip.h.TOP)).a(string);
                    a2.f45511a.f45536f = -70;
                    a2.f45511a.f45537g = 20;
                    final com.bytedance.tux.tooltip.a d2 = a2.c(-70).a(3000L).d();
                    d2.a(true, new View.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.shortvideo.publish.n.s.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(85237);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            d2.dismiss();
                        }
                    });
                    this.f129858a.$anchorView.post(new Runnable() {
                        /* class com.ss.android.ugc.aweme.shortvideo.publish.n.s.AnonymousClass1.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(85238);
                        }

                        public final void run() {
                            d2.a();
                        }
                    });
                    VideoPublishEditModel videoPublishEditModel = this.f129858a.this$0.p;
                    if (videoPublishEditModel != null) {
                        com.ss.android.ugc.aweme.common.r.a("video_privacy_settings_toast_show", new com.ss.android.ugc.tools.f.b().a("creation_id", videoPublishEditModel.creationId).a("enter_from", "video_post_page").a("shoot_way", videoPublishEditModel.mShootWay).a("content_source", videoPublishEditModel.getAvetParameter().getContentSource()).a("content_type", bl.a(videoPublishEditModel)).f149193a);
                    }
                }
            }, 200);
            return z.f158842a;
        }
    }

    public static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final h f129831a = new h();

        static {
            Covode.recordClassIndex(85220);
        }

        h() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.port.in.z zVar = com.ss.android.ugc.aweme.port.in.c.u;
            return zVar.a(zVar.c(), com.ss.android.ugc.aweme.port.in.c.u.d());
        }
    }

    public static final class u implements i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.b f129861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Dialog f129862b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f129863c;

        static {
            Covode.recordClassIndex(85240);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.i.b
        public final void a() {
            this.f129861a.a();
            this.f129862b.dismiss();
            i.a.a("", this.f129863c, "video_post_page", "download_with_publish", "download");
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.i.b
        public final void b() {
            this.f129861a.b();
            this.f129862b.dismiss();
            i.a.a("", this.f129863c, "video_post_page", "download_with_publish", "cancel");
        }

        u(i.b bVar, Dialog dialog, String str) {
            this.f129861a = bVar;
            this.f129862b = dialog;
            this.f129863c = str;
        }
    }

    public static boolean e() {
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (cVar == null || !cVar.isPreventDownload()) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        int a2 = com.ss.android.ugc.aweme.property.ax.a();
        if (!cz.a()) {
            return false;
        }
        if ((a2 == 2 || a2 == 1) && !this.w && !this.v) {
            return true;
        }
        return false;
    }

    public static final class o extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f129842a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f129843b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f129844c;

        static {
            Covode.recordClassIndex(85229);
        }

        static final class a implements i.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o f129845a;

            static {
                Covode.recordClassIndex(85230);
            }

            a(o oVar) {
                this.f129845a = oVar;
            }

            @Override // androidx.fragment.app.i.c
            public final void a() {
                Object obj;
                List list = this.f129845a.f129843b;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((v) obj).f129894f == w.DOWNLOAD) {
                            break;
                        }
                    }
                    v vVar = (v) obj;
                    if (vVar != null) {
                        this.f129845a.f129842a.f129814e = vVar.f129898j;
                    }
                }
                this.f129845a.f129842a.f129815f = true;
            }
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            androidx.fragment.app.i supportFragmentManager;
            n.c();
            if (this.f129842a.f129816g == null) {
                List list = this.f129843b;
                if (list != null) {
                    n nVar = this.f129842a;
                    VideoPublishEditModel videoPublishEditModel = this.f129844c;
                    int a2 = com.ss.android.ugc.aweme.property.ax.a();
                    if (!com.ss.android.ugc.aweme.port.in.c.u.a() && cz.a() && ((a2 == 2 || a2 == 1) && t.a())) {
                        w wVar = w.DOWNLOAD;
                        String string = nVar.s.getString(R.string.sx);
                        h.f.b.l.b(string, "");
                        v vVar = new v(wVar, string, "", 2131233493, nVar.f129814e, new d(videoPublishEditModel));
                        if (!t.f129886a && !nVar.f129814e) {
                            vVar.f129891c = e.f129823a;
                        }
                        list.add(vVar);
                    }
                }
                n nVar2 = this.f129842a;
                nVar2.f129816g = nVar2.a(nVar2.w, this.f129844c);
                androidx.fragment.app.e activity = this.f129842a.s.getActivity();
                if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
                    supportFragmentManager.a(new a(this));
                }
            }
            CommonItemView commonItemView = this.f129842a.f129822m;
            if (commonItemView != null) {
                commonItemView.setRightText(this.f129842a.q);
            }
            if (this.f129842a.w) {
                Keva.getRepo("sponsored_video_keva").storeBoolean("sponsored", true);
                CommonItemView commonItemView2 = this.f129842a.f129822m;
                if (commonItemView2 != null) {
                    commonItemView2.c();
                }
            }
            this.f129842a.d();
            if (com.ss.android.ugc.aweme.shortvideo.k.c.a()) {
                n.b(this.f129844c);
            }
        }

        o(n nVar, List list, VideoPublishEditModel videoPublishEditModel) {
            this.f129842a = nVar;
            this.f129843b = list;
            this.f129844c = videoPublishEditModel;
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(85214);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            View view;
            MethodCollector.i(11313);
            n nVar = this.this$0;
            if (com.ss.android.ugc.aweme.shortvideo.k.c.a() && (view = nVar.f129819j) != null) {
                view.setVisibility(0);
                Context context = nVar.f129810a;
                if (context == null) {
                    h.f.b.l.a("mContext");
                }
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.anim.bn);
                if (loadAnimator != null) {
                    AnimatorSet animatorSet = (AnimatorSet) loadAnimator;
                    animatorSet.setTarget(view);
                    animatorSet.start();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.animation.AnimatorSet");
                    MethodCollector.o(11313);
                    throw nullPointerException;
                }
            }
            z zVar = z.f158842a;
            MethodCollector.o(11313);
            return zVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ TextView $anchorView;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(85226);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(n nVar, TextView textView) {
            super(0);
            this.this$0 = nVar;
            this.$anchorView = textView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            boolean a2 = AVUIUXBugsExperimentServiceDiff.b().a();
            String string = this.this$0.s.requireActivity().getString(R.string.bs);
            h.f.b.l.b(string, "");
            com.bytedance.tux.tooltip.a.b.a a3 = ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(n.a(this.this$0)).b(this.$anchorView).a(com.bytedance.tux.tooltip.h.BOTTOM).a(true).a(true, (View.OnClickListener) null)).a(string);
            if (a2) {
                a3.b(-80);
                a3.c(-100);
            } else {
                a3.c(-50);
            }
            final com.bytedance.tux.tooltip.a d2 = a3.d();
            CommonItemView commonItemView = this.this$0.f129822m;
            if (commonItemView != null) {
                commonItemView.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.shortvideo.publish.n.m.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(85227);
                    }

                    public final void run() {
                        d2.a();
                    }
                });
            }
            return z.f158842a;
        }
    }

    public static void c() {
        int i2;
        if (com.ss.android.ugc.aweme.shortvideo.k.d.a() && (i2 = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("click_advanced_settings_times", 0)) < 3) {
            Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt("click_advanced_settings_times", i2 + 1);
        }
    }

    private void h() {
        boolean z2;
        String str;
        bj.a("PublishEnhancement -> clickAdvancedSettingsTimes = " + com.ss.android.ugc.aweme.publish.t.c());
        if (com.ss.android.ugc.aweme.publish.t.c() < 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean a2 = SettingsManager.a().a("enable_high_quality_video", false);
        if (!z2 || !a2) {
            str = null;
        } else {
            Context context = this.f129810a;
            if (context == null) {
                h.f.b.l.a("mContext");
            }
            str = context.getString(R.string.f0n);
        }
        CommonItemView commonItemView = this.f129822m;
        if (commonItemView != null) {
            commonItemView.setDesc(str);
        }
        CommonItemView commonItemView2 = this.f129822m;
        if (commonItemView2 != null) {
            commonItemView2.c();
        }
    }

    public final void d() {
        IBinder iBinder;
        androidx.fragment.app.i iVar;
        View currentFocus;
        Context context = this.f129810a;
        if (context == null) {
            h.f.b.l.a("mContext");
        }
        Object a2 = a(context, "input_method");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) a2;
        View view = this.s.getView();
        if (view != null) {
            iBinder = view.getWindowToken();
        } else {
            iBinder = null;
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 2);
        androidx.fragment.app.e activity = this.s.getActivity();
        if (!(activity == null || (currentFocus = activity.getCurrentFocus()) == null)) {
            currentFocus.clearFocus();
        }
        ax axVar = this.f129816g;
        if (axVar != null) {
            androidx.fragment.app.e activity2 = this.s.getActivity();
            if (activity2 != null) {
                iVar = activity2.getSupportFragmentManager();
            } else {
                iVar = null;
            }
            if (!axVar.isAdded() && iVar != null && iVar.a("publish_setting") == null && iVar != null) {
                iVar.a().a(R.anim.w, R.anim.x, R.anim.o, R.anim.x).a(R.id.dqk, axVar, "publish_setting").a((String) null).b();
            }
        }
    }

    public static final class v implements SelectSaveLocalOptionActivity.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f129864a;

        static {
            Covode.recordClassIndex(85241);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity.b
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity.b
        public final void b() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        v(n nVar) {
            this.f129864a = nVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity.b
        public final void a(int i2) {
            this.f129864a.f129821l = false;
            this.f129864a.a(i2);
        }
    }

    public static final /* synthetic */ Context a(n nVar) {
        Context context = nVar.f129810a;
        if (context == null) {
            h.f.b.l.a("mContext");
        }
        return context;
    }

    private static boolean c(VideoPublishEditModel videoPublishEditModel) {
        com.ss.android.ugc.aweme.shortvideo.c cVar;
        if ((videoPublishEditModel == null || !videoPublishEditModel.hasOriginalSound()) && (cVar = cr.a().f125295a) != null && !cVar.isCommerceMusic()) {
            return true;
        }
        return false;
    }

    public final int a(float f2) {
        return (int) com.bytedance.common.utility.n.b(this.s.getContext(), f2);
    }

    public static final class c extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.setting.serverpush.a.f, z> {
        final /* synthetic */ j $commentSettingHolder;
        final /* synthetic */ j $reactDuetSettingHolder;
        final /* synthetic */ j $stitchSettingHolder;

        static {
            Covode.recordClassIndex(85215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(j jVar, j jVar2, j jVar3) {
            super(1);
            this.$reactDuetSettingHolder = jVar;
            this.$stitchSettingHolder = jVar2;
            this.$commentSettingHolder = jVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.setting.serverpush.a.f fVar) {
            boolean z;
            boolean z2;
            com.ss.android.ugc.aweme.setting.serverpush.a.f fVar2 = fVar;
            h.f.b.l.d(fVar2, "");
            j jVar = this.$reactDuetSettingHolder;
            boolean z3 = true;
            if (fVar2.s == 3) {
                z = true;
            } else {
                z = false;
            }
            jVar.a(z);
            j jVar2 = this.$stitchSettingHolder;
            if (fVar2.u == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            jVar2.a(z2);
            j jVar3 = this.$commentSettingHolder;
            if (fVar2.r != 3) {
                z3 = false;
            }
            jVar3.a(z3);
            return z.f158842a;
        }
    }

    public static final class i<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f129832a;

        static {
            Covode.recordClassIndex(85221);
        }

        public i(n nVar) {
            this.f129832a = nVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.b(iVar, "");
            com.ss.android.ugc.aweme.account.model.a aVar = (com.ss.android.ugc.aweme.account.model.a) iVar.d();
            if (aVar != null) {
                if (this.f129832a.f129814e && (!aVar.j() || !aVar.k())) {
                    this.f129832a.f129814e = false;
                }
                t.f129886a = aVar.j();
            }
            return z.f158842a;
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f129833a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinearLayout f129834b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f129835c;

        static {
            Covode.recordClassIndex(85222);
        }

        j(n nVar, LinearLayout linearLayout, VideoPublishEditModel videoPublishEditModel) {
            this.f129833a = nVar;
            this.f129834b = linearLayout;
            this.f129835c = videoPublishEditModel;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            if (i.a.a() || !n.e() || !com.ss.android.ugc.aweme.shortvideo.k.a.a()) {
                n nVar = this.f129833a;
                nVar.a(nVar.s, this.f129835c);
                return;
            }
            h.f.b.l.b(view, "");
            new com.bytedance.tux.g.b(view).a(this.f129834b.getContext().getString(R.string.fge)).b();
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f129839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f129840b;

        static {
            Covode.recordClassIndex(85225);
        }

        l(n nVar, VideoPublishEditModel videoPublishEditModel) {
            this.f129839a = nVar;
            this.f129840b = videoPublishEditModel;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            if (n.e()) {
                h.f.b.l.b(view, "");
                new com.bytedance.tux.g.b(view).e(R.string.fge).b();
                return;
            }
            this.f129839a.a(this.f129840b);
        }
    }

    private final void b(int i2) {
        String string;
        this.y = i2;
        CommonItemView commonItemView = this.f129822m;
        if (commonItemView != null) {
            if (i2 == 1) {
                Context context = this.f129810a;
                if (context == null) {
                    h.f.b.l.a("mContext");
                }
                string = context.getString(R.string.a_8);
            } else if (i2 != 2) {
                Context context2 = this.f129810a;
                if (context2 == null) {
                    h.f.b.l.a("mContext");
                }
                string = context2.getString(R.string.dlu);
            } else {
                Context context3 = this.f129810a;
                if (context3 == null) {
                    h.f.b.l.a("mContext");
                }
                string = context3.getString(R.string.a_7);
            }
            commonItemView.setRightText(string);
        }
    }

    public static int c(CommonSettingItemStatus commonSettingItemStatus) {
        h.f.b.l.d(commonSettingItemStatus, "");
        if (!CrossLanguageUserExperiment.c().a()) {
            return 0;
        }
        if (h.f.b.l.a((Object) commonSettingItemStatus._checked.getValue(), (Object) true)) {
            return 1;
        }
        return -1;
    }

    public final int a(CommonSettingItemStatus commonSettingItemStatus) {
        h.f.b.l.d(commonSettingItemStatus, "");
        if (cz.a()) {
            int a2 = com.ss.android.ugc.aweme.property.ax.a();
            if (a2 == 1 || a2 == 2) {
                if (this.f129811b) {
                    return 0;
                }
                return 3;
            } else if (h.f.b.l.a((Object) commonSettingItemStatus._checked.getValue(), (Object) true)) {
                return 0;
            } else {
                return 3;
            }
        } else if (h.f.b.l.a((Object) commonSettingItemStatus._checked.getValue(), (Object) true)) {
            return 0;
        } else {
            return 3;
        }
    }

    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseShortVideoContext f129828a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommonSettingItemStatus f129829b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HashMap f129830c;

        static {
            Covode.recordClassIndex(85219);
        }

        public g(BaseShortVideoContext baseShortVideoContext, CommonSettingItemStatus commonSettingItemStatus, HashMap hashMap) {
            this.f129828a = baseShortVideoContext;
            this.f129829b = commonSettingItemStatus;
            this.f129830c = hashMap;
        }

        public final void onClick(View view) {
            int i2;
            String str;
            ClickAgent.onClick(view);
            this.f129829b._checked.setValue(Boolean.valueOf(!h.f.b.l.a((Object) this.f129829b._checked.getValue(), (Object) true)));
            if (h.f.b.l.a((Object) this.f129829b._checked.getValue(), (Object) true)) {
                i2 = 0;
            } else {
                i2 = 3;
            }
            if (h.a.i.a(new Integer[]{0, 3}, Integer.valueOf(i2))) {
                com.ss.android.ugc.aweme.cs.g.b.f79063c = i2;
                com.ss.android.ugc.aweme.cs.g.b.f79062b.storeInt("privacy_setting_comment", i2);
            }
            HashMap hashMap = this.f129830c;
            if (hashMap != null) {
                if (h.f.b.l.a((Object) this.f129829b._checked.getValue(), (Object) true)) {
                    str = "off";
                } else {
                    str = "on";
                }
                hashMap.put("to_status", str);
                com.ss.android.ugc.aweme.common.r.a("disable_comment", this.f129830c);
            }
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f129836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f129837b;

        static {
            Covode.recordClassIndex(85223);
        }

        k(n nVar, VideoPublishEditModel videoPublishEditModel) {
            this.f129836a = nVar;
            this.f129837b = videoPublishEditModel;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            if (com.ss.android.ugc.aweme.publish.t.b() == 0) {
                n nVar = this.f129836a;
                AnonymousClass1 r4 = new i.b(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.publish.n.k.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ k f129838a;

                    static {
                        Covode.recordClassIndex(85224);
                    }

                    @Override // com.ss.android.ugc.aweme.shortvideo.publish.i.b
                    public final void b() {
                    }

                    @Override // com.ss.android.ugc.aweme.shortvideo.publish.i.b
                    public final void a() {
                        this.f129838a.f129836a.f129821l = false;
                        CommonItemView commonItemView = this.f129838a.f129836a.f129822m;
                        if (commonItemView == null) {
                            h.f.b.l.b();
                        }
                        commonItemView.setAlpha(1.0f);
                        this.f129838a.f129836a.a(this.f129838a.f129837b);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f129838a = r1;
                    }
                };
                com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.c.u.e();
                String str = "";
                if (!(e2 == null || e2.c() == null)) {
                    String c2 = e2.c();
                    h.f.b.l.b(c2, str);
                    str = c2;
                }
                i iVar = new i();
                Context context = nVar.f129810a;
                if (context == null) {
                    h.f.b.l.a("mContext");
                }
                Dialog a2 = iVar.a(context);
                if (a2 != null) {
                    iVar.f129786a = new u(r4, a2, str);
                    a2.show();
                    return;
                }
                return;
            }
            this.f129836a.a(this.f129837b);
        }
    }

    public static final class p extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f129846a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f129847b;

        static {
            Covode.recordClassIndex(85231);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            n.c();
            if (this.f129846a.f129816g == null) {
                n nVar = this.f129846a;
                nVar.f129816g = nVar.a(nVar.w, this.f129847b);
            }
            CommonItemView commonItemView = this.f129846a.f129822m;
            if (commonItemView != null) {
                commonItemView.setRightText(this.f129846a.q);
            }
            if (this.f129846a.w) {
                Keva.getRepo("sponsored_video_keva").storeBoolean("sponsored", true);
                CommonItemView commonItemView2 = this.f129846a.f129822m;
                if (commonItemView2 != null) {
                    commonItemView2.c();
                }
            }
            this.f129846a.d();
            if (com.ss.android.ugc.aweme.shortvideo.k.c.a()) {
                n.b(this.f129847b);
            }
        }

        p(n nVar, VideoPublishEditModel videoPublishEditModel) {
            this.f129846a = nVar;
            this.f129847b = videoPublishEditModel;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ h.f.a.a $clickListener;
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(85242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(n nVar, h.f.a.a aVar) {
            super(1);
            this.this$0 = nVar;
            this.$clickListener = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            String string = n.a(this.this$0).getResources().getString(R.string.bee);
            h.f.b.l.b(string, "");
            bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.publish.n.w.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ w f129865a;

                static {
                    Covode.recordClassIndex(85243);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f129865a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    h.f.a.a<z> aVar2 = this.f129865a.this$0.f129818i;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.b(this.f129865a.this$0.p);
                    this.f129865a.$clickListener.invoke();
                    return z.f158842a;
                }
            });
            String string2 = n.a(this.this$0).getResources().getString(R.string.be9);
            h.f.b.l.b(string2, "");
            bVar2.b(string2, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            bVar2.f44820b = true;
            return z.f158842a;
        }
    }

    public static void b(VideoPublishEditModel videoPublishEditModel) {
        com.ss.android.ugc.aweme.common.r.a("click_advanced_settings_entrance", new com.ss.android.ugc.tools.f.b().a("creation_id", videoPublishEditModel.creationId).a("enter_from", "video_post_page").a("shoot_way", videoPublishEditModel.mShootWay).a("content_source", videoPublishEditModel.getAvetParameter().getContentSource()).a("content_type", bl.a(videoPublishEditModel)).f149193a);
    }

    private final void d(VideoPublishEditModel videoPublishEditModel) {
        TextView tvwLeft;
        if (com.ss.android.ugc.aweme.shortvideo.k.d.a()) {
            h();
            return;
        }
        CommonItemView commonItemView = this.f129822m;
        if (commonItemView != null && (tvwLeft = commonItemView.getTvwLeft()) != null && this.v && !com.ss.android.ugc.aweme.port.in.c.f115634m.d().a().booleanValue() && dmt.av.video.m.a(videoPublishEditModel)) {
            com.ss.android.ugc.aweme.shortvideo.g.b bVar = new com.ss.android.ugc.aweme.shortvideo.g.b("high_quality_video", 1000, new m(this, tvwLeft), (byte) 0);
            com.ss.android.ugc.aweme.shortvideo.g.c cVar = this.z;
            if (cVar != null) {
                cVar.a(bVar);
            }
        }
    }

    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f129824a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f129825b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f129826c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HashMap f129827d;

        static {
            Covode.recordClassIndex(85218);
        }

        public f(n nVar, boolean z, String str, HashMap hashMap) {
            this.f129824a = nVar;
            this.f129825b = z;
            this.f129826c = str;
            this.f129827d = hashMap;
        }

        public final void onClick(View view) {
            boolean z;
            boolean z2;
            ClickAgent.onClick(view);
            Fragment fragment = this.f129824a.s;
            Intent intent = new Intent(this.f129824a.s.getContext(), PublishPrivacySettingActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("comment_item_checked", this.f129824a.f129811b);
            boolean z3 = true;
            if (!this.f129824a.f129812c || this.f129824a.f129817h) {
                z = false;
            } else {
                z = true;
            }
            bundle.putBoolean("react_duet_item_checked", z);
            if (!this.f129824a.f129813d || this.f129824a.f129817h) {
                z2 = false;
            } else {
                z2 = true;
            }
            bundle.putBoolean("stitch_item_checked", z2);
            bundle.putBoolean("download_item_checked", this.f129824a.f129814e);
            if (!this.f129825b || this.f129824a.f129817h) {
                z3 = false;
            }
            bundle.putBoolean("can_react_duet", z3);
            bundle.putString("creation_id", this.f129826c);
            bundle.putSerializable("mob_data", this.f129827d);
            intent.putExtras(bundle);
            fragment.startActivityForResult(intent, this.f129824a.u);
            com.ss.android.ugc.aweme.common.r.a("click_advanced_settings", new com.ss.android.ugc.tools.f.b().a("creation_id", this.f129826c).a("enter_from", "video_post_page").f149193a);
        }
    }

    public static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f129848a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseShortVideoContext f129849b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommonSettingItemStatus f129850c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f129851d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HashMap f129852e;

        static {
            Covode.recordClassIndex(85232);
        }

        public q(n nVar, BaseShortVideoContext baseShortVideoContext, CommonSettingItemStatus commonSettingItemStatus, String str, HashMap hashMap) {
            this.f129848a = nVar;
            this.f129849b = baseShortVideoContext;
            this.f129850c = commonSettingItemStatus;
            this.f129851d = str;
            this.f129852e = hashMap;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.port.in.g.a().e().setReactDuetSettingChanged(true);
            if (h.f.b.l.a((Object) this.f129850c._checked.getValue(), (Object) true)) {
                AnonymousClass1 r5 = new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.publish.n.q.AnonymousClass1 */
                    final /* synthetic */ q this$0;

                    static {
                        Covode.recordClassIndex(85233);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        String str;
                        String str2;
                        com.ss.android.ugc.aweme.port.in.g.a().e().setReactDuetSettingCurrent(br.f122116f);
                        this.this$0.f129850c._checked.setValue(Boolean.valueOf(!h.f.b.l.a((Object) this.this$0.f129850c._checked.getValue(), (Object) true)));
                        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.this$0.f129851d).a("enter_from", "video_post_page");
                        if (h.f.b.l.a((Object) this.this$0.f129850c._checked.getValue(), (Object) true)) {
                            str = "on";
                        } else {
                            str = "off";
                        }
                        com.ss.android.ugc.tools.f.b a3 = a2.a("to_status", str);
                        HashMap hashMap = this.this$0.f129852e;
                        if (hashMap != null) {
                            str2 = (String) hashMap.get("shoot_way");
                        } else {
                            str2 = null;
                        }
                        com.ss.android.ugc.aweme.common.r.a("click_react_duet_control", a3.a("shoot_way", str2).f149193a);
                        return z.f158842a;
                    }
                };
                VideoPublishEditModel videoPublishEditModel = this.f129848a.p;
                if (videoPublishEditModel == null || com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(videoPublishEditModel.getMainBusinessContext()) == null) {
                    r5.invoke();
                    return;
                }
                n nVar = this.f129848a;
                Context context = nVar.f129810a;
                if (context == null) {
                    h.f.b.l.a("mContext");
                }
                com.bytedance.tux.dialog.b bVar = (com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).a(false);
                Context context2 = nVar.f129810a;
                if (context2 == null) {
                    h.f.b.l.a("mContext");
                }
                com.bytedance.tux.dialog.b.c.a(bVar.d(context2.getResources().getString(R.string.bes)), new w(nVar, r5)).a().b().show();
                return;
            }
            com.ss.android.ugc.aweme.port.in.g.a().e().setReactDuetSettingCurrent(br.f122115e);
            this.f129850c._checked.setValue(Boolean.valueOf(true ^ h.f.b.l.a((Object) this.f129850c._checked.getValue(), (Object) true)));
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f129851d).a("enter_from", "video_post_page");
            if (h.f.b.l.a((Object) this.f129850c._checked.getValue(), (Object) true)) {
                str = "on";
            } else {
                str = "off";
            }
            com.ss.android.ugc.tools.f.b a3 = a2.a("to_status", str);
            HashMap hashMap = this.f129852e;
            if (hashMap != null) {
                str2 = (String) hashMap.get("shoot_way");
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.common.r.a("click_react_duet_control", a3.a("shoot_way", str2).f149193a);
        }
    }

    public static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseShortVideoContext f129853a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f129854b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommonSettingItemStatus f129855c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f129856d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HashMap f129857e;

        static {
            Covode.recordClassIndex(85234);
        }

        public r(BaseShortVideoContext baseShortVideoContext, z.a aVar, CommonSettingItemStatus commonSettingItemStatus, String str, HashMap hashMap) {
            this.f129853a = baseShortVideoContext;
            this.f129854b = aVar;
            this.f129855c = commonSettingItemStatus;
            this.f129856d = str;
            this.f129857e = hashMap;
        }

        public final void onClick(View view) {
            int i2;
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            AVPreferences e2 = com.ss.android.ugc.aweme.port.in.g.a().e();
            if (h.f.b.l.a((Object) this.f129855c._checked.getValue(), (Object) true)) {
                i2 = br.f122115e;
            } else {
                i2 = br.f122116f;
            }
            e2.setStitchSettingCurrent(i2);
            this.f129855c._checked.setValue(Boolean.valueOf(!h.f.b.l.a((Object) this.f129855c._checked.getValue(), (Object) true)));
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f129856d).a("enter_from", "video_post_page");
            if (h.f.b.l.a((Object) this.f129855c._checked.getValue(), (Object) true)) {
                str = "on";
            } else {
                str = "off";
            }
            com.ss.android.ugc.tools.f.b a3 = a2.a("to_status", str);
            HashMap hashMap = this.f129857e;
            String str4 = null;
            if (hashMap != null) {
                str2 = (String) hashMap.get("content_type");
            } else {
                str2 = null;
            }
            com.ss.android.ugc.tools.f.b a4 = a3.a("content_type", str2);
            HashMap hashMap2 = this.f129857e;
            if (hashMap2 != null) {
                str3 = (String) hashMap2.get("content_source");
            } else {
                str3 = null;
            }
            com.ss.android.ugc.tools.f.b a5 = a4.a("content_source", str3);
            HashMap hashMap3 = this.f129857e;
            if (hashMap3 != null) {
                str4 = (String) hashMap3.get("shoot_way");
            }
            com.ss.android.ugc.aweme.common.r.a("click_stitch_control", a5.a("shoot_way", str4).f149193a);
        }
    }

    private final void a(LinearLayout linearLayout) {
        CommonItemView commonItemView;
        MethodCollector.i(13398);
        View a2 = com.a.a(LayoutInflater.from(linearLayout.getContext()), R.layout.ah1, linearLayout, false);
        this.f129819j = a2.findViewById(R.id.bg6);
        this.f129822m = (CommonItemView) a2.findViewById(R.id.dde);
        h.f.b.l.b(a2, "");
        com.bytedance.tux.h.i.a(a2, (Integer) 0, (Integer) 0, (Integer) 0, (Integer) 0, false, 16);
        linearLayout.addView(a2);
        if (com.ss.android.ugc.aweme.shortvideo.k.c.a()) {
            CommonItemView commonItemView2 = this.f129822m;
            if (commonItemView2 != null) {
                commonItemView2.setLeftIcon(2131232401);
            }
            CommonItemView commonItemView3 = this.f129822m;
            if (commonItemView3 != null) {
                Context context = this.f129810a;
                if (context == null) {
                    h.f.b.l.a("mContext");
                }
                commonItemView3.setLeftText(context.getString(R.string.azx));
            }
            CommonItemView commonItemView4 = this.f129822m;
            if (commonItemView4 != null) {
                commonItemView4.setRightIconRes(2131230994);
            }
        }
        if (!this.w || Keva.getRepo("sponsored_video_keva").getBoolean("sponsored", false) || (commonItemView = this.f129822m) == null) {
            MethodCollector.o(13398);
            return;
        }
        commonItemView.b();
        MethodCollector.o(13398);
    }

    public final int b(CommonSettingItemStatus commonSettingItemStatus) {
        h.f.b.l.d(commonSettingItemStatus, "");
        if (cz.a()) {
            int a2 = com.ss.android.ugc.aweme.property.ax.a();
            if (a2 == 1 || a2 == 2) {
                if (this.f129812c) {
                    return 0;
                }
                return 1;
            } else if (h.f.b.l.a((Object) commonSettingItemStatus._checked.getValue(), (Object) true)) {
                return 0;
            } else {
                return 1;
            }
        } else if (h.f.b.l.a((Object) commonSettingItemStatus._checked.getValue(), (Object) true)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void a(int i2) {
        CommonItemView commonItemView = this.f129822m;
        if (commonItemView == null) {
            h.f.b.l.b();
        }
        commonItemView.setAlpha(1.0f);
        String a2 = bb.a(i2);
        if (this.f129816g != null) {
            List<v> list = this.o;
            if (list != null) {
                for (T t2 : list) {
                    if (t2.f129894f == w.SAVE_LOCAL_OPTIONS) {
                        t2.a(a2);
                        ax axVar = this.f129816g;
                        if (axVar == null) {
                            h.f.b.l.b();
                        }
                        com.ss.android.ugc.aweme.shortvideo.ui.e eVar = axVar.f131424a;
                        if (eVar != null) {
                            eVar.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        CommonItemView commonItemView2 = this.f129822m;
        if (commonItemView2 != null) {
            commonItemView2.setRightText(a2);
        }
        b(i2);
    }

    public final void a(View view) {
        h.f.b.l.d(view, "");
        com.ss.android.ugc.aweme.shortvideo.g.b bVar = new com.ss.android.ugc.aweme.shortvideo.g.b("video_privacy_settings_item", 3000, new s(this, view), (byte) 0);
        com.ss.android.ugc.aweme.shortvideo.g.c cVar = this.z;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<View, CommonItemView, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f129823a = new e();

        static {
            Covode.recordClassIndex(85217);
        }

        e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(View view, CommonItemView commonItemView) {
            CommonItemView commonItemView2 = commonItemView;
            h.f.b.l.d(view, "");
            h.f.b.l.d(commonItemView2, "");
            new com.bytedance.tux.g.b(commonItemView2).e(R.string.bc9).b();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t extends h.f.b.m implements h.f.a.m<Boolean, Boolean, h.z> {
        final /* synthetic */ CommonItemView $this_apply;

        static {
            Covode.recordClassIndex(85239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(CommonItemView commonItemView) {
            super(2);
            this.$this_apply = commonItemView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(Boolean bool, Boolean bool2) {
            bool.booleanValue();
            this.$this_apply.setChecked(bool2.booleanValue());
            return h.z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<CommonItemView, Boolean, h.z> {
        final /* synthetic */ VideoPublishEditModel $source;

        static {
            Covode.recordClassIndex(85216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VideoPublishEditModel videoPublishEditModel) {
            super(2);
            this.$source = videoPublishEditModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(CommonItemView commonItemView, Boolean bool) {
            String str;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(commonItemView, "");
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.$source.creationId).a("enter_from", "video_post_page");
            if (booleanValue) {
                str = "on";
            } else {
                str = "off";
            }
            com.ss.android.ugc.aweme.common.r.a("click_download_control", a2.a("to_status", str).f149193a);
            return h.z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$n  reason: collision with other inner class name */
    static final class C3383n extends h.f.b.m implements h.f.a.m<View, CommonItemView, h.z> {
        final /* synthetic */ LinearLayout $parent;

        static {
            Covode.recordClassIndex(85228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3383n(LinearLayout linearLayout) {
            super(2);
            this.$parent = linearLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(View view, CommonItemView commonItemView) {
            h.f.b.l.d(view, "");
            h.f.b.l.d(commonItemView, "");
            Toast makeText = Toast.makeText(this.$parent.getContext(), this.$parent.getContext().getString(R.string.fge), 0);
            if (Build.VERSION.SDK_INT == 25) {
                ic.a(makeText);
            }
            makeText.show();
            return h.z.f158842a;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13323);
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
                    MethodCollector.o(13323);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final ax a(boolean z2, VideoPublishEditModel videoPublishEditModel) {
        if (com.ss.android.ugc.aweme.shortvideo.k.c.a()) {
            ay ayVar = new ay();
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_enable_sponsor", z2);
            bundle.putBoolean("key_general_music", c(videoPublishEditModel));
            bundle.putBoolean("key_added_to_playlist", this.f129820k);
            ayVar.setArguments(bundle);
            return ayVar;
        }
        ax axVar = new ax();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("key_enable_sponsor", z2);
        bundle2.putBoolean("key_general_music", c(videoPublishEditModel));
        axVar.setArguments(bundle2);
        return axVar;
    }

    public final void b(LinearLayout linearLayout, List<v> list, VideoPublishEditModel videoPublishEditModel) {
        a(linearLayout);
        int i2 = -1;
        if (videoPublishEditModel.hasSubtitle()) {
            if (list != null) {
                Iterator<v> it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().f129894f == w.SAVE_LOCAL_OPTIONS) {
                        i2 = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                list.remove(i2);
            }
        } else if (list != null) {
            Iterator<v> it2 = list.iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (it2.next().f129894f == w.SAVE_LOCAL) {
                    i2 = i4;
                    break;
                } else {
                    i4++;
                }
            }
            list.remove(i2);
        }
        CommonItemView commonItemView = this.f129822m;
        if (commonItemView != null) {
            commonItemView.setOnClickListener(new p(this, videoPublishEditModel));
        }
        d(videoPublishEditModel);
    }

    public n(Fragment fragment, boolean z2, boolean z3, boolean z4, com.ss.android.ugc.aweme.shortvideo.g.c cVar) {
        boolean z5;
        h.f.b.l.d(fragment, "");
        this.s = fragment;
        this.t = z2;
        this.v = z3;
        this.w = z4;
        this.z = cVar;
        this.f129811b = true;
        boolean z6 = false;
        if (com.ss.android.ugc.aweme.port.in.g.a().e().getReactDuetSettingCurrent(2) == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f129812c = z5;
        this.f129813d = com.ss.android.ugc.aweme.port.in.g.a().e().getStitchSettingCurrent(0) == 0 ? true : z6;
        this.f129814e = true;
        this.f129821l = true;
        this.n = a.a();
        this.q = "";
    }
}
