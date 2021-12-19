package com.ss.android.ugc.aweme.tools.draft.e;

import android.content.Context;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f139520a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(91223);
    }

    public static final String a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        return g.a().w().a() + simpleDateFormat.format(instance.getTime());
    }

    public static final String a(Context context, c cVar) {
        l.d(cVar, "");
        long j2 = cVar.C;
        if (context != null) {
            double d2 = (double) j2;
            Double.isNaN(d2);
            String string = context.getString(R.string.fpi, Double.valueOf(d2 / 1048576.0d));
            l.b(string, "");
            return string;
        }
        double d3 = (double) j2;
        Double.isNaN(d3);
        String a2 = a.a("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d3 / 1048576.0d)}, 1));
        l.b(a2, "");
        return a2;
    }
}
