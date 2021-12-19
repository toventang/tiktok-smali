package com.bytedance.router.arg;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import h.f.a.a;
import h.f.a.b;
import h.f.b.g;
import h.f.b.l;
import h.h;
import h.q;
import h.r;
import h.z;
import java.lang.ref.WeakReference;

public final class RouteArgExtension {
    public static final RouteArgExtension INSTANCE = new RouteArgExtension();

    public static final class ParamResult<T> {
        private final boolean isPutNull;
        private final T result;

        static {
            Covode.recordClassIndex(26144);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.router.arg.RouteArgExtension$ParamResult */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ParamResult copy$default(ParamResult paramResult, Object obj, boolean z, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                obj = paramResult.result;
            }
            if ((i2 & 2) != 0) {
                z = paramResult.isPutNull;
            }
            return paramResult.copy(obj, z);
        }

        public final T component1() {
            return this.result;
        }

        public final boolean component2() {
            return this.isPutNull;
        }

        public final ParamResult<T> copy(T t, boolean z) {
            return new ParamResult<>(t, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParamResult)) {
                return false;
            }
            ParamResult paramResult = (ParamResult) obj;
            return l.a(this.result, paramResult.result) && this.isPutNull == paramResult.isPutNull;
        }

        public final int hashCode() {
            T t = this.result;
            int hashCode = (t != null ? t.hashCode() : 0) * 31;
            boolean z = this.isPutNull;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return hashCode + i2;
        }

        public final String toString() {
            return "ParamResult(result=" + ((Object) this.result) + ", isPutNull=" + this.isPutNull + ")";
        }

        public final T getResult() {
            return this.result;
        }

        public final boolean isPutNull() {
            return this.isPutNull;
        }

        public ParamResult(T t, boolean z) {
            this.result = t;
            this.isPutNull = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ParamResult(Object obj, boolean z, int i2, g gVar) {
            this(obj, (i2 & 2) != 0 ? false : z);
        }
    }

    public static class RouteArgLifecycle<T> {
        private T cached;

        static {
            Covode.recordClassIndex(26148);
        }

        /* access modifiers changed from: protected */
        public final T getCached() {
            return this.cached;
        }

        /* access modifiers changed from: protected */
        public final void setCached(T t) {
            this.cached = t;
        }

        public RouteArgLifecycle(m mVar) {
            if (mVar != null) {
                RouteArgInjector.INSTANCE.register(mVar, new RouteArgExtension$RouteArgLifecycle$$special$$inlined$let$lambda$1(this, mVar));
            }
        }
    }

    private RouteArgExtension() {
    }

    public static final class RouteArgLazy<T> extends RouteArgLifecycle<T> implements h<T> {
        private final a<Bundle> bundleGetter;
        private final Class<T> cls;
        private final b<Boolean, T> defaultInvoker;
        private final String key;

        static {
            Covode.recordClassIndex(26145);
        }

        @Override // h.h
        public final boolean isInitialized() {
            if (getCached() != null) {
                return true;
            }
            return false;
        }

