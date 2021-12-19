package com.ss.android.ugc.aweme.video.simcommon.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.bitrateselector.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.b;
import com.ss.android.ugc.f.a.a.a.a.a;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final e f143789a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, b> f143790b;

    /* renamed from: c  reason: collision with root package name */
    private static Map<String, ? extends b> f143791c;

    /* renamed from: d  reason: collision with root package name */
    private static IAwemeService f143792d;

    private e() {
    }

    static {
        Covode.recordClassIndex(94078);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: java.util.Map<java.lang.String, com.ss.android.ugc.aweme.simkit.model.bitrateselect.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a() {
        Map<String, b> map;
        Map<String, ? extends b> map2;
        Map<String, b> map3;
        if (f143790b == null) {
            a a2 = b.a();
            if (a2 == null || (map = a2.f143779a) == null) {
                map = new HashMap<>();
            }
            f143790b = map;
            a a3 = b.a();
            if (a3 == null || (map2 = a3.f143780b) == null) {
                map2 = new HashMap<>();
            }
            f143791c = map2;
            Set<String> keySet = map2.keySet();
            if (keySet != null) {
                for (T t : keySet) {
                    for (String str : p.c(t, new String[]{","})) {
                        Map<String, ? extends b> map4 = f143791c;
                        if (map4 == null) {
                            l.b();
                        }
                        Object obj = map4.get(t);
                        if (!(TextUtils.isEmpty(str) || obj == null || (map3 = f143790b) == 0)) {
                            map3.put(str, obj);
                        }
                    }
                }
            }
            f143792d = AwemeService.b();
        }
    }

    private static a b(String str) {
        String str2;
        Map<String, b> map;
        Aweme b2;
        List<TextExtraStruct> textExtra;
        TextExtraStruct textExtraStruct;
        if (f143790b == null) {
            return null;
        }
        IAwemeService iAwemeService = f143792d;
        if (iAwemeService == null || (b2 = iAwemeService.b(str)) == null || (textExtra = b2.getTextExtra()) == null || (textExtraStruct = (TextExtraStruct) n.h((List) textExtra)) == null) {
            str2 = null;
        } else {
            str2 = textExtraStruct.getHashTagName();
        }
        if (!TextUtils.isEmpty(str2) && (map = f143790b) != null) {
            if (str2 == null) {
                l.b();
            }
            b bVar = map.get(str2);
            if (bVar != null) {
                return d.a(bVar);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.bitrateselector.a.c
    public final a a(String str) {
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        a();
        Double d6 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str == null) {
            l.b();
        }
        a b2 = b(str);
        StringBuilder append = new StringBuilder("getAutoBitrateSet ").append(str).append(' ').append(b2).append(" first ");
        if (b2 != null) {
            d2 = Double.valueOf(b2.a());
        } else {
            d2 = null;
        }
        StringBuilder append2 = append.append(d2).append(" second ");
        if (b2 != null) {
            d3 = Double.valueOf(b2.b());
        } else {
            d3 = null;
        }
        StringBuilder append3 = append2.append(d3).append(" third ");
        if (b2 != null) {
            d4 = Double.valueOf(b2.c());
        } else {
            d4 = null;
        }
        StringBuilder append4 = append3.append(d4).append(" fourth ");
        if (b2 != null) {
            d5 = Double.valueOf(b2.d());
        } else {
            d5 = null;
        }
        StringBuilder append5 = append4.append(d5).append(" minBitrate ");
        if (b2 != null) {
            d6 = Double.valueOf(b2.e());
        }
        append5.append(d6);
        return b2;
    }
}
