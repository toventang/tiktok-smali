package l.a.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.v;
import l.e;
import okhttp3.ResponseBody;

final class c<T> implements e<ResponseBody, T> {

    /* renamed from: a  reason: collision with root package name */
    private final f f159228a;

    /* renamed from: b  reason: collision with root package name */
    private final v<T> f159229b;

    static {
        Covode.recordClassIndex(105728);
    }

    /* access modifiers changed from: private */
    public T a(ResponseBody responseBody) {
        try {
            return this.f159229b.read(this.f159228a.a(responseBody.charStream()));
        } finally {
            responseBody.close();
        }
    }

    c(f fVar, v<T> vVar) {
        this.f159228a = fVar;
        this.f159229b = vVar;
    }
}
