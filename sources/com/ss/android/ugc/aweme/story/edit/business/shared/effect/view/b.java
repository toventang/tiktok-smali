package com.ss.android.ugc.aweme.story.edit.business.shared.effect.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.b.a;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.effect.a.a<c> implements com.ss.android.ugc.aweme.effect.b.a.b {

    /* renamed from: g  reason: collision with root package name */
    public static final Effect f137391g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f137392h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<Effect> f137393a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f137394b;

    /* renamed from: d  reason: collision with root package name */
    public int f137395d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.effect.b.a f137396e;

    /* renamed from: f  reason: collision with root package name */
    public final q<Effect, EffectModel, Integer, z> f137397f;

    /* renamed from: i  reason: collision with root package name */
    private final C3605b f137398i = new C3605b(this);

    /* renamed from: j  reason: collision with root package name */
    private final RecyclerView f137399j;

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89860);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f88774c.size();
    }

    static {
        Covode.recordClassIndex(89859);
        Effect effect = new Effect(null, 1, null);
        effect.setName("");
        effect.setHint("");
        effect.setEffectId("-1");
        effect.setIconUrl(new UrlModel(new com.ss.ugc.effectplatform.model.UrlModel(n.a(""), null, 2, null)));
        effect.setUnzipPath("");
        effect.setExtra("");
        f137391g = effect;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.b$b  reason: collision with other inner class name */
    public static final class C3605b implements h.f.a.b<Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137400a;

        static {
            Covode.recordClassIndex(89861);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3605b(b bVar) {
            this.f137400a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            a(num.intValue());
            return z.f158842a;
        }

        public final void a(int i2) {
            this.f137400a.f137395d = i2;
            if (i2 != this.f137400a.f137394b) {
                if (i2 == 0) {
                    this.f137400a.f137397f.invoke(null, null, Integer.valueOf(i2));
                    return;
                }
                EffectModel effectModel = this.f137400a.f88774c.get(i2);
                Effect effect = (Effect) n.b((List) this.f137400a.f137393a, i2);
                if (effect != null) {
                    this.f137400a.c(i2);
                    f a2 = a.C2148a.a();
                    if (a2 == null || !a2.a(effect)) {
                        this.f137400a.f137396e.a(effect);
                    } else {
                        this.f137400a.f137397f.invoke(effect, effectModel, Integer.valueOf(i2));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.b.a.b
    public final void a(Effect effect) {
        l.d(effect, "");
        int indexOf = this.f137393a.indexOf(effect);
        if (indexOf >= 0) {
            a(indexOf, 8);
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.b.a.b
    public final void b(Effect effect) {
        l.d(effect, "");
        int indexOf = this.f137393a.indexOf(effect);
        if (indexOf >= 0) {
            a(indexOf, 16);
            if (indexOf == this.f137395d) {
                this.f137398i.a(indexOf);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.b.a.b
    public final void c(Effect effect) {
        int indexOf;
        if (effect != null && (indexOf = this.f137393a.indexOf(effect)) >= 0) {
            a(indexOf, 32);
        }
    }

    public final void b(int i2) {
        int i3;
        this.f137395d = -1;
        if (i2 >= 0 && i2 < this.f88774c.size() && i2 != (i3 = this.f137394b)) {
            notifyItemChanged(i3, false);
            this.f137394b = i2;
            notifyItemChanged(i2, true);
        }
    }

    public final int a(EffectModel effectModel) {
        int i2 = 0;
        if (effectModel != null) {
            Iterator<EffectModel> it = this.f88774c.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (l.a((Object) it.next().key, (Object) effectModel.key)) {
                    break;
                } else {
                    i3++;
                }
            }
            i2 = Math.max(0, i3);
        }
        b(i2);
        return i2;
    }

    public final void c(int i2) {
        if (g.a().f().c() >= 0 && i2 < this.f137393a.size()) {
            int size = this.f137393a.size();
            for (int i3 = i2 + 1; i3 < size; i3++) {
                f a2 = a.C2148a.a();
                if (a2 == null || !a2.a(this.f137393a.get(i3))) {
                    if (i3 != -1) {
                        this.f137396e.a(this.f137393a.get(i3));
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final EffectModel a(String str) {
        T t = null;
        if (str == null) {
            return null;
        }
        Iterator<T> it = this.f88774c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (l.a((Object) next.key, (Object) str)) {
                t = next;
                break;
            }
        }
        return t;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(c cVar, int i2) {
        l.d(cVar, "");
        if (i2 == 0) {
            cVar.a(i2, null, 4, this.f137394b);
            return;
        }
        cVar.a(i2, this.f88774c.get(i2), a(i2), this.f137394b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.q<? super com.ss.android.ugc.effectmanager.effect.model.Effect, ? super com.ss.android.ugc.aweme.effect.EffectModel, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(RecyclerView recyclerView, com.ss.android.ugc.aweme.effect.b.a aVar, q<? super Effect, ? super EffectModel, ? super Integer, z> qVar) {
        super(recyclerView, aVar);
        l.d(recyclerView, "");
        l.d(aVar, "");
        l.d(qVar, "");
        this.f137399j = recyclerView;
        this.f137396e = aVar;
        this.f137397f = qVar;
        aVar.a(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List list) {
        c cVar = (c) viewHolder;
        l.d(cVar, "");
        l.d(list, "");
        if (list.isEmpty()) {
            onBindViewHolder(cVar, i2);
            return;
        }
        Object obj = list.get(0);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        cVar.a(((Boolean) obj).booleanValue());
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(2958);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b35, viewGroup, false);
        l.b(a3, "");
        c cVar = new c(a3, bVar.f137398i);
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = cVar.getClass().getName();
        MethodCollector.o(2958);
        return cVar;
    }
}
