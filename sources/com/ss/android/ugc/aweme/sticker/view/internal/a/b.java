package com.ss.android.ugc.aweme.sticker.view.internal.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.sticker.m.h;
import com.ss.android.ugc.aweme.sticker.view.a.i;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.m;
import h.z;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public final h f136231a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, HashSet<String>> f136232b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f136233c = g.a(l.a(o.SERIAL).a("default_sticker_view_mob").a());

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.presenter.o f136234d;

    static {
        Covode.recordClassIndex(88975);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f136235a;

        static {
            Covode.recordClassIndex(88976);
        }

        a(h.f.a.a aVar) {
            this.f136235a = aVar;
        }

        public final void run() {
            this.f136235a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.a.b$b  reason: collision with other inner class name */
    static final class C3552b extends m implements h.f.a.a<z> {
        final /* synthetic */ String $categoryName;
        final /* synthetic */ Effect $effect;
        final /* synthetic */ int $position;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(88977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3552b(b bVar, Effect effect, String str, int i2) {
            super(0);
            this.this$0 = bVar;
            this.$effect = effect;
            this.$categoryName = str;
            this.$position = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            h hVar = this.this$0.f136231a;
            Effect effect = this.$effect;
            String str = this.$categoryName;
            if (str == null) {
                str = "";
            }
            hVar.a(effect, str, "click_main_panel", this.$position);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.i
    public final void a(String str) {
        HashSet<String> hashSet = this.f136232b.get(str);
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.i
    public final void a(int i2) {
        if ((i2 != 0 || !h.f.b.l.a((Object) this.f136234d.p().f135424a, (Object) "xssticker")) && this.f136234d.i() != -1) {
            this.f136231a.a(System.currentTimeMillis() - this.f136234d.i(), i2);
            this.f136234d.a(-1L);
            this.f136231a.a().c("tool_performance_open_choose_sticker", "shown_sticker");
        }
    }

    public b(com.ss.android.ugc.aweme.sticker.presenter.o oVar, h hVar) {
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(hVar, "");
        this.f136234d = oVar;
        this.f136231a = hVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.i
    public final void a(int i2, String str, h.f.a.b<? super Integer, ? extends Effect> bVar) {
        h.f.b.l.d(bVar, "");
        HashSet<String> hashSet = this.f136232b.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f136232b.put(str, hashSet);
        }
        Effect effect = (Effect) bVar.invoke(Integer.valueOf(i2));
        if (effect != null && !hashSet.contains(effect.getEffectId())) {
            this.f136233c.submit(new a(new C3552b(this, effect, str, i2)));
            hashSet.add(effect.getEffectId());
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.i
    public final void a(int i2, int i3, String str, h.f.a.b<? super Integer, ? extends Effect> bVar) {
        String str2;
        h.f.b.l.d(bVar, "");
        HashSet<String> hashSet = this.f136232b.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f136232b.put(str, hashSet);
        }
        int i4 = i3 + 1;
        for (int i5 = i2 + 1; i5 < i4; i5++) {
            Effect effect = (Effect) bVar.invoke(Integer.valueOf(i5));
            if (effect != null && !hashSet.contains(effect.getEffectId())) {
                String effectId = effect.getEffectId();
                h hVar = this.f136231a;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                hVar.a(effect, str2, "click_main_panel", i5);
                hashSet.add(effectId);
            }
        }
    }
}
