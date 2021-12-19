package com.ss.android.ugc.aweme.tools.music.e.b;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecycleView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.ss.android.ugc.aweme.tools.music.b.b;
import com.ss.android.ugc.aweme.tools.music.f.b;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.tools.view.b.c;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class g implements com.ss.android.ugc.aweme.port.in.a.a {
    public static final int x = 30;
    public static final a y = new a((byte) 0);
    private RecyclerView A;
    private TextView B;
    private View C;
    private View D;
    private View E;
    private View F;
    private View G;
    private DmtStatusView H;
    private FrameLayout I;
    private com.ss.android.ugc.aweme.music.a J;
    private final h.h K = h.i.a((h.f.a.a) h.f140550a);
    private boolean L;

    /* renamed from: a  reason: collision with root package name */
    AVDmtPanelRecycleView f140524a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.port.in.a.d f140525b;

    /* renamed from: c  reason: collision with root package name */
    public AVDmtTabLayout f140526c;

    /* renamed from: d  reason: collision with root package name */
    public TuxCheckBox f140527d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.port.in.a.e f140528e;

    /* renamed from: f  reason: collision with root package name */
    public TuxStatusView f140529f;

    /* renamed from: g  reason: collision with root package name */
    public TuxStatusView f140530g;

    /* renamed from: h  reason: collision with root package name */
    DmtStatusView f140531h;

    /* renamed from: i  reason: collision with root package name */
    public SafeHandler f140532i;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.tux.sheet.sheet.a f140533j;

    /* renamed from: k  reason: collision with root package name */
    public a f140534k = new a();

    /* renamed from: l  reason: collision with root package name */
    public a f140535l = new a();

    /* renamed from: m  reason: collision with root package name */
    public final f.a.b.a f140536m = new f.a.b.a();
    public d n;
    public d o;
    public int p;
    public final HashSet<String> q = new HashSet<>();
    public boolean r;
    public boolean s;
    public boolean t = true;
    public String u = "-1";
    public boolean v;
    public final com.ss.android.ugc.aweme.music.ui.m w = new C3714g(this);
    private View z;

    public static final class a {
        static {
            Covode.recordClassIndex(91777);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(boolean z2, boolean z3) {
        if (z3) {
            TuxStatusView tuxStatusView = this.f140530g;
            if (tuxStatusView == null) {
                h.f.b.l.a("retryViewCollect");
            }
            tuxStatusView.setVisibility(8);
        } else if (!z2) {
            this.f140535l.f140490a.clear();
            d dVar = this.o;
            if (dVar != null) {
                dVar.notifyDataSetChanged();
            }
            DmtStatusView dmtStatusView = this.f140531h;
            if (dmtStatusView == null) {
                h.f.b.l.a("mLoadingStatusViewCollect");
            }
            dmtStatusView.a(true);
            TuxStatusView tuxStatusView2 = this.f140530g;
            if (tuxStatusView2 == null) {
                h.f.b.l.a("retryViewCollect");
            }
            tuxStatusView2.setVisibility(0);
            TuxStatusView tuxStatusView3 = this.f140530g;
            if (tuxStatusView3 == null) {
                h.f.b.l.a("retryViewCollect");
            }
            TuxStatusView.c cVar = new TuxStatusView.c();
            com.ss.android.ugc.aweme.port.in.a.d dVar2 = this.f140525b;
            if (dVar2 == null) {
                h.f.b.l.a("params");
            }
            String string = dVar2.f115568c.getString(R.string.cjw);
            h.f.b.l.b(string, "");
            TuxStatusView.c a2 = cVar.a(string);
            com.ss.android.ugc.aweme.port.in.a.d dVar3 = this.f140525b;
            if (dVar3 == null) {
                h.f.b.l.a("params");
            }
            String string2 = dVar3.f115568c.getString(R.string.cjv);
            h.f.b.l.b(string2, "");
            TuxStatusView.c a3 = a2.a((CharSequence) string2);
            a3.f45362j = new z(this);
            tuxStatusView3.setStatus(a3);
        } else {
            this.f140535l.f140490a.clear();
            d dVar4 = this.o;
            if (dVar4 != null) {
                dVar4.notifyDataSetChanged();
            }
            DmtStatusView dmtStatusView2 = this.f140531h;
            if (dmtStatusView2 == null) {
                h.f.b.l.a("mLoadingStatusViewCollect");
            }
            dmtStatusView2.a(true);
            TuxStatusView tuxStatusView4 = this.f140530g;
            if (tuxStatusView4 == null) {
                h.f.b.l.a("retryViewCollect");
            }
            tuxStatusView4.setVisibility(0);
            TuxStatusView tuxStatusView5 = this.f140530g;
            if (tuxStatusView5 == null) {
                h.f.b.l.a("retryViewCollect");
            }
            TuxStatusView.c cVar2 = new TuxStatusView.c();
            com.ss.android.ugc.aweme.port.in.a.d dVar5 = this.f140525b;
            if (dVar5 == null) {
                h.f.b.l.a("params");
            }
            String string3 = dVar5.f115568c.getString(R.string.dic);
            h.f.b.l.b(string3, "");
            TuxStatusView.c a4 = cVar2.a(string3);
            com.ss.android.ugc.aweme.port.in.a.d dVar6 = this.f140525b;
            if (dVar6 == null) {
                h.f.b.l.a("params");
            }
            String string4 = dVar6.f115568c.getString(R.string.dib);
            h.f.b.l.b(string4, "");
            tuxStatusView5.setStatus(a4.a((CharSequence) string4));
        }
    }

    public final void a(boolean z2) {
        com.ss.android.ugc.aweme.port.in.a.d dVar = this.f140525b;
        if (dVar == null) {
            h.f.b.l.a("params");
        }
        new SafeHandler(dVar.f115568c).post(new r(this, z2));
    }

    public final void a(d dVar) {
        h.f.b.l.d(dVar, "");
        f.f140522a = "-1";
        com.ss.android.ugc.aweme.port.in.a.d dVar2 = this.f140525b;
        if (dVar2 == null) {
            h.f.b.l.a("params");
        }
        dVar2.f115577l.a(false);
        com.ss.android.ugc.aweme.port.in.a.d dVar3 = this.f140525b;
        if (dVar3 == null) {
            h.f.b.l.a("params");
        }
        if (com.ss.android.ugc.tools.utils.k.a(dVar3.f115566a)) {
            if (!((Boolean) this.K.getValue()).booleanValue()) {
                com.ss.android.ugc.aweme.port.in.a.d dVar4 = this.f140525b;
                if (dVar4 == null) {
                    h.f.b.l.a("params");
                }
                if (dVar4.f115572g) {
                    com.ss.android.ugc.aweme.port.in.a.d dVar5 = this.f140525b;
                    if (dVar5 == null) {
                        h.f.b.l.a("params");
                    }
                    String string = dVar5.f115568c.getString(R.string.b0n);
                    h.f.b.l.b(string, "");
                    com.ss.android.ugc.aweme.port.in.a.d dVar6 = this.f140525b;
                    if (dVar6 == null) {
                        h.f.b.l.a("params");
                    }
                    new com.ss.android.ugc.aweme.tux.a.i.a(dVar6.f115568c).a(string).a();
                    return;
                }
            }
            dVar.f140502a = -1;
            dVar.notifyDataSetChanged();
            com.ss.android.ugc.aweme.port.in.a.d dVar7 = this.f140525b;
            if (dVar7 == null) {
                h.f.b.l.a("params");
            }
            dVar7.f115577l.a(null, null, false);
        }
    }

    public final void a(d dVar, MusicModel musicModel) {
        boolean z2;
        if (!com.ss.android.ugc.aweme.port.in.g.a().A().b()) {
            String str = this.p == 0 ? "edit_page_recommend" : "edit_page_recommend_favourite";
            com.ss.android.ugc.aweme.port.in.a.d dVar2 = this.f140525b;
            if (dVar2 == null) {
                h.f.b.l.a("params");
            }
            com.ss.android.ugc.aweme.login.c.a(dVar2.f115568c, "video_edit_page", str, new s(this, dVar, musicModel));
            return;
        }
        this.L = true;
        if (musicModel.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
            z2 = true;
        } else {
            z2 = false;
        }
        int b2 = com.ss.android.ugc.aweme.tools.music.f.e.b(this.f140534k.f140490a, musicModel);
        if (z2) {
            musicModel.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
            if (b2 >= 0) {
                MusicModel musicModel2 = this.f140534k.f140490a.get(b2);
                h.f.b.l.b(musicModel2, "");
                musicModel2.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
            }
        } else {
            musicModel.setCollectionType(MusicModel.CollectionType.COLLECTED);
            if (b2 >= 0) {
                MusicModel musicModel3 = this.f140534k.f140490a.get(b2);
                h.f.b.l.b(musicModel3, "");
                musicModel3.setCollectionType(MusicModel.CollectionType.COLLECTED);
            }
        }
        a(musicModel.getMusicId(), !z2);
        HashMap<String, Boolean> hashMap = c.f140500a;
        String musicId = musicModel.getMusicId();
        h.f.b.l.b(musicId, "");
        hashMap.put(musicId, Boolean.valueOf(!z2));
        dVar.notifyDataSetChanged();
        com.ss.android.ugc.aweme.port.in.a.d dVar3 = this.f140525b;
        if (dVar3 == null) {
            h.f.b.l.a("params");
        }
        dVar3.f115578m.a(!z2, musicModel);
        String musicId2 = musicModel.getMusicId();
        h.f.b.l.b(musicId2, "");
        com.ss.android.ugc.aweme.tools.music.e.a.b.a(musicId2, true ^ z2, new t(this, musicModel));
    }

    /* access modifiers changed from: package-private */
    public static final class f implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140548a;

        static {
            Covode.recordClassIndex(91787);
        }

        f(g gVar) {
            this.f140548a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f140548a.g();
        }
    }

    public static final class e implements aa.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140542a;

        static {
            Covode.recordClassIndex(91783);
        }

        @Override // com.ss.android.ugc.aweme.port.in.aa.k
        public final void b() {
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f140544a;

            static {
                Covode.recordClassIndex(91785);
            }

            b(e eVar) {
                this.f140544a = eVar;
            }

            public final void run() {
                this.f140544a.f140542a.a(true, false);
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.aa.k
        public final void a() {
            g.e(this.f140542a).post(new b(this));
        }

        @Override // com.ss.android.ugc.aweme.port.in.aa.k
        public final void c() {
            g.e(this.f140542a).post(new a(this));
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f140543a;

            static {
                Covode.recordClassIndex(91784);
            }

            a(e eVar) {
                this.f140543a = eVar;
            }

            public final void run() {
                this.f140543a.f140542a.f140535l.f140496g = false;
                ArrayList<MusicModel> arrayList = this.f140543a.f140542a.f140535l.f140490a;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.f140543a.f140542a.a(false, false);
                } else {
                    this.f140543a.f140542a.a(true);
                }
            }
        }

        static final class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f140545a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f140546b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f140547c;

            static {
                Covode.recordClassIndex(91786);
            }

            c(e eVar, List list, boolean z) {
                this.f140545a = eVar;
                this.f140546b = list;
                this.f140547c = z;
            }

            public final void run() {
                int i2;
                this.f140545a.f140542a.f140535l.f140496g = true;
                this.f140545a.f140542a.a(false, true);
                com.ss.android.ugc.aweme.port.in.a aVar = new com.ss.android.ugc.aweme.port.in.a(this.f140546b, 0, 0, 0, this.f140547c, null, 46);
                g gVar = this.f140545a.f140542a;
                a aVar2 = this.f140545a.f140542a.f140535l;
                boolean z = this.f140545a.f140542a.v;
                if (z) {
                    aVar2.f140490a.clear();
                }
                ArrayList<MusicModel> arrayList = aVar2.f140490a;
                List<? extends MusicModel> list = aVar.f115560a;
                if (list != null) {
                    arrayList.addAll(list);
                }
                aVar2.f140492c = aVar.f115563d;
                aVar2.f140493d = aVar.f115564e;
                List<? extends MusicModel> list2 = aVar.f115560a;
                if (list2 != null) {
                    i2 = list2.size();
                } else {
                    i2 = 0;
                }
                aVar2.f140494e = i2;
                if (gVar.o == null) {
                    gVar.o = new d(new p(gVar));
                    d dVar = gVar.o;
                    if (dVar != null) {
                        dVar.b_(gVar.f140535l.f140490a);
                    }
                    if (gVar.f140525b == null) {
                        h.f.b.l.a("params");
                    }
                    WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
                    AVDmtPanelRecycleView aVDmtPanelRecycleView = gVar.f140524a;
                    if (aVDmtPanelRecycleView == null) {
                        h.f.b.l.a("collectionRecycerView");
                    }
                    aVDmtPanelRecycleView.setLayoutManager(wrapLinearLayoutManager);
                    AVDmtPanelRecycleView aVDmtPanelRecycleView2 = gVar.f140524a;
                    if (aVDmtPanelRecycleView2 == null) {
                        h.f.b.l.a("collectionRecycerView");
                    }
                    aVDmtPanelRecycleView2.setAdapter(gVar.o);
                    if (!gVar.f140535l.f140493d) {
                        gVar.a(true);
                    }
                    DmtStatusView dmtStatusView = gVar.f140531h;
                    if (dmtStatusView == null) {
                        h.f.b.l.a("mLoadingStatusViewCollect");
                    }
                    dmtStatusView.a(true);
                    d dVar2 = gVar.o;
                    if (dVar2 != null) {
                        dVar2.a((c.a) new q(gVar));
                    }
                } else if (z) {
                    d dVar3 = gVar.o;
                    if (dVar3 != null) {
                        dVar3.b_(gVar.f140535l.f140490a);
                    }
                    d dVar4 = gVar.o;
                    if (dVar4 != null) {
                        dVar4.notifyDataSetChanged();
                    }
                    AVDmtPanelRecycleView aVDmtPanelRecycleView3 = gVar.f140524a;
                    if (aVDmtPanelRecycleView3 == null) {
                        h.f.b.l.a("collectionRecycerView");
                    }
                    aVDmtPanelRecycleView3.b(0);
                } else {
                    d dVar5 = gVar.o;
                    if (dVar5 != null) {
                        dVar5.b(gVar.f140535l.f140490a);
                    }
                    SafeHandler safeHandler = gVar.f140532i;
                    if (safeHandler == null) {
                        h.f.b.l.a("safeHander");
                    }
                    safeHandler.post(new y(gVar));
                }
                this.f140545a.f140542a.v = false;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(g gVar) {
            this.f140542a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.port.in.aa.k
        public final void a(List<? extends MusicModel> list, boolean z) {
            h.f.b.l.d(list, "");
            g.e(this.f140542a).post(new c(this, list, z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.e.b.g$g  reason: collision with other inner class name */
    public static final class C3714g implements com.ss.android.ugc.aweme.music.ui.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140549a;

        static {
            Covode.recordClassIndex(91788);
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final void a(MusicModel musicModel, long j2) {
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final void a(MusicModel musicModel, Exception exc) {
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final void c(MusicModel musicModel) {
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final MusicModel h() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final void r() {
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final boolean bN_() {
            if (this.f140549a.f140533j != null) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final Activity i() {
            return g.a(this.f140549a).f115568c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3714g(g gVar) {
            this.f140549a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.music.ui.m
        public final void a(String str, MusicModel musicModel, String str2) {
            String str3;
            if (musicModel == null || !h.f.b.l.a((Object) f.f140522a, (Object) musicModel.getMusicId())) {
                return;
            }
            if (this.f140549a.p == 0) {
                String str4 = this.f140549a.u;
                if (musicModel != null) {
                    str3 = musicModel.getMusicId();
                } else {
                    str3 = null;
                }
                if (h.f.b.l.a((Object) str4, (Object) str3)) {
                    g.a(this.f140549a).f115577l.a(true);
                }
                g.a(this.f140549a).f115577l.a(str, com.ss.android.ugc.aweme.tools.music.f.b.a(musicModel), true);
                d dVar = this.f140549a.n;
                if (dVar != null) {
                    dVar.a(-1);
                    return;
                }
                return;
            }
            g.a(this.f140549a).f115577l.a(str, com.ss.android.ugc.aweme.tools.music.f.b.a(musicModel), false);
            d dVar2 = this.f140549a.o;
            if (dVar2 != null) {
                dVar2.a(-1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140567a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f140568b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MusicModel f140569c;

        static {
            Covode.recordClassIndex(91802);
        }

        s(g gVar, d dVar, MusicModel musicModel) {
            this.f140567a = gVar;
            this.f140568b = dVar;
            this.f140569c = musicModel;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f140567a.a(this.f140568b, this.f140569c);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f140550a = new h();

        static {
            Covode.recordClassIndex(91789);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AVExternalServiceImpl.a().configService().avsettingsConfig().enableNewMusicMarquee());
        }
    }

    public static final class q implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140564a;

        static {
            Covode.recordClassIndex(91800);
        }

        @Override // com.ss.android.ugc.tools.view.b.c.a
        public final void a() {
            d dVar = this.f140564a.o;
            if (dVar != null) {
                dVar.ag_();
            }
            if (this.f140564a.f140535l.f140493d) {
                com.ss.android.ugc.aweme.tools.music.e.a.b.f140453h.c(g.a(this.f140564a).f115570e);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        q(g gVar) {
            this.f140564a = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f140566b;

        static {
            Covode.recordClassIndex(91801);
        }

        r(g gVar, boolean z) {
            this.f140565a = gVar;
            this.f140566b = z;
        }

        public final void run() {
            if (this.f140566b) {
                d dVar = this.f140565a.o;
                if (dVar != null) {
                    dVar.d(false);
                    return;
                }
                return;
            }
            d dVar2 = this.f140565a.n;
            if (dVar2 != null) {
                dVar2.d(false);
            }
        }
    }

    static final class y implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140576a;

        static {
            Covode.recordClassIndex(91809);
        }

        y(g gVar) {
            this.f140576a = gVar;
        }

        public final void run() {
            if (this.f140576a.f140535l.f140493d) {
                d dVar = this.f140576a.o;
                if (dVar != null) {
                    dVar.ai_();
                    return;
                }
                return;
            }
            this.f140576a.a(true);
        }
    }

    static {
        Covode.recordClassIndex(91776);
    }

    @Override // com.ss.android.ugc.aweme.port.in.a.a
    public final void b() {
        h();
        com.bytedance.tux.sheet.sheet.a aVar = this.f140533j;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.a.a
    public final void d() {
        if (this.r) {
            this.r = false;
            this.s = true;
            i();
        }
    }

    public static final class n implements com.ss.android.ugc.aweme.port.in.a.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140559a;

        static {
            Covode.recordClassIndex(91795);
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.f
        public final boolean a() {
            String musicId;
            List<String> list;
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            if (cVar == null || (musicId = cVar.getMusicId()) == null || (list = g.a(this.f140559a).f115566a) == null || !list.contains(musicId)) {
                return g.a(this.f140559a).f115577l.d();
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(g gVar) {
            this.f140559a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.f
        public final void a(MusicModel musicModel, int i2) {
            h.f.b.l.d(musicModel, "");
            this.f140559a.a(musicModel, true, i2);
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.f
        public final void b(View view, int i2) {
            h.f.b.l.d(view, "");
            if (i2 >= 0) {
                g.a(this.f140559a).f115577l.b();
                g.a(this.f140559a).f115578m.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.f
        public final void c(View view, int i2) {
            h.f.b.l.d(view, "");
            if (i2 >= 0) {
                MusicModel musicModel = this.f140559a.f140534k.f140490a.get(i2);
                h.f.b.l.b(musicModel, "");
                MusicModel musicModel2 = musicModel;
                g gVar = this.f140559a;
                d dVar = gVar.n;
                if (dVar == null) {
                    h.f.b.l.b();
                }
                gVar.a(dVar, musicModel2);
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.f
        public final void a(View view, int i2) {
            String str;
            h.f.b.l.d(view, "");
            if (i2 >= 0) {
                MusicModel musicModel = this.f140559a.f140534k.f140490a.get(i2);
                h.f.b.l.b(musicModel, "");
                MusicModel musicModel2 = musicModel;
                if (this.f140559a.n != null) {
                    str = d.l();
                } else {
                    str = null;
                }
                if (h.f.b.l.a((Object) str, (Object) musicModel2.getMusicId())) {
                    g.a(this.f140559a).f115578m.a(musicModel2, "recommend");
                    g gVar = this.f140559a;
                    d dVar = gVar.n;
                    if (dVar == null) {
                        h.f.b.l.b();
                    }
                    gVar.a(dVar);
                    return;
                }
                d dVar2 = this.f140559a.n;
                if (dVar2 != null) {
                    dVar2.a(i2);
                }
                this.f140559a.a(musicModel2, false);
                g.a(this.f140559a).f115578m.a(musicModel2, i2, "recommend", false);
            }
        }
    }

    public static final class p implements com.ss.android.ugc.aweme.port.in.a.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140563a;

        static {
            Covode.recordClassIndex(91799);
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.f
        public final boolean a() {
            String musicId;
            List<String> list;
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            if (cVar == null || (musicId = cVar.getMusicId()) == null || (list = g.a(this.f140563a).f115566a) == null || !list.contains(musicId)) {
                return g.a(this.f140563a).f115577l.d();
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        p(g gVar) {
            this.f140563a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.f
        public final void a(MusicModel musicModel, int i2) {
            h.f.b.l.d(musicModel, "");
            this.f140563a.a(musicModel, false, i2);
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.f
        public final void b(View view, int i2) {
            h.f.b.l.d(view, "");
            if (i2 >= 0) {
                g.a(this.f140563a).f115577l.b();
                g.a(this.f140563a).f115578m.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.f
        public final void c(View view, int i2) {
            h.f.b.l.d(view, "");
            if (i2 >= 0) {
                MusicModel musicModel = this.f140563a.f140535l.f140490a.get(i2);
                h.f.b.l.b(musicModel, "");
                MusicModel musicModel2 = musicModel;
                g gVar = this.f140563a;
                d dVar = gVar.o;
                if (dVar == null) {
                    h.f.b.l.b();
                }
                gVar.a(dVar, musicModel2);
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.a.f
        public final void a(View view, int i2) {
            String str;
            h.f.b.l.d(view, "");
            if (i2 >= 0) {
                MusicModel musicModel = this.f140563a.f140535l.f140490a.get(i2);
                h.f.b.l.b(musicModel, "");
                MusicModel musicModel2 = musicModel;
                if (this.f140563a.o != null) {
                    str = d.l();
                } else {
                    str = null;
                }
                if (h.f.b.l.a((Object) str, (Object) musicModel2.getMusicId())) {
                    g.a(this.f140563a).f115578m.a(musicModel2, "favorite");
                    g gVar = this.f140563a;
                    d dVar = gVar.o;
                    if (dVar == null) {
                        h.f.b.l.b();
                    }
                    gVar.a(dVar);
                    return;
                }
                d dVar2 = this.f140563a.o;
                if (dVar2 != null) {
                    dVar2.a(i2);
                }
                this.f140563a.a(musicModel2, false);
                g.a(this.f140563a).f115578m.a(musicModel2, i2, "favorite", false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140574a;

        static {
            Covode.recordClassIndex(91806);
        }

        w(g gVar) {
            this.f140574a = gVar;
        }

        public final void run() {
            if (!this.f140574a.f140534k.f140493d || this.f140574a.f140534k.f140494e < g.x) {
                this.f140574a.a(false);
                return;
            }
            d dVar = this.f140574a.n;
            if (dVar != null) {
                dVar.ai_();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.a.a
    public final void c() {
        com.ss.android.ugc.aweme.tools.music.e.a.b.f140453h.f140455a = null;
        com.ss.android.ugc.aweme.tools.music.e.a.b.f140453h.f140456b = null;
        IMusicService m2 = MusicService.m();
        h.f.b.l.b(m2, "");
        m2.a((com.ss.android.ugc.aweme.music.c.a) null);
        this.f140536m.dispose();
        com.ss.android.ugc.aweme.music.a aVar = this.J;
        if (aVar != null) {
            aVar.d();
        }
    }

    public final void g() {
        DmtStatusView dmtStatusView = this.f140531h;
        if (dmtStatusView == null) {
            h.f.b.l.a("mLoadingStatusViewCollect");
        }
        dmtStatusView.f();
        this.f140535l.f140495f = true;
        this.f140535l.f140496g = null;
        com.ss.android.ugc.aweme.tools.music.e.a.b.f140453h.f140455a = new e(this);
        com.ss.android.ugc.aweme.tools.music.e.a.b bVar = com.ss.android.ugc.aweme.tools.music.e.a.b.f140453h;
        com.ss.android.ugc.aweme.port.in.a.d dVar = this.f140525b;
        if (dVar == null) {
            h.f.b.l.a("params");
        }
        bVar.b(dVar.f115570e);
    }

    public final void h() {
        float f2;
        f.f140522a = "-1";
        com.ss.android.ugc.aweme.port.in.a.e eVar = this.f140528e;
        if (eVar == null) {
            h.f.b.l.a("originSoundParams");
        }
        if (eVar.f115579a) {
            com.ss.android.ugc.aweme.port.in.a.e eVar2 = this.f140528e;
            if (eVar2 == null) {
                h.f.b.l.a("originSoundParams");
            }
            f2 = eVar2.f115580b;
        } else {
            f2 = 0.0f;
        }
        com.ss.android.ugc.aweme.port.in.a.d dVar = this.f140525b;
        if (dVar == null) {
            h.f.b.l.a("params");
        }
        com.ss.android.ugc.aweme.port.in.a.b bVar = dVar.f115577l;
        com.ss.android.ugc.aweme.port.in.a.e eVar3 = this.f140528e;
        if (eVar3 == null) {
            h.f.b.l.a("originSoundParams");
        }
        bVar.a(eVar3, f2);
    }

    private final void k() {
        ArrayList<MusicModel> arrayList = this.f140534k.f140490a;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f140534k.f140496g = false;
            b(false);
            return;
        }
        d dVar = this.n;
        if (dVar == null) {
            j();
            return;
        }
        dVar.b(this.f140534k.f140490a);
        com.ss.android.ugc.aweme.port.in.a.d dVar2 = this.f140525b;
        if (dVar2 == null) {
            h.f.b.l.a("params");
        }
        new SafeHandler(dVar2.f115568c).post(new w(this));
    }

    public static final class o implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140560a;

        static {
            Covode.recordClassIndex(91796);
        }

        @Override // com.ss.android.ugc.tools.view.b.c.a
        public final void a() {
            f.a.t<SuggestMusicList> a2;
            if (!this.f140560a.f140534k.f140493d || this.f140560a.f140534k.f140494e < g.x / 2) {
                this.f140560a.a(false);
                return;
            }
            d dVar = this.f140560a.n;
            if (dVar != null) {
                dVar.ag_();
            }
            com.ss.android.ugc.aweme.tools.music.a aVar = new com.ss.android.ugc.aweme.tools.music.a(this.f140560a.f140534k.f140491b, g.a(this.f140560a).f115571f, "", (long) g.a(this.f140560a).f115569d, g.x, g.a(this.f140560a).f115570e, this.f140560a.f140534k.f140492c);
            h.f.b.l.d(aVar, "");
            if (TextUtils.isEmpty(aVar.f140266a)) {
                h.f.b.l.d(aVar, "");
                a2 = com.ss.android.ugc.aweme.tools.music.a.a.a(aVar.f140272g, aVar.f140270e, aVar.f140271f);
            } else {
                h.f.b.l.d(aVar, "");
                a2 = com.ss.android.ugc.aweme.tools.music.a.a.b.f140288a.a(aVar.f140266a, aVar.f140267b, aVar.f140268c, aVar.f140269d, aVar.f140270e, aVar.f140272g);
            }
            this.f140560a.f140536m.a(a2.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this), new b(this)));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(g gVar) {
            this.f140560a = gVar;
        }

        static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o f140562a;

            static {
                Covode.recordClassIndex(91798);
            }

            b(o oVar) {
                this.f140562a = oVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f140562a.f140560a.a(false);
            }
        }

        static final class a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o f140561a;

            static {
                Covode.recordClassIndex(91797);
            }

            a(o oVar) {
                this.f140561a = oVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                SuggestMusicList suggestMusicList = (SuggestMusicList) obj;
                g gVar = this.f140561a.f140560a;
                a aVar = this.f140561a.f140560a.f140534k;
                h.f.b.l.b(suggestMusicList, "");
                gVar.a(aVar, new com.ss.android.ugc.aweme.port.in.a(suggestMusicList.musicList, 0, 0, suggestMusicList.cursor, suggestMusicList.hasMore, aVar.f140491b, 6));
            }
        }
    }

    private final void i() {
        com.ss.android.ugc.aweme.port.in.a.d dVar = this.f140525b;
        if (dVar == null) {
            h.f.b.l.a("params");
        }
        if (!dVar.f115574i || this.r) {
            TuxCheckBox tuxCheckBox = this.f140527d;
            if (tuxCheckBox == null) {
                h.f.b.l.a("tuxCheckBox");
            }
            tuxCheckBox.setChecked(false);
            TuxCheckBox tuxCheckBox2 = this.f140527d;
            if (tuxCheckBox2 == null) {
                h.f.b.l.a("tuxCheckBox");
            }
            tuxCheckBox2.setAlpha(0.7f);
            TextView textView = this.B;
            if (textView == null) {
                h.f.b.l.a("tuxCheckBoxTextView");
            }
            textView.setAlpha(0.7f);
            TuxCheckBox tuxCheckBox3 = this.f140527d;
            if (tuxCheckBox3 == null) {
                h.f.b.l.a("tuxCheckBox");
            }
            tuxCheckBox3.setEnabled(false);
            View view = this.C;
            if (view == null) {
                h.f.b.l.a("tuxCheckBoxTextViewParent");
            }
            view.setEnabled(false);
            return;
        }
        TuxCheckBox tuxCheckBox4 = this.f140527d;
        if (tuxCheckBox4 == null) {
            h.f.b.l.a("tuxCheckBox");
        }
        tuxCheckBox4.setOnCheckedChangeListener(new u(this));
        TuxCheckBox tuxCheckBox5 = this.f140527d;
        if (tuxCheckBox5 == null) {
            h.f.b.l.a("tuxCheckBox");
        }
        tuxCheckBox5.setChecked(true);
        TuxCheckBox tuxCheckBox6 = this.f140527d;
        if (tuxCheckBox6 == null) {
            h.f.b.l.a("tuxCheckBox");
        }
        tuxCheckBox6.setAlpha(1.0f);
        TextView textView2 = this.B;
        if (textView2 == null) {
            h.f.b.l.a("tuxCheckBoxTextView");
        }
        textView2.setAlpha(1.0f);
        TuxCheckBox tuxCheckBox7 = this.f140527d;
        if (tuxCheckBox7 == null) {
            h.f.b.l.a("tuxCheckBox");
        }
        tuxCheckBox7.setEnabled(true);
        View view2 = this.C;
        if (view2 == null) {
            h.f.b.l.a("tuxCheckBoxTextViewParent");
        }
        view2.setEnabled(true);
        TuxCheckBox tuxCheckBox8 = this.f140527d;
        if (tuxCheckBox8 == null) {
            h.f.b.l.a("tuxCheckBox");
        }
        com.ss.android.ugc.aweme.port.in.a.e eVar = this.f140528e;
        if (eVar == null) {
            h.f.b.l.a("originSoundParams");
        }
        tuxCheckBox8.setChecked(eVar.f115579a);
        View view3 = this.C;
        if (view3 == null) {
            h.f.b.l.a("tuxCheckBoxTextViewParent");
        }
        view3.setOnClickListener(new v(this));
    }

    private final void j() {
        d dVar;
        d dVar2 = new d(new n(this));
        this.n = dVar2;
        dVar2.b_(this.f140534k.f140490a);
        if (this.f140525b == null) {
            h.f.b.l.a("params");
        }
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
        RecyclerView recyclerView = this.A;
        if (recyclerView == null) {
            h.f.b.l.a("aiRecycerView");
        }
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = this.A;
        if (recyclerView2 == null) {
            h.f.b.l.a("aiRecycerView");
        }
        recyclerView2.setVisibility(0);
        RecyclerView recyclerView3 = this.A;
        if (recyclerView3 == null) {
            h.f.b.l.a("aiRecycerView");
        }
        recyclerView3.setAdapter(this.n);
        if (!this.f140534k.f140493d && (dVar = this.n) != null) {
            RecyclerView.j jVar = new RecyclerView.j(1, 1);
            View view = dVar.f140503b;
            if (view != null) {
                view.setLayoutParams(jVar);
            }
        }
        DmtStatusView dmtStatusView = this.H;
        if (dmtStatusView == null) {
            h.f.b.l.a("mLoadingStatusViewAI");
        }
        dmtStatusView.a(true);
        d dVar3 = this.n;
        if (dVar3 != null) {
            dVar3.a((c.a) new o(this));
        }
        com.ss.android.ugc.aweme.port.in.a.d dVar4 = this.f140525b;
        if (dVar4 == null) {
            h.f.b.l.a("params");
        }
        if (dVar4.f115576k && cr.a().f125295a == null && this.f140534k.f140490a.size() > 3) {
            d dVar5 = this.n;
            if (dVar5 != null) {
                dVar5.a(0);
            }
            MusicModel musicModel = this.f140534k.f140490a.get(0);
            h.f.b.l.b(musicModel, "");
            String musicId = musicModel.getMusicId();
            if (musicId == null) {
                musicId = "";
            }
            this.u = musicId;
            MusicModel musicModel2 = this.f140534k.f140490a.get(0);
            h.f.b.l.b(musicModel2, "");
            a(musicModel2, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.a.a
    public final void a() {
        TabLayout.f a2;
        a.C1112a aVar = new a.C1112a();
        View view = this.z;
        if (view == null) {
            h.f.b.l.a("thisView");
        }
        a.C1112a a3 = aVar.a(view).a(1);
        com.ss.android.ugc.aweme.port.in.a.d dVar = this.f140525b;
        if (dVar == null) {
            h.f.b.l.a("params");
        }
        this.f140533j = a3.b(com.bytedance.common.utility.n.b(dVar.f115568c) / 2).c(R.style.ob).a(false).b(false).a(new aa(this)).a(new ab(this)).f45299a;
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f140524a;
        if (aVDmtPanelRecycleView == null) {
            h.f.b.l.a("collectionRecycerView");
        }
        aVDmtPanelRecycleView.b(0);
        RecyclerView recyclerView = this.A;
        if (recyclerView == null) {
            h.f.b.l.a("aiRecycerView");
        }
        recyclerView.b(0);
        d dVar2 = this.n;
        if (dVar2 != null) {
            dVar2.notifyDataSetChanged();
        }
        d dVar3 = this.o;
        if (dVar3 != null) {
            dVar3.notifyDataSetChanged();
        }
        this.L = true;
        if (this.f140526c == null) {
            h.f.b.l.a("tablayout");
        } else {
            AVDmtTabLayout aVDmtTabLayout = this.f140526c;
            if (aVDmtTabLayout == null) {
                h.f.b.l.a("tablayout");
            } else {
                AVDmtTabLayout aVDmtTabLayout2 = this.f140526c;
                if (aVDmtTabLayout2 == null) {
                    h.f.b.l.a("tablayout");
                    a2 = null;
                } else {
                    a2 = aVDmtTabLayout2.a(0);
                }
                aVDmtTabLayout.b(a2, true);
            }
            a(0);
        }
        com.ss.android.ugc.aweme.port.in.a.d dVar4 = this.f140525b;
        if (dVar4 == null) {
            h.f.b.l.a("params");
        }
        if (dVar4.f115574i && !this.r) {
            TuxCheckBox tuxCheckBox = this.f140527d;
            if (tuxCheckBox == null) {
                h.f.b.l.a("tuxCheckBox");
            }
            com.ss.android.ugc.aweme.port.in.a.e eVar = this.f140528e;
            if (eVar == null) {
                h.f.b.l.a("originSoundParams");
            }
            tuxCheckBox.setChecked(eVar.f115579a);
        }
        e();
        com.bytedance.tux.sheet.sheet.a aVar2 = this.f140533j;
        if (aVar2 == null) {
            h.f.b.l.b();
        }
        com.ss.android.ugc.aweme.port.in.a.d dVar5 = this.f140525b;
        if (dVar5 == null) {
            h.f.b.l.a("params");
        }
        aVar2.show(dVar5.f115568c.getSupportFragmentManager(), "VerticalMusicView");
        if (!this.f140534k.f140495f) {
            this.f140534k.f140495f = true;
            f();
        }
        this.s = false;
    }

    public final void e() {
        MusicModel musicModel;
        List e2;
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (cVar != null) {
            musicModel = com.ss.android.ugc.aweme.tools.music.f.e.a(cVar);
        } else {
            musicModel = null;
        }
        if (musicModel != null) {
            if (h.f.b.l.a((Object) this.f140534k.f140496g, (Object) true)) {
                if (com.ss.android.ugc.aweme.tools.music.f.e.a(this.f140534k.f140490a, musicModel)) {
                    int b2 = com.ss.android.ugc.aweme.tools.music.f.e.b(this.f140534k.f140490a, musicModel);
                    if (b2 > 0) {
                        MusicModel remove = this.f140534k.f140490a.remove(b2);
                        h.f.b.l.b(remove, "");
                        this.f140534k.f140490a.add(0, remove);
                        d dVar = this.n;
                        if (dVar != null) {
                            dVar.b_(this.f140534k.f140490a);
                        }
                        d dVar2 = this.n;
                        if (dVar2 != null) {
                            dVar2.notifyDataSetChanged();
                        }
                    }
                } else {
                    this.f140534k.f140490a.add(0, musicModel);
                    d dVar3 = this.n;
                    if (dVar3 != null) {
                        dVar3.b_(this.f140534k.f140490a);
                    }
                    d dVar4 = this.n;
                    if (dVar4 != null) {
                        dVar4.notifyDataSetChanged();
                    }
                }
            }
            if (h.f.b.l.a((Object) this.f140534k.f140496g, (Object) false)) {
                this.f140534k.f140490a.clear();
                this.f140534k.f140490a.add(musicModel);
                b(true);
                k();
            }
        } else if (h.f.b.l.a((Object) this.f140534k.f140496g, (Object) false)) {
            d dVar5 = this.n;
            if (!(dVar5 == null || (e2 = dVar5.e()) == null)) {
                e2.clear();
            }
            d dVar6 = this.n;
            if (dVar6 != null) {
                dVar6.notifyDataSetChanged();
            }
            b(false);
        }
    }

    public final void f() {
        this.f140534k.f140496g = null;
        com.ss.android.ugc.aweme.tools.music.b.b bVar = com.ss.android.ugc.aweme.tools.music.b.b.f140410c;
        com.ss.android.ugc.aweme.port.in.a.d dVar = this.f140525b;
        if (dVar == null) {
            h.f.b.l.a("params");
        }
        f.a.t a2 = f.a.t.a(new b.e(bVar, dVar.f115566a)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        h.f.b.l.b(a2, "");
        com.ss.android.ugc.aweme.tools.music.a.a aVar = com.ss.android.ugc.aweme.tools.music.a.a.f140275c;
        com.ss.android.ugc.aweme.port.in.a.d dVar2 = this.f140525b;
        if (dVar2 == null) {
            h.f.b.l.a("params");
        }
        long j2 = (long) dVar2.f115569d;
        com.ss.android.ugc.aweme.port.in.a.d dVar3 = this.f140525b;
        if (dVar3 == null) {
            h.f.b.l.a("params");
        }
        int i2 = dVar3.f115570e;
        int i3 = x;
        this.f140536m.a(f.a.t.a(aVar.a(null, j2, i2, i3, i3, true).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)), a2, new b(this)).a(new c(this), new d(this)));
    }

    public static final class m implements com.ss.android.ugc.aweme.music.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140558a;

        static {
            Covode.recordClassIndex(91794);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(g gVar) {
            this.f140558a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.music.c.a
        public final void a(String str, boolean z) {
            g.a(str, z);
            for (T t : this.f140558a.f140534k.f140490a) {
                if (h.f.b.l.a((Object) t.getMusicId(), (Object) str)) {
                    if (z) {
                        t.setCollectionType(MusicModel.CollectionType.COLLECTED);
                    } else {
                        t.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                    }
                }
            }
            d dVar = this.f140558a.n;
            if (dVar != null) {
                dVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.a.a
    public final void a(com.ss.android.ugc.aweme.port.in.a.e eVar) {
        h.f.b.l.d(eVar, "");
        this.f140528e = eVar;
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.port.in.a.d f140557a;

        static {
            Covode.recordClassIndex(91793);
        }

        l(com.ss.android.ugc.aweme.port.in.a.d dVar) {
            this.f140557a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f140557a.f115577l.e();
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.port.in.a.d a(g gVar) {
        com.ss.android.ugc.aweme.port.in.a.d dVar = gVar.f140525b;
        if (dVar == null) {
            h.f.b.l.a("params");
        }
        return dVar;
    }

    public static final /* synthetic */ AVDmtTabLayout b(g gVar) {
        AVDmtTabLayout aVDmtTabLayout = gVar.f140526c;
        if (aVDmtTabLayout == null) {
            h.f.b.l.a("tablayout");
        }
        return aVDmtTabLayout;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.port.in.a.e c(g gVar) {
        com.ss.android.ugc.aweme.port.in.a.e eVar = gVar.f140528e;
        if (eVar == null) {
            h.f.b.l.a("originSoundParams");
        }
        return eVar;
    }

    public static final /* synthetic */ TuxCheckBox d(g gVar) {
        TuxCheckBox tuxCheckBox = gVar.f140527d;
        if (tuxCheckBox == null) {
            h.f.b.l.a("tuxCheckBox");
        }
        return tuxCheckBox;
    }

    public static final /* synthetic */ SafeHandler e(g gVar) {
        SafeHandler safeHandler = gVar.f140532i;
        if (safeHandler == null) {
            h.f.b.l.a("safeHander");
        }
        return safeHandler;
    }

    static final class aa implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140537a;

        static {
            Covode.recordClassIndex(91778);
        }

        aa(g gVar) {
            this.f140537a = gVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f140537a.h();
            g.a(this.f140537a).f115577l.a();
        }
    }

    static final class ab implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140538a;

        static {
            Covode.recordClassIndex(91779);
        }

        ab(g gVar) {
            this.f140538a = gVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f140538a.h();
            g.a(this.f140538a).f115577l.a();
        }
    }

    public static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AVDmtTabLayout f140553a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f140554b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.port.in.a.d f140555c;

        static {
            Covode.recordClassIndex(91791);
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AVDmtTabLayout aVDmtTabLayout = this.f140553a;
            aVDmtTabLayout.b(aVDmtTabLayout.a(1), true);
            this.f140554b.a(1);
        }

        j(AVDmtTabLayout aVDmtTabLayout, g gVar, com.ss.android.ugc.aweme.port.in.a.d dVar) {
            this.f140553a = aVDmtTabLayout;
            this.f140554b = gVar;
            this.f140555c = dVar;
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.port.in.a.d f140556a;

        static {
            Covode.recordClassIndex(91792);
        }

        k(com.ss.android.ugc.aweme.port.in.a.d dVar) {
            this.f140556a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f140556a.f115577l.c();
            this.f140556a.f115578m.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140573a;

        static {
            Covode.recordClassIndex(91805);
        }

        v(g gVar) {
            this.f140573a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            g.d(this.f140573a).setChecked(!g.d(this.f140573a).isChecked());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140540a;

        static {
            Covode.recordClassIndex(91781);
        }

        c(g gVar) {
            this.f140540a = gVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.port.in.a aVar = (com.ss.android.ugc.aweme.port.in.a) obj;
            List<? extends MusicModel> list = aVar.f115560a;
            if (list == null || list.isEmpty()) {
                this.f140540a.f140534k.f140496g = false;
                this.f140540a.e();
                return;
            }
            this.f140540a.f140534k.f140496g = true;
            g gVar = this.f140540a;
            a aVar2 = gVar.f140534k;
            h.f.b.l.b(aVar, "");
            gVar.a(aVar2, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140541a;

        static {
            Covode.recordClassIndex(91782);
        }

        d(g gVar) {
            this.f140541a = gVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.framework.a.a.a("Get AI Recommend Music Failed. Reason:" + ((Throwable) obj).getMessage());
            this.f140541a.f140534k.f140496g = false;
            this.f140541a.e();
        }
    }

    public static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140551a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.port.in.a.d f140552b;

        static {
            Covode.recordClassIndex(91790);
        }

        public final void onClick(View view) {
            TabLayout.f fVar;
            ClickAgent.onClick(view);
            AVDmtTabLayout b2 = g.b(this.f140551a);
            if (b2 != null) {
                AVDmtTabLayout b3 = g.b(this.f140551a);
                if (b3 != null) {
                    fVar = b3.a(0);
                } else {
                    fVar = null;
                }
                b2.b(fVar, true);
            }
            this.f140551a.a(0);
        }

        i(g gVar, com.ss.android.ugc.aweme.port.in.a.d dVar) {
            this.f140551a = gVar;
            this.f140552b = dVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x extends h.f.b.m implements h.f.a.b<TuxButton, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(91807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            h.f.b.l.d(tuxButton2, "");
            tuxButton2.setText(g.a(this.this$0).f115568c.getString(R.string.cjx));
            tuxButton2.setButtonSize(3);
            tuxButton2.setButtonVariant(2);
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.tools.music.e.b.g.x.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ x f140575a;

                static {
                    Covode.recordClassIndex(91808);
                }

                {
                    this.f140575a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    TuxStatusView tuxStatusView = this.f140575a.this$0.f140529f;
                    if (tuxStatusView == null) {
                        h.f.b.l.a("retryViewAI");
                    }
                    tuxStatusView.setVisibility(4);
                    this.f140575a.this$0.f();
                }
            });
            tuxButton2.setButtonStartIcon(2131232417);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z extends h.f.b.m implements h.f.a.b<TuxButton, h.z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(91810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            h.f.b.l.d(tuxButton2, "");
            tuxButton2.setText(g.a(this.this$0).f115568c.getString(R.string.cjx));
            tuxButton2.setButtonVariant(1);
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.tools.music.e.b.g.z.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ z f140577a;

                static {
                    Covode.recordClassIndex(91811);
                }

                {
                    this.f140577a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    TuxStatusView tuxStatusView = this.f140577a.this$0.f140530g;
                    if (tuxStatusView == null) {
                        h.f.b.l.a("retryViewCollect");
                    }
                    tuxStatusView.setVisibility(4);
                    this.f140577a.this$0.g();
                }
            });
            tuxButton2.setButtonStartIcon(2131232417);
            return h.z.f158842a;
        }
    }

    public static final class t implements aa.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140570a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicModel f140571b;

        static {
            Covode.recordClassIndex(91803);
        }

        @Override // com.ss.android.ugc.aweme.port.in.aa.j
        public final void a(boolean z) {
            if (z) {
                this.f140571b.setCollectionType(MusicModel.CollectionType.COLLECTED);
                g.a(this.f140571b.getMusicId(), true);
                new com.ss.android.ugc.aweme.tux.a.i.a(g.a(this.f140570a).f115568c).a(R.string.aho).a();
                return;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(g.a(this.f140570a).f115568c).a(R.string.ahj).a();
        }

        @Override // com.ss.android.ugc.aweme.port.in.aa.j
        public final void b(boolean z) {
            if (z) {
                this.f140571b.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                g.a(this.f140571b.getMusicId(), false);
                new com.ss.android.ugc.aweme.tux.a.i.a(g.a(this.f140570a).f115568c).a(R.string.a9j).a();
                return;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(g.a(this.f140570a).f115568c).a(R.string.a9i).a();
        }

        t(g gVar, MusicModel musicModel) {
            this.f140570a = gVar;
            this.f140571b = musicModel;
        }
    }

    private final void b(boolean z2) {
        if (z2) {
            TuxStatusView tuxStatusView = this.f140529f;
            if (tuxStatusView == null) {
                h.f.b.l.a("retryViewAI");
            }
            tuxStatusView.setVisibility(8);
            return;
        }
        DmtStatusView dmtStatusView = this.H;
        if (dmtStatusView == null) {
            h.f.b.l.a("mLoadingStatusViewAI");
        }
        dmtStatusView.a(true);
        TuxStatusView tuxStatusView2 = this.f140529f;
        if (tuxStatusView2 == null) {
            h.f.b.l.a("retryViewAI");
        }
        tuxStatusView2.setVisibility(0);
        TuxStatusView tuxStatusView3 = this.f140529f;
        if (tuxStatusView3 == null) {
            h.f.b.l.a("retryViewAI");
        }
        TuxStatusView.c cVar = new TuxStatusView.c();
        com.ss.android.ugc.aweme.port.in.a.d dVar = this.f140525b;
        if (dVar == null) {
            h.f.b.l.a("params");
        }
        String string = dVar.f115568c.getString(R.string.cjw);
        h.f.b.l.b(string, "");
        TuxStatusView.c a2 = cVar.a(string);
        com.ss.android.ugc.aweme.port.in.a.d dVar2 = this.f140525b;
        if (dVar2 == null) {
            h.f.b.l.a("params");
        }
        String string2 = dVar2.f115568c.getString(R.string.cjv);
        h.f.b.l.b(string2, "");
        TuxStatusView.c a3 = a2.a((CharSequence) string2);
        a3.f45362j = new x(this);
        tuxStatusView3.setStatus(a3);
    }

    public final void a(int i2) {
        d dVar;
        d dVar2;
        com.ss.android.ugc.aweme.shortvideo.c cVar;
        MusicModel a2;
        if (i2 != this.p) {
            f.f140522a = "-1";
            d dVar3 = this.n;
            if (dVar3 != null) {
                dVar3.a(-1);
            }
            d dVar4 = this.o;
            if (dVar4 != null) {
                dVar4.a(-1);
            }
            if (i2 == 0 && h.f.b.l.a((Object) this.f140534k.f140496g, (Object) true) && (cVar = cr.a().f125295a) != null && (a2 = com.ss.android.ugc.aweme.tools.music.f.e.a(cVar)) != null && h.f.b.l.a((Object) this.f140534k.f140496g, (Object) true) && !com.ss.android.ugc.aweme.tools.music.f.e.a(this.f140534k.f140490a, a2)) {
                this.f140534k.f140490a.add(0, a2);
                d dVar5 = this.n;
                if (dVar5 != null) {
                    dVar5.b_(this.f140534k.f140490a);
                }
                d dVar6 = this.n;
                if (dVar6 != null) {
                    dVar6.notifyDataSetChanged();
                }
            }
        }
        c.f140500a.clear();
        if (i2 == 0) {
            com.ss.android.ugc.aweme.port.in.a.d dVar7 = this.f140525b;
            if (dVar7 == null) {
                h.f.b.l.a("params");
            }
            dVar7.f115578m.b(true);
            this.p = 0;
            View view = this.F;
            if (view == null) {
                h.f.b.l.a("viewGroupAI");
            }
            view.setVisibility(0);
            View view2 = this.G;
            if (view2 == null) {
                h.f.b.l.a("viewGroupCollect");
            }
            view2.setVisibility(4);
            ArrayList<MusicModel> arrayList = this.f140534k.f140490a;
            if (arrayList != null && !arrayList.isEmpty() && (dVar2 = this.n) != null) {
                dVar2.notifyDataSetChanged();
                return;
            }
            return;
        }
        this.p = 1;
        com.ss.android.ugc.aweme.port.in.a.d dVar8 = this.f140525b;
        if (dVar8 == null) {
            h.f.b.l.a("params");
        }
        dVar8.f115578m.b(false);
        View view3 = this.F;
        if (view3 == null) {
            h.f.b.l.a("viewGroupAI");
        }
        view3.setVisibility(4);
        View view4 = this.G;
        if (view4 == null) {
            h.f.b.l.a("viewGroupCollect");
        }
        view4.setVisibility(0);
        if (!this.f140535l.f140495f) {
            this.L = false;
            if (!com.ss.android.ugc.aweme.port.in.g.a().A().b()) {
                com.ss.android.ugc.aweme.login.c.a(com.ss.android.ugc.aweme.df.c.c(), "video_edit_page", "edit_page_recommend_favourite", new f(this));
            } else {
                g();
            }
        } else {
            ArrayList<MusicModel> arrayList2 = this.f140535l.f140490a;
            if (!(arrayList2 == null || arrayList2.isEmpty() || (dVar = this.o) == null)) {
                dVar.notifyDataSetChanged();
            }
            if (this.L) {
                this.L = false;
                this.v = true;
                com.ss.android.ugc.aweme.tools.music.e.a.b bVar = com.ss.android.ugc.aweme.tools.music.e.a.b.f140453h;
                com.ss.android.ugc.aweme.port.in.a.d dVar9 = this.f140525b;
                if (dVar9 == null) {
                    h.f.b.l.a("params");
                }
                bVar.b(dVar9.f115570e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.a.a
    public final void a(com.ss.android.ugc.aweme.port.in.a.d dVar) {
        View view;
        View view2;
        MethodCollector.i(536);
        h.f.b.l.d(dVar, "");
        this.f140525b = dVar;
        this.r = dVar.f115575j;
        this.f140532i = new SafeHandler(dVar.f115568c);
        androidx.fragment.app.e eVar = dVar.f115568c;
        if (eVar != null) {
            TabLayout.f fVar = null;
            View inflate = LayoutInflater.from(eVar).inflate(R.layout.bjm, (ViewGroup) null);
            h.f.b.l.b(inflate, "");
            this.z = inflate;
            if (inflate == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById = inflate.findViewById(R.id.drt);
            h.f.b.l.b(findViewById, "");
            this.A = (RecyclerView) findViewById;
            View view3 = this.z;
            if (view3 == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById2 = view3.findViewById(R.id.ehm);
            h.f.b.l.b(findViewById2, "");
            this.f140526c = (AVDmtTabLayout) findViewById2;
            View view4 = this.z;
            if (view4 == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById3 = view4.findViewById(R.id.ci4);
            h.f.b.l.b(findViewById3, "");
            this.H = (DmtStatusView) findViewById3;
            View view5 = this.z;
            if (view5 == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById4 = view5.findViewById(R.id.ci5);
            h.f.b.l.b(findViewById4, "");
            this.f140531h = (DmtStatusView) findViewById4;
            View view6 = this.z;
            if (view6 == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById5 = view6.findViewById(R.id.dru);
            h.f.b.l.b(findViewById5, "");
            this.f140524a = (AVDmtPanelRecycleView) findViewById5;
            View view7 = this.z;
            if (view7 == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById6 = view7.findViewById(R.id.dnt);
            h.f.b.l.b(findViewById6, "");
            this.I = (FrameLayout) findViewById6;
            View view8 = this.z;
            if (view8 == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById7 = view8.findViewById(R.id.fkq);
            h.f.b.l.b(findViewById7, "");
            this.D = findViewById7;
            View view9 = this.z;
            if (view9 == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById8 = view9.findViewById(R.id.eu1);
            h.f.b.l.b(findViewById8, "");
            this.f140527d = (TuxCheckBox) findViewById8;
            View view10 = this.z;
            if (view10 == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById9 = view10.findViewById(R.id.eu2);
            h.f.b.l.b(findViewById9, "");
            this.B = (TextView) findViewById9;
            View view11 = this.z;
            if (view11 == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById10 = view11.findViewById(R.id.eu3);
            h.f.b.l.b(findViewById10, "");
            this.C = findViewById10;
            View view12 = this.z;
            if (view12 == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById11 = view12.findViewById(R.id.b38);
            h.f.b.l.b(findViewById11, "");
            this.E = findViewById11;
            View view13 = this.z;
            if (view13 == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById12 = view13.findViewById(R.id.e_p);
            h.f.b.l.b(findViewById12, "");
            this.f140529f = (TuxStatusView) findViewById12;
            View view14 = this.z;
            if (view14 == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById13 = view14.findViewById(R.id.e_q);
            h.f.b.l.b(findViewById13, "");
            this.f140530g = (TuxStatusView) findViewById13;
            View view15 = this.z;
            if (view15 == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById14 = view15.findViewById(R.id.fix);
            h.f.b.l.b(findViewById14, "");
            this.F = findViewById14;
            View view16 = this.z;
            if (view16 == null) {
                h.f.b.l.a("thisView");
            }
            View findViewById15 = view16.findViewById(R.id.fiw);
            h.f.b.l.b(findViewById15, "");
            this.G = findViewById15;
            View view17 = this.F;
            if (view17 == null) {
                h.f.b.l.a("viewGroupAI");
            }
            view17.setVisibility(0);
            View view18 = this.G;
            if (view18 == null) {
                h.f.b.l.a("viewGroupCollect");
            }
            view18.setVisibility(4);
            TuxStatusView tuxStatusView = this.f140529f;
            if (tuxStatusView == null) {
                h.f.b.l.a("retryViewAI");
            }
            tuxStatusView.setButtonTopMargin(com.bytedance.common.utility.n.b(dVar.f115568c, 20.0f));
            TuxStatusView tuxStatusView2 = this.f140530g;
            if (tuxStatusView2 == null) {
                h.f.b.l.a("retryViewCollect");
            }
            tuxStatusView2.setButtonTopMargin(com.bytedance.common.utility.n.b(dVar.f115568c, 20.0f));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (com.bytedance.common.utility.n.b(dVar.f115568c) / 2) - ((int) com.bytedance.common.utility.n.b(dVar.f115568c, 107.0f)));
            FrameLayout frameLayout = this.I;
            if (frameLayout == null) {
                h.f.b.l.a("contentListParentView");
            }
            frameLayout.setLayoutParams(layoutParams);
            DmtStatusView dmtStatusView = this.H;
            if (dmtStatusView == null) {
                h.f.b.l.a("mLoadingStatusViewAI");
            }
            DmtStatusView.a a2 = DmtStatusView.a.a(dVar.f115568c);
            a2.f33605g = 1;
            dmtStatusView.setBuilder(a2);
            DmtStatusView dmtStatusView2 = this.H;
            if (dmtStatusView2 == null) {
                h.f.b.l.a("mLoadingStatusViewAI");
            }
            dmtStatusView2.f();
            DmtStatusView dmtStatusView3 = this.f140531h;
            if (dmtStatusView3 == null) {
                h.f.b.l.a("mLoadingStatusViewCollect");
            }
            DmtStatusView.a a3 = DmtStatusView.a.a(dVar.f115568c);
            a3.f33605g = 1;
            dmtStatusView3.setBuilder(a3);
            DmtStatusView dmtStatusView4 = this.f140531h;
            if (dmtStatusView4 == null) {
                h.f.b.l.a("mLoadingStatusViewCollect");
            }
            dmtStatusView4.f();
            this.J = MusicService.m().a(this.w);
            RecyclerView recyclerView = this.A;
            if (recyclerView == null) {
                h.f.b.l.a("aiRecycerView");
            }
            b.a(recyclerView);
            AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f140524a;
            if (aVDmtPanelRecycleView == null) {
                h.f.b.l.a("collectionRecycerView");
            }
            b.a(aVDmtPanelRecycleView);
            View view19 = this.D;
            if (view19 == null) {
                h.f.b.l.a("volumeView");
            }
            view19.setOnClickListener(new k(dVar));
            this.f140528e = dVar.f115573h;
            i();
            View view20 = this.E;
            if (view20 == null) {
                h.f.b.l.a("findMore");
            }
            view20.setOnClickListener(new l(dVar));
            AVDmtTabLayout aVDmtTabLayout = this.f140526c;
            if (aVDmtTabLayout == null) {
                h.f.b.l.a("tablayout");
            } else {
                aVDmtTabLayout.setTabMode(0);
                com.ss.android.ugc.aweme.themechange.base.a b2 = AVDmtTabLayout.a.b(aVDmtTabLayout.getContext());
                aVDmtTabLayout.a(aVDmtTabLayout.a().a(b2));
                b2.setOnClickListener(new i(this, dVar));
                TabLayout.f a4 = aVDmtTabLayout.a(0);
                if (a4 != null) {
                    view = a4.f130751f;
                } else {
                    view = null;
                }
                com.ss.android.ugc.aweme.themechange.base.a aVar = (com.ss.android.ugc.aweme.themechange.base.a) view;
                if (aVar != null) {
                    aVar.setText(dVar.f115568c.getString(R.string.b_j));
                    aVar.setTextPaddingLR(8.0f);
                }
                com.ss.android.ugc.aweme.themechange.base.a b3 = AVDmtTabLayout.a.b(dVar.f115568c);
                aVDmtTabLayout.a(aVDmtTabLayout.a().a(b3));
                b3.setOnClickListener(new j(aVDmtTabLayout, this, dVar));
                TabLayout.f a5 = aVDmtTabLayout.a(1);
                if (a5 != null) {
                    view2 = a5.f130751f;
                } else {
                    view2 = null;
                }
                com.ss.android.ugc.aweme.themechange.base.a aVar2 = (com.ss.android.ugc.aweme.themechange.base.a) view2;
                if (aVar2 != null) {
                    aVar2.setText(dVar.f115568c.getString(R.string.ex7));
                    aVar2.setTextPaddingLR(8.0f);
                }
                AVDmtTabLayout aVDmtTabLayout2 = this.f140526c;
                if (aVDmtTabLayout2 == null) {
                    h.f.b.l.a("tablayout");
                } else {
                    AVDmtTabLayout aVDmtTabLayout3 = this.f140526c;
                    if (aVDmtTabLayout3 == null) {
                        h.f.b.l.a("tablayout");
                    } else {
                        fVar = aVDmtTabLayout3.a(0);
                    }
                    aVDmtTabLayout2.b(fVar);
                }
                ViewParent parent = b2.getParent();
                if (parent != null) {
                    ViewGroup.LayoutParams layoutParams2 = ((View) parent).getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams.leftMargin = 0;
                        marginLayoutParams.rightMargin = 0;
                        ViewParent parent2 = b2.getParent();
                        if (parent2 != null) {
                            ((View) parent2).setLayoutParams(marginLayoutParams);
                            ViewParent parent3 = b3.getParent();
                            if (parent3 != null) {
                                ViewGroup.LayoutParams layoutParams3 = ((View) parent3).getLayoutParams();
                                if (layoutParams3 != null) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                    marginLayoutParams2.leftMargin = 0;
                                    marginLayoutParams2.rightMargin = 0;
                                    ViewParent parent4 = b3.getParent();
                                    if (parent4 != null) {
                                        ((View) parent4).setLayoutParams(marginLayoutParams2);
                                    } else {
                                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.View");
                                        MethodCollector.o(536);
                                        throw nullPointerException;
                                    }
                                } else {
                                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    MethodCollector.o(536);
                                    throw nullPointerException2;
                                }
                            } else {
                                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.view.View");
                                MethodCollector.o(536);
                                throw nullPointerException3;
                            }
                        } else {
                            NullPointerException nullPointerException4 = new NullPointerException("null cannot be cast to non-null type android.view.View");
                            MethodCollector.o(536);
                            throw nullPointerException4;
                        }
                    } else {
                        NullPointerException nullPointerException5 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        MethodCollector.o(536);
                        throw nullPointerException5;
                    }
                } else {
                    NullPointerException nullPointerException6 = new NullPointerException("null cannot be cast to non-null type android.view.View");
                    MethodCollector.o(536);
                    throw nullPointerException6;
                }
            }
            IMusicService m2 = MusicService.m();
            h.f.b.l.b(m2, "");
            m2.a(new m(this));
            MethodCollector.o(536);
            return;
        }
        NullPointerException nullPointerException7 = new NullPointerException("null cannot be cast to non-null type android.content.Context");
        MethodCollector.o(536);
        throw nullPointerException7;
    }

    public static void a(String str, boolean z2) {
        String str2;
        com.ss.android.ugc.aweme.shortvideo.c cVar;
        com.ss.android.ugc.aweme.shortvideo.c cVar2 = cr.a().f125295a;
        if (cVar2 != null) {
            str2 = cVar2.getMusicId();
        } else {
            str2 = null;
        }
        if (h.f.b.l.a((Object) str2, (Object) str) && (cVar = cr.a().f125295a) != null) {
            cVar.setCollected(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T1, T2, R> implements f.a.d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140539a;

        static {
            Covode.recordClassIndex(91780);
        }

        b(g gVar) {
            this.f140539a = gVar;
        }

        @Override // f.a.d.c
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            com.ss.android.ugc.aweme.port.in.a aVar = (com.ss.android.ugc.aweme.port.in.a) obj;
            MusicModel musicModel = (MusicModel) obj2;
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(musicModel, "");
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(musicModel, "");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(musicModel.getMusicId())) {
                arrayList.add(musicModel);
            }
            List<? extends MusicModel> list = aVar.f115560a;
            if (list != null) {
                arrayList.addAll(list);
            }
            aVar.f115560a = arrayList;
            return aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(MusicModel musicModel, boolean z2) {
        h.f.b.l.d(musicModel, "");
        String musicId = musicModel.getMusicId();
        h.f.b.l.b(musicId, "");
        f.f140522a = musicId;
        com.ss.android.ugc.aweme.port.in.a.d dVar = this.f140525b;
        if (dVar == null) {
            h.f.b.l.a("params");
        }
        dVar.f115577l.a(false);
        if (!z2) {
            this.u = "-1";
        } else {
            com.ss.android.ugc.aweme.port.in.a.d dVar2 = this.f140525b;
            if (dVar2 == null) {
                h.f.b.l.a("params");
            }
            dVar2.f115578m.a(musicModel, 0, "recommend", z2);
        }
        com.ss.android.ugc.aweme.music.a aVar = this.J;
        if (aVar != null) {
            aVar.b(musicModel, 3, false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f140572a;

        static {
            Covode.recordClassIndex(91804);
        }

        u(g gVar) {
            this.f140572a = gVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (this.f140572a.s) {
                this.f140572a.s = false;
                g.c(this.f140572a).f115580b = 1.0f;
                this.f140572a.t = false;
                g.a(this.f140572a).f115577l.a(g.c(this.f140572a).f115580b);
                return;
            }
            g.c(this.f140572a).f115579a = z;
            if (z) {
                g.a(this.f140572a).f115577l.a(g.c(this.f140572a).f115580b);
            } else {
                g.a(this.f140572a).f115577l.a(0.0f);
            }
            if (!this.f140572a.t) {
                g.a(this.f140572a).f115578m.a(z);
            }
            this.f140572a.t = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(a aVar, com.ss.android.ugc.aweme.port.in.a aVar2) {
        MusicModel musicModel;
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (cVar != null) {
            musicModel = b.a.a(cVar);
        } else {
            musicModel = null;
        }
        int i2 = 0;
        if (!com.ss.android.ugc.aweme.tools.music.f.e.a(aVar.f140490a, musicModel) && musicModel != null) {
            aVar.f140490a.add(0, musicModel);
        }
        List<? extends MusicModel> list = aVar2.f115560a;
        if (list != null) {
            ArrayList<Object> arrayList = new ArrayList();
            for (T t2 : list) {
                T t3 = t2;
                ArrayList<MusicModel> arrayList2 = aVar.f140490a;
                h.f.b.l.d(arrayList2, "");
                if (t3 != null && !arrayList2.isEmpty()) {
                    MusicModel musicModel2 = arrayList2.get(0);
                    h.f.b.l.b(musicModel2, "");
                    if (h.f.b.l.a((Object) musicModel2.getMusicId(), (Object) t3.getMusicId())) {
                    }
                }
                arrayList.add(t2);
            }
            for (Object obj : arrayList) {
                aVar.f140490a.add(obj);
            }
        }
        aVar.f140492c = aVar2.f115563d;
        String str = aVar2.f115565f;
        h.f.b.l.d(str, "");
        aVar.f140491b = str;
        aVar.f140493d = aVar2.f115564e;
        List<? extends MusicModel> list2 = aVar2.f115560a;
        if (list2 != null) {
            i2 = list2.size();
        }
        aVar.f140494e = i2;
        k();
    }

    public final void a(MusicModel musicModel, boolean z2, int i2) {
        String musicId = musicModel.getMusicId();
        if (musicId != null && !this.q.contains(musicId)) {
            com.ss.android.ugc.aweme.port.in.a.d dVar = this.f140525b;
            if (dVar == null) {
                h.f.b.l.a("params");
            }
            dVar.f115578m.a(musicModel, z2, i2);
            this.q.add(musicId);
        }
    }
}
