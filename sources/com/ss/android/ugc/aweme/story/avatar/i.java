package com.ss.android.ugc.aweme.story.avatar;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.x;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class i extends com.bytedance.assem.arch.d.a {
    public static final f n = new f((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    final com.bytedance.assem.arch.extensions.i f136828j;

    /* renamed from: k  reason: collision with root package name */
    public StoryBrandView f136829k;

    /* renamed from: l  reason: collision with root package name */
    View f136830l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f136831m;
    private final com.bytedance.assem.arch.viewModel.b o;
    private final com.bytedance.assem.arch.extensions.i p;
    private final com.bytedance.assem.arch.extensions.i q;
    private ImageView r;
    private AnimationImageView s;
    private LiveCircleView t;
    private final h.h u;

    public static final class b extends m implements h.f.a.b<p, p> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(89409);
        }

        public b() {
            super(1);
        }

        public final p invoke(p pVar) {
            h.f.b.l.c(pVar, "");
            return pVar;
        }
    }

    static {
        Covode.recordClassIndex(89407);
    }

    public final ProfileStoryRingViewModel u() {
        return (ProfileStoryRingViewModel) this.o.getValue();
    }

    public final d w() {
        return (d) this.u.getValue();
    }

    public static final class f {
        static {
            Covode.recordClassIndex(89413);
        }

        private f() {
        }

        public /* synthetic */ f(byte b2) {
            this();
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(89408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends m implements h.f.a.a<q> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyData;

        static {
            Covode.recordClassIndex(89410);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyData = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.story.avatar.q, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.avatar.q invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.story.avatar.q> r1 = com.ss.android.ugc.aweme.story.avatar.q.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.avatar.i.c.invoke():java.lang.Object");
        }
    }

    public static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(89411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.avatar.i.d.invoke():java.lang.Object");
        }
    }

    public static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(89412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.avatar.i.e.invoke():java.lang.Object");
        }
    }

    static final class g extends m implements h.f.a.a<d> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(89414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            c d2 = com.ss.android.ugc.aweme.story.g.f137757a.d();
            if (d2 != null) {
                return d2.a(new e(this) {
                    /* class com.ss.android.ugc.aweme.story.avatar.i.g.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ g f136832a;

                    static {
                        Covode.recordClassIndex(89415);
                    }

                    @Override // com.ss.android.ugc.aweme.story.avatar.e
                    public final o c() {
                        return o.PROFILE;
                    }

                    @Override // com.ss.android.ugc.aweme.story.avatar.e
                    public final /* bridge */ /* synthetic */ androidx.lifecycle.m b() {
                        return this.f136832a.this$0;
                    }

                    @Override // com.ss.android.ugc.aweme.story.avatar.e
                    public final StoryBrandView a() {
                        return i.a(this.f136832a.this$0);
                    }

                    @Override // com.ss.android.ugc.aweme.story.avatar.h
                    public final boolean d() {
                        if (this.f136832a.this$0.v()) {
                            return false;
                        }
                        return true;
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f136832a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.story.avatar.g
                    public final boolean a(String str, HashMap<String, String> hashMap) {
                        h.f.b.l.d(str, "");
                        h.f.b.l.d(hashMap, "");
                        if (!this.f136832a.this$0.f136831m) {
                            return false;
                        }
                        if (h.f.b.l.a((Object) str, (Object) "story_show")) {
                            ProfileStoryRingViewModel u = this.f136832a.this$0.u();
                            if (u.f136763l) {
                                return false;
                            }
                            u.f136763l = true;
                        }
                        hashMap.put("enter_from", this.f136832a.this$0.u().g());
                        return true;
                    }

                    @Override // com.ss.android.ugc.aweme.story.avatar.e
                    public final void a(SmartRoute smartRoute, Aweme aweme) {
                        String str;
                        String uid;
                        String str2 = "";
                        h.f.b.l.d(smartRoute, str2);
                        h.f.b.l.d(aweme, str2);
                        if (this.f136832a.this$0.u().f136761j) {
                            str = "STORY_ENTRANCE_MINE";
                        } else {
                            str = "STORY_ENTRANCE_OTHER";
                        }
                        SmartRoute withParam = smartRoute.withParam("video_from", str).withParam("enter_from", this.f136832a.this$0.u().g());
                        User author = aweme.getAuthor();
                        if (!(author == null || (uid = author.getUid()) == null)) {
                            str2 = uid;
                        }
                        withParam.withParam("userid", str2);
                    }

                    @Override // com.ss.android.ugc.aweme.story.avatar.h
                    public final void a(boolean z, com.ss.android.ugc.aweme.tux.business.story.a aVar) {
                        h.f.b.l.d(aVar, "");
                        i iVar = this.f136832a.this$0;
                        if (!iVar.u().f136761j || iVar.v()) {
                            View view = iVar.f136830l;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                        } else if (z && aVar == com.ss.android.ugc.aweme.tux.business.story.a.RED_RING) {
                            iVar.a(2131233452);
                        } else if (!((Boolean) com.ss.android.ugc.aweme.story.c.a.f136950a.getValue()).booleanValue() && z) {
                            View view2 = iVar.f136830l;
                            if (view2 != null) {
                                view2.setVisibility(8);
                            }
                        } else {
                            iVar.a(2131233451);
                        }
                    }
                });
            }
            return null;
        }
    }

    public final boolean v() {
        User user = u().f136762k;
        if (user == null || !user.isLive() || !com.ss.android.ugc.aweme.story.c.a() || in.b(u().f136762k, false)) {
            return false;
        }
        return true;
    }

    public i() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(ProfileStoryRingViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.o = bVar;
        this.p = new com.bytedance.assem.arch.extensions.i(bQ_(), new d(this, null));
        this.f136828j = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, "story_ring_assem_enter_params"));
        this.q = new com.bytedance.assem.arch.extensions.i(bQ_(), new e(this, null));
        this.u = h.i.a((h.f.a.a) new g(this));
    }

    public static final /* synthetic */ StoryBrandView a(i iVar) {
        StoryBrandView storyBrandView = iVar.f136829k;
        if (storyBrandView == null) {
            h.f.b.l.a("storyBrandView");
        }
        return storyBrandView;
    }

    static final class j extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(89418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                this.this$0.u().f136762k = t;
                d w = this.this$0.w();
                if (w != null) {
                    w.a(t, true);
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        ImageView imageView = this.r;
        if (imageView != null) {
            imageView.setImageResource(i2);
        }
        View view = this.f136830l;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    static final class l extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(89420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            i iVar = this.this$0;
            boolean z = true;
            if (aVar2 == null || !aVar2.f25631b.booleanValue()) {
                z = false;
            }
            iVar.f136831m = z;
            if (this.this$0.f136831m) {
                this.this$0.u().f136763l = false;
                d w = this.this$0.w();
                if (w != null) {
                    w.a("story_show");
                }
            }
            return z.f158842a;
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f136833a;

        static {
            Covode.recordClassIndex(89416);
        }

        h(i iVar) {
            this.f136833a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (i.a(this.f136833a).getMode() == com.ss.android.ugc.aweme.tux.business.story.a.RED_RING) {
                i.a(this.f136833a).performClick();
                return;
            }
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this.f136833a);
            if (!(b2 instanceof androidx.appcompat.app.d)) {
                b2 = null;
            }
            androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) b2;
            if (dVar != null && !com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                ProfileStoryRingViewModel u = this.f136833a.u();
                h.f.b.l.d(dVar, "");
                AVExternalServiceImpl.a().storyService().startStoryActivity(dVar, new EnterStoryParam(null, "click_head_plus", u.g(), false, false, false, !com.ss.android.ugc.aweme.story.c.b.i(), 49, null));
            }
        }
    }

    static final class k extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(89419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            this.this$0.f136831m = booleanValue;
            if (booleanValue && this.this$0.u().f136761j) {
                this.this$0.u().f136763l = false;
                d w = this.this$0.w();
                if (w != null) {
                    w.a(this.this$0.u().f136762k, false);
                }
                d w2 = this.this$0.w();
                if (w2 != null) {
                    w2.a("story_show");
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        boolean z;
        h.f.b.l.d(view, "");
        c d2 = com.ss.android.ugc.aweme.story.g.f137757a.d();
        if (d2 != null && d2.a()) {
            this.s = (AnimationImageView) s().findViewById(R.id.il);
            this.t = (LiveCircleView) s().findViewById(R.id.bsf);
            View findViewById = s().findViewById(R.id.c1p);
            h.f.b.l.b(findViewById, "");
            this.f136829k = (StoryBrandView) findViewById;
            this.f136830l = s().findViewById(R.id.agn);
            this.r = (ImageView) s().findViewById(R.id.bi5);
            View view2 = this.f136830l;
            if (view2 != null) {
                view2.setOnClickListener(new h(this));
            }
            ProfileStoryRingViewModel u2 = u();
            com.ss.android.ugc.aweme.profile.widgets.h.a.a aVar = (com.ss.android.ugc.aweme.profile.widgets.h.a.a) this.p.getValue();
            if (aVar != null) {
                z = aVar.f117878c;
            } else {
                z = false;
            }
            u2.f136761j = z;
            f.a.a(this, u(), j.f136834a, com.bytedance.assem.arch.viewModel.l.a(), new C3574i(this), 4);
            com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), k.f136835a, new j(this));
            com.bytedance.assem.arch.service.d.a(this, ab.a(x.class), l.f136836a, new k(this));
            com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), m.f136837a, new l(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.i$i  reason: collision with other inner class name */
    static final class C3574i extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends String>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(89417);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3574i(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends String> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends String> aVar2 = aVar;
            h.f.b.l.d(pVar, "");
            h.f.b.l.d(aVar2, "");
            if (aVar2.f25631b.length() > 0) {
                T t = aVar2.f25631b;
                com.ss.android.ugc.aweme.story.j.a.b("ProfileStoryRingAssem", "reset story ring due to " + ((String) t) + ", in " + ((q) this.this$0.f136828j.getValue()).f136842a);
                if (h.f.b.l.a((Object) t, (Object) "pull")) {
                    d w = this.this$0.w();
                    if (w != null) {
                        w.a(this.this$0.u().f136762k, false);
                    }
                } else {
                    d w2 = this.this$0.w();
                    if (w2 != null) {
                        w2.a(this.this$0.u().f136762k, true);
                    }
                }
            }
            return z.f158842a;
        }
    }
}
