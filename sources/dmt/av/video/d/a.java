package dmt.av.video.d;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final /* synthetic */ class a {
    static {
        Covode.recordClassIndex(104202);
    }

    public static final boolean a(Activity activity) {
        long j2;
        l.d(activity, "");
        if (!e.e()) {
            q.b("record check SD not available");
            new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(R.string.fhb).a();
            return false;
        }
        long a2 = ((long) b.a().a(true, "record_min_disk_amount_mb", 20)) * 1024 * 1024;
        try {
            j2 = e.f();
        } catch (Exception unused) {
            j2 = 0;
        }
        if (j2 < a2) {
            long j3 = a2 - j2;
            if (j3 > 0 && !c.f115624c.a(j3)) {
                q.b("RecordCheck disk space insufficient sdAvailableSize:" + j2 + " minDiskAmountByte:" + a2);
                Context applicationContext = activity.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(R.string.b95).a();
                return false;
            }
        }
        return true;
    }
}
