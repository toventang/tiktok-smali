package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.aa;
import com.ttnet.org.chromium.net.ab;
import com.ttnet.org.chromium.net.ac;
import com.ttnet.org.chromium.net.c;
import com.ttnet.org.chromium.net.l;
import com.ttnet.org.chromium.net.m;
import com.ttnet.org.chromium.net.t;
import com.ttnet.org.chromium.net.z;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

public final class VersionSafeCallbacks {
    static {
        Covode.recordClassIndex(103480);
    }

    public static final class b extends l {

        /* renamed from: a  reason: collision with root package name */
        final l f155668a;

        static {
            Covode.recordClassIndex(103483);
        }

        @Override // com.ttnet.org.chromium.net.l
        public final Executor a() {
            return this.f155668a.a();
        }

        public final int hashCode() {
            return this.f155668a.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            return this.f155668a.equals(((b) obj).f155668a);
        }
    }

    public static final class c extends m {

        /* renamed from: a  reason: collision with root package name */
        final m f155669a;

        static {
            Covode.recordClassIndex(103484);
        }

        @Override // com.ttnet.org.chromium.net.m
        public final Executor a() {
            return this.f155669a.a();
        }

        public final int hashCode() {
            return this.f155669a.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof c)) {
                return false;
            }
            return this.f155669a.equals(((c) obj).f155669a);
        }
    }

    public static final class d extends t.a {

        /* renamed from: a  reason: collision with root package name */
        private final t.a f155670a;

        static {
            Covode.recordClassIndex(103485);
        }

        @Override // com.ttnet.org.chromium.net.t.a
        public final Executor getExecutor() {
            return this.f155670a.getExecutor();
        }

        @Override // com.ttnet.org.chromium.net.t.a
        public final void onRequestFinished(t tVar) {
            this.f155670a.onRequestFinished(tVar);
        }

        public d(t.a aVar) {
            super(aVar.getExecutor());
            this.f155670a = aVar;
        }
    }

    public static final class e extends z {

        /* renamed from: a  reason: collision with root package name */
        final z f155671a;

        static {
            Covode.recordClassIndex(103486);
        }

        @Override // com.ttnet.org.chromium.net.z
        public final long a() {
            return this.f155671a.a();
        }

        @Override // com.ttnet.org.chromium.net.z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f155671a.close();
        }

        public e(z zVar) {
            this.f155671a = zVar;
        }

        @Override // com.ttnet.org.chromium.net.z
        public final void a(aa aaVar) {
            this.f155671a.a(aaVar);
        }

        @Override // com.ttnet.org.chromium.net.z
        public final void a(aa aaVar, ByteBuffer byteBuffer) {
            this.f155671a.a(aaVar, byteBuffer);
        }
    }

    public static final class UrlRequestStatusListener extends ab.c {

        /* renamed from: a  reason: collision with root package name */
        private final ab.c f155666a;

        static {
            Covode.recordClassIndex(103481);
        }

        public UrlRequestStatusListener(ab.c cVar) {
            this.f155666a = cVar;
        }

        @Override // com.ttnet.org.chromium.net.ab.c
        public final void onStatus(int i2) {
            this.f155666a.onStatus(i2);
        }
    }

    public static final class a extends c.a.AbstractC4117a {

        /* renamed from: a  reason: collision with root package name */
        private final c.a.AbstractC4117a f155667a;

        static {
            Covode.recordClassIndex(103482);
        }

        public a(c.a.AbstractC4117a aVar) {
            this.f155667a = aVar;
        }

        @Override // com.ttnet.org.chromium.net.c.a.AbstractC4117a
        public final void loadLibrary(String str) {
            this.f155667a.loadLibrary(str);
        }
    }

    public static final class f extends ab.b {

        /* renamed from: a  reason: collision with root package name */
        private final ab.b f155672a;

        static {
            Covode.recordClassIndex(103487);
        }

        public f(ab.b bVar) {
            this.f155672a = bVar;
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void a(ab abVar, ac acVar) {
            this.f155672a.a(abVar, acVar);
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void b(ab abVar, ac acVar) {
            this.f155672a.b(abVar, acVar);
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void a(ab abVar, t tVar) {
            this.f155672a.a(abVar, tVar);
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void a(String str, t tVar) {
            this.f155672a.a(str, tVar);
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void a(ab abVar, ac acVar, com.ttnet.org.chromium.net.d dVar) {
            this.f155672a.a(abVar, acVar, dVar);
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void b(ab abVar, ac acVar, String str) {
            this.f155672a.b(abVar, acVar, str);
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void a(ab abVar, ac acVar, String str) {
            this.f155672a.a(abVar, acVar, str);
        }

        @Override // com.ttnet.org.chromium.net.ab.b
        public final void a(ab abVar, ac acVar, ByteBuffer byteBuffer) {
            this.f155672a.a(abVar, acVar, byteBuffer);
        }
    }
}
