package com.ss.android.ugc.aweme.editSticker.text;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.b;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.a.b;
import com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewState;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.view.i;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.story.h.c.a.b;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.tools.view.widget.j;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.regex.Pattern;

public class a implements com.bytedance.jedi.arch.b, b.a {
    public static final C2141a F = new C2141a((byte) 0);
    public final com.ss.android.ugc.aweme.editSticker.interact.e A;
    public final LiveData<com.ss.android.ugc.asve.editor.g> B;
    public final com.ss.android.ugc.aweme.editSticker.text.als.d C;
    public Rect D;
    public com.ss.android.ugc.aweme.editSticker.interact.view.e E;
    private com.ss.android.ugc.aweme.story.h.c.a.b G;
    private com.ss.android.ugc.aweme.editSticker.text.c.g H;
    private Runnable I;
    private int J;
    private boolean K;
    private h.p<Integer, Integer> L;
    private final com.bytedance.f.a.a.j M;
    private final int N;
    private final boolean O;
    private final boolean P;

    /* renamed from: a  reason: collision with root package name */
    protected EditTextStickerViewModel f88248a;

    /* renamed from: b  reason: collision with root package name */
    public StickerHintTextViewModel f88249b;

    /* renamed from: c  reason: collision with root package name */
    View f88250c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.text.view.q f88251d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.text.c.e f88252e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.interact.a.b f88253f;

    /* renamed from: g  reason: collision with root package name */
    public h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> f88254g;

    /* renamed from: h  reason: collision with root package name */
    public h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> f88255h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.text.c.f f88256i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.d.e f88257j;

    /* renamed from: k  reason: collision with root package name */
    public h.f.a.m<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> f88258k;

    /* renamed from: l  reason: collision with root package name */
    public com.ss.android.ugc.aweme.editSticker.text.c.d f88259l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f88260m;
    protected SafeHandler n;
    public int o;
    public long p;
    public boolean q;
    public final com.ss.android.ugc.aweme.editSticker.interact.g r;
    public boolean s;
    public boolean t;
    public final int u;
    final androidx.fragment.app.e v;
    public final com.ss.android.ugc.aweme.shortvideo.preview.a w;
    public final boolean x;
    public final FrameLayout y;
    public final com.ss.android.ugc.aweme.editSticker.text.view.i z;

    static {
        Covode.recordClassIndex(55477);
    }

    /* access modifiers changed from: protected */
    public void c(TextStickerData textStickerData) {
    }

