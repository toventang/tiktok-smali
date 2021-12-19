package com.ss.android.ugc.gamora.editor.toolbar;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.gamora.editor.y;
import h.a.ag;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class EditToolbarViewModel extends LifecycleAwareViewModel<EditToolbarState> implements s {

    /* renamed from: c  reason: collision with root package name */
    public static final a f146974c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.editor.g f146975a = new com.ss.android.ugc.gamora.editor.g();

    /* renamed from: b  reason: collision with root package name */
    public boolean f146976b;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.lifecycle.t<Integer> f146977d = new androidx.lifecycle.t<>();

    /* renamed from: e  reason: collision with root package name */
    private final h.h f146978e = h.i.a((h.f.a.a) c.f146984a);

    /* renamed from: f  reason: collision with root package name */
    private final h.h f146979f = h.i.a((h.f.a.a) u.f146991a);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f146980g = h.i.a((h.f.a.a) r.f146988a);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f146981l = h.i.a((h.f.a.a) t.f146990a);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f146982m = h.i.a((h.f.a.a) s.f146989a);
    private final h.h n = h.i.a((h.f.a.a) q.f146987a);

    static {
        Covode.recordClassIndex(96800);
    }

    private final Map<Integer, androidx.lifecycle.t<Boolean>> k() {
        return (Map) this.f146979f.getValue();
    }

    private final Map<Integer, androidx.lifecycle.t<Boolean>> l() {
        return (Map) this.f146981l.getValue();
    }

    public final androidx.lifecycle.t<Boolean> g() {
        return (androidx.lifecycle.t) this.f146978e.getValue();
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, androidx.lifecycle.t<Boolean>> h() {
        return (Map) this.f146980g.getValue();
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, androidx.lifecycle.t<Boolean>> i() {
        return (Map) this.f146982m.getValue();
    }

    public final androidx.lifecycle.t<Boolean> j() {
        return (androidx.lifecycle.t) this.n.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(96801);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.s
    public final LiveData<Integer> c() {
        return this.f146977d;
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.s
    public final boolean e() {
        return this.f146976b;
    }

    static final class c extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f146984a = new c();

        static {
            Covode.recordClassIndex(96803);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<androidx.lifecycle.t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f146987a = new q();

        static {
            Covode.recordClassIndex(96817);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.t<Boolean> invoke() {
            return new androidx.lifecycle.t();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.s
    public final void a() {
        c(d.f146985a);
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.s
    public final void b() {
        c(b.f146983a);
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.s
    public final void f() {
        c(e.f146986a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditToolbarState(new a.b(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null);
    }

    static final class r extends h.f.b.m implements h.f.a.a<Map<Integer, ? extends androidx.lifecycle.t<Boolean>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f146988a = new r();

        static {
            Covode.recordClassIndex(96818);
        }

        r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, ? extends androidx.lifecycle.t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : y.f147354d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new androidx.lifecycle.t());
            }
            return ag.c(linkedHashMap);
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<Map<Integer, ? extends androidx.lifecycle.t<Boolean>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f146989a = new s();

        static {
            Covode.recordClassIndex(96819);
        }

        s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, ? extends androidx.lifecycle.t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : y.f147354d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new androidx.lifecycle.t());
            }
            return ag.c(linkedHashMap);
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<Map<Integer, ? extends androidx.lifecycle.t<Boolean>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f146990a = new t();

        static {
            Covode.recordClassIndex(96820);
        }

        t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, ? extends androidx.lifecycle.t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : y.f147354d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new androidx.lifecycle.t());
            }
            return ag.c(linkedHashMap);
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<Map<Integer, ? extends androidx.lifecycle.t<Boolean>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f146991a = new u();

        static {
            Covode.recordClassIndex(96821);
        }

        u() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Integer, ? extends androidx.lifecycle.t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : y.f147354d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new androidx.lifecycle.t());
            }
            return ag.c(linkedHashMap);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.s
    public final void a(int i2) {
        this.f146977d.setValue(Integer.valueOf(i2));
    }

    public final void b(List<y> list) {
        h.f.b.l.d(list, "");
        c(new i(list));
    }

    public final LiveData<Boolean> c(int i2) {
        return l().get(Integer.valueOf(i2));
    }

    public final LiveData<Boolean> d(int i2) {
        return k().get(Integer.valueOf(i2));
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.s
    public final void b(int i2) {
        com.bytedance.jedi.arch.m mVar = new com.bytedance.jedi.arch.m(i2);
        h.f.b.l.d(mVar, "");
        c(new n(mVar));
    }

    static final class b extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f146983a = new b();

        static {
            Covode.recordClassIndex(96802);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, null, null, null, null, null, null, null, null, 65471, null);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f146985a = new d();

        static {
            Covode.recordClassIndex(96804);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, null, null, null, 63487, null);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f146986a = new e();

        static {
            Covode.recordClassIndex(96805);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, null, null, 61439, null);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {
        final /* synthetic */ String $value;

        static {
            Covode.recordClassIndex(96806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(1);
            this.$value = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, this.$value, null, null, null, null, null, null, null, null, null, null, null, null, 65527, null);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(96807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, Boolean.valueOf(this.$value), null, null, null, null, null, null, null, null, null, null, null, null, null, 65531, null);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(96808);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, Boolean.valueOf(this.$value), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65533, null);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {
        final /* synthetic */ List $value;

        static {
            Covode.recordClassIndex(96809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(List list) {
            super(1);
            this.$value = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, this.$value, null, null, null, null, null, null, null, null, null, null, 65503, null);
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(96810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(this.$value), null, null, null, null, null, 64511, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {
        final /* synthetic */ boolean $status;

        static {
            Covode.recordClassIndex(96811);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(boolean z) {
            super(1);
            this.$status = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.$status), 32767, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {
        final /* synthetic */ Drawable $value;

        static {
            Covode.recordClassIndex(96812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(Drawable drawable) {
            super(1);
            this.$value = drawable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, this.$value, null, null, null, null, null, null, null, 65279, null);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {
        final /* synthetic */ String $value;

        static {
            Covode.recordClassIndex(96813);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(String str) {
            super(1);
            this.$value = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, this.$value, null, null, null, null, null, null, null, null, 65407, null);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {
        final /* synthetic */ com.bytedance.jedi.arch.m $value;

        static {
            Covode.recordClassIndex(96814);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(com.bytedance.jedi.arch.m mVar) {
            super(1);
            this.$value = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$value, null, null, 57343, null);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {
        final /* synthetic */ List $value;

        static {
            Covode.recordClassIndex(96815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(List list) {
            super(1);
            this.$value = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, this.$value, null, null, null, null, null, null, null, null, null, null, null, 65519, null);
        }
    }

    public static final class p extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(96816);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, Integer.valueOf(this.$value), null, null, null, null, null, null, 65023, null);
        }
    }

    static final class v extends h.f.b.m implements h.f.a.b<EditToolbarState, EditToolbarState> {
        final /* synthetic */ a $autoEnhanceStatus;

        static {
            Covode.recordClassIndex(96822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(a aVar) {
            super(1);
            this.$autoEnhanceStatus = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            h.f.b.l.d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$autoEnhanceStatus, null, 49151, null);
        }
    }

    public final void a(Drawable drawable) {
        h.f.b.l.d(drawable, "");
        c(new l(drawable));
    }

    public final void c(boolean z) {
        c(new k(z));
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.s
    public final void a(a aVar) {
        h.f.b.l.d(aVar, "");
        c(new v(aVar));
    }

    public final void b(boolean z) {
        c(new g(z));
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        c(new f(str));
    }

    public final void a(List<y> list) {
        h.f.b.l.d(list, "");
        c(new o(list));
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.s
    public final void a(boolean z) {
        androidx.lifecycle.t<Boolean> tVar = i().get(1);
        if (tVar != null) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.s
    public final void a(int i2, boolean z) {
        androidx.lifecycle.t<Boolean> tVar = k().get(Integer.valueOf(i2));
        if (tVar != null) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }

    public final void c(int i2, boolean z) {
        androidx.lifecycle.t<Boolean> tVar = i().get(Integer.valueOf(i2));
        if (tVar != null) {
            tVar.postValue(Boolean.valueOf(z));
        }
    }

    public final void b(int i2, boolean z) {
        androidx.lifecycle.t<Boolean> tVar = h().get(Integer.valueOf(i2));
        if (tVar != null) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }

    public final void d(int i2, boolean z) {
        androidx.lifecycle.t<Boolean> tVar = l().get(Integer.valueOf(i2));
        if (tVar != null) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }
}
