package com.ss.android.ugc.aweme.effect;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.b.a;
import com.ss.android.ugc.aweme.effect.b.a.b;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.internal.f;
import com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecycleView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.widget.AVStatusView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public abstract class c extends Fragment implements b, u {

    /* renamed from: h  reason: collision with root package name */
    public static final a f88892h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f88893a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends Effect> f88894b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayoutManager f88895c;

    /* renamed from: d  reason: collision with root package name */
    public List<? extends EffectModel> f88896d = z.INSTANCE;

    /* renamed from: e  reason: collision with root package name */
    public boolean f88897e = true;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.effect.b.a f88898f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<EffectPointModel> f88899g = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private AVStatusView f88900i;

    /* renamed from: j  reason: collision with root package name */
    private HashMap f88901j;

    static {
        Covode.recordClassIndex(55916);
    }

    public abstract void a(j.d dVar, List<? extends EffectModel> list);

    public View b(int i2) {
        if (this.f88901j == null) {
            this.f88901j = new HashMap();
        }
        View view = (View) this.f88901j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f88901j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void f() {
        HashMap hashMap = this.f88901j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        f();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55917);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.u
    public final List<EffectPointModel> d() {
        return this.f88899g;
    }

    public final String a() {
        String str = this.f88893a;
        if (str == null) {
            l.a("mCategory");
        }
        return str;
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>, java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> */
    public final List<Effect> b() {
        List list = this.f88894b;
        if (list == null) {
            l.a("mEffectList");
        }
        return list;
    }

    public final LinearLayoutManager c() {
        LinearLayoutManager linearLayoutManager = this.f88895c;
        if (linearLayoutManager == null) {
            l.a("mLinearLayoutManager");
        }
        return linearLayoutManager;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.aweme.effect.b.a aVar = this.f88898f;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        a(true);
        List<? extends Effect> list = this.f88894b;
        if (list == null) {
            l.a("mEffectList");
        }
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            T t2 = t;
            String str = this.f88893a;
            if (str == null) {
                l.a("mCategory");
            }
            EffectModel a2 = i.a(i2, t2, str);
            l.b(a2, "");
            List<? extends EffectModel> list2 = this.f88896d;
            List<? extends EffectModel> g2 = n.g((Collection) list2);
            g2.add(a2);
            j.d a3 = j.a(new o(list2, g2), true);
            l.b(a3, "");
            a(a3, g2);
            AVDmtPanelRecycleView aVDmtPanelRecycleView = (AVDmtPanelRecycleView) b(R.id.djw);
            if (aVDmtPanelRecycleView != null && aVDmtPanelRecycleView.getVisibility() == 8) {
                a(false);
            }
            i2 = i3;
        }
    }

    public final void a(List<? extends EffectModel> list) {
        l.d(list, "");
        this.f88896d = list;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        e activity = getActivity();
        if (activity != null) {
            ac a2 = ae.a(activity, (ad.b) null).a(EditEffectVideoModel.class);
            l.b(a2, "");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a2;
            if (!editEffectVideoModel.b()) {
                f f2 = g.a().f();
                l.b(activity, "");
                editEffectVideoModel.a(f2.a(activity));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("effect_list");
            if (parcelableArrayList == null) {
                l.b();
            }
            this.f88894b = parcelableArrayList;
            String string = arguments.getString("effect_category");
            if (string == null) {
                l.b();
            }
            this.f88893a = string;
            this.f88897e = arguments.getBoolean("motio_toast", true);
        }
        this.f88899g.clear();
        com.ss.android.ugc.aweme.effect.b.a aVar = this.f88898f;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    private void a(boolean z) {
        if (z) {
            LinearLayout linearLayout = (LinearLayout) b(R.id.chj);
            l.b(linearLayout, "");
            linearLayout.setVisibility(0);
            AVDmtPanelRecycleView aVDmtPanelRecycleView = (AVDmtPanelRecycleView) b(R.id.djw);
            l.b(aVDmtPanelRecycleView, "");
            aVDmtPanelRecycleView.setVisibility(8);
            AVStatusView aVStatusView = this.f88900i;
            if (aVStatusView == null) {
                l.a("mStatusView");
            }
            aVStatusView.b();
            return;
        }
        AVStatusView aVStatusView2 = this.f88900i;
        if (aVStatusView2 == null) {
            l.a("mStatusView");
        }
        aVStatusView2.a();
        LinearLayout linearLayout2 = (LinearLayout) b(R.id.chj);
        l.b(linearLayout2, "");
        linearLayout2.setVisibility(8);
        AVDmtPanelRecycleView aVDmtPanelRecycleView2 = (AVDmtPanelRecycleView) b(R.id.djw);
        l.b(aVDmtPanelRecycleView2, "");
        aVDmtPanelRecycleView2.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        e activity = getActivity();
        if (activity != null) {
            ac a2 = ae.a(activity, (ad.b) null).a(EditEffectVideoModel.class);
            l.b(a2, "");
            ArrayList<EffectPointModel> arrayList = this.f88899g;
            ArrayList<EffectPointModel> g2 = ((EditEffectVideoModel) a2).a().g();
            ArrayList arrayList2 = new ArrayList();
            for (T t : g2) {
                T t2 = t;
                String str = this.f88893a;
                if (str == null) {
                    l.a("mCategory");
                }
                if (l.a((Object) str, (Object) t2.getCategory())) {
                    arrayList2.add(t);
                }
            }
            arrayList.addAll(arrayList2);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        com.ss.android.ugc.aweme.effect.b.a aVar;
        com.ss.android.ugc.aweme.effectplatform.f a2;
        g.a().w();
        if (g.a().f().c() >= 0) {
            List<? extends Effect> list = this.f88894b;
            if (list == null) {
                l.a("mEffectList");
            }
            int size = list.size();
            for (int i3 = i2 + 1; i3 < size; i3++) {
                if (!(this.f88898f == null || (a2 = a.C2148a.a()) == null)) {
                    List<? extends Effect> list2 = this.f88894b;
                    if (list2 == null) {
                        l.a("mEffectList");
                    }
                    if (a2.a((Effect) list2.get(i3))) {
                    }
                }
                if (!(i3 == -1 || (aVar = this.f88898f) == null)) {
                    List<? extends Effect> list3 = this.f88894b;
                    if (list3 == null) {
                        l.a("mEffectList");
                    }
                    aVar.a((Effect) list3.get(i3));
                    return;
                }
                return;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(0);
        this.f88895c = linearLayoutManager;
        RecyclerView recyclerView = (RecyclerView) b(R.id.djw);
        l.b(recyclerView, "");
        LinearLayoutManager linearLayoutManager2 = this.f88895c;
        if (linearLayoutManager2 == null) {
            l.a("mLinearLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager2);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.a10, viewGroup, false);
        View findViewById = a2.findViewById(R.id.ci4);
        l.b(findViewById, "");
        AVStatusView aVStatusView = (AVStatusView) findViewById;
        this.f88900i = aVStatusView;
        if (aVStatusView == null) {
            l.a("mStatusView");
        }
        AVStatusView.a a3 = AVStatusView.a.a(getContext());
        a3.f150227g = 1;
        aVStatusView.setBuilder(a3);
        return a2;
    }
}
