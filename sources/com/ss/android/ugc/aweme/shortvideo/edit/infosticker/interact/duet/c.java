package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.m.p;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

public class c extends com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c {
    public DuetEditStickerLayout A;
    public boolean B;
    final com.ss.android.ugc.aweme.shortvideo.preview.a C;
    public final VideoPublishEditModel D;
    private final String E = "duet_sticker_id";
    private final String F = "duet_sticker_tab_id";
    private final String G = "pi_start";
    private final String H = "pi_end";
    private final String I = ("pi_start" + "(.*?)" + "pi_end");

    /* renamed from: a  reason: collision with root package name */
    DuetStickerStruct f127308a;

    /* renamed from: b  reason: collision with root package name */
    public String f127309b;

    /* renamed from: c  reason: collision with root package name */
    public String f127310c;

    static {
        Covode.recordClassIndex(83485);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final int f() {
        return R.string.beo;
    }

    public static final class e extends com.google.gson.b.a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(83491);
        }

        e() {
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean b() {
        if (this.f127308a != null) {
            return true;
        }
        return false;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f127311a;

        static {
            Covode.recordClassIndex(83486);
        }

        a(c cVar) {
            this.f127311a = cVar;
        }

        public final void run() {
            g gVar = this.f127311a.f127193l;
            if (gVar != null) {
                gVar.b();
            }
        }
    }

    private final void s() {
        this.B = true;
        this.C.a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
        a(this.D);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c$c  reason: collision with other inner class name */
    static final class RunnableC3307c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f127313a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f127314b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f127315c;

        static {
            Covode.recordClassIndex(83489);
        }

        RunnableC3307c(c cVar, z.e eVar, z.e eVar2) {
            this.f127313a = cVar;
            this.f127314b = eVar;
            this.f127315c = eVar2;
        }

        public final void run() {
            DuetEditStickerLayout duetEditStickerLayout = this.f127313a.A;
            if (duetEditStickerLayout != null) {
                duetEditStickerLayout.a(this.f127314b.element, this.f127315c.element);
            }
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f127316a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f127317b;

        static {
            Covode.recordClassIndex(83490);
        }

        d(c cVar, InteractStickerStruct interactStickerStruct) {
            this.f127316a = cVar;
            this.f127317b = interactStickerStruct;
        }

        public final void run() {
            c.super.a((c) this.f127317b);
            g gVar = this.f127316a.f127193l;
            if (gVar != null) {
                gVar.setVisibility(0);
            }
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f127318a;

        static {
            Covode.recordClassIndex(83492);
        }

        f(c cVar) {
            this.f127318a = cVar;
        }

        public final void run() {
            DuetEditStickerLayout duetEditStickerLayout = this.f127318a.A;
            if (duetEditStickerLayout != null) {
                duetEditStickerLayout.a((DuetEditStickerView) null, new a((byte) 0));
            }
        }
    }

    private final String t() {
        return this.G + UUID.randomUUID().toString() + this.H;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.d.b
    public final InteractStickerStruct c() {
        InteractStickerStruct d2 = super.d(16);
        if (d2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(this.E, this.f127309b);
        hashMap.put(this.F, this.f127310c);
        d2.setAttr(com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().b(hashMap));
        d2.setDuetStickerStruct(this.f127308a);
        d2.setIndex(16);
        return d2;
    }

    public final void q() {
        if (this.f127308a != null) {
            DuetEditStickerLayout duetEditStickerLayout = this.A;
            if (duetEditStickerLayout != null) {
                new com.bytedance.tux.g.b(duetEditStickerLayout).e(R.string.bet).b();
                return;
            }
            return;
        }
        s();
        DuetEditStickerLayout duetEditStickerLayout2 = this.A;
        if (duetEditStickerLayout2 != null) {
            FrameLayout frameLayout = this.f127185d;
            l.b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f127185d;
            l.b(frameLayout2, "");
            duetEditStickerLayout2.a(height, (float) frameLayout2.getTop());
        }
        DuetEditStickerLayout duetEditStickerLayout3 = this.A;
        if (duetEditStickerLayout3 != null) {
            duetEditStickerLayout3.post(new f(this));
        }
    }

    public final void r() {
        s();
        DuetEditStickerLayout duetEditStickerLayout = this.A;
        if (duetEditStickerLayout != null) {
            FrameLayout frameLayout = this.f127185d;
            l.b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f127185d;
            l.b(frameLayout2, "");
            duetEditStickerLayout.a(height, (float) frameLayout2.getTop());
        }
        n();
        if (this.f127193l instanceof f) {
            z.e eVar = new z.e();
            g gVar = this.f127193l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetStickerView");
            eVar.element = (T) ((f) gVar).getDuetEditStickerView();
            g gVar2 = this.f127193l;
            Objects.requireNonNull(gVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetStickerView");
            ((f) gVar2).r();
            z.e eVar2 = new z.e();
            eVar2.element = (T) new a((byte) 0);
            g gVar3 = this.f127193l;
            l.b(gVar3, "");
            eVar2.element.f127266c = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c.b(gVar3.getRotateAngle());
            g gVar4 = this.f127193l;
            l.b(gVar4, "");
            View contentView = gVar4.getContentView();
            l.b(contentView, "");
            eVar2.element.f127264a = contentView.getScaleX();
            g gVar5 = this.f127193l;
            l.b(gVar5, "");
            View contentView2 = gVar5.getContentView();
            l.b(contentView2, "");
            eVar2.element.f127265b = contentView2.getScaleY();
            g gVar6 = this.f127193l;
            l.b(gVar6, "");
            View contentView3 = gVar6.getContentView();
            l.b(contentView3, "");
            float x = contentView3.getX();
            FrameLayout frameLayout3 = this.f127185d;
            l.b(frameLayout3, "");
            eVar2.element.f127267d = x + frameLayout3.getX();
            g gVar7 = this.f127193l;
            l.b(gVar7, "");
            View contentView4 = gVar7.getContentView();
            l.b(contentView4, "");
            float y = contentView4.getY();
            FrameLayout frameLayout4 = this.f127185d;
            l.b(frameLayout4, "");
            eVar2.element.f127268e = y + frameLayout4.getY();
            DuetEditStickerLayout duetEditStickerLayout2 = this.A;
            if (duetEditStickerLayout2 != null) {
                duetEditStickerLayout2.post(new RunnableC3307c(this, eVar, eVar2));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final g a(Context context) {
        l.d(context, "");
        f fVar = new f(context, this.D);
        fVar.setLockMode(true);
        fVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return fVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean a(g gVar) {
        l.d(gVar, "");
        if (!(gVar instanceof f)) {
            return false;
        }
        super.a(gVar);
        this.f127308a = null;
        return false;
    }

    public static final class b extends m implements h.f.a.b<DuetEditStickerView, h.z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(83487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(DuetEditStickerView duetEditStickerView) {
            DuetStickerStruct duetStickerStruct;
            float f2;
            DuetEditStickerView duetEditStickerView2 = duetEditStickerView;
            c cVar = this.this$0;
            cVar.B = false;
            cVar.C.a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
            c cVar2 = this.this$0;
            if (cVar2.f127193l == null) {
                cVar2.a(false);
                g gVar = cVar2.f127193l;
                if (gVar != null) {
                    if (duetEditStickerView2 != null) {
                        f2 = duetEditStickerView2.getScaleValue();
                    } else {
                        f2 = 1.0f;
                    }
                    gVar.a(f2);
                }
            }
            if (cVar2.f127193l instanceof f) {
                if (duetEditStickerView2 != null) {
                    duetStickerStruct = duetEditStickerView2.getDuetStruct();
                } else {
                    duetStickerStruct = null;
                }
                cVar2.f127308a = duetStickerStruct;
                g gVar2 = cVar2.f127193l;
                Objects.requireNonNull(gVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetStickerView");
                ((f) gVar2).a(duetEditStickerView2);
                g gVar3 = cVar2.f127193l;
                if (gVar3 != null) {
                    gVar3.post(new a(cVar2));
                }
            }
            if (this.this$0.f127193l != null && (this.this$0.f127193l instanceof f)) {
                this.this$0.f127193l.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.c.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f127312a;

                    static {
                        Covode.recordClassIndex(83488);
                    }

                    {
                        this.f127312a = r1;
                    }

                    public final void run() {
                        g gVar = this.f127312a.this$0.f127193l;
                        if (gVar != null) {
                            gVar.e();
                        }
                    }
                });
            }
            return h.z.f158842a;
        }
    }

    private static void a(VideoPublishEditModel videoPublishEditModel) {
        String str;
        l.d(videoPublishEditModel, "");
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", videoPublishEditModel.creationId);
        com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.g.a().A().e();
        if (e2 != null) {
            str = e2.c();
        } else {
            str = null;
        }
        r.a("enter_duet_sticker_settings", a2.a("user_id", str).a("content_source", bl.b(videoPublishEditModel)).a("enter_from", "video_edit_page").a("shoot_entrance", videoPublishEditModel.mShootWay).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct != null) {
            this.f127308a = interactStickerStruct.getDuetStickerStruct();
            a(true);
            g gVar = this.f127193l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetStickerView");
            ((f) gVar).a(this.f127308a);
            if (this.n != null) {
                this.n.f();
            }
            g gVar2 = this.f127193l;
            l.b(gVar2, "");
            gVar2.setVisibility(4);
            HashMap hashMap = (HashMap) com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().a(interactStickerStruct.getAttr(), new e().type);
            this.f127309b = (String) hashMap.get(this.E);
            if (hashMap.containsKey(this.F)) {
                this.f127310c = (String) hashMap.get(this.F);
            }
        }
        if (this.f127193l != null) {
            this.f127193l.postDelayed(new d(this, interactStickerStruct), 300);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(String str) {
        l.d(str, "");
        if (com.bytedance.common.utility.m.a(str)) {
            return;
        }
        if (!p.a((CharSequence) str, (CharSequence) this.G, false) || !p.a((CharSequence) str, (CharSequence) this.H, false)) {
            String str2 = File.separator;
            l.b(str2, "");
            if (p.c(str, str2, false)) {
                super.a(str + t());
            } else {
                super.a(str + t());
            }
        } else {
            super.a(new h.m.l(this.I).replace(str, t()));
        }
    }

    public c(com.ss.android.ugc.aweme.shortvideo.preview.a aVar, VideoPublishEditModel videoPublishEditModel) {
        l.d(aVar, "");
        l.d(videoPublishEditModel, "");
        this.C = aVar;
        this.D = videoPublishEditModel;
    }
}
