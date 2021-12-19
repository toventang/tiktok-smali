package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.concurrent.Executor;

public interface n {

    public interface a {

        /* renamed from: com.bytedance.ies.web.jsbridge2.n$a$a  reason: collision with other inner class name */
        public interface AbstractC0809a {
            static {
                Covode.recordClassIndex(21304);
            }

            void a(String str);
        }

        static {
            Covode.recordClassIndex(21303);
        }

        String a(String str, String str2);

        void a(String str, AbstractC0809a aVar);

        void b(String str, String str2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(21305);
        }

        void a(String str);

        void a(Throwable th);
    }

    public interface c {
        static {
            Covode.recordClassIndex(21306);
        }

        boolean a(String str);

        boolean a(String str, String str2);
    }

    public interface d {
        static {
            Covode.recordClassIndex(21307);
        }
    }

    static {
        Covode.recordClassIndex(21302);
    }

    e a();

    void a(String str, String str2, byte[] bArr, b bVar);

    int b();

    String c();

    String d();

    String e();

    String f();

    Collection<String> g();

    a h();

    Executor i();

    String j();

    public enum e {
        SG("https://jsb-sg.byteoversea.com/src/server/v2/package"),
        US("https://jsb-va.byteoversea.com/src/server/v2/package");
        
        public String url;

        static {
            Covode.recordClassIndex(21308);
        }

        private e(String str) {
            this.url = str;
        }
    }
}
