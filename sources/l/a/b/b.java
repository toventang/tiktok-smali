package l.a.b;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import k.f;
import k.g;
import l.e;
import okhttp3.MediaType;
import okhttp3.RequestBody;

final class b<T extends Message<T, ?>> implements e<T, RequestBody> {

    /* renamed from: a  reason: collision with root package name */
    private static final MediaType f159231a = MediaType.parse("application/x-protobuf");

    /* renamed from: b  reason: collision with root package name */
    private final ProtoAdapter<T> f159232b;

    static {
        Covode.recordClassIndex(105730);
    }

    b(ProtoAdapter<T> protoAdapter) {
        this.f159232b = protoAdapter;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // l.e
    public final /* synthetic */ RequestBody a(Object obj) {
        f fVar = new f();
        this.f159232b.encode((g) fVar, (T) obj);
        return RequestBody.create(f159231a, fVar.x());
    }
}
