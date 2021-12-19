package com.ss.android.ugc.aweme.effect;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.b.a;
import com.ss.android.ugc.aweme.effect.b.a.c;
import com.ss.android.ugc.aweme.effect.t;
import com.ss.android.ugc.aweme.effect.w;
import com.ss.android.ugc.aweme.experiment.ep;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public final class r extends m {

    /* renamed from: a  reason: collision with root package name */
    public Fragment f88958a;

    /* renamed from: b  reason: collision with root package name */
    public a f88959b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f88960c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f88961d = true;

    /* renamed from: e  reason: collision with root package name */
    private List<EffectCategoryResponse> f88962e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private Context f88963f;

    /* renamed from: g  reason: collision with root package name */
    private List<Effect> f88964g = new ArrayList();

    static {
        Covode.recordClassIndex(55950);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f88962e.size();
    }

    public final EffectCategoryResponse b(int i2) {
        if (i2 < this.f88962e.size()) {
            return this.f88962e.get(i2);
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        if (i2 == getCount() - 1) {
            return this.f88963f.getString(R.string.gbt);
        }
        return this.f88962e.get(i2).getName();
    }

    @Override // androidx.fragment.app.m
    public final Fragment a(int i2) {
        if (i2 == getCount() - 1 && !this.f88960c) {
            return new y();
        }
        if (ep.a() || !l.a((Object) "sticker", (Object) this.f88962e.get(i2).getKey())) {
            t a2 = t.a.a(this.f88962e.get(i2).getTotalEffects(), this.f88962e.get(i2).getKey(), this.f88961d);
            a2.f88898f = this.f88959b;
            return a2;
        }
        w a3 = w.a.a(this.f88962e.get(i2).getTotalEffects(), this.f88962e.get(i2).getKey());
        a3.f88898f = this.f88959b;
        return a3;
    }

    public final void a(List<EffectCategoryResponse> list) {
        if (list != null) {
            this.f88962e = list;
            this.f88964g.clear();
            ArrayList<Effect> arrayList = new ArrayList();
            for (EffectCategoryResponse effectCategoryResponse : this.f88962e) {
                List<Effect> totalEffects = effectCategoryResponse.getTotalEffects();
                if (totalEffects != null) {
                    arrayList.addAll(totalEffects);
                }
            }
            int c2 = g.a().f().c();
            if (c2 >= 0) {
                int i2 = 0;
                while (i2 < c2 && i2 < arrayList.size()) {
                    Effect effect = (Effect) arrayList.get(i2);
                    if (!a.C2148a.a().a(effect)) {
                        this.f88964g.add(effect);
                    }
                    i2++;
                }
            } else {
                for (Effect effect2 : arrayList) {
                    if (!a.C2148a.a().a(effect2)) {
                        this.f88964g.add(effect2);
                    }
                }
            }
            this.f88959b.a(this.f88964g);
            notifyDataSetChanged();
        }
    }

    public r(i iVar, Context context) {
        super(iVar);
        this.f88963f = context;
        AnonymousClass1 r2 = new c() {
            /* class com.ss.android.ugc.aweme.effect.r.AnonymousClass1 */

            static {
                Covode.recordClassIndex(55951);
            }

            @Override // com.ss.android.ugc.aweme.effect.b.a.c
            public final Effect a(Queue<Effect> queue) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.effect.b.a.c
            public final boolean a() {
                return false;
            }
        };
        a.b bVar = new a.b();
        bVar.f88842a = 3;
        bVar.f88843b = r2;
        this.f88959b = bVar.a();
        g.a().v();
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.m
    public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        this.f88958a = (Fragment) obj;
        super.setPrimaryItem(viewGroup, i2, obj);
    }
}
