package com.bytedance.webx.h.c;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.h.a.c;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f46026a;

    /* renamed from: b  reason: collision with root package name */
    public final List<SoftReference<WebView>> f46027b;

    /* renamed from: c  reason: collision with root package name */
    public c f46028c;

    /* renamed from: d  reason: collision with root package name */
    public int f46029d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f46030e;

    static {
        Covode.recordClassIndex(28144);
    }

    /* renamed from: com.bytedance.webx.h.c.a$a  reason: collision with other inner class name */
    public static class C1143a {

        /* renamed from: a  reason: collision with root package name */
        c f46031a;

        /* renamed from: b  reason: collision with root package name */
        int f46032b;

        /* renamed from: c  reason: collision with root package name */
        boolean f46033c;

        static {
            Covode.recordClassIndex(28145);
        }

        public final a a() {
            return new a(this, (byte) 0);
        }

        public final C1143a a(int i2) {
            this.f46032b = i2;
            return this;
        }

        public final C1143a a(c cVar) {
            this.f46031a = cVar;
            return this;
        }

        public final C1143a a(boolean z) {
            this.f46033c = z;
            return this;
        }
    }

    private a(C1143a aVar) {
        this.f46027b = new ArrayList();
        this.f46028c = aVar.f46031a;
        this.f46029d = aVar.f46032b;
        this.f46030e = aVar.f46033c;
    }

    /* synthetic */ a(C1143a aVar, byte b2) {
        this(aVar);
    }
}
