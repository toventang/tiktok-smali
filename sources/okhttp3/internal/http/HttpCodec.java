package okhttp3.internal.http;

import com.bytedance.covode.number.Covode;
import k.y;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public interface HttpCodec {
    static {
        Covode.recordClassIndex(106229);
    }

    void cancel();

    y createRequestBody(Request request, long j2);

    void finishRequest();

    void flushRequest();

    ResponseBody openResponseBody(Response response);

    Response.Builder readResponseHeaders(boolean z);

    void writeRequestHeaders(Request request);
}
