package org.apache.http.client;

import com.bytedance.covode.number.Covode;
import org.apache.http.params.HttpParams;

public interface HttpClient {
    static {
        Covode.recordClassIndex(106374);
    }

    HttpParams getParams();
}
