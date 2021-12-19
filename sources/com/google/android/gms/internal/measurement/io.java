package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* access modifiers changed from: package-private */
public class io<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    List<ix> f51025a;

    /* renamed from: b  reason: collision with root package name */
    Map<K, V> f51026b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f51027c;

    /* renamed from: d  reason: collision with root package name */
    Map<K, V> f51028d;

    /* renamed from: e  reason: collision with root package name */
    private final int f51029e;

    /* renamed from: f  reason: collision with root package name */
    private volatile iy f51030f;

    /* renamed from: g  reason: collision with root package name */
    private volatile it f51031g;

    static {
        Covode.recordClassIndex(31881);
    }

    public final int b() {
        return this.f51025a.size();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> d() {
        if (this.f51031g == null) {
            this.f51031g = new it(this, (byte) 0);
        }
        return this.f51031g;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (this.f51027c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f51030f == null) {
            this.f51030f = new iy(this, (byte) 0);
        }
        return this.f51030f;
    }

    public int size() {
        return this.f51025a.size() + this.f51026b.size();
    }

    public final Iterable<Map.Entry<K, V>> c() {
        return this.f51026b.isEmpty() ? (Iterable<Map.Entry<K, V>>) is.f51040b : this.f51026b.entrySet();
    }

    public void clear() {
        e();
        if (!this.f51025a.isEmpty()) {
            this.f51025a.clear();
        }
        if (!this.f51026b.isEmpty()) {
            this.f51026b.clear();
        }
    }

    private final SortedMap<K, V> f() {
        e();
        if (this.f51026b.isEmpty() && !(this.f51026b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f51026b = treeMap;
            this.f51028d = treeMap.descendingMap();
        }
        return (SortedMap) this.f51026b;
    }

    public void a() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.f51027c) {
            if (this.f51026b.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f51026b);
            }
            this.f51026b = unmodifiableMap;
            if (this.f51028d.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f51028d);
            }
            this.f51028d = unmodifiableMap2;
            this.f51027c = true;
        }
    }

    public int hashCode() {
        int b2 = b();
        int i2 = 0;
        for (int i3 = 0; i3 < b2; i3++) {
            i2 += this.f51025a.get(i3).hashCode();
        }
        if (this.f51026b.size() > 0) {
            return i2 + this.f51026b.hashCode();
        }
        return i2;
    }

    static <FieldDescriptorType extends gd<FieldDescriptorType>> io<FieldDescriptorType, Object> a(int i2) {
        return new ir(i2);
    }

    public final Map.Entry<K, V> b(int i2) {
        return this.f51025a.get(i2);
    }

    private io(int i2) {
        this.f51029e = i2;
        this.f51025a = Collections.emptyList();
        this.f51026b = Collections.emptyMap();
        this.f51028d = Collections.emptyMap();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.measurement.io<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) >= 0 || this.f51026b.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.android.gms.internal.measurement.io<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? (V) this.f51025a.get(a2).getValue() : this.f51026b.get(comparable);
    }

    /* access modifiers changed from: package-private */
    public final V c(int i2) {
        e();
        V v = (V) this.f51025a.remove(i2).getValue();
        if (!this.f51026b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = f().entrySet().iterator();
            this.f51025a.add(new ix(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.measurement.io<K extends java.lang.Comparable<K>, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return (V) c(a2);
        }
        if (this.f51026b.isEmpty()) {
            return null;
        }
        return this.f51026b.remove(comparable);
    }

    private final int a(K k2) {
        int size = this.f51025a.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f51025a.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo(this.f51025a.get(i3).getKey());
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io)) {
            return super.equals(obj);
        }
        io ioVar = (io) obj;
        int size = size();
        if (size != ioVar.size()) {
            return false;
        }
        int b2 = b();
        if (b2 != ioVar.b()) {
            return entrySet().equals(ioVar.entrySet());
        }
        for (int i2 = 0; i2 < b2; i2++) {
            if (!b(i2).equals(ioVar.b(i2))) {
                return false;
            }
        }
        if (b2 != size) {
            return this.f51026b.equals(ioVar.f51026b);
        }
        return true;
    }

    /* synthetic */ io(int i2, byte b2) {
        this(i2);
    }

    /* renamed from: a */
    public final V put(K k2, V v) {
        e();
        int a2 = a(k2);
        if (a2 >= 0) {
            return (V) this.f51025a.get(a2).setValue(v);
        }
        e();
        if (this.f51025a.isEmpty() && !(this.f51025a instanceof ArrayList)) {
            this.f51025a = new ArrayList(this.f51029e);
        }
        int i2 = -(a2 + 1);
        if (i2 >= this.f51029e) {
            return f().put(k2, v);
        }
        int size = this.f51025a.size();
        int i3 = this.f51029e;
        if (size == i3) {
            ix remove = this.f51025a.remove(i3 - 1);
            f().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.f51025a.add(i2, new ix(this, k2, v));
        return null;
    }
}
