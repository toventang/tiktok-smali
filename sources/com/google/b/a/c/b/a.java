package com.google.b.a.c.b;

import com.bytedance.covode.number.Covode;
import com.google.b.a.d.f;
import com.google.b.a.d.g;
import com.google.b.a.d.h;
import com.google.b.a.f.a.a.a.a.b;
import com.google.b.a.g.m;
import java.util.logging.Logger;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f53534a = Logger.getLogger(a.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public final f f53535b;

    /* renamed from: c  reason: collision with root package name */
    public final c f53536c;

    /* renamed from: d  reason: collision with root package name */
    public final String f53537d;

    /* renamed from: e  reason: collision with root package name */
    public final String f53538e;

    /* renamed from: f  reason: collision with root package name */
    public final String f53539f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f53540g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f53541h;

    /* renamed from: i  reason: collision with root package name */
    private final String f53542i;

    /* renamed from: j  reason: collision with root package name */
    private final m f53543j;

    static {
        Covode.recordClassIndex(33134);
    }

    /* renamed from: com.google.b.a.c.b.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC1225a {

        /* renamed from: a  reason: collision with root package name */
        public final h f53544a;

        /* renamed from: b  reason: collision with root package name */
        public c f53545b;

        /* renamed from: c  reason: collision with root package name */
        public g f53546c;

        /* renamed from: d  reason: collision with root package name */
        final m f53547d;

        /* renamed from: e  reason: collision with root package name */
        public String f53548e;

        /* renamed from: f  reason: collision with root package name */
        public String f53549f;

        /* renamed from: g  reason: collision with root package name */
        String f53550g;

        /* renamed from: h  reason: collision with root package name */
        public String f53551h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f53552i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f53553j;

        static {
            Covode.recordClassIndex(33135);
        }

        public AbstractC1225a c(String str) {
            this.f53551h = str;
            return this;
        }

        public AbstractC1225a a(String str) {
            this.f53548e = a.a(str);
            return this;
        }

        public AbstractC1225a b(String str) {
            this.f53549f = a.b(str);
            return this;
        }

        public AbstractC1225a(h hVar, String str, String str2, m mVar, g gVar) {
            this.f53544a = (h) b.a(hVar);
            this.f53547d = mVar;
            a(str);
            b(str2);
            this.f53546c = gVar;
        }
    }

    static String a(String str) {
        b.a(str, "root URL cannot be null.");
        if (!str.endsWith("/")) {
            return String.valueOf(str).concat("/");
        }
        return str;
    }

    static String b(String str) {
        b.a(str, "service path cannot be null");
        if (str.length() == 1) {
            b.a("/".equals(str), "service path must equal \"/\" if it is of length 1.");
            return "";
        } else if (str.length() <= 0) {
            return str;
        } else {
            if (!str.endsWith("/")) {
                str = String.valueOf(str).concat("/");
            }
            if (str.startsWith("/")) {
                return str.substring(1);
            }
            return str;
        }
    }

    public a(AbstractC1225a aVar) {
        f a2;
        this.f53536c = aVar.f53545b;
        this.f53537d = a(aVar.f53548e);
        this.f53538e = b(aVar.f53549f);
        this.f53542i = aVar.f53550g;
        String str = aVar.f53551h;
        if (str == null || str.length() == 0) {
            f53534a.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.f53539f = aVar.f53551h;
        if (aVar.f53546c == null) {
            a2 = aVar.f53544a.a(null);
        } else {
            a2 = aVar.f53544a.a(aVar.f53546c);
        }
        this.f53535b = a2;
        this.f53543j = aVar.f53547d;
        this.f53540g = aVar.f53552i;
        this.f53541h = aVar.f53553j;
    }
}
