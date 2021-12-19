package com.google.android.play.core.d;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
public final class g implements i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Set f53202a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r f53203b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l f53204c;

    static {
        Covode.recordClassIndex(32881);
    }

    g(l lVar, Set set, r rVar) {
        this.f53204c = lVar;
        this.f53202a = set;
        this.f53203b = rVar;
    }

    @Override // com.google.android.play.core.d.i
    public final void a(ZipFile zipFile, Set<k> set) {
        Set set2 = this.f53202a;
        l lVar = this.f53204c;
        r rVar = this.f53203b;
        HashSet hashSet = new HashSet();
        lVar.a(rVar, set, new h(hashSet, rVar, zipFile));
        set2.addAll(hashSet);
    }
}
