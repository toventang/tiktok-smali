package com.ss.android.ugc.aweme.share.i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.trill.share.data.a;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    private final Map f123571a;

    /* renamed from: b  reason: collision with root package name */
    private final List f123572b;

    static {
        Covode.recordClassIndex(81119);
    }

    b(Map map, List list) {
        this.f123571a = map;
        this.f123572b = list;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Map map = this.f123571a;
        List<a> list = this.f123572b;
        String str = (String) obj;
        String str2 = (String) obj2;
        int intValue = ((Integer) map.get(str2)).intValue() - ((Integer) map.get(str)).intValue();
        if (intValue != 0) {
            return intValue;
        }
        long j2 = 0;
        long j3 = 0;
        for (a aVar : list) {
            if (TextUtils.equals(aVar.f150668c, str) && j3 <= 0) {
                j3 = aVar.f150667b.longValue();
            } else if (TextUtils.equals(aVar.f150668c, str2) && j2 <= 0) {
                j2 = aVar.f150667b.longValue();
            }
        }
        return (int) (j2 - j3);
    }
}
