package com.bytedance.ies.xbridge.system.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class g extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f36501j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f36502a;

    /* renamed from: b  reason: collision with root package name */
    public long f36503b;

    /* renamed from: c  reason: collision with root package name */
    public String f36504c;

    /* renamed from: d  reason: collision with root package name */
    public String f36505d;

    /* renamed from: e  reason: collision with root package name */
    public String f36506e;

    /* renamed from: f  reason: collision with root package name */
    public Long f36507f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f36508g;

    /* renamed from: h  reason: collision with root package name */
    public String f36509h;

    /* renamed from: i  reason: collision with root package name */
    public String f36510i;

    static {
        Covode.recordClassIndex(21898);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21899);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.b("endDate", "startDate", "eventID", "title", "notes", "alarmOffsets", "allDay", "location", "url");
    }

    public final String toString() {
        String canonicalName = getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "XCalendarMethodParamModel";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(canonicalName + '(');
        sb.append("eventID = " + this.f36504c + " , ");
        sb.append("startDate = " + this.f36503b + " , ");
        sb.append("endDate = " + this.f36502a + " , ");
        sb.append("alarmOffsets = [ " + this.f36507f + ' ');
        sb.append("], ");
        sb.append("allDay = " + this.f36508g + " , ");
        sb.append("title = " + this.f36505d + " , ");
        sb.append("notes = " + this.f36506e + " , ");
        sb.append("location = " + this.f36509h + " , ");
        sb.append("url = " + this.f36510i + ')');
        String sb2 = sb.toString();
        l.a((Object) sb2, "");
        return sb2;
    }
}
