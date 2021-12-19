package com.ss.android.ugc.aweme.tools.beauty.service.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.utils.d;
import h.f.b.l;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f139154b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final AVETParameter f139155c;

    static {
        Covode.recordClassIndex(90999);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91000);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.a.a, com.ss.android.ugc.aweme.tools.beauty.service.b
    public final void a() {
        d.a("reset_beautify_all", a(this.f139155c).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.a.a
    public final void b() {
        d.a("click_beautify_entrance", a(this.f139155c).f149193a);
    }

    public b(AVETParameter aVETParameter) {
        l.d(aVETParameter, "");
        this.f139155c = aVETParameter;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.a.a, com.ss.android.ugc.aweme.tools.beauty.service.b
    public final void a(ComposerBeauty composerBeauty) {
        if (composerBeauty != null) {
            d.a("click_beautify_tab", a(composerBeauty, this.f139155c).f149193a);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.a.a, com.ss.android.ugc.aweme.tools.beauty.service.b
    public final void c(ComposerBeauty composerBeauty) {
        if (composerBeauty != null) {
            d.a("reset_beautify", a(composerBeauty, this.f139155c).a("beautify_value", String.valueOf(composerBeauty.getProgressValue())).f149193a);
        }
    }

    private static com.ss.android.ugc.tools.f.b a(AVETParameter aVETParameter) {
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", aVETParameter.getCreationId()).a("shoot_way", aVETParameter.getShootWay()).a("content_source", aVETParameter.getContentSource()).a("content_type", aVETParameter.getContentType()).a("enter_from", "video_shoot_page");
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.a.a, com.ss.android.ugc.aweme.tools.beauty.service.b
    public final void b(ComposerBeauty composerBeauty) {
        int defaultProgress;
        if (composerBeauty != null) {
            if (composerBeauty.getProgressValue() != 0) {
                defaultProgress = composerBeauty.getProgressValue();
            } else {
                defaultProgress = composerBeauty.getDefaultProgress();
            }
            d.a("select_beautify", a(composerBeauty, this.f139155c).a("beautify_value", String.valueOf(defaultProgress)).f149193a);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.a.a, com.ss.android.ugc.aweme.tools.beauty.service.b
    public final void a(BeautyCategory beautyCategory) {
        if (beautyCategory != null) {
            d.a("click_beautify_category", a(this.f139155c).a("beautify_category_id", beautyCategory.getCategoryResponse().getId()).a("beautify_category_name", beautyCategory.getCategoryResponse().getName()).f149193a);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.a.a, com.ss.android.ugc.aweme.tools.beauty.service.b
    public final void a(String str) {
        l.d(str, "");
        d.a("reset_beautify_popup", a(this.f139155c).a("event_type", str).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.a.a, com.ss.android.ugc.aweme.tools.beauty.service.b
    public final void a(boolean z) {
        String str;
        com.ss.android.ugc.tools.f.b a2 = a(this.f139155c);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        d.a("click_beauty_switch", a2.a("final_status", str).f149193a);
    }

    private static com.ss.android.ugc.tools.f.b a(ComposerBeauty composerBeauty, AVETParameter aVETParameter) {
        com.ss.android.ugc.tools.f.b a2 = a(aVETParameter);
        if (com.ss.android.ugc.aweme.tools.beauty.d.b(composerBeauty)) {
            a2.a("beautify_name_parent", composerBeauty.getParentName()).a("beautify_id_parent", composerBeauty.getParentId()).a("beautify_name_child", composerBeauty.getEffect().getName()).a("beautify_id_child", composerBeauty.getEffect().getEffectId());
        } else {
            a2.a("beautify_name_parent", composerBeauty.getEffect().getName()).a("beautify_id_parent", composerBeauty.getEffect().getEffectId());
        }
        return a2;
    }
}
