package l.a.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.v;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import l.e;
import okhttp3.MediaType;
import okhttp3.RequestBody;

final class b<T> implements e<T, RequestBody> {

    /* renamed from: a  reason: collision with root package name */
    private static final MediaType f159224a = MediaType.parse("application/json; charset=UTF-8");

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f159225b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    private final f f159226c;

    /* renamed from: d  reason: collision with root package name */
    private final v<T> f159227d;

    static {
        Covode.recordClassIndex(105727);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // l.e
    public final /* synthetic */ RequestBody a(Object obj) {
        k.f fVar = new k.f();
        c a2 = this.f159226c.a((Writer) new OutputStreamWriter(fVar.d(), f159225b));
        this.f159227d.write(a2, obj);
        a2.close();
        return RequestBody.create(f159224a, fVar.q());
    }

    b(f fVar, v<T> vVar) {
        this.f159226c = fVar;
        this.f159227d = vVar;
    }
}
