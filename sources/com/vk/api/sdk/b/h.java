package com.vk.api.sdk.b;

import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.f;
import h.f.a.q;
import h.f.b.ab;
import h.f.b.i;
import h.f.b.l;
import h.k.d;
import h.z;
import java.util.concurrent.CountDownLatch;

public final class h<T> extends f<T> {

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f156263b;

    static {
        Covode.recordClassIndex(103773);
    }

    static final /* synthetic */ class a extends i implements q<f, String, f.a<String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f156264a = new a();

        static {
            Covode.recordClassIndex(103774);
        }

        a() {
            super(3);
        }

        @Override // h.f.b.c, h.k.b
        public final String getName() {
            return "handleCaptcha";
        }

        @Override // h.f.b.c
        public final String getSignature() {
            return "handleCaptcha(Ljava/lang/String;Lcom/vk/api/sdk/VKApiValidationHandler$Callback;)V";
        }

        @Override // h.f.b.c
        public final d getOwner() {
            return ab.a(f.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(f fVar, String str, f.a<String> aVar) {
            f fVar2 = fVar;
            String str2 = str;
            f.a<String> aVar2 = aVar;
            l.c(fVar2, "");
            l.c(str2, "");
            l.c(aVar2, "");
            fVar2.a(str2, aVar2);
            return z.f158842a;
        }
    }

    static final /* synthetic */ class b extends i implements q<f, String, f.a<Boolean>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f156265a = new b();

        static {
            Covode.recordClassIndex(103775);
        }

        b() {
            super(3);
        }

        @Override // h.f.b.c, h.k.b
        public final String getName() {
            return "handleConfirm";
        }

        @Override // h.f.b.c
        public final String getSignature() {
            return "handleConfirm(Ljava/lang/String;Lcom/vk/api/sdk/VKApiValidationHandler$Callback;)V";
        }

        @Override // h.f.b.c
        public final d getOwner() {
            return ab.a(f.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(f fVar, String str, f.a<Boolean> aVar) {
            f fVar2 = fVar;
            String str2 = str;
            f.a<Boolean> aVar2 = aVar;
            l.c(fVar2, "");
            l.c(str2, "");
            l.c(aVar2, "");
            fVar2.c(str2, aVar2);
            return z.f158842a;
        }
    }

    static final /* synthetic */ class c extends i implements q<f, String, f.a<f.b>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f156266a = new c();

        static {
            Covode.recordClassIndex(103776);
        }

        c() {
            super(3);
        }

        @Override // h.f.b.c, h.k.b
        public final String getName() {
            return "handleValidation";
        }

        @Override // h.f.b.c
        public final String getSignature() {
            return "handleValidation(Ljava/lang/String;Lcom/vk/api/sdk/VKApiValidationHandler$Callback;)V";
        }

        @Override // h.f.b.c
        public final d getOwner() {
            return ab.a(f.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(f fVar, String str, f.a<f.b> aVar) {
            f fVar2 = fVar;
            String str2 = str;
            f.a<f.b> aVar2 = aVar;
            l.c(fVar2, "");
            l.c(str2, "");
            l.c(aVar2, "");
            fVar2.b(str2, aVar2);
            return z.f158842a;
        }
    }

    @Override // com.vk.api.sdk.b.b
    public final T a(a aVar) {
        l.c(aVar, "");
        int i2 = this.f156259c;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                try {
                    return this.f156263b.a(aVar);
                } catch (com.vk.api.sdk.c.b e2) {
                    if (e2.isCaptchaError()) {
                        String str = (String) a(e2.getCaptchaImg(), this.f156250a.f156267a, a.f156264a);
                        if (str != null) {
                            String captchaSid = e2.getCaptchaSid();
                            l.c(captchaSid, "");
                            aVar.f156247a = captchaSid;
                            l.c(str, "");
                            aVar.f156248b = str;
                        } else {
                            throw e2;
                        }
                    } else if (e2.isValidationRequired()) {
                        f.b bVar = (f.b) a(e2.getValidationUrl(), this.f156250a.f156267a, c.f156266a);
                        l.c(e2, "");
                        if (bVar == null || !bVar.f156311a) {
                            throw e2;
                        }
                        com.vk.api.sdk.d dVar = this.f156250a;
                        String str2 = bVar.f156313c;
                        if (str2 == null) {
                            l.a();
                        }
                        dVar.a(str2, bVar.f156312b);
                    } else if (e2.isUserConfirmRequired()) {
                        Boolean bool = (Boolean) a(e2.getUserConfirmText(), this.f156250a.f156267a, b.f156265a);
                        if (bool == null) {
                            throw e2;
                        } else if (!l.a((Object) bool, (Object) false)) {
                            aVar.f156249c = bool.booleanValue();
                        } else {
                            throw e2;
                        }
                    } else {
                        f fVar = this.f156250a.f156267a;
                        if (fVar != null) {
                            fVar.a(e2, this.f156250a);
                        } else {
                            throw e2;
                        }
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        throw new com.vk.api.sdk.c.a("Can't confirm validation due to retry limit!");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.vk.api.sdk.b.b<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(com.vk.api.sdk.d dVar, int i2, b<? extends T> bVar) {
        super(dVar, i2);
        l.c(dVar, "");
        l.c(bVar, "");
        this.f156263b = bVar;
    }

    private static <T, H> T a(String str, H h2, q<? super H, ? super String, ? super f.a<T>, z> qVar) {
        l.c(str, "");
        l.c(qVar, "");
        if (h2 == null) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        f.a aVar = new f.a(countDownLatch);
        qVar.invoke(h2, str, aVar);
        countDownLatch.await();
        return aVar.f156305a;
    }
}
