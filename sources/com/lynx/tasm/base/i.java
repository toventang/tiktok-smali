package com.lynx.tasm.base;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateData;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public String f55765a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f55766b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f55767c;

    /* renamed from: d  reason: collision with root package name */
    public a f55768d = new a(this, (byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private LynxTemplateRender f55769e;

    /* renamed from: f  reason: collision with root package name */
    private b f55770f = new b(this, (byte) 0);

    static {
        Covode.recordClassIndex(34882);
    }

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f55771a;

        /* renamed from: b  reason: collision with root package name */
        public String f55772b;

        /* renamed from: c  reason: collision with root package name */
        public TemplateData f55773c;

        static {
            Covode.recordClassIndex(34883);
        }

        private a() {
        }

        /* synthetic */ a(i iVar, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public String f55775a;

        /* renamed from: b  reason: collision with root package name */
        public TemplateData f55776b;

        static {
            Covode.recordClassIndex(34884);
        }

        private b() {
        }

        /* synthetic */ b(i iVar, byte b2) {
            this();
        }
    }

    public i(LynxTemplateRender lynxTemplateRender) {
        this.f55769e = lynxTemplateRender;
    }

    public final void a(String str, TemplateData templateData) {
        this.f55766b = false;
        this.f55767c = true;
        this.f55770f.f55775a = str;
        this.f55770f.f55776b = templateData;
        this.f55765a = str;
    }
}
