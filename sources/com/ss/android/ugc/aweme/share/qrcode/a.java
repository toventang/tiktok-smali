package com.ss.android.ugc.aweme.share.qrcode;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.improve.a.aw;
import com.ss.android.ugc.aweme.share.qrcode.b.a;
import com.ss.android.ugc.aweme.share.qrcode.view.QRCodeSquareView;
import com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a extends Dialog {

    /* renamed from: d  reason: collision with root package name */
    public static final C3232a f124178d = new C3232a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public QRCodeSquareView f124179a;

    /* renamed from: b  reason: collision with root package name */
    public View f124180b;

    /* renamed from: c  reason: collision with root package name */
    public final String f124181c;

    /* renamed from: e  reason: collision with root package name */
    private ShareChannelBar f124182e;

    /* renamed from: f  reason: collision with root package name */
    private View f124183f;

    /* renamed from: g  reason: collision with root package name */
    private LinearLayout f124184g;

    /* renamed from: h  reason: collision with root package name */
    private final String f124185h;

    /* renamed from: i  reason: collision with root package name */
    private final long f124186i;

    /* renamed from: j  reason: collision with root package name */
    private final int f124187j;

    /* renamed from: k  reason: collision with root package name */
    private final String f124188k;

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final g f124197a = new g();

        static {
            Covode.recordClassIndex(81565);
        }

        g() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final j f124200a = new j();

        static {
            Covode.recordClassIndex(81568);
        }

        j() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(81557);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a$a  reason: collision with other inner class name */
    public static final class C3232a {
        static {
            Covode.recordClassIndex(81558);
        }

        private C3232a() {
        }

        public /* synthetic */ C3232a(byte b2) {
            this();
        }
    }

    static final class k extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(81569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Context context = this.this$0.getContext();
            l.b(context, "");
            a.C3235a.a(context, this.this$0.f124180b, this.this$0.f124179a, true, false, (a.C3235a.AbstractC3236a) null);
            return z.f158842a;
        }
    }

    public static final class f implements com.ss.android.ugc.aweme.sharer.ui.bar.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f124194a;

        static {
            Covode.recordClassIndex(81563);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(a aVar) {
            this.f124194a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.bar.f
        public final void a_(com.ss.android.ugc.aweme.sharer.b bVar) {
            l.d(bVar, "");
            if (bVar instanceof com.ss.android.ugc.aweme.share.qrcode.a.a) {
                a aVar = this.f124194a;
                Context context = aVar.getContext();
                l.b(context, "");
                Activity a2 = com.ss.android.ugc.aweme.share.improve.c.b.a(context);
                if (a2 != null) {
                    aw.a(a2, new k(aVar));
                }
            } else {
                com.ss.android.ugc.aweme.share.i.a.a().a(bVar.a(), 0);
                Context context2 = this.f124194a.getContext();
                l.b(context2, "");
                a.C3235a.a(context2, this.f124194a.f124180b, this.f124194a.f124179a, false, true, (a.C3235a.AbstractC3236a) new C3234a(this, bVar));
            }
            QRCodeSquareView qRCodeSquareView = this.f124194a.f124179a;
            if (qRCodeSquareView != null && qRCodeSquareView.f124222b) {
                this.f124194a.dismiss();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.qrcode.a$f$a  reason: collision with other inner class name */
        public static final class C3234a implements a.C3235a.AbstractC3236a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f124195a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f124196b;

            static {
                Covode.recordClassIndex(81564);
            }

            C3234a(f fVar, com.ss.android.ugc.aweme.sharer.b bVar) {
                this.f124195a = fVar;
                this.f124196b = bVar;
            }

            @Override // com.ss.android.ugc.aweme.share.qrcode.b.a.C3235a.AbstractC3236a
            public final void a(Uri uri, String str, boolean z) {
                com.ss.android.ugc.aweme.sharer.l lVar;
                if (z) {
                    if (str != null) {
                        lVar = new com.ss.android.ugc.aweme.sharer.l(com.ss.android.ugc.aweme.share.improve.c.c.a(str, com.bytedance.ies.ugc.appcontext.d.a()), str, null, 60);
                    } else {
                        return;
                    }
                } else if (uri != null) {
                    String a2 = c.d.a.a(this.f124195a.f124194a.getContext(), uri);
                    l.b(a2, "");
                    lVar = new com.ss.android.ugc.aweme.sharer.l(uri, a2, null, 60);
                } else {
                    return;
                }
                com.ss.android.ugc.aweme.sharer.b bVar = this.f124196b;
                String str2 = lVar.f124580g;
                if (str2 == null) {
                    str2 = "";
                }
                lVar.a("content_url", str2);
                lVar.a("media_type", "image/png");
                Context context = this.f124195a.f124194a.getContext();
                l.b(context, "");
                bVar.a(lVar, context);
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f124192a;

        static {
            Covode.recordClassIndex(81559);
        }

        b(a aVar) {
            this.f124192a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f124192a.dismiss();
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f124198a;

        static {
            Covode.recordClassIndex(81566);
        }

        h(a aVar) {
            this.f124198a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f124198a.dismiss();
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f124199a;

        static {
            Covode.recordClassIndex(81567);
        }

        i(a aVar) {
            this.f124199a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f124199a.dismiss();
        }
    }

    static final class e extends m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.b, Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(81562);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sharer.b bVar) {
            com.ss.android.ugc.aweme.sharer.b bVar2 = bVar;
            l.d(bVar2, "");
            Context context = this.this$0.getContext();
            l.b(context, "");
            return Boolean.valueOf(!bVar2.b(context));
        }
    }

    static final class c extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(81560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            int i2;
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            String str = this.this$0.f124181c;
            int hashCode = str.hashCode();
            if (hashCode != -1890252483) {
                if (hashCode != 112100) {
                    if (hashCode == 104263205 && str.equals("music")) {
                        i2 = R.raw.icon_music_note;
                        aVar2.f44749a = i2;
                        aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
                        Resources system = Resources.getSystem();
                        l.a((Object) system, "");
                        aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
                        Resources system2 = Resources.getSystem();
                        l.a((Object) system2, "");
                        aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
                        return z.f158842a;
                    }
                } else if (str.equals("qna")) {
                    i2 = R.raw.icon_qa_ltr;
                    aVar2.f44749a = i2;
                    aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
                    Resources system3 = Resources.getSystem();
                    l.a((Object) system3, "");
                    aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system3.getDisplayMetrics()));
                    Resources system22 = Resources.getSystem();
                    l.a((Object) system22, "");
                    aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system22.getDisplayMetrics()));
                    return z.f158842a;
                }
            } else if (str.equals("sticker")) {
                i2 = R.raw.icon_effect;
                aVar2.f44749a = i2;
                aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
                Resources system32 = Resources.getSystem();
                l.a((Object) system32, "");
                aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system32.getDisplayMetrics()));
                Resources system222 = Resources.getSystem();
                l.a((Object) system222, "");
                aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system222.getDisplayMetrics()));
                return z.f158842a;
            }
            i2 = R.raw.icon_number;
            aVar2.f44749a = i2;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
            Resources system322 = Resources.getSystem();
            l.a((Object) system322, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system322.getDisplayMetrics()));
            Resources system2222 = Resources.getSystem();
            l.a((Object) system2222, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system2222.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.tux.c.e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f124193a = new d();

        static {
            Covode.recordClassIndex(81561);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44776b = Integer.valueOf((int) R.attr.w);
            eVar2.f44780f = Integer.valueOf((int) R.attr.an);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44778d = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            eVar2.f44782h = h.g.a.a(TypedValue.applyDimension(1, 44.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            eVar2.f44781g = h.g.a.a(TypedValue.applyDimension(1, 44.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 44.0f, system4.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0300  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
        // Method dump skipped, instructions count: 860
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.qrcode.a.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context, String str, long j2, String str2, int i2, String str3) {
        super(context, R.style.a1b);
        l.d(context, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f124185h = str;
        this.f124186i = j2;
        this.f124181c = str2;
        this.f124187j = i2;
        this.f124188k = str3;
    }

    public /* synthetic */ a(Context context, String str, long j2, String str2, int i2, String str3, byte b2) {
        this(context, str, j2, str2, i2, str3);
    }
}
