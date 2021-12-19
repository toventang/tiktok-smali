package org.apache.http.params;

import com.bytedance.covode.number.Covode;

public interface HttpParams {
    static {
        Covode.recordClassIndex(106430);
    }

    int getIntParameter(String str, int i2);

    Object getParameter(String str);

    HttpParams setBooleanParameter(String str, boolean z);

    HttpParams setIntParameter(String str, int i2);

    HttpParams setParameter(String str, Object obj);
}
