package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, ? extends Object> f110628a;

    /* renamed from: b  reason: collision with root package name */
    public float[] f110629b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f110630c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f110631d;

    /* renamed from: e  reason: collision with root package name */
    public String f110632e;

    static {
        Covode.recordClassIndex(71022);
    }

    public final String toString() {
        Integer num;
        String str;
        String str2;
        User author;
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (this.f110632e != null) {
            sb.append("enterType:" + this.f110632e + "},");
        }
        Integer num2 = null;
        if (this.f110631d != null) {
            StringBuilder sb2 = new StringBuilder("aweme:");
            Aweme aweme = this.f110631d;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            StringBuilder append = sb2.append(str).append("=[");
            Aweme aweme2 = this.f110631d;
            if (aweme2 == null || (author = aweme2.getAuthor()) == null) {
                str2 = null;
            } else {
                str2 = author.getNickname();
            }
            sb.append(append.append(str2).append(',').toString());
        }
        if (this.f110628a != null) {
            sb.append("extFeaturesMap=" + this.f110628a + ", ");
        }
        if (this.f110629b != null) {
            StringBuilder sb3 = new StringBuilder("extFloatArray.size:");
            float[] fArr = this.f110629b;
            if (fArr != null) {
                num = Integer.valueOf(fArr.length);
            } else {
                num = null;
            }
            sb.append(sb3.append(num).toString());
        }
        if (this.f110630c != null) {
            StringBuilder sb4 = new StringBuilder("extByteArray.size:");
            byte[] bArr = this.f110630c;
            if (bArr != null) {
                num2 = Integer.valueOf(bArr.length);
            }
            sb.append(sb4.append(num2).toString());
        }
        sb.append("}");
        String sb5 = sb.toString();
        l.b(sb5, "");
        return sb5;
    }
}
