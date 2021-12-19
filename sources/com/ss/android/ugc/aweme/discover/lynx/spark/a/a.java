package com.ss.android.ugc.aweme.discover.lynx.spark.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.b.a.c;
import h.f.b.l;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.a.a$a  reason: collision with other inner class name */
    public interface AbstractC1903a {
        static {
            Covode.recordClassIndex(50683);
        }

        void a(String str);

        void a(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(50682);
    }

    public abstract String a();

    public abstract void a(JSONObject jSONObject, AbstractC1903a aVar);

    public static final class b extends com.bytedance.lynx.hybrid.b.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f81558a;

        static {
            Covode.recordClassIndex(50684);
        }

        @Override // com.bytedance.lynx.hybrid.b.a.b
        public final void a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.a.a$b$a  reason: collision with other inner class name */
        public static final class C1904a implements AbstractC1903a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f81559a;

            static {
                Covode.recordClassIndex(50685);
            }

            C1904a(c cVar) {
                this.f81559a = cVar;
            }

            @Override // com.ss.android.ugc.aweme.discover.lynx.spark.a.a.AbstractC1903a
            public final void a(JSONObject jSONObject) {
                l.d(jSONObject, "");
                this.f81559a.a(1, "success", jSONObject);
            }

            @Override // com.ss.android.ugc.aweme.discover.lynx.spark.a.a.AbstractC1903a
            public final void a(String str) {
                c cVar = this.f81559a;
                if (str == null) {
                    l.b();
                }
                cVar.a(0, "failed", new JSONObject(str));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(a aVar) {
            this.f81558a = aVar;
        }

        @Override // com.bytedance.lynx.hybrid.b.a.b
        public final void a(String str, String str2, c cVar) {
            l.d(str, "");
            l.d(str2, "");
            l.d(cVar, "");
            this.f81558a.a(new JSONObject(str2), new C1904a(cVar));
        }
    }
}
