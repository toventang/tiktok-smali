package com.bytedance.android.live.liveinteract.platform.common.b;

import com.bytedance.android.live.liveinteract.api.o;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.Client;
import f.a.d.f;
import f.a.t;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public a f11901a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.b.a f11902b = new f.a.b.a();

    /* renamed from: c  reason: collision with root package name */
    public final a f11903c = new a(this);

    static {
        Covode.recordClassIndex(6498);
    }

    public final void a() {
        if (!this.f11902b.isDisposed()) {
            this.f11902b.dispose();
        }
    }

    public static final class a implements Client.Listener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11904a;

        static {
            Covode.recordClassIndex(6499);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.platform.common.b.b$a$b  reason: collision with other inner class name */
        static final class C0249b<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final C0249b f11909a = new C0249b();

            static {
                Covode.recordClassIndex(6501);
            }

            C0249b() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                com.bytedance.android.live.core.c.a.a(o.f10017a, (Throwable) obj);
            }
        }

        static final class d<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final d f11914a = new d();

            static {
                Covode.recordClassIndex(6503);
            }

            d() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                com.bytedance.android.live.core.c.a.a(o.f10017a, (Throwable) obj);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f11904a = bVar;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.platform.common.b.b$a$a  reason: collision with other inner class name */
        static final class C0248a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f11905a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f11906b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f11907c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Exception f11908d;

            static {
                Covode.recordClassIndex(6500);
            }

            C0248a(a aVar, int i2, long j2, Exception exc) {
                this.f11905a = aVar;
                this.f11906b = i2;
                this.f11907c = j2;
                this.f11908d = exc;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                String message;
                String message2;
                a aVar;
                String message3;
                int i2 = this.f11906b;
                String str = "";
                if (i2 == -3) {
                    a aVar2 = this.f11905a.f11904a.f11901a;
                    if (aVar2 != null) {
                        int i3 = (int) this.f11907c;
                        Exception exc = this.f11908d;
                        if (!(exc == null || (message = exc.getMessage()) == null)) {
                            str = message;
                        }
                        aVar2.c(i3, str);
                    }
                } else if (i2 == -2) {
                    a aVar3 = this.f11905a.f11904a.f11901a;
                    if (aVar3 != null) {
                        int i4 = (int) this.f11907c;
                        Exception exc2 = this.f11908d;
                        if (!(exc2 == null || (message2 = exc2.getMessage()) == null)) {
                            str = message2;
                        }
                        aVar3.b(i4, str);
                    }
                } else if (i2 == -1 && (aVar = this.f11905a.f11904a.f11901a) != null) {
                    int i5 = (int) this.f11907c;
                    Exception exc3 = this.f11908d;
                    if (!(exc3 == null || (message3 = exc3.getMessage()) == null)) {
                        str = message3;
                    }
                    aVar.a(i5, str);
                }
            }
        }

        static final class c<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f11910a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f11911b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f11912c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Object[] f11913d;

            static {
                Covode.recordClassIndex(6502);
            }

            c(a aVar, int i2, long j2, Object[] objArr) {
                this.f11910a = aVar;
                this.f11911b = i2;
                this.f11912c = j2;
                this.f11913d = objArr;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r1v9 */
            /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r1v10 */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r3v11 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r6v5 */
            /* JADX WARN: Type inference failed for: r3v13 */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r3v14 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r3v20 */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARNING: Unknown variable types count: 16 */
            @Override // f.a.d.f
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void accept(java.lang.Object r9) {
                /*
                // Method dump skipped, instructions count: 534
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.platform.common.b.b.a.c.accept(java.lang.Object):void");
            }
        }

        @Override // com.ss.avframework.livestreamv2.core.Client.Listener
        public final void onError(Client client, int i2, long j2, Exception exc) {
            this.f11904a.f11902b.a(t.b((Object) 1).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new C0248a(this, i2, j2, exc), C0249b.f11909a));
        }

        @Override // com.ss.avframework.livestreamv2.core.Client.Listener
        public final void onInfo(Client client, int i2, long j2, Object... objArr) {
            l.d(objArr, "");
            this.f11904a.f11902b.a(t.b((Object) 1).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this, i2, j2, objArr), d.f11914a));
        }
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        this.f11901a = aVar;
    }
}
