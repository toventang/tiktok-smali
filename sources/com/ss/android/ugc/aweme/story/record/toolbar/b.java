package com.ss.android.ugc.aweme.story.record.toolbar;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.z;
import java.util.Objects;

public final class b extends com.bytedance.als.j<a> implements com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f138430a = {new y(b.class, "recordContext", "getRecordContext()Lcom/ss/android/ugc/aweme/story/record/model/StoryRecordContext;", 0), new y(b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(b.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0), new y(b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0), new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final j f138431b;

    /* renamed from: c  reason: collision with root package name */
    final h.h f138432c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.scene.group.b f138433d;

    /* renamed from: e  reason: collision with root package name */
    public final int f138434e = R.id.dj9;

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f138435f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f138436g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f138437h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f138438i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f138439j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f138440k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f138441l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.o.f f138442m;

    static {
        Covode.recordClassIndex(90542);
    }

    private final StoryRecordToolbarViewModel g() {
        return (StoryRecordToolbarViewModel) this.f138436g.getValue();
    }

    public final com.ss.android.ugc.aweme.story.record.f.a b() {
        return (com.ss.android.ugc.aweme.story.record.f.a) this.f138435f.a(this, f138430a[0]);
    }

    public final StoryRecordBaseViewModel c() {
        return (StoryRecordBaseViewModel) this.f138437h.getValue();
    }

    public final com.bytedance.creativex.recorder.b.a.d d() {
        return (com.bytedance.creativex.recorder.b.a.d) this.f138438i.a(this, f138430a[1]);
    }

    public final com.bytedance.creativex.recorder.a.a.a e() {
        return (com.bytedance.creativex.recorder.a.a.a) this.f138439j.a(this, f138430a[2]);
    }

    public final com.bytedance.creativex.recorder.sticker.a.a f() {
        return (com.bytedance.creativex.recorder.sticker.a.a) this.f138440k.a(this, f138430a[3]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f138442m;
    }

    static final class p extends h.f.b.m implements h.f.a.a<com.bytedance.tux.h.g> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90558);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.h.g invoke() {
            return new com.bytedance.tux.h.g(com.bytedance.als.dsl.g.b(this.this$0));
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<StoryRecordBaseViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90557);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            JediViewModel a2 = t.a(com.bytedance.scene.ktx.c.b(this.this$0.f138433d)).a(StoryRecordBaseViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<StoryRecordToolbarViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryRecordToolbarViewModel invoke() {
            JediViewModel a2 = t.a(com.bytedance.scene.ktx.c.b(this.this$0.f138433d)).a(StoryRecordToolbarViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.record.toolbar.a
    public final void a() {
        j jVar = this.f138431b;
        View c2 = jVar.c(R.id.eno);
        h.f.b.l.b(c2, "");
        ViewGroup.LayoutParams layoutParams = c2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + dh.c(jVar.s()), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        c2.setLayoutParams(marginLayoutParams);
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        this.f138433d.a(this.f138434e, this.f138431b, "StoryRecordToolbarScene");
        f.a.b.b unused = g().a(this, c.f138450a, new ah(), new h(this));
        f.a.b.b unused2 = g().a(this, g.f138454a, new ah(), new k(this));
        f.a.b.b unused3 = g().a(this, h.f138455a, new ah(), new l(this));
        f.a.b.b unused4 = g().a(this, i.f138456a, new ah(), new m(this));
        d().s().a(this, new n(this));
        d().n().a(this, new a(this));
        d().x().a(this, new C3649b(this));
        d().m().a(this, new c(this));
        f.a.b.b unused5 = c().a(this, d.f138451a, new ah(), new d(this));
        f.a.b.b unused6 = c().a(this, e.f138452a, new ah(), new e(this));
        f.a.b.b unused7 = c().a(this, f.f138453a, new ah(), new f(this));
        f().d().a(this, new g(this));
        ((com.bytedance.creativex.recorder.b.a.m) this.f138441l.a(this, f138430a[4])).h().a(this, new i(this));
        e().h().a(this, new j(this));
    }

    static final class a<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138443a;

        static {
            Covode.recordClassIndex(90543);
        }

        a(b bVar) {
            this.f138443a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            j jVar = this.f138443a.f138431b;
            h.f.b.l.b(bool, "");
            jVar.b(bool.booleanValue());
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.m, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.m mVar) {
            h.f.b.l.d(mVar, "");
            View view = this.this$0.f138431b.n;
            h.f.b.l.b(view, "");
            view.setVisibility(0);
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.p, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(pVar, "");
            this.this$0.f138431b.a();
            this.this$0.f138431b.b(true);
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.p, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90550);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(pVar, "");
            com.ss.android.ugc.aweme.story.record.j.c.b(this.this$0.b(), "click_cross");
            this.this$0.c().a();
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.k, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.k kVar) {
            com.bytedance.jedi.arch.k kVar2 = kVar;
            h.f.b.l.d(kVar2, "");
            this.this$0.e().d(kVar2.f39404b.booleanValue());
            return z.f158842a;
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138449a;

        static {
            Covode.recordClassIndex(90556);
        }

        n(b bVar) {
            this.f138449a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            j jVar = this.f138449a.f138431b;
            if (num != null && num.intValue() == 0) {
                z = false;
            } else {
                z = true;
            }
            jVar.a(z);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.k, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90547);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.k kVar) {
            int i2;
            com.bytedance.jedi.arch.k kVar2 = kVar;
            h.f.b.l.d(kVar2, "");
            View view = this.this$0.f138431b.n;
            h.f.b.l.b(view, "");
            if (kVar2.f39404b.booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
            return z.f158842a;
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138447a;

        static {
            Covode.recordClassIndex(90551);
        }

        i(b bVar) {
            this.f138447a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (!com.ss.android.ugc.aweme.shortvideo.sticker.c.e(com.ss.android.ugc.aweme.sticker.f.e.a(this.f138447a.f()))) {
                View view = this.f138447a.f138431b.n;
                h.f.b.l.b(view, "");
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.b$b  reason: collision with other inner class name */
    static final class C3649b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138444a;

        static {
            Covode.recordClassIndex(90544);
        }

        C3649b(b bVar) {
            this.f138444a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.tools.g gVar = (com.ss.android.ugc.aweme.tools.g) obj;
            if (Build.VERSION.SDK_INT >= 29) {
                ((com.bytedance.tux.h.g) this.f138444a.f138432c.getValue()).b();
            } else {
                new com.bytedance.tux.h.g(com.bytedance.als.dsl.g.b(this.f138444a)).a();
            }
            if (!h.f.b.l.a((Object) this.f138444a.f().d().a(), (Object) true)) {
                j jVar = this.f138444a.f138431b;
                h.f.b.l.b(gVar, "");
                jVar.a(!gVar.f140198a, true);
            }
        }
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138445a;

        static {
            Covode.recordClassIndex(90545);
        }

        c(b bVar) {
            this.f138445a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.b.a.e eVar = (com.bytedance.creativex.recorder.b.a.e) obj;
            com.ss.android.ugc.aweme.story.record.f.a b2 = this.f138445a.b();
            h.f.b.l.b(eVar, "");
            h.f.b.l.d(b2, "");
            h.f.b.l.d(eVar, "");
            com.ss.android.ugc.aweme.utils.d.a("flip_camera", new com.ss.android.ugc.tools.f.b().a("creation_id", b2.f138279b).a("shoot_way", b2.f138280c).a("to_status", eVar.f28181c).a("enter_from", "video_shoot_page").a("shoot_page", "story_shoot_page").a("shoot_tab_name", "story").a("camera_type", eVar.f28180b).a("duration", eVar.f28179a).f149193a);
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138446a;

        static {
            Covode.recordClassIndex(90549);
        }

        g(b bVar) {
            this.f138446a = bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            j jVar = this.f138446a.f138431b;
            h.f.b.l.b(bool, "");
            boolean booleanValue = bool.booleanValue();
            ImageView[] imageViewArr = new ImageView[3];
            ImageView imageView = jVar.f138462e;
            if (imageView == null) {
                h.f.b.l.a("backButton");
            }
            imageViewArr[0] = imageView;
            ImageView imageView2 = jVar.f138460c;
            if (imageView2 == null) {
                h.f.b.l.a("flashButton");
            }
            imageViewArr[1] = imageView2;
            ImageView imageView3 = jVar.f138461d;
            if (imageView3 == null) {
                h.f.b.l.a("beautyButton");
            }
            imageViewArr[2] = imageView3;
            for (T t : h.a.n.b(imageViewArr)) {
                if (booleanValue) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                t.setVisibility(i2);
                t.setEnabled(!booleanValue);
            }
            if (((com.bytedance.creativex.recorder.b.a.d) jVar.f138459b.a(jVar, j.f138457a[0])).N() == 1) {
                ImageView imageView4 = jVar.f138460c;
                if (imageView4 == null) {
                    h.f.b.l.a("flashButton");
                }
                imageView4.setEnabled(false);
            }
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f138448a;

        static {
            Covode.recordClassIndex(90552);
        }

        j(b bVar) {
            this.f138448a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            com.bytedance.creativex.recorder.a.a.b bVar = (com.bytedance.creativex.recorder.a.a.b) obj;
            if (bVar.f28064a == com.bytedance.creativex.recorder.a.a.c.BEAUTY_ON_OFF && (bVar instanceof com.bytedance.creativex.recorder.a.a.d)) {
                com.ss.android.ugc.aweme.story.record.f.a b2 = this.f138448a.b();
                boolean z = ((com.bytedance.creativex.recorder.a.a.d) bVar).f28066b;
                h.f.b.l.d(b2, "");
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", b2.f138279b).a("shoot_way", b2.f138280c).a("enter_from", "video_shoot_page").a("shoot_page", "story_shoot_page").a("shoot_tab_name", "story");
                if (z) {
                    str = "on";
                } else {
                    str = "off";
                }
                r.a("click_beautify_entrance", a2.a("to_status", str).f149193a);
            }
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.p, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90553);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.p pVar) {
            boolean z;
            String str;
            h.f.b.l.d(pVar, "");
            int R = this.this$0.d().R();
            this.this$0.d().a(R);
            com.ss.android.ugc.aweme.story.record.f.a b2 = this.this$0.b();
            if (R != 0) {
                z = true;
            } else {
                z = false;
            }
            h.f.b.l.d(b2, "");
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", b2.f138279b).a("shoot_way", b2.f138280c).a("shoot_page", "story_shoot_page").a("shoot_tab_name", "story");
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            com.ss.android.ugc.aweme.utils.d.a("light", a2.a("to_status", str).f149193a);
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.p, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(90555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.p pVar) {
            PrivacyCert build;
            h.f.b.l.d(pVar, "");
            this.this$0.d().a(false);
            boolean a2 = h.f.b.l.a((Object) this.this$0.f().d().a(), (Object) true);
            com.bytedance.creativex.recorder.b.a.d d2 = this.this$0.d();
            if (a2) {
                build = PrivacyCert.Builder.Companion.with("bpea-308").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build();
            } else {
                build = PrivacyCert.Builder.Companion.with("bpea-309").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build();
            }
            int unused = d2.a(false, build, (String) null);
            return z.f158842a;
        }
    }

    public b(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar, "");
        this.f138433d = bVar;
        this.f138442m = fVar;
        this.f138431b = new j(getDiContainer());
        this.f138435f = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.story.record.f.a.class);
        this.f138436g = h.i.a((h.f.a.a) new q(this));
        this.f138437h = h.i.a((h.f.a.a) new o(this));
        this.f138438i = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
        this.f138439j = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.a.a.a.class);
        this.f138440k = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.sticker.a.a.class);
        this.f138441l = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.m.class);
        this.f138432c = h.i.a((h.f.a.a) new p(this));
    }
}
