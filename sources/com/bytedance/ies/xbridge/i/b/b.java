package com.bytedance.ies.xbridge.i.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.d.d;
import com.bytedance.ies.xbridge.base.runtime.d.f;
import com.bytedance.ies.xbridge.base.runtime.d.g;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i.a.b;
import com.bytedance.ies.xbridge.i.c.c;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class b extends com.bytedance.ies.xbridge.i.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f36062a = "XDownloadFileMethod";

    static {
        Covode.recordClassIndex(21574);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f36063a;

        static {
            Covode.recordClassIndex(21575);
        }

        a(b.a aVar) {
            this.f36063a = aVar;
        }

        public final void run() {
            this.f36063a.a("file path already exist");
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.i.b.b$b  reason: collision with other inner class name */
    static final class RunnableC0841b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36064a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f36065b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f36066c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b.a f36067d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f36068e;

        static {
            Covode.recordClassIndex(21576);
        }

        RunnableC0841b(b bVar, c cVar, e eVar, b.a aVar, String str) {
            this.f36064a = bVar;
            this.f36065b = cVar;
            this.f36066c = eVar;
            this.f36067d = aVar;
            this.f36068e = str;
        }

        /* renamed from: com.bytedance.ies.xbridge.i.b.b$b$a */
        public static final class a implements com.bytedance.ies.xbridge.base.runtime.d.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RunnableC0841b f36069a;

            static {
                Covode.recordClassIndex(21577);
            }

            /* renamed from: com.bytedance.ies.xbridge.i.b.b$b$a$a  reason: collision with other inner class name */
            static final class RunnableC0842a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f36070a;

                static {
                    Covode.recordClassIndex(21578);
                }

                RunnableC0842a(a aVar) {
                    this.f36070a = aVar;
                }

                public final void run() {
                    this.f36070a.f36069a.f36067d.a("connection failed");
                }
            }

            /* renamed from: com.bytedance.ies.xbridge.i.b.b$b$a$b  reason: collision with other inner class name */
            static final class RunnableC0843b implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f36071a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f36072b;

                static {
                    Covode.recordClassIndex(21579);
                }

                RunnableC0843b(a aVar, String str) {
                    this.f36071a = aVar;
                    this.f36072b = str;
                }

                public final void run() {
                    b.a aVar = this.f36071a.f36069a.f36067d;
                    String str = this.f36072b;
                    if (str == null) {
                        str = "body is null";
                    }
                    aVar.a(str);
                }
            }

            /* renamed from: com.bytedance.ies.xbridge.i.b.b$b$a$d */
            static final class d implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f36076a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Exception f36077b;

                static {
                    Covode.recordClassIndex(21581);
                }

                d(a aVar, Exception exc) {
                    this.f36076a = aVar;
                    this.f36077b = exc;
                }

                public final void run() {
                    b.a aVar = this.f36076a.f36069a.f36067d;
                    String message = this.f36077b.getMessage();
                    if (message == null) {
                        message = "store file exception";
                    }
                    aVar.a(message);
                }
            }

            /* renamed from: com.bytedance.ies.xbridge.i.b.b$b$a$c */
            static final class c implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f36073a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f36074b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ LinkedHashMap f36075c;

                static {
                    Covode.recordClassIndex(21580);
                }

                c(a aVar, String str, LinkedHashMap linkedHashMap) {
                    this.f36073a = aVar;
                    this.f36074b = str;
                    this.f36075c = linkedHashMap;
                }

                public final void run() {
                    b.a aVar = this.f36073a.f36069a.f36067d;
                    com.bytedance.ies.xbridge.i.c.d dVar = new com.bytedance.ies.xbridge.i.c.d();
                    dVar.f36114a = this.f36074b;
                    dVar.f36115b = this.f36075c;
                    dVar.f36116c = this.f36073a.f36069a.f36068e;
                    aVar.a(dVar, "");
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(RunnableC0841b bVar) {
                this.f36069a = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:57:0x00cf A[Catch:{ IOException -> 0x00db }] */
            /* JADX WARNING: Removed duplicated region for block: B:59:0x00d4 A[Catch:{ IOException -> 0x00db }] */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x00e3  */
            /* JADX WARNING: Removed duplicated region for block: B:70:0x00ed A[Catch:{ IOException -> 0x00f6 }] */
            /* JADX WARNING: Removed duplicated region for block: B:72:0x00f2 A[Catch:{ IOException -> 0x00f6 }] */
            @Override // com.bytedance.ies.xbridge.base.runtime.d.b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(com.bytedance.ies.xbridge.base.runtime.b.a r11) {
                /*
                // Method dump skipped, instructions count: 254
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.i.b.b.RunnableC0841b.a.a(com.bytedance.ies.xbridge.base.runtime.b.a):void");
            }
        }

        public final void run() {
            IHostNetworkDepend iHostNetworkDepend;
            com.bytedance.ies.xbridge.base.runtime.depend.b bVar;
            String a2 = d.a(this.f36065b.a(), this.f36065b.f36111c, this.f36066c);
            LinkedHashMap<String, String> a3 = d.a(this.f36065b.f36112d);
            a aVar = new a(this);
            com.bytedance.ies.xbridge.base.runtime.depend.b bVar2 = (com.bytedance.ies.xbridge.base.runtime.depend.b) this.f36064a.a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
            if ((bVar2 == null || (iHostNetworkDepend = bVar2.f35880i) == null) && ((bVar = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) == null || (iHostNetworkDepend = bVar.f35880i) == null)) {
                iHostNetworkDepend = new f();
            }
            l.c(a2, "");
            l.c(a3, "");
            l.c(aVar, "");
            l.c(iHostNetworkDepend, "");
            com.bytedance.ies.xbridge.base.runtime.b.c a4 = new com.bytedance.ies.xbridge.base.runtime.b.c(a2).a(a3);
            a4.f35814b = true;
            l.c(iHostNetworkDepend, "");
            aVar.a(g.b(com.bytedance.ies.xbridge.base.runtime.b.f.DOWNLOAD, a4, iHostNetworkDepend));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (r0 != null) goto L_0x0076;
     */
    @Override // com.bytedance.ies.xbridge.i.a.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.ies.xbridge.i.c.c r11, com.bytedance.ies.xbridge.i.a.b.a r12, com.bytedance.ies.xbridge.e r13) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.i.b.b.a(com.bytedance.ies.xbridge.i.c.c, com.bytedance.ies.xbridge.i.a.b$a, com.bytedance.ies.xbridge.e):void");
    }
}
