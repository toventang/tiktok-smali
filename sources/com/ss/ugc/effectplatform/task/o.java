package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectQRCode;
import com.ss.ugc.effectplatform.model.PlatformEffect;
import com.ss.ugc.effectplatform.model.net.ScanQRCodeResponse;
import com.ss.ugc.effectplatform.util.j;
import com.ss.ugc.effectplatform.util.p;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.net.URLEncoder;
import java.util.HashMap;

public final class o extends a<ScanQRCodeResponse.DataNode, ScanQRCodeResponse> {

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153877c;

    /* renamed from: d  reason: collision with root package name */
    public final String f153878d;

    /* renamed from: f  reason: collision with root package name */
    private final EffectQRCode f153879f;

    static {
        Covode.recordClassIndex(102632);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f153880a = null;

        static {
            Covode.recordClassIndex(102633);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && l.a(this.f153880a, ((a) obj).f153880a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f153880a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "SecId(SecId=" + this.f153880a + ")";
        }

        private a() {
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ Effect $this_apply;
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(102634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Effect effect, o oVar) {
            super(0);
            this.$this_apply = effect;
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            e a2 = this.this$0.f153877c.K.a(this.this$0.f153878d);
            if (a2 != null) {
                a2.onSuccess(this.$this_apply);
            }
            this.this$0.f153877c.K.b(this.this$0.f153878d);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final com.ss.ugc.effectplatform.a.c.e c() {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = this.f153877c.f153403c;
        if (str2 != null) {
            hashMap.put("sdk_version", str2);
        }
        com.ss.ugc.effectplatform.a.b.b bVar = this.f153877c.q;
        if (bVar != null) {
            a aVar = (a) bVar.f153430a.convertJsonToObj(this.f153879f.getQrCodeText(), a.class);
            if (!(aVar == null || (str = aVar.f153880a) == null)) {
                String str3 = "";
                l.c(str, str3);
                String encode = URLEncoder.encode(str);
                if (encode != null) {
                    str3 = encode;
                }
                hashMap.put("sec_id", str3);
            }
        }
        String str4 = this.f153877c.f153411k;
        if (str4 != null) {
            hashMap.put("aid", str4);
        }
        return new com.ss.ugc.effectplatform.a.c.e(p.a(hashMap, this.f153877c.A + this.f153877c.f153401a + "/tidyEffect/secId"), c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ ScanQRCodeResponse a(com.ss.ugc.effectplatform.a.b.b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (ScanQRCodeResponse) bVar.f153430a.convertJsonToObj(str, ScanQRCodeResponse.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(com.ss.ugc.effectplatform.a aVar, EffectQRCode effectQRCode, String str) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str);
        l.c(aVar, "");
        l.c(effectQRCode, "");
        l.c(str, "");
        this.f153877c = aVar;
        this.f153879f = effectQRCode;
        this.f153878d = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ void a(long j2, long j3, long j4, ScanQRCodeResponse scanQRCodeResponse) {
        PlatformEffect effect;
        Effect effect2;
        ScanQRCodeResponse scanQRCodeResponse2 = scanQRCodeResponse;
        l.c(scanQRCodeResponse2, "");
        ScanQRCodeResponse.DataNode data = scanQRCodeResponse2.getData();
        if (data != null && (effect = data.getEffect()) != null && (effect2 = effect.toEffect(data.getUrl_prefix())) != null) {
            j.a(this.f153877c.f153409i, n.a(effect2));
            a(new b(effect2, this));
        }
    }
}
