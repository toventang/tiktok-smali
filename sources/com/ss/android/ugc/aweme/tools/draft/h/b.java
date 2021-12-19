package com.ss.android.ugc.aweme.tools.draft.h;

import android.text.format.DateFormat;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.tools.utils.q;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f139785a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f139786b = i.a((h.f.a.a) a.f139787a);

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.h.b$b  reason: collision with other inner class name */
    static final class RunnableC3689b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f139788a;

        static {
            Covode.recordClassIndex(91369);
        }

        RunnableC3689b(a aVar) {
            this.f139788a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.draft.h.b$b$a */
        public static final class a extends com.google.gson.b.a<List<? extends a>> {
            static {
                Covode.recordClassIndex(91370);
            }

            a() {
            }
        }

        public final void run() {
            f G = g.a().G();
            String string = b.a().getString("db_event", "");
            if (string == null || string.length() == 0) {
                b.a().storeString("db_event", G.b(n.a(this.f139788a)));
                return;
            }
            Type type = new a().type;
            Object a2 = G.a(string, type);
            l.b(a2, "");
            List list = (List) a2;
            list.add(0, this.f139788a);
            b.a().storeString("db_event", G.b(list, type));
        }
    }

    public static Keva a() {
        return (Keva) f139786b.getValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f139787a = new a();

        static {
            Covode.recordClassIndex(91368);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("aweme-draft-db-log");
        }
    }

    static int b() {
        return g.a().w().h();
    }

    static {
        Covode.recordClassIndex(91367);
    }

    static void a(a aVar) {
        if (SettingsManager.a().a("record_draft_db_log", true)) {
            com.ss.android.ugc.aweme.tools.b.f138752a.execute(new RunnableC3689b(aVar));
        }
    }

    /* access modifiers changed from: private */
    public static String a(long j2, String str) {
        if (j2 <= 0) {
            return "";
        }
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(str));
        l.b(instance, "");
        instance.setTimeInMillis(j2);
        return DateFormat.format("yyyy-MM-dd hh:mm:ss a", instance).toString();
    }

    public static final void a(String str, boolean z) {
        l.d(str, "");
        if (!z) {
            q.a("aweme-draft-monitor", str);
        }
    }
}
