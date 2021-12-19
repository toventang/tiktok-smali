package androidx.work;

import android.net.Network;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    public UUID f4455a;

    /* renamed from: b  reason: collision with root package name */
    public e f4456b;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f4457c;

    /* renamed from: d  reason: collision with root package name */
    public int f4458d;

    /* renamed from: e  reason: collision with root package name */
    public Executor f4459e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.work.impl.utils.b.a f4460f;

    /* renamed from: g  reason: collision with root package name */
    public k f4461g;

    /* renamed from: h  reason: collision with root package name */
    private a f4462h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f4463a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f4464b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f4465c;

        static {
            Covode.recordClassIndex(1742);
        }
    }

    static {
        Covode.recordClassIndex(1741);
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i2, Executor executor, androidx.work.impl.utils.b.a aVar2, k kVar) {
        this.f4455a = uuid;
        this.f4456b = eVar;
        this.f4457c = new HashSet(collection);
        this.f4462h = aVar;
        this.f4458d = i2;
        this.f4459e = executor;
        this.f4460f = aVar2;
        this.f4461g = kVar;
    }
}
