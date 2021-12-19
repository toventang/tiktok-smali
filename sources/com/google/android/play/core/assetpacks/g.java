package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.c;
import com.google.android.play.core.b.ca;
import com.google.android.play.core.tasks.m;
import java.util.ArrayList;
import java.util.Map;

final class g extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Map f53047a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f53048b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r f53049c;

    static {
        Covode.recordClassIndex(32761);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g(r rVar, m mVar, Map map, m mVar2) {
        super(mVar);
        this.f53049c = rVar;
        this.f53047a = map;
        this.f53048b = mVar2;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        try {
            ca caVar = (ca) this.f53049c.f53084d.f53166k;
            String str = this.f53049c.f53082b;
            Map map = this.f53047a;
            Bundle b2 = r.b();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            for (Map.Entry entry : map.entrySet()) {
                Bundle bundle = new Bundle();
                bundle.putString("installed_asset_module_name", (String) entry.getKey());
                bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
                arrayList.add(bundle);
            }
            b2.putParcelableArrayList("installed_asset_module", arrayList);
            caVar.a(str, b2, new o(this.f53049c, this.f53048b));
        } catch (RemoteException e2) {
            r.f53080a.c("syncPacks", new Object[0]);
            this.f53048b.b(new RuntimeException(e2));
        }
    }
}
