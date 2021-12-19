package com.bytedance.ies.sdk.datachannel;

import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;

public class m<T> extends t<T> implements o<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f34578c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final Map<b<T, z>, n<T>> f34579a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f34580b = -1;

    /* renamed from: d  reason: collision with root package name */
    private T f34581d;

    static {
        Covode.recordClassIndex(20698);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20699);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public m() {
    }

    @Override // androidx.lifecycle.LiveData
    public T getValue() {
        T t = (T) super.getValue();
        if (t == null) {
            return this.f34581d;
        }
        return t;
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
    public void postValue(T t) {
        if (t != null) {
            super.postValue(t);
        }
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
    public final void setValue(T t) {
        if (t != null) {
            this.f34580b++;
            super.setValue(t);
        }
    }

    public m(T t) {
        this.f34581d = t;
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(u<? super T> uVar) {
        l.c(uVar, "");
        super.removeObserver(uVar);
        if (uVar instanceof n) {
            for (Map.Entry<b<T, z>, n<T>> entry : this.f34579a.entrySet()) {
                b<T, z> key = entry.getKey();
                if (l.a(uVar, entry.getValue())) {
                    if (key != null) {
                        this.f34579a.remove(key);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final n<T> a(b<? super T, z> bVar, boolean z) {
        l.c(bVar, "");
        if (this.f34579a.containsKey(bVar)) {
            n<T> nVar = this.f34579a.get(bVar);
            if (nVar == null) {
                l.a();
            }
            return nVar;
        }
        n<T> nVar2 = new n<>(bVar, z, this);
        this.f34579a.put(bVar, nVar2);
        super.observeForever(nVar2);
        return nVar2;
    }

    public final n<T> a(androidx.lifecycle.m mVar, b<? super T, z> bVar, boolean z) {
        l.c(mVar, "");
        l.c(bVar, "");
        if (this.f34579a.containsKey(bVar)) {
            n<T> nVar = this.f34579a.get(bVar);
            if (nVar == null) {
                l.a();
            }
            return nVar;
        }
        n<T> nVar2 = new n<>(bVar, z, this);
        this.f34579a.put(bVar, nVar2);
        super.observe(mVar, nVar2);
        return nVar2;
    }
}
