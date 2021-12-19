package com.d.a.a.a.h.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.d.a.a.a.b.l;
import com.d.a.a.a.c.a;
import com.d.a.a.a.c.e;
import com.d.a.a.a.g.a;
import com.d.a.a.a.h.a.b;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

public final class f extends a {
    static {
        Covode.recordClassIndex(28349);
    }

    public f(b.AbstractC1155b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(bVar, hashSet, jSONObject, j2);
    }

    /* access modifiers changed from: protected */
    @Override // com.d.a.a.a.h.a.b
    /* renamed from: a */
    public final void onPostExecute(String str) {
        a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = a.f46367a) != null) {
            for (l lVar : Collections.unmodifiableCollection(aVar.f46368b)) {
                if (this.f46429a.contains(lVar.f46361f)) {
                    com.d.a.a.a.g.a aVar2 = lVar.f46358c;
                    if (this.f46431c >= aVar2.f46406e) {
                        aVar2.f46405d = a.EnumC1154a.AD_STATE_VISIBLE;
                        e.f46383a.b(aVar2.c(), str);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ String doInBackground(Object[] objArr) {
        if (com.d.a.a.a.e.b.b(this.f46430b, this.f46433e.a())) {
            return null;
        }
        this.f46433e.a(this.f46430b);
        return this.f46430b.toString();
    }
}
