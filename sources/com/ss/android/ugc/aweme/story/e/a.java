package com.ss.android.ugc.aweme.story.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, C3587a> f137035a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final a f137036b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(89592);
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f137039a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f137040b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f137041c;

        static {
            Covode.recordClassIndex(89594);
        }

        public b(String str, long j2, String str2) {
            this.f137039a = str;
            this.f137040b = j2;
            this.f137041c = str2;
        }

        public final void run() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", this.f137039a);
            jSONObject.put("duration", String.valueOf(this.f137040b));
            jSONObject.put("enter_from", this.f137041c);
            r.a("story_page_load", jSONObject);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.e.a$a  reason: collision with other inner class name */
    public static final class C3587a {

        /* renamed from: a  reason: collision with root package name */
        public final String f137037a;

        /* renamed from: b  reason: collision with root package name */
        public final long f137038b;

        static {
            Covode.recordClassIndex(89593);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3587a)) {
                return false;
            }
            C3587a aVar = (C3587a) obj;
            return l.a(this.f137037a, aVar.f137037a) && this.f137038b == aVar.f137038b;
        }

        public final int hashCode() {
            String str = this.f137037a;
            int hashCode = str != null ? str.hashCode() : 0;
            long j2 = this.f137038b;
            return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "SceneData(scene=" + this.f137037a + ", beginTime=" + this.f137038b + ")";
        }

        public C3587a(String str, long j2) {
            l.d(str, "");
            this.f137037a = str;
            this.f137038b = j2;
        }
    }
}
