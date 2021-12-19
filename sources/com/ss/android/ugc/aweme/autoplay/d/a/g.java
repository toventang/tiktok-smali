package com.ss.android.ugc.aweme.autoplay.d.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.autoplay.player.video.f;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class g extends com.ss.android.ugc.aweme.autoplay.d.g {

    /* renamed from: h  reason: collision with root package name */
    public static final a f67353h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AwemeRawAd f67354a;

    /* renamed from: b  reason: collision with root package name */
    public r f67355b;

    /* renamed from: c  reason: collision with root package name */
    public String f67356c;

    /* renamed from: d  reason: collision with root package name */
    List<? extends Aweme> f67357d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f67358e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.alading.a.c f67359f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.flowfeed.utils.g f67360g;

    /* renamed from: j  reason: collision with root package name */
    private final a<Aweme> f67361j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f67362k = true;

    /* renamed from: l  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.discover.alading.a.c f67363l;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.flowfeed.a.a f67364m;
    private final f n;

    static {
        Covode.recordClassIndex(41481);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41482);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    @Override // com.ss.android.ugc.aweme.autoplay.d.g
    public final List<Aweme> a() {
        return this.f67357d;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f67366a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f67367b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f67368c;

        static {
            Covode.recordClassIndex(41484);
        }

        c(g gVar, int i2, Aweme aweme) {
            this.f67366a = gVar;
            this.f67367b = i2;
            this.f67368c = aweme;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = a();
            }
            if (!j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f67366a.f67358e).a(R.string.de8).a();
                return;
            }
            com.ss.android.ugc.aweme.discover.alading.a.c cVar = this.f67366a.f67359f;
            int i2 = this.f67367b;
            l.b(view, "");
            cVar.a(i2, view, this.f67368c, this.f67366a.f67357d);
        }
    }

    private final boolean f() {
        if (this.f67357d.size() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        if (f()) {
            return 1;
        }
        return this.f67357d.size();
    }

    static final class b extends m implements h.f.a.b<Aweme, Aweme> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f67365a = new b();

        static {
            Covode.recordClassIndex(41483);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ Aweme invoke(Aweme aweme) {
            return aweme;
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.g
    public final void a(List<? extends Aweme> list) {
        l.d(list, "");
        this.f67357d = list;
        notifyDataSetChanged();
        a<Aweme> aVar = this.f67361j;
        b bVar = b.f67365a;
        l.d(bVar, "");
        aVar.f67319a.clear();
        if (list != null) {
            int i2 = 0;
            for (T t : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                Aweme aweme = (Aweme) bVar.invoke(t);
                if (aweme != null) {
                    Map<String, p<Integer, Aweme>> map = aVar.f67319a;
                    String aid = aweme.getAid();
                    l.b(aid, "");
                    map.put(aid, new p<>(Integer.valueOf(i2), aweme));
                    aVar.b().a(aweme);
                }
                i2 = i3;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0328, code lost:
        if (r10 != null) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ca, code lost:
        if (r0 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02b4  */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r19, int r20) {
        /*
        // Method dump skipped, instructions count: 1143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autoplay.d.a.g.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    private static RecyclerView.ViewHolder a(g gVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(2205);
        l.d(viewGroup, "");
        com.ss.android.ugc.aweme.flowfeed.a.a aVar = gVar.f67364m;
        com.ss.android.ugc.aweme.flowfeed.utils.g gVar2 = gVar.f67360g;
        com.ss.android.ugc.aweme.autoplay.player.video.f fVar = gVar.n;
        l.d(viewGroup, "");
        l.d(aVar, "");
        l.d(gVar2, "");
        l.d(gVar, "");
        l.d(fVar, "");
        f fVar2 = new f(com.ss.android.ugc.aweme.search.l.m.a(viewGroup, R.layout.aur), aVar, gVar2, gVar, viewGroup, fVar);
        fVar2.f67342a = gVar.f67362k;
        fVar2.f67343b = gVar.f67363l;
        try {
            if (fVar2.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(fVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) fVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(fVar2.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = fVar2.getClass().getName();
        MethodCollector.o(2205);
        return fVar2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, com.ss.android.ugc.aweme.discover.alading.a.c cVar, com.ss.android.ugc.aweme.discover.alading.a.c cVar2, com.ss.android.ugc.aweme.flowfeed.a.a aVar, com.ss.android.ugc.aweme.flowfeed.utils.g gVar, RecyclerView recyclerView, com.ss.android.ugc.aweme.autoplay.player.video.f fVar) {
        super(recyclerView);
        l.d(context, "");
        l.d(cVar, "");
        l.d(cVar2, "");
        l.d(aVar, "");
        l.d(gVar, "");
        l.d(recyclerView, "");
        l.d(fVar, "");
        this.f67358e = context;
        this.f67363l = cVar;
        this.f67359f = cVar2;
        this.f67364m = aVar;
        this.f67360g = gVar;
        this.n = fVar;
        this.f67355b = r.a.a();
        this.f67356c = "";
        this.f67361j = new a<>(recyclerView);
        this.f67357d = new ArrayList();
    }
}
