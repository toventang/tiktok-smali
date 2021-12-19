package com.ss.android.ugc.aweme.tools.music.e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cz.a.j;
import com.ss.android.ugc.aweme.cz.a.k;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.e.c;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class b extends aa.h implements j {
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f140477a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f140478b = -1;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f140479c;

    /* renamed from: d  reason: collision with root package name */
    public k f140480d;

    /* renamed from: e  reason: collision with root package name */
    public AnimatorSet f140481e = new AnimatorSet();

    /* renamed from: f  reason: collision with root package name */
    public List<Animator> f140482f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public int f140483g = 1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f140484h;

    /* renamed from: i  reason: collision with root package name */
    public int f140485i;

    /* renamed from: j  reason: collision with root package name */
    public Map<String, Boolean> f140486j = new LinkedHashMap();

    /* renamed from: k  reason: collision with root package name */
    public Set<String> f140487k = new LinkedHashSet();

    /* renamed from: l  reason: collision with root package name */
    public List<? extends MusicModel> f140488l;

    /* renamed from: m  reason: collision with root package name */
    public j f140489m;
    private boolean o = true;

    static {
        Covode.recordClassIndex(91760);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        return i2 == 0 ? 0 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91761);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.h
    public final int a() {
        return this.f140477a - 1;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.h
    public final int b() {
        return this.f140478b - 1;
    }

    public final void g() {
        this.f140477a = -1;
        this.f140478b = -1;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.h
    public final void d() {
        if (this.f140481e.isRunning()) {
            this.f140481e.cancel();
        }
    }

    public final void f() {
        RecyclerView recyclerView = this.f140479c;
        if (recyclerView != null) {
            recyclerView.post(new c(this));
        }
    }

    public final void h() {
        RecyclerView recyclerView = this.f140479c;
        if (recyclerView != null) {
            recyclerView.f(this.f140477a);
        }
    }

    private void j() {
        RecyclerView.ViewHolder viewHolder;
        int i2 = this.f140478b;
        if (i2 > 0) {
            RecyclerView recyclerView = this.f140479c;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(i2);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof c) {
                ((c) viewHolder).a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.h
    public final void c() {
        RecyclerView.ViewHolder viewHolder;
        int i2 = this.f140478b;
        if (i2 > 0) {
            RecyclerView recyclerView = this.f140479c;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(i2);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof c) {
                ((c) viewHolder).b();
            } else {
                notifyItemChanged(this.f140478b);
            }
        }
    }

    public final MusicModel e() {
        List<? extends MusicModel> list = this.f140488l;
        if (list != null) {
            return (MusicModel) n.b((List) list, this.f140478b - 1);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        int i2;
        List<? extends MusicModel> list = this.f140488l;
        if (list != null && list.size() == 0) {
            return 9;
        }
        List<? extends MusicModel> list2 = this.f140488l;
        if (list2 != null) {
            i2 = list2.size();
        } else {
            i2 = 0;
        }
        return i2 + 1;
    }

    public final MusicModel i() {
        List<? extends MusicModel> list = this.f140488l;
        if (list != null) {
            return (MusicModel) n.b((List) list, this.f140477a - 1);
        }
        return null;
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f140499a;

        static {
            Covode.recordClassIndex(91763);
        }

        public final void run() {
            this.f140499a.f140484h = true;
            this.f140499a.f140483g = 1;
            this.f140499a.f140482f.clear();
            this.f140499a.f140481e.cancel();
            this.f140499a.f140481e.removeAllListeners();
            this.f140499a.f140481e = new AnimatorSet();
            this.f140499a.f140482f = new ArrayList();
            b bVar = this.f140499a;
            RecyclerView recyclerView = bVar.f140479c;
            RecyclerView.i layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            bVar.f140485i = ((LinearLayoutManager) layoutManager).m();
            int i2 = this.f140499a.f140485i;
            for (int i3 = 1; i3 < i2; i3++) {
                b bVar2 = this.f140499a;
                RecyclerView recyclerView2 = bVar2.f140479c;
                RecyclerView.ViewHolder f2 = recyclerView2 != null ? recyclerView2.f(i3) : null;
                int i4 = (i3 - 1) * 175;
                if (f2 instanceof c) {
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(((c) f2).f140579a, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.5f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.5f, 1.0f));
                    l.b(ofPropertyValuesHolder, "");
                    ofPropertyValuesHolder.setDuration(700L);
                    ofPropertyValuesHolder.setStartDelay((long) i4);
                    bVar2.f140482f.add(ofPropertyValuesHolder);
                }
            }
            b bVar3 = this.f140499a;
            bVar3.f140481e.playTogether(bVar3.f140482f);
            bVar3.f140481e.start();
            bVar3.f140481e.addListener(new C3713b(bVar3));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f140499a = bVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.h
    public final void a(k kVar) {
        this.f140480d = kVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.e.b$b  reason: collision with other inner class name */
    public static final class C3713b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f140497a;

        static {
            Covode.recordClassIndex(91762);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3713b(b bVar) {
            this.f140497a = bVar;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f140497a.f140483g = 3;
            this.f140497a.f140481e.end();
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f140497a.f140483g < 3) {
                this.f140497a.f140481e.start();
            }
        }

        public final void onAnimationStart(Animator animator) {
            this.f140497a.f140483g++;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.h
    public final void a(int i2) {
        this.f140477a = i2 + 1;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.h
    public final MusicModel c(int i2) {
        List<? extends MusicModel> list = this.f140488l;
        if (list != null) {
            return (MusicModel) n.b((List) list, i2);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f140479c = recyclerView;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.h
    public final void b(int i2) {
        RecyclerView.ViewHolder viewHolder;
        int i3 = this.f140477a;
        RecyclerView.ViewHolder viewHolder2 = null;
        if (i3 > 0 && i3 < getItemCount()) {
            RecyclerView recyclerView = this.f140479c;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(this.f140477a);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof c) {
                ((c) viewHolder).a(false);
            } else {
                notifyItemChanged(this.f140477a);
            }
        }
        int i4 = i2 + 1;
        this.f140477a = i4;
        if (i4 < getItemCount()) {
            RecyclerView recyclerView2 = this.f140479c;
            if (recyclerView2 != null) {
                viewHolder2 = recyclerView2.f(this.f140477a);
            }
            if (viewHolder2 instanceof c) {
                ((c) viewHolder2).a(true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        List<? extends MusicModel> list;
        MusicModel musicModel;
        String musicId;
        MusicModel musicModel2;
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof c) {
            viewHolder.getLayoutPosition();
            int adapterPosition = viewHolder.getAdapterPosition() - 1;
            List<? extends MusicModel> list2 = this.f140488l;
            if (list2 != null && !list2.isEmpty() && (list = this.f140488l) != null && (musicModel = (MusicModel) list.get(adapterPosition)) != null && (musicId = musicModel.getMusicId()) != null) {
                if (this.f140486j.get(musicId) == null || l.a((Object) this.f140486j.get(musicId), (Object) false)) {
                    this.f140486j.put(musicId, true);
                    k kVar = this.f140480d;
                    if (kVar != null) {
                        kVar.a(adapterPosition);
                    }
                }
                if (!this.f140487k.contains(musicId)) {
                    List<? extends MusicModel> list3 = this.f140488l;
                    String str = null;
                    if (!(list3 == null || (musicModel2 = (MusicModel) n.b((List) list3, adapterPosition)) == null || musicModel2.getComeFromForMod() != 1)) {
                        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("item_id", musicModel2.getMusicId());
                        l.b("94349537923", "");
                        com.ss.android.ugc.tools.f.b a3 = a2.a("channel_id", "94349537923");
                        LogPbBean logPb = musicModel2.getLogPb();
                        if (logPb != null) {
                            str = logPb.getImprId();
                        }
                        d.a("jarvis_item_show", a3.a("req_id", str).f149193a);
                    }
                    this.f140487k.add(musicId);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.h
    public final void a(int i2, boolean z) {
        c();
        this.f140478b = i2 + 1;
        if (z) {
            j();
        }
    }

    public b(List<? extends MusicModel> list, j jVar) {
        l.d(jVar, "");
        this.f140488l = list;
        this.f140489m = jVar;
    }

    @Override // com.ss.android.ugc.aweme.cz.a.j
    public final void a(View view, int i2) {
        l.d(view, "");
        j jVar = this.f140489m;
        if (jVar != null) {
            jVar.a(view, i2 - 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        MusicModel musicModel;
        boolean z;
        l.d(viewHolder, "");
        if (viewHolder instanceof c) {
            boolean z2 = false;
            if (i2 >= this.f140485i) {
                this.o = false;
            }
            c cVar = (c) viewHolder;
            List<? extends MusicModel> list = this.f140488l;
            if (list != null) {
                musicModel = (MusicModel) n.b((List) list, i2 - 1);
            } else {
                musicModel = null;
            }
            int i3 = this.f140477a;
            if (i3 == i2) {
                z = true;
            } else {
                z = false;
            }
            int i4 = this.f140478b;
            if (i3 != i4 && i4 == i2) {
                z2 = true;
            }
            cVar.a(musicModel, z, z2);
        }
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(2901);
        l.d(viewGroup, "");
        if (bVar.getItemViewType(i2) != 0) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            l.b(from, "");
            viewHolder = new c(c.a.a(from, viewGroup), bVar);
        } else {
            LayoutInflater from2 = LayoutInflater.from(viewGroup.getContext());
            l.b(from2, "");
            l.d(from2, "");
            l.d(viewGroup, "");
            View a3 = com.a.a(from2, R.layout.dn, viewGroup, false);
            l.b(a3, "");
            viewHolder = new d(a3, bVar);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(2901);
        return viewHolder;
    }
}
