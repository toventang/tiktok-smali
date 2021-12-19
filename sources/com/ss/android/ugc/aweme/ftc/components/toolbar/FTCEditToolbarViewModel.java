package com.ss.android.ugc.aweme.ftc.components.toolbar;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.gamora.editor.y;
import h.a.ag;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class FTCEditToolbarViewModel extends LifecycleAwareViewModel<FTCEditToolbarState> implements k {

    /* renamed from: a  reason: collision with root package name */
    private final t<Integer> f98194a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    private final h.h f98195b = h.i.a((h.f.a.a) b.f98202a);

    /* renamed from: c  reason: collision with root package name */
    private final h.h f98196c = h.i.a((h.f.a.a) p.f98207a);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f98197d = h.i.a((h.f.a.a) m.f98204a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f98198e = h.i.a((h.f.a.a) o.f98206a);

    /* renamed from: f  reason: collision with root package name */
    private final h.h f98199f = h.i.a((h.f.a.a) n.f98205a);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f98200g = h.i.a((h.f.a.a) l.f98203a);

    static {
        Covode.recordClassIndex(62436);
    }

    public final t<Boolean> g() {
        return (t) this.f98195b.getValue();
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, t<Boolean>> h() {
        return (Map) this.f98196c.getValue();
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, t<Boolean>> i() {
        return (Map) this.f98197d.getValue();
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, t<Boolean>> j() {
        return (Map) this.f98198e.getValue();
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, t<Boolean>> k() {
        return (Map) this.f98199f.getValue();
    }

    public final t<Boolean> l() {
        return (t) this.f98200g.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.toolbar.k
    public final LiveData<Integer> b() {
        return this.f98194a;
    }

    static final class b extends h.f.b.m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f98202a = new b();

        static {
            Covode.recordClassIndex(62438);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            return new t();
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f98203a = new l();

        static {
            Covode.recordClassIndex(62448);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            return new t();
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.toolbar.k
    public final void a() {
        c(a.f98201a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new FTCEditToolbarState(new a.b(), null, null, null, null, null, null, null, null, null, null, 2046, null);
    }

    static final class m extends h.f.b.m implements h.f.a.a<Map<Integer, ? extends t<Boolean>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f98204a = new m();

        static {
            Covode.recordClassIndex(62449);
        }

        m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, ? extends t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : y.f147354d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new t());
            }
            return ag.c(linkedHashMap);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<Map<Integer, ? extends t<Boolean>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f98205a = new n();

        static {
            Covode.recordClassIndex(62450);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, ? extends t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : y.f147354d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new t());
            }
            return ag.c(linkedHashMap);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<Map<Integer, ? extends t<Boolean>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f98206a = new o();

        static {
            Covode.recordClassIndex(62451);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, ? extends t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : y.f147354d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new t());
            }
            return ag.c(linkedHashMap);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<Map<Integer, ? extends t<Boolean>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f98207a = new p();

        static {
            Covode.recordClassIndex(62452);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, ? extends t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : y.f147354d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new t());
            }
            return ag.c(linkedHashMap);
        }
    }

    public final void a(int i2) {
        this.f98194a.setValue(Integer.valueOf(i2));
    }

    static final class a extends h.f.b.m implements h.f.a.b<FTCEditToolbarState, FTCEditToolbarState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f98201a = new a();

        static {
            Covode.recordClassIndex(62437);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            h.f.b.l.d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, null, null, null, 1983, null);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<FTCEditToolbarState, FTCEditToolbarState> {
        final /* synthetic */ String $value;

        static {
            Covode.recordClassIndex(62439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.$value = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            h.f.b.l.d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, this.$value, null, null, null, null, null, null, null, 2039, null);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<FTCEditToolbarState, FTCEditToolbarState> {
        final /* synthetic */ List $value;

        static {
            Covode.recordClassIndex(62442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(List list) {
            super(1);
            this.$value = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            h.f.b.l.d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, null, null, this.$value, null, null, null, null, null, 2015, null);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<FTCEditToolbarState, FTCEditToolbarState> {
        final /* synthetic */ Drawable $value;

        static {
            Covode.recordClassIndex(62444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(Drawable drawable) {
            super(1);
            this.$value = drawable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            h.f.b.l.d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, null, null, null, null, null, this.$value, null, null, 1791, null);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<FTCEditToolbarState, FTCEditToolbarState> {
        final /* synthetic */ String $value;

        static {
            Covode.recordClassIndex(62445);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(1);
            this.$value = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            h.f.b.l.d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, null, null, null, null, this.$value, null, null, null, 1919, null);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<FTCEditToolbarState, FTCEditToolbarState> {
        final /* synthetic */ List $value;

        static {
            Covode.recordClassIndex(62446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(List list) {
            super(1);
            this.$value = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            h.f.b.l.d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, null, this.$value, null, null, null, null, null, null, 2031, null);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<FTCEditToolbarState, FTCEditToolbarState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(62440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            h.f.b.l.d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, Boolean.valueOf(this.$value), null, null, null, null, null, null, null, null, 2043, null);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<FTCEditToolbarState, FTCEditToolbarState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(62441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            h.f.b.l.d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, Boolean.valueOf(this.$value), null, null, null, null, null, null, null, null, null, 2045, null);
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<FTCEditToolbarState, FTCEditToolbarState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(62443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            h.f.b.l.d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(this.$value), 1023, null);
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.b<FTCEditToolbarState, FTCEditToolbarState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(62447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            h.f.b.l.d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, null, null, null, null, null, null, Integer.valueOf(this.$value), null, 1535, null);
        }
    }

    public final void a(Drawable drawable) {
        h.f.b.l.d(drawable, "");
        c(new h(drawable));
    }

    public final void a(List<y> list) {
        h.f.b.l.d(list, "");
        c(new f(list));
    }

    public final void a(boolean z) {
        c(new d(z));
    }

    @Override // com.ss.android.ugc.aweme.ftc.components.toolbar.k
    public final void a(int i2, boolean z) {
        t<Boolean> tVar = h().get(Integer.valueOf(i2));
        if (tVar != null) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }

    public final void b(int i2, boolean z) {
        t<Boolean> tVar = i().get(Integer.valueOf(i2));
        if (tVar != null) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }

    public final void c(int i2, boolean z) {
        t<Boolean> tVar = k().get(Integer.valueOf(i2));
        if (tVar != null) {
            tVar.postValue(Boolean.valueOf(z));
        }
    }

    public final void d(int i2, boolean z) {
        t<Boolean> tVar = j().get(Integer.valueOf(i2));
        if (tVar != null) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }
}
