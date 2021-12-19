package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerView;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.tools.view.widget.AVTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

public final class a extends com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c {
    public static final C3312a D = new C3312a((byte) 0);
    public boolean A;
    public CountDownStickerStruct B;
    final com.ss.android.ugc.aweme.shortvideo.preview.a C;

    /* renamed from: a  reason: collision with root package name */
    public String f127466a;

    /* renamed from: b  reason: collision with root package name */
    public String f127467b;

    /* renamed from: c  reason: collision with root package name */
    public LiveCDEditStickerLayout f127468c;

    static {
        Covode.recordClassIndex(83574);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final int f() {
        return R.string.ayb;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a$a  reason: collision with other inner class name */
    public static final class C3312a {
        static {
            Covode.recordClassIndex(83575);
        }

        private C3312a() {
        }

        public /* synthetic */ C3312a(byte b2) {
            this();
        }
    }

    public static final class g extends com.google.gson.b.a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(83582);
        }

        g() {
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f127469a;

        static {
            Covode.recordClassIndex(83576);
        }

        b(a aVar) {
            this.f127469a = aVar;
        }

        public final void run() {
            this.f127469a.f127193l.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean b() {
        if (this.B != null) {
            return true;
        }
        return false;
    }

    private final void s() {
        this.A = true;
        this.C.a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f127471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveCDEditStickerView f127472b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.a f127473c;

        static {
            Covode.recordClassIndex(83580);
        }

        e(a aVar, LiveCDEditStickerView liveCDEditStickerView, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.a aVar2) {
            this.f127471a = aVar;
            this.f127472b = liveCDEditStickerView;
            this.f127473c = aVar2;
        }

        public final void run() {
            AVTextView aVTextView;
            LiveCDEditStickerLayout liveCDEditStickerLayout = this.f127471a.f127468c;
            if (!(liveCDEditStickerLayout == null || (aVTextView = liveCDEditStickerLayout.f127409d) == null)) {
                aVTextView.setVisibility(8);
            }
            LiveCDEditStickerLayout liveCDEditStickerLayout2 = this.f127471a.f127468c;
            if (liveCDEditStickerLayout2 != null) {
                liveCDEditStickerLayout2.a(this.f127472b, this.f127473c);
            }
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f127474a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f127475b;

        static {
            Covode.recordClassIndex(83581);
        }

        f(a aVar, InteractStickerStruct interactStickerStruct) {
            this.f127474a = aVar;
            this.f127475b = interactStickerStruct;
        }

        public final void run() {
            a.super.a((a) this.f127475b);
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127474a.f127193l;
            if (gVar != null) {
                gVar.setVisibility(0);
            }
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f127476a;

        static {
            Covode.recordClassIndex(83583);
        }

        h(a aVar) {
            this.f127476a = aVar;
        }

        public final void run() {
            AVTextView aVTextView;
            LiveCDEditStickerLayout liveCDEditStickerLayout = this.f127476a.f127468c;
            if (!(liveCDEditStickerLayout == null || (aVTextView = liveCDEditStickerLayout.f127409d) == null)) {
                aVTextView.setVisibility(0);
            }
            LiveCDEditStickerLayout liveCDEditStickerLayout2 = this.f127476a.f127468c;
            if (liveCDEditStickerLayout2 != null) {
                liveCDEditStickerLayout2.a((LiveCDEditStickerView) null, new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.a((byte) 0));
            }
        }
    }

    private static String t() {
        return "pi_start" + UUID.randomUUID().toString() + "pi_end";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.d.b
    public final InteractStickerStruct c() {
        InteractStickerStruct d2 = super.d(10);
        if (d2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("livecd_sticker_id", this.f127466a);
        hashMap.put("livecd_sticker_tab_id", this.f127467b);
        d2.setAttr(com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().b(hashMap));
        d2.setIndex(3);
        d2.setCountDownStickerStruct(this.B);
        return d2;
    }

    public final void q() {
        if (this.B != null) {
            LiveCDEditStickerLayout liveCDEditStickerLayout = this.f127468c;
            if (liveCDEditStickerLayout == null) {
                l.b();
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(liveCDEditStickerLayout.getContext()).a(R.string.avg).a();
            return;
        }
        s();
        LiveCDEditStickerLayout liveCDEditStickerLayout2 = this.f127468c;
        if (liveCDEditStickerLayout2 != null) {
            FrameLayout frameLayout = this.f127185d;
            l.b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f127185d;
            l.b(frameLayout2, "");
            liveCDEditStickerLayout2.a(height, (float) frameLayout2.getTop());
        }
        LiveCDEditStickerLayout liveCDEditStickerLayout3 = this.f127468c;
        if (liveCDEditStickerLayout3 != null) {
            liveCDEditStickerLayout3.post(new h(this));
        }
    }

    public final void r() {
        s();
        LiveCDEditStickerLayout liveCDEditStickerLayout = this.f127468c;
        if (liveCDEditStickerLayout != null) {
            FrameLayout frameLayout = this.f127185d;
            l.b(frameLayout, "");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f127185d;
            l.b(frameLayout2, "");
            liveCDEditStickerLayout.a(height, (float) frameLayout2.getTop());
        }
        n();
        if (this.f127193l instanceof b) {
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127193l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDStickerView");
            LiveCDEditStickerView baseView = ((b) gVar).getBaseView();
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar2 = this.f127193l;
            Objects.requireNonNull(gVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDStickerView");
            ((b) gVar2).s();
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.a aVar = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.a((byte) 0);
            aVar.f127458f = 0;
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar3 = this.f127193l;
            l.b(gVar3, "");
            aVar.f127455c = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c.b(gVar3.getRotateAngle());
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar4 = this.f127193l;
            l.b(gVar4, "");
            View contentView = gVar4.getContentView();
            l.b(contentView, "");
            aVar.f127453a = contentView.getScaleX();
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar5 = this.f127193l;
            l.b(gVar5, "");
            View contentView2 = gVar5.getContentView();
            l.b(contentView2, "");
            aVar.f127454b = contentView2.getScaleY();
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar6 = this.f127193l;
            l.b(gVar6, "");
            View contentView3 = gVar6.getContentView();
            l.b(contentView3, "");
            float x = contentView3.getX();
            FrameLayout frameLayout3 = this.f127185d;
            l.b(frameLayout3, "");
            aVar.f127456d = x + frameLayout3.getX();
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar7 = this.f127193l;
            l.b(gVar7, "");
            View contentView4 = gVar7.getContentView();
            l.b(contentView4, "");
            float y = contentView4.getY();
            FrameLayout frameLayout4 = this.f127185d;
            l.b(frameLayout4, "");
            aVar.f127457e = y + frameLayout4.getY();
            LiveCDEditStickerLayout liveCDEditStickerLayout2 = this.f127468c;
            if (liveCDEditStickerLayout2 != null) {
                liveCDEditStickerLayout2.post(new e(this, baseView, aVar));
            }
        }
    }

    public a(com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        l.d(aVar, "");
        this.C = aVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final com.ss.android.ugc.aweme.editSticker.interact.view.g a(Context context) {
        l.d(context, "");
        b bVar = new b(context);
        bVar.setLockMode(true);
        bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return bVar;
    }

    public static final class d extends m implements h.f.a.b<LiveCDEditStickerView, z> {
        final /* synthetic */ LiveCDEditStickerLayout $liveCDEditStickerLayout;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(83579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(a aVar, LiveCDEditStickerLayout liveCDEditStickerLayout) {
            super(1);
            this.this$0 = aVar;
            this.$liveCDEditStickerLayout = liveCDEditStickerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(LiveCDEditStickerView liveCDEditStickerView) {
            if (this.this$0.f127193l == null || !(this.this$0.f127193l instanceof b)) {
                LiveCDEditStickerLayout liveCDEditStickerLayout = this.this$0.f127468c;
                if (liveCDEditStickerLayout != null) {
                    liveCDEditStickerLayout.b();
                }
            } else {
                com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.this$0.f127193l;
                Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDStickerView");
                this.$liveCDEditStickerLayout.f127414i.f127457e += ((b) gVar).r();
                LiveCDEditStickerLayout liveCDEditStickerLayout2 = this.this$0.f127468c;
                if (liveCDEditStickerLayout2 != null) {
                    liveCDEditStickerLayout2.b();
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final boolean a(com.ss.android.ugc.aweme.editSticker.interact.view.g gVar) {
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.d dVar;
        l.d(gVar, "");
        if (gVar instanceof b) {
            LiveCDEditStickerLayout liveCDEditStickerLayout = this.f127468c;
            if (!(liveCDEditStickerLayout == null || (dVar = liveCDEditStickerLayout.u) == null)) {
                dVar.b(false);
            }
            super.a(gVar);
            this.B = null;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct != null) {
            a(true);
            this.B = interactStickerStruct.getCountDownStickerStruct();
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = this.f127193l;
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDStickerView");
            ((b) gVar).a(this.B);
            if (this.n != null) {
                this.n.f();
            }
            com.ss.android.ugc.aweme.editSticker.interact.view.g gVar2 = this.f127193l;
            l.b(gVar2, "");
            gVar2.setVisibility(4);
            HashMap hashMap = (HashMap) com.ss.android.ugc.aweme.port.in.g.a().C().getRetrofitFactoryGson().a(interactStickerStruct.getAttr(), new g().type);
            this.f127466a = (String) hashMap.get("livecd_sticker_id");
            if (hashMap.containsKey("livecd_sticker_tab_id")) {
                this.f127467b = (String) hashMap.get("livecd_sticker_tab_id");
            }
        }
        if (this.f127193l != null) {
            this.f127193l.postDelayed(new f(this, interactStickerStruct), 300);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(String str) {
        l.d(str, "");
        if (com.bytedance.common.utility.m.a(str)) {
            return;
        }
        if (!p.a((CharSequence) str, (CharSequence) "pi_start", false) || !p.a((CharSequence) str, (CharSequence) "pi_end", false)) {
            String str2 = File.separator;
            l.b(str2, "");
            if (p.c(str, str2, false)) {
                super.a(str + t());
            } else {
                super.a(str + t());
            }
        } else {
            super.a(new h.m.l("pi_start(.*?)pi_end").replace(str, t()));
        }
    }

    public static final class c extends m implements h.f.a.m<LiveCDEditStickerView, Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(83577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(LiveCDEditStickerView liveCDEditStickerView, Boolean bool) {
            CountDownStickerStruct countDownStickerStruct;
            LiveCDEditStickerView liveCDEditStickerView2 = liveCDEditStickerView;
            boolean booleanValue = bool.booleanValue();
            a aVar = this.this$0;
            aVar.A = false;
            aVar.C.a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
            if (!booleanValue) {
                a aVar2 = this.this$0;
                if (aVar2.f127193l == null) {
                    aVar2.a(false);
                }
                if (aVar2.f127193l instanceof b) {
                    if (liveCDEditStickerView2 != null) {
                        countDownStickerStruct = liveCDEditStickerView2.getLiveCDStruct();
                    } else {
                        countDownStickerStruct = null;
                    }
                    aVar2.B = countDownStickerStruct;
                    com.ss.android.ugc.aweme.editSticker.interact.view.g gVar = aVar2.f127193l;
                    Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.LiveCDStickerView");
                    ((b) gVar).a(liveCDEditStickerView2);
                    aVar2.f127193l.post(new b(aVar2));
                }
                if (this.this$0.f127193l != null && (this.this$0.f127193l instanceof b)) {
                    this.this$0.f127193l.post(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a.c.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ c f127470a;

                        static {
                            Covode.recordClassIndex(83578);
                        }

                        {
                            this.f127470a = r1;
                        }

                        public final void run() {
                            this.f127470a.this$0.f127193l.e();
                        }
                    });
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.c
    public final void a(com.ss.android.ugc.asve.editor.g gVar, com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        LiveCDEditStickerLayout liveCDEditStickerLayout;
        super.a(gVar, aVar);
        if (gVar != null) {
            float f2 = (float) gVar.b().height;
            FrameLayout frameLayout = this.f127185d;
            l.b(frameLayout, "");
            if (f2 > n.b(frameLayout.getContext(), 214.0f)) {
                LiveCDEditStickerLayout liveCDEditStickerLayout2 = this.f127468c;
                if (liveCDEditStickerLayout2 != null) {
                    liveCDEditStickerLayout2.setMaxLine(3);
                    return;
                }
                return;
            }
            FrameLayout frameLayout2 = this.f127185d;
            l.b(frameLayout2, "");
            if (f2 > n.b(frameLayout2.getContext(), 194.0f)) {
                LiveCDEditStickerLayout liveCDEditStickerLayout3 = this.f127468c;
                if (liveCDEditStickerLayout3 != null) {
                    liveCDEditStickerLayout3.setMaxLine(2);
                    return;
                }
                return;
            }
            FrameLayout frameLayout3 = this.f127185d;
            l.b(frameLayout3, "");
            if (f2 > n.b(frameLayout3.getContext(), 184.0f) && (liveCDEditStickerLayout = this.f127468c) != null) {
                liveCDEditStickerLayout.setMaxLine(1);
            }
        }
    }
}
