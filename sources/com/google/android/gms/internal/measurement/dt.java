package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Set;

public abstract class dt<E> extends dm<E> implements Set<E> {

    /* renamed from: a  reason: collision with root package name */
    private transient dl<E> f50793a;

    static {
        Covode.recordClassIndex(31740);
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return false;
    }

    dt() {
    }

    public int hashCode() {
        return ej.a(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable, com.google.android.gms.internal.measurement.dm
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: package-private */
    public dl<E> f() {
        Object[] array = toArray();
        return dl.a(array, array.length);
    }

    @Override // com.google.android.gms.internal.measurement.dm
    public dl<E> zzc() {
        dl<E> dlVar = this.f50793a;
        if (dlVar != null) {
            return dlVar;
        }
        dl<E> f2 = f();
        this.f50793a = f2;
        return f2;
    }

    static int a(int i2) {
        int max = Math.max(i2, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d2 = (double) highestOneBit;
                Double.isNaN(d2);
                if (d2 * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            cl.a(z, "collection too large");
            return 1073741824;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dt) || !e() || !((dt) obj).e() || hashCode() == obj.hashCode()) {
            return ej.a(this, obj);
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    public static <E> com.google.android.gms.internal.measurement.dt<E> zza(java.util.Collection<? extends E> r14) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.dt.zza(java.util.Collection):com.google.android.gms.internal.measurement.dt");
    }
}
