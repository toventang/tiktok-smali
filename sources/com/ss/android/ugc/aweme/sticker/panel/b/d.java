package com.ss.android.ugc.aweme.sticker.panel.b;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class d extends j.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<Effect> f135063a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Effect> f135064b;

    /* renamed from: c  reason: collision with root package name */
    private final h f135065c = i.a((h.f.a.a) a.f135067a);

    /* renamed from: d  reason: collision with root package name */
    private final Effect f135066d;

    static {
        Covode.recordClassIndex(88304);
    }

    private final Effect c() {
        return (Effect) this.f135065c.getValue();
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int a() {
        return this.f135063a.size();
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int b() {
        return this.f135064b.size();
    }

    static final class a extends m implements h.f.a.a<Effect> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f135067a = new a();

        static {
            Covode.recordClassIndex(88305);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Effect invoke() {
            Effect effect = new Effect(null, 1, null);
            effect.setId("id_fake_header");
            effect.setUnzipPath("");
            return effect;
        }
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean b(int i2, int i3) {
        return l.a((Object) this.f135063a.get(i2).getEffectId(), (Object) this.f135064b.get(i3).getEffectId());
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean c(int i2, int i3) {
        Effect effect = this.f135063a.get(i2);
        Effect effect2 = this.f135064b.get(i3);
        if (this.f135066d == null || l.a((Object) effect.getEffectId(), (Object) this.f135066d.getEffectId()) == l.a((Object) effect2.getEffectId(), (Object) this.f135066d.getEffectId())) {
            return true;
        }
        return false;
    }

    public d(Effect effect, List<? extends Effect> list, List<? extends Effect> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f135066d = effect;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, c());
        this.f135063a = arrayList;
        ArrayList arrayList2 = new ArrayList(list2);
        arrayList2.add(0, c());
        this.f135064b = arrayList2;
    }
}
