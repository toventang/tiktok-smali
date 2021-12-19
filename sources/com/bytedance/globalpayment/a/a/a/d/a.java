package com.bytedance.globalpayment.a.a.a.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f30146a;

    /* renamed from: b  reason: collision with root package name */
    private String f30147b;

    /* renamed from: c  reason: collision with root package name */
    private String f30148c;

    /* renamed from: d  reason: collision with root package name */
    private List<a> f30149d;

    static {
        Covode.recordClassIndex(17524);
    }

    public String toString() {
        String a2;
        StringBuilder append = new StringBuilder("{mIsValid=").append(this.f30146a).append(", mErrorMessage='");
        if (TextUtils.isEmpty(this.f30148c)) {
            a2 = com.bytedance.globalpayment.a.a.a.f.a.a(this.f30147b, new String[0]);
        } else {
            a2 = com.bytedance.globalpayment.a.a.a.f.a.a(this.f30147b, this.f30148c);
        }
        return append.append(a2).append('\'').append(", mChildElementValidity=").append(this.f30149d).append('}').toString();
    }
}
