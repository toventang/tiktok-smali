package com.ss.android.ugc.aweme.shortvideo.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.m.l;
import h.p;
import java.util.ArrayList;
import java.util.List;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public static final ak f132203a = new ak();

    public interface a {
        static {
            Covode.recordClassIndex(86583);
        }

        p<Boolean, p<Integer, Boolean>> a(int i2, int i3);
    }

    private ak() {
    }

    static {
        Covode.recordClassIndex(86582);
    }

    public static int a() {
        return com.bytedance.ies.abmock.b.a().a(true, "fast_import_fps_limit", 40);
    }

    private static p<Integer, Integer> b() {
        String str = "1100*";
        if (TextUtils.isEmpty(str) || !new l("[0-9]+\\*[0-9]*").matches(str)) {
            str = "720*1280";
        }
        List<String> b2 = h.m.p.b(str, new String[]{"*"});
        if (h.f.b.l.a((Object) b2.get(1), (Object) "")) {
            return new p<>(Integer.valueOf(Integer.parseInt(b2.get(0))), -1);
        }
        return new p<>(Integer.valueOf(Integer.parseInt(b2.get(0))), Integer.valueOf(Integer.parseInt(b2.get(1))));
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final int f132204a = 721;

        /* renamed from: b  reason: collision with root package name */
        public final int f132205b;

        static {
            Covode.recordClassIndex(86584);
        }

        public b(int i2) {
            this.f132205b = i2;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.util.ak.a
        public final p<Boolean, p<Integer, Boolean>> a(int i2, int i3) {
            int a2 = ak.a();
            int max = Math.max(SettingsManager.a().a("fast_import_1080p_higher_fps_limited", 60), a2);
            int i4 = this.f132204a;
            int i5 = this.f132205b;
            if (i4 > i2 || i5 < i2) {
                return new p<>(false, new p(-1, false));
            }
            if (i3 <= a2 && SettingsManager.a().a("fast_import_1080p_lower_benchmark_enable", false)) {
                return new p<>(true, new p(0, false));
            }
            if (a2 + 1 <= i3 && max >= i3 && SettingsManager.a().a("fast_import_1080p_higher_benchmark_enable", false)) {
                return new p<>(true, new p(0, true));
            }
            return new p<>(true, new p(-11005, false));
        }
    }

    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final int f132206a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final int f132207b = 720;

        static {
            Covode.recordClassIndex(86585);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.util.ak.a
        public final p<Boolean, p<Integer, Boolean>> a(int i2, int i3) {
            int a2 = ak.a();
            int max = Math.max(SettingsManager.a().a("fast_import_720p_higher_fps_limited", 60), a2);
            int i4 = this.f132206a;
            int i5 = this.f132207b;
            if (i4 > i2 || i5 < i2) {
                return new p<>(false, new p(-1, false));
            }
            if (i3 <= a2 || (a2 + 1 <= i3 && max >= i3 && SettingsManager.a().a("fast_import_720p_higher_benchmark_enable", false))) {
                return new p<>(true, new p(0, false));
            }
            return new p<>(true, new p(-11005, false));
        }
    }

    private static boolean a(p<Integer, Integer> pVar, p<Integer, Integer> pVar2) {
        if (pVar2.getSecond().intValue() <= 0) {
            if (pVar.getFirst().intValue() <= pVar2.getFirst().intValue()) {
                return true;
            }
            return false;
        } else if (pVar.getFirst().intValue() > pVar2.getFirst().intValue() || pVar.getSecond().intValue() > pVar2.getSecond().intValue()) {
            return false;
        } else {
            return true;
        }
    }

    public static p<Integer, Boolean> a(int i2, int i3, int i4) {
        p<Integer, Integer> b2 = b();
        if (!a(new p(Integer.valueOf(i2), Integer.valueOf(i3)), b2)) {
            return new p<>(-11004, false);
        }
        ArrayList<a> arrayList = new ArrayList();
        arrayList.add(new c());
        arrayList.add(new b(Math.max(721, b2.getFirst().intValue())));
        if (!arrayList.isEmpty()) {
            for (a aVar : arrayList) {
                p<Boolean, p<Integer, Boolean>> a2 = aVar.a(i2, i4);
                if (a2.getFirst().booleanValue()) {
                    return a2.getSecond();
                }
            }
        }
        return new p<>(-1, false);
    }
}
