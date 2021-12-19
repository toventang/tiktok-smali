package com.ss.android.ugc.aweme.profile.effect;

import android.view.View;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.q;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.feed.x.v;
import com.ss.android.ugc.aweme.metrics.al;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.ss.android.ugc.aweme.utils.ho;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.h;
import h.z;

public final class EffectProfileViewHolder extends JediSimpleViewHolder<g> implements au {

    /* renamed from: f  reason: collision with root package name */
    public final boolean f116281f;

    /* renamed from: g  reason: collision with root package name */
    private final String f116282g = "EffectProfileViewHolder";

    /* renamed from: j  reason: collision with root package name */
    private final h f116283j;

    static {
        Covode.recordClassIndex(75064);
    }

    public final EffectProfileListViewModel m() {
        return (EffectProfileListViewModel) this.f116283j.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<EffectProfileListViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(75065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_profile_effect_EffectProfileViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.b.e, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void aq_() {
        String str;
        int i2;
        super.aq_();
        Aweme aweme = ((g) aI_()).relatedAweme;
        if (aweme != null) {
            if (this.f116281f) {
                str = "personal_homepage";
                i2 = 1000;
            } else {
                str = "others_homepage";
                i2 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
            int i3 = i2 + 6;
            if (!q.a()) {
                al c2 = new al().a(str).c(aweme, i3);
                c2.q = "effect";
                c2.f();
            }
            com.ss.android.ugc.aweme.profile.b.f a2 = new com.ss.android.ugc.aweme.profile.b.f().a(str);
            a2.p = aweme;
            a2.f116046a = aweme.getAid();
            a2.f116047b = com.ss.android.ugc.aweme.metrics.c.c(aweme);
            a2.f116050e = com.ss.android.ugc.aweme.metrics.c.a(aweme, i3);
            a2.f116049d = com.ss.android.ugc.aweme.metrics.c.d(aweme);
            a2.f116048c = com.ss.android.ugc.aweme.metrics.c.e(aweme);
            l.d("effect", "");
            a2.q = "effect";
            a2.f();
        }
    }

    public final void n() {
        String str;
        String str2;
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        if (this.f116281f) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str).a("prop_id", ((g) aI_()).effectId).a("author_id", ((g) aI_()).ownerId);
        Aweme aweme = ((g) aI_()).relatedAweme;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        r.a("enter_prop_detail", a2.a("group_id", str2).a("enter_method", "profile_tab_card").f66730a);
        View view = this.itemView;
        l.b(view, "");
        SmartRoute withParam = SmartRouter.buildRoute(view.getContext(), "aweme://stickers/detail").withParam("extra_sticker_from", "from_sticker_master_profile").withParam("extra_music_from", "from_sticker_master_profile");
        String[] strArr = new String[1];
        String str3 = ((g) aI_()).effectId;
        if (str3 == null) {
            l.b();
        }
        strArr[0] = str3;
        withParam.withParam("extra_stickers", n.d(strArr)).open();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EffectProfileViewHolder f116284a;

        static {
            Covode.recordClassIndex(75066);
        }

        b(EffectProfileViewHolder effectProfileViewHolder) {
            this.f116284a = effectProfileViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f116284a.n();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EffectProfileViewHolder f116285a;

        static {
            Covode.recordClassIndex(75067);
        }

        c(EffectProfileViewHolder effectProfileViewHolder) {
            this.f116285a = effectProfileViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f116285a.n();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EffectProfileViewHolder f116286a;

        static {
            Covode.recordClassIndex(75068);
        }

        d(EffectProfileViewHolder effectProfileViewHolder) {
            this.f116286a = effectProfileViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f116286a.n();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EffectProfileViewHolder f116289a;

        static {
            Covode.recordClassIndex(75071);
        }

        f(EffectProfileViewHolder effectProfileViewHolder) {
            this.f116289a = effectProfileViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f116289a.n();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EffectProfileViewHolder f116287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f116288b;

        static {
            Covode.recordClassIndex(75069);
        }

        e(EffectProfileViewHolder effectProfileViewHolder, g gVar) {
            this.f116287a = effectProfileViewHolder;
            this.f116288b = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            EffectProfileViewHolder effectProfileViewHolder = this.f116287a;
            effectProfileViewHolder.withState(effectProfileViewHolder.m(), new h.f.a.b<EffectProfileState, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(75070);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(EffectProfileState effectProfileState) {
                    String str;
                    l.d(effectProfileState, "");
                    ae.f95297b = this.this$0.f116287a.m();
                    v.f95367b = this.this$0.f116287a.f116281f;
                    View view = this.this$0.f116287a.itemView;
                    l.b(view, "");
                    SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://aweme/detail");
                    Aweme aweme = this.this$0.f116288b.relatedAweme;
                    l.b(aweme, "");
                    SmartRoute withParam = buildRoute.withParam("id", aweme.getAid()).withParam("refer", "sticker_profile_detail").withParam("video_from", "from_sticker_master_profile");
                    if (this.this$0.f116287a.f116281f) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    withParam.withParam("previous_page", str).withParam("tab_name", ho.a(6)).open();
                    return z.f158842a;
                }
            });
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(g gVar) {
        String str;
        g gVar2 = gVar;
        l.d(gVar2, "");
        View view = this.itemView;
        l.b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.title);
        l.b(tuxTextView, "");
        tuxTextView.setText(gVar2.name);
        View view2 = this.itemView;
        l.b(view2, "");
        TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.ak7);
        l.b(tuxTextView2, "");
        View view3 = this.itemView;
        l.b(view3, "");
        tuxTextView2.setText(view3.getContext().getString(R.string.dd4, com.ss.android.ugc.aweme.i18n.b.a(gVar2.userCount)));
        View view4 = this.itemView;
        l.b(view4, "");
        ((TuxTextView) view4.findViewById(R.id.title)).setOnClickListener(new b(this));
        View view5 = this.itemView;
        l.b(view5, "");
        ((SmartImageView) view5.findViewById(R.id.bi7)).setOnClickListener(new c(this));
        View view6 = this.itemView;
        l.b(view6, "");
        ((SmartImageView) view6.findViewById(R.id.bil)).setOnClickListener(new d(this));
        if (gVar2.relatedAweme != null) {
            this.itemView.setOnClickListener(new e(this, gVar2));
            com.ss.android.ugc.aweme.ay.c cVar = com.ss.android.ugc.aweme.ay.c.f67775a;
            View view7 = this.itemView;
            l.b(view7, "");
            SmartImageView smartImageView = (SmartImageView) view7.findViewById(R.id.agf);
            l.b(smartImageView, "");
            Aweme aweme = ((g) aI_()).relatedAweme;
            l.b(aweme, "");
            Video video = aweme.getVideo();
            l.b(video, "");
            if (com.ss.android.ugc.aweme.ay.c.a(cVar, smartImageView, video, this.f116282g, false, false, 120)) {
                View view8 = this.itemView;
                l.b(view8, "");
                ((SmartImageView) view8.findViewById(R.id.agf)).setAttached(true);
                View view9 = this.itemView;
                l.b(view9, "");
                ((SmartImageView) view9.findViewById(R.id.agf)).b();
            } else {
                Aweme aweme2 = ((g) aI_()).relatedAweme;
                l.b(aweme2, "");
                Video video2 = aweme2.getVideo();
                l.b(video2, "");
                com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(video2.getCover()));
                View view10 = this.itemView;
                l.b(view10, "");
                a2.E = (SmartImageView) view10.findViewById(R.id.agf);
                a2.c();
            }
            View view11 = this.itemView;
            l.b(view11, "");
            SmartImageView smartImageView2 = (SmartImageView) view11.findViewById(R.id.bi7);
            l.b(smartImageView2, "");
            smartImageView2.setVisibility(0);
            View view12 = this.itemView;
            l.b(view12, "");
            SmartImageView smartImageView3 = (SmartImageView) view12.findViewById(R.id.bil);
            l.b(smartImageView3, "");
            smartImageView3.setVisibility(4);
            com.bytedance.lighten.a.v a3 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(gVar2.iconUrl));
            View view13 = this.itemView;
            l.b(view13, "");
            a3.E = (SmartImageView) view13.findViewById(R.id.bi7);
            a3.c();
        } else {
            this.itemView.setOnClickListener(new f(this));
            com.bytedance.lighten.a.v a4 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(gVar2.iconUrl));
            View view14 = this.itemView;
            l.b(view14, "");
            a4.E = (SmartImageView) view14.findViewById(R.id.agf);
            a4.v = w.CENTER_CROP;
            a4.x = new com.bytedance.lighten.a.b(25);
            a4.c();
            View view15 = this.itemView;
            l.b(view15, "");
            SmartImageView smartImageView4 = (SmartImageView) view15.findViewById(R.id.bi7);
            l.b(smartImageView4, "");
            smartImageView4.setVisibility(4);
            View view16 = this.itemView;
            l.b(view16, "");
            SmartImageView smartImageView5 = (SmartImageView) view16.findViewById(R.id.bil);
            l.b(smartImageView5, "");
            smartImageView5.setVisibility(0);
            com.bytedance.lighten.a.v a5 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(gVar2.iconUrl));
            View view17 = this.itemView;
            l.b(view17, "");
            a5.E = (SmartImageView) view17.findViewById(R.id.bil);
            a5.c();
        }
        String str2 = gVar2.ownerId;
        String str3 = gVar2.id;
        boolean z = this.f116281f;
        com.ss.android.ugc.aweme.app.f.d a6 = new com.ss.android.ugc.aweme.app.f.d().a("tab_name", "effect").a("author_id", str2).a("prop_id", str3);
        if (z) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        r.a("prop_card_show", a6.a("enter_from", str).f66730a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EffectProfileViewHolder(android.view.ViewGroup r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131560302(0x7f0d076e, float:1.8745972E38)
            r0 = 0
            android.view.View r0 = com.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            r4.f116281f = r6
            java.lang.String r0 = "EffectProfileViewHolder"
            r4.f116282g = r0
            java.lang.Class<com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel> r0 = com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel.class
            h.k.c r1 = h.f.b.ab.a(r0)
            com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder$a r0 = new com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = h.i.a(r0)
            r4.f116283j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder.<init>(android.view.ViewGroup, boolean):void");
    }
}
