package com.ss.android.ugc.aweme.account.login.g;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;
import h.f.a.q;
import h.f.b.j;
import h.f.b.l;
import h.z;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C1411a f63453b = new C1411a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f63454a;

    public interface b {
        static {
            Covode.recordClassIndex(39101);
        }

        void a();

        void b();
    }

    public final /* synthetic */ class d implements OnActivityResultCallback {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ q f63455a;

        static {
            Covode.recordClassIndex(39103);
        }

        public d(q qVar) {
            this.f63455a = qVar;
        }

        @Override // com.bytedance.router.OnActivityResultCallback
        public final /* synthetic */ void onActivityResult(int i2, int i3, Intent intent) {
            l.b(this.f63455a.invoke(Integer.valueOf(i2), Integer.valueOf(i3), intent), "");
        }
    }

    static {
        Covode.recordClassIndex(39099);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.g.a$a  reason: collision with other inner class name */
    public static final class C1411a {
        static {
            Covode.recordClassIndex(39100);
        }

        private C1411a() {
        }

        public /* synthetic */ C1411a(byte b2) {
            this();
        }
    }

    public static final /* synthetic */ class c extends j implements q<Integer, Integer, Intent, z> {
        static {
            Covode.recordClassIndex(39102);
        }

        public c(a aVar) {
            super(3, aVar, a.class, "onActivityResult", "onActivityResult(IILandroid/content/Intent;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(Integer num, Integer num2, Intent intent) {
            b bVar;
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            a aVar = (a) this.receiver;
            if (intValue == 10086) {
                if (intValue2 == -1) {
                    b bVar2 = aVar.f63454a;
                    if (bVar2 != null) {
                        bVar2.a();
                    }
                } else if (intValue2 == 0 && (bVar = aVar.f63454a) != null) {
                    bVar.b();
                }
            }
            return z.f158842a;
        }
    }
}
