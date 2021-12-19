package com.ss.android.ugc.aweme.ml.infra.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f110620a;

    /* renamed from: b  reason: collision with root package name */
    public float[] f110621b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f110622c;

    static {
        Covode.recordClassIndex(71014);
    }

    public final Map<String, Object> a() {
        if (this.f110620a == null) {
            this.f110620a = new HashMap();
        }
        Map<String, Object> map = this.f110620a;
        if (map == null) {
            l.b();
        }
        return map;
    }

    public final String toString() {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (this.f110620a != null) {
            sb.append("inputFeaturesMap=" + this.f110620a + ", ");
        }
        Integer num2 = null;
        if (this.f110621b != null) {
            StringBuilder sb2 = new StringBuilder("inputFloatArray.size:");
            float[] fArr = this.f110621b;
            if (fArr != null) {
                num = Integer.valueOf(fArr.length);
            } else {
                num = null;
            }
            sb.append(sb2.append(num).toString());
        }
        if (this.f110622c != null) {
            StringBuilder sb3 = new StringBuilder("inputByteArray.size:");
            byte[] bArr = this.f110622c;
            if (bArr != null) {
                num2 = Integer.valueOf(bArr.length);
            }
            sb.append(sb3.append(num2).toString());
        }
        sb.append("}");
        String sb4 = sb.toString();
        l.b(sb4, "");
        return sb4;
    }
}
