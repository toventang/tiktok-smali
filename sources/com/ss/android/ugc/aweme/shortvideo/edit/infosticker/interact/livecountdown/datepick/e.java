package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.c;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public final class e extends d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f127398c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final Context f127399b;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f127400d;

    /* renamed from: e  reason: collision with root package name */
    private final Calendar f127401e;

    static {
        Covode.recordClassIndex(83538);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.d
    public final int a(String str) {
        l.d(str, "");
        return 0;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83539);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.d
    public final Integer b() {
        return 30;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.d
    public final Integer a() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.d
    public final String a(int i2) {
        if (i2 > 30 || i2 < 0) {
            return "";
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.f127401e.getTimeInMillis());
        gregorianCalendar.add(5, i2);
        if (this.f127401e.get(1) == gregorianCalendar.get(1) && this.f127401e.get(2) == gregorianCalendar.get(2) && this.f127401e.get(5) == gregorianCalendar.get(5)) {
            String string = this.f127399b.getResources().getString(R.string.avy);
            l.b(string, "");
            return string;
        }
        int i3 = gregorianCalendar.get(5);
        if (c.a(this.f127399b)) {
            return i3 + ' ' + this.f127400d.get(gregorianCalendar.get(2));
        }
        return this.f127400d.get(gregorianCalendar.get(2)) + ' ' + i3;
    }

    public e(Context context, Calendar calendar) {
        l.d(context, "");
        l.d(calendar, "");
        this.f127399b = context;
        this.f127401e = calendar;
        this.f127400d = n.b(context.getResources().getString(R.string.avq), context.getResources().getString(R.string.avp), context.getResources().getString(R.string.avt), context.getResources().getString(R.string.avm), context.getResources().getString(R.string.avu), context.getResources().getString(R.string.avs), context.getResources().getString(R.string.avr), context.getResources().getString(R.string.avn), context.getResources().getString(R.string.avx), context.getResources().getString(R.string.avw), context.getResources().getString(R.string.avv), context.getResources().getString(R.string.avo));
    }
}
