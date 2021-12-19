package androidx.lifecycle;

import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.vm.ScopeViewModel;
import h.f.b.l;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public final class SharedViewModelProvider extends ad {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3485a = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static final af f3486d = new af();

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap<String, Set<i>> f3487e = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private af f3488b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, Set<i>> f3489c;

    public static final class a {
        static {
            Covode.recordClassIndex(1286);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ SharedViewModelProvider() {
        this(new ad.d());
    }

    static {
        Covode.recordClassIndex(1284);
    }

    @Override // androidx.lifecycle.ad
    public final <T extends ac> T a(Class<T> cls) {
        l.c(cls, "");
        throw new IllegalAccessException("Unsupport get viewmodel without lifecycle, please use method get(Lifecycle,Class) or get(Lifecycle,String,Class) instead");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SharedViewModelProvider(androidx.lifecycle.ad.b r2) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            h.f.b.l.c(r2, r0)
            androidx.lifecycle.af r0 = androidx.lifecycle.SharedViewModelProvider.f3486d
            r1.<init>(r0, r2)
            r1.f3488b = r0
            java.util.HashMap<java.lang.String, java.util.Set<androidx.lifecycle.i>> r0 = androidx.lifecycle.SharedViewModelProvider.f3487e
            r1.f3489c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.SharedViewModelProvider.<init>(androidx.lifecycle.ad$b):void");
    }

    /* access modifiers changed from: package-private */
    public static final class ClearUselessViewModelObserver implements k {

        /* renamed from: a  reason: collision with root package name */
        private final i f3490a;

        /* renamed from: b  reason: collision with root package name */
        private final String f3491b;

        /* renamed from: c  reason: collision with root package name */
        private final af f3492c;

        /* renamed from: d  reason: collision with root package name */
        private final HashMap<String, Set<i>> f3493d;

        static {
            Covode.recordClassIndex(1285);
        }

        @Override // androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            l.c(mVar, "");
            l.c(aVar, "");
            if (aVar == i.a.ON_DESTROY) {
                Set<i> set = this.f3493d.get(this.f3491b);
                if (set == null) {
                    set = new LinkedHashSet<>();
                }
                Set<i> set2 = set;
                set2.remove(this.f3490a);
                if (set2.isEmpty()) {
                    this.f3492c.a(this.f3491b, null);
                    this.f3493d.remove(this.f3491b);
                }
            }
        }

        public ClearUselessViewModelObserver(i iVar, String str, af afVar, HashMap<String, Set<i>> hashMap) {
            l.c(iVar, "");
            l.c(str, "");
            l.c(afVar, "");
            l.c(hashMap, "");
            this.f3490a = iVar;
            this.f3491b = str;
            this.f3492c = afVar;
            this.f3493d = hashMap;
        }
    }

    public final <T extends ac> T a(i iVar, Class<T> cls) {
        l.c(iVar, "");
        l.c(cls, "");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) a(iVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(String.valueOf(canonicalName)), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ad
    public final <T extends ac> T a(String str, Class<T> cls) {
        l.c(str, "");
        l.c(cls, "");
        throw new IllegalAccessException("Unsupport get viewmodel without lifecycle, please use method get(Lifecycle,Class) or get(Lifecycle,String,Class) instead");
    }

    private static ac a(ad adVar, String str, Class cls) {
        if (cls.equals(ScopeViewModel.class)) {
            return super.a(str, cls);
        }
        ac a2 = super.a(str, cls);
        ab.a(a2, adVar);
        return a2;
    }

    public final <T extends ac> T a(i iVar, String str, Class<T> cls) {
        l.c(iVar, "");
        l.c(str, "");
        l.c(cls, "");
        if (iVar.a() != i.b.DESTROYED) {
            T t = (T) a(this, str, cls);
            Set<i> set = this.f3489c.get(str);
            if (set == null) {
                set = new LinkedHashSet<>();
            }
            Set<i> set2 = set;
            this.f3489c.put(str, set2);
            if (!set2.contains(iVar)) {
                set2.add(iVar);
                iVar.a(new ClearUselessViewModelObserver(iVar, str, this.f3488b, this.f3489c));
            }
            return t;
        }
        throw new IllegalStateException("Could not get viewmodel when lifecycle was destroyed");
    }
}
