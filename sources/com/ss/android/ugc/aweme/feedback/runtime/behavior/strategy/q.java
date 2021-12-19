package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.b;
import com.ss.android.ugc.aweme.runtime.behavior.c;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class q extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f95454a = new a((byte) 0);

    static {
        Covode.recordClassIndex(60475);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String a() {
        return "abnor_wallpaper";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60476);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final long b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String c() {
        long currentTimeMillis = System.currentTimeMillis() - b();
        List<c> a2 = b.a("wallpaper_set_error", currentTimeMillis);
        List<c> a3 = b.a("wallpaper_set_success", currentTimeMillis);
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        if (!a3.isEmpty()) {
            sb.append("WallpaperSetSuccessTimes: " + a3.size() + ';');
        }
        if (!a2.isEmpty()) {
            sb.append("WallpaperSetErrorTimes: " + a2.size() + "(isTTPlayer:");
            for (c cVar : a2) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(cVar.f120725d);
                z = false;
            }
            sb.append(");");
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final boolean a(String str) {
        l.d(str, "");
        int hashCode = str.hashCode();
        if (hashCode != -1174434322) {
            if (hashCode == 556833385 && str.equals("wallpaper_set_success")) {
                return true;
            }
            return false;
        } else if (str.equals("wallpaper_set_error")) {
            return true;
        } else {
            return false;
        }
    }
}
