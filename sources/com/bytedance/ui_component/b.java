package com.bytedance.ui_component;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import androidx.lifecycle.ah;
import androidx.lifecycle.m;
import com.bytedance.als.b;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.ai;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.ui_component.a;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.i;
import h.k.k;
import h.z;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Objects;

public abstract class b<T extends JediViewModel<? extends UiState> & m & com.bytedance.als.b> extends j<T> implements q {

    /* renamed from: h  reason: collision with root package name */
    public static final h.h f45851h = i.a((h.f.a.a) C1132b.f45858a);

    /* renamed from: i  reason: collision with root package name */
    public static final h.h f45852i = i.a((h.f.a.a) c.f45859a);

    /* renamed from: j  reason: collision with root package name */
    public static final a f45853j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final v f45854a = new g(this);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f45855b = i.a(h.m.NONE, new d(this));

    /* renamed from: c  reason: collision with root package name */
    private final h.h f45856c = i.a(h.m.NONE, new e(this));

    /* renamed from: g  reason: collision with root package name */
    public final h.f.a.a<String> f45857g = f.f45862a;

    static final class f extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f45862a = new f();

        static {
            Covode.recordClassIndex(27984);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "";
        }
    }

    public abstract h.f.a.a<T> b();

    public abstract void c();

    public void d() {
    }

    /* access modifiers changed from: protected */
    public abstract com.bytedance.scene.group.b e();

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final af k() {
        return (af) this.f45855b.getValue();
    }

    /* renamed from: l */
    public final T getApiComponent() {
        return (T) ((JediViewModel) this.f45856c.getValue());
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27977);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class g implements v {

        /* renamed from: a  reason: collision with root package name */
        public final b<T> f45863a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f45864b;

        static {
            Covode.recordClassIndex(27985);
        }

        @Override // com.bytedance.jedi.arch.v
        public final /* bridge */ /* synthetic */ m getLifecycleOwner() {
            return this.f45863a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(b bVar) {
            this.f45864b = bVar;
            this.f45863a = bVar;
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this.f45854a;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    public final T j() {
        return getApiComponent();
    }

    /* renamed from: com.bytedance.ui_component.b$b  reason: collision with other inner class name */
    static final class C1132b extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1132b f45858a = new C1132b();

        static {
            Covode.recordClassIndex(27978);
        }

        C1132b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<af> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(27980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ af invoke() {
            return ah.a(com.bytedance.scene.ktx.c.b(this.this$0.e()));
        }
    }

    static {
        Covode.recordClassIndex(27976);
    }

    @Override // com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        T l2 = getApiComponent();
        Objects.requireNonNull(l2, "null cannot be cast to non-null type com.bytedance.ui_component.LifecycleAwareViewModel<com.bytedance.ui_component.UiState>");
        selectSubscribe((LifecycleAwareViewModel) l2, c.f45866a, ai.b(), new h(this));
    }

    static final class c extends h.f.b.m implements h.f.a.a<Field> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f45859a = new c();

        static {
            Covode.recordClassIndex(27979);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Field invoke() {
            Type[] actualTypeArguments;
            Field[] declaredFields = af.class.getDeclaredFields();
            l.b(declaredFields, "");
            for (Field field : declaredFields) {
                l.b(field, "");
                if (HashMap.class.isAssignableFrom(field.getType())) {
                    Type genericType = field.getGenericType();
                    if (!(genericType instanceof ParameterizedType)) {
                        genericType = null;
                    }
                    ParameterizedType parameterizedType = (ParameterizedType) genericType;
                    if (!(parameterizedType == null || (actualTypeArguments = parameterizedType.getActualTypeArguments()) == null || actualTypeArguments.length == 0 || actualTypeArguments.length != 2)) {
                        Type type = actualTypeArguments[0];
                        Type type2 = actualTypeArguments[1];
                        if (l.a(type, String.class) && l.a(type2, ac.class)) {
                            field.setAccessible(true);
                            l.b(field, "");
                            return field;
                        }
                    }
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<T> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(27981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            JediViewModel jediViewModel = (JediViewModel) this.this$0.b().invoke();
            if (jediViewModel instanceof LifecycleAwareViewModel) {
                androidx.lifecycle.i lifecycle = this.this$0.getLifecycle();
                l.d(lifecycle, "");
                ((LifecycleAwareViewModel) jediViewModel).f45850k = lifecycle;
            }
            ad adVar = new ad(this.this$0.k(), new a(jediViewModel));
            String invoke = this.this$0.f45857g.invoke();
            if (invoke.length() == 0) {
                invoke = jediViewModel.getClass().getCanonicalName();
            }
            String str = invoke;
            Class<?> cls = jediViewModel.getClass();
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }

        public static final class a implements ad.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ JediViewModel f45860a;

            static {
                Covode.recordClassIndex(27982);
            }

            /* renamed from: com.bytedance.ui_component.b$e$a$a  reason: collision with other inner class name */
            static final class C1133a extends h.f.b.m implements h.f.a.b<UiState, UiState> {

                /* renamed from: a  reason: collision with root package name */
                public static final C1133a f45861a = new C1133a();

                static {
                    Covode.recordClassIndex(27983);
                }

                C1133a() {
                    super(1);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ UiState invoke(UiState uiState) {
                    l.d(uiState, "");
                    return uiState;
                }
            }

            a(JediViewModel jediViewModel) {
                this.f45860a = jediViewModel;
            }

            @Override // androidx.lifecycle.ad.b
            public final <VM extends ac> VM a(Class<VM> cls) {
                l.d(cls, "");
                JediViewModel jediViewModel = this.f45860a;
                Objects.requireNonNull(jediViewModel, "null cannot be cast to non-null type com.bytedance.jedi.arch.JediViewModel<com.bytedance.ui_component.UiState>");
                jediViewModel.a_(C1133a.f45861a);
                return jediViewModel;
            }
        }
    }

    @Override // com.bytedance.als.j
    public void onDestroy() {
        super.onDestroy();
        af k2 = k();
        l.b(k2, "");
        String invoke = this.f45857g.invoke();
        if (invoke.length() == 0) {
            invoke = getApiComponent().getClass().getCanonicalName();
        }
        l.b(invoke, "");
        l.d(k2, "");
        l.d(invoke, "");
        Object obj = ((Field) f45852i.getValue()).get(k2);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.HashMap<*, *> /* = java.util.HashMap<*, *> */");
        HashMap hashMap = (HashMap) obj;
        Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        h.f.b.ad.h(hashMap).remove(invoke);
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, a, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(27986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, a aVar) {
            l.d(iVar, "");
            l.d(aVar, "");
            try {
                if (aVar instanceof a.b) {
                    this.this$0.c();
                } else {
                    this.this$0.d();
                }
            } catch (Throwable th) {
                ((Handler) b.f45851h.getValue()).post(new Runnable() {
                    /* class com.bytedance.ui_component.b.h.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(27987);
                    }

                    public final void run() {
                        throw th;
                    }
                });
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends com.bytedance.jedi.arch.af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, com.bytedance.jedi.arch.ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends com.bytedance.jedi.arch.af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, com.bytedance.jedi.arch.ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends com.bytedance.jedi.arch.af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, com.bytedance.jedi.arch.ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends com.bytedance.jedi.arch.af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, com.bytedance.jedi.arch.ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends com.bytedance.jedi.arch.af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, com.bytedance.jedi.arch.ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends com.bytedance.jedi.arch.af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, com.bytedance.jedi.arch.ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
