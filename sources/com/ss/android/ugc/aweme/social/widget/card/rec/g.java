package com.ss.android.ugc.aweme.social.widget.card.rec;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.e;
import com.bytedance.ies.powerlist.page.config.b;
import com.ss.android.ugc.aweme.social.widget.card.a.i;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class g extends e implements h {

    /* renamed from: d  reason: collision with root package name */
    private final h f133876d;

    static {
        Covode.recordClassIndex(87583);
    }

    private final i d() {
        return (i) this.f133876d.getValue();
    }

    @Override // com.bytedance.ies.powerlist.e
    public final void c() {
        d().c();
    }

    static final class a extends m implements h.f.a.a<i> {
        final /* synthetic */ i $groupConfig;
        final /* synthetic */ com.ss.android.ugc.aweme.social.widget.a $socialContext;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(87584);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, com.ss.android.ugc.aweme.social.widget.a aVar, i iVar) {
            super(0);
            this.this$0 = gVar;
            this.$socialContext = aVar;
            this.$groupConfig = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ i invoke() {
            return new i(this.$socialContext, this.$groupConfig, this.this$0);
        }
    }

    @Override // com.bytedance.ies.powerlist.e
    public final b<?> a() {
        return d().b();
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.rec.h
    public final void b(List<? extends com.bytedance.ies.powerlist.b.a> list) {
        l.d(list, "");
        b().b(list);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.rec.h
    public final void a(View view) {
        l.d(view, "");
        d_(view);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.rec.h
    public final void a(Map<Integer, Class<? extends PowerCell<?>>> map) {
        l.d(map, "");
        Object[] array = map.values().toArray(new Class[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Class[] clsArr = (Class[]) array;
        a((Class[]) Arrays.copyOf(clsArr, clsArr.length));
    }

    public g(com.ss.android.ugc.aweme.social.widget.a aVar, i iVar) {
        l.d(aVar, "");
        l.d(iVar, "");
        this.f133876d = h.i.a((h.f.a.a) new a(this, aVar, iVar));
    }
}
