package com.ss.android.ugc.aweme.share.silent;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.share.b.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final a f124365a = new a((byte) 0);

    static {
        Covode.recordClassIndex(81657);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81658);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        static final class c extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
            final /* synthetic */ int $checkedIconRes$inlined;
            final /* synthetic */ int $containerSize$inlined;

            static {
                Covode.recordClassIndex(81661);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(int i2, int i3) {
                super(1);
                this.$checkedIconRes$inlined = i2;
                this.$containerSize$inlined = i3;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
                com.bytedance.tux.c.a aVar2 = aVar;
                l.d(aVar2, "");
                aVar2.f44749a = this.$checkedIconRes$inlined;
                float f2 = (float) this.$containerSize$inlined;
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics()));
                float f3 = (float) this.$containerSize$inlined;
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, f3, system2.getDisplayMetrics()));
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.silent.t$a$a  reason: collision with other inner class name */
        static final class C3241a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
            final /* synthetic */ int $containerSize$inlined;
            final /* synthetic */ int $iconSize$inlined;
            final /* synthetic */ int $uncheckedIconRes$inlined;

            static {
                Covode.recordClassIndex(81659);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3241a(int i2, int i3, int i4) {
                super(1);
                this.$uncheckedIconRes$inlined = i2;
                this.$iconSize$inlined = i3;
                this.$containerSize$inlined = i4;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
                com.bytedance.tux.c.a aVar2 = aVar;
                l.d(aVar2, "");
                aVar2.f44749a = this.$uncheckedIconRes$inlined;
                aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
                float f2 = (float) this.$iconSize$inlined;
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics()));
                float f3 = (float) this.$iconSize$inlined;
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, f3, system2.getDisplayMetrics()));
                return z.f158842a;
            }
        }

        static final class b extends m implements h.f.a.b<e, z> {
            final /* synthetic */ int $containerSize$inlined;
            final /* synthetic */ int $iconSize$inlined;
            final /* synthetic */ int $uncheckedIconRes$inlined;

            static {
                Covode.recordClassIndex(81660);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(int i2, int i3, int i4) {
                super(1);
                this.$uncheckedIconRes$inlined = i2;
                this.$iconSize$inlined = i3;
                this.$containerSize$inlined = i4;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(e eVar) {
                e eVar2 = eVar;
                l.d(eVar2, "");
                eVar2.f44776b = Integer.valueOf((int) R.attr.t);
                eVar2.f44780f = Integer.valueOf((int) R.attr.ao);
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                eVar2.f44778d = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics())));
                float f2 = (float) this.$containerSize$inlined;
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                eVar2.f44782h = h.g.a.a(TypedValue.applyDimension(1, f2, system2.getDisplayMetrics()));
                float f3 = (float) this.$containerSize$inlined;
                Resources system3 = Resources.getSystem();
                l.a((Object) system3, "");
                eVar2.f44781g = h.g.a.a(TypedValue.applyDimension(1, f3, system3.getDisplayMetrics()));
                Resources system4 = Resources.getSystem();
                l.a((Object) system4, "");
                eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 50.0f, system4.getDisplayMetrics()));
                return z.f158842a;
            }
        }

        static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.share.model.c, z> {
            final /* synthetic */ z.e $shareForm;

            static {
                Covode.recordClassIndex(81662);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(z.e eVar) {
                super(1);
                this.$shareForm = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.share.model.c cVar) {
                com.ss.android.ugc.aweme.share.model.c cVar2 = cVar;
                l.d(cVar2, "");
                com.ss.android.ugc.aweme.base.h.d.a().b("key_pop_up_window_share_count", com.ss.android.ugc.aweme.base.h.d.a().a("key_pop_up_window_share_count", 0) + 1);
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("scene_id", "1013").a("platform", cVar2.f124106a.getKey()).a("group_id", cVar2.f124109d.getAid()).a("enter_from", "video_post_page").a("share_mode", "download_then_share").a("share_form", cVar2.f124108c);
                if (l.a((Object) this.$shareForm.element, (Object) "url_form")) {
                    a2.a("share_url", cVar2.f124107b);
                } else {
                    ShareInfo shareInfo = cVar2.f124109d.getShareInfo();
                    l.b(shareInfo, "");
                    String shareUrl = shareInfo.getShareUrl();
                    if (shareUrl == null) {
                        shareUrl = cVar2.f124109d.getShareUrl();
                    }
                    a2.a("share_url", shareUrl);
                }
                r.a("share_video", a2.a("content_type", "video").f66730a);
                a.C3194a.a("ug_publish_share_action", null, null);
                return h.z.f158842a;
            }
        }

        public static Drawable a(Context context, int i2, int i3, int i4, int i5) {
            l.d(context, "");
            StateListDrawable stateListDrawable = new StateListDrawable();
            LayerDrawable a2 = i.a(com.bytedance.tux.c.c.a(new C3241a(i2, i5, i4)).a(context), f.a(new b(i2, i5, i4)).a(context));
            com.bytedance.tux.c.b a3 = com.bytedance.tux.c.c.a(new c(i3, i4)).a(context);
            stateListDrawable.addState(new int[]{-16842912}, a2);
            stateListDrawable.addState(new int[]{16842912}, a3);
            stateListDrawable.addState(new int[0], a2);
            return stateListDrawable;
        }
    }
}
