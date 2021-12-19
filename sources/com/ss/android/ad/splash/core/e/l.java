package com.ss.android.ad.splash.core.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class l {
    public String X;

    static {
        Covode.recordClassIndex(36295);
    }

    public l() {
    }

    public String x() {
        return this.X;
    }

    public int hashCode() {
        if (TextUtils.isEmpty(x())) {
            return super.hashCode();
        }
        return x().hashCode();
    }

    public l(String str) {
        this.X = str;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof l) && !TextUtils.isEmpty(x())) {
            l lVar = (l) obj;
            if (!TextUtils.isEmpty(lVar.x())) {
                return TextUtils.equals(x(), lVar.x());
            }
        }
        return false;
    }
}
