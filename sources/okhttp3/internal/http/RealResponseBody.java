package okhttp3.internal.http;

import com.bytedance.covode.number.Covode;
import k.h;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final h source;

    static {
        Covode.recordClassIndex(106235);
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public final h source() {
        return this.source;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    public RealResponseBody(String str, long j2, h hVar) {
        this.contentTypeString = str;
        this.contentLength = j2;
        this.source = hVar;
    }
}
