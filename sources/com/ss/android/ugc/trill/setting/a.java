package com.ss.android.ugc.trill.setting;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.a.a.a.d;
import com.ss.android.ugc.a.a.b.a;
import com.ss.android.ugc.a.a.c.b;
import java.util.Iterator;

public abstract class a<P extends com.ss.android.ugc.a.a.b.a> extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    private b<P> f150569a;

    static {
        Covode.recordClassIndex(99009);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        super.onPause();
    }

    public final P a() {
        return this.f150569a.a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.trill.setting.a<P extends com.ss.android.ugc.a.a.b.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        super.onResume();
        b<P> bVar = this.f150569a;
        bVar.a();
        if (bVar.f61893b != null && !bVar.f61895d) {
            bVar.f61893b.f61889a = this;
            bVar.f61895d = true;
        }
    }

    public a() {
        Class<? extends com.ss.android.ugc.a.a.b.a> a2;
        com.ss.android.ugc.a.a.a.b bVar = (com.ss.android.ugc.a.a.a.b) getClass().getAnnotation(com.ss.android.ugc.a.a.a.b.class);
        com.ss.android.ugc.a.a.a.a aVar = null;
        if (!(bVar == null || (a2 = bVar.a()) == null)) {
            aVar = new com.ss.android.ugc.a.a.a.a(a2);
        }
        this.f150569a = new b<>(aVar);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        b<P> bVar = this.f150569a;
        if (bVar.f61893b != null && bVar.f61895d) {
            bVar.f61893b.f61889a = null;
            bVar.f61895d = false;
        }
        super.onDestroy();
        b<P> bVar2 = this.f150569a;
        boolean z = !isChangingConfigurations();
        if (bVar2.f61893b != null && z) {
            Iterator<a.AbstractC1348a> it = bVar2.f61893b.f61890b.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            bVar2.f61893b = null;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        b<P> bVar = this.f150569a;
        Bundle bundle2 = new Bundle();
        bVar.a();
        if (bVar.f61893b != null) {
            bundle2.putBundle("presenter", new Bundle());
            bundle2.putString("presenter_id", d.INSTANCE.getId(bVar.f61893b));
        }
        bundle.putBundle("presenter_state", bundle2);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            b<P> bVar = this.f150569a;
            Bundle bundle2 = bundle.getBundle("presenter_state");
            if (bVar.f61893b == null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeValue(bundle2);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                Parcel obtain2 = Parcel.obtain();
                obtain2.unmarshall(marshall, 0, marshall.length);
                obtain2.setDataPosition(0);
                Object readValue = obtain2.readValue(com.ss.android.ugc.a.a.c.a.f61891a);
                obtain2.recycle();
                bVar.f61894c = (Bundle) readValue;
                return;
            }
            throw new IllegalArgumentException("onRestoreInstanceState() should be called before onResume()");
        }
    }
}
