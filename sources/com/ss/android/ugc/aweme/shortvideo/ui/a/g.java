package com.ss.android.ugc.aweme.shortvideo.ui.a;

import com.bytedance.als.j;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.a.e;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.filter.repository.a.a.c;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;

public final class g extends j<f> implements com.bytedance.o.a, f {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f131290a = {new y(g.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    final ShortVideoContext f131291b = ((ShortVideoContext) getDiContainer().a(ShortVideoContext.class, (String) null));

    /* renamed from: c  reason: collision with root package name */
    private final d f131292c = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.filter.a.a.class);

    /* renamed from: d  reason: collision with root package name */
    private final f f131293d;

    static {
        Covode.recordClassIndex(86015);
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.creativex.recorder.filter.a.a a() {
        return (com.bytedance.creativex.recorder.filter.a.a) this.f131292c.a(this, f131290a[0]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ f getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f131293d;
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        a().getFilterUpdateEvent().a(this, new a(this));
    }

    public g(f fVar) {
        l.d(fVar, "");
        this.f131293d = fVar;
    }

    static final class a<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f131294a;

        static {
            Covode.recordClassIndex(86016);
        }

        a(g gVar) {
            this.f131294a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            float f2;
            com.ss.android.ugc.aweme.filter.repository.a.m mVar;
            String name;
            com.bytedance.creativex.recorder.filter.a.i iVar = (com.bytedance.creativex.recorder.filter.a.i) obj;
            g gVar = this.f131294a;
            String str2 = "";
            l.b(iVar, str2);
            if (com.bytedance.creativex.recorder.filter.a.f.a(iVar.f28234b) && iVar.f28235c) {
                EffectCategoryResponse b2 = c.b(iVar.f28234b.f28227b.f(), iVar.f28233a);
                if (!(b2 == null || (name = b2.getName()) == null)) {
                    str2 = name;
                }
                ShortVideoContext shortVideoContext = gVar.f131291b;
                b a2 = new b().a("creation_id", shortVideoContext.q).a("shoot_way", shortVideoContext.r).a("draft_id", shortVideoContext.C);
                if (!l.a((Object) iVar.f28236d, (Object) "slide")) {
                    str = "click";
                } else {
                    str = iVar.f28236d;
                }
                b a3 = a2.a("enter_method", str).a("is_selected_from_entrance", !l.a(iVar.f28236d, "slide") ? 1 : 0).a("enter_from", "video_shoot_page").a("filter_name", iVar.f28233a.getEnName()).a("filter_id", iVar.f28233a.getId());
                e value = gVar.a().getCurrentFilterSource().getValue();
                if (value == null || (mVar = value.f28228c) == null) {
                    f2 = -1.0f;
                } else {
                    f2 = c.a(mVar, iVar.f28233a);
                }
                com.ss.android.ugc.aweme.utils.d.a("select_filter", a3.a("filter_value", Float.valueOf(f2)).a("tab_name", str2).a("content_source", shortVideoContext.j().getContentSource()).a("content_type", shortVideoContext.j().getContentType()).a("enter_from", "video_shoot_page").f149193a);
            }
        }
    }
}
