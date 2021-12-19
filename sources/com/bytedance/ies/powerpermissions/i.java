package com.bytedance.ies.powerpermissions;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.c.a;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public abstract class i extends e {
    static {
        Covode.recordClassIndex(20610);
    }

    public abstract void a(m mVar, a... aVarArr);

    @Override // com.bytedance.ies.powerpermissions.e
    public final void a(m mVar, String... strArr) {
        Context context;
        a aVar;
        l.c(strArr, "");
        ArrayList arrayList = new ArrayList();
        d dVar = null;
        if (mVar != null) {
            dVar = mVar.c();
        }
        if ((dVar instanceof Fragment) && (context = ((Fragment) dVar).getContext()) != null) {
            for (String str : strArr) {
                if (j.a(context, str)) {
                    aVar = new a(str, a.EnumC0768a.GRANTED);
                } else if (j.a((Activity) context, str)) {
                    aVar = new a(str, a.EnumC0768a.DENIED_PERMANENT);
                } else {
                    aVar = new a(str, a.EnumC0768a.THIS_OPERATION_NOT_PERMITTED);
                }
                arrayList.add(aVar);
            }
            Object[] array = arrayList.toArray(new a[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            a[] aVarArr = (a[]) array;
            a(mVar, (a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        }
    }
}
