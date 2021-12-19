package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.ss.android.ugc.aweme.j.b;
import com.ss.android.ugc.aweme.property.dp;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e;
import com.ss.android.ugc.aweme.shortvideo.util.be;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public abstract class a extends b {

    /* renamed from: b  reason: collision with root package name */
    public int f128882b = 4;

    /* renamed from: c  reason: collision with root package name */
    protected MvImageChooseAdapter f128883c;

    /* renamed from: d  reason: collision with root package name */
    protected RecyclerView f128884d;

    /* renamed from: e  reason: collision with root package name */
    public MvImageChooseAdapter.c f128885e;

    /* renamed from: f  reason: collision with root package name */
    protected View f128886f;

    /* renamed from: g  reason: collision with root package name */
    protected TextView f128887g;

    /* renamed from: h  reason: collision with root package name */
    protected DmtLoadingLayout f128888h;

    /* renamed from: i  reason: collision with root package name */
    protected int f128889i = e.a();

    /* renamed from: j  reason: collision with root package name */
    protected boolean f128890j;

    /* renamed from: k  reason: collision with root package name */
    public int f128891k;

    /* renamed from: l  reason: collision with root package name */
    protected List<String> f128892l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    protected Long f128893m = 0L;
    public boolean n = false;
    public int o = -1;
    public n.a p;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;

    static {
        Covode.recordClassIndex(84580);
    }

    public abstract void a(List<MvImageChooseAdapter.MyMediaModel> list, boolean z);

    public void a(boolean z) {
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.s = true;
    }

    public final void d() {
        MvImageChooseAdapter mvImageChooseAdapter = this.f128883c;
        if (mvImageChooseAdapter != null) {
            mvImageChooseAdapter.d();
        }
    }

    public final void e() {
        MvImageChooseAdapter mvImageChooseAdapter = this.f128883c;
        if (mvImageChooseAdapter != null) {
            mvImageChooseAdapter.e();
        }
    }

    public final int b() {
        MvImageChooseAdapter mvImageChooseAdapter = this.f128883c;
        if (mvImageChooseAdapter != null) {
            return mvImageChooseAdapter.f128849e;
        }
        return 0;
    }

    public final void f() {
        n nVar;
        RecyclerView recyclerView = this.f128884d;
        if ((recyclerView instanceof FastScrollRecyclerView) && (nVar = ((FastScrollRecyclerView) recyclerView).O) != null && n.a(nVar.f129157e) && nVar.f129157e != null) {
            nVar.getHandler().removeCallbacks(nVar.f129165m);
            n.a(nVar.f129158f);
            nVar.f129157e.setVisibility(8);
        }
    }

    public final String g() {
        String a2 = e.a(this.f128886f.getContext());
        int i2 = this.f128891k;
        if (i2 == 1 || i2 == 10) {
            return com.a.a(getString(R.string.b25), new Object[]{Integer.valueOf(this.f128889i)});
        } else if (i2 == 16) {
            return com.a.a(getString(R.string.b25), new Object[]{10});
        } else if (f.f125945d) {
            return e.a(this.f128886f.getContext());
        } else {
            if (f.f125945d) {
                return f.a(this.f128886f.getContext());
            }
            return a2;
        }
    }

    public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f128883c;
        if (mvImageChooseAdapter != null) {
            mvImageChooseAdapter.a(myMediaModel);
        }
    }

    public final void a(List<String> list) {
        this.f128890j = true;
        this.f128892l.addAll(list);
    }

    public final void b(int i2) {
        this.f128889i = i2;
        MvImageChooseAdapter mvImageChooseAdapter = this.f128883c;
        if (mvImageChooseAdapter != null) {
            mvImageChooseAdapter.f128845a = i2;
        }
    }

    public final void c(int i2) {
        RecyclerView.i layoutManager;
        RecyclerView recyclerView = this.f128884d;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && layoutManager.c(i2) == null) {
            layoutManager.e(i2);
        }
    }

    public final View d(int i2) {
        RecyclerView.i layoutManager;
        RecyclerView recyclerView = this.f128884d;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return null;
        }
        return layoutManager.c(i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.q = true;
        if (this.r && !this.s) {
            c();
        }
    }

    public final int c(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f128883c;
        if (mvImageChooseAdapter != null) {
            for (int i2 = 0; i2 < mvImageChooseAdapter.f128857m.size(); i2++) {
                if (TextUtils.equals(mvImageChooseAdapter.f128857m.get(i2).f109389a, myMediaModel.f109389a)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.r = z;
        if (this.q && !this.s) {
            c();
        }
        if (this.s) {
            MvImageChooseAdapter mvImageChooseAdapter = this.f128883c;
            boolean z2 = !z;
            mvImageChooseAdapter.r = true;
            if (dp.a()) {
                for (int i2 = 0; i2 < mvImageChooseAdapter.f128856l.getChildCount(); i2++) {
                    MvImageChooseAdapter.e eVar = (MvImageChooseAdapter.e) mvImageChooseAdapter.f128856l.a(mvImageChooseAdapter.f128856l.getChildAt(i2));
                    if (!mvImageChooseAdapter.p.contains(eVar)) {
                        if (z2) {
                            eVar.f128869a.setController((com.facebook.drawee.h.a) null);
                        } else {
                            mvImageChooseAdapter.a(eVar, -1);
                        }
                    }
                }
            }
        }
    }

    public final void b(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f128883c;
        if (mvImageChooseAdapter == null) {
            return;
        }
        if (myMediaModel.v >= 0) {
            q.d("MvImageChooseAdapter handleMediaSelected unSelect originIndex " + myMediaModel.u + " selectIndex " + myMediaModel.v + " stack " + be.a());
            int i2 = myMediaModel.v;
            int i3 = -1;
            myMediaModel.v = -1;
            for (int i4 = 0; i4 < mvImageChooseAdapter.f128848d.size(); i4++) {
                MvImageChooseAdapter.MyMediaModel myMediaModel2 = mvImageChooseAdapter.f128848d.get(i4);
                if (TextUtils.equals(myMediaModel2.f109389a, myMediaModel.f109389a)) {
                    i3 = i4;
                }
                if (myMediaModel2.v > i2) {
                    myMediaModel2.v--;
                }
            }
            if (i3 >= 0) {
                mvImageChooseAdapter.f128848d.remove(i3);
            }
            mvImageChooseAdapter.notifyItemChanged(myMediaModel.u);
            mvImageChooseAdapter.e();
            if (mvImageChooseAdapter.f128851g != null) {
                mvImageChooseAdapter.f128851g.a(mvImageChooseAdapter.f128848d, MvImageChooseAdapter.b.PREVIEW, myMediaModel);
                mvImageChooseAdapter.f128851g.a(myMediaModel, false);
                return;
            }
            return;
        }
        q.d("MvImageChooseAdapter handleMediaSelected select originIndex " + myMediaModel.u + " selectIndex " + myMediaModel.v);
        i.a(myMediaModel.f109390b, new bi(mvImageChooseAdapter, myMediaModel));
    }

    @Override // com.ss.android.ugc.aweme.j.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.f128893m = Long.valueOf(System.currentTimeMillis());
        super.onViewCreated(view, bundle);
    }

    public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel, boolean z) {
        MvImageChooseAdapter mvImageChooseAdapter = this.f128883c;
        if (mvImageChooseAdapter == null) {
            return;
        }
        if (!z) {
            mvImageChooseAdapter.a(myMediaModel);
        } else if (myMediaModel != null) {
            if (!mvImageChooseAdapter.f128848d.contains(myMediaModel)) {
                mvImageChooseAdapter.f128848d.add(myMediaModel);
            }
            mvImageChooseAdapter.e();
        }
    }
}
