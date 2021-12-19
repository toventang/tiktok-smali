package com.ss.android.ugc.aweme.ftc.components.effect;

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
import com.ss.android.ugc.aweme.effect.y;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public final class e extends m {

    /* renamed from: a  reason: collision with root package name */
    public Fragment f97841a;

    /* renamed from: b  reason: collision with root package name */
    a f97842b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f97843c = false;

    /* renamed from: d  reason: collision with root package name */
    private List<EffectCategoryResponse> f97844d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private Context f97845e;

    /* renamed from: f  reason: collision with root package name */
    private List<Effect> f97846f = new ArrayList();

    static {
        Covode.recordClassIndex(62188);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f97844d.size();
    }

    public final EffectCategoryResponse b(int i2) {
        if (i2 < this.f97844d.size()) {
            return this.f97844d.get(i2);
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        if (i2 == getCount() - 1) {
            return this.f97845e.getString(R.string.gbt);
        }
        return this.f97844d.get(i2).getName();
    }

    @Override // androidx.fragment.app.m
    public final Fragment a(int i2) {
        if (i2 == getCount() - 1 && !this.f97843c) {
            return new y();
        }
        if (l.a((Object) "sticker", (Object) this.f97844d.get(i2).getKey())) {
            w a2 = w.a.a(this.f97844d.get(i2).getTotalEffects(), this.f97844d.get(i2).getKey());
            a2.f88898f = this.f97842b;
            return a2;
        }
        t a3 = t.a.a(this.f97844d.get(i2).getTotalEffects(), this.f97844d.get(i2).getKey(), false);
        a3.f88898f = this.f97842b;
        return a3;
    }

    public final void a(List<EffectCategoryResponse> list) {
        if (list != null) {
            this.f97844d = list;
            this.f97846f.clear();
            ArrayList<Effect> arrayList = new ArrayList();
            for (EffectCategoryResponse effectCategoryResponse : this.f97844d) {
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
                        this.f97846f.add(effect);
                    }
                    i2++;
                }
            } else {
                for (Effect effect2 : arrayList) {
                    if (!a.C2148a.a().a(effect2)) {
                        this.f97846f.add(effect2);
                    }
                }
            }
            this.f97842b.a(this.f97846f);
            notifyDataSetChanged();
        }
    }

    e(i iVar, Context context) {
        super(iVar);
        this.f97845e = context;
        AnonymousClass1 r2 = new c() {
            /* class com.ss.android.ugc.aweme.ftc.components.effect.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(62189);
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
        this.f97842b = bVar.a();
        g.a().v();
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.m
    public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        this.f97841a = (Fragment) obj;
        super.setPrimaryItem(viewGroup, i2, obj);
    }
}
