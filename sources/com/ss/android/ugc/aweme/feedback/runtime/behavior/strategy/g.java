package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.format.DateFormat;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import h.a.n;
import h.f.b.l;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public final class g extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f95421a = new a((byte) 0);

    static {
        Covode.recordClassIndex(60437);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String a() {
        return "abor_draft_local_info";
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final boolean a(String str) {
        l.d(str, "");
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60438);
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
        String a2;
        long j2;
        IAVDraftService draftService = AVExternalServiceImpl.a().draftService();
        int queryDraftListCount = draftService.queryDraftListCount(true);
        List<Integer> queryUserDraftCounts = draftService.queryUserDraftCounts(false);
        int u = n.u(queryUserDraftCounts) + queryDraftListCount;
        File file = new File(draftService.getReadableDBPath());
        if (!file.exists() || !file.isFile()) {
            a2 = a(-1);
        } else {
            a2 = a(file.lastModified());
        }
        String dBCreationTime = draftService.getDBCreationTime();
        if (dBCreationTime == null || dBCreationTime.length() == 0) {
            if (!file.exists() || !file.isFile()) {
                dBCreationTime = "Unknown";
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    j2 = Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis();
                } else {
                    j2 = -1;
                }
                dBCreationTime = a(j2);
            }
        }
        File dataDirectory = Environment.getDataDirectory();
        l.b(dataDirectory, "");
        StatFs statFs = new StatFs(dataDirectory.getPath());
        int i2 = Build.VERSION.SDK_INT;
        long blockSizeLong = statFs.getBlockSizeLong();
        int i3 = Build.VERSION.SDK_INT;
        LocalDraftLog localDraftLog = new LocalDraftLog("draft_count", dBCreationTime, a2, queryDraftListCount, u, queryUserDraftCounts, b(statFs.getAvailableBlocksLong() * blockSizeLong));
        GsonProvider c2 = GsonHolder.c();
        l.b(c2, "");
        String b2 = c2.b().b(localDraftLog);
        l.b(b2, "");
        return b2;
    }

    private static String a(long j2) {
        if (j2 <= 0) {
            return "Unknown";
        }
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        l.b(instance, "");
        instance.setTimeInMillis(j2);
        return DateFormat.format("yyyy-MM-dd hh:mm:ss a", instance).toString();
    }

    private static String b(long j2) {
        if (j2 < 0) {
            return "Unknown";
        }
        String str = null;
        if (j2 >= 1024) {
            j2 /= 1024;
            if (j2 >= 1024) {
                j2 /= 1024;
                str = "MB";
            } else {
                str = "KB";
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j2));
        int length = sb.length();
        while (true) {
            length -= 3;
            if (length <= 0) {
                break;
            }
            sb.insert(length, ',');
        }
        if (str != null) {
            sb.append(str);
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }
}
