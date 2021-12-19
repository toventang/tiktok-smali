package com.ss.android.common.b.a;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public Set<c> f59348a = new HashSet();

    public interface c {
        static {
            Covode.recordClassIndex(36645);
        }

        String a();

        Object b();
    }

    static {
        Covode.recordClassIndex(36642);
    }

    /* renamed from: com.ss.android.common.b.a.a$a  reason: collision with other inner class name */
    public class C1293a implements c {

        /* renamed from: a  reason: collision with root package name */
        public String f59349a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f59350b;

        /* renamed from: c  reason: collision with root package name */
        public String f59351c;

        static {
            Covode.recordClassIndex(36643);
        }

        @Override // com.ss.android.common.b.a.a.c
        public final String a() {
            return this.f59349a;
        }

        @Override // com.ss.android.common.b.a.a.c
        public final Object b() {
            return this.f59350b;
        }

        public C1293a(String str, byte[] bArr, String str2) {
            this.f59349a = str;
            this.f59350b = bArr;
            this.f59351c = str2;
        }
    }

    public class b implements c {

        /* renamed from: a  reason: collision with root package name */
        String f59353a;

        /* renamed from: b  reason: collision with root package name */
        File f59354b;

        static {
            Covode.recordClassIndex(36644);
        }

        @Override // com.ss.android.common.b.a.a.c
        public final String a() {
            return this.f59353a;
        }

        @Override // com.ss.android.common.b.a.a.c
        public final Object b() {
            return this.f59354b;
        }

        public b(String str, File file) {
            this.f59353a = str;
            this.f59354b = file;
        }
    }

    public class d implements c {

        /* renamed from: a  reason: collision with root package name */
        String f59356a;

        /* renamed from: b  reason: collision with root package name */
        String f59357b;

        static {
            Covode.recordClassIndex(36646);
        }

        @Override // com.ss.android.common.b.a.a.c
        public final String a() {
            return this.f59356a;
        }

        @Override // com.ss.android.common.b.a.a.c
        public final Object b() {
            return this.f59357b;
        }

        public d(String str, String str2) {
            this.f59356a = str;
            this.f59357b = str2;
        }
    }

    public final void a(String str, File file) {
        this.f59348a.add(new b(str, file));
    }

    public final void a(String str, String str2) {
        this.f59348a.add(new d(str, str2));
    }

    public final void a(String str, byte[] bArr, String str2) {
        this.f59348a.add(new C1293a(str, bArr, str2));
    }
}
