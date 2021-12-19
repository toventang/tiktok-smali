package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.m.p;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

public class b extends com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c {
    public PollingStickerLayout A;
    public boolean B;
    final com.ss.android.ugc.aweme.shortvideo.preview.a C;
    final VideoPublishEditModel D;
    private final String E = "poll_sticker_id";
    private final String F = "poll_sticker_tab_id";
    private final String G = "pi_start";
    private final String H = "pi_end";
    private final String I = ("pi_start" + "(.*?)" + "pi_end");
    private final int J = 160;
    private final int K = 170;
    private final int L = BuildConfig.VERSION_CODE;
    private final int M = 24;

    /* renamed from: a  reason: collision with root package name */
    PollStruct f127511a;

    /* renamed from: b  reason: collision with root package name */
    public String f127512b;

    /* renamed from: c  reason: collision with root package name */
    public String f127513c;

    static {
        Covode.recordClassIndex(83598);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final int f() {
        return R.string.ayb;
    }

    public static final class f extends com.google.gson.b.a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(83605);
        }

        f() {
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean b() {
        if (this.f127511a != null) {
            return true;
        }
        return false;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f127514a;

        static {
            Covode.recordClassIndex(83599);
        }

        a(b bVar) {
            this.f127514a = bVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127514a.f127193l;
            if (gVar != null) {
                gVar.b();
            }
        }
    }

    private final void s() {
        this.B = true;
        this.C.a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f127516a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f127517b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f127518c;

        static {
            Covode.recordClassIndex(83603);
        }

        d(b bVar, z.e eVar, z.e eVar2) {
            this.f127516a = bVar;
            this.f127517b = eVar;
            this.f127518c = eVar2;
        }

        public final void run() {
            PollingStickerLayout pollingStickerLayout = this.f127516a.A;
            if (pollingStickerLayout != null) {
                pollingStickerLayout.a((PollingStickerView) this.f127517b.element, (a) this.f127518c.element);
            }
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f127519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f127520b;

        static {
            Covode.recordClassIndex(83604);
        }

        e(b bVar, InteractStickerStruct interactStickerStruct) {
            this.f127519a = bVar;
            this.f127520b = interactStickerStruct;
        }

        public final void run() {
            b.super.a((b) this.f127520b);
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127519a.f127193l;
            if (gVar != null) {
                gVar.setVisibility(0);
            }
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f127521a;

        static {
            Covode.recordClassIndex(83606);
        }

        g(b bVar) {
            this.f127521a = bVar;
        }

        public final void run() {
            PollingStickerLayout pollingStickerLayout = this.f127521a.A;
            if (pollingStickerLayout != null) {
                pollingStickerLayout.a((PollingStickerView) null, new a((byte) 0));
            }
        }
    }

    private final String t() {
        return this.G + UUID.randomUUID().toString() + this.H;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.d.b
    public final InteractStickerStruct c() {
        InteractStickerStruct d2 = super.d(3);
        if (d2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(this.E, this.f127512b);
        hashMap.put(this.F, this.f127513c);
        d2.setAttr(com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().b(hashMap));
        d2.setPollStruct(this.f127511a);
        d2.setIndex(1);
        return d2;
    }

    public final void q() {
        if (this.f127511a != null) {
            r();
            return;
        }
        s();
        PollingStickerLayout pollingStickerLayout = this.A;
        if (pollingStickerLayout != null) {
            FrameLayout frameLayout = this.f127185d;
            l.b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f127185d;
            l.b(frameLayout2, "");
            pollingStickerLayout.a(height, (float) frameLayout2.getTop());
        }
        PollingStickerLayout pollingStickerLayout2 = this.A;
        if (pollingStickerLayout2 != null) {
            pollingStickerLayout2.post(new g(this));
        }
    }

    public final void r() {
        s();
        PollingStickerLayout pollingStickerLayout = this.A;
        if (pollingStickerLayout != null) {
            FrameLayout frameLayout = this.f127185d;
            l.b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f127185d;
            l.b(frameLayout2, "");
            pollingStickerLayout.a(height, (float) frameLayout2.getTop());
        }
        n();
        if (this.f127193l instanceof c) {
            z.e eVar = new z.e();
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127193l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollStickerView");
            eVar.element = (T) ((c) gVar).getBaseView();
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar2 = this.f127193l;
            Objects.requireNonNull(gVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollStickerView");
            ((c) gVar2).r();
            z.e eVar2 = new z.e();
            eVar2.element = (T) new a((byte) 0);
            eVar2.element.f127510f = eVar.element.getLastTouchedIndex();
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar3 = this.f127193l;
            l.b(gVar3, "");
            eVar2.element.f127507c = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c.b(gVar3.getRotateAngle());
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar4 = this.f127193l;
            l.b(gVar4, "");
            View contentView = gVar4.getContentView();
            l.b(contentView, "");
            eVar2.element.f127505a = contentView.getScaleX();
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar5 = this.f127193l;
            l.b(gVar5, "");
            View contentView2 = gVar5.getContentView();
            l.b(contentView2, "");
            eVar2.element.f127506b = contentView2.getScaleY();
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar6 = this.f127193l;
            l.b(gVar6, "");
            View contentView3 = gVar6.getContentView();
            l.b(contentView3, "");
            float x = contentView3.getX();
            FrameLayout frameLayout3 = this.f127185d;
            l.b(frameLayout3, "");
            eVar2.element.f127508d = x + frameLayout3.getX();
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar7 = this.f127193l;
            l.b(gVar7, "");
            View contentView4 = gVar7.getContentView();
            l.b(contentView4, "");
            float y = contentView4.getY();
            FrameLayout frameLayout4 = this.f127185d;
            l.b(frameLayout4, "");
            eVar2.element.f127509e = y + frameLayout4.getY();
            PollingStickerLayout pollingStickerLayout2 = this.A;
            if (pollingStickerLayout2 != null) {
                pollingStickerLayout2.post(new d(this, eVar, eVar2));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final com.ss.android.ugc.aweme.editSticker.interact.view.g a(Context context) {
        l.d(context, "");
        c cVar = new c(context);
        cVar.setLockMode(true);
        cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean a(com.ss.android.ugc.aweme.editSticker.interact.view.g gVar) {
        l.d(gVar, "");
        if (!(gVar instanceof c)) {
            return false;
        }
        super.a(gVar);
        this.f127511a = null;
        return false;
    }

    public static final class c extends m implements h.f.a.b<PollingStickerView, h.z> {
        final /* synthetic */ PollingStickerLayout $pollingStickerLayout;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(83602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, PollingStickerLayout pollingStickerLayout) {
            super(1);
            this.this$0 = bVar;
            this.$pollingStickerLayout = pollingStickerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(PollingStickerView pollingStickerView) {
            PollingStickerView pollingStickerView2 = pollingStickerView;
            if (this.this$0.f127193l == null || !(this.this$0.f127193l instanceof c)) {
                PollingStickerLayout pollingStickerLayout = this.this$0.A;
                if (pollingStickerLayout != null) {
                    pollingStickerLayout.a();
                }
            } else {
                com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.this$0.f127193l;
                Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollStickerView");
                float b2 = ((c) gVar).b(pollingStickerView2);
                PollingStickerLayout pollingStickerLayout2 = this.$pollingStickerLayout;
                if (pollingStickerLayout2 != null) {
                    pollingStickerLayout2.f127485g.f127509e += b2;
                }
                PollingStickerLayout pollingStickerLayout3 = this.this$0.A;
                if (pollingStickerLayout3 != null) {
                    pollingStickerLayout3.a();
                }
            }
            return h.z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b$b  reason: collision with other inner class name */
    public static final class C3313b extends m implements h.f.a.b<PollingStickerView, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(83600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3313b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(PollingStickerView pollingStickerView) {
            PollStruct pollStruct;
            PollingStickerView pollingStickerView2 = pollingStickerView;
            b bVar = this.this$0;
            bVar.B = false;
            bVar.C.a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
            VideoPublishEditModel videoPublishEditModel = bVar.D;
            l.d(videoPublishEditModel, "");
            r.a("poll_edit_complete", new com.ss.android.ugc.tools.f.b().a("creation_id", videoPublishEditModel.creationId).a("shoot_way", videoPublishEditModel.mShootWay).a("content_type", bl.a(videoPublishEditModel)).a("content_source", bl.b(videoPublishEditModel)).a("enter_from", "video_edit_page").a("prop_id", bVar.f127512b).f149193a);
            b bVar2 = this.this$0;
            if (bVar2.f127193l == null) {
                bVar2.a(false);
            }
            if (bVar2.f127193l instanceof c) {
                if (pollingStickerView2 != null) {
                    pollStruct = pollingStickerView2.getPollStruct();
                } else {
                    pollStruct = null;
                }
                bVar2.f127511a = pollStruct;
                if (pollingStickerView2 != null) {
                    pollingStickerView2.a();
                }
                com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = bVar2.f127193l;
                Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollStickerView");
                ((c) gVar).a(pollingStickerView2);
                com.ss.android.ugc.aweme.editSticker.interact.view.g gVar2 = bVar2.f127193l;
                if (gVar2 != null) {
                    gVar2.post(new a(bVar2));
                }
            }
            if (this.this$0.f127193l != null && (this.this$0.f127193l instanceof c)) {
                this.this$0.f127193l.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.b.C3313b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ C3313b f127515a;

                    static {
                        Covode.recordClassIndex(83601);
                    }

                    {
                        this.f127515a = r1;
                    }

                    public final void run() {
                        this.f127515a.this$0.f127193l.e();
                    }
                });
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct != null) {
            this.f127511a = interactStickerStruct.getPollStruct();
            a(true);
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127193l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.PollStickerView");
            ((c) gVar).a(this.f127511a);
            if (this.n != null) {
                this.n.f();
            }
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar2 = this.f127193l;
            l.b(gVar2, "");
            gVar2.setVisibility(4);
            HashMap hashMap = (HashMap) com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().a(interactStickerStruct.getAttr(), new f().type);
            this.f127512b = (String) hashMap.get(this.E);
            if (hashMap.containsKey(this.F)) {
                this.f127513c = (String) hashMap.get(this.F);
            }
        }
        if (this.f127193l != null) {
            this.f127193l.postDelayed(new e(this, interactStickerStruct), 300);
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

    public b(com.ss.android.ugc.aweme.shortvideo.preview.a aVar, VideoPublishEditModel videoPublishEditModel) {
        l.d(aVar, "");
        l.d(videoPublishEditModel, "");
        this.C = aVar;
        this.D = videoPublishEditModel;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(com.ss.android.ugc.asve.editor.g gVar, com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        PollingStickerLayout pollingStickerLayout;
        super.a(gVar, aVar);
        if (gVar != null) {
            float f2 = (float) gVar.b().height;
            FrameLayout frameLayout = this.f127185d;
            l.b(frameLayout, "");
            if (f2 > n.b(frameLayout.getContext(), (float) (this.L + this.M))) {
                PollingStickerLayout pollingStickerLayout2 = this.A;
                if (pollingStickerLayout2 != null) {
                    pollingStickerLayout2.setMaxLine(3);
                    return;
                }
                return;
            }
            FrameLayout frameLayout2 = this.f127185d;
            l.b(frameLayout2, "");
            if (f2 > n.b(frameLayout2.getContext(), (float) (this.K + this.M))) {
                PollingStickerLayout pollingStickerLayout3 = this.A;
                if (pollingStickerLayout3 != null) {
                    pollingStickerLayout3.setMaxLine(2);
                    return;
                }
                return;
            }
            FrameLayout frameLayout3 = this.f127185d;
            l.b(frameLayout3, "");
            if (f2 > n.b(frameLayout3.getContext(), (float) (this.J + this.M)) && (pollingStickerLayout = this.A) != null) {
                pollingStickerLayout.setMaxLine(1);
            }
        }
    }
}
