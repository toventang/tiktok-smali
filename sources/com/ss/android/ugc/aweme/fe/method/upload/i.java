package com.ss.android.ugc.aweme.fe.method.upload;

import android.content.Context;
import android.net.Uri;
import c.b.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bduploader.BDMediaDataReader;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.io.BufferedInputStream;
import java.io.InputStream;

public final class i implements BDMediaDataReader {

    /* renamed from: d  reason: collision with root package name */
    public static final a f91437d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public InputStream f91438a;

    /* renamed from: b  reason: collision with root package name */
    public BufferedInputStream f91439b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f91440c;

    /* renamed from: e  reason: collision with root package name */
    private final Uri f91441e;

    /* renamed from: f  reason: collision with root package name */
    private final long f91442f;

    static {
        Covode.recordClassIndex(57533);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57534);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.bduploader.BDMediaDataReader
    public final int close(int i2) {
        z zVar;
        try {
            BufferedInputStream bufferedInputStream = this.f91439b;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
                zVar = z.f158842a;
            } else {
                zVar = null;
            }
            q.m223constructorimpl(zVar);
            return 0;
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
            return 0;
        }
    }

    @Override // com.ss.bduploader.BDMediaDataReader
    public final int open(int i2) {
        Object obj;
        try {
            obj = q.m223constructorimpl(d.a(com.bytedance.ies.ugc.appcontext.d.a(), this.f91441e));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        InputStream inputStream = (InputStream) obj;
        this.f91438a = inputStream;
        if (inputStream != null) {
            return 1;
        }
        return -1;
    }

    @Override // com.ss.bduploader.BDMediaDataReader
    public final long getValue(int i2, int i3) {
        if (i3 == 0) {
            return this.f91442f;
        }
        return 0;
    }

    public i(Context context, Uri uri, long j2) {
        l.d(uri, "");
        this.f91440c = context;
        this.f91441e = uri;
        this.f91442f = j2;
    }

    @Override // com.ss.bduploader.BDMediaDataReader
    public final int read(int i2, long j2, byte[] bArr, int i3) {
        MethodCollector.i(12095);
        if (this.f91438a == null) {
            MethodCollector.o(12095);
            return -1;
        } else if (j2 > this.f91442f) {
            MethodCollector.o(12095);
            return 0;
        } else {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f91438a);
            this.f91439b = bufferedInputStream;
            int read = bufferedInputStream.read(bArr);
            MethodCollector.o(12095);
            return read;
        }
    }
}
