package com.ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.d.b;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.utils.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final AVETParameter f135727a;

    /* renamed from: b  reason: collision with root package name */
    private final h f135728b;

    static {
        Covode.recordClassIndex(88718);
    }

    private final com.ss.android.ugc.tools.f.b a() {
        return (com.ss.android.ugc.tools.f.b) this.f135728b.getValue();
    }

    public /* synthetic */ a() {
        this(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.text.a$a  reason: collision with other inner class name */
    static final class C3539a extends m implements h.f.a.a<com.ss.android.ugc.tools.f.b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(88719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3539a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.f.b invoke() {
            String str;
            String str2;
            String str3;
            com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
            AVETParameter aVETParameter = this.this$0.f135727a;
            String str4 = null;
            if (aVETParameter != null) {
                str = aVETParameter.getCreationId();
            } else {
                str = null;
            }
            com.ss.android.ugc.tools.f.b a2 = bVar.a("creation_id", str);
            AVETParameter aVETParameter2 = this.this$0.f135727a;
            if (aVETParameter2 != null) {
                str2 = aVETParameter2.getShootWay();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.tools.f.b a3 = a2.a("shoot_way", str2);
            AVETParameter aVETParameter3 = this.this$0.f135727a;
            if (aVETParameter3 != null) {
                str3 = aVETParameter3.getContentSource();
            } else {
                str3 = null;
            }
            com.ss.android.ugc.tools.f.b a4 = a3.a("content_source", str3);
            AVETParameter aVETParameter4 = this.this$0.f135727a;
            if (aVETParameter4 != null) {
                str4 = aVETParameter4.getContentType();
            }
            return a4.a("content_type", str4).a("enter_from", "photo_post_page");
        }
    }

    public a(AVETParameter aVETParameter) {
        this.f135727a = aVETParameter;
        this.f135728b = i.a((h.f.a.a) new C3539a(this));
    }

    @Override // com.ss.android.ugc.aweme.editSticker.d.b
    public final void a(com.ss.android.ugc.aweme.editSticker.d.a aVar) {
        l.d(aVar, "");
        d.a("select_cover_text_type", a().a("text_id", aVar.f88129a).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.d.b
    public final void b(int i2) {
        d.a("select_text_style", a().a("text_style", i2).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.d.b
    public final void e(com.ss.android.ugc.aweme.editSticker.d.a aVar) {
        l.d(aVar, "");
        d.a("cancel_cover_edit", a().a("is_toasted", aVar.f88136h).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.d.b
    public final void a(int i2) {
        d.a("select_text_color", a().a(com.bytedance.ies.xelement.pickview.b.b.f37372a, Integer.toHexString(i2)).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.d.b
    public final void b(com.ss.android.ugc.aweme.editSticker.d.a aVar) {
        l.d(aVar, "");
        d.a("edit_cover_text", a().a("text_id", aVar.f88129a).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.d.b
    public final void c(com.ss.android.ugc.aweme.editSticker.d.a aVar) {
        l.d(aVar, "");
        d.a("complete_cover_text", a().a("text_id", aVar.f88129a).a("font_id", aVar.f88130b).a("font_name", aVar.f88131c).a("text_color", aVar.f88132d).a("text_style", aVar.f88133e).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.d.b
    public final void a(String str) {
        l.d(str, "");
        d.a("select_text_paragraph", a().a("paragraph_style", str).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.d.b
    public final void b(String str) {
        l.d(str, "");
        d.a("select_text_font", a().a("font", str).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.d.b
    public final void d(com.ss.android.ugc.aweme.editSticker.d.a aVar) {
        l.d(aVar, "");
        if (!g.a().A().a()) {
            d.a("save_cover_edit", a().a("text_id", aVar.f88129a).a("font_id", aVar.f88130b).a("font_name", aVar.f88131c).a("text_color", aVar.f88132d).a("text_style", aVar.f88133e).a("is_text", aVar.f88134f).a("is_pic_adjust", aVar.f88135g).f149193a);
        }
    }
}
