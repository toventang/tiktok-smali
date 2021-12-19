package h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.a.a;
import h.f.b.l;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

final class aa implements a, Serializable, Map {

    /* renamed from: a  reason: collision with root package name */
    public static final aa f158621a = new aa();
    private static final long serialVersionUID = 8246714829545688274L;

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    private aa() {
    }

    private final Object readResolve() {
        return f158621a;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return ab.INSTANCE;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return ab.INSTANCE;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return z.INSTANCE;
    }

    static {
        Covode.recordClassIndex(105038);
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        l.d(obj, "");
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map) || !((Map) obj).isEmpty()) {
            return false;
        }
        return true;
    }
}
