package com.ss.android.ugc.aweme.shortvideo.upload.b;

import com.bytedance.covode.number.Covode;
import com.google.c.a.s;
import com.ss.android.ugc.asve.editor.k;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.publish.a.c;
import com.ss.android.ugc.aweme.shortvideo.upload.b.d;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.watermark.n;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.x;
import f.a.l.g;
import h.f.a.r;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class f {

    /* renamed from: h  reason: collision with root package name */
    public static final a f132029h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public g<d> f132030a;

    /* renamed from: b  reason: collision with root package name */
    long f132031b = -1;

    /* renamed from: c  reason: collision with root package name */
    final g f132032c;

    /* renamed from: d  reason: collision with root package name */
    final SynthetiseResult f132033d;

    /* renamed from: e  reason: collision with root package name */
    final VEVideoEncodeSettings f132034e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.upload.b.a.a f132035f;

    /* renamed from: g  reason: collision with root package name */
    final String f132036g;

    static {
        Covode.recordClassIndex(86507);
    }

    private static String a(int i2) {
        switch (i2) {
            case -104:
                return "ending watermark video concat failed";
            case -103:
            default:
                return "Unknown error";
            case -102:
                return "synthesis ending watermak failed, init failed";
            case -101:
                return "current user is null while synthesis finished";
            case -100:
                return "end watermark encode settings is null";
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(86508);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements VEListener.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f132037a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.asve.editor.a f132038b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SynthetiseResult f132039c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f132040d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f132041e;

        static {
            Covode.recordClassIndex(86509);
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileDone() {
            q.a("PublishEndingWatermarkComposer", "ending watermark video generate cost: " + (System.currentTimeMillis() - this.f132040d) + "ms");
            this.f132038b.s();
            f fVar = this.f132037a;
            SynthetiseResult synthetiseResult = this.f132039c;
            String str = this.f132041e;
            q.a("PublishEndingWatermarkComposer", "ending watermark synthesis finished.");
            g<d> gVar = fVar.f132030a;
            if (gVar == null) {
                l.a("mSubject");
            }
            gVar.onNext(new d.b(c.WatermarkVideoConcat));
            g<d> gVar2 = fVar.f132030a;
            if (gVar2 == null) {
                l.a("mSubject");
            }
            gVar2.onNext(new d.a(0));
            long currentTimeMillis = System.currentTimeMillis();
            if (e.b(fVar.f132032c.f132046e)) {
                q.a("PublishEndingWatermarkComposer", "delete existed file under watermark video file path, path: " + fVar.f132032c.f132046e);
                e.c(fVar.f132032c.f132046e);
            }
            int concatVideo = VEUtils.concatVideo(new String[]{fVar.f132036g, str}, fVar.f132032c.f132046e);
            if (concatVideo != 0) {
                fVar.a(-104, synthetiseResult, String.valueOf(concatVideo));
                return;
            }
            e.c(fVar.f132036g);
            g<d> gVar3 = fVar.f132030a;
            if (gVar3 == null) {
                l.a("mSubject");
            }
            gVar3.onNext(new d.a(1000));
            q.a("PublishEndingWatermarkComposer", "ending watermark video concat cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            synthetiseResult.outputFile = fVar.f132032c.f132046e;
            fVar.a(synthetiseResult, false);
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileProgress(float f2) {
            g<d> gVar = this.f132037a.f132030a;
            if (gVar == null) {
                l.a("mSubject");
            }
            gVar.onNext(new d.a(h.g.a.a(f2 * 1000.0f)));
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileError(int i2, int i3, float f2, String str) {
            this.f132038b.s();
            this.f132037a.a(-103, this.f132039c, "end watermark compile failed. error = " + i2 + " ext = " + i3 + " f = " + f2 + " msg = " + str);
        }

        b(f fVar, com.ss.android.ugc.asve.editor.a aVar, SynthetiseResult synthetiseResult, long j2, String str) {
            this.f132037a = fVar;
            this.f132038b = aVar;
            this.f132039c = synthetiseResult;
            this.f132040d = j2;
            this.f132041e = str;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ SynthetiseResult $result;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(86511);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar, SynthetiseResult synthetiseResult) {
            super(1);
            this.this$0 = fVar;
            this.$result = synthetiseResult;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            l.d(th2, "");
            this.this$0.a(-105, this.$result, s.b(th2));
            return z.f158842a;
        }
    }

    private static boolean a(String str) {
        long min = Math.min(e.f(), 2147483647L);
        if (l.a((Object) str, (Object) "write failed: ENOSPC (No space left on device)") || min < 100) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(SynthetiseResult synthetiseResult, boolean z) {
        q.a("PublishEndingWatermarkComposer", "watermark video concat finished.");
        g<d> gVar = this.f132030a;
        if (gVar == null) {
            l.a("mSubject");
        }
        gVar.onNext(new d.c(synthetiseResult));
        g<d> gVar2 = this.f132030a;
        if (gVar2 == null) {
            l.a("mSubject");
        }
        gVar2.onComplete();
        if (!z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", System.currentTimeMillis() - this.f132031b);
            jSONObject.put("file_size", new File(synthetiseResult.outputFile).length());
            com.bytedance.apm.b.a("aweme_publish_watermark_rate", 0, jSONObject);
        }
    }

    public final void a(int i2, SynthetiseResult synthetiseResult, String str) {
        String str2;
        StringBuilder append = new StringBuilder("end watermark synthesis error, will fallback to inter-watermark. error code: ").append(i2).append(", error message: ");
        if (str == null || str.length() == 0) {
            str2 = a(i2);
        } else {
            str2 = str;
        }
        q.a("PublishEndingWatermarkComposer", append.append(str2).toString());
        e.c(this.f132032c.f132046e);
        if (e.c(this.f132036g, this.f132032c.f132046e)) {
            a(synthetiseResult, true);
        } else {
            SynthetiseResult clone = synthetiseResult.clone();
            clone.ret = 100103;
            l.b(clone, "");
            g<d> gVar = this.f132030a;
            if (gVar == null) {
                l.a("mSubject");
            }
            gVar.onError(c.a.a().a(clone).a("").a());
        }
        if (a(str)) {
            i2 = -106;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", System.currentTimeMillis() - this.f132031b);
        jSONObject.put("error_code", i2);
        if (str != null) {
            jSONObject.put("error_msg", str);
        }
        com.bytedance.apm.b.a("aweme_publish_watermark_rate", 1, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements r<Boolean, List<? extends String>, String, String, z> {
        final /* synthetic */ SynthetiseResult $result;
        final /* synthetic */ VEVideoEncodeSettings $settings;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(86510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, VEVideoEncodeSettings vEVideoEncodeSettings, SynthetiseResult synthetiseResult) {
            super(4);
            this.this$0 = fVar;
            this.$settings = vEVideoEncodeSettings;
            this.$result = synthetiseResult;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ z a(Boolean bool, List<? extends String> list, String str, String str2) {
            String str3;
            boolean booleanValue = bool.booleanValue();
            List<? extends String> list2 = list;
            String str4 = str;
            String str5 = str2;
            l.d(list2, "");
            l.d(str4, "");
            l.d(str5, "");
            q.a("wangyong.1996", "load ending watermark resource success. isRealLoad: ".concat(String.valueOf(booleanValue)));
            String path = com.ss.android.ugc.aweme.port.in.g.a().g().c().a(com.ss.android.ugc.aweme.port.in.g.a().g().c().g(this.this$0.f132035f.a()), "ending_watermark_video.mp4").getPath();
            f fVar = this.this$0;
            n nVar = new n(list2, str4, str5, h.a.z.INSTANCE, (byte) 0);
            l.b(path, "");
            VEVideoEncodeSettings vEVideoEncodeSettings = this.$settings;
            SynthetiseResult synthetiseResult = this.$result;
            long currentTimeMillis = System.currentTimeMillis();
            e.c(path);
            com.ss.android.ugc.asve.editor.a aVar = new com.ss.android.ugc.asve.editor.a(fVar.f132032c.f132045d);
            boolean z = true;
            k kVar = new k(new String[]{nVar.f144805b});
            kVar.a(x.l.VIDEO_OUT_RATIO_ORIGINAL);
            kVar.f62018a = new int[]{0};
            kVar.f62019b = new int[]{nVar.f144808e + nVar.f144809f};
            kVar.f62020c = null;
            if (aVar.a(kVar) != 0) {
                fVar.a(-102, synthetiseResult, null);
            } else {
                if (fVar.f132035f.d() && (str3 = nVar.f144806c) != null && new File(str3).exists()) {
                    aVar.a(str3, 0, nVar.f144808e, 0, nVar.f144808e + 0, false);
                }
                if (!nVar.f144804a.isEmpty()) {
                    String str6 = nVar.f144804a.get(0);
                    List<Integer> list3 = fVar.f132032c.f132042a;
                    ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(it.next().intValue()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    aVar.b(aVar.a(str6, (String[]) array), 0, nVar.f144808e + 0 + nVar.f144809f);
                }
                vEVideoEncodeSettings.setWatermark(null);
                vEVideoEncodeSettings.adjustVideoCompileEncodeSetting(1);
                int isWatermarkCompileEncode = aVar.E().B.isWatermarkCompileEncode();
                if (isWatermarkCompileEncode >= 0) {
                    VEVideoCompileEncodeSettings videoCompileEncodeSetting = vEVideoEncodeSettings.getVideoCompileEncodeSetting();
                    if (isWatermarkCompileEncode <= 0) {
                        z = false;
                    }
                    videoCompileEncodeSetting.useHWEncoder = z;
                    vEVideoEncodeSettings.getVideoCompileEncodeSetting().isSupportHWEncoder = vEVideoEncodeSettings.getVideoCompileEncodeSetting().useHWEncoder;
                }
                aVar.a(path, (String) null, vEVideoEncodeSettings, new b(fVar, aVar, synthetiseResult, currentTimeMillis, path));
            }
            return z.f158842a;
        }
    }

    public f(g gVar, SynthetiseResult synthetiseResult, VEVideoEncodeSettings vEVideoEncodeSettings, com.ss.android.ugc.aweme.shortvideo.upload.b.a.a aVar, String str) {
        l.d(gVar, "");
        l.d(synthetiseResult, "");
        l.d(aVar, "");
        l.d(str, "");
        this.f132032c = gVar;
        this.f132033d = synthetiseResult;
        this.f132034e = vEVideoEncodeSettings;
        this.f132035f = aVar;
        this.f132036g = str;
    }
}
