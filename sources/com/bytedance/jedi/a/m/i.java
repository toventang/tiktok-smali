package com.bytedance.jedi.a.m;

import com.bytedance.covode.number.Covode;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

public final class i<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, WeakReference<T>> f39356a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final ReferenceQueue<T> f39357b = new ReferenceQueue<>();

    static {
        Covode.recordClassIndex(24139);
    }
}
