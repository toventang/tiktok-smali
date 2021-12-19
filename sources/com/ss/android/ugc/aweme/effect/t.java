package com.ss.android.ugc.aweme.effect;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.b.a;
import com.ss.android.ugc.aweme.effect.z;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.s;
import com.zhiliaoapp.musically.R;
import dmt.av.video.g;
import dmt.av.video.p;
import h.a.n;
import h.f.b.l;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class t extends c {
    public static final a n = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    public z f88974i;

    /* renamed from: j  reason: collision with root package name */
    public EditEffectVideoModel f88975j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.effect.c.c f88976k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f88977l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.effect.d.a f88978m;
    private boolean o;
    private final h p = i.a(new LinkedHashSet());
    private final h q = i.a(new ArrayList());
    private final h r = i.a(new ArrayList());
    private HashMap s;

    static {
        Covode.recordClassIndex(55955);
    }

    private final Set<Effect> h() {
        return (Set) this.p.getValue();
    }

    @Override // com.ss.android.ugc.aweme.effect.c
    public final View b(int i2) {
        if (this.s == null) {
            this.s = new HashMap();
        }
        View view = (View) this.s.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.s.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.effect.c
    public final void f() {
        HashMap hashMap = this.s;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.c, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        f();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55956);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static t a(List<? extends Effect> list, String str, boolean z) {
            l.d(list, "");
            l.d(str, "");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("effect_list", (ArrayList) n.g((Collection) list));
            bundle.putString("effect_category", str);
            bundle.putBoolean("motio_toast", z);
            t tVar = new t();
            tVar.setArguments(bundle);
            return tVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.u
    public final void g() {
        com.ss.android.ugc.aweme.effect.c.c cVar = this.f88976k;
        if (cVar == null) {
            l.a("motionEffectControll");
        }
        for (Map.Entry<Integer, com.ss.android.ugc.aweme.effect.c.b> entry : cVar.f88934c.entrySet()) {
            entry.getValue().f88919c = false;
        }
    }

    public static final class d extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f88981a;

        static {
            Covode.recordClassIndex(55959);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(t tVar) {
            this.f88981a = tVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            boolean z;
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            t tVar = this.f88981a;
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            tVar.f88977l = z;
            t tVar2 = this.f88981a;
            tVar2.a(tVar2.f88977l);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            t tVar = this.f88981a;
            tVar.a(tVar.f88977l);
        }
    }

    public static final /* synthetic */ EditEffectVideoModel a(t tVar) {
        EditEffectVideoModel editEffectVideoModel = tVar.f88975j;
        if (editEffectVideoModel == null) {
            l.a("mViewModel");
        }
        return editEffectVideoModel;
    }

    public static final /* synthetic */ z b(t tVar) {
        z zVar = tVar.f88974i;
        if (zVar == null) {
            l.a("mEffectAdapter");
        }
        return zVar;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.effect.c.c c(t tVar) {
        com.ss.android.ugc.aweme.effect.c.c cVar = tVar.f88976k;
        if (cVar == null) {
            l.a("motionEffectControll");
        }
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.effect.b.a.b
    public final void a(Effect effect) {
        l.d(effect, "");
        int indexOf = b().indexOf(effect);
        if (indexOf >= 0) {
            z zVar = this.f88974i;
            if (zVar == null) {
                l.a("mEffectAdapter");
            }
            zVar.a(indexOf, 8);
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.b.a.b
    public final void c(Effect effect) {
        int indexOf;
        if (effect != null && (indexOf = b().indexOf(effect)) >= 0) {
            z zVar = this.f88974i;
            if (zVar == null) {
                l.a("mEffectAdapter");
            }
            zVar.a(indexOf, 32);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!this.o) {
            return;
        }
        if (z) {
            a(true);
        } else {
            a(false);
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f88979a;

        static {
            Covode.recordClassIndex(55957);
        }

        b(t tVar) {
            this.f88979a = tVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            p pVar = (p) obj;
            if (pVar == null) {
                return;
            }
            if (pVar.f156931g == 3) {
                this.f88979a.f88899g.clear();
                AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f88979a.b(R.id.eup);
                l.b(aVDmtHorizontalImageTextLayout, "");
                aVDmtHorizontalImageTextLayout.setVisibility(8);
            } else if (pVar.f156931g == 4) {
                for (int length = pVar.f156925a.length - 1; length >= 0; length--) {
                    if (this.f88979a.f88899g.isEmpty()) {
                        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout2 = (AVDmtHorizontalImageTextLayout) this.f88979a.b(R.id.eup);
                        l.b(aVDmtHorizontalImageTextLayout2, "");
                        aVDmtHorizontalImageTextLayout2.setVisibility(8);
                        return;
                    }
                    int i2 = pVar.f156925a[length];
                    int size = this.f88979a.f88899g.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        EffectPointModel effectPointModel = this.f88979a.f88899g.get(size);
                        l.b(effectPointModel, "");
                        if (effectPointModel.getIndex() == i2) {
                            this.f88979a.f88899g.remove(size);
                            break;
                        }
                        size--;
                    }
                }
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f88982a;

        static {
            Covode.recordClassIndex(55960);
        }

        e(t tVar) {
            this.f88982a = tVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f88982a.f88899g.isEmpty()) {
                EffectPointModel effectPointModel = (EffectPointModel) n.i((List) this.f88982a.f88899g);
                g<p> h2 = t.a(this.f88982a).a().h();
                int index = effectPointModel.getIndex();
                String uuid = effectPointModel.getUuid();
                p pVar = new p();
                pVar.f156931g = 2;
                pVar.f156925a = new int[]{index};
                pVar.f156926b = new String[]{uuid};
                h2.setValue(pVar);
                this.f88982a.f88899g.remove(this.f88982a.f88899g.size() - 1);
                if (this.f88982a.f88899g.isEmpty()) {
                    AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f88982a.b(R.id.eup);
                    l.b(aVDmtHorizontalImageTextLayout, "");
                    aVDmtHorizontalImageTextLayout.setVisibility(8);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.b.a.b
    public final void b(Effect effect) {
        l.d(effect, "");
        com.ss.android.ugc.aweme.port.in.g.a().w();
        int indexOf = b().indexOf(effect);
        if (indexOf >= 0) {
            z zVar = this.f88974i;
            if (zVar == null) {
                l.a("mEffectAdapter");
            }
            zVar.a(indexOf, 16);
            com.ss.android.ugc.aweme.effect.d.a aVar = this.f88978m;
            if (aVar == null) {
                l.a("mTouchStateHolder");
            }
            if (indexOf == aVar.f88940b && aVar.f88939a == 0 && !h().contains(effect)) {
                com.ss.android.ugc.aweme.effect.d.a aVar2 = this.f88978m;
                if (aVar2 == null) {
                    l.a("mTouchStateHolder");
                }
                Integer valueOf = Integer.valueOf(aVar2.f88939a);
                com.ss.android.ugc.aweme.effect.d.a aVar3 = this.f88978m;
                if (aVar3 == null) {
                    l.a("mTouchStateHolder");
                }
                a(valueOf, aVar3.f88941c);
                if (this.f88978m == null) {
                    l.a("mTouchStateHolder");
                }
                h().add(effect);
                com.ss.android.ugc.aweme.port.in.g.a().w();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.c, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        int i2;
        super.onActivityCreated(bundle);
        this.o = true;
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) b(R.id.eup);
            l.b(aVDmtHorizontalImageTextLayout, "");
            if (this.f88899g.isEmpty()) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            aVDmtHorizontalImageTextLayout.setVisibility(i2);
            ac a2 = ae.a(activity, (ad.b) null).a(EditEffectVideoModel.class);
            l.b(a2, "");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a2;
            this.f88975j = editEffectVideoModel;
            if (editEffectVideoModel == null) {
                l.a("mViewModel");
            }
            editEffectVideoModel.a().h().observe(this, new b(this));
        }
    }

    public final void a(boolean z) {
        RecyclerView.ViewHolder viewHolder;
        int k2 = c().k();
        int m2 = c().m();
        if (k2 <= m2) {
            while (true) {
                RecyclerView recyclerView = (RecyclerView) b(R.id.djw);
                if (recyclerView != null) {
                    viewHolder = recyclerView.f(k2);
                } else {
                    viewHolder = null;
                }
                if (viewHolder instanceof z.b) {
                    ((z.b) viewHolder).a(z);
                }
                if (k2 != m2) {
                    k2++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.c
    public final void a(j.d dVar, List<? extends EffectModel> list) {
        l.d(dVar, "");
        l.d(list, "");
        z zVar = this.f88974i;
        if (zVar == null) {
            l.a("mEffectAdapter");
        }
        dVar.a(zVar);
        a(list);
        z zVar2 = this.f88974i;
        if (zVar2 == null) {
            l.a("mEffectAdapter");
        }
        zVar2.a(this.f88896d);
    }

    public final void a(Integer num, EffectModel effectModel) {
        if (num != null) {
            num.intValue();
            if (effectModel != null) {
                EditEffectVideoModel editEffectVideoModel = this.f88975j;
                if (editEffectVideoModel == null) {
                    l.a("mViewModel");
                }
                editEffectVideoModel.g().setValue(VEEffectSelectOp.selectFilter(num.intValue(), effectModel));
                EditEffectVideoModel editEffectVideoModel2 = this.f88975j;
                if (editEffectVideoModel2 == null) {
                    l.a("mViewModel");
                }
                ArrayList<EffectPointModel> g2 = editEffectVideoModel2.a().g();
                if (!g2.isEmpty()) {
                    this.f88899g.add(g2.get(g2.size() - 1));
                } else {
                    com.ss.android.ugc.aweme.port.in.g.a().I().a("add effect failed");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.c, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f88978m = new com.ss.android.ugc.aweme.effect.d.a();
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            l.b();
        }
        l.b(activity, "");
        this.f88976k = new com.ss.android.ugc.aweme.effect.c.c(activity);
        z zVar = new z((RecyclerView) b(R.id.djw), this.f88898f);
        this.f88974i = zVar;
        zVar.a(this.f88896d);
        z zVar2 = this.f88974i;
        if (zVar2 == null) {
            l.a("mEffectAdapter");
        }
        zVar2.f89005a = new c(this);
        RecyclerView recyclerView = (RecyclerView) b(R.id.djw);
        l.b(recyclerView, "");
        z zVar3 = this.f88974i;
        if (zVar3 == null) {
            l.a("mEffectAdapter");
        }
        recyclerView.setAdapter(zVar3);
        ((RecyclerView) b(R.id.djw)).a(new d(this));
        if (l.a((Object) "trans", (Object) a())) {
            AVDmtTextView aVDmtTextView = (AVDmtTextView) b(R.id.eut);
            l.b(aVDmtTextView, "");
            aVDmtTextView.setText(getString(R.string.bm1));
        } else if (l.a((Object) "motion", (Object) a())) {
            AVDmtTextView aVDmtTextView2 = (AVDmtTextView) b(R.id.eut);
            l.b(aVDmtTextView2, "");
            aVDmtTextView2.setText(getString(R.string.d63));
        }
        s.a(b(R.id.eup), 0.5f);
        ((AVDmtHorizontalImageTextLayout) b(R.id.eup)).setOnClickListener(new e(this));
        e();
    }

    static final class c implements z.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f88980a;

        static {
            Covode.recordClassIndex(55958);
        }

        c(t tVar) {
            this.f88980a = tVar;
        }

        @Override // com.ss.android.ugc.aweme.effect.z.a
        public final void a(int i2, int i3, EffectModel effectModel) {
            f a2;
            f a3;
            String str;
            f a4;
            EditEffectVideoModel a5 = t.a(this.f88980a);
            ArrayList<EffectPointModel> g2 = a5.a().g();
            Effect effect = this.f88980a.b().get(i3);
            if (5 == i2) {
                this.f88980a.a(i3);
                if (this.f88980a.f88898f == null || (a4 = a.C2148a.a()) == null || !a4.a(effect)) {
                    com.ss.android.ugc.aweme.effect.b.a aVar = this.f88980a.f88898f;
                    if (aVar != null) {
                        aVar.a(effect);
                    }
                } else {
                    a5.g().setValue(VEEffectSelectOp.selectTrans(effectModel));
                    AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f88980a.b(R.id.eup);
                    l.b(aVDmtHorizontalImageTextLayout, "");
                    aVDmtHorizontalImageTextLayout.setVisibility(0);
                    if (!g2.isEmpty()) {
                        this.f88980a.f88899g.add(g2.get(g2.size() - 1));
                    } else {
                        com.ss.android.ugc.aweme.port.in.g.a().I().a("add effect fail");
                    }
                    t.b(this.f88980a).a(i3, 16);
                }
            } else if (i2 == 0) {
                if (this.f88980a.f88897e) {
                    com.ss.android.ugc.aweme.effect.c.c c2 = t.c(this.f88980a);
                    if (c2.f88934c.get(Integer.valueOf(i3)) == null) {
                        MessageCenter.addListener(c2);
                        c2.f88934c.put(Integer.valueOf(i3), new com.ss.android.ugc.aweme.effect.c.b(true));
                        c2.f88935d = i3;
                    } else {
                        for (Map.Entry<Integer, com.ss.android.ugc.aweme.effect.c.b> entry : c2.f88934c.entrySet()) {
                            if (entry.getKey().intValue() == i3 && !entry.getValue().f88918b) {
                                MessageCenter.addListener(c2);
                                entry.getValue().f88918b = true;
                                entry.getValue().f88917a = 0;
                                c2.f88935d = i3;
                            }
                        }
                    }
                }
                this.f88980a.a(i3);
                if (this.f88980a.f88898f == null || (a3 = a.C2148a.a()) == null || !a3.a(effect)) {
                    com.ss.android.ugc.aweme.effect.b.a aVar2 = this.f88980a.f88898f;
                    if (aVar2 != null) {
                        aVar2.a(effect);
                    }
                } else {
                    if (TextUtils.isEmpty(effectModel.resDir)) {
                        ap I = com.ss.android.ugc.aweme.port.in.g.a().I();
                        StringBuilder sb = new StringBuilder("applyFilter_resdir_null:");
                        if (effectModel.key != null) {
                            str = effectModel.key;
                        } else {
                            str = "";
                        }
                        I.b(sb.append(str).toString());
                    }
                    this.f88980a.a(Integer.valueOf(i2), effectModel);
                    t.b(this.f88980a).a(i3, 16);
                }
            } else if (1 == i2) {
                if (this.f88980a.f88897e) {
                    t.c(this.f88980a).a(i3);
                }
                if (!(this.f88980a.f88898f == null || (a2 = a.C2148a.a()) == null || !a2.a(effect))) {
                    a5.g().setValue(VEEffectSelectOp.selectFilter(i2, effectModel));
                    AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout2 = (AVDmtHorizontalImageTextLayout) this.f88980a.b(R.id.eup);
                    l.b(aVDmtHorizontalImageTextLayout2, "");
                    aVDmtHorizontalImageTextLayout2.setVisibility(0);
                }
            }
            com.ss.android.ugc.aweme.effect.d.a aVar3 = this.f88980a.f88978m;
            if (aVar3 == null) {
                l.a("mTouchStateHolder");
            }
            l.b(effectModel, "");
            l.d(effectModel, "");
            aVar3.f88939a = i2;
            aVar3.f88940b = i3;
            aVar3.f88941c = effectModel;
        }
    }
}
