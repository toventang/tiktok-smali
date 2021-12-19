package com.bytedance.ttnet.diagnosis;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.a.a;
import java.util.List;

class a implements IDiagnosisRequest {

    /* renamed from: b  reason: collision with root package name */
    private static final String f44580b = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public IDiagnosisCallback f44581a;

    /* renamed from: c  reason: collision with root package name */
    private int f44582c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f44583d;

    /* renamed from: e  reason: collision with root package name */
    private int f44584e;

    /* renamed from: f  reason: collision with root package name */
    private int f44585f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f44586g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f44587h = false;

    /* renamed from: i  reason: collision with root package name */
    private String f44588i;

    /* renamed from: j  reason: collision with root package name */
    private a.AbstractC0622a f44589j = new C1090a();

    /* renamed from: k  reason: collision with root package name */
    private com.bytedance.frameworks.baselib.network.http.cronet.a.a f44590k;

    static {
        Covode.recordClassIndex(27279);
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void cancel() {
        MethodCollector.i(8723);
        synchronized (this) {
            try {
                if (this.f44586g && !this.f44587h) {
                    this.f44590k.cancel();
                    this.f44587h = true;
                    MethodCollector.o(8723);
                }
            } finally {
                MethodCollector.o(8723);
            }
        }
    }

    /* renamed from: com.bytedance.ttnet.diagnosis.a$a  reason: collision with other inner class name */
    class C1090a implements a.AbstractC0622a {
        static {
            Covode.recordClassIndex(27280);
        }

        C1090a() {
        }

        @Override // com.bytedance.frameworks.baselib.network.http.cronet.a.a.AbstractC0622a
        public final void a(String str) {
            if (a.this.f44581a != null) {
                a.this.f44581a.onDiagnosisComplete(str);
            }
        }
    }

    private static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void setUserExtraInfo(String str) {
        MethodCollector.i(9135);
        synchronized (this) {
            try {
                this.f44588i = str;
                doExtraCommand("extra_info", str);
            } finally {
                MethodCollector.o(9135);
            }
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void start(IDiagnosisCallback iDiagnosisCallback) {
        MethodCollector.i(8722);
        synchronized (this) {
            try {
                if (!this.f44586g) {
                    this.f44581a = iDiagnosisCallback;
                    this.f44590k.start();
                    this.f44586g = true;
                    String str = this.f44588i;
                    if (str != null && !str.isEmpty()) {
                        doExtraCommand("extra_info", this.f44588i);
                    }
                    MethodCollector.o(8722);
                }
            } finally {
                MethodCollector.o(8722);
            }
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public void doExtraCommand(String str, String str2) {
        MethodCollector.i(8935);
        synchronized (this) {
            try {
                if (this.f44586g) {
                    this.f44590k.doExtraCommand(str, str2);
                    MethodCollector.o(8935);
                }
            } finally {
                MethodCollector.o(8935);
            }
        }
    }

    public a(int i2, List<String> list, int i3, int i4) {
        this.f44582c = i2;
        this.f44583d = list;
        this.f44584e = i3;
        this.f44585f = i4;
        if (this.f44590k == null) {
            Class<?> a2 = a("org.chromium.diagnosis.CronetDiagnosisRequestImpl");
            if (a2 != null) {
                Object newInstance = a2.getDeclaredConstructor(a.AbstractC0622a.class, Integer.TYPE, List.class, Integer.TYPE, Integer.TYPE).newInstance(this.f44589j, Integer.valueOf(this.f44582c), this.f44583d, Integer.valueOf(this.f44584e), Integer.valueOf(this.f44585f));
                if (newInstance instanceof com.bytedance.frameworks.baselib.network.http.cronet.a.a) {
                    this.f44590k = (com.bytedance.frameworks.baselib.network.http.cronet.a.a) newInstance;
                    return;
                }
                return;
            }
            throw new ClassNotFoundException("org.chromium.diagnosis.CronetDiagnosisRequestImpl class not found");
        }
    }
}
