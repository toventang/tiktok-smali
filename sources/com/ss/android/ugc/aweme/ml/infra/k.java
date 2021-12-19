package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public String f110661a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, Float> f110662b;

    /* renamed from: c  reason: collision with root package name */
    public Float f110663c;

    static {
        Covode.recordClassIndex(71027);
    }

    public final Float a() {
        Map<String, Float> map;
        String str = this.f110661a;
        if (str == null || (map = this.f110662b) == null) {
            return null;
        }
        return map.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (this.f110661a != null) {
            sb.append("strResult=" + this.f110661a + ", ");
        }
        if (this.f110662b != null) {
            sb.append("probabilityMap=" + this.f110662b + ", ");
        }
        if (this.f110663c != null) {
            sb.append("floatResult=" + this.f110663c + ", ");
        }
        sb.append("}");
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }
}
