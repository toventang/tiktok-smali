package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.graphics.Outline;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.j.b;
import com.ss.android.ugc.aweme.mediachoose.d;
import com.ss.android.ugc.aweme.mediachoose.e;
import com.ss.android.ugc.aweme.mediachoose.helper.c;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.property.as;
import com.ss.android.ugc.aweme.setting.i.a;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aw;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.f;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ae extends b implements aw.b {

    /* renamed from: b  reason: collision with root package name */
    static final int f128901b;

    /* renamed from: c  reason: collision with root package name */
    static final int f128902c;

    /* renamed from: d  reason: collision with root package name */
    aw f128903d;

    /* renamed from: e  reason: collision with root package name */
    c f128904e;

    /* renamed from: f  reason: collision with root package name */
    View f128905f;

    /* renamed from: g  reason: collision with root package name */
    public aw.b f128906g;

    /* renamed from: h  reason: collision with root package name */
    boolean f128907h;

    /* renamed from: i  reason: collision with root package name */
    boolean f128908i;

    /* renamed from: j  reason: collision with root package name */
    int f128909j;

    /* renamed from: k  reason: collision with root package name */
    int f128910k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f128911l;

    /* renamed from: m  reason: collision with root package name */
    boolean f128912m;
    e n = new af(this);
    private RecyclerView o;
    private aw.d p = new ag(this);

    @Override // com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    static {
        int i2;
        Covode.recordClassIndex(84589);
        int i3 = 300;
        if (a.a() == 0) {
            i2 = 300;
        } else {
            i2 = 600;
        }
        f128901b = i2;
        if (a.a() != 0) {
            i3 = 600;
        }
        f128902c = i3;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f128905f = com.a.a(layoutInflater, R.layout.ags, viewGroup, false);
        Bundle arguments = getArguments();
        int i2 = -1;
        if (arguments != null) {
            i2 = arguments.getInt("key_support_flag", -1);
            this.f128912m = arguments.getBoolean("extra_show_gif", false);
        }
        RecyclerView recyclerView = (RecyclerView) this.f128905f.findViewById(R.id.bm9);
        this.o = recyclerView;
        getActivity();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        aw awVar = new aw(getActivity(), this);
        this.f128903d = awVar;
        awVar.f129022a = this.p;
        if (c.f109414a == null) {
            c.a(i.f115645a, as.a());
        }
        this.f128904e = c.f109414a;
        this.o.setAdapter(this.f128903d);
        this.f128905f.post(new ai(this));
        if (this.f128904e != null) {
            b.a.f132249a.step(OpenAlbumPanelPerformanceMonitor.f132344a, "loadMediaModels");
            q.a("MvChooseAlbumFragment", "loadData, supportFlag = ".concat(String.valueOf(i2)));
            if (!((i2 & 1) == 0 && (i2 & 2) == 0)) {
                this.f128907h = true;
                this.f128909j = 0;
                if (this.f128912m) {
                    c.a(1, 30, 0, this.n, d.a.f109380a);
                } else {
                    c.a(3, 30, 0, this.n, d.a.f109380a);
                }
            }
            if ((i2 & 4) != 0) {
                this.f128908i = true;
                this.f128910k = 0;
                c.a(4, 30, 0, this.n, d.a.f109380a);
            }
        } else {
            q.a("MvChooseAlbumFragment", "loadData, mMediaManager is null");
        }
        ah ahVar = new ah(this);
        l.d(this, "");
        l.d(ahVar, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            l.b();
        }
        f.a.b.b unused = ((BaseJediViewModel) t.a(activity).a(ChooseMediaViewModel.class)).a(this, j.f129141a, new ah(), new f.a(ahVar));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f128905f.setOutlineProvider(new ViewOutlineProvider() {
                /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ae.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(84590);
                }

                public final void getOutline(View view, Outline outline) {
                    outline.setRect(0, 0, 0, 0);
                }
            });
            this.f128905f.setElevation(r.a(requireContext(), 17.0f));
        }
        return this.f128905f;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aw.b
    public final void a(aw.a aVar, boolean z, int i2, boolean z2) {
        aw.b bVar = this.f128906g;
        if (bVar != null) {
            bVar.a(aVar, z, i2, z2);
        }
    }
}
