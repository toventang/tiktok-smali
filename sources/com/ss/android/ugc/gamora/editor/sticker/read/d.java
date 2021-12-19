package com.ss.android.ugc.gamora.editor.sticker.read;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.aweme.view.b;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextV2Api;
import com.zhiliaoapp.musically.R;
import dmt.av.video.u;
import h.f.b.z;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class d extends com.bytedance.scene.j implements com.bytedance.jedi.arch.b, com.bytedance.o.a {
    public static final C3940d D = new C3940d((byte) 0);
    public boolean A;
    public com.ss.android.ugc.aweme.view.b B;
    public final com.ss.android.ugc.gamora.editor.sticker.read.a.b C;
    private HashMap<e, h.p<File, Integer>> E = new HashMap<>(20);
    private InputMethodManager F;
    private com.ss.android.ugc.tools.view.a.c G;
    private final h.h H = h.i.a(h.m.NONE, new a(this));
    private final h.h I = h.i.a(h.m.NONE, new b(this));
    private final h.h J = h.i.a(h.m.NONE, new c(this));
    private final h.h K = h.i.a((h.f.a.a) new u(this));
    private final h.h L = h.i.a((h.f.a.a) new l(this));
    private final h.h M = h.i.a((h.f.a.a) new o(this));
    private ViewGroup N;
    private RelativeLayout O;
    private LinearLayout P;
    private TuxButton Q;
    private TuxTextView R;
    private final h.h S = h.i.a((h.f.a.a) new m(this));
    private String T = "";
    private final List<String> U = new ArrayList();
    private TextStickerData V;
    private final n W = new n(this);
    private final com.bytedance.o.f X;

    /* renamed from: a  reason: collision with root package name */
    public DmtStatusView f146855a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<b> f146856b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<b> f146857c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final List<b> f146858d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f146859e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f146860f;

    /* renamed from: g  reason: collision with root package name */
    public TuxCheckBox f146861g;

    /* renamed from: h  reason: collision with root package name */
    public View f146862h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f146863i;

    /* renamed from: j  reason: collision with root package name */
    public SafeHandler f146864j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f146865k;

    /* renamed from: l  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.text.view.q f146866l;
    public int t = -1;
    public int u;
    public boolean v;
    public f w;
    public ArrayList<f> x = new ArrayList<>();
    public String y = "";
    public String z = "";

    static {
        Covode.recordClassIndex(96728);
    }

    private final com.ss.android.ugc.gamora.editor.progress.a F() {
        return (com.ss.android.ugc.gamora.editor.progress.a) this.I.getValue();
    }

    private final com.ss.android.ugc.gamora.editor.progressbar.a G() {
        return (com.ss.android.ugc.gamora.editor.progressbar.a) this.J.getValue();
    }

    private final com.ss.android.ugc.tools.b.a.d H() {
        return (com.ss.android.ugc.tools.b.a.d) this.S.getValue();
    }

    public final ReadTextViewModel C() {
        return (ReadTextViewModel) this.M.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a a() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.H.getValue();
    }

    public final VideoPublishEditModel b() {
        return (VideoPublishEditModel) this.K.getValue();
    }

    public final EditTextStickerViewModel d() {
        return (EditTextStickerViewModel) this.L.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$d  reason: collision with other inner class name */
    public static final class C3940d {
        static {
            Covode.recordClassIndex(96732);
        }

        private C3940d() {
        }

        public /* synthetic */ C3940d(byte b2) {
            this();
        }
    }

    public static final class g implements b.c {
        static {
            Covode.recordClassIndex(96735);
        }

        @Override // com.ss.android.ugc.aweme.view.b.c
        public final void a() {
        }

        g() {
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.X;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.ae6);
        h.f.b.l.b(c2, "");
        this.O = (RelativeLayout) c2;
        View c3 = c(R.id.ejd);
        h.f.b.l.b(c3, "");
        this.f146860f = (TextView) c3;
        View c4 = c(R.id.a1s);
        h.f.b.l.b(c4, "");
        this.Q = (TuxButton) c4;
        View c5 = c(R.id.atz);
        h.f.b.l.b(c5, "");
        this.P = (LinearLayout) c5;
        View c6 = c(R.id.a5_);
        h.f.b.l.b(c6, "");
        this.f146861g = (TuxCheckBox) c6;
        View c7 = c(R.id.a5c);
        h.f.b.l.b(c7, "");
        this.R = (TuxTextView) c7;
        View c8 = c(R.id.d60);
        h.f.b.l.b(c8, "");
        this.f146862h = c8;
        if (c8 == null) {
            h.f.b.l.a("playView");
        }
        c8.setVisibility(8);
        TuxCheckBox tuxCheckBox = this.f146861g;
        if (tuxCheckBox == null) {
            h.f.b.l.a("checkbox");
        }
        tuxCheckBox.setVisibility(8);
        TuxTextView tuxTextView = this.R;
        if (tuxTextView == null) {
            h.f.b.l.a("checkboxText");
        }
        tuxTextView.setVisibility(8);
        if (k.b()) {
            this.f146863i = true;
        }
        TuxTextView tuxTextView2 = this.R;
        if (tuxTextView2 == null) {
            h.f.b.l.a("checkboxText");
        }
        tuxTextView2.setOnClickListener(new p(this));
        TuxCheckBox tuxCheckBox2 = this.f146861g;
        if (tuxCheckBox2 == null) {
            h.f.b.l.a("checkbox");
        }
        tuxCheckBox2.setOnCheckedChangeListener(new q(this));
        TuxButton tuxButton = this.Q;
        if (tuxButton == null) {
            h.f.b.l.a("cancelView");
        }
        tuxButton.setOnClickListener(new r(this));
        TuxButton tuxButton2 = this.Q;
        if (tuxButton2 == null) {
            h.f.b.l.a("cancelView");
        }
        tuxButton2.setBackgroundColor(Color.parseColor("#10FFFFFF"));
        TextView textView = this.f146860f;
        if (textView == null) {
            h.f.b.l.a("textDone");
        }
        textView.setOnClickListener(new s(this));
        View view = this.f146862h;
        if (view == null) {
            h.f.b.l.a("playView");
        }
        Activity activity = this.f42913m;
        if (activity == null) {
            h.f.b.l.b();
        }
        view.setTranslationY(-com.bytedance.common.utility.n.b(activity, 69.5f));
        ViewGroup viewGroup = this.N;
        if (viewGroup == null) {
            h.f.b.l.a("parentLayout");
        }
        viewGroup.setOnClickListener(new t(this));
        Activity t2 = t();
        Objects.requireNonNull(t2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f146864j = new SafeHandler((androidx.fragment.app.e) t2);
        DmtStatusView dmtStatusView = (DmtStatusView) c(R.id.ci4);
        this.f146855a = dmtStatusView;
        if (dmtStatusView != null) {
            DmtStatusView.a a2 = DmtStatusView.a.a(this.f42913m);
            a2.f33605g = 1;
            dmtStatusView.setBuilder(a2);
        }
        DmtStatusView dmtStatusView2 = this.f146855a;
        if (dmtStatusView2 != null) {
            dmtStatusView2.f();
        }
        if (this.f42913m instanceof com.ss.android.ugc.tools.view.a.c) {
            Activity activity2 = this.f42913m;
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
            this.G = (com.ss.android.ugc.tools.view.a.c) activity2;
        }
        Activity activity3 = this.f42913m;
        Object a3 = activity3 != null ? a(activity3, "input_method") : null;
        Objects.requireNonNull(a3, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.F = (InputMethodManager) a3;
    }

    public final void a(String str) {
        TuxTextView tuxTextView = this.R;
        if (tuxTextView == null) {
            h.f.b.l.a("checkboxText");
        }
        tuxTextView.setText(t().getResources().getString(R.string.hd6, str));
    }

    public final void a(boolean z2, boolean z3, com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
        String str;
        DmtStatusView dmtStatusView;
        a().a((com.ss.android.ugc.aweme.shortvideo.preview.a) (!z2), false, r0);
        d().f88315a = z2;
        String str2 = "";
        if (!z2) {
            I();
            com.ss.android.ugc.asve.editor.g value = a().C().getValue();
            if (value != null) {
                value.a(true);
            }
            a().v().setValue(dmt.av.video.t.a());
            int i2 = this.t - 1;
            if (i2 < 0 || i2 > this.f146856b.size() - 1) {
                str = str2;
            } else {
                b bVar = this.f146856b.get(i2);
                h.f.b.l.b(bVar, str2);
                b bVar2 = bVar;
                str2 = bVar2.f146854c.f146907c;
                str = bVar2.f146854c.f146906b;
            }
            j.b(new ShortVideoCommonParams(b().mShootWay, es.a(b()), es.c(b()), b().creationId), str2, str);
        } else if (qVar != null && qVar.getData() != null) {
            new com.ss.android.ugc.aweme.editSticker.interact.g().c(true);
            com.ss.android.ugc.gamora.editor.progress.a F2 = F();
            if (F2 != null) {
                F2.a(1001);
            }
            com.ss.android.ugc.gamora.editor.progressbar.a G2 = G();
            if (G2 != null) {
                G2.a(1, -1);
            }
            View view = this.f146862h;
            if (view == null) {
                h.f.b.l.a("playView");
            }
            view.setVisibility(8);
            this.f146866l = qVar;
            this.f146865k = z3;
            TextStickerData data = qVar.getData();
            if (data == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(data, str2);
            b(data);
            if (this.v && (dmtStatusView = this.f146855a) != null) {
                dmtStatusView.a(true);
            }
            L();
            com.bytedance.scene.group.b bVar3 = (com.bytedance.scene.group.b) this.o;
            if (bVar3 != null) {
                bVar3.e(this);
            }
        } else {
            return;
        }
        RelativeLayout relativeLayout = this.O;
        if (relativeLayout == null) {
            h.f.b.l.a("contentLayout");
        }
        int b2 = (int) com.bytedance.common.utility.n.b(this.f42913m, 239.0f);
        ViewGroup viewGroup = this.N;
        if (viewGroup == null) {
            h.f.b.l.a("parentLayout");
        }
        com.ss.android.ugc.aweme.effect.s.a(relativeLayout, z2, b2, viewGroup, new z(this, z2));
        if (z2) {
            if (this.f146865k) {
                J();
            } else {
                a().a(u.a.a(com.ss.android.ugc.aweme.themechange.base.c.a(true, false, false, false), ((int) com.bytedance.common.utility.n.b(this.f42913m, 52.0f)) + dh.c(this.f42913m), (int) com.bytedance.common.utility.n.b(this.f42913m, 239.0f), K(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d(), false, false, 960));
            }
            com.ss.android.ugc.tools.view.a.c cVar = this.G;
            if (cVar != null) {
                cVar.b(this.W);
                return;
            }
            return;
        }
        this.t = -1;
        if (this.f146865k) {
            com.ss.android.ugc.aweme.editSticker.text.view.q qVar2 = this.f146866l;
            if (qVar2 != null) {
                qVar2.n();
            }
        } else {
            com.ss.android.ugc.aweme.shortvideo.preview.a a2 = a();
            RelativeLayout relativeLayout2 = this.O;
            if (relativeLayout2 == null) {
                h.f.b.l.a("contentLayout");
            }
            a2.a(u.a.a(androidx.core.content.b.c(relativeLayout2.getContext(), R.color.a2), ((int) com.bytedance.common.utility.n.b(this.f42913m, 52.0f)) + dh.c(this.f42913m), (int) com.bytedance.common.utility.n.b(this.f42913m, 239.0f), K(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d()));
        }
        com.ss.android.ugc.tools.view.a.c cVar2 = this.G;
        if (cVar2 != null) {
            cVar2.c(this.W);
        }
    }

    public final void a(TextStickerData textStickerData, File file, int i2) {
        String speakerID = textStickerData.getSpeakerID();
        if (h.f.b.l.a((Object) textStickerData.getSpeakerID(), (Object) this.y)) {
            speakerID = "";
        } else if (speakerID == null) {
            return;
        }
        this.E.put(new e(textStickerData.getAudioText(), speakerID), new h.p<>(file, Integer.valueOf(i2)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r38v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r39v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, String str2, TextStickerData textStickerData) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        z.e eVar = new z.e();
        eVar.element = str2;
        if (h.m.p.a((CharSequence) eVar.element)) {
            eVar.element = (T) k.c();
        }
        this.f146859e = false;
        if (!(i.a(str, i.a().f146829a))) {
            Activity activity = this.f42913m;
            if (activity != null) {
                h.f.b.l.b(activity, "");
                new com.bytedance.tux.g.b(activity).e(R.string.ayi).b();
                return;
            }
            return;
        }
        this.A = false;
        N().show();
        a().c(true);
        com.ss.android.ugc.asve.editor.g value = a().C().getValue();
        if (value != null) {
            value.u();
        }
        z.e eVar2 = new z.e();
        eVar2.element = textStickerData;
        if (textStickerData == 0) {
            eVar2.element = (T) new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870911, null);
        }
        b.i.b(new v(str, eVar), b.i.f4824a).a(new w(this, eVar2, str, eVar, textStickerData), b.i.f4824a, null);
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.preview.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.ss.android.ugc.aweme.shortvideo.preview.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.read.d.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.progress.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(96730);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.progress.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.progress.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progress.a> r1 = com.ss.android.ugc.gamora.editor.progress.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.read.d.b.invoke():com.bytedance.als.b");
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.progressbar.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(96731);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.progressbar.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.progressbar.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progressbar.a> r1 = com.ss.android.ugc.gamora.editor.progressbar.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.read.d.c.invoke():com.bytedance.als.b");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f146870a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f146871b;

        static {
            Covode.recordClassIndex(96736);
        }

        h(String str, String str2) {
            this.f146870a = str;
            this.f146871b = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return ReadTextV2Api.a.a(this.f146870a, this.f146871b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f146890a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f146891b;

        static {
            Covode.recordClassIndex(96751);
        }

        v(String str, z.e eVar) {
            this.f146890a = str;
            this.f146891b = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return ReadTextV2Api.a.a(this.f146890a, this.f146891b.element);
        }
    }

    private final void I() {
        int i2 = this.u;
        if (i2 == Integer.MAX_VALUE) {
            this.u = 0;
        } else {
            this.u = i2 + 1;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<EditTextStickerViewModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(96741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditTextStickerViewModel invoke() {
            Activity t = this.this$0.t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) t).a(EditTextStickerViewModel.class);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.effectplatform.f> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(96742);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.effectplatform.f invoke() {
            Context u = this.this$0.u();
            h.f.b.l.b(u, "");
            return com.ss.android.ugc.aweme.effectplatform.c.a(u, null);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<ReadTextViewModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(96744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ReadTextViewModel invoke() {
            Activity t = this.this$0.t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) t).a(ReadTextViewModel.class);
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<VideoPublishEditModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(96750);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VideoPublishEditModel invoke() {
            Object a2 = this.this$0.getDiContainer().a((Type) VideoPublishEditModel.class, (String) null);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    private final void J() {
        View currentFocus;
        InputMethodManager inputMethodManager;
        Activity activity = this.f42913m;
        if (activity != null && (currentFocus = activity.getCurrentFocus()) != null && (inputMethodManager = this.F) != null) {
            h.f.b.l.b(currentFocus, "");
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    private final int K() {
        return ((dh.e(this.f42913m) - ((int) com.bytedance.common.utility.n.b(this.f42913m, 291.0f))) - dh.c(this.f42913m)) - dh.d(this.f42913m);
    }

    private final void L() {
        if (this.v) {
            D();
            return;
        }
        this.v = true;
        H().a("speaking-voice", false, false, (IFetchEffectChannelListener) new k(this));
    }

    private final com.ss.android.ugc.aweme.view.b N() {
        com.ss.android.ugc.aweme.view.b bVar = this.B;
        if (bVar != null) {
            bVar.cancel();
        }
        Activity t2 = t();
        h.f.b.l.b(t2, "");
        com.ss.android.ugc.aweme.view.b a2 = b.C3836b.a(t2, b.a.GONE, new g());
        this.B = a2;
        if (a2 == null) {
            h.f.b.l.b();
        }
        a2.setMessage(t().getString(R.string.gem));
        com.ss.android.ugc.aweme.view.b bVar2 = this.B;
        if (bVar2 == null) {
            h.f.b.l.b();
        }
        return bVar2;
    }

    public final void E() {
        this.f146856b.add(new b(new Effect(null, 1, null), new e(true, "", "", "", 32)));
        this.f146857c.addAll(this.f146856b);
        D();
    }

    /* access modifiers changed from: package-private */
    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f146880b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f146881c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f146882d;

        static {
            Covode.recordClassIndex(96739);
        }

        j(d dVar, int i2, int i3, String str) {
            this.f146879a = dVar;
            this.f146880b = i2;
            this.f146881c = i3;
            this.f146882d = str;
        }

        public final void run() {
            if (this.f146880b == this.f146879a.u && this.f146881c < this.f146879a.x.size()) {
                this.f146879a.x.get(this.f146881c).a(0, false);
                if (!com.ss.android.ugc.aweme.shortvideo.s.c.a(this.f146879a.s())) {
                    Activity activity = this.f146879a.f42913m;
                    if (activity != null) {
                        h.f.b.l.b(activity, "");
                        new com.bytedance.tux.g.b(activity).e(R.string.aye).b();
                    }
                } else if (TextUtils.isEmpty(this.f146882d)) {
                    Activity t = this.f146879a.t();
                    h.f.b.l.b(t, "");
                    new com.bytedance.tux.g.b(t).e(R.string.gep).b();
                } else {
                    Activity t2 = this.f146879a.t();
                    h.f.b.l.b(t2, "");
                    new com.bytedance.tux.g.b(t2).a(this.f146882d).b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146900a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f146901b;

        static {
            Covode.recordClassIndex(96754);
        }

        x(d dVar, String str) {
            this.f146900a = dVar;
            this.f146901b = str;
        }

        public final void run() {
            if (!this.f146900a.A) {
                if (!com.ss.android.ugc.aweme.shortvideo.s.c.a(this.f146900a.s())) {
                    Activity activity = this.f146900a.f42913m;
                    if (activity != null) {
                        h.f.b.l.b(activity, "");
                        new com.bytedance.tux.g.b(activity).e(R.string.aye).b();
                    }
                } else if (TextUtils.isEmpty(this.f146901b)) {
                    Activity t = this.f146900a.t();
                    h.f.b.l.b(t, "");
                    new com.bytedance.tux.g.b(t).e(R.string.gep).b();
                } else {
                    Activity t2 = this.f146900a.t();
                    h.f.b.l.b(t2, "");
                    new com.bytedance.tux.g.b(t2).a(this.f146901b).b();
                }
                this.f146900a.a().c(false);
                com.ss.android.ugc.asve.editor.g value = this.f146900a.a().C().getValue();
                if (value != null) {
                    value.a(true);
                }
                com.ss.android.ugc.asve.editor.g value2 = this.f146900a.a().C().getValue();
                if (value2 != null) {
                    value2.t();
                }
                this.f146900a.d().f88316b = false;
                com.ss.android.ugc.aweme.view.b bVar = this.f146900a.B;
                if (bVar != null) {
                    bVar.dismiss();
                }
            }
        }
    }

    private final void M() {
        MethodCollector.i(3260);
        this.x.clear();
        LinearLayout linearLayout = this.P;
        if (linearLayout == null) {
            h.f.b.l.a("listViewGroup");
        }
        linearLayout.removeAllViews();
        TuxButton tuxButton = this.Q;
        if (tuxButton == null) {
            h.f.b.l.a("cancelView");
        }
        tuxButton.setVisibility(8);
        TuxCheckBox tuxCheckBox = this.f146861g;
        if (tuxCheckBox == null) {
            h.f.b.l.a("checkbox");
        }
        tuxCheckBox.setVisibility(0);
        TuxTextView tuxTextView = this.R;
        if (tuxTextView == null) {
            h.f.b.l.a("checkboxText");
        }
        tuxTextView.setVisibility(0);
        Activity t2 = t();
        h.f.b.l.b(t2, "");
        f fVar = new f(t2, (byte) 0);
        LinearLayout linearLayout2 = this.P;
        if (linearLayout2 == null) {
            h.f.b.l.a("listViewGroup");
        }
        LayoutInflater from = LayoutInflater.from(t());
        h.f.b.l.b(from, "");
        fVar.a(linearLayout2, from, 0, this);
        fVar.a(null);
        this.x.add(fVar);
        LinearLayout linearLayout3 = this.P;
        if (linearLayout3 == null) {
            h.f.b.l.a("listViewGroup");
        }
        linearLayout3.addView(fVar, new LinearLayout.LayoutParams(-2, -2));
        int i2 = 0;
        for (T t3 : this.f146856b) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.n.a();
            }
            T t4 = t3;
            Activity t5 = t();
            h.f.b.l.b(t5, "");
            f fVar2 = new f(t5, (byte) 0);
            LinearLayout linearLayout4 = this.P;
            if (linearLayout4 == null) {
                h.f.b.l.a("listViewGroup");
            }
            LayoutInflater from2 = LayoutInflater.from(t());
            h.f.b.l.b(from2, "");
            fVar2.a(linearLayout4, from2, i3, this);
            fVar2.a(t4);
            this.x.add(fVar2);
            LinearLayout linearLayout5 = this.P;
            if (linearLayout5 == null) {
                h.f.b.l.a("listViewGroup");
            }
            linearLayout5.addView(fVar2, new LinearLayout.LayoutParams(-2, -2));
            i2 = i3;
        }
        MethodCollector.o(3260);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D() {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.read.d.D():void");
    }

    public static final class k implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146883a;

        static {
            Covode.recordClassIndex(96740);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(d dVar) {
            this.f146883a = dVar;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            DmtStatusView dmtStatusView = this.f146883a.f146855a;
            if (dmtStatusView != null) {
                dmtStatusView.a(true);
            }
            this.f146883a.E();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            DmtStatusView dmtStatusView = this.f146883a.f146855a;
            if (dmtStatusView != null) {
                dmtStatusView.a(true);
            }
            if (effectChannelResponse2 == null) {
                this.f146883a.E();
                return;
            }
            this.f146883a.f146856b = c.a(effectChannelResponse2);
            if (this.f146883a.f146856b.isEmpty()) {
                this.f146883a.E();
                return;
            }
            if (this.f146883a.C.a()) {
                this.f146883a.C.a(this.f146883a.f146856b);
            }
            this.f146883a.f146857c.addAll(this.f146883a.f146856b);
            d.a(this.f146883a.f146857c);
            this.f146883a.D();
        }
    }

    public static final class n implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146884a;

        static {
            Covode.recordClassIndex(96743);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(d dVar) {
            this.f146884a = dVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4 || !this.f146884a.z()) {
                return false;
            }
            this.f146884a.a(false, false, (com.ss.android.ugc.aweme.editSticker.text.view.q) null);
            return true;
        }
    }

    public static final class r extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146887a;

        static {
            Covode.recordClassIndex(96747);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        r(d dVar) {
            this.f146887a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f146887a.a(false, false, (com.ss.android.ugc.aweme.editSticker.text.view.q) null);
        }
    }

    public static final class s extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146888a;

        static {
            Covode.recordClassIndex(96748);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        s(d dVar) {
            this.f146888a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f146888a.a(false, false, (com.ss.android.ugc.aweme.editSticker.text.view.q) null);
        }
    }

    public static final class t extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146889a;

        static {
            Covode.recordClassIndex(96749);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        t(d dVar) {
            this.f146889a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            if (this.f146889a.f146865k) {
                this.f146889a.a(false, false, (com.ss.android.ugc.aweme.editSticker.text.view.q) null);
            } else if (d.c(this.f146889a).getVisibility() == 8) {
                this.f146889a.a().v().setValue(dmt.av.video.t.a());
                this.f146889a.a().v().setValue(dmt.av.video.t.b());
                d.c(this.f146889a).setVisibility(0);
            } else {
                d.c(this.f146889a).setVisibility(8);
                com.ss.android.ugc.asve.editor.g value = this.f146889a.a().C().getValue();
                if (value != null) {
                    value.a(true);
                }
                this.f146889a.a().v().setValue(dmt.av.video.t.a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y extends h.f.b.m implements h.f.a.b<AVChallenge, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f146902a = new y();

        static {
            Covode.recordClassIndex(96755);
        }

        y() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(AVChallenge aVChallenge) {
            h.f.b.l.d(aVChallenge, "");
            return h.z.f158842a;
        }
    }

    public static final /* synthetic */ TuxCheckBox b(d dVar) {
        TuxCheckBox tuxCheckBox = dVar.f146861g;
        if (tuxCheckBox == null) {
            h.f.b.l.a("checkbox");
        }
        return tuxCheckBox;
    }

    public static final /* synthetic */ View c(d dVar) {
        View view = dVar.f146862h;
        if (view == null) {
            h.f.b.l.a("playView");
        }
        return view;
    }

    public static final /* synthetic */ SafeHandler d(d dVar) {
        SafeHandler safeHandler = dVar.f146864j;
        if (safeHandler == null) {
            h.f.b.l.a("mSafeHandler");
        }
        return safeHandler;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    /* access modifiers changed from: package-private */
    public static final class f implements com.ss.android.ugc.aweme.infoSticker.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146869a;

        static {
            Covode.recordClassIndex(96734);
        }

        f(d dVar) {
            this.f146869a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.infoSticker.a
        public final void a(AVChallenge aVChallenge) {
            TextStickerChallenges textStickerChallenges = this.f146869a.b().getTextStickerChallenges();
            h.f.b.l.b(aVChallenge, "");
            textStickerChallenges.addReadTextChallenge(aVChallenge);
        }
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146885a;

        static {
            Covode.recordClassIndex(96745);
        }

        p(d dVar) {
            this.f146885a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            d.b(this.f146885a).setChecked(!d.b(this.f146885a).isChecked());
        }
    }

    public final void c(String str) {
        SafeHandler safeHandler = this.f146864j;
        if (safeHandler == null) {
            h.f.b.l.a("mSafeHandler");
        }
        safeHandler.post(new x(this, str));
    }

    private static boolean a(TextStickerData textStickerData) {
        h.f.b.l.d(textStickerData, "");
        if (TextUtils.isEmpty(textStickerData.getAudioText()) || !(!h.f.b.l.a((Object) textStickerData.getAudioText(), (Object) com.ss.android.ugc.aweme.editSticker.text.bean.t.i(textStickerData.getTextWrapList())))) {
            return false;
        }
        return true;
    }

    private final int f(String str) {
        int i2 = 0;
        if (this.f146859e) {
            return 0;
        }
        for (T t2 : this.f146856b) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.n.a();
            }
            if (h.f.b.l.a((Object) t2.f146854c.f146907c, (Object) str)) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public final void b(List<b> list) {
        h.f.b.l.d(list, "");
        this.v = true;
        this.f146857c.clear();
        this.f146857c.addAll(list);
        a(this.f146857c);
    }

    public final void d(String str) {
        h.f.b.l.d(str, "");
        Activity t2 = t();
        Objects.requireNonNull(t2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        new com.ss.android.ugc.aweme.infoSticker.b((androidx.fragment.app.e) t2, str).a(new f(this));
    }

    /* access modifiers changed from: package-private */
    public static final class w<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146892a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f146893b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f146894c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f146895d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextStickerData f146896e;

        static {
            Covode.recordClassIndex(96752);
        }

        w(d dVar, z.e eVar, String str, z.e eVar2, TextStickerData textStickerData) {
            this.f146892a = dVar;
            this.f146893b = eVar;
            this.f146894c = str;
            this.f146895d = eVar2;
            this.f146896e = textStickerData;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.d(iVar, "");
            if (iVar.c() || iVar.b()) {
                this.f146892a.c((d) "");
            } else {
                try {
                    FetchTextAudioResponse fetchTextAudioResponse = (FetchTextAudioResponse) iVar.d();
                    if (fetchTextAudioResponse == null || fetchTextAudioResponse.status_code != 0) {
                        this.f146892a.c(fetchTextAudioResponse.message);
                    } else {
                        TextAudioData data = fetchTextAudioResponse.getData();
                        if (data == null) {
                            h.f.b.l.b();
                        }
                        String audio = data.getAudio();
                        if (audio == null) {
                            h.f.b.l.b();
                        }
                        final File b2 = i.b(audio);
                        if (b2 == null || !b2.exists()) {
                            this.f146892a.c((d) "");
                        } else {
                            final int a2 = fa.a(b2.getAbsolutePath());
                            d.d(this.f146892a).post(new Runnable(this) {
                                /* class com.ss.android.ugc.gamora.editor.sticker.read.d.w.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ w f146897a;

                                static {
                                    Covode.recordClassIndex(96753);
                                }

                                {
                                    this.f146897a = r1;
                                }

                                public final void run() {
                                    T t;
                                    T t2;
                                    String q;
                                    if (!this.f146897a.f146892a.A && (t = this.f146897a.f146893b.element) != null) {
                                        this.f146897a.f146892a.d().f88316b = false;
                                        t.setAudioTrackDuration(a2);
                                        t.setAudioTrackFilePath(b2.getAbsolutePath());
                                        List<String> audioPathList = t.getAudioPathList();
                                        String absolutePath = b2.getAbsolutePath();
                                        h.f.b.l.b(absolutePath, "");
                                        audioPathList.add(absolutePath);
                                        t.setAudioText(this.f146897a.f146894c);
                                        String speakerID = t.getSpeakerID();
                                        boolean z = true;
                                        if (speakerID != null) {
                                            if (!h.f.b.l.a((Object) speakerID, (Object) this.f146897a.f146895d.element)) {
                                                this.f146897a.f146892a.e(speakerID);
                                            } else {
                                                z = false;
                                            }
                                        }
                                        t.setSpeakerID(this.f146897a.f146895d.element);
                                        k.c(this.f146897a.f146895d.element);
                                        this.f146897a.f146892a.a(t, b2, a2);
                                        this.f146897a.f146892a.C().a(new com.bytedance.jedi.arch.d<>(t));
                                        if (this.f146897a.f146896e == null) {
                                            this.f146897a.f146892a.d().f88317c = t;
                                        }
                                        this.f146897a.f146892a.d().c(new EditTextStickerViewModel.g());
                                        this.f146897a.f146892a.a().c(false);
                                        if (z) {
                                            Iterator<T> it = this.f146897a.f146892a.f146856b.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    t2 = null;
                                                    break;
                                                }
                                                t2 = it.next();
                                                if (h.f.b.l.a((Object) t2.f146854c.f146907c, (Object) this.f146897a.f146895d.element)) {
                                                    break;
                                                }
                                            }
                                            T t3 = t2;
                                            if (!(t3 == null || (q = com.ss.android.ugc.aweme.sticker.p.g.q(t3.f88093b)) == null)) {
                                                this.f146897a.f146892a.d(q);
                                            }
                                        }
                                        com.ss.android.ugc.aweme.view.b bVar = this.f146897a.f146892a.B;
                                        if (bVar != null) {
                                            bVar.dismiss();
                                        }
                                    }
                                }
                            });
                        }
                    }
                } catch (Exception unused) {
                    this.f146892a.c((d) "");
                }
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z<T> implements androidx.core.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146903a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f146904b;

        static {
            Covode.recordClassIndex(96756);
        }

        z(d dVar, boolean z) {
            this.f146903a = dVar;
            this.f146904b = z;
        }

        @Override // androidx.core.g.a
        public final /* synthetic */ void a(Object obj) {
            if (this.f146904b) {
                TextView textView = this.f146903a.f146860f;
                if (textView == null) {
                    h.f.b.l.a("textDone");
                }
                textView.setVisibility(0);
                com.ss.android.ugc.asve.editor.g value = this.f146903a.a().C().getValue();
                if (value != null) {
                    value.a(true);
                }
                this.f146903a.a().v().setValue(dmt.av.video.t.a());
                return;
            }
            com.bytedance.scene.group.b bVar = (com.bytedance.scene.group.b) this.f146903a.o;
            if (bVar != null) {
                bVar.d(this.f146903a);
            }
        }
    }

    public final boolean b(String str) {
        boolean z2;
        h.f.b.l.d(str, "");
        if (this.f146866l == null) {
            return false;
        }
        if (h.f.b.l.a((Object) str, (Object) this.y)) {
            str = "";
        }
        if (h.f.b.l.a((Object) str, (Object) "")) {
            HashMap<e, h.p<File, Integer>> hashMap = this.E;
            com.ss.android.ugc.aweme.editSticker.text.view.q qVar = this.f146866l;
            if (qVar == null) {
                h.f.b.l.b();
            }
            z2 = hashMap.containsKey(new e(qVar.getText(), this.y));
        } else {
            z2 = false;
        }
        HashMap<e, h.p<File, Integer>> hashMap2 = this.E;
        com.ss.android.ugc.aweme.editSticker.text.view.q qVar2 = this.f146866l;
        if (qVar2 == null) {
            h.f.b.l.b();
        }
        if (hashMap2.containsKey(new e(qVar2.getText(), str)) || z2) {
            return true;
        }
        return false;
    }

    public final void e(String str) {
        T t2;
        String q2;
        h.f.b.l.d(str, "");
        Iterator<T> it = this.f146856b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (h.f.b.l.a((Object) t2.f146854c.f146907c, (Object) str)) {
                break;
            }
        }
        T t3 = t2;
        if (t3 != null && (q2 = com.ss.android.ugc.aweme.sticker.p.g.q(t3.f88093b)) != null && !h.m.p.a((CharSequence) q2)) {
            b().getTextStickerChallenges().removeReadTextChallenge(q2, y.f146902a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146872a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f146873b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f146874c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f146875d;

        static {
            Covode.recordClassIndex(96737);
        }

        i(d dVar, int i2, int i3, String str) {
            this.f146872a = dVar;
            this.f146873b = i2;
            this.f146874c = i3;
            this.f146875d = str;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.b.l.d(iVar, "");
            if (iVar.c() || iVar.b()) {
                this.f146872a.a(this.f146873b, this.f146874c, "");
            } else {
                try {
                    FetchTextAudioResponse fetchTextAudioResponse = (FetchTextAudioResponse) iVar.d();
                    if (fetchTextAudioResponse == null || fetchTextAudioResponse.status_code != 0) {
                        this.f146872a.a(this.f146873b, this.f146874c, fetchTextAudioResponse.message);
                    } else {
                        TextAudioData data = fetchTextAudioResponse.getData();
                        if (data == null) {
                            h.f.b.l.b();
                        }
                        String audio = data.getAudio();
                        if (audio == null) {
                            h.f.b.l.b();
                        }
                        final File b2 = i.b(audio);
                        if (b2 == null || !b2.exists()) {
                            this.f146872a.a(this.f146873b, this.f146874c, "");
                        } else {
                            final int a2 = fa.a(b2.getAbsolutePath());
                            if (this.f146874c == this.f146872a.u) {
                                d.d(this.f146872a).post(new Runnable(this) {
                                    /* class com.ss.android.ugc.gamora.editor.sticker.read.d.i.AnonymousClass1 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ i f146876a;

                                    static {
                                        Covode.recordClassIndex(96738);
                                    }

                                    {
                                        this.f146876a = r1;
                                    }

                                    /* JADX WARNING: Removed duplicated region for block: B:15:0x0079  */
                                    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final void run() {
                                        /*
                                        // Method dump skipped, instructions count: 261
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.read.d.i.AnonymousClass1.run():void");
                                    }
                                });
                            }
                        }
                    }
                } catch (Exception unused) {
                    this.f146872a.a(this.f146873b, this.f146874c, "");
                }
            }
            return h.z.f158842a;
        }
    }

    private final void b(TextStickerData textStickerData) {
        LiveData<com.ss.android.ugc.asve.editor.g> liveData;
        this.V = textStickerData;
        I();
        String str = "";
        this.T = str;
        if (!textStickerData.getHasReadTextAudio()) {
            str = k.e();
        } else if (a(textStickerData) || TextUtils.isEmpty(textStickerData.getAudioTrackFilePath()) || !new File(textStickerData.getAudioTrackFilePath()).exists() || textStickerData.getAudioTrackDuration() == 0) {
            com.ss.android.ugc.aweme.shortvideo.preview.a a2 = a();
            if (a2 != null) {
                liveData = a2.C();
            } else {
                liveData = null;
            }
            com.ss.android.ugc.asve.editor.g value = liveData.getValue();
            if (value != null) {
                value.e(textStickerData.getAudioTrackIndex());
            }
            textStickerData.setHasReadTextAudio(false);
            textStickerData.setAudioTrackIndex(-1);
            textStickerData.setAudioTrackFilePath(null);
            String speakerID = textStickerData.getSpeakerID();
            if (speakerID != null) {
                str = speakerID;
            }
            this.T = str;
            return;
        } else {
            a(textStickerData, new File(textStickerData.getAudioTrackFilePath()), textStickerData.getAudioTrackDuration());
            String speakerID2 = textStickerData.getSpeakerID();
            if (speakerID2 != null) {
                str = speakerID2;
            }
        }
        this.T = str;
    }

    public static void a(List<b> list) {
        h.f.b.l.d(list, "");
        List<String> d2 = k.d(com.ss.android.ugc.aweme.port.in.g.a().A().c());
        ArrayList arrayList = new ArrayList();
        for (String str : d2) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (h.f.b.l.a((Object) ((b) next).f146854c.f146907c, (Object) str)) {
                    if (next != null) {
                        arrayList.add(next);
                    }
                }
            }
        }
        IInternalCommerceService h2 = AVCommerceServiceImpl.h();
        h.f.b.l.b(h2, "");
        boolean b2 = h2.b();
        Iterator<b> it2 = list.iterator();
        while (it2.hasNext()) {
            b next2 = it2.next();
            if (next2.f146854c.f146909e == 1) {
                it2.remove();
            } else if (b2 && next2.c()) {
                it2.remove();
            }
        }
        if (com.ss.android.ugc.gamora.editor.sticker.read.a.d.a()) {
            list.addAll(0, arrayList);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0160, code lost:
        if (r0 != null) goto L_0x012c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(int r15) {
        /*
        // Method dump skipped, instructions count: 379
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.read.d.d(int):void");
    }

    /* access modifiers changed from: package-private */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f146867a;

        /* renamed from: b  reason: collision with root package name */
        public final String f146868b;

        static {
            Covode.recordClassIndex(96733);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return h.f.b.l.a(this.f146867a, eVar.f146867a) && h.f.b.l.a(this.f146868b, eVar.f146868b);
        }

        public final int hashCode() {
            String str = this.f146867a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f146868b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "TextSpeakerModel(text=" + this.f146867a + ", speaker=" + this.f146868b + ")";
        }

        public e(String str, String str2) {
            this.f146867a = str;
            this.f146868b = str2;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    private static Object a(Activity activity, String str) {
        Object obj;
        MethodCollector.i(2808);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = activity.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = activity.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(2808);
                }
            }
        } else {
            obj = activity.getSystemService(str);
        }
        return obj;
    }

    static final class q implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f146886a;

        static {
            Covode.recordClassIndex(96746);
        }

        q(d dVar) {
            this.f146886a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            k.a(z);
            if (!z) {
                if (this.f146886a.w != null) {
                    f fVar = this.f146886a.w;
                    if (fVar == null) {
                        h.f.b.l.b();
                    }
                    if (fVar.getModel() != null) {
                        f fVar2 = this.f146886a.w;
                        if (fVar2 == null) {
                            h.f.b.l.b();
                        }
                        b model = fVar2.getModel();
                        if (model == null) {
                            h.f.b.l.b();
                        }
                        k.b(model.f146854c.f146906b);
                        f fVar3 = this.f146886a.w;
                        if (fVar3 == null) {
                            h.f.b.l.b();
                        }
                        b model2 = fVar3.getModel();
                        if (model2 == null) {
                            h.f.b.l.b();
                        }
                        k.a(model2.f146854c.f146907c);
                        d dVar = this.f146886a;
                        f fVar4 = dVar.w;
                        if (fVar4 == null) {
                            h.f.b.l.b();
                        }
                        b model3 = fVar4.getModel();
                        if (model3 == null) {
                            h.f.b.l.b();
                        }
                        dVar.a(model3.f146854c.f146906b);
                    }
                }
                k.b(this.f146886a.z);
                k.a(this.f146886a.y);
                d dVar2 = this.f146886a;
                dVar2.a(dVar2.z);
            }
            if (!this.f146886a.f146863i) {
                ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(this.f146886a.b().mShootWay, es.a(this.f146886a.b()), es.c(this.f146886a.b()), this.f146886a.b().creationId);
                h.f.b.l.d(shortVideoCommonParams, "");
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("shoot_way", shortVideoCommonParams.shootWay).a("content_source", shortVideoCommonParams.contentSource).a("content_type", shortVideoCommonParams.contentType).a("creation_id", shortVideoCommonParams.creationId);
                if (k.b()) {
                    str = "on";
                } else {
                    str = "off";
                }
                com.ss.android.ugc.aweme.common.r.a("click_apply_tone", a2.a("to_status", str).f149193a);
            }
            this.f146886a.f146863i = false;
        }
    }

    public d(com.bytedance.o.f fVar, com.ss.android.ugc.gamora.editor.sticker.read.a.b bVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(bVar, "");
        this.X = fVar;
        this.C = bVar;
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.at_, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a2;
        this.N = viewGroup2;
        if (viewGroup2 == null) {
            h.f.b.l.a("parentLayout");
        }
        return viewGroup2;
    }

    public final void a(int i2, boolean z2) {
        TuxCheckBox tuxCheckBox = this.f146861g;
        if (tuxCheckBox == null) {
            h.f.b.l.a("checkbox");
        }
        if (!tuxCheckBox.isChecked()) {
            int i3 = i2 - 1;
            if (i3 >= 0 && i3 < this.f146856b.size()) {
                k.b(this.f146856b.get(i3).f146854c.f146906b);
                k.a(this.f146856b.get(i3).f146854c.f146907c);
                a(this.f146856b.get(i3).f146854c.f146906b);
            } else {
                return;
            }
        }
        if (i2 < this.x.size()) {
            this.w = this.x.get(i2);
            this.x.get(i2).a(1, z2);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public final void a(int i2, int i3, String str) {
        SafeHandler safeHandler = this.f146864j;
        if (safeHandler == null) {
            h.f.b.l.a("mSafeHandler");
        }
        safeHandler.post(new j(this, i3, i2, str));
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.io.File r7, int r8, java.lang.String r9, int r10) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.read.d.a(java.io.File, int, java.lang.String, int):void");
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
