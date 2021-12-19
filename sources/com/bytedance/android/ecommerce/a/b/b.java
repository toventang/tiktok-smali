package com.bytedance.android.ecommerce.a.b;

import android.graphics.Bitmap;
import com.bytedance.android.ecommerce.k.d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class b extends a {

    /* renamed from: f  reason: collision with root package name */
    public String f6916f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.android.ecommerce.a.b f6917g;

    /* renamed from: h  reason: collision with root package name */
    public String f6918h;

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.android.ecommerce.a.b f6919i;

    /* renamed from: j  reason: collision with root package name */
    public String f6920j;

    /* renamed from: k  reason: collision with root package name */
    public String f6921k;

    /* renamed from: l  reason: collision with root package name */
    public String f6922l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6923m;
    public Bitmap n;

    static {
        Covode.recordClassIndex(3342);
    }

    public final byte[] a() {
        Bitmap bitmap = this.n;
        if (bitmap == null) {
            return new byte[0];
        }
        return d.a(bitmap);
    }

    @Override // com.bytedance.android.ecommerce.a.b.a
    public final String toString() {
        return "OcrResponse{mExpiredDate='" + this.f6916f + '\'' + ", mExpiredDateCorners=" + this.f6917g + ", mNumber='" + this.f6918h + '\'' + ", mNumberCorners=" + this.f6919i + ", mBankId='" + this.f6920j + '\'' + ", mBankName='" + this.f6921k + '\'' + ", mCardName='" + this.f6922l + '\'' + ", mIsValid=" + this.f6923m + ", mNumberBitmap=" + this.n + ", mResponseJsonObject=" + this.f6911a + ", mSign='" + this.f6912b + '\'' + ", mResultCode='" + this.f6913c + '\'' + ", mErrorCode='" + this.f6914d + '\'' + ", mErrorMessage='" + this.f6915e + '\'' + '}';
    }

    public b(String str) {
        super(str);
        boolean z;
        JSONObject jSONObject = this.f6911a;
        try {
            this.f6916f = jSONObject.optString("expired_date");
            this.f6917g = new com.bytedance.android.ecommerce.a.b(jSONObject.getJSONObject("expired_date_corners"));
            this.f6918h = jSONObject.optString("number");
            this.f6919i = new com.bytedance.android.ecommerce.a.b(jSONObject.getJSONObject("number_corners"));
            this.f6920j = jSONObject.optString("bank_id");
            this.f6921k = jSONObject.optString("bank_name");
            this.f6922l = jSONObject.optString("card_name");
            if (!this.f6917g.f6908i || !this.f6919i.f6908i) {
                z = false;
            } else {
                z = true;
            }
            this.f6923m = z;
        } catch (Throwable th) {
            this.f6915e = th.getMessage();
        }
    }
}
