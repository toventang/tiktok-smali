package com.google.android.play.core.e;

import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.aq;
import com.google.android.play.core.b.c;
import java.util.ArrayList;
import java.util.Collection;

/* access modifiers changed from: package-private */
public final class m extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Collection f53330a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Collection f53331b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.tasks.m f53332c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ t f53333d;

    static {
        Covode.recordClassIndex(32941);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    m(t tVar, com.google.android.play.core.tasks.m mVar, Collection collection, Collection collection2, com.google.android.play.core.tasks.m mVar2) {
        super(mVar);
        this.f53333d = tVar;
        this.f53330a = collection;
        this.f53331b = collection2;
        this.f53332c = mVar2;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        Collection<String> collection = this.f53330a;
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        arrayList.addAll(t.a(this.f53331b));
        try {
            ((aq) this.f53333d.f53345c.f53166k).a(this.f53333d.f53344b, arrayList, t.a(), new r(this.f53333d, this.f53332c));
        } catch (RemoteException e2) {
            t.f53342a.c("startInstall(%s,%s)", this.f53330a, this.f53331b);
            this.f53332c.b(new RuntimeException(e2));
        }
    }
}
