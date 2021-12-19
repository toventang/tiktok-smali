package com.google.android.play.core.d;

import com.bytedance.covode.number.Covode;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r f53198a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Set f53199b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f53200c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l f53201d;

    static {
        Covode.recordClassIndex(32880);
    }

    f(l lVar, r rVar, Set set, AtomicBoolean atomicBoolean) {
        this.f53201d = lVar;
        this.f53198a = rVar;
        this.f53199b = set;
        this.f53200c = atomicBoolean;
    }

    @Override // com.google.android.play.core.d.i
    public final void a(ZipFile zipFile, Set<k> set) {
        this.f53201d.a(this.f53198a, set, new e(this));
    }
}
