package com.ss.android.ugc.aweme.effect;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.b.a;
import com.ss.android.ugc.aweme.effect.bm;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import dmt.av.video.o;
import dmt.av.video.p;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public final class w extends c {

    /* renamed from: k  reason: collision with root package name */
    public static final a f88986k = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    public EditEffectVideoModel f88987i;

    /* renamed from: j  reason: collision with root package name */
    public bm f88988j;

    /* renamed from: l  reason: collision with root package name */
    private HashMap f88989l;

    static {
        Covode.recordClassIndex(55967);
    }

    @Override // com.ss.android.ugc.aweme.effect.c
    public final View b(int i2) {
        if (this.f88989l == null) {
            this.f88989l = new HashMap();
        }
        View view = (View) this.f88989l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f88989l.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.effect.c
    public final void f() {
        HashMap hashMap = this.f88989l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.u
    public final void g() {
    }

    @Override // com.ss.android.ugc.aweme.effect.c, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        f();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55968);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static w a(List<? extends Effect> list, String str) {
            l.d(list, "");
            l.d(str, "");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("effect_list", (ArrayList) n.g((Collection) list));
            bundle.putString("effect_category", str);
            w wVar = new w();
            wVar.setArguments(bundle);
            return wVar;
        }
    }

    public static final /* synthetic */ EditEffectVideoModel a(w wVar) {
        EditEffectVideoModel editEffectVideoModel = wVar.f88987i;
        if (editEffectVideoModel == null) {
            l.a("mViewModel");
        }
        return editEffectVideoModel;
    }

    public static final /* synthetic */ bm b(w wVar) {
        bm bmVar = wVar.f88988j;
        if (bmVar == null) {
            l.a("mEffectAdapter");
        }
        return bmVar;
    }

    @Override // com.ss.android.ugc.aweme.effect.b.a.b
    public final void a(Effect effect) {
        l.d(effect, "");
        int indexOf = b().indexOf(effect);
        if (indexOf >= 0) {
            bm bmVar = this.f88988j;
            if (bmVar == null) {
                l.a("mEffectAdapter");
            }
            bmVar.a(indexOf, 8);
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.b.a.b
    public final void b(Effect effect) {
        l.d(effect, "");
        int indexOf = b().indexOf(effect);
        if (indexOf >= 0) {
            bm bmVar = this.f88988j;
            if (bmVar == null) {
                l.a("mEffectAdapter");
            }
            bmVar.a(indexOf, 16);
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.b.a.b
    public final void c(Effect effect) {
        int indexOf;
        if (effect != null && (indexOf = b().indexOf(effect)) >= 0) {
            bm bmVar = this.f88988j;
            if (bmVar == null) {
                l.a("mEffectAdapter");
            }
            bmVar.a(indexOf, 32);
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f88991a;

        static {
            Covode.recordClassIndex(55970);
        }

        c(w wVar) {
            this.f88991a = wVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f2 = (Float) obj;
            if (f2 == null || f2.floatValue() <= 0.0f) {
                AVDmtTextView aVDmtTextView = (AVDmtTextView) this.f88991a.b(R.id.eut);
                l.b(aVDmtTextView, "");
                aVDmtTextView.setText(this.f88991a.getString(R.string.yl));
                return;
            }
            String a2 = com.a.a(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{f2}, 1));
            l.b(a2, "");
            AVDmtTextView aVDmtTextView2 = (AVDmtTextView) this.f88991a.b(R.id.eut);
            l.b(aVDmtTextView2, "");
            aVDmtTextView2.setText(this.f88991a.getString(R.string.bl5, a2));
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.c, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        e activity = getActivity();
        if (activity != null) {
            ac a2 = ae.a(activity, (ad.b) null).a(EditEffectVideoModel.class);
            l.b(a2, "");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a2;
            this.f88987i = editEffectVideoModel;
            if (editEffectVideoModel == null) {
                l.a("mViewModel");
            }
            editEffectVideoModel.a().h().observe(this, new b(this));
            EditEffectVideoModel editEffectVideoModel2 = this.f88987i;
            if (editEffectVideoModel2 == null) {
                l.a("mViewModel");
            }
            editEffectVideoModel2.e().observe(this, new c(this));
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f88990a;

        static {
            Covode.recordClassIndex(55969);
        }

        b(w wVar) {
            this.f88990a = wVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            p pVar = (p) obj;
            if (pVar == null) {
                return;
            }
            if (pVar.f156931g == 3) {
                this.f88990a.f88899g.clear();
                AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f88990a.b(R.id.eup);
                l.b(aVDmtHorizontalImageTextLayout, "");
                aVDmtHorizontalImageTextLayout.setVisibility(8);
            } else if (pVar != null) {
                if (pVar.f156931g == 4) {
                    for (int length = pVar.f156925a.length - 1; length >= 0 && !this.f88990a.f88899g.isEmpty(); length--) {
                        EffectPointModel effectPointModel = this.f88990a.f88899g.get(0);
                        l.b(effectPointModel, "");
                        if (effectPointModel.getIndex() == pVar.f156925a[length]) {
                            w.b(this.f88990a).a((EffectPointModel) null);
                            EffectPointModel remove = this.f88990a.f88899g.remove(0);
                            l.b(remove, "");
                            EffectPointModel effectPointModel2 = remove;
                            w.a(this.f88990a).a().h().setValue(p.a(effectPointModel2.getIndex(), effectPointModel2.getUuid()));
                            return;
                        }
                    }
                } else if (pVar.f156931g == 9) {
                    w.b(this.f88990a).a((EffectPointModel) null);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.c
    public final void a(j.d dVar, List<? extends EffectModel> list) {
        l.d(dVar, "");
        l.d(list, "");
        bm bmVar = this.f88988j;
        if (bmVar == null) {
            l.a("mEffectAdapter");
        }
        dVar.a(bmVar);
        a(list);
        bm bmVar2 = this.f88988j;
        if (bmVar2 == null) {
            l.a("mEffectAdapter");
        }
        bmVar2.a(this.f88896d);
        bm bmVar3 = this.f88988j;
        if (bmVar3 == null) {
            l.a("mEffectAdapter");
        }
        if ((!bmVar3.f88774c.isEmpty()) && (!this.f88899g.isEmpty())) {
            bm bmVar4 = this.f88988j;
            if (bmVar4 == null) {
                l.a("mEffectAdapter");
            }
            bmVar4.a(this.f88899g.get(0));
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.c, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        AVDmtTextView aVDmtTextView = (AVDmtTextView) b(R.id.eut);
        l.b(aVDmtTextView, "");
        aVDmtTextView.setText(getString(R.string.yl));
        bm bmVar = new bm((RecyclerView) b(R.id.djw), this.f88898f);
        this.f88988j = bmVar;
        bmVar.a(this.f88896d);
        bm bmVar2 = this.f88988j;
        if (bmVar2 == null) {
            l.a("mEffectAdapter");
        }
        if ((!bmVar2.f88774c.isEmpty()) && (!this.f88899g.isEmpty())) {
            bm bmVar3 = this.f88988j;
            if (bmVar3 == null) {
                l.a("mEffectAdapter");
            }
            bmVar3.a(this.f88899g.get(0));
        }
        bm bmVar4 = this.f88988j;
        if (bmVar4 == null) {
            l.a("mEffectAdapter");
        }
        bmVar4.f88876a = new d(this);
        RecyclerView recyclerView = (RecyclerView) b(R.id.djw);
        l.b(recyclerView, "");
        bm bmVar5 = this.f88988j;
        if (bmVar5 == null) {
            l.a("mEffectAdapter");
        }
        recyclerView.setAdapter(bmVar5);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) b(R.id.eup);
        l.b(aVDmtHorizontalImageTextLayout, "");
        aVDmtHorizontalImageTextLayout.setVisibility(8);
        e();
    }

    static final class d implements bm.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f88992a;

        static {
            Covode.recordClassIndex(55971);
        }

        d(w wVar) {
            this.f88992a = wVar;
        }

        @Override // com.ss.android.ugc.aweme.effect.bm.a
        public final void a(EffectModel effectModel, int i2, int i3) {
            f a2;
            EffectPointModel remove;
            f a3;
            EditEffectVideoModel a4 = w.a(this.f88992a);
            Effect effect = this.f88992a.b().get(i3);
            if (i2 != 2) {
                this.f88992a.a(i3);
                if (this.f88992a.f88898f == null || (a2 = a.C2148a.a()) == null || !a2.a(effect)) {
                    com.ss.android.ugc.aweme.effect.b.a aVar = this.f88992a.f88898f;
                    if (aVar != null) {
                        aVar.a(effect);
                        return;
                    }
                    return;
                }
                t<VEEffectSelectOp> g2 = a4.g();
                if (this.f88992a.f88899g.isEmpty()) {
                    remove = null;
                } else {
                    remove = this.f88992a.f88899g.remove(0);
                }
                g2.setValue(VEEffectSelectOp.selectSticker(effectModel, remove));
                t<o> h2 = a4.h();
                String str = effectModel.hint;
                o oVar = new o((byte) 0);
                if (str == null) {
                    str = "";
                }
                l.d(str, "");
                oVar.f156922a = str;
                oVar.f156923b = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
                h2.setValue(oVar);
                AVDmtTextView aVDmtTextView = (AVDmtTextView) this.f88992a.b(R.id.eut);
                l.b(aVDmtTextView, "");
                aVDmtTextView.setText(this.f88992a.getString(R.string.yl));
                ArrayList<EffectPointModel> g3 = a4.a().g();
                if (!g3.isEmpty()) {
                    this.f88992a.f88899g.add(g3.get(g3.size() - 1));
                } else {
                    g.a().I().a("add effect fail");
                }
            } else if (this.f88992a.f88898f != null && (a3 = a.C2148a.a()) != null && a3.a(effect)) {
                if (!this.f88992a.f88899g.isEmpty()) {
                    EffectPointModel remove2 = this.f88992a.f88899g.remove(0);
                    l.b(remove2, "");
                    EffectPointModel effectPointModel = remove2;
                    a4.a().h().setValue(p.a(effectPointModel.getIndex(), effectPointModel.getUuid()));
                }
                AVDmtTextView aVDmtTextView2 = (AVDmtTextView) this.f88992a.b(R.id.eut);
                l.b(aVDmtTextView2, "");
                aVDmtTextView2.setText(this.f88992a.getString(R.string.yl));
            }
        }
    }
}