        @Override // h.h
        public final T getValue() {
            T cached = getCached();
            if (cached == null) {
                try {
                    ParamResult<T> bundleParam = RouteArgExtension.INSTANCE.getBundleParam(this.bundleGetter.invoke(), this.key, this.cls);
                    T result = bundleParam.getResult();
                    if (result == null) {
                        result = this.defaultInvoker.invoke(Boolean.valueOf(bundleParam.isPutNull()));
                    }
                    setCached(result);
                    q.m223constructorimpl(z.f158842a);
                } catch (Throwable th) {
                    q.m223constructorimpl(r.a(th));
                }
                if (getCached() == null) {
                    setCached(this.defaultInvoker.invoke(false));
                }
                cached = getCached();
                if (cached == null) {
                    l.a();
                }
            }
            return cached;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.lang.Boolean, ? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RouteArgLazy(m mVar, a<Bundle> aVar, String str, Class<T> cls2, b<? super Boolean, ? extends T> bVar) {
            super(mVar);
            l.c(aVar, "");
            l.c(str, "");
            l.c(cls2, "");
            l.c(bVar, "");
            this.bundleGetter = aVar;
            this.key = str;
            this.cls = cls2;
            this.defaultInvoker = bVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RouteArgLazy(m mVar, a aVar, String str, Class cls2, b bVar, int i2, g gVar) {
            this(mVar, aVar, (i2 & 4) != 0 ? "" : str, cls2, bVar);
        }
    }

    public static final class RouteArgLazyNullable<T> extends RouteArgLifecycle<T> implements h<T> {
        private final a<Bundle> bundleGetter;
        private final Class<T> cls;
        private final b<Boolean, T> defaultInvoker;
        private final String key;

        static {
            Covode.recordClassIndex(26146);
        }

        @Override // h.h
        public final boolean isInitialized() {
            if (getCached() != null) {
                return true;
            }
            return false;
        }

        @Override // h.h
        public final T getValue() {
            T cached = getCached();
            if (cached != null) {
                return cached;
            }
            try {
                ParamResult<T> bundleParam = RouteArgExtension.INSTANCE.getBundleParam(this.bundleGetter.invoke(), this.key, this.cls);
                T result = bundleParam.getResult();
                if (result == null) {
                    result = this.defaultInvoker.invoke(Boolean.valueOf(bundleParam.isPutNull()));
                }
                setCached(result);
                q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
            if (getCached() == null) {
                setCached(this.defaultInvoker.invoke(false));
            }
            return getCached();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.lang.Boolean, ? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RouteArgLazyNullable(m mVar, a<Bundle> aVar, String str, Class<T> cls2, b<? super Boolean, ? extends T> bVar) {
            super(mVar);
            l.c(aVar, "");
            l.c(str, "");
            l.c(cls2, "");
            l.c(bVar, "");
            this.bundleGetter = aVar;
            this.key = str;
            this.cls = cls2;
            this.defaultInvoker = bVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RouteArgLazyNullable(m mVar, a aVar, String str, Class cls2, b bVar, int i2, g gVar) {
            this(mVar, aVar, (i2 & 4) != 0 ? "" : str, cls2, bVar);
        }
    }

    public static final class RouteArgLazyRequired<T> extends RouteArgLifecycle<T> implements h<T> {
        private final a<Bundle> bundleGetter;
        private final Class<T> cls;
        private final a<T> defaultInvoker;
        private final String key;

        static {
            Covode.recordClassIndex(26147);
        }

        @Override // h.h
        public final boolean isInitialized() {
            if (getCached() != null) {
                return true;
            }
            return false;
        }

        @Override // h.h
        public final T getValue() {
            T cached = getCached();
            if (cached == null) {
                try {
                    T result = RouteArgExtension.INSTANCE.getBundleParam(this.bundleGetter.invoke(), this.key, this.cls).getResult();
                    if (result == null) {
                        result = this.defaultInvoker.invoke();
                    }
                    setCached(result);
                    q.m223constructorimpl(z.f158842a);
                } catch (Throwable th) {
                    q.m223constructorimpl(r.a(th));
                }
                cached = getCached();
                if (cached == null) {
                    l.a();
                }
            }
            return cached;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.a<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RouteArgLazyRequired(m mVar, a<Bundle> aVar, String str, Class<T> cls2, a<? extends T> aVar2) {
            super(mVar);
            l.c(aVar, "");
            l.c(str, "");
            l.c(cls2, "");
            l.c(aVar2, "");
            this.bundleGetter = aVar;
            this.key = str;
            this.cls = cls2;
            this.defaultInvoker = aVar2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RouteArgLazyRequired(m mVar, a aVar, String str, Class cls2, a aVar2, int i2, g gVar) {
            this(mVar, aVar, (i2 & 4) != 0 ? "" : str, cls2, aVar2);
        }
    }

    public static class RouteArgNavLazy<T extends IRouteArg> extends RouteArgLifecycle<T> implements h<T> {
        private final a<Bundle> bundleGetter;
        private final a<T> defaultValueGetter;
        private final WeakReference<m> owner;

        static {
            Covode.recordClassIndex(26150);
        }

        @Override // h.h
        public boolean isInitialized() {
            if (getCached() != null) {
                return true;
            }
            return false;
        }

        @Override // h.h
        public T getValue() {
            Object obj;
            m mVar;
            Class<?> cls;
            Class<? extends IRouteArg> argClassByClazz;
            T t = (T) ((IRouteArg) getCached());
            if (t != null) {
                return t;
            }
            Bundle invoke = this.bundleGetter.invoke();
            T t2 = null;
            if (invoke != null) {
                obj = invoke.getParcelable("smart_key_route_arg");
            } else {
                obj = null;
            }
            if (!(obj instanceof IRouteArg) || obj == null) {
                WeakReference<m> weakReference = this.owner;
                if (weakReference == null || (mVar = weakReference.get()) == null || (cls = mVar.getClass()) == null || (argClassByClazz = SmartRouteArgManager.INSTANCE.getArgClassByClazz(cls)) == null) {
                    obj = null;
                } else {
                    obj = argClassByClazz.getMethod("__fromBundle", Bundle.class).invoke(null, invoke);
                    if (!(obj instanceof IRouteArg)) {
                        obj = null;
                    }
                }
            }
            setCached(obj);
            if (getCached() == null) {
                a<T> aVar = this.defaultValueGetter;
                if (aVar != null) {
                    t2 = aVar.invoke();
                }
                setCached(t2);
            }
            return (T) ((IRouteArg) getCached());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends T extends com.bytedance.router.annotation.IRouteArg> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public RouteArgNavLazy(java.lang.ref.WeakReference<androidx.lifecycle.m> r2, h.f.a.a<? extends T> r3, h.f.a.a<android.os.Bundle> r4) {
            /*
                r1 = this;
                java.lang.String r0 = ""
                h.f.b.l.c(r4, r0)
                if (r2 == 0) goto L_0x0017
                java.lang.Object r0 = r2.get()
                androidx.lifecycle.m r0 = (androidx.lifecycle.m) r0
            L_0x000d:
                r1.<init>(r0)
                r1.owner = r2
                r1.defaultValueGetter = r3
                r1.bundleGetter = r4
                return
            L_0x0017:
                r0 = 0
                goto L_0x000d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.arg.RouteArgExtension.RouteArgNavLazy.<init>(java.lang.ref.WeakReference, h.f.a.a, h.f.a.a):void");
        }
    }

    static {
        Covode.recordClassIndex(26143);
    }

    public final <T extends IRouteArg> h<T> navArg(Activity activity) {
        l.c(activity, "");
        return new RouteArgNavLazy(new WeakReference(activity), null, new RouteArgExtension$navArg$1(activity));
    }

    public final <T extends IRouteArg> h<T> navArg(Fragment fragment) {
        l.c(fragment, "");
        return new RouteArgNavLazy(new WeakReference(fragment), null, new RouteArgExtension$navArg$3(fragment));
    }

    public static Object com_bytedance_router_arg_RouteArgExtension_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public final <T> h<T> optionalArg(Activity activity, b<? super Boolean, ? extends T> bVar) {
        l.c(activity, "");
        l.c(bVar, "");
        return new RouteArgExtension$optionalArg$1();
    }

    public final <T> h<T> optionalArgNotNull(Activity activity, b<? super Boolean, ? extends T> bVar) {
        l.c(activity, "");
        l.c(bVar, "");
        return new RouteArgExtension$optionalArgNotNull$1();
    }

    public final <T> h<T> requiredArg(Activity activity, a<? extends T> aVar) {
        l.c(activity, "");
        l.c(aVar, "");
        return new RouteArgExtension$requiredArg$1();
    }

    public final <T> h<T> optionalArg(Fragment fragment, b<? super Boolean, ? extends T> bVar) {
        l.c(fragment, "");
        l.c(bVar, "");
        return new RouteArgExtension$optionalArg$3();
    }

    public final <T> h<T> optionalArgNotNull(Fragment fragment, b<? super Boolean, ? extends T> bVar) {
        l.c(fragment, "");
        l.c(bVar, "");
        return new RouteArgExtension$optionalArgNotNull$3();
    }

    public final <T> h<T> requiredArg(Fragment fragment, a<? extends T> aVar) {
        l.c(fragment, "");
        l.c(aVar, "");
        return new RouteArgExtension$requiredArg$3();
    }

    public final <T extends IRouteArg> h<T> navArg(Activity activity, a<? extends T> aVar) {
        l.c(activity, "");
        l.c(aVar, "");
        return new RouteArgNavLazy(new WeakReference(activity), aVar, new RouteArgExtension$navArg$2(activity));
    }

    public final void withNavArg(Fragment fragment, IRouteArg iRouteArg) {
        l.c(fragment, "");
        l.c(iRouteArg, "");
        if (fragment.getArguments() == null) {
            fragment.setArguments(new Bundle());
        }
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            arguments.putParcelable("smart_key_route_arg", iRouteArg);
        }
    }

    public final <T extends IRouteArg> h<T> navArg(Fragment fragment, a<? extends T> aVar) {
        l.c(fragment, "");
        l.c(aVar, "");
        return new RouteArgNavLazy(new WeakReference(fragment), aVar, new RouteArgExtension$navArg$4(fragment));
    }

    public final <T> ParamResult<T> getBundleParam(Bundle bundle, String str, Class<T> cls) {
        boolean z = false;
        if (bundle != null && bundle.containsKey(str)) {
            Object com_bytedance_router_arg_RouteArgExtension_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_router_arg_RouteArgExtension_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str);
            if (com_bytedance_router_arg_RouteArgExtension_com_ss_android_ugc_aweme_lancet_IntentLancet_get != null) {
                if (com_bytedance_router_arg_RouteArgExtension_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
                }
                return new ParamResult<>(com_bytedance_router_arg_RouteArgExtension_com_ss_android_ugc_aweme_lancet_IntentLancet_get, false, 2, null);
            }
            z = true;
        }
        return new ParamResult<>(null, z);
    }

    public final <T> h<T> optionalArg(Activity activity, b<? super Boolean, ? extends T> bVar, String str, Class<T> cls) {
        Activity activity2;
        l.c(activity, "");
        l.c(bVar, "");
        l.c(str, "");
        l.c(cls, "");
        if (!(activity instanceof m)) {
            activity2 = null;
        } else {
            activity2 = activity;
        }
        return new RouteArgLazyNullable((m) activity2, new RouteArgExtension$optionalArg$2(activity), str, cls, bVar);
    }

    public final <T> h<T> optionalArgNotNull(Activity activity, b<? super Boolean, ? extends T> bVar, String str, Class<T> cls) {
        Activity activity2;
        l.c(activity, "");
        l.c(bVar, "");
        l.c(str, "");
        l.c(cls, "");
        if (!(activity instanceof m)) {
            activity2 = null;
        } else {
            activity2 = activity;
        }
        return new RouteArgLazy((m) activity2, new RouteArgExtension$optionalArgNotNull$2(activity), str, cls, bVar);
    }

    public final <T> h<T> requiredArg(Activity activity, a<? extends T> aVar, String str, Class<T> cls) {
        Activity activity2;
        l.c(activity, "");
        l.c(aVar, "");
        l.c(str, "");
        l.c(cls, "");
        if (!(activity instanceof m)) {
            activity2 = null;
        } else {
            activity2 = activity;
        }
        return new RouteArgLazyRequired((m) activity2, new RouteArgExtension$requiredArg$2(activity), str, cls, aVar);
    }

    public final <T> h<T> optionalArg(Fragment fragment, b<? super Boolean, ? extends T> bVar, String str, Class<T> cls) {
        Fragment fragment2;
        l.c(fragment, "");
        l.c(bVar, "");
        l.c(str, "");
        l.c(cls, "");
        if (!(fragment instanceof m)) {
            fragment2 = null;
        } else {
            fragment2 = fragment;
        }
        return new RouteArgLazyNullable(fragment2, new RouteArgExtension$optionalArg$4(fragment), str, cls, bVar);
    }

    public final <T> h<T> optionalArgNotNull(Fragment fragment, b<? super Boolean, ? extends T> bVar, String str, Class<T> cls) {
        Fragment fragment2;
        l.c(fragment, "");
        l.c(bVar, "");
        l.c(str, "");
        l.c(cls, "");
        if (!(fragment instanceof m)) {
            fragment2 = null;
        } else {
            fragment2 = fragment;
        }
        return new RouteArgLazy(fragment2, new RouteArgExtension$optionalArgNotNull$4(fragment), str, cls, bVar);
    }

    public final <T> h<T> requiredArg(Fragment fragment, a<? extends T> aVar, String str, Class<T> cls) {
        Fragment fragment2;
        l.c(fragment, "");
        l.c(aVar, "");
        l.c(str, "");
        l.c(cls, "");
        if (!(fragment instanceof m)) {
            fragment2 = null;
        } else {
            fragment2 = fragment;
        }
        return new RouteArgLazyRequired(fragment2, new RouteArgExtension$requiredArg$4(fragment), str, cls, aVar);
    }

    public static /* synthetic */ h optionalArg$default(RouteArgExtension routeArgExtension, Activity activity, b bVar, String str, Class cls, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        return routeArgExtension.optionalArg(activity, bVar, str, cls);
    }

    public static /* synthetic */ h optionalArgNotNull$default(RouteArgExtension routeArgExtension, Activity activity, b bVar, String str, Class cls, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        return routeArgExtension.optionalArgNotNull(activity, bVar, str, cls);
    }

    public static /* synthetic */ h requiredArg$default(RouteArgExtension routeArgExtension, Activity activity, a aVar, String str, Class cls, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        return routeArgExtension.requiredArg(activity, aVar, str, cls);
    }

    public static /* synthetic */ h optionalArg$default(RouteArgExtension routeArgExtension, Fragment fragment, b bVar, String str, Class cls, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        return routeArgExtension.optionalArg(fragment, bVar, str, cls);
    }

    public static /* synthetic */ h optionalArgNotNull$default(RouteArgExtension routeArgExtension, Fragment fragment, b bVar, String str, Class cls, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        return routeArgExtension.optionalArgNotNull(fragment, bVar, str, cls);
    }

    public static /* synthetic */ h requiredArg$default(RouteArgExtension routeArgExtension, Fragment fragment, a aVar, String str, Class cls, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        return routeArgExtension.requiredArg(fragment, aVar, str, cls);
    }
}
