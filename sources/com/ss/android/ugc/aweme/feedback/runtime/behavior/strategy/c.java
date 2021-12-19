package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.b;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f95417a = new a((byte) 0);

    static {
        Covode.recordClassIndex(60431);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String a() {
        return "abnor_download";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60432);
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
        List<com.ss.android.ugc.aweme.runtime.behavior.c> a2 = b.a("download_start", currentTimeMillis);
        List<com.ss.android.ugc.aweme.runtime.behavior.c> a3 = b.a("download_cancel", currentTimeMillis);
        List<com.ss.android.ugc.aweme.runtime.behavior.c> a4 = b.a("download_success", currentTimeMillis);
        List<com.ss.android.ugc.aweme.runtime.behavior.c> a5 = b.a("download_error", currentTimeMillis);
        List<com.ss.android.ugc.aweme.runtime.behavior.c> a6 = b.a("water_mark_start", currentTimeMillis);
        List<com.ss.android.ugc.aweme.runtime.behavior.c> a7 = b.a("water_mark_cancel", currentTimeMillis);
        List<com.ss.android.ugc.aweme.runtime.behavior.c> a8 = b.a("water_mark_success", currentTimeMillis);
        List<com.ss.android.ugc.aweme.runtime.behavior.c> a9 = b.a("water_mark_error", currentTimeMillis);
        StringBuilder sb = new StringBuilder();
        if (!a2.isEmpty()) {
            sb.append("DownloadTimes: " + a2.size() + ';');
        }
        if (!a3.isEmpty()) {
            sb.append("DownloadCancel: " + a3.size() + ';');
        }
        if (!a4.isEmpty()) {
            sb.append("DownloadSuccess: " + a4.size() + ';');
        }
        if (!a5.isEmpty()) {
            sb.append("DownloadError: " + a5.size() + "(ECode:");
            boolean z = true;
            for (com.ss.android.ugc.aweme.runtime.behavior.c cVar : a5) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(cVar.f120725d);
                z = false;
            }
            sb.append(");");
        }
        if (!a6.isEmpty()) {
            sb.append("WatermarkTimes: " + a6.size() + ';');
        }
        if (!a7.isEmpty()) {
            sb.append("WatermarkCancel: " + a7.size() + ';');
        }
        if (!a8.isEmpty()) {
            sb.append("WatermarkSuccess: " + a8.size() + ';');
        }
        if (!a9.isEmpty()) {
            sb.append("WatermarkError: " + a9.size() + ';');
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final boolean a(String str) {
        l.d(str, "");
        switch (str.hashCode()) {
            case -1826452220:
                if (str.equals("water_mark_cancel")) {
                    return true;
                }
                return false;
            case -210589876:
                if (str.equals("download_success")) {
                    return true;
                }
                return false;
            case 71186961:
                if (str.equals("download_cancel")) {
                    return true;
                }
                return false;
            case 974485393:
                if (str.equals("download_error")) {
                    return true;
                }
                return false;
            case 987458027:
                if (str.equals("download_start")) {
                    return true;
                }
                return false;
            case 1051818558:
                if (str.equals("water_mark_error")) {
                    return true;
                }
                return false;
            case 1064791192:
                if (str.equals("water_mark_start")) {
                    return true;
                }
                return false;
            case 1092137657:
                if (str.equals("water_mark_success")) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
