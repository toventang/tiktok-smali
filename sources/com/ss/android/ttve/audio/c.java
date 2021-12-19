package com.ss.android.ttve.audio;

import android.media.AudioRecord;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.monitor.b;
import com.ss.android.vesdk.VESensService;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    protected static int f61041a = -1;

    /* renamed from: b  reason: collision with root package name */
    protected static int[] f61042b = {44100, 8000, 11025, 16000, 22050};

    /* renamed from: c  reason: collision with root package name */
    protected static int f61043c = -1;

    /* renamed from: d  reason: collision with root package name */
    protected static int[] f61044d = {12, 16, 1};

    /* renamed from: e  reason: collision with root package name */
    public AudioRecord f61045e;

    /* renamed from: f  reason: collision with root package name */
    public int f61046f = -1;

    /* renamed from: g  reason: collision with root package name */
    int f61047g;

    /* renamed from: h  reason: collision with root package name */
    int f61048h = -1;

    /* renamed from: i  reason: collision with root package name */
    int f61049i = 2;

    /* renamed from: j  reason: collision with root package name */
    boolean f61050j;

    /* renamed from: k  reason: collision with root package name */
    public b f61051k;

    /* renamed from: l  reason: collision with root package name */
    public PrivacyCert f61052l;

    public static void b() {
        VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.b.PRIVACY_STATUS_RELEASE);
    }

    static {
        Covode.recordClassIndex(37599);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        AudioRecord audioRecord = this.f61045e;
        if (audioRecord != null) {
            try {
                if (audioRecord.getState() != 0) {
                    b.a("vesdk_event_will_stop_mic", a("editor finalize will stop mic", String.valueOf(System.currentTimeMillis()), ""), "behavior");
                    com.ss.android.vesdk.c.b(this.f61052l, this.f61045e);
                    b();
                    b.a("vesdk_event_did_stop_mic", a("editor finalize did stop mic", "", String.valueOf(System.currentTimeMillis())), "behavior");
                }
                com.ss.android.vesdk.c.c(this.f61052l, this.f61045e);
            } catch (Exception unused) {
            }
            this.f61045e = null;
        }
        super.finalize();
    }

    public final void a() {
        int i2;
        if (this.f61045e == null) {
            int i3 = -1;
            try {
                int i4 = f61043c;
                if (!(i4 == -1 || (i2 = f61041a) == -1)) {
                    int i5 = f61044d[i4];
                    this.f61048h = i5;
                    int i6 = f61042b[i2];
                    this.f61046f = i6;
                    this.f61047g = AudioRecord.getMinBufferSize(i6, i5, this.f61049i);
                    this.f61045e = new AudioRecord(1, this.f61046f, this.f61048h, this.f61049i, this.f61047g);
                }
            } catch (Exception unused) {
            }
            if (this.f61045e == null) {
                f61043c = -1;
                int[] iArr = f61044d;
                int length = iArr.length;
                int i7 = 0;
                loop0:
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    this.f61048h = iArr[i7];
                    f61043c++;
                    f61041a = i3;
                    int[] iArr2 = f61042b;
                    for (int i8 : iArr2) {
                        f61041a++;
                        try {
                            int minBufferSize = AudioRecord.getMinBufferSize(i8, this.f61048h, this.f61049i);
                            this.f61047g = minBufferSize;
                            if (minBufferSize > 0) {
                                this.f61046f = i8;
                                this.f61045e = new AudioRecord(1, this.f61046f, this.f61048h, this.f61049i, this.f61047g);
                                break loop0;
                            }
                            f61041a++;
                        } catch (Exception e2) {
                            this.f61046f = 0;
                            this.f61045e = null;
                            e2.getMessage();
                            f61041a++;
                        }
                    }
                    i7++;
                    i3 = -1;
                }
            }
            if (this.f61046f > 0) {
                this.f61045e.getState();
            }
        }
    }

    public c(b bVar) {
        this.f61051k = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|(1:10)|11|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        com.ss.android.vesdk.c.c(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        r6.f61045e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r0 = r6.f61045e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
        if (r0 != null) goto L_0x004e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x004a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(com.bytedance.bpea.basics.PrivacyCert r7) {
        /*
            r6 = this;
            java.lang.String r3 = "behavior"
            java.lang.String r4 = ""
            r5 = 0
            android.media.AudioRecord r0 = r6.f61045e     // Catch:{ Exception -> 0x004a }
            if (r0 == 0) goto L_0x0049
            java.lang.String r2 = "editor will start mic"
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x004a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x004a }
            org.json.JSONObject r1 = a(r2, r0, r4)     // Catch:{ Exception -> 0x004a }
            java.lang.String r0 = "vesdk_event_will_start_mic"
            com.ss.android.ttve.monitor.b.a(r0, r1, r3)     // Catch:{ Exception -> 0x004a }
            android.media.AudioRecord r0 = r6.f61045e     // Catch:{ Exception -> 0x004a }
            com.ss.android.vesdk.c.a(r7, r0)     // Catch:{ Exception -> 0x004a }
            com.ss.android.vesdk.VESensService r1 = com.ss.android.vesdk.VESensService.getInstance()     // Catch:{ Exception -> 0x004a }
            java.lang.String r0 = com.ss.android.vesdk.VESensService.SENS_SERVICE_TYPE_MIC     // Catch:{ Exception -> 0x004a }
            int r2 = r1.getIDWithName(r0)     // Catch:{ Exception -> 0x004a }
            com.ss.android.vesdk.VESensService r1 = com.ss.android.vesdk.VESensService.getInstance()     // Catch:{ Exception -> 0x004a }
            com.ss.android.vesdk.VESensService$b r0 = com.ss.android.vesdk.VESensService.b.PRIVACY_STATUS_USING     // Catch:{ Exception -> 0x004a }
            r1.setSensCheckObjStatus(r2, r0)     // Catch:{ Exception -> 0x004a }
            java.lang.String r2 = "editor did start mic"
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x004a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x004a }
            org.json.JSONObject r1 = a(r2, r4, r0)     // Catch:{ Exception -> 0x004a }
            java.lang.String r0 = "vesdk_event_did_start_mic"
            com.ss.android.ttve.monitor.b.a(r0, r1, r3)     // Catch:{ Exception -> 0x004a }
            r0 = 1
            return r0
        L_0x0049:
            return r5
        L_0x004a:
            android.media.AudioRecord r0 = r6.f61045e     // Catch:{ Exception -> 0x0051 }
            if (r0 == 0) goto L_0x0051
            com.ss.android.vesdk.c.c(r7, r0)     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            r0 = 0
            r6.f61045e = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.audio.c.b(com.bytedance.bpea.basics.PrivacyCert):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        if (r0.getState() == 0) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        com.ss.android.ttve.monitor.b.a("vesdk_event_will_stop_mic", a("editor stopRecording will stop mic", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), ""), "behavior");
        com.ss.android.vesdk.c.b(r6, r5.f61045e);
        b();
        com.ss.android.ttve.monitor.b.a("vesdk_event_did_stop_mic", a("editor stopRecording did stop mic", "", java.lang.String.valueOf(java.lang.System.currentTimeMillis())), "behavior");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        r5.f61051k.a();
        r5.f61052l = null;
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1173);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.bytedance.bpea.basics.PrivacyCert r6) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.audio.c.a(com.bytedance.bpea.basics.PrivacyCert):boolean");
    }

    public static JSONObject a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldState", "");
            jSONObject.put("newState", "");
            jSONObject.put("error", str);
            jSONObject.put("startTime", str2);
            jSONObject.put("endTime", str3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r10.f61051k.a(r11, r10.f61046f, 1.0d, r14, r15) == 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1041);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (b(r16) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        com.ss.android.vesdk.an.a("TEBufferedAudioRecorder", "start mic ok, ready to run AudioRecorderRunnable");
        new java.lang.Thread(new com.ss.android.ttve.audio.c.AnonymousClass1(r10)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1041);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r11, double r12, int r14, int r15, com.bytedance.bpea.basics.PrivacyCert r16) {
        /*
            r10 = this;
            r2 = 1041(0x411, float:1.459E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            r1 = r16
            r10.f61052l = r1
            monitor-enter(r10)
            boolean r0 = r10.f61050j     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x0012
            android.media.AudioRecord r0 = r10.f61045e     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x0017
        L_0x0012:
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        L_0x0017:
            r0 = 1
            r10.f61050j = r0
            monitor-exit(r10)
            com.ss.android.ttve.audio.b r3 = r10.f61051k
            int r5 = r10.f61046f
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r4 = r11
            r8 = r14
            r9 = r15
            int r0 = r3.a(r4, r5, r6, r8, r9)
            if (r0 == 0) goto L_0x002e
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        L_0x002e:
            boolean r0 = r10.b(r1)
            if (r0 == 0) goto L_0x0048
            java.lang.String r1 = "TEBufferedAudioRecorder"
            java.lang.String r0 = "start mic ok, ready to run AudioRecorderRunnable"
            com.ss.android.vesdk.an.a(r1, r0)
            java.lang.Thread r1 = new java.lang.Thread
            com.ss.android.ttve.audio.c$1 r0 = new com.ss.android.ttve.audio.c$1
            r0.<init>()
            r1.<init>(r0)
            r1.start()
        L_0x0048:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r10)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.audio.c.a(java.lang.String, double, int, int, com.bytedance.bpea.basics.PrivacyCert):void");
    }
}
