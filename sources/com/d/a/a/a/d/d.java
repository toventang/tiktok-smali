package com.d.a.a.a.d;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.d.a.a.a.d.a;
import com.d.a.a.a.e.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f46396a = new int[2];

    static {
        Covode.recordClassIndex(28324);
    }

    @Override // com.d.a.a.a.d.a
    public final JSONObject a(View view) {
        if (view == null) {
            return b.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f46396a);
        int[] iArr = this.f46396a;
        return b.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.d.a.a.a.d.a
    public final void a(View view, JSONObject jSONObject, a.AbstractC1153a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            if (!z || Build.VERSION.SDK_INT < 21) {
                while (i2 < viewGroup.getChildCount()) {
                    aVar.a(viewGroup.getChildAt(i2), this, jSONObject);
                    i2++;
                }
                return;
            }
            HashMap hashMap = new HashMap();
            while (i2 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i2);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i2++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get(it.next())).iterator();
                while (it2.hasNext()) {
                    aVar.a((View) it2.next(), this, jSONObject);
                }
            }
        }
    }
}
