package l.a.b;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import l.e;
import okhttp3.ResponseBody;

final class c<T extends Message<T, ?>> implements e<ResponseBody, T> {

    /* renamed from: a  reason: collision with root package name */
    private final ProtoAdapter<T> f159233a;

    static {
        Covode.recordClassIndex(105731);
    }

    c(ProtoAdapter<T> protoAdapter) {
        this.f159233a = protoAdapter;
    }

    /* access modifiers changed from: private */
    public T a(ResponseBody responseBody) {
        try {
            return this.f159233a.decode(responseBody.source());
        } finally {
            responseBody.close();
        }
    }
}
