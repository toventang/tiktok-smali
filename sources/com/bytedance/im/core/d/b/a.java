package com.bytedance.im.core.d.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f37866a;

    /* renamed from: b  reason: collision with root package name */
    public int f37867b;

    /* renamed from: c  reason: collision with root package name */
    public String f37868c;

    /* renamed from: d  reason: collision with root package name */
    public String f37869d;

    /* renamed from: e  reason: collision with root package name */
    public String f37870e;

    /* renamed from: f  reason: collision with root package name */
    public String f37871f;

    /* renamed from: g  reason: collision with root package name */
    public String f37872g;

    /* renamed from: h  reason: collision with root package name */
    public String f37873h;

    static {
        Covode.recordClassIndex(22728);
    }

    public final String a() {
        if (TextUtils.isEmpty(this.f37866a)) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f37868c)) {
                sb.append(this.f37868c).append("|");
            }
            if (!TextUtils.isEmpty(this.f37869d)) {
                sb.append(this.f37869d).append("|");
            }
            if (!TextUtils.isEmpty(this.f37870e)) {
                sb.append(this.f37870e).append("|");
            }
            if (!TextUtils.isEmpty(this.f37871f)) {
                sb.append(this.f37871f).append("|");
            }
            sb.append(this.f37867b);
            this.f37866a = sb.toString();
        }
        return this.f37866a;
    }

    public final String toString() {
        return "FTSEntity {combinedKey is " + this.f37866a + " , type is " + this.f37867b + " , conversationId is " + this.f37868c + " , messageUuid is " + this.f37869d + " , userId is " + this.f37870e + " , entityId is " + this.f37871f + " , searchContent is " + this.f37872g + " , extra is " + this.f37873h + "}";
    }
}
