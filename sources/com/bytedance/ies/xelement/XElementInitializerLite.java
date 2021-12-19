package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class XElementInitializerLite {
    public static final a Companion = new a((byte) 0);
    public static final h instance$delegate = i.a((h.f.a.a) b.f36565a);
    private XElementConfigLite localConfig;

    public static final class a {
        static {
            Covode.recordClassIndex(21964);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private XElementInitializerLite() {
    }

    static final class b extends m implements h.f.a.a<XElementInitializerLite> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f36565a = new b();

        static {
            Covode.recordClassIndex(21965);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ XElementInitializerLite invoke() {
            return new XElementInitializerLite(null);
        }
    }

    public final XElementConfigLite getConfig() {
        XElementConfigLite xElementConfigLite = this.localConfig;
        if (xElementConfigLite == null) {
            l.a("localConfig");
        }
        return xElementConfigLite;
    }

    static {
        Covode.recordClassIndex(21963);
    }

    public /* synthetic */ XElementInitializerLite(g gVar) {
        this();
    }

    public final void setConfig(XElementConfigLite xElementConfigLite) {
        l.c(xElementConfigLite, "");
        this.localConfig = xElementConfigLite;
    }
}
