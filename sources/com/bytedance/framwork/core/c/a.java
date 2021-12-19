package com.bytedance.framwork.core.c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class a {

    /* renamed from: c  reason: collision with root package name */
    public String f29477c;

    /* renamed from: d  reason: collision with root package name */
    public b f29478d;

    /* renamed from: e  reason: collision with root package name */
    protected d f29479e;

    /* renamed from: f  reason: collision with root package name */
    public String f29480f;

    /* renamed from: g  reason: collision with root package name */
    public c f29481g;

    /* renamed from: h  reason: collision with root package name */
    public long f29482h;

    /* renamed from: com.bytedance.framwork.core.c.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0628a implements b {
        static {
            Covode.recordClassIndex(17173);
        }

        @Override // com.bytedance.framwork.core.c.a.b
        public int c() {
            return 4;
        }

        @Override // com.bytedance.framwork.core.c.a.b
        public long d() {
            return 15000;
        }

        @Override // com.bytedance.framwork.core.c.a.b
        public String e() {
            return null;
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(17174);
        }

        String a();

        List<String> b();

        int c();

        long d();

        String e();
    }

    public interface c {
        static {
            Covode.recordClassIndex(17175);
        }

        boolean a();

        long b();

        boolean c();
    }

    static {
        Covode.recordClassIndex(17172);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(String str, byte[] bArr);

    public final boolean a(byte[] bArr) {
        return this.f29479e.a(this.f29477c, bArr);
    }

    public a(Context context, b bVar, c cVar) {
        this.f29478d = bVar;
        this.f29481g = cVar;
        if (bVar == null) {
            throw new IllegalArgumentException("config is null.");
        } else if (cVar != null) {
            String a2 = bVar.a();
            this.f29477c = a2;
            if (!TextUtils.isEmpty(a2)) {
                d a3 = d.a(context);
                this.f29479e = a3;
                String str = this.f29477c;
                if (!a3.f29493b.get()) {
                    a3.f29492a.put(str, this);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("type is empty.");
        } else {
            throw new IllegalArgumentException("responseConfig is null");
        }
    }
}
