package com.bytedance.webx.e.a.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.d;
import com.bytedance.webx.d.c;
import com.bytedance.webx.e.a;
import com.bytedance.webx.h;
import java.util.LinkedHashSet;

public class b implements c, com.bytedance.webx.e.a.b, com.bytedance.webx.e.b {

    /* renamed from: a  reason: collision with root package name */
    private h f45975a;

    /* renamed from: b  reason: collision with root package name */
    private a f45976b = new a();

    static {
        Covode.recordClassIndex(28107);
    }

    @Override // com.bytedance.webx.e.b
    public com.bytedance.webx.d.a getExtendableContext() {
        a aVar = this.f45976b;
        if (aVar == null) {
            return null;
        }
        return aVar.f45951a;
    }

    public com.bytedance.webx.e.a.c a(Context context) {
        return (com.bytedance.webx.e.a.c) c(context, null);
    }

    @Override // com.bytedance.webx.e.b
    public final void a(h hVar) {
        this.f45975a = hVar;
        this.f45976b.f45951a = new com.bytedance.webx.d.a(this.f45975a, this);
    }

    private com.bytedance.webx.e.a.c a(com.bytedance.webx.e.a.c cVar) {
        if (cVar.getExtendableContext() != null) {
            return cVar;
        }
        cVar.a(this.f45975a);
        com.bytedance.webx.e.a.a.b bVar = new com.bytedance.webx.e.a.a.b();
        com.bytedance.webx.e.a.a.a aVar = new com.bytedance.webx.e.a.a.a();
        bVar.a(this.f45975a);
        cVar.setExtendableWebViewClient(bVar);
        aVar.a(this.f45975a);
        cVar.setExtendableWebViewClient(aVar);
        LinkedHashSet<Class<? extends com.bytedance.webx.a>> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(com.bytedance.webx.e.a.b.a.class);
        linkedHashSet.addAll(this.f45975a.f46004e);
        cVar.getExtendableContext().a(linkedHashSet);
        cVar.getExtendableContext().f45942a = true;
        return cVar;
    }

    public <T extends d> T a(Context context, Class<T> cls) {
        return (T) c(context, cls);
    }

    public <T extends d> T c(Context context, Class<T> cls) {
        com.bytedance.webx.e.a.c cVar;
        if (cls == null) {
            cVar = new com.bytedance.webx.e.a.c(context);
        } else {
            try {
                cVar = (com.bytedance.webx.e.a.c) cls.getConstructor(Context.class).newInstance(context);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return a(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.webx.e.a.c a(android.content.Context r7, com.bytedance.webx.b r8) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.webx.e.a.c.b.a(android.content.Context, com.bytedance.webx.b):com.bytedance.webx.e.a.c");
    }
}
