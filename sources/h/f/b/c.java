package h.f.b;

import com.bytedance.covode.number.Covode;
import h.k.b;
import h.k.d;
import h.k.l;
import h.k.m;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

public abstract class c implements b, Serializable {
    public static final Object NO_RECEIVER = a.f158714a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient b reflected;
    private final String signature;

    /* access modifiers changed from: protected */
    public abstract b computeReflected();

    static class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f158714a = new a();

        private a() {
        }

        private Object readResolve() {
            return f158714a;
        }

        static {
            Covode.recordClassIndex(105213);
        }
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // h.k.b
    public String getName() {
        return this.name;
    }

    public String getSignature() {
        return this.signature;
    }

    public c() {
        this(NO_RECEIVER);
    }

    static {
        Covode.recordClassIndex(105212);
    }

    public b compute() {
        b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    @Override // h.k.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // h.k.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public b getReflected() {
        b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new h.f.b();
    }

    @Override // h.k.b
    public l getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // h.k.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // h.k.b
    public m getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // h.k.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // h.k.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // h.k.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // h.k.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return ab.a(cls, "");
        }
        return ab.a(cls);
    }

    protected c(Object obj) {
        this(obj, null, null, null, false);
    }

    @Override // h.k.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // h.k.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    protected c(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
