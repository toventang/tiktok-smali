package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.c;
import com.google.android.play.core.b.ca;
import com.google.android.play.core.tasks.m;
import java.util.ArrayList;
import java.util.List;

final class f extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f53044a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f53045b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r f53046c;

    static {
        Covode.recordClassIndex(32760);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    f(r rVar, m mVar, List list, m mVar2) {
        super(mVar);
        this.f53046c = rVar;
        this.f53044a = list;
        this.f53045b = mVar2;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        List<String> list = this.f53044a;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        try {
            ((ca) this.f53046c.f53084d.f53166k).a(this.f53046c.f53082b, arrayList, r.b(), new m(this.f53046c, this.f53045b, (byte) 0));
        } catch (RemoteException unused) {
            r.f53080a.c("cancelDownloads(%s)", this.f53044a);
        }
    }
}
