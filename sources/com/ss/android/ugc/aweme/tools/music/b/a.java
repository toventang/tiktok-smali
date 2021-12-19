package com.ss.android.ugc.aweme.tools.music.b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.internal.AVUIUXBugsExperimentServiceDiff;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.aweme.tools.music.e.a.a;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class a implements View.OnClickListener, com.ss.android.ugc.aweme.music.ui.m, aa.d {
    public static final C3706a B = new C3706a((byte) 0);
    public final int A;
    private List<? extends MusicModel> C;
    private FrameLayout D;
    private View E;
    private View F;
    private View G;
    private List<MusicModel> H = new ArrayList();
    private final HashMap<String, Boolean> I = new HashMap<>();
    private final h.h J = h.i.a((h.f.a.a) g.f140398a);
    private final com.ss.android.ugc.asve.editor.g K;
    private final h.f.a.a<String> L;

    /* renamed from: a  reason: collision with root package name */
    public String f140371a = "default_task_id";

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.cz.a.l f140372b;

    /* renamed from: c  reason: collision with root package name */
    public AVDmtTabLayout f140373c;

    /* renamed from: d  reason: collision with root package name */
    public int f140374d = 3;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.music.e.b f140375e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.music.a.d f140376f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.music.a f140377g;

    /* renamed from: h  reason: collision with root package name */
    public RecyclerView f140378h;

    /* renamed from: i  reason: collision with root package name */
    ViewGroup f140379i;

    /* renamed from: j  reason: collision with root package name */
    ViewGroup f140380j;

    /* renamed from: k  reason: collision with root package name */
    public RecyclerView f140381k;

    /* renamed from: l  reason: collision with root package name */
    public AVDmtTextView f140382l;

    /* renamed from: m  reason: collision with root package name */
    public View f140383m;
    public int n;
    public com.ss.android.ugc.aweme.port.in.a o;
    public MusicModel p;
    public TextView q;
    public com.ss.android.ugc.aweme.tools.music.e.a.a r;
    public com.ss.android.ugc.aweme.cz.a.j s;
    public com.ss.android.ugc.aweme.cz.a.k t;
    public com.ss.android.ugc.aweme.cz.a.g u;
    public List<String> v;
    public com.ss.android.ugc.aweme.cz.a.h w;
    public final androidx.appcompat.app.d x;
    public final com.ss.android.ugc.aweme.cz.a.a y;
    public final boolean z;

    static {
        Covode.recordClassIndex(91700);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(MusicModel musicModel, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void c(MusicModel musicModel) {
    }

    public final boolean l() {
        return ((Boolean) this.J.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void r() {
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.b.a$a  reason: collision with other inner class name */
    public static final class C3706a {
        static {
            Covode.recordClassIndex(91701);
        }

        private C3706a() {
        }

        public /* synthetic */ C3706a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final int e() {
        return this.n;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final Activity i() {
        return this.x;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void a(List<String> list) {
        this.v = list;
    }

    public final void a(String str, boolean z2) {
        com.ss.android.ugc.aweme.shortvideo.c cVar;
        List<? extends MusicModel> list;
        com.ss.android.ugc.aweme.tools.music.e.b bVar;
        List<? extends MusicModel> list2;
        MusicModel musicModel;
        com.ss.android.ugc.aweme.tools.music.e.b bVar2 = this.f140375e;
        if (bVar2 != null && (list = bVar2.f140488l) != null) {
            int i2 = 0;
            Iterator<? extends MusicModel> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!h.f.b.l.a((Object) ((MusicModel) it.next()).getMusicId(), (Object) str)) {
                    i2++;
                } else if (i2 >= 0 && (bVar = this.f140375e) != null && (list2 = bVar.f140488l) != null && (musicModel = (MusicModel) list2.get(i2)) != null) {
                    musicModel.setCollectionType(z2 ? MusicModel.CollectionType.COLLECTED : MusicModel.CollectionType.NOT_COLLECTED);
                }
            }
        }
        com.ss.android.ugc.aweme.shortvideo.c cVar2 = cr.a().f125295a;
        if (h.f.b.l.a((Object) (cVar2 != null ? cVar2.getMusicId() : null), (Object) str) && (cVar = cr.a().f125295a) != null) {
            cVar.setCollected(z2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 577
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.b.a.a(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0107, code lost:
        if (r11 == null) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0095  */
    @Override // com.ss.android.ugc.aweme.music.ui.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r10, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.b.a.a(java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(MusicModel musicModel, Exception exc) {
        MusicModel m2;
        MusicModel e2;
        h.f.b.l.d(exc, "");
        String str = null;
        if (this.n == 0) {
            h.f.b.l.d(exc, "");
            com.ss.android.ugc.aweme.tools.music.e.b bVar = this.f140375e;
            String musicId = (bVar == null || (e2 = bVar.e()) == null) ? null : e2.getMusicId();
            if (musicModel != null) {
                str = musicModel.getMusicId();
            }
            if (!(!h.f.b.l.a((Object) musicId, (Object) str))) {
                com.ss.android.ugc.aweme.tools.music.e.b bVar2 = this.f140375e;
                if (bVar2 != null) {
                    bVar2.c();
                }
                com.ss.android.ugc.aweme.tools.music.e.b bVar3 = this.f140375e;
                if (bVar3 != null) {
                    bVar3.f140478b = (bVar3.f140477a - 1) + 1;
                }
                a(false);
            }
        } else {
            h.f.b.l.d(exc, "");
            com.ss.android.ugc.aweme.tools.music.e.a.a aVar = this.r;
            String musicId2 = (aVar == null || (m2 = aVar.m()) == null) ? null : m2.getMusicId();
            if (musicModel != null) {
                str = musicModel.getMusicId();
            }
            if (!(!h.f.b.l.a((Object) musicId2, (Object) str))) {
                com.ss.android.ugc.aweme.tools.music.e.a.a aVar2 = this.r;
                if (aVar2 != null) {
                    aVar2.o();
                }
                com.ss.android.ugc.aweme.tools.music.e.a.a aVar3 = this.r;
                if (aVar3 != null) {
                    aVar3.f140444e = aVar3.f140443d;
                }
                a(false);
            }
        }
        com.ss.android.ugc.aweme.cz.a.h hVar = this.w;
        if (hVar != null) {
            hVar.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void a(boolean z2) {
        View view;
        if ((z2 || cr.a().f125295a != null) && (view = this.E) != null) {
            view.setVisibility(0);
        }
        View view2 = this.E;
        if (view2 != null) {
            view2.setAlpha(z2 ? 1.0f : 0.5f);
        }
        View view3 = this.E;
        if (view3 != null) {
            view3.setEnabled(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140404a;

        static {
            Covode.recordClassIndex(91720);
        }

        m(a aVar) {
            this.f140404a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f140404a.n();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void a() {
        com.ss.android.ugc.aweme.tools.music.a.d dVar = this.f140376f;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final boolean bN_() {
        if (this.f140383m != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void g() {
        com.ss.android.ugc.aweme.tools.music.e.b bVar = this.f140375e;
        if (bVar != null) {
            bVar.h();
        }
    }

    public static final class f implements aa.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140390a;

        static {
            Covode.recordClassIndex(91708);
        }

        @Override // com.ss.android.ugc.aweme.port.in.aa.k
        public final void a() {
            RecyclerView recyclerView = this.f140390a.f140378h;
            if (recyclerView != null) {
                recyclerView.post(new c(this));
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.aa.k
        public final void b() {
            RecyclerView recyclerView = this.f140390a.f140378h;
            if (recyclerView != null) {
                recyclerView.post(new b(this));
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.aa.k
        public final void c() {
            RecyclerView recyclerView = this.f140390a.f140378h;
            if (recyclerView != null) {
                recyclerView.post(new RunnableC3707a(this));
            }
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f140393a;

            static {
                Covode.recordClassIndex(91711);
            }

            b(f fVar) {
                this.f140393a = fVar;
            }

            public final void run() {
                RecyclerView recyclerView = this.f140393a.f140390a.f140378h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                com.ss.android.ugc.aweme.tools.music.e.a.a aVar = this.f140393a.f140390a.r;
                if (aVar != null) {
                    aVar.f140442c = true;
                    aVar.f140449j = 1;
                    aVar.f140448i.clear();
                    aVar.f140447h.cancel();
                    aVar.f140447h.removeAllListeners();
                    RecyclerView recyclerView2 = aVar.f140445f;
                    if (recyclerView2 != null) {
                        recyclerView2.post(new a.b(aVar));
                    }
                }
            }
        }

        static final class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f140394a;

            static {
                Covode.recordClassIndex(91712);
            }

            c(f fVar) {
                this.f140394a = fVar;
            }

            public final void run() {
                com.ss.android.ugc.aweme.tools.music.e.a.a aVar = this.f140394a.f140390a.r;
                if (aVar != null) {
                    aVar.n();
                }
                RecyclerView recyclerView = this.f140394a.f140390a.f140378h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                }
                TextView textView = this.f140394a.f140390a.q;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f140394a.f140390a.q;
                if (textView2 != null) {
                    textView2.setText(this.f140394a.f140390a.x.getResources().getString(R.string.ahm));
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.b.a$f$a  reason: collision with other inner class name */
        static final class RunnableC3707a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f140391a;

            static {
                Covode.recordClassIndex(91709);
            }

            RunnableC3707a(f fVar) {
                this.f140391a = fVar;
            }

            public final void run() {
                com.ss.android.ugc.aweme.tools.music.e.a.a aVar = this.f140391a.f140390a.r;
                if (aVar != null) {
                    aVar.n();
                }
                RecyclerView recyclerView = this.f140391a.f140390a.f140378h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                }
                TextView textView = this.f140391a.f140390a.q;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f140391a.f140390a.q;
                if (textView2 != null) {
                    textView2.setText(this.f140391a.f140390a.x.getResources().getString(R.string.bpc));
                }
                TextView textView3 = this.f140391a.f140390a.q;
                if (textView3 != null) {
                    textView3.setOnClickListener(new View.OnClickListener(this) {
                        /* class com.ss.android.ugc.aweme.tools.music.b.a.f.RunnableC3707a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ RunnableC3707a f140392a;

                        static {
                            Covode.recordClassIndex(91710);
                        }

                        {
                            this.f140392a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            com.ss.android.ugc.aweme.tools.music.e.a.b.f140453h.b(this.f140392a.f140391a.f140390a.A);
                        }
                    });
                }
            }
        }

        static final class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f140395a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f140396b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f140397c;

            static {
                Covode.recordClassIndex(91713);
            }

            d(f fVar, List list, boolean z) {
                this.f140395a = fVar;
                this.f140396b = list;
                this.f140397c = z;
            }

            public final void run() {
                String str;
                int i2;
                String str2;
                MusicModel l2;
                RecyclerView recyclerView = this.f140395a.f140390a.f140378h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                TextView textView = this.f140395a.f140390a.q;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                com.ss.android.ugc.aweme.tools.music.e.a.a aVar = this.f140395a.f140390a.r;
                if (aVar != null) {
                    aVar.n();
                }
                com.ss.android.ugc.aweme.tools.music.e.a.a aVar2 = this.f140395a.f140390a.r;
                if (aVar2 != null) {
                    aVar2.b_(this.f140396b);
                }
                com.ss.android.ugc.aweme.tools.music.e.a.a aVar3 = this.f140395a.f140390a.r;
                String str3 = null;
                if (aVar3 == null || (l2 = aVar3.l()) == null) {
                    str = null;
                } else {
                    str = l2.getMusicId();
                }
                com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                if (cVar != null) {
                    str3 = cVar.getMusicId();
                }
                if (!h.f.b.l.a((Object) str, (Object) str3)) {
                    com.ss.android.ugc.aweme.tools.music.e.a.a aVar4 = this.f140395a.f140390a.r;
                    int i3 = -1;
                    if (aVar4 != null) {
                        com.ss.android.ugc.aweme.tools.music.e.a.a aVar5 = this.f140395a.f140390a.r;
                        if (aVar5 != null) {
                            com.ss.android.ugc.aweme.shortvideo.c cVar2 = cr.a().f125295a;
                            if (cVar2 == null || (str2 = cVar2.getMusicId()) == null) {
                                str2 = "";
                            }
                            h.f.b.l.b(str2, "");
                            h.f.b.l.d(str2, "");
                            List list = aVar5.f76354l;
                            if (list != null) {
                                Iterator it = list.iterator();
                                i2 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    MusicModel musicModel = (MusicModel) it.next();
                                    h.f.b.l.b(musicModel, "");
                                    if (h.f.b.l.a((Object) musicModel.getMusicId(), (Object) str2)) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                        i2 = -1;
                        aVar4.f140444e = i2;
                    }
                    com.ss.android.ugc.aweme.tools.music.e.a.a aVar6 = this.f140395a.f140390a.r;
                    if (aVar6 != null) {
                        com.ss.android.ugc.aweme.tools.music.e.a.a aVar7 = this.f140395a.f140390a.r;
                        if (aVar7 != null) {
                            i3 = aVar7.f140444e;
                        }
                        aVar6.a(i3);
                    }
                }
                com.ss.android.ugc.aweme.tools.music.e.a.a aVar8 = this.f140395a.f140390a.r;
                if (aVar8 != null) {
                    aVar8.d(true);
                }
                if (!this.f140397c) {
                    com.ss.android.ugc.aweme.tools.music.e.a.a aVar9 = this.f140395a.f140390a.r;
                    if (aVar9 != null) {
                        aVar9.ah_();
                    }
                    com.ss.android.ugc.aweme.tools.music.e.a.a aVar10 = this.f140395a.f140390a.r;
                    if (aVar10 != null) {
                        aVar10.d(false);
                        return;
                    }
                    return;
                }
                com.ss.android.ugc.aweme.tools.music.e.a.a aVar11 = this.f140395a.f140390a.r;
                if (aVar11 != null) {
                    aVar11.ai_();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(a aVar) {
            this.f140390a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.port.in.aa.k
        public final void a(List<? extends MusicModel> list, boolean z) {
            h.f.b.l.d(list, "");
            RecyclerView recyclerView = this.f140390a.f140378h;
            if (recyclerView != null) {
                recyclerView.post(new d(this, list, z));
            }
        }
    }

    static final class o implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140407a;

        static {
            Covode.recordClassIndex(91722);
        }

        o(a aVar) {
            this.f140407a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            com.ss.android.ugc.aweme.tools.music.e.a.b.f140453h.b(this.f140407a.A);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void d() {
        RecyclerView recyclerView = this.f140381k;
        if (recyclerView != null) {
            recyclerView.setEnabled(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void f() {
        RecyclerView recyclerView;
        com.ss.android.ugc.aweme.tools.music.e.b bVar = this.f140375e;
        if (bVar != null && (recyclerView = bVar.f140479c) != null) {
            recyclerView.f(bVar.f140477a);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final MusicModel h() {
        com.ss.android.ugc.aweme.tools.music.e.b bVar = this.f140375e;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void k() {
        AVDmtTabLayout aVDmtTabLayout = this.f140373c;
        if (aVDmtTabLayout != null) {
            aVDmtTabLayout.b(aVDmtTabLayout.a(0), true);
        }
    }

    static final class e implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140389a;

        static {
            Covode.recordClassIndex(91707);
        }

        e(a aVar) {
            this.f140389a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            com.ss.android.ugc.aweme.tools.music.e.a.a aVar = this.f140389a.r;
            if (aVar != null) {
                aVar.ag_();
            }
            com.ss.android.ugc.aweme.tools.music.e.a.b.f140453h.c(this.f140389a.A);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f140398a = new g();

        static {
            Covode.recordClassIndex(91714);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AVExternalServiceImpl.a().configService().avsettingsConfig().enableNewMusicMarquee());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f140409b;

        static {
            Covode.recordClassIndex(91723);
        }

        p(a aVar, String str) {
            this.f140408a = aVar;
            this.f140409b = str;
        }

        public final void run() {
            com.ss.android.ugc.aweme.tools.music.e.b bVar = this.f140408a.f140375e;
            if (bVar != null) {
                bVar.d();
            }
            this.f140408a.a(this.f140409b);
        }
    }

    private final void p() {
        this.o = null;
        this.H.clear();
        com.ss.android.ugc.aweme.tools.music.e.b bVar = this.f140375e;
        if (bVar != null) {
            bVar.g();
            bVar.notifyDataSetChanged();
        }
    }

    public final void m() {
        View view = this.E;
        if (view != null) {
            view.setVisibility(4);
        }
        View view2 = this.F;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void b() {
        com.ss.android.ugc.aweme.tools.music.a.d dVar = this.f140376f;
        if (dVar != null) {
            dVar.f140364c.removeCallbacksAndMessages(null);
            dVar.f140364c.postDelayed(dVar.f140366e, dVar.f140365d);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void c() {
        com.ss.android.ugc.aweme.tools.music.e.a.b.f140453h.f140455a = null;
        com.ss.android.ugc.aweme.tools.music.e.a.b.f140453h.f140456b = null;
        b.f140410c.f140412a = null;
        IMusicService m2 = MusicService.m();
        h.f.b.l.b(m2, "");
        m2.a((com.ss.android.ugc.aweme.music.c.a) null);
        com.ss.android.ugc.aweme.tools.music.a.d dVar = this.f140376f;
        if (dVar != null) {
            dVar.f140364c.removeCallbacksAndMessages(null);
        }
        com.ss.android.ugc.aweme.music.a aVar = this.f140377g;
        if (aVar != null) {
            aVar.d();
        }
    }

    private final void o() {
        String str;
        long j2;
        String invoke = this.L.invoke();
        if (invoke == null) {
            invoke = "default_task_id";
        }
        this.f140371a = invoke;
        if (!h.f.b.l.a((Object) this.I.get(invoke), (Object) true)) {
            p();
            com.ss.android.ugc.aweme.tools.music.e.b bVar = this.f140375e;
            if (bVar != null) {
                bVar.f();
            }
            com.ss.android.ugc.aweme.cz.a.g gVar = this.u;
            if (gVar != null) {
                gVar.a();
            }
        }
        com.ss.android.ugc.aweme.tools.music.a.a aVar = com.ss.android.ugc.aweme.tools.music.a.a.f140275c;
        if (h.f.b.l.a((Object) this.f140371a, (Object) "default_task_id")) {
            str = null;
        } else {
            str = this.f140371a;
        }
        com.ss.android.ugc.asve.editor.g gVar2 = this.K;
        if (gVar2 != null) {
            j2 = (long) gVar2.j();
        } else {
            j2 = 0;
        }
        aVar.a(str, j2, this.A, 10, 20, false).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), c.f140387a);
    }

    public final void n() {
        MusicModel l2;
        boolean z2;
        boolean z3;
        MusicModel i2;
        String str;
        Activity c2 = com.ss.android.ugc.aweme.df.c.c();
        if (!com.ss.android.ugc.aweme.port.in.g.a().A().b()) {
            if (this.n == 0) {
                str = "edit_page_recommend";
            } else {
                str = "edit_page_recommend_favourite";
            }
            com.ss.android.ugc.aweme.login.c.a(c2, "video_edit_page", str, new m(this));
            return;
        }
        z.e eVar = new z.e();
        T t2 = null;
        if (this.n == 0) {
            com.ss.android.ugc.aweme.tools.music.e.b bVar = this.f140375e;
            if (bVar == null || (i2 = bVar.i()) == null) {
                com.ss.android.ugc.aweme.tools.music.e.a.a aVar = this.r;
                if (aVar != null) {
                    t2 = (T) aVar.l();
                }
            } else {
                t2 = i2;
            }
            eVar.element = t2;
        } else {
            com.ss.android.ugc.aweme.tools.music.e.a.a aVar2 = this.r;
            if (aVar2 == null || (l2 = aVar2.l()) == null) {
                com.ss.android.ugc.aweme.tools.music.e.b bVar2 = this.f140375e;
                if (bVar2 != null) {
                    t2 = (T) bVar2.i();
                }
            } else {
                t2 = l2;
            }
            eVar.element = t2;
        }
        if (eVar.element != null) {
            View view = this.F;
            boolean z4 = false;
            if (view != null) {
                z2 = view.isSelected();
            } else {
                z2 = false;
            }
            if (z2 || MusicService.m().a(eVar.element, c2, true)) {
                View view2 = this.F;
                if (view2 != null) {
                    view2.setSelected(!view2.isSelected());
                }
                com.ss.android.ugc.aweme.cz.a.h hVar = this.w;
                if (hVar != null) {
                    View view3 = this.F;
                    if (view3 != null) {
                        z3 = view3.isSelected();
                    } else {
                        z3 = false;
                    }
                    hVar.a(z3, com.ss.android.ugc.aweme.tools.music.f.b.a((MusicModel) eVar.element));
                }
                String musicId = eVar.element.getMusicId();
                h.f.b.l.b(musicId, "");
                View view4 = this.F;
                if (view4 != null) {
                    z4 = view4.isSelected();
                }
                com.ss.android.ugc.aweme.tools.music.e.a.b.a(musicId, z4, new n(this, eVar));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void a(com.ss.android.ugc.aweme.cz.a.g gVar) {
        this.u = gVar;
    }

    public static final class d implements com.ss.android.ugc.aweme.cz.a.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140388a;

        static {
            Covode.recordClassIndex(91706);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f140388a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.cz.a.j
        public final void a(View view, int i2) {
            Integer num;
            Integer num2;
            com.ss.android.ugc.aweme.tools.music.e.a.a aVar;
            h.f.b.l.d(view, "");
            com.ss.android.ugc.aweme.tools.music.e.a.a aVar2 = this.f140388a.r;
            MusicModel musicModel = null;
            if (aVar2 != null && aVar2.b(i2) != null) {
                com.ss.android.ugc.aweme.tools.music.e.a.a aVar3 = this.f140388a.r;
                if (aVar3 != null) {
                    num = Integer.valueOf(aVar3.f140443d);
                } else {
                    num = null;
                }
                com.ss.android.ugc.aweme.tools.music.e.a.a aVar4 = this.f140388a.r;
                if (aVar4 != null) {
                    num2 = Integer.valueOf(aVar4.f140444e);
                } else {
                    num2 = null;
                }
                if (!h.f.b.l.a(num, num2) || (aVar = this.f140388a.r) == null || aVar.f140443d != i2) {
                    com.ss.android.ugc.aweme.cz.a.j jVar = this.f140388a.s;
                    if (jVar != null) {
                        jVar.a(view, i2);
                    }
                    com.ss.android.ugc.aweme.tools.music.e.a.a aVar5 = this.f140388a.r;
                    if (aVar5 != null) {
                        musicModel = aVar5.b(i2);
                    }
                    String a2 = a.a(musicModel);
                    if (a2 == null || a2.length() == 0) {
                        com.ss.android.ugc.aweme.tools.music.e.a.a aVar6 = this.f140388a.r;
                        if (aVar6 != null) {
                            aVar6.a(i2, true);
                        }
                        com.ss.android.ugc.aweme.music.a aVar7 = this.f140388a.f140377g;
                        if (aVar7 != null) {
                            aVar7.b(musicModel, this.f140388a.f140374d, false);
                            return;
                        }
                        return;
                    }
                    com.ss.android.ugc.aweme.tools.music.e.a.a aVar8 = this.f140388a.r;
                    if (aVar8 != null) {
                        aVar8.a(i2, false);
                    }
                    this.f140388a.a(a2, musicModel, "");
                } else if (com.ss.android.ugc.tools.utils.k.a(this.f140388a.v)) {
                    if (this.f140388a.l() || !this.f140388a.z) {
                        this.f140388a.a(false);
                        this.f140388a.m();
                        com.ss.android.ugc.aweme.tools.music.e.a.a aVar9 = this.f140388a.r;
                        if (aVar9 != null) {
                            aVar9.p();
                        }
                        com.ss.android.ugc.aweme.tools.music.a.d dVar = this.f140388a.f140376f;
                        if (dVar != null) {
                            dVar.b();
                        }
                        com.ss.android.ugc.aweme.cz.a.h hVar = this.f140388a.w;
                        if (hVar != null) {
                            hVar.a(null, null, false);
                            return;
                        }
                        return;
                    }
                    String string = this.f140388a.x.getResources().getString(R.string.b0n);
                    h.f.b.l.b(string, "");
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f140388a.x).a(string).a();
                }
            }
        }
    }

    public static final class h implements com.ss.android.ugc.aweme.music.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140399a;

        static {
            Covode.recordClassIndex(91715);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(a aVar) {
            this.f140399a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.music.c.a
        public final void a(String str, boolean z) {
            this.f140399a.a(str, z);
        }
    }

    public static final class i implements com.ss.android.ugc.aweme.cz.a.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140400a;

        static {
            Covode.recordClassIndex(91716);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(a aVar) {
            this.f140400a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.cz.a.j
        public final void a(View view, int i2) {
            Integer num;
            Integer num2;
            com.ss.android.ugc.aweme.tools.music.e.b bVar;
            h.f.b.l.d(view, "");
            if (i2 == -1) {
                this.f140400a.y.a();
                com.ss.android.ugc.aweme.cz.a.h hVar = this.f140400a.w;
                if (hVar != null) {
                    hVar.a();
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.tools.music.e.b bVar2 = this.f140400a.f140375e;
            MusicModel musicModel = null;
            if (bVar2 != null && bVar2.c(i2) != null) {
                com.ss.android.ugc.aweme.tools.music.e.b bVar3 = this.f140400a.f140375e;
                if (bVar3 != null) {
                    num = Integer.valueOf(bVar3.f140477a - 1);
                } else {
                    num = null;
                }
                com.ss.android.ugc.aweme.tools.music.e.b bVar4 = this.f140400a.f140375e;
                if (bVar4 != null) {
                    num2 = Integer.valueOf(bVar4.f140478b - 1);
                } else {
                    num2 = null;
                }
                if (!h.f.b.l.a(num, num2) || (bVar = this.f140400a.f140375e) == null || bVar.f140477a - 1 != i2) {
                    com.ss.android.ugc.aweme.cz.a.j jVar = this.f140400a.s;
                    if (jVar != null) {
                        jVar.a(view, i2);
                    }
                    com.ss.android.ugc.aweme.tools.music.e.b bVar5 = this.f140400a.f140375e;
                    if (bVar5 != null) {
                        musicModel = bVar5.c(i2);
                    }
                    String a2 = a.a(musicModel);
                    if ((a2 == null || a2.length() == 0) && (musicModel == null || !musicModel.isMvThemeMusic())) {
                        this.f140400a.a(false);
                        com.ss.android.ugc.aweme.tools.music.e.b bVar6 = this.f140400a.f140375e;
                        if (bVar6 != null) {
                            bVar6.a(i2, true);
                        }
                        com.ss.android.ugc.aweme.music.a aVar = this.f140400a.f140377g;
                        if (aVar != null) {
                            aVar.b(musicModel, this.f140400a.f140374d, false);
                        }
                    } else {
                        com.ss.android.ugc.aweme.tools.music.e.b bVar7 = this.f140400a.f140375e;
                        if (bVar7 != null) {
                            bVar7.a(i2, false);
                        }
                        this.f140400a.a(a2, musicModel, "");
                    }
                    if (musicModel != null && musicModel.isMvThemeMusic()) {
                        this.f140400a.a(false);
                    }
                } else if (com.ss.android.ugc.tools.utils.k.a(this.f140400a.v)) {
                    if (this.f140400a.l() || !this.f140400a.z) {
                        this.f140400a.a(false);
                        this.f140400a.m();
                        com.ss.android.ugc.aweme.tools.music.e.b bVar8 = this.f140400a.f140375e;
                        if (bVar8 != null) {
                            bVar8.b(-1);
                        }
                        com.ss.android.ugc.aweme.tools.music.e.b bVar9 = this.f140400a.f140375e;
                        if (bVar9 != null) {
                            bVar9.f140477a = 0;
                        }
                        AVDmtTextView aVDmtTextView = this.f140400a.f140382l;
                        if (aVDmtTextView != null) {
                            aVDmtTextView.setSelected(false);
                        }
                        AVDmtTextView aVDmtTextView2 = this.f140400a.f140382l;
                        if (aVDmtTextView2 != null) {
                            aVDmtTextView2.setText("");
                        }
                        com.ss.android.ugc.aweme.tools.music.a.d dVar = this.f140400a.f140376f;
                        if (dVar != null) {
                            dVar.b();
                        }
                        com.ss.android.ugc.aweme.cz.a.h hVar2 = this.f140400a.w;
                        if (hVar2 != null) {
                            hVar2.a(null, null, true);
                            return;
                        }
                        return;
                    }
                    String string = this.f140400a.x.getResources().getString(R.string.b0n);
                    h.f.b.l.b(string, "");
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f140400a.x).a(string).a();
                }
            }
        }
    }

    public static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140401a;

        static {
            Covode.recordClassIndex(91717);
        }

        j(a aVar) {
            this.f140401a = aVar;
        }

        public final void onClick(View view) {
            TabLayout.f fVar;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.cz.a.l lVar = this.f140401a.f140372b;
            if (lVar != null) {
                lVar.a(true);
            }
            AVDmtTabLayout aVDmtTabLayout = this.f140401a.f140373c;
            if (aVDmtTabLayout != null) {
                AVDmtTabLayout aVDmtTabLayout2 = this.f140401a.f140373c;
                if (aVDmtTabLayout2 != null) {
                    fVar = aVDmtTabLayout2.a(0);
                } else {
                    fVar = null;
                }
                aVDmtTabLayout.b(fVar, true);
            }
        }
    }

    public static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140402a;

        static {
            Covode.recordClassIndex(91718);
        }

        k(a aVar) {
            this.f140402a = aVar;
        }

        public final void onClick(View view) {
            TabLayout.f fVar;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.cz.a.l lVar = this.f140402a.f140372b;
            if (lVar != null) {
                lVar.a(false);
            }
            AVDmtTabLayout aVDmtTabLayout = this.f140402a.f140373c;
            if (aVDmtTabLayout != null) {
                AVDmtTabLayout aVDmtTabLayout2 = this.f140402a.f140373c;
                if (aVDmtTabLayout2 != null) {
                    fVar = aVDmtTabLayout2.a(1);
                } else {
                    fVar = null;
                }
                aVDmtTabLayout.b(fVar, true);
            }
        }
    }

    public static final class l implements TabLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140403a;

        static {
            Covode.recordClassIndex(91719);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void b(TabLayout.f fVar) {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void c(TabLayout.f fVar) {
        }

        l(a aVar) {
            this.f140403a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void a(TabLayout.f fVar) {
            boolean z;
            MusicModel.CollectionType collectionType;
            com.ss.android.ugc.aweme.tools.music.e.a.a aVar;
            MusicModel l2;
            int i2;
            a aVar2 = this.f140403a;
            if (fVar == null || fVar.f130750e != 0) {
                z = false;
            } else {
                z = true;
            }
            ViewGroup viewGroup = aVar2.f140380j;
            int i3 = 4;
            if (viewGroup != null) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                viewGroup.setVisibility(i2);
            }
            ViewGroup viewGroup2 = aVar2.f140379i;
            if (viewGroup2 != null) {
                if (!z) {
                    i3 = 0;
                }
                viewGroup2.setVisibility(i3);
            }
            if (!z) {
                aVar2.n = 1;
                if (!com.ss.android.ugc.aweme.port.in.g.a().A().b()) {
                    com.ss.android.ugc.aweme.login.c.a(com.ss.android.ugc.aweme.df.c.c(), "video_edit_page", "edit_page_recommend_favourite", new o(aVar2));
                } else {
                    com.ss.android.ugc.aweme.tools.music.e.a.b.f140453h.b(aVar2.A);
                }
            } else {
                if (aVar2.n == 1) {
                    com.ss.android.ugc.aweme.tools.music.e.a.a aVar3 = aVar2.r;
                    if (aVar3 == null || (l2 = aVar3.l()) == null) {
                        collectionType = null;
                    } else {
                        collectionType = l2.getCollectionType();
                    }
                    if (collectionType == MusicModel.CollectionType.NOT_COLLECTED && (aVar = aVar2.r) != null) {
                        aVar.p();
                    }
                    aVar2.a(aVar2.f140371a);
                }
                aVar2.n = 0;
            }
        }
    }

    private void b(boolean z2) {
        View view = this.F;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.F;
        if (view2 != null) {
            view2.setSelected(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final com.ss.android.ugc.aweme.shortvideo.c a(int i2) {
        MusicModel musicModel;
        com.ss.android.ugc.aweme.tools.music.e.a.a aVar = this.r;
        if (aVar != null) {
            musicModel = aVar.b(i2);
        } else {
            musicModel = null;
        }
        return com.ss.android.ugc.aweme.tools.music.f.b.a(musicModel);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f140387a = new c();

        static {
            Covode.recordClassIndex(91705);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.framework.a.a.a("Get AI Recommend Music Failed. Reason:" + ((Throwable) obj).getMessage());
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void a(com.ss.android.ugc.aweme.cz.a.h hVar) {
        h.f.b.l.d(hVar, "");
        this.w = hVar;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final com.ss.android.ugc.aweme.shortvideo.c b(int i2) {
        MusicModel musicModel;
        List<? extends MusicModel> list;
        com.ss.android.ugc.aweme.port.in.a aVar = this.o;
        if (aVar == null || (list = aVar.f115560a) == null) {
            musicModel = null;
        } else {
            musicModel = (MusicModel) h.a.n.b((List) list, i2);
        }
        return com.ss.android.ugc.aweme.tools.music.f.b.a(musicModel);
    }

    public static String a(MusicModel musicModel) {
        String localPath;
        if (musicModel == null || (localPath = musicModel.getLocalPath()) == null || localPath.length() == 0) {
            return null;
        }
        aa b2 = com.ss.android.ugc.aweme.port.in.l.f115658a.b();
        if (musicModel == null) {
            h.f.b.l.b();
        }
        String a2 = b2.a(musicModel);
        if (TextUtils.isEmpty(a2) || !com.ss.android.ugc.aweme.video.e.b(a2) || new File(a2).length() <= 0) {
            return null;
        }
        return a2;
    }

    public final void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.c35) {
                RecyclerView recyclerView = this.f140381k;
                if (recyclerView != null) {
                    recyclerView.setEnabled(false);
                }
                com.ss.android.ugc.aweme.cz.a.h hVar = this.w;
                if (hVar != null) {
                    hVar.b();
                }
            } else if (valueOf.intValue() == R.id.c33) {
                n();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140384a;

        static {
            Covode.recordClassIndex(91702);
        }

        b(a aVar) {
            this.f140384a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f140384a.o = (com.ss.android.ugc.aweme.port.in.a) obj;
            if (com.ss.android.ugc.tools.utils.k.a(this.f140384a.v)) {
                RecyclerView recyclerView = this.f140384a.f140381k;
                if (recyclerView != null) {
                    recyclerView.post(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.tools.music.b.a.b.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f140386a;

                        static {
                            Covode.recordClassIndex(91704);
                        }

                        {
                            this.f140386a = r1;
                        }

                        public final void run() {
                            com.ss.android.ugc.aweme.tools.music.e.b bVar = this.f140386a.f140384a.f140375e;
                            if (bVar != null) {
                                bVar.d();
                            }
                            this.f140386a.f140384a.a(this.f140386a.f140384a.f140371a);
                        }
                    });
                }
            } else if (this.f140384a.p != null) {
                a aVar = this.f140384a;
                com.ss.android.ugc.aweme.port.in.a aVar2 = aVar.o;
                MusicModel musicModel = this.f140384a.p;
                if (musicModel == null) {
                    h.f.b.l.b();
                }
                aVar.a(aVar2, musicModel, this.f140384a.f140371a);
            } else {
                b bVar = b.f140410c;
                bVar.f140412a = new com.ss.android.ugc.aweme.tools.music.d.a(this) {
                    /* class com.ss.android.ugc.aweme.tools.music.b.a.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f140385a;

                    static {
                        Covode.recordClassIndex(91703);
                    }

                    {
                        this.f140385a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.tools.music.d.a
                    public final void a(MusicModel musicModel, boolean z) {
                        h.f.b.l.d(musicModel, "");
                        this.f140385a.f140384a.a(this.f140385a.f140384a.o, musicModel, this.f140385a.f140384a.f140371a);
                    }
                };
                bVar.a(this.f140384a.v);
            }
        }
    }

    public static final class n implements aa.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140405a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f140406b;

        static {
            Covode.recordClassIndex(91721);
        }

        @Override // com.ss.android.ugc.aweme.port.in.aa.j
        public final void a(boolean z) {
            Context context = null;
            if (z) {
                this.f140406b.element.setCollectionType(MusicModel.CollectionType.COLLECTED);
                this.f140405a.a(this.f140406b.element.getMusicId(), true);
                View view = this.f140405a.f140383m;
                if (view != null) {
                    context = view.getContext();
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.aho).a();
                return;
            }
            View view2 = this.f140405a.f140383m;
            if (view2 != null) {
                context = view2.getContext();
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.ahj).a();
        }

        @Override // com.ss.android.ugc.aweme.port.in.aa.j
        public final void b(boolean z) {
            Context context = null;
            if (z) {
                this.f140406b.element.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                this.f140405a.a(this.f140406b.element.getMusicId(), false);
                View view = this.f140405a.f140383m;
                if (view != null) {
                    context = view.getContext();
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.a9j).a();
                return;
            }
            View view2 = this.f140405a.f140383m;
            if (view2 != null) {
                context = view2.getContext();
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.a9i).a();
        }

        n(a aVar, z.e eVar) {
            this.f140405a = aVar;
            this.f140406b = eVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void a(com.ss.android.ugc.aweme.cz.a.j jVar) {
        this.s = jVar;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void a(com.ss.android.ugc.aweme.cz.a.k kVar) {
        this.t = kVar;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void a(com.ss.android.ugc.aweme.cz.a.l lVar) {
        this.f140372b = lVar;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.d
    public final void a(androidx.appcompat.app.d dVar, FrameLayout frameLayout) {
        View view;
        h.f.b.l.d(dVar, "");
        if (this.f140383m == null) {
            View a2 = com.a.a(LayoutInflater.from(dVar), R.layout.ds, frameLayout, true);
            this.f140383m = a2;
            if (a2 == null) {
                h.f.b.l.b();
            }
            this.f140373c = (AVDmtTabLayout) a2.findViewById(R.id.ehm);
            View view2 = this.f140383m;
            if (view2 == null) {
                h.f.b.l.b();
            }
            this.E = view2.findViewById(R.id.c35);
            View view3 = this.f140383m;
            if (view3 == null) {
                h.f.b.l.b();
            }
            this.F = view3.findViewById(R.id.c33);
            View view4 = this.f140383m;
            if (view4 == null) {
                h.f.b.l.b();
            }
            this.f140381k = (RecyclerView) view4.findViewById(R.id.drw);
            View view5 = this.f140383m;
            if (view5 == null) {
                h.f.b.l.b();
            }
            this.D = (FrameLayout) view5.findViewById(R.id.emk);
            View view6 = this.f140383m;
            if (view6 == null) {
                h.f.b.l.b();
            }
            this.f140380j = (ViewGroup) view6.findViewById(R.id.did);
            View view7 = this.f140383m;
            if (view7 == null) {
                h.f.b.l.b();
            }
            this.f140379i = (ViewGroup) view7.findViewById(R.id.a8e);
            View view8 = this.f140383m;
            if (view8 == null) {
                h.f.b.l.b();
            }
            this.f140378h = (RecyclerView) view8.findViewById(R.id.dru);
            View view9 = this.E;
            if (view9 == null) {
                h.f.b.l.b();
            }
            view9.setOnClickListener(this);
            View view10 = this.F;
            if (view10 == null) {
                h.f.b.l.b();
            }
            view10.setOnClickListener(this);
            AVDmtTabLayout aVDmtTabLayout = this.f140373c;
            if (aVDmtTabLayout != null) {
                aVDmtTabLayout.setVisibility(8);
            }
            View view11 = this.G;
            if (view11 != null) {
                view11.setVisibility(8);
            }
            FrameLayout frameLayout2 = this.D;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
            AVDmtTabLayout aVDmtTabLayout2 = this.f140373c;
            if (aVDmtTabLayout2 != null) {
                aVDmtTabLayout2.setVisibility(0);
            }
            FrameLayout frameLayout3 = this.D;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(8);
            }
            AVDmtTabLayout aVDmtTabLayout3 = this.f140373c;
            if (aVDmtTabLayout3 != null) {
                if (AVUIUXBugsExperimentServiceDiff.b().a()) {
                    AVDmtTabLayout aVDmtTabLayout4 = this.f140373c;
                    if (aVDmtTabLayout4 != null) {
                        aVDmtTabLayout4.setTabMode(0);
                    }
                } else {
                    AVDmtTabLayout aVDmtTabLayout5 = this.f140373c;
                    if (aVDmtTabLayout5 != null) {
                        aVDmtTabLayout5.setMaxTabModeForCount(2);
                    }
                }
                com.ss.android.ugc.aweme.themechange.base.a b2 = AVDmtTabLayout.a.b(aVDmtTabLayout3.getContext());
                aVDmtTabLayout3.a(aVDmtTabLayout3.a().a(b2));
                b2.setOnClickListener(new j(this));
                TabLayout.f a3 = aVDmtTabLayout3.a(0);
                View view12 = null;
                if (a3 != null) {
                    view = a3.f130751f;
                } else {
                    view = null;
                }
                com.ss.android.ugc.aweme.themechange.base.a aVar = (com.ss.android.ugc.aweme.themechange.base.a) view;
                if (aVar != null) {
                    Context context = aVDmtTabLayout3.getContext();
                    h.f.b.l.b(context, "");
                    aVar.setText(context.getResources().getString(R.string.b_j));
                }
                com.ss.android.ugc.aweme.themechange.base.a b3 = AVDmtTabLayout.a.b(aVDmtTabLayout3.getContext());
                aVDmtTabLayout3.a(aVDmtTabLayout3.a().a(b3));
                b3.setOnClickListener(new k(this));
                TabLayout.f a4 = aVDmtTabLayout3.a(1);
                if (a4 != null) {
                    view12 = a4.f130751f;
                }
                com.ss.android.ugc.aweme.themechange.base.a aVar2 = (com.ss.android.ugc.aweme.themechange.base.a) view12;
                if (aVar2 != null) {
                    Context context2 = aVDmtTabLayout3.getContext();
                    h.f.b.l.b(context2, "");
                    aVar2.setText(context2.getResources().getString(R.string.ex7));
                }
                aVDmtTabLayout3.a(new l(this));
                AVDmtTabLayout aVDmtTabLayout6 = this.f140373c;
                if (aVDmtTabLayout6 != null) {
                    aVDmtTabLayout6.b(aVDmtTabLayout6.a(0), true);
                }
            }
            RecyclerView recyclerView = this.f140381k;
            if (recyclerView != null) {
                RecyclerView recyclerView2 = this.f140381k;
                if (recyclerView2 != null) {
                    recyclerView2.getContext();
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            }
            View view13 = this.f140383m;
            if (view13 == null) {
                h.f.b.l.b();
            }
            this.q = (TextView) view13.findViewById(R.id.apx);
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(0);
            RecyclerView recyclerView3 = this.f140378h;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(wrapLinearLayoutManager);
            }
            com.ss.android.ugc.aweme.tools.music.e.a.a aVar3 = new com.ss.android.ugc.aweme.tools.music.e.a.a(new d(this));
            this.r = aVar3;
            aVar3.w = this.t;
            com.ss.android.ugc.aweme.tools.music.e.a.a aVar4 = this.r;
            if (aVar4 != null) {
                aVar4.a((h.a) new e(this));
            }
            RecyclerView recyclerView4 = this.f140378h;
            if (recyclerView4 != null) {
                recyclerView4.setAdapter(this.r);
            }
            com.ss.android.ugc.aweme.tools.music.e.a.b.f140453h.f140455a = new f(this);
            this.f140377g = MusicService.m().a(this);
            IMusicService m2 = MusicService.m();
            h.f.b.l.b(m2, "");
            m2.a(new h(this));
            com.ss.android.ugc.aweme.tools.music.a.d dVar2 = new com.ss.android.ugc.aweme.tools.music.a.d();
            this.f140376f = dVar2;
            dVar2.f140362a = this.K;
            com.ss.android.ugc.aweme.tools.music.a.d dVar3 = this.f140376f;
            if (dVar3 != null) {
                dVar3.f140365d = 10;
            }
            com.ss.android.ugc.aweme.tools.music.e.b bVar = new com.ss.android.ugc.aweme.tools.music.e.b(this.H, new i(this));
            this.f140375e = bVar;
            bVar.f140480d = this.t;
            RecyclerView recyclerView5 = this.f140381k;
            if (recyclerView5 != null) {
                recyclerView5.setAdapter(this.f140375e);
            }
            o();
            return;
        }
        o();
    }

    public final void a(com.ss.android.ugc.aweme.port.in.a aVar, MusicModel musicModel, String str) {
        com.ss.android.ugc.aweme.port.in.a aVar2;
        List<? extends MusicModel> list;
        h.f.b.l.d(musicModel, "");
        h.f.b.l.d(str, "");
        if (!(aVar == null || (aVar2 = this.o) == null)) {
            List<? extends MusicModel> list2 = aVar.f115560a;
            if (list2 == null || list2.isEmpty()) {
                list = h.a.n.c(musicModel);
            } else {
                ArrayList arrayList = new ArrayList();
                for (T t2 : list2) {
                    if (t2.getId() != musicModel.getId()) {
                        arrayList.add(t2);
                    }
                }
                list = h.a.n.g((Collection) arrayList);
                list.add(0, musicModel);
            }
            aVar2.f115560a = list;
        }
        RecyclerView recyclerView = this.f140381k;
        if (recyclerView != null) {
            recyclerView.post(new p(this, str));
        }
    }

    public a(androidx.appcompat.app.d dVar, com.ss.android.ugc.asve.editor.g gVar, com.ss.android.ugc.aweme.cz.a.a aVar, boolean z2, int i2, h.f.a.a<String> aVar2) {
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar2, "");
        this.x = dVar;
        this.K = gVar;
        this.y = aVar;
        this.z = z2;
        this.A = i2;
        this.L = aVar2;
    }
}
