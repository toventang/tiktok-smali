package com.ss.android.ugc.gamora.recorder.sticker.originalPanel;

import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.ss.android.ugc.aweme.sticker.panel.c.e;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.gamora.recorder.sticker.c.i;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final ShortVideoContext f148479a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.tools.view.a.c f148480b;

    /* renamed from: c  reason: collision with root package name */
    public final d f148481c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.tools.view.a.a f148482d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.sticker.a.a f148483e;

    static {
        Covode.recordClassIndex(97879);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.originalPanel.a$a  reason: collision with other inner class name */
    static final class C4011a implements com.ss.android.ugc.aweme.sticker.panel.c.d {

        /* renamed from: a  reason: collision with root package name */
        public final int f148484a;

        /* renamed from: b  reason: collision with root package name */
        public final List<g> f148485b;

        static {
            Covode.recordClassIndex(97880);
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.c.d
        public final int b() {
            return this.f148484a;
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.c.d
        public final List<String> a() {
            ArrayList arrayList = new ArrayList();
            for (g gVar : this.f148485b) {
                String str = gVar.effectId;
                l.b(str, "");
                arrayList.add(str);
            }
            return arrayList;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.sticker.model.g> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4011a(int i2, List<? extends g> list) {
            l.d(list, "");
            this.f148484a = i2;
            this.f148485b = list;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.e
    public final boolean a() {
        if (com.bytedance.ies.abmock.b.a().a(true, "studio_creators_names_clickable", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.e
    public final void b() {
        com.ss.android.ugc.tools.view.a.c cVar = this.f148480b;
        if (cVar != null) {
            cVar.a(this.f148482d);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.e
    public final void c() {
        com.ss.android.ugc.tools.view.a.c cVar = this.f148480b;
        if (cVar != null) {
            cVar.c(this.f148482d);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.e
    public final void d() {
        com.ss.android.ugc.tools.view.widget.d.a(this.f148481c, (int) R.string.h2y).b();
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.e
    public final void e() {
        com.bytedance.creativex.recorder.sticker.a.a aVar = this.f148483e;
        if (aVar instanceof j) {
            ((j) aVar).H();
        }
    }

    static final class c extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ h.f.a.b $listener;

        static {
            Covode.recordClassIndex(97882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h.f.a.b bVar) {
            super(1);
            this.$listener = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            this.$listener.invoke(Integer.valueOf(num.intValue()));
            return z.f158842a;
        }
    }

    public static final class b implements f.a.z<StickerItemList> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f148486a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f148487b;

        static {
            Covode.recordClassIndex(97881);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(StickerItemList stickerItemList) {
            StickerItemList stickerItemList2 = stickerItemList;
            l.d(stickerItemList2, "");
            i.f148471a = stickerItemList2.getCursor();
            h.f.a.b bVar = this.f148487b;
            int cursor = stickerItemList2.getCursor();
            List<g> stickers = stickerItemList2.getStickers();
            l.d(stickers, "");
            bVar.invoke(new C4011a(cursor, stickers));
        }

        b(a aVar, h.f.a.b bVar) {
            this.f148486a = aVar;
            this.f148487b = bVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.e
    public final void a(boolean z) {
        Map<String, String> map = new com.ss.android.ugc.tools.f.b().a("enter_from", "video_shoot_page").a("enter_method", "click_personal_board").f149193a;
        if (z) {
            r.a("follow", map);
        } else {
            r.a("follow_cancel", map);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.e
    public final int a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return com.ss.android.ugc.aweme.port.in.g.a().A().a(str, str2).m();
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.e
    public final void a(String str, int i2, h.f.a.b<? super com.ss.android.ugc.aweme.sticker.panel.c.d, z> bVar) {
        l.d(str, "");
        l.d(bVar, "");
        au C = com.ss.android.ugc.aweme.port.in.g.a().C();
        AVApi b2 = AVApiImpl.b();
        l.b(b2, "");
        String a2 = b2.a();
        l.b(a2, "");
        ((DesignerEffectInfo) C.retrofitCreate(a2, DesignerEffectInfo.class)).fetch(str, i2, 10).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new b(this, bVar));
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.e
    public final void a(String str, String str2, int i2, h.f.a.b<? super Integer, z> bVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(bVar, "");
        com.ss.android.ugc.aweme.port.in.g.a().A().a(str, str2, i2, new c(bVar));
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c.e
    public final void a(String str, String str2, String str3, int i2) {
        l.d(str, "");
        l.d(str3, "");
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f148479a.q).a("enter_method", "click_main_panel").a("enter_from", "video_shoot_page").a("prop_id", str).a("shoot_way", this.f148479a.r);
        if (str2 == null) {
            str2 = "";
        }
        r.a("click_prop_username", a2.a("tab_name", str2).a("is_original_prop", 1).a("prop_author_id", str3).a("order", i2).f149193a);
    }

    public a(ShortVideoContext shortVideoContext, com.ss.android.ugc.tools.view.a.c cVar, d dVar, com.ss.android.ugc.tools.view.a.a aVar, com.bytedance.creativex.recorder.sticker.a.a aVar2) {
        l.d(shortVideoContext, "");
        l.d(dVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f148479a = shortVideoContext;
        this.f148480b = cVar;
        this.f148481c = dVar;
        this.f148482d = aVar;
        this.f148483e = aVar2;
    }
}
