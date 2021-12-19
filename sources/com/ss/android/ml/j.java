package com.ss.android.ml;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import java.util.concurrent.ExecutorService;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f59857a;

    /* renamed from: b  reason: collision with root package name */
    public final d f59858b;

    /* renamed from: c  reason: collision with root package name */
    public final b f59859c;

    /* renamed from: d  reason: collision with root package name */
    public final g f59860d;

    /* renamed from: e  reason: collision with root package name */
    final c f59861e;

    /* renamed from: f  reason: collision with root package name */
    public final h f59862f;

    /* renamed from: g  reason: collision with root package name */
    ExecutorService f59863g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f59864h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f59865a;

        /* renamed from: b  reason: collision with root package name */
        public d f59866b;

        /* renamed from: c  reason: collision with root package name */
        public b f59867c;

        /* renamed from: d  reason: collision with root package name */
        public g f59868d;

        /* renamed from: e  reason: collision with root package name */
        public c f59869e;

        /* renamed from: f  reason: collision with root package name */
        public h f59870f;

        /* renamed from: g  reason: collision with root package name */
        ExecutorService f59871g;

        /* renamed from: h  reason: collision with root package name */
        Context f59872h;

        static {
            Covode.recordClassIndex(36997);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(36998);
        }

        <T> T a(String str, Type type);
    }

    public interface c {
        static {
            Covode.recordClassIndex(36999);
        }

        ExecutorService a();
    }

    public interface d {
        static {
            Covode.recordClassIndex(37000);
        }

        boolean a(String str, String str2, String str3);
    }

    static {
        Covode.recordClassIndex(36996);
    }

    public j(a aVar) {
        if (aVar.f59865a == null) {
            throw new RuntimeException("must specified cache path");
        } else if (aVar.f59866b == null) {
            throw new RuntimeException("must implement IFileDownloader");
        } else if (aVar.f59867c != null) {
            this.f59857a = aVar.f59865a;
            this.f59858b = aVar.f59866b;
            this.f59859c = aVar.f59867c;
            this.f59860d = aVar.f59868d;
            this.f59862f = aVar.f59870f;
            this.f59863g = aVar.f59871g;
            this.f59864h = aVar.f59872h;
            this.f59861e = aVar.f59869e;
        } else {
            throw new RuntimeException("must implement IConfigParser");
        }
    }
}
