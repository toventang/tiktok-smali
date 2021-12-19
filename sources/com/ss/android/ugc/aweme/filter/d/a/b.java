package com.ss.android.ugc.aweme.filter.d.a;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.filter.repository.a.f;
import com.ss.android.ugc.aweme.filter.repository.internal.d;
import com.ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences;
import com.ss.android.ugc.aweme.filter.repository.internal.main.a;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.List;

public final class b extends a {
    static {
        Covode.recordClassIndex(60505);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.e, com.ss.android.ugc.aweme.filter.repository.internal.main.a
    public final List<f> a() {
        List list;
        d();
        String[] strArr = c().f95643a;
        String[] strArr2 = c().f95644b;
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            int i4 = i3 + 1;
            c();
            int intValue = c().f95645c[i3].intValue();
            int i5 = -1 - i3;
            String valueOf = String.valueOf(i5);
            String str2 = strArr2[i3];
            if (i3 == 0) {
                list = n.c("normal");
            } else {
                list = z.INSTANCE;
            }
            arrayList.add(new f(i5, valueOf, str, str2, null, list, null, Uri.parse("res://" + this.f95636a.getPackageName() + '/' + intValue), ""));
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.e, com.ss.android.ugc.aweme.filter.repository.internal.main.a
    public final d a(int i2) {
        d a2 = super.a(i2);
        if (com.ss.android.ugc.aweme.filter.b.b.a()) {
            return new d(a2.f95588a, b(-1 - i2));
        }
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, int i2, List<p<int[], String>> list, q<com.ss.android.ugc.aweme.filter.repository.internal.main.b> qVar, AndroidResourceFilterBackupPreferences androidResourceFilterBackupPreferences) {
        super(context, str, i2, list, qVar, androidResourceFilterBackupPreferences);
        l.d(context, "");
        l.d(str, "");
        l.d(list, "");
        l.d(qVar, "");
        l.d(androidResourceFilterBackupPreferences, "");
    }
}
