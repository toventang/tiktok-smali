package com.google.android.play.core.b;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.d.a;
import com.google.android.play.core.d.d;
import com.google.android.play.core.d.q;
import com.google.android.play.core.e.ab;
import com.google.android.play.core.e.z;
import java.util.List;
import java.util.concurrent.Executor;

public final class o implements ab {

    /* renamed from: a  reason: collision with root package name */
    final Context f53170a;

    /* renamed from: b  reason: collision with root package name */
    final p f53171b;

    /* renamed from: c  reason: collision with root package name */
    private final d f53172c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f53173d;

    /* renamed from: e  reason: collision with root package name */
    private final q f53174e;

    static {
        Covode.recordClassIndex(32854);
    }

    public o(Context context, Executor executor, p pVar, d dVar, q qVar) {
        this.f53170a = context;
        this.f53172c = dVar;
        this.f53171b = pVar;
        this.f53173d = executor;
        this.f53174e = qVar;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.play.core.e.ab
    public final void a(List<Intent> list, z zVar) {
        if (a.f53189a.get() != null) {
            this.f53173d.execute(new n(this, list, zVar));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
        if (r14.f53171b.a() == false) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer a(java.util.List<android.content.Intent> r15) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.b.o.a(java.util.List):java.lang.Integer");
    }
}
