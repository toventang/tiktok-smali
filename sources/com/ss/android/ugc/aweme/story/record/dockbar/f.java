package com.ss.android.ugc.aweme.story.record.dockbar;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.property.as;
import com.ss.android.ugc.aweme.story.record.dockbar.StoryRecordDockBarViewModel;
import com.ss.android.ugc.aweme.story.record.widget.StoryUploadButton;
import com.ss.android.ugc.aweme.views.k;
import com.ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.h.d;
import h.k.i;
import java.lang.reflect.Type;

public final class f extends j implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f138214a = {new y(f.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0), new y(f.class, "recordContext", "getRecordContext()Lcom/ss/android/ugc/aweme/story/record/model/StoryRecordContext;", 0)};

    /* renamed from: e  reason: collision with root package name */
    public static final b f138215e = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final h f138216b;

    /* renamed from: c  reason: collision with root package name */
    final d f138217c = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.story.record.f.a.class);

    /* renamed from: d  reason: collision with root package name */
    ImageView f138218d;

    /* renamed from: f  reason: collision with root package name */
    private final d f138219f = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.sticker.a.a.class);

    /* renamed from: g  reason: collision with root package name */
    private final c f138220g = new c(this);

    /* renamed from: h  reason: collision with root package name */
    private StoryUploadButton f138221h;

    /* renamed from: i  reason: collision with root package name */
    private final com.bytedance.o.f f138222i;

    static {
        Covode.recordClassIndex(90409);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(90412);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f138222i;
    }

    public static final class a extends m implements h.f.a.a<StoryRecordDockBarViewModel> {
        final /* synthetic */ j $this_activityViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(90410);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_activityViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.story.record.dockbar.StoryRecordDockBarViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.record.dockbar.StoryRecordDockBarViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.scene.j r0 = r3.$this_activityViewModel
                android.app.Activity r1 = r0.t()
                java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                java.util.Objects.requireNonNull(r1, r0)
                androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
                com.ss.android.ugc.aweme.story.record.dockbar.f$a$1 r0 = new com.ss.android.ugc.aweme.story.record.dockbar.f$a$1
                r0.<init>()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r3.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_story_record_dockbar_StoryRecordDockBarScene$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.record.dockbar.f.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_story_record_dockbar_StoryRecordDockBarScene$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        StoryUploadButton storyUploadButton = this.f138221h;
        if (storyUploadButton == null) {
            l.a("uploadButton");
        }
        if (!storyUploadButton.f138495b && com.ss.android.ugc.aweme.port.in.l.f115658a.c().a(storyUploadButton.f138494a) == 0) {
            Context applicationContext = com.ss.android.ugc.aweme.port.in.i.f115645a.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            com.ss.android.ugc.aweme.mediachoose.helper.c.a(applicationContext, as.a());
            com.ss.android.ugc.aweme.mediachoose.helper.c.f109414a.a(1, 1, 0, storyUploadButton);
            storyUploadButton.f138495b = true;
        }
    }

    public static final class c extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f138223a;

        static {
            Covode.recordClassIndex(90413);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(500, false, 2);
            this.f138223a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.views.k
        public final void a(View view) {
            Integer valueOf;
            l.d(view, "");
            f fVar = this.f138223a;
            if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
                if (valueOf.intValue() == R.id.a08) {
                    ((JediViewModel) fVar.f138216b.getValue()).c(StoryRecordDockBarViewModel.a.f138199a);
                } else if (valueOf.intValue() == R.id.atv) {
                    ((com.bytedance.creativex.recorder.sticker.a.c) fVar.getDiContainer().a((Type) com.bytedance.creativex.recorder.sticker.a.c.class, (String) null)).a(true);
                    com.ss.android.ugc.aweme.story.record.f.a aVar = (com.ss.android.ugc.aweme.story.record.f.a) fVar.f138217c.a(fVar, f.f138214a[1]);
                    l.d(aVar, "");
                    r.a("click_prop_entrance", new com.ss.android.ugc.tools.f.b().a("creation_id", aVar.f138279b).a("shoot_way", aVar.f138280c).a("enter_from", "video_shoot_page").a("is_westwindow_exist", aVar.f138286i).a("shoot_page", "story_shoot_page").a("shoot_tab_name", "story").f149193a);
                }
            }
        }
    }

    public f(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.f138222i = fVar;
        h.k.c a2 = h.f.b.ab.a(StoryRecordDockBarViewModel.class);
        this.f138216b = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.a08);
        l.b(c2, "");
        StoryUploadButton storyUploadButton = (StoryUploadButton) c2;
        this.f138221h = storyUploadButton;
        if (storyUploadButton == null) {
            l.a("uploadButton");
        }
        storyUploadButton.setOnClickListener(this.f138220g);
        View c3 = c(R.id.c26);
        l.b(c3, "");
        this.f138218d = (ImageView) c3;
        c(R.id.atv).setOnClickListener(this.f138220g);
        View view = this.n;
        l.b(view, "");
        com.bytedance.creativex.recorder.sticker.a.a aVar = (com.bytedance.creativex.recorder.sticker.a.a) this.f138219f.a(this, f138214a[0]);
        l.d(this, "");
        l.d(view, "");
        l.d(aVar, "");
        new com.ss.android.ugc.aweme.story.record.i.a(this, aVar, (ViewGroup) view.findViewById(R.id.atv), (RemoteImageView) view.findViewById(R.id.c26), (RemoteImageView) view.findViewById(R.id.c28));
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b2w, viewGroup, false);
        l.b(a2, "");
        return a2;
    }
}