    public void e() {
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void n() {
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$a  reason: collision with other inner class name */
    public static final class C2141a {
        static {
            Covode.recordClassIndex(55478);
        }

        private C2141a() {
        }

        public /* synthetic */ C2141a(byte b2) {
            this();
        }

        public static boolean a(String str) {
            h.f.b.l.d(str, "");
            if (str.length() > 150) {
                return false;
            }
            List<String> list = com.ss.android.ugc.aweme.editSticker.g.a().f88144h;
            if (list == null || list.isEmpty()) {
                list = h.a.n.b("^why .*", "^what .*", "^when .*", "^where .*", "^who .*", "^how .*", ".*could you .*", ".*can you .*", ".*would you .*");
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Locale locale = Locale.US;
                h.f.b.l.b(locale, "");
                String lowerCase = str.toLowerCase(locale);
                h.f.b.l.b(lowerCase, "");
                if (Pattern.matches(it.next(), lowerCase)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    public final void a(boolean z2) {
        com.ss.android.ugc.asve.editor.g value;
        int audioTrackIndex;
        LiveData<com.ss.android.ugc.asve.editor.g> liveData = this.B;
        if (liveData != null && (value = liveData.getValue()) != null) {
            EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
            if (editTextStickerViewModel == null) {
                h.f.b.l.a("textStickerViewModel");
            }
            Iterator<T> it = editTextStickerViewModel.f88319e.iterator();
            while (it.hasNext()) {
                TextStickerData data = it.next().getData();
                if (!(data == null || (audioTrackIndex = data.getAudioTrackIndex()) == -1)) {
                    if (z2) {
                        value.a(audioTrackIndex, 1, 0.0f);
                    } else {
                        value.a(audioTrackIndex, 1, 1.0f);
                    }
                }
            }
        }
    }

    public final void a(h.p<Integer, Integer> pVar) {
        if (pVar != null && this.L == null) {
            this.L = pVar;
            l();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(List<TextStickerTextWrap> list) {
        h.f.b.l.d(list, "");
        com.ss.android.ugc.aweme.editSticker.text.view.q qVar = this.f88251d;
        if (qVar != null) {
            c(qVar.getData());
            int curTxtMode = this.z.getCurTxtMode();
            int curColor = this.z.getCurColor();
            int alignTxt = this.z.getAlignTxt();
            com.ss.android.ugc.aweme.editSticker.text.a.b a2 = com.ss.android.ugc.aweme.editSticker.text.a.b.a();
            h.f.b.l.b(a2, "");
            qVar.a(curTxtMode, curColor, alignTxt, a2.f88281d);
            qVar.setFontSize(d());
            TextStickerData data = qVar.getData();
            qVar.b(list, data != null ? data.getEffectTextLayoutConfig() : null);
            return;
        }
        b(list);
    }

    public static final class an implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88262a;

        /* renamed from: b  reason: collision with root package name */
        private int f88263b = -1;

        /* renamed from: c  reason: collision with root package name */
        private Runnable f88264c = new RunnableC2142a(this);

        static {
            Covode.recordClassIndex(55493);
        }

        /* renamed from: com.ss.android.ugc.aweme.editSticker.text.a$an$a  reason: collision with other inner class name */
        static final class RunnableC2142a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ an f88265a;

            static {
                Covode.recordClassIndex(55494);
            }

            RunnableC2142a(an anVar) {
                this.f88265a = anVar;
            }

            public final void run() {
                int i2 = Build.VERSION.SDK_INT;
            }
        }

        public final void run() {
            com.ss.android.ugc.asve.editor.g value;
            int k2;
            Runnable runnable = this.f88264c;
            if (runnable != null) {
                runnable.run();
                this.f88264c = null;
            }
            this.f88262a.b().postDelayed(this, 16);
            LiveData<com.ss.android.ugc.asve.editor.g> liveData = this.f88262a.B;
            if (!(liveData == null || (value = liveData.getValue()) == null || !this.f88262a.a().o() || (k2 = value.k()) == this.f88263b)) {
                this.f88263b = k2;
                long j2 = (long) k2;
                for (com.ss.android.ugc.aweme.editSticker.text.view.q qVar : this.f88262a.a().f88319e) {
                    qVar.setPlayPosition(j2);
                    qVar.o();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        an(a aVar) {
            this.f88262a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q f88304a;

        static {
            Covode.recordClassIndex(55503);
        }

        e(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            this.f88304a = qVar;
        }

        public final void run() {
            this.f88304a.setShowHelpBox(true);
        }
    }

    public static final class h implements i.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.i f88308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f88309b;

        static {
            Covode.recordClassIndex(55506);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.view.i.c
        public final void a() {
            a aVar = this.f88309b;
            aVar.a(aVar.f88251d);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.view.i.c
        public final void b() {
            this.f88308a.c();
        }

        h(com.ss.android.ugc.aweme.editSticker.text.view.i iVar, a aVar) {
            this.f88308a = iVar;
            this.f88309b = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.i f88312a;

        static {
            Covode.recordClassIndex(55509);
        }

        k(com.ss.android.ugc.aweme.editSticker.text.view.i iVar) {
            this.f88312a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.view.i.b
        public final void a() {
            this.f88312a.c();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public com.bytedance.jedi.arch.ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    public static final class ao implements com.ss.android.ugc.aweme.editSticker.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88267a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q f88268b;

        static {
            Covode.recordClassIndex(55496);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.c.b
        public final boolean a() {
            this.f88267a.f(this.f88268b);
            return true;
        }

        ao(a aVar, com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            this.f88267a = aVar;
            this.f88268b = qVar;
        }
    }

    public static final class f implements com.ss.android.ugc.aweme.editSticker.text.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88305a;

        static {
            Covode.recordClassIndex(55504);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.b.a
        public final boolean a() {
            return this.f88305a.a().i();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(a aVar) {
            this.f88305a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements com.ss.android.ugc.aweme.editSticker.interact.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88311a;

        static {
            Covode.recordClassIndex(55508);
        }

        j(a aVar) {
            this.f88311a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.editSticker.interact.a.b
        public final void a() {
            this.f88311a.a().f88322l.a(h.z.f158842a);
        }
    }

    /* access modifiers changed from: protected */
    public final SafeHandler b() {
        SafeHandler safeHandler = this.n;
        if (safeHandler == null) {
            h.f.b.l.a("safeHandler");
        }
        return safeHandler;
    }

    /* access modifiers changed from: protected */
    public final List<TextStickerTextWrap> c() {
        List<TextStickerTextWrap> textWrapList = this.z.getTextWrapList();
        h.f.b.l.b(textWrapList, "");
        return textWrapList;
    }

    public final void g() {
        EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
        if (editTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        editTextStickerViewModel.f88319e.clear();
    }

    @Override // androidx.lifecycle.m
    public androidx.lifecycle.i getLifecycle() {
        androidx.lifecycle.i lifecycle = this.v.getLifecycle();
        h.f.b.l.b(lifecycle, "");
        return lifecycle;
    }

    public final String h() {
        return com.ss.android.ugc.aweme.editSticker.text.bean.t.i(c());
    }

    public static final class g implements com.ss.android.ugc.aweme.editSticker.text.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.i f88306a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f88307b;

        static {
            Covode.recordClassIndex(55505);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.f
        public final void a() {
            androidx.lifecycle.t<Integer> n;
            com.ss.android.ugc.aweme.editSticker.text.c.f fVar = this.f88307b.f88256i;
            if (fVar != null) {
                fVar.a();
            }
            com.ss.android.ugc.aweme.shortvideo.preview.a aVar = this.f88307b.w;
            if (aVar != null && (n = aVar.n()) != null) {
                n.setValue(3);
            }
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.f
        public final void b() {
            TextStickerData data;
            androidx.lifecycle.t<Integer> n;
            com.ss.android.ugc.aweme.editSticker.text.view.q qVar = this.f88307b.f88251d;
            if (qVar != null) {
                qVar.k();
            }
            this.f88306a.c();
            com.ss.android.ugc.aweme.shortvideo.preview.a aVar = this.f88307b.w;
            if (!(aVar == null || (n = aVar.n()) == null)) {
                n.setValue(-1);
            }
            com.ss.android.ugc.aweme.editSticker.text.view.q qVar2 = this.f88307b.f88251d;
            if (qVar2 != null && (data = qVar2.getData()) != null) {
                com.ss.android.ugc.aweme.editSticker.text.view.i iVar = this.f88306a;
                h.f.b.l.b(data, "");
                if (data.getHasReadTextAudio() && !TextUtils.isEmpty(data.getAudioText()) && (!h.f.b.l.a((Object) data.getAudioText(), (Object) com.ss.android.ugc.aweme.editSticker.text.bean.t.i(iVar.getTextWrapList()))) && data.getAudioTrackIndex() >= 0) {
                    a aVar2 = this.f88307b;
                    com.ss.android.ugc.aweme.editSticker.text.view.i iVar2 = this.f88306a;
                    aVar2.a(iVar2, data, com.ss.android.ugc.aweme.editSticker.text.bean.t.i(iVar2.getTextWrapList()));
                }
            }
        }

        g(com.ss.android.ugc.aweme.editSticker.text.view.i iVar, a aVar) {
            this.f88306a = iVar;
            this.f88307b = aVar;
        }
    }

    /* access modifiers changed from: protected */
    public final EditTextStickerViewModel a() {
        EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
        if (editTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        return editTextStickerViewModel;
    }

    /* access modifiers changed from: protected */
    public int d() {
        com.ss.android.ugc.aweme.editSticker.text.a.b a2 = com.ss.android.ugc.aweme.editSticker.text.a.b.a();
        h.f.b.l.b(a2, "");
        if (a2.d() <= 0) {
            return 28;
        }
        com.ss.android.ugc.aweme.editSticker.text.a.b a3 = com.ss.android.ugc.aweme.editSticker.text.a.b.a();
        h.f.b.l.b(a3, "");
        return a3.d();
    }

    public final void o() {
        com.ss.android.ugc.aweme.editSticker.interact.e eVar = this.A;
        if (eVar != null) {
            eVar.b();
        }
        SafeHandler safeHandler = this.n;
        if (safeHandler == null) {
            h.f.b.l.a("safeHandler");
        }
        Runnable runnable = this.I;
        if (runnable == null) {
            h.f.b.l.a("mNonInfoStickerPlayingRefreshTask");
        }
        safeHandler.post(runnable);
    }

    public final void p() {
        SafeHandler safeHandler = this.n;
        if (safeHandler == null) {
            h.f.b.l.a("safeHandler");
        }
        Runnable runnable = this.I;
        if (runnable == null) {
            h.f.b.l.a("mNonInfoStickerPlayingRefreshTask");
        }
        safeHandler.removeCallbacks(runnable);
    }

    public static final class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88274a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f88275b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextStickerData f88276c;

        static {
            Covode.recordClassIndex(55500);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.a.b.a
        public final void a() {
            if (System.currentTimeMillis() - this.f88275b < ((long) this.f88274a.u) && this.f88274a.a().y() == null) {
                this.f88274a.b(this.f88276c, true);
                if (this.f88274a.f88257j == null) {
                    this.f88274a.t = true;
                }
                com.ss.android.ugc.aweme.editSticker.d.e eVar = this.f88274a.f88257j;
                if (eVar != null) {
                    eVar.d();
                }
            }
        }

        b(a aVar, long j2, TextStickerData textStickerData) {
            this.f88274a = aVar;
            this.f88275b = j2;
            this.f88276c = textStickerData;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88289a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q f88290b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f88291c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f88292d;

        static {
            Covode.recordClassIndex(55501);
        }

        c(a aVar, com.ss.android.ugc.aweme.editSticker.text.view.q qVar, int i2, int i3) {
            this.f88289a = aVar;
            this.f88290b = qVar;
            this.f88291c = i2;
            this.f88292d = i3;
        }

        public final void run() {
            a.a(this.f88289a).b().postValue(new com.ss.android.ugc.aweme.editSticker.interact.hit.a(this.f88290b.getHelpRect().left + (this.f88290b.getHelpRect().width() / 2.0f), this.f88290b.getHelpRect().top, this.f88291c, this.f88292d));
            com.ss.android.ugc.aweme.editSticker.d.e eVar = this.f88289a.f88257j;
            if (eVar != null) {
                eVar.f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88302a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q f88303b;

        static {
            Covode.recordClassIndex(55502);
        }

        d(a aVar, com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            this.f88302a = aVar;
            this.f88303b = qVar;
        }

        public final void run() {
            a.a(this.f88302a).b().postValue(new com.ss.android.ugc.aweme.editSticker.interact.hit.a(((float) dh.b(this.f88302a.y.getContext())) / 2.0f, this.f88303b.getGuidanceRectBottom() + ((float) this.f88302a.o), R.string.pt, 6));
        }
    }

    public static final class i implements com.ss.android.ugc.aweme.editSticker.text.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88310a;

        static {
            Covode.recordClassIndex(55507);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.f
        public final void a() {
            this.f88310a.a().f88323m.a(new h.p<>(false, false));
            this.f88310a.b(false);
            this.f88310a.a().f(true);
        }

        @Override // com.ss.android.ugc.aweme.editSticker.text.c.f
        public final void b() {
            if (!this.f88310a.a().f88315a) {
                this.f88310a.a().f88323m.a(new h.p<>(true, false));
            }
            this.f88310a.m();
            this.f88310a.a().f(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(a aVar) {
            this.f88310a = aVar;
        }
    }

    public void i() {
        this.f88256i = new i(this);
        this.f88253f = new j(this);
        com.ss.android.ugc.aweme.editSticker.text.view.i iVar = this.z;
        iVar.setInputLayoutShowListener(new g(iVar, this));
        iVar.setTextStickerUpdateListener(new k(iVar));
        iVar.setVisibleController(new h(iVar, this));
    }

    public final void m() {
        View view;
        View view2;
        EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
        if (editTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        if (!editTextStickerViewModel.x() || (view2 = this.f88250c) == null || view2.getVisibility() != 8) {
            View view3 = this.f88250c;
            if (view3 != null && view3.getVisibility() == 0 && (view = this.f88250c) != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view4 = this.f88250c;
        if (view4 != null) {
            view4.setVisibility(0);
        }
    }

    static final class aq implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88270a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q f88271b;

        static {
            Covode.recordClassIndex(55498);
        }

        aq(a aVar, com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            this.f88270a = aVar;
            this.f88271b = qVar;
        }

        public final void run() {
            this.f88270a.r.b(false);
            com.ss.android.ugc.aweme.editSticker.text.c.e eVar = this.f88270a.f88252e;
            if (eVar != null) {
                eVar.a();
            }
            a.a(this.f88270a).b().postValue(new com.ss.android.ugc.aweme.editSticker.interact.hit.a(this.f88271b.getHelpRect().left + (this.f88271b.getHelpRect().width() / 2.0f), this.f88271b.getHelpRect().top, R.string.gej, 5));
        }
    }

    static final class ar implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88272a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.editSticker.text.view.q f88273b;

        static {
            Covode.recordClassIndex(55499);
        }

        ar(a aVar, com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
            this.f88272a = aVar;
            this.f88273b = qVar;
        }

        public final void run() {
            this.f88272a.r.c(false);
            com.ss.android.ugc.aweme.editSticker.text.c.e eVar = this.f88272a.f88252e;
            if (eVar != null) {
                eVar.a();
            }
            a.a(this.f88272a).b().postValue(new com.ss.android.ugc.aweme.editSticker.interact.hit.a(this.f88273b.getHelpRect().left + (this.f88273b.getHelpRect().width() / 2.0f), this.f88273b.getHelpRect().top, R.string.ayh, 5));
        }
    }

    private final void r() {
        com.ss.android.ugc.aweme.editSticker.interact.view.e eVar;
        View contentView;
        MethodCollector.i(2928);
        ViewGroup.LayoutParams layoutParams = this.y.getLayoutParams();
        this.D = new Rect(0, 0, layoutParams.width, layoutParams.height);
        com.ss.android.ugc.aweme.editSticker.interact.view.e eVar2 = this.E;
        if (!(eVar2 == null || (contentView = eVar2.getContentView()) == null || contentView.getParent() == null)) {
            ViewParent parent = contentView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(contentView);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.o(2928);
                throw nullPointerException;
            }
        }
        com.ss.android.ugc.aweme.editSticker.interact.view.a aVar = com.ss.android.ugc.aweme.editSticker.d.c().f88097d;
        if (aVar != null) {
            eVar = aVar.a(this.v, this.J);
        } else {
            eVar = null;
        }
        this.E = eVar;
        if (eVar != null) {
            this.y.addView(eVar.getContentView());
            MethodCollector.o(2928);
            return;
        }
        MethodCollector.o(2928);
    }

    public final void k() {
        com.ss.android.ugc.asve.editor.g value;
        MethodCollector.i(2862);
        EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
        if (editTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        ListIterator<com.ss.android.ugc.aweme.editSticker.text.view.q> listIterator = editTextStickerViewModel.f88319e.listIterator();
        while (listIterator.hasNext()) {
            com.ss.android.ugc.aweme.editSticker.text.view.q next = listIterator.next();
            this.y.removeView(next);
            listIterator.remove();
            com.ss.android.ugc.aweme.editSticker.text.c.e eVar = this.f88252e;
            if (eVar != null) {
                eVar.a(next);
            }
            TextStickerData data = next.getData();
            if (data != null && data.getAudioTrackIndex() >= 0) {
                LiveData<com.ss.android.ugc.asve.editor.g> liveData = this.B;
                if (!(liveData == null || (value = liveData.getValue()) == null)) {
                    value.e(data.getAudioTrackIndex());
                }
                data.setAudioTrackIndex(-1);
                data.setHasReadTextAudio(false);
            }
        }
        this.f88251d = null;
        MethodCollector.o(2862);
    }

    public final void l() {
        h.p<Integer, Integer> pVar = this.L;
        if (pVar != null && pVar.getFirst().intValue() != 0 && pVar.getSecond().intValue() != 0) {
            int[] a2 = com.ss.android.ugc.aweme.editSticker.f.g.a(this.y, pVar.getFirst().intValue(), pVar.getSecond().intValue());
            this.J = a2[0];
            this.o = a2[1];
            r();
        }
    }

    /* access modifiers changed from: protected */
    public void q() {
        MethodCollector.i(3342);
        List<TextStickerTextWrap> c2 = c();
        if (com.ss.android.ugc.aweme.editSticker.text.bean.t.e(c2)) {
            a(c2);
            s();
            g(this.f88251d);
        } else {
            com.ss.android.ugc.aweme.editSticker.text.view.q qVar = this.f88251d;
            if (qVar != null) {
                this.y.removeView(qVar);
                EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
                if (editTextStickerViewModel == null) {
                    h.f.b.l.a("textStickerViewModel");
                }
                editTextStickerViewModel.a(qVar);
            }
            s();
            g(this.f88251d);
            this.f88251d = null;
        }
        this.q = false;
        MethodCollector.o(3342);
    }

    private final void s() {
        com.ss.android.ugc.aweme.editSticker.text.view.q qVar;
        EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
        if (editTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        if (editTextStickerViewModel.f88317c != null && (qVar = this.f88251d) != null && qVar.getData() != null) {
            EditTextStickerViewModel editTextStickerViewModel2 = this.f88248a;
            if (editTextStickerViewModel2 == null) {
                h.f.b.l.a("textStickerViewModel");
            }
            TextStickerData textStickerData = editTextStickerViewModel2.f88317c;
            if (textStickerData != null) {
                com.ss.android.ugc.aweme.editSticker.text.view.q qVar2 = this.f88251d;
                if (qVar2 == null) {
                    h.f.b.l.b();
                }
                TextStickerData data = qVar2.getData();
                if (data == null) {
                    h.f.b.l.b();
                }
                data.setAudioTrackDuration(textStickerData.getAudioTrackDuration());
                com.ss.android.ugc.aweme.editSticker.text.view.q qVar3 = this.f88251d;
                if (qVar3 == null) {
                    h.f.b.l.b();
                }
                TextStickerData data2 = qVar3.getData();
                if (data2 == null) {
                    h.f.b.l.b();
                }
                data2.setAudioTrackFilePath(textStickerData.getAudioTrackFilePath());
                com.ss.android.ugc.aweme.editSticker.text.view.q qVar4 = this.f88251d;
                if (qVar4 == null) {
                    h.f.b.l.b();
                }
                TextStickerData data3 = qVar4.getData();
                if (data3 == null) {
                    h.f.b.l.b();
                }
                data3.getAudioPathList().addAll(textStickerData.getAudioPathList());
                com.ss.android.ugc.aweme.editSticker.text.view.q qVar5 = this.f88251d;
                if (qVar5 == null) {
                    h.f.b.l.b();
                }
                TextStickerData data4 = qVar5.getData();
                if (data4 == null) {
                    h.f.b.l.b();
                }
                data4.setAudioText(textStickerData.getAudioText());
                com.ss.android.ugc.aweme.editSticker.text.view.q qVar6 = this.f88251d;
                if (qVar6 == null) {
                    h.f.b.l.b();
                }
                TextStickerData data5 = qVar6.getData();
                if (data5 == null) {
                    h.f.b.l.b();
                }
                data5.setAudioTrackDuration(textStickerData.getAudioTrackDuration());
                com.ss.android.ugc.aweme.editSticker.text.view.q qVar7 = this.f88251d;
                if (qVar7 == null) {
                    h.f.b.l.b();
                }
                TextStickerData data6 = qVar7.getData();
                if (data6 == null) {
                    h.f.b.l.b();
                }
                data6.setSpeakerID(textStickerData.getSpeakerID());
                com.ss.android.ugc.aweme.editSticker.text.view.q qVar8 = this.f88251d;
                if (qVar8 == null) {
                    h.f.b.l.b();
                }
                TextStickerData data7 = qVar8.getData();
                if (data7 == null) {
                    h.f.b.l.b();
                }
                data7.setAudioTrackIndex(textStickerData.getAudioTrackIndex());
                com.ss.android.ugc.aweme.editSticker.text.view.q qVar9 = this.f88251d;
                if (qVar9 == null) {
                    h.f.b.l.b();
                }
                TextStickerData data8 = qVar9.getData();
                if (data8 == null) {
                    h.f.b.l.b();
                }
                data8.setHasReadTextAudio(textStickerData.getHasReadTextAudio());
            }
        }
    }

    public final void j() {
        InfoStickerModel a2;
        List<StickerItemModel> list;
        com.ss.android.ugc.asve.editor.g value;
        VESize b2;
        EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
        if (editTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        boolean z2 = !editTextStickerViewModel.o();
        boolean z3 = false;
        com.ss.android.ugc.aweme.editSticker.text.als.d dVar = this.C;
        if (dVar != null && (a2 = dVar.a()) != null && (list = a2.stickers) != null) {
            Iterator<StickerItemModel> it = list.iterator();
            while (it.hasNext()) {
                StickerItemModel next = it.next();
                if (next.type == 2) {
                    if (z2) {
                        if (!z3) {
                            h.p<Integer, Integer> pVar = null;
                            LiveData<com.ss.android.ugc.asve.editor.g> liveData = this.B;
                            if (!(liveData == null || (value = liveData.getValue()) == null || (b2 = value.b()) == null)) {
                                pVar = new h.p<>(Integer.valueOf(b2.width), Integer.valueOf(b2.height));
                            }
                            a(pVar);
                            z3 = true;
                        }
                        TextStickerData textStickerData = (TextStickerData) com.ss.android.ugc.aweme.editSticker.d.b().a(next.extra, TextStickerData.class);
                        if (textStickerData != null) {
                            EditTextStickerViewModel editTextStickerViewModel2 = this.f88248a;
                            if (editTextStickerViewModel2 == null) {
                                h.f.b.l.a("textStickerViewModel");
                            }
                            editTextStickerViewModel2.a(textStickerData);
                            d(textStickerData);
                        }
                    }
                    it.remove();
                }
            }
        }
    }

    public void f() {
        h.p<Integer, Integer> pVar;
        com.ss.android.ugc.asve.editor.g value;
        VESize b2;
        LiveData<h.z> K2;
        com.ss.android.ugc.aweme.editSticker.text.a.b.a().a(this.y.getContext());
        androidx.fragment.app.e eVar = this.v;
        JediViewModel a2 = com.bytedance.jedi.arch.t.a(eVar).a(EditTextStickerViewModel.class);
        h.f.b.l.b(a2, "");
        EditTextStickerViewModel editTextStickerViewModel = (EditTextStickerViewModel) a2;
        this.f88248a = editTextStickerViewModel;
        if (editTextStickerViewModel == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        editTextStickerViewModel.a(this.O);
        String str = null;
        androidx.lifecycle.ac a3 = androidx.lifecycle.ae.a(eVar, (ad.b) null).a(StickerHintTextViewModel.class);
        h.f.b.l.b(a3, "");
        this.f88249b = (StickerHintTextViewModel) a3;
        this.n = new SafeHandler(this.v);
        EditTextStickerViewModel editTextStickerViewModel2 = this.f88248a;
        if (editTextStickerViewModel2 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        this.H = new com.ss.android.ugc.aweme.editSticker.text.c.g(editTextStickerViewModel2);
        com.bytedance.f.a.a.j jVar = this.M;
        com.ss.android.ugc.aweme.editSticker.text.c.g gVar = this.H;
        if (gVar == null) {
            h.f.b.l.a("gestureListener");
        }
        jVar.a(new com.bytedance.f.a.a.f(200, gVar));
        com.ss.android.ugc.aweme.story.h.c.a.b bVar = new com.ss.android.ugc.aweme.story.h.c.a.b(this.v, null);
        bVar.a(this);
        this.G = bVar;
        com.ss.android.ugc.aweme.editSticker.interact.e eVar2 = this.A;
        if (eVar2 != null) {
            eVar2.a();
        }
        EditTextStickerViewModel editTextStickerViewModel3 = this.f88248a;
        if (editTextStickerViewModel3 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        editTextStickerViewModel3.u().observe(this.v, new l(this));
        EditTextStickerViewModel editTextStickerViewModel4 = this.f88248a;
        if (editTextStickerViewModel4 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar = e.f88465a;
        com.bytedance.jedi.arch.ah ahVar = new com.bytedance.jedi.arch.ah();
        ahVar.f39377a = true;
        selectSubscribe(editTextStickerViewModel4, kVar, ahVar, new w(this));
        EditTextStickerViewModel editTextStickerViewModel5 = this.f88248a;
        if (editTextStickerViewModel5 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar2 = p.f88613a;
        com.bytedance.jedi.arch.ah ahVar2 = new com.bytedance.jedi.arch.ah();
        ahVar2.f39377a = true;
        subscribeEvent(editTextStickerViewModel5, kVar2, ahVar2, new aj(this));
        EditTextStickerViewModel editTextStickerViewModel6 = this.f88248a;
        if (editTextStickerViewModel6 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar3 = aa.f88314a;
        com.bytedance.jedi.arch.ah ahVar3 = new com.bytedance.jedi.arch.ah();
        ahVar3.f39377a = true;
        selectNonNullSubscribe(editTextStickerViewModel6, kVar3, ahVar3, new m(this));
        EditTextStickerViewModel editTextStickerViewModel7 = this.f88248a;
        if (editTextStickerViewModel7 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar4 = b.f88362a;
        com.bytedance.jedi.arch.ah ahVar4 = new com.bytedance.jedi.arch.ah();
        ahVar4.f39377a = true;
        selectSubscribe(editTextStickerViewModel7, kVar4, ahVar4, new n(this));
        EditTextStickerViewModel editTextStickerViewModel8 = this.f88248a;
        if (editTextStickerViewModel8 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar5 = c.f88457a;
        com.bytedance.jedi.arch.ah ahVar5 = new com.bytedance.jedi.arch.ah();
        ahVar5.f39377a = true;
        selectSubscribe(editTextStickerViewModel8, kVar5, ahVar5, new o(this));
        EditTextStickerViewModel editTextStickerViewModel9 = this.f88248a;
        if (editTextStickerViewModel9 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar6 = d.f88464a;
        com.bytedance.jedi.arch.ah ahVar6 = new com.bytedance.jedi.arch.ah();
        ahVar6.f39377a = true;
        selectSubscribe(editTextStickerViewModel9, kVar6, ahVar6, new p(this));
        EditTextStickerViewModel editTextStickerViewModel10 = this.f88248a;
        if (editTextStickerViewModel10 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar7 = f.f88603a;
        com.bytedance.jedi.arch.ah ahVar7 = new com.bytedance.jedi.arch.ah();
        ahVar7.f39377a = true;
        selectSubscribe(editTextStickerViewModel10, kVar7, ahVar7, new q(this));
        EditTextStickerViewModel editTextStickerViewModel11 = this.f88248a;
        if (editTextStickerViewModel11 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar8 = g.f88604a;
        com.bytedance.jedi.arch.ah ahVar8 = new com.bytedance.jedi.arch.ah();
        ahVar8.f39377a = true;
        selectSubscribe(editTextStickerViewModel11, kVar8, ahVar8, new r(this));
        EditTextStickerViewModel editTextStickerViewModel12 = this.f88248a;
        if (editTextStickerViewModel12 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar9 = h.f88605a;
        com.bytedance.jedi.arch.ah ahVar9 = new com.bytedance.jedi.arch.ah();
        ahVar9.f39377a = true;
        selectSubscribe(editTextStickerViewModel12, kVar9, ahVar9, new s(this));
        EditTextStickerViewModel editTextStickerViewModel13 = this.f88248a;
        if (editTextStickerViewModel13 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar10 = i.f88606a;
        com.bytedance.jedi.arch.ah ahVar10 = new com.bytedance.jedi.arch.ah();
        ahVar10.f39377a = true;
        selectSubscribe(editTextStickerViewModel13, kVar10, ahVar10, new t(this));
        EditTextStickerViewModel editTextStickerViewModel14 = this.f88248a;
        if (editTextStickerViewModel14 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar11 = j.f88607a;
        com.bytedance.jedi.arch.ah ahVar11 = new com.bytedance.jedi.arch.ah();
        ahVar11.f39377a = true;
        selectSubscribe(editTextStickerViewModel14, kVar11, ahVar11, new u(this));
        EditTextStickerViewModel editTextStickerViewModel15 = this.f88248a;
        if (editTextStickerViewModel15 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar12 = k.f88608a;
        com.bytedance.jedi.arch.ah ahVar12 = new com.bytedance.jedi.arch.ah();
        ahVar12.f39377a = true;
        selectSubscribe(editTextStickerViewModel15, kVar12, ahVar12, new v(this));
        EditTextStickerViewModel editTextStickerViewModel16 = this.f88248a;
        if (editTextStickerViewModel16 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar13 = l.f88609a;
        com.bytedance.jedi.arch.ah ahVar13 = new com.bytedance.jedi.arch.ah();
        ahVar13.f39377a = true;
        selectSubscribe(editTextStickerViewModel16, kVar13, ahVar13, new x(this));
        EditTextStickerViewModel editTextStickerViewModel17 = this.f88248a;
        if (editTextStickerViewModel17 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar14 = m.f88610a;
        com.bytedance.jedi.arch.ah ahVar14 = new com.bytedance.jedi.arch.ah();
        ahVar14.f39377a = true;
        subscribeEvent(editTextStickerViewModel17, kVar14, ahVar14, new y(this));
        EditTextStickerViewModel editTextStickerViewModel18 = this.f88248a;
        if (editTextStickerViewModel18 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar15 = n.f88611a;
        com.bytedance.jedi.arch.ah ahVar15 = new com.bytedance.jedi.arch.ah();
        ahVar15.f39377a = true;
        selectSubscribe(editTextStickerViewModel18, kVar15, ahVar15, new z(this));
        EditTextStickerViewModel editTextStickerViewModel19 = this.f88248a;
        if (editTextStickerViewModel19 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar16 = o.f88612a;
        com.bytedance.jedi.arch.ah ahVar16 = new com.bytedance.jedi.arch.ah();
        ahVar16.f39377a = true;
        selectSubscribe(editTextStickerViewModel19, kVar16, ahVar16, new aa(this));
        EditTextStickerViewModel editTextStickerViewModel20 = this.f88248a;
        if (editTextStickerViewModel20 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar17 = q.f88614a;
        com.bytedance.jedi.arch.ah ahVar17 = new com.bytedance.jedi.arch.ah();
        ahVar17.f39377a = true;
        selectSubscribe(editTextStickerViewModel20, kVar17, ahVar17, new ab(this));
        EditTextStickerViewModel editTextStickerViewModel21 = this.f88248a;
        if (editTextStickerViewModel21 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar18 = r.f88615a;
        com.bytedance.jedi.arch.ah ahVar18 = new com.bytedance.jedi.arch.ah();
        ahVar18.f39377a = true;
        subscribeEvent(editTextStickerViewModel21, kVar18, ahVar18, new ac(this));
        EditTextStickerViewModel editTextStickerViewModel22 = this.f88248a;
        if (editTextStickerViewModel22 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar19 = s.f88616a;
        com.bytedance.jedi.arch.ah ahVar19 = new com.bytedance.jedi.arch.ah();
        ahVar19.f39377a = true;
        selectSubscribe(editTextStickerViewModel22, kVar19, ahVar19, new ad(this));
        EditTextStickerViewModel editTextStickerViewModel23 = this.f88248a;
        if (editTextStickerViewModel23 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar20 = t.f88617a;
        com.bytedance.jedi.arch.ah ahVar20 = new com.bytedance.jedi.arch.ah();
        ahVar20.f39377a = true;
        subscribeEvent(editTextStickerViewModel23, kVar20, ahVar20, new ae(this));
        EditTextStickerViewModel editTextStickerViewModel24 = this.f88248a;
        if (editTextStickerViewModel24 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        h.k.k kVar21 = u.f88618a;
        com.bytedance.jedi.arch.ah ahVar21 = new com.bytedance.jedi.arch.ah();
        ahVar21.f39377a = true;
        subscribeEvent(editTextStickerViewModel24, kVar21, ahVar21, new af(this));
        EditTextStickerViewModel editTextStickerViewModel25 = this.f88248a;
        if (editTextStickerViewModel25 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel25, v.f88619a, new com.bytedance.jedi.arch.ah(), new ag(this));
        EditTextStickerViewModel editTextStickerViewModel26 = this.f88248a;
        if (editTextStickerViewModel26 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel26, w.f88715a, new com.bytedance.jedi.arch.ah(), new ah(this));
        com.ss.android.ugc.aweme.shortvideo.preview.a aVar = this.w;
        if (!(aVar == null || (K2 = aVar.K()) == null)) {
            K2.observe(this, new ai(this));
        }
        EditTextStickerViewModel editTextStickerViewModel27 = this.f88248a;
        if (editTextStickerViewModel27 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel27, x.f88716a, new com.bytedance.jedi.arch.ah(), new ak(this));
        EditTextStickerViewModel editTextStickerViewModel28 = this.f88248a;
        if (editTextStickerViewModel28 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel28, y.f88717a, new com.bytedance.jedi.arch.ah(), new al(this));
        EditTextStickerViewModel editTextStickerViewModel29 = this.f88248a;
        if (editTextStickerViewModel29 == null) {
            h.f.b.l.a("textStickerViewModel");
        }
        selectNonNullSubscribe(editTextStickerViewModel29, z.f88718a, new com.bytedance.jedi.arch.ah(), new am(this));
        i();
        j();
        if (this.P) {
            LiveData<com.ss.android.ugc.asve.editor.g> liveData = this.B;
            if (liveData == null || (value = liveData.getValue()) == null || (b2 = value.b()) == null) {
                pVar = null;
            } else {
                pVar = new h.p<>(Integer.valueOf(b2.width), Integer.valueOf(b2.height));
            }
            a(pVar);
            TextStickerData textStickerData = new TextStickerData("", 2, -1, 2, "Proxima-Nova-Semibold.otf", null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870880, null);
            textStickerData.setEditCenterPoint(new Point(com.ss.android.ttve.utils.b.a(this.v) / 2, com.ss.android.ttve.utils.b.b(this.v) / 2));
            CharSequence text = this.v.getResources().getText(R.string.pu);
            if (text instanceof String) {
                str = text;
            }
            textStickerData.setTextWrapList(h.a.n.a(com.ss.android.ugc.aweme.editSticker.text.bean.t.a(str, false)));
            textStickerData.setY(com.ss.android.ttve.utils.b.b(this.v, 154.0f));
            c(textStickerData);
            textStickerData.setGuidanceSticker(true);
            textStickerData.setScale(0.7f);
            long currentTimeMillis = System.currentTimeMillis();
            com.ss.android.ugc.aweme.editSticker.text.a.b a4 = com.ss.android.ugc.aweme.editSticker.text.a.b.a();
            String fontType = textStickerData.getFontType();
            b bVar2 = new b(this, currentTimeMillis, textStickerData);
            if (a4.f88280c.get(fontType) == null) {
                com.ss.android.ugc.aweme.editSticker.d.d().c("text font " + fontType + " is null");
                com.ss.android.ugc.aweme.editSticker.g.b().a(com.ss.android.ugc.aweme.editSticker.g.a().f88137a, false, true, (IFetchEffectChannelListener) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03f8: INVOKE  
                      (wrap: com.ss.android.ugc.tools.b.a.d : 0x03e9: INVOKE  (r4v33 com.ss.android.ugc.tools.b.a.d) =  type: STATIC call: com.ss.android.ugc.aweme.editSticker.g.b():com.ss.android.ugc.tools.b.a.d)
                      (wrap: java.lang.String : 0x03f1: IGET  (r3v47 java.lang.String) = 
                      (wrap: com.ss.android.ugc.aweme.editSticker.e : 0x03ed: INVOKE  (r2v20 com.ss.android.ugc.aweme.editSticker.e) =  type: STATIC call: com.ss.android.ugc.aweme.editSticker.g.a():com.ss.android.ugc.aweme.editSticker.e)
                     com.ss.android.ugc.aweme.editSticker.e.a java.lang.String)
                      false
                      true
                      (wrap: com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener : ?: CAST (com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener) (wrap: com.ss.android.ugc.aweme.editSticker.text.a.b$3 : 0x03f5: CONSTRUCTOR  (r2v21 com.ss.android.ugc.aweme.editSticker.text.a.b$3) = 
                      (r7v1 'a4' com.ss.android.ugc.aweme.editSticker.text.a.b)
                      (r5v30 'bVar2' com.ss.android.ugc.aweme.editSticker.text.a$b)
                     call: com.ss.android.ugc.aweme.editSticker.text.a.b.3.<init>(com.ss.android.ugc.aweme.editSticker.text.a.b, com.ss.android.ugc.aweme.editSticker.text.a.b$a):void type: CONSTRUCTOR))
                     type: INTERFACE call: com.ss.android.ugc.tools.b.a.d.a(java.lang.String, boolean, boolean, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener):void in method: com.ss.android.ugc.aweme.editSticker.text.a.f():void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener) (wrap: com.ss.android.ugc.aweme.editSticker.text.a.b$3 : 0x03f5: CONSTRUCTOR  (r2v21 com.ss.android.ugc.aweme.editSticker.text.a.b$3) = 
                      (r7v1 'a4' com.ss.android.ugc.aweme.editSticker.text.a.b)
                      (r5v30 'bVar2' com.ss.android.ugc.aweme.editSticker.text.a$b)
                     call: com.ss.android.ugc.aweme.editSticker.text.a.b.3.<init>(com.ss.android.ugc.aweme.editSticker.text.a.b, com.ss.android.ugc.aweme.editSticker.text.a.b$a):void type: CONSTRUCTOR) in method: com.ss.android.ugc.aweme.editSticker.text.a.f():void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03f5: CONSTRUCTOR  (r2v21 com.ss.android.ugc.aweme.editSticker.text.a.b$3) = 
                      (r7v1 'a4' com.ss.android.ugc.aweme.editSticker.text.a.b)
                      (r5v30 'bVar2' com.ss.android.ugc.aweme.editSticker.text.a$b)
                     call: com.ss.android.ugc.aweme.editSticker.text.a.b.3.<init>(com.ss.android.ugc.aweme.editSticker.text.a.b, com.ss.android.ugc.aweme.editSticker.text.a.b$a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.editSticker.text.a.f():void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.editSticker.text.a.b, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                // Method dump skipped, instructions count: 1036
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.a.f():void");
            }

            public static final class ap implements com.ss.android.ugc.aweme.editSticker.text.c.d {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f88269a;

                static {
                    Covode.recordClassIndex(55497);
                }

                @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
                public final void e(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
                    h.f.b.l.d(qVar, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                ap(a aVar) {
                    this.f88269a = aVar;
                }

                @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
                public final float a(float f2) {
                    com.ss.android.ugc.aweme.editSticker.interact.view.e eVar = this.f88269a.E;
                    if (eVar != null) {
                        return eVar.a(f2);
                    }
                    return f2;
                }

                @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
                public final void d(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
                    h.f.b.l.d(qVar, "");
                    com.ss.android.ugc.aweme.editSticker.d.e eVar = this.f88269a.f88257j;
                    if (eVar != null) {
                        eVar.e();
                    }
                }

                @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
                public final void b(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
                    h.f.b.l.d(qVar, "");
                    this.f88269a.r.c(true);
                    this.f88269a.a().n();
                    h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> bVar = this.f88269a.f88255h;
                    if (bVar != null) {
                        bVar.invoke(qVar);
                    }
                }

                @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
                public final void c(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
                    h.f.b.l.d(qVar, "");
                    this.f88269a.e(qVar);
                    com.ss.android.ugc.aweme.editSticker.d.e eVar = this.f88269a.f88257j;
                    if (eVar != null) {
                        eVar.a(qVar.f88710m ? 1 : 0, "click_cross");
                    }
                    a.a(this.f88269a).a().postValue(true);
                }

                @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
                public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
                    h.f.b.l.d(qVar, "");
                    this.f88269a.a().b(true);
                    this.f88269a.a().n();
                    h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, h.z> bVar = this.f88269a.f88254g;
                    if (bVar != null) {
                        bVar.invoke(qVar);
                    }
                    com.ss.android.ugc.aweme.editSticker.d.e eVar = this.f88269a.f88257j;
                    if (eVar != null) {
                        eVar.b();
                    }
                }

                @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
                public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, boolean z) {
                    h.f.b.l.d(qVar, "");
                    com.ss.android.ugc.aweme.editSticker.text.c.d dVar = this.f88269a.f88259l;
                    if (dVar != null) {
                        dVar.a(qVar, z);
                    }
                    if (z) {
                        a aVar = this.f88269a;
                        if (!((EditTextStickerViewState) aVar.getState(aVar.a())).getInTimeEditView()) {
                            if (System.currentTimeMillis() - this.f88269a.p > 500) {
                                this.f88269a.f(qVar);
                                return;
                            }
                            return;
                        }
                    }
                    if (this.f88269a.f88253f != null) {
                        com.ss.android.ugc.aweme.editSticker.interact.a.b bVar = this.f88269a.f88253f;
                        if (bVar == null) {
                            h.f.b.l.b();
                        }
                        bVar.a();
                        this.f88269a.f88251d = qVar;
                        if (this.f88269a.f88251d != null) {
                            a aVar2 = this.f88269a;
                            aVar2.b(aVar2.f88251d);
                        }
                    }
                    this.f88269a.a().n();
                }

                @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
                public final int a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, boolean z, boolean z2) {
                    h.f.b.l.d(qVar, "");
                    com.ss.android.ugc.aweme.editSticker.interact.view.e eVar = this.f88269a.E;
                    if (eVar == null) {
                        return -1;
                    }
                    if (!z) {
                        return eVar.a(qVar.getAnglePointListForBlock(), z2);
                    }
                    eVar.b();
                    return -1;
                }

                @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
                public final PointF a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, float f2, float f3) {
                    h.f.b.l.d(qVar, "");
                    com.ss.android.ugc.aweme.editSticker.interact.view.e eVar = this.f88269a.E;
                    if (eVar == null) {
                        return new PointF(0.0f, 0.0f);
                    }
                    PointF[] anglePointList = qVar.getAnglePointList();
                    for (PointF pointF : anglePointList) {
                        pointF.x += f2;
                        pointF.y += f3;
                    }
                    return eVar.a(anglePointList, f2, f3);
                }

                @Override // com.ss.android.ugc.aweme.editSticker.text.c.d
                public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, RectF rectF, com.ss.android.ugc.aweme.editSticker.text.c.i iVar) {
                    h.f.b.l.d(qVar, "");
                    h.f.b.l.d(rectF, "");
                    h.f.b.l.d(iVar, "");
                    if (!iVar.f88461c) {
                        this.f88269a.b(qVar);
                    }
                    if (!iVar.f88462d && !iVar.f88463e) {
                        boolean a2 = com.ss.android.ugc.aweme.editSticker.f.b.a(this.f88269a.D, qVar.getAnglePointList());
                        com.ss.android.ugc.aweme.editSticker.interact.e eVar = this.f88269a.A;
                        if (eVar != null) {
                            this.f88269a.a(qVar, eVar.a(iVar.f88459a, iVar.f88460b, iVar.f88461c, a2));
                        }
                        if (this.f88269a.x && this.f88269a.w != null) {
                            if (iVar.f88461c) {
                                if (this.f88269a.w.m() != 1) {
                                    this.f88269a.w.v().setValue(dmt.av.video.t.a());
                                }
                            } else if (this.f88269a.w.C().getValue() != null) {
                                com.ss.android.ugc.asve.editor.g value = this.f88269a.w.C().getValue();
                                if (value == null) {
                                    h.f.b.l.b();
                                }
                                if (value.f() != x.j.PAUSED) {
                                    this.f88269a.w.v().setValue(dmt.av.video.t.b());
                                }
                            }
                        }
                    }
                    if (this.f88269a.A != null) {
                        qVar.setAlpha(1.0f);
                    }
                    com.ss.android.ugc.aweme.editSticker.text.c.e eVar2 = this.f88269a.f88252e;
                    if (eVar2 != null) {
                        eVar2.a(qVar, new com.ss.android.ugc.aweme.editSticker.text.c.i(iVar.f88459a, iVar.f88460b, iVar.f88461c, iVar.f88462d, iVar.f88463e));
                    }
                }
            }

            public final void a(String str) {
                b(com.ss.android.ugc.aweme.editSticker.text.bean.t.a(str));
            }

            public static final /* synthetic */ StickerHintTextViewModel a(a aVar) {
                StickerHintTextViewModel stickerHintTextViewModel = aVar.f88249b;
                if (stickerHintTextViewModel == null) {
                    h.f.b.l.a("hintTextViewModel");
                }
                return stickerHintTextViewModel;
            }

            /* access modifiers changed from: protected */
            public void d(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
                h.f.b.l.d(qVar, "");
                qVar.setOnEditClickListener(new ap(this));
            }

            @Override // com.bytedance.jedi.arch.b
            public <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af> S1 getState(VM1 vm1) {
                h.f.b.l.d(vm1, "");
                return (S1) b.a.a(this, vm1);
            }

            @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
            public final void c(int i2) {
                if (this.z.i()) {
                    this.z.b(i2);
                }
            }

            /* access modifiers changed from: package-private */
            public static final class ai<T> implements androidx.lifecycle.u {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f88261a;

                static {
                    Covode.recordClassIndex(55487);
                }

                ai(a aVar) {
                    this.f88261a = aVar;
                }

                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Object obj) {
                    com.ss.android.ugc.aweme.editSticker.text.view.q y = this.f88261a.a().y();
                    if (y != null) {
                        this.f88261a.e(y);
                        a.a(this.f88261a).a().postValue(true);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public static final class l<T> implements androidx.lifecycle.u {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f88313a;

                static {
                    Covode.recordClassIndex(55510);
                }

                l(a aVar) {
                    this.f88313a = aVar;
                }

                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Object obj) {
                    h.p pVar = (h.p) obj;
                    if (pVar != null) {
                        EditTextStickerViewModel a2 = this.f88313a.a();
                        float floatValue = ((Number) pVar.getFirst()).floatValue();
                        boolean booleanValue = ((Boolean) pVar.getSecond()).booleanValue();
                        for (com.ss.android.ugc.aweme.editSticker.text.view.q qVar : a2.f88319e) {
                            qVar.a(floatValue, booleanValue);
                        }
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
            public final void a(int i2) {
                if (this.q) {
                    com.ss.android.ugc.aweme.editSticker.text.view.q qVar = this.f88251d;
                    if (qVar != null) {
                        qVar.l();
                    }
                    this.z.g();
                    this.z.a(i2);
                }
            }

            /* access modifiers changed from: protected */
            public com.ss.android.ugc.aweme.editSticker.text.view.q b(TextStickerData textStickerData) {
                androidx.fragment.app.e eVar = this.v;
                SafeHandler safeHandler = this.n;
                if (safeHandler == null) {
                    h.f.b.l.a("safeHandler");
                }
                com.ss.android.ugc.aweme.editSticker.text.view.q qVar = new com.ss.android.ugc.aweme.editSticker.text.view.q(eVar, safeHandler, textStickerData, true, new f(this), true);
                qVar.w = this.f88257j;
                EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
                if (editTextStickerViewModel == null) {
                    h.f.b.l.a("textStickerViewModel");
                }
                qVar.x = editTextStickerViewModel.f88318d;
                return qVar;
            }

            /* access modifiers changed from: protected */
            public final void c(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
                com.ss.android.ugc.aweme.editSticker.c.b bVar;
                h.f.b.l.d(qVar, "");
                if (this.f88260m) {
                    bVar = new ao(this, qVar);
                } else {
                    bVar = com.ss.android.ugc.aweme.editSticker.c.a.f88100a;
                }
                qVar.setMotionInterceptor(bVar);
            }

            public final void f(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
                EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
                if (editTextStickerViewModel == null) {
                    h.f.b.l.a("textStickerViewModel");
                }
                editTextStickerViewModel.n.a((Boolean) false);
                this.f88251d = qVar;
                a(qVar);
                com.ss.android.ugc.aweme.editSticker.text.c.e eVar = this.f88252e;
                if (eVar != null) {
                    eVar.c(qVar);
                }
                this.p = System.currentTimeMillis();
                com.ss.android.ugc.aweme.editSticker.d.e eVar2 = this.f88257j;
                if (eVar2 != null) {
                    eVar2.a();
                }
            }

            private final void d(TextStickerData textStickerData) {
                String audioTrackFilePath;
                LiveData<com.ss.android.ugc.asve.editor.g> liveData;
                com.ss.android.ugc.asve.editor.g value;
                if (textStickerData.getHasReadTextAudio() && (audioTrackFilePath = textStickerData.getAudioTrackFilePath()) != null && (liveData = this.B) != null && (value = liveData.getValue()) != null && audioTrackFilePath.length() > 0) {
                    int a2 = value.a(audioTrackFilePath, 0, textStickerData.getAudioTrackDuration(), textStickerData.getStartTime(), textStickerData.getStartTime() + textStickerData.getAudioTrackDuration(), false);
                    if (a2 >= 0) {
                        value.a(a2, 1, 1.0f);
                        textStickerData.setAudioTrackIndex(a2);
                    }
                }
            }

            private final void g(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
                if (qVar != null) {
                    TextStickerData data = qVar.getData();
                    if (data != null && data.getHasReadTextAudio() && (!h.f.b.l.a((Object) data.getAudioText(), (Object) com.ss.android.ugc.aweme.editSticker.text.bean.t.i(data.getTextWrapList()))) && com.ss.android.ugc.aweme.editSticker.g.a().f88138b.f88148c) {
                        com.ss.android.ugc.aweme.editSticker.text.view.i iVar = this.z;
                        h.f.b.l.b(data, "");
                        a(iVar, data, com.ss.android.ugc.aweme.editSticker.text.bean.t.i(data.getTextWrapList()));
                        return;
                    }
                    return;
                }
                EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
                if (editTextStickerViewModel == null) {
                    h.f.b.l.a("textStickerViewModel");
                }
                if (editTextStickerViewModel.f88317c != null) {
                    EditTextStickerViewModel editTextStickerViewModel2 = this.f88248a;
                    if (editTextStickerViewModel2 == null) {
                        h.f.b.l.a("textStickerViewModel");
                    }
                    TextStickerData textStickerData = editTextStickerViewModel2.f88317c;
                    if (textStickerData == null) {
                        h.f.b.l.b();
                    }
                    a(textStickerData);
                }
            }

            public final void a(TextStickerData textStickerData) {
                com.ss.android.ugc.asve.editor.g value;
                LiveData<com.ss.android.ugc.asve.editor.g> liveData = this.B;
                if (liveData != null && (value = liveData.getValue()) != null && textStickerData.getHasReadTextAudio() && textStickerData.getAudioTrackIndex() >= 0) {
                    value.e(textStickerData.getAudioTrackIndex());
                    textStickerData.setHasReadTextAudio(false);
                    textStickerData.setAudioTrackIndex(-1);
                    textStickerData.setAudioTrackFilePath(null);
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
                if (r2 != r7) goto L_0x0042;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(com.ss.android.ugc.aweme.editSticker.text.view.q r7) {
                /*
                // Method dump skipped, instructions count: 118
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.a.b(com.ss.android.ugc.aweme.editSticker.text.view.q):void");
            }

            public final void e(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
                com.ss.android.ugc.asve.editor.g value;
                MethodCollector.i(2919);
                if (qVar == null) {
                    MethodCollector.o(2919);
                    return;
                }
                this.y.removeView(qVar);
                EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
                if (editTextStickerViewModel == null) {
                    h.f.b.l.a("textStickerViewModel");
                }
                editTextStickerViewModel.a(qVar);
                this.f88251d = null;
                com.ss.android.ugc.aweme.editSticker.text.c.e eVar = this.f88252e;
                if (eVar != null) {
                    eVar.a(qVar);
                }
                TextStickerData data = qVar.getData();
                if (data != null) {
                    if (data.getAudioTrackIndex() >= 0) {
                        LiveData<com.ss.android.ugc.asve.editor.g> liveData = this.B;
                        if (!(liveData == null || (value = liveData.getValue()) == null)) {
                            value.e(data.getAudioTrackIndex());
                        }
                        data.setAudioTrackIndex(-1);
                        data.setHasReadTextAudio(false);
                    }
                    MethodCollector.o(2919);
                    return;
                }
                MethodCollector.o(2919);
            }

            private final void b(List<TextStickerTextWrap> list) {
                EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
                if (editTextStickerViewModel == null) {
                    h.f.b.l.a("textStickerViewModel");
                }
                if (editTextStickerViewModel.w() >= this.N) {
                    com.ss.android.ugc.aweme.editSticker.d.e().a(this.v, R.string.cn6);
                    return;
                }
                int curTxtMode = this.z.getCurTxtMode();
                int curColor = this.z.getCurColor();
                int alignTxt = this.z.getAlignTxt();
                com.ss.android.ugc.aweme.editSticker.text.a.b a2 = com.ss.android.ugc.aweme.editSticker.text.a.b.a();
                h.f.b.l.b(a2, "");
                TextStickerData textStickerData = new TextStickerData("", curTxtMode, curColor, alignTxt, a2.f88281d, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870880, null);
                Point editInputScreenCenterPoint = this.z.getEditInputScreenCenterPoint();
                h.f.b.l.b(editInputScreenCenterPoint, "");
                textStickerData.setEditCenterPoint(editInputScreenCenterPoint);
                textStickerData.setTextWrapList(list);
                c(textStickerData);
                textStickerData.setFontSize(d());
                a(textStickerData, false);
            }

            @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
            public final void b(int i2) {
                if (this.q) {
                    this.z.h();
                    q();
                    com.ss.android.ugc.aweme.editSticker.text.c.f fVar = this.f88256i;
                    if (fVar != null) {
                        fVar.b();
                    }
                    EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
                    if (editTextStickerViewModel == null) {
                        h.f.b.l.a("textStickerViewModel");
                    }
                    if (editTextStickerViewModel.f88316b) {
                        EditTextStickerViewModel editTextStickerViewModel2 = this.f88248a;
                        if (editTextStickerViewModel2 == null) {
                            h.f.b.l.a("textStickerViewModel");
                        }
                        editTextStickerViewModel2.c(EditTextStickerViewModel.f.f88328a);
                    }
                    EditTextStickerViewModel editTextStickerViewModel3 = this.f88248a;
                    if (editTextStickerViewModel3 == null) {
                        h.f.b.l.a("textStickerViewModel");
                    }
                    if (editTextStickerViewModel3.f88315a) {
                        com.ss.android.ugc.aweme.editSticker.text.view.q qVar = this.f88251d;
                        if (qVar != null) {
                            EditTextStickerViewModel editTextStickerViewModel4 = this.f88248a;
                            if (editTextStickerViewModel4 == null) {
                                h.f.b.l.a("textStickerViewModel");
                            }
                            h.f.b.l.d(qVar, "");
                            editTextStickerViewModel4.c(new EditTextStickerViewModel.o(qVar));
                            return;
                        }
                        return;
                    }
                    com.ss.android.ugc.aweme.editSticker.text.view.q qVar2 = this.f88251d;
                    if (qVar2 != null) {
                        TextStickerData data = qVar2.getData();
                        if (data != null && data.getHasReadTextAudio() && com.ss.android.ugc.aweme.editSticker.g.a().f88138b.f88148c && this.r.g() && !qVar2.n) {
                            qVar2.postDelayed(new aq(this, qVar2), 500);
                        }
                        TextStickerData data2 = qVar2.getData();
                        if (data2 != null && !data2.getHasReadTextAudio() && com.ss.android.ugc.aweme.editSticker.g.a().f88138b.f88147b && this.r.f() && !qVar2.n && this.s) {
                            qVar2.postDelayed(new ar(this, qVar2), 500);
                        }
                    }
                }
            }

            /* access modifiers changed from: protected */
            public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar) {
                InnerEffectTextLayoutConfig innerEffectTextLayoutConfig;
                boolean z2 = true;
                this.q = true;
                if (qVar == null || !qVar.f88710m) {
                    z2 = false;
                } else {
                    List<TextStickerTextWrap> a2 = h.a.n.a(com.ss.android.ugc.aweme.editSticker.text.bean.t.a("", false));
                    TextStickerData data = qVar.getData();
                    if (data != null) {
                        innerEffectTextLayoutConfig = data.getEffectTextLayoutConfig();
                    } else {
                        innerEffectTextLayoutConfig = null;
                    }
                    qVar.b(a2, innerEffectTextLayoutConfig);
                    qVar.setIsGuidanceSticker(false);
                    qVar.setWasGuidanceSticker(true);
                    TextStickerData data2 = qVar.getData();
                    if (data2 != null) {
                        data2.setGuidanceSticker(false);
                    }
                    EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
                    if (editTextStickerViewModel == null) {
                        h.f.b.l.a("textStickerViewModel");
                    }
                    com.ss.android.ugc.aweme.editSticker.text.view.q y2 = editTextStickerViewModel.y();
                    if (y2 != null) {
                        y2.setIsGuidanceSticker(false);
                        TextStickerData data3 = y2.getData();
                        if (data3 != null) {
                            data3.setGuidanceSticker(false);
                        }
                    }
                }
                this.z.setTextStickerView(qVar);
                EditTextStickerViewModel editTextStickerViewModel2 = this.f88248a;
                if (editTextStickerViewModel2 == null) {
                    h.f.b.l.a("textStickerViewModel");
                }
                editTextStickerViewModel2.f88317c = null;
                if (qVar == null) {
                    com.ss.android.ugc.aweme.editSticker.text.view.i iVar = this.z;
                    EditTextStickerViewModel editTextStickerViewModel3 = this.f88248a;
                    if (editTextStickerViewModel3 == null) {
                        h.f.b.l.a("textStickerViewModel");
                    }
                    iVar.a("", "", editTextStickerViewModel3.v());
                    this.f88251d = null;
                } else {
                    com.ss.android.ugc.aweme.editSticker.text.view.i iVar2 = this.z;
                    List<TextStickerTextWrap> textWrapList = qVar.getTextWrapList();
                    int curMode = qVar.getCurMode();
                    int curColor = qVar.getCurColor();
                    int curAlignTxt = qVar.getCurAlignTxt();
                    String curFontType = qVar.getCurFontType();
                    TextStickerData data4 = qVar.getData();
                    if (data4 == null) {
                        h.f.b.l.b();
                    }
                    int fontSize = data4.getFontSize();
                    EditTextStickerViewModel editTextStickerViewModel4 = this.f88248a;
                    if (editTextStickerViewModel4 == null) {
                        h.f.b.l.a("textStickerViewModel");
                    }
                    iVar2.a(textWrapList, curMode, curColor, curAlignTxt, curFontType, false, fontSize, editTextStickerViewModel4.v());
                }
                if (z2) {
                    this.z.d();
                }
            }

            public final void b(boolean z2) {
                View view;
                View view2;
                if (z2) {
                    View view3 = this.f88250c;
                    if (view3 != null && view3.getVisibility() == 8 && (view2 = this.f88250c) != null) {
                        view2.setVisibility(0);
                        return;
                    }
                    return;
                }
                View view4 = this.f88250c;
                if (view4 != null && view4.getVisibility() == 0 && (view = this.f88250c) != null) {
                    view.setVisibility(8);
                }
            }

            /* access modifiers changed from: package-private */
            public static final class aa extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.p, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55479);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                aa(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.p pVar) {
                    h.f.b.l.d(iVar, "");
                    this.this$0.l();
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class ac extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55481);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                ac(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
                    h.f.b.l.d(bVar, "");
                    h.f.b.l.d(zVar, "");
                    this.this$0.k();
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class ae extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55483);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                ae(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
                    h.f.b.l.d(bVar, "");
                    h.f.b.l.d(zVar, "");
                    this.this$0.m();
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class y extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55523);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                y(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
                    h.f.b.l.d(bVar, "");
                    h.f.b.l.d(zVar, "");
                    this.this$0.j();
                    return h.z.f158842a;
                }
            }

            @Override // com.bytedance.jedi.arch.h
            public <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
                h.f.b.l.d(vm1, "");
                h.f.b.l.d(bVar, "");
                return (R) b.a.a(this, vm1, bVar);
            }

            /* access modifiers changed from: package-private */
            public static final class ab extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55480);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                ab(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> dVar) {
                    T t;
                    com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> dVar2 = dVar;
                    h.f.b.l.d(iVar, "");
                    a aVar = this.this$0;
                    if (dVar2 != null) {
                        t = dVar2.f39404b;
                    } else {
                        t = null;
                    }
                    aVar.a((com.ss.android.ugc.aweme.editSticker.text.view.q) t);
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class ad extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.k, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55482);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                ad(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.k kVar) {
                    com.bytedance.jedi.arch.k kVar2 = kVar;
                    h.f.b.l.d(iVar, "");
                    if (kVar2 != null) {
                        this.this$0.b(kVar2.f39404b.booleanValue());
                    }
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class af extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Boolean, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55484);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                af(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, Boolean bool) {
                    boolean booleanValue = bool.booleanValue();
                    h.f.b.l.d(bVar, "");
                    this.this$0.a(booleanValue);
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class ah extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55486);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                ah(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> dVar) {
                    com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> dVar2 = dVar;
                    h.f.b.l.d(bVar, "");
                    h.f.b.l.d(dVar2, "");
                    T t = dVar2.f39404b;
                    if (t != null) {
                        this.this$0.f(t);
                    }
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class ak extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.d<? extends TextWatcher>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55489);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                ak(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.d<? extends TextWatcher> dVar) {
                    com.bytedance.jedi.arch.d<? extends TextWatcher> dVar2 = dVar;
                    h.f.b.l.d(bVar, "");
                    h.f.b.l.d(dVar2, "");
                    dVar2.a(new h.f.a.b<TextWatcher, h.z>(this) {
                        /* class com.ss.android.ugc.aweme.editSticker.text.a.ak.AnonymousClass1 */
                        final /* synthetic */ ak this$0;

                        static {
                            Covode.recordClassIndex(55490);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ h.z invoke(TextWatcher textWatcher) {
                            TextWatcher textWatcher2 = textWatcher;
                            h.f.b.l.d(textWatcher2, "");
                            this.this$0.this$0.z.f88680h.addTextChangedListener(textWatcher2);
                            return h.z.f158842a;
                        }
                    });
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class o extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends String>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55513);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                o(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends String> dVar) {
                    String str;
                    com.bytedance.jedi.arch.d<? extends String> dVar2 = dVar;
                    String str2 = "";
                    h.f.b.l.d(iVar, str2);
                    a aVar = this.this$0;
                    if (!(dVar2 == null || (str = (String) dVar2.a()) == null)) {
                        str2 = str;
                    }
                    aVar.a(str2);
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class p extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55514);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                p(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> dVar) {
                    T t;
                    com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> dVar2 = dVar;
                    h.f.b.l.d(iVar, "");
                    a aVar = this.this$0;
                    if (dVar2 != null) {
                        t = dVar2.f39404b;
                    } else {
                        t = null;
                    }
                    aVar.e(t);
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class q extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.e>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55515);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                q(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.e> dVar) {
                    T t;
                    com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.e> dVar2 = dVar;
                    h.f.b.l.d(iVar, "");
                    a aVar = this.this$0;
                    if (dVar2 != null) {
                        t = dVar2.f39404b;
                    } else {
                        t = null;
                    }
                    aVar.f88252e = t;
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class r extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends h.f.a.m<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55516);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                r(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends h.f.a.m<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>> dVar) {
                    T t;
                    com.bytedance.jedi.arch.d<? extends h.f.a.m<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>> dVar2 = dVar;
                    h.f.b.l.d(iVar, "");
                    a aVar = this.this$0;
                    if (dVar2 != null) {
                        t = dVar2.f39404b;
                    } else {
                        t = null;
                    }
                    aVar.f88258k = t;
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class s extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55517);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                s(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>> dVar) {
                    T t;
                    com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>> dVar2 = dVar;
                    h.f.b.l.d(iVar, "");
                    a aVar = this.this$0;
                    if (dVar2 != null) {
                        t = dVar2.f39404b;
                    } else {
                        t = null;
                    }
                    aVar.f88254g = t;
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class t extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.d>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55518);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                t(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.d> dVar) {
                    T t;
                    com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.c.d> dVar2 = dVar;
                    h.f.b.l.d(iVar, "");
                    a aVar = this.this$0;
                    if (dVar2 != null) {
                        t = dVar2.f39404b;
                    } else {
                        t = null;
                    }
                    aVar.f88259l = t;
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class u extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55519);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                u(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>> dVar) {
                    T t;
                    com.bytedance.jedi.arch.d<? extends h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.view.q, ? extends h.z>> dVar2 = dVar;
                    h.f.b.l.d(iVar, "");
                    a aVar = this.this$0;
                    if (dVar2 != null) {
                        t = dVar2.f39404b;
                    } else {
                        t = null;
                    }
                    aVar.f88255h = t;
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class w extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55521);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                w(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> dVar) {
                    T t;
                    com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.text.view.q> dVar2 = dVar;
                    h.f.b.l.d(iVar, "");
                    a aVar = this.this$0;
                    if (dVar2 != null) {
                        t = dVar2.f39404b;
                    } else {
                        t = null;
                    }
                    aVar.b((com.ss.android.ugc.aweme.editSticker.text.view.q) t);
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class z extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends h.p<? extends Integer, ? extends Integer>>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55524);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                z(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends h.p<? extends Integer, ? extends Integer>> dVar) {
                    T t;
                    com.bytedance.jedi.arch.d<? extends h.p<? extends Integer, ? extends Integer>> dVar2 = dVar;
                    h.f.b.l.d(iVar, "");
                    a aVar = this.this$0;
                    if (dVar2 != null) {
                        t = dVar2.f39404b;
                    } else {
                        t = null;
                    }
                    aVar.a((h.p<Integer, Integer>) t);
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class ag extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55485);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                ag(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.k kVar) {
                    com.bytedance.jedi.arch.k kVar2 = kVar;
                    h.f.b.l.d(bVar, "");
                    h.f.b.l.d(kVar2, "");
                    this.this$0.f88260m = kVar2.f39404b.booleanValue();
                    a aVar = this.this$0;
                    aVar.s = !aVar.f88260m;
                    Iterator<T> it = this.this$0.a().f88319e.iterator();
                    while (it.hasNext()) {
                        this.this$0.c((com.ss.android.ugc.aweme.editSticker.text.view.q) it.next());
                    }
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class aj extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, h.z, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55488);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                aj(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, h.z zVar) {
                    h.f.b.l.d(bVar, "");
                    h.f.b.l.d(zVar, "");
                    StickerHintTextViewModel stickerHintTextViewModel = this.this$0.f88249b;
                    if (stickerHintTextViewModel == null) {
                        h.f.b.l.a("hintTextViewModel");
                    }
                    stickerHintTextViewModel.a().postValue(true);
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class am extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.p, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55492);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                am(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.p pVar) {
                    h.f.b.l.d(bVar, "");
                    h.f.b.l.d(pVar, "");
                    Iterator<T> it = this.this$0.a().f88319e.iterator();
                    while (it.hasNext()) {
                        TextStickerData data = it.next().getData();
                        if (data != null) {
                            a aVar = this.this$0;
                            h.f.b.l.b(data, "");
                            aVar.a(data);
                        }
                    }
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55511);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                m(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.k kVar) {
                    h.f.b.l.d(bVar, "");
                    h.f.b.l.d(kVar, "");
                    EditTextStickerViewModel a2 = this.this$0.a();
                    String h2 = this.this$0.h();
                    h.f.b.l.d(h2, "");
                    a2.c(new EditTextStickerViewModel.l(h2));
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class n extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.n<TextStickerData, Boolean>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55512);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                n(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.n<TextStickerData, Boolean> nVar) {
                    T t;
                    com.bytedance.jedi.arch.n<TextStickerData, Boolean> nVar2 = nVar;
                    h.f.b.l.d(iVar, "");
                    if (!(nVar2 == null || (t = nVar2.f39404b) == null)) {
                        this.this$0.a((TextStickerData) t.getFirst(), ((Boolean) t.getSecond()).booleanValue());
                    }
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class v extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.d.e>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55520);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                v(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.d.e> dVar) {
                    T t;
                    com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.d.e> dVar2 = dVar;
                    h.f.b.l.d(iVar, "");
                    a aVar = this.this$0;
                    if (dVar2 != null) {
                        t = dVar2.f39404b;
                    } else {
                        t = null;
                    }
                    aVar.f88257j = t;
                    if (this.this$0.t) {
                        com.ss.android.ugc.aweme.editSticker.d.e eVar = this.this$0.f88257j;
                        if (eVar != null) {
                            eVar.d();
                        }
                        this.this$0.t = false;
                    }
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class x extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.bytedance.jedi.arch.d<? extends View.OnClickListener>, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55522);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                x(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i iVar, com.bytedance.jedi.arch.d<? extends View.OnClickListener> dVar) {
                    T t;
                    com.bytedance.jedi.arch.d<? extends View.OnClickListener> dVar2 = dVar;
                    h.f.b.l.d(iVar, "");
                    if (!(dVar2 == null || (t = dVar2.f39404b) == null)) {
                        a aVar = this.this$0;
                        if (aVar.f88250c == null) {
                            com.a.a(LayoutInflater.from(aVar.v), R.layout.ze, aVar.y, true);
                            TuxTextView tuxTextView = (TuxTextView) aVar.y.findViewById(R.id.f0_);
                            tuxTextView.a(26.0f);
                            aVar.f88250c = tuxTextView;
                        }
                        View view = aVar.f88250c;
                        if (view != null) {
                            view.setOnClickListener(t);
                        }
                    }
                    return h.z.f158842a;
                }
            }

            /* access modifiers changed from: package-private */
            public static final class al extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.m, h.z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(55491);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                al(a aVar) {
                    super(2);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.m mVar) {
                    com.ss.android.ugc.asve.editor.g gVar;
                    com.bytedance.jedi.arch.m mVar2 = mVar;
                    h.f.b.l.d(bVar, "");
                    h.f.b.l.d(mVar2, "");
                    int intValue = mVar2.f39404b.intValue();
                    Iterator<T> it = this.this$0.a().f88319e.iterator();
                    while (it.hasNext()) {
                        TextStickerData data = it.next().getData();
                        if (data != null) {
                            h.p<Integer, Integer> a2 = com.ss.android.ugc.aweme.shortvideo.util.aj.a(data.getUiStartTime(), data.getUiEndTime(), intValue);
                            data.setUiStartTime(a2.getFirst().intValue());
                            data.setUiEndTime(a2.getSecond().intValue());
                            LiveData<com.ss.android.ugc.asve.editor.g> liveData = this.this$0.B;
                            if (liveData != null) {
                                gVar = liveData.getValue();
                            } else {
                                gVar = null;
                            }
                            int intValue2 = a2.getFirst().intValue();
                            if (gVar != null) {
                                intValue2 = gVar.s(intValue2);
                            }
                            data.setStartTime(intValue2);
                            int intValue3 = a2.getSecond().intValue();
                            if (gVar != null) {
                                intValue3 = gVar.s(intValue3);
                            }
                            data.setEndTime(intValue3);
                        }
                    }
                    return h.z.f158842a;
                }
            }

            public final void a(TextStickerData textStickerData, boolean z2) {
                h.f.b.l.d(textStickerData, "");
                this.z.setData(textStickerData);
                b(textStickerData, z2);
            }

            public final void b(TextStickerData textStickerData, boolean z2) {
                int i2;
                com.ss.android.ugc.aweme.editSticker.text.view.q qVar;
                TextStickerData data;
                MethodCollector.i(2902);
                com.ss.android.ugc.aweme.editSticker.text.view.q b2 = b(textStickerData);
                EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
                if (editTextStickerViewModel == null) {
                    h.f.b.l.a("textStickerViewModel");
                }
                editTextStickerViewModel.b(b2);
                b2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.y.addView(b2);
                com.ss.android.ugc.aweme.editSticker.text.c.e eVar = this.f88252e;
                if (eVar != null) {
                    eVar.b(b2);
                }
                this.f88251d = b2;
                d(b2);
                c(b2);
                n();
                b2.a(this.J, this.o);
                this.z.a();
                if (!z2 && this.s) {
                    int i3 = 1;
                    if (!com.ss.android.ugc.aweme.editSticker.g.a().f88138b.f88147b || (!this.r.f() && (!this.r.g() || (qVar = this.f88251d) == null || (data = qVar.getData()) == null || !data.getHasReadTextAudio()))) {
                        if (com.ss.android.ugc.aweme.editSticker.g.a().f88141e) {
                            String text = b2.getText();
                            h.f.b.l.b(text, "");
                            if (C2141a.a(text) && com.ss.android.ugc.aweme.editSticker.g.a().f88143g) {
                                i2 = R.string.f3d;
                                i3 = 7;
                                b2.postDelayed(new c(this, b2, i2, i3), 500);
                            }
                        }
                        i2 = R.string.ayb;
                        b2.postDelayed(new c(this, b2, i2, i3), 500);
                    }
                }
                if (textStickerData.isGuidanceSticker()) {
                    b2.post(new d(this, b2));
                }
                if (textStickerData.getAutoSelect()) {
                    b2.post(new e(b2));
                }
                MethodCollector.o(2902);
            }

            public final void a(com.ss.android.ugc.aweme.editSticker.text.view.q qVar, int i2) {
                if (i2 == 1) {
                    qVar.a(0.3137255f, false);
                } else if (i2 == 3) {
                    e(qVar);
                    com.ss.android.ugc.aweme.editSticker.d.e eVar = this.f88257j;
                    if (eVar != null) {
                        eVar.a(qVar.f88710m ? 1 : 0, "slide_up");
                    }
                    this.K = true;
                } else if (i2 == 4) {
                    qVar.a(0.3137255f, true);
                }
            }

            @Override // com.bytedance.jedi.arch.h
            public <S extends com.bytedance.jedi.arch.af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, com.bytedance.jedi.arch.ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(mVar, "");
                return b.a.a(this, jediViewModel, ahVar, mVar);
            }

            public final void a(com.ss.android.ugc.aweme.editSticker.text.view.i iVar, TextStickerData textStickerData, String str) {
                LiveData<com.ss.android.ugc.asve.editor.g> liveData;
                com.ss.android.ugc.asve.editor.g value;
                EditTextStickerViewModel editTextStickerViewModel = this.f88248a;
                if (editTextStickerViewModel == null) {
                    h.f.b.l.a("textStickerViewModel");
                }
                if (!editTextStickerViewModel.f88315a && (liveData = this.B) != null && (value = liveData.getValue()) != null) {
                    value.e(textStickerData.getAudioTrackIndex());
                    textStickerData.setHasReadTextAudio(false);
                    textStickerData.setAudioText(null);
                    textStickerData.setAudioTrackIndex(-1);
                    textStickerData.setAudioTrackFilePath(null);
                    if (com.ss.android.ugc.aweme.editSticker.g.a().f88138b.f88148c) {
                        if (str.length() > 0) {
                            EditTextStickerViewModel editTextStickerViewModel2 = this.f88248a;
                            if (editTextStickerViewModel2 == null) {
                                h.f.b.l.a("textStickerViewModel");
                            }
                            editTextStickerViewModel2.a(textStickerData, (String) null);
                            com.ss.android.ugc.aweme.editSticker.text.bean.t.i(textStickerData.getTextWrapList());
                        }
                    } else if (com.ss.android.ugc.aweme.editSticker.text.bean.t.i(iVar.getTextWrapList()).length() > 0 && this.r.f88167a.getInt("read_text_change_toast", 0) < 3) {
                        j.a.b(iVar.getContext(), (int) R.string.ayj, 0).a();
                        com.ss.android.ugc.aweme.editSticker.interact.g gVar = this.r;
                        gVar.f88167a.storeInt("read_text_change_toast", gVar.f88167a.getInt("read_text_change_toast", 0) + 1);
                    }
                    value.a(textStickerData.getStartTime(), x.f.EDITOR_SEEK_FLAG_LastSeek);
                    value.t();
                }
            }

            @Override // com.bytedance.jedi.arch.b
            public <S extends com.bytedance.jedi.arch.af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(mVar, "");
                b.a.a(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.h
            public <S extends com.bytedance.jedi.arch.af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(mVar, "");
                return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.b
            public <S extends com.bytedance.jedi.arch.af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(mVar, "");
                b.a.b(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.b
            public <S extends com.bytedance.jedi.arch.af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(mVar, "");
                b.a.c(this, jediViewModel, kVar, ahVar, mVar);
            }

            @Override // com.bytedance.jedi.arch.h
            public <S extends com.bytedance.jedi.arch.af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(kVar2, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(qVar, "");
                return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
            }

            @Override // com.bytedance.jedi.arch.h
            public <S extends com.bytedance.jedi.arch.af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(ahVar, "");
                return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
            }

            @Override // com.bytedance.jedi.arch.h
            public <S extends com.bytedance.jedi.arch.af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(kVar2, "");
                h.f.b.l.d(kVar3, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(rVar, "");
                return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
            }

            @Override // com.bytedance.jedi.arch.h
            public <S extends com.bytedance.jedi.arch.af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
                h.f.b.l.d(jediViewModel, "");
                h.f.b.l.d(kVar, "");
                h.f.b.l.d(kVar2, "");
                h.f.b.l.d(kVar3, "");
                h.f.b.l.d(kVar4, "");
                h.f.b.l.d(ahVar, "");
                h.f.b.l.d(sVar, "");
                return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
            }

            private a(androidx.fragment.app.e eVar, com.bytedance.f.a.a.j jVar, com.ss.android.ugc.aweme.shortvideo.preview.a aVar, boolean z2, FrameLayout frameLayout, com.ss.android.ugc.aweme.editSticker.text.view.i iVar, com.ss.android.ugc.aweme.editSticker.interact.e eVar2, LiveData<com.ss.android.ugc.asve.editor.g> liveData, com.ss.android.ugc.aweme.editSticker.text.als.d dVar, int i2, Rect rect, boolean z3, boolean z4) {
                h.f.b.l.d(eVar, "");
                h.f.b.l.d(jVar, "");
                h.f.b.l.d(frameLayout, "");
                h.f.b.l.d(iVar, "");
                this.v = eVar;
                this.M = jVar;
                this.w = aVar;
                this.x = z2;
                this.y = frameLayout;
                this.z = iVar;
                this.A = eVar2;
                this.B = liveData;
                this.C = dVar;
                this.N = i2;
                this.D = rect;
                this.E = null;
                this.O = z3;
                this.P = z4;
                this.r = new com.ss.android.ugc.aweme.editSticker.interact.g();
                this.s = true;
                this.u = 1000;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ a(androidx.fragment.app.e eVar, com.bytedance.f.a.a.j jVar, com.ss.android.ugc.aweme.shortvideo.preview.a aVar, boolean z2, FrameLayout frameLayout, com.ss.android.ugc.aweme.editSticker.text.view.i iVar, com.ss.android.ugc.aweme.editSticker.interact.e eVar2, LiveData liveData, com.ss.android.ugc.aweme.editSticker.text.als.d dVar, int i2, Rect rect, boolean z3, boolean z4, int i3) {
                this(eVar, jVar, (i3 & 4) != 0 ? null : aVar, (i3 & 8) != 0 ? false : z2, frameLayout, iVar, (i3 & 64) != 0 ? null : eVar2, (i3 & 128) != 0 ? null : liveData, (i3 & 256) == 0 ? dVar : null, (i3 & 512) != 0 ? 30 : i2, (i3 & 1024) != 0 ? new Rect() : rect, (i3 & 4096) != 0 ? false : z3, (i3 & 8192) != 0 ? false : z4);
            }
        }
