package com.bytedance.android.livesdk.as;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManagerV2;
import com.ss.ugc.live.sdk.msg.b.c;
import com.ss.ugc.live.sdk.msg.b.e;
import com.ss.ugc.live.sdk.msg.d.f;
import f.a.ad;
import f.a.af;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.n;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0305a f14054a = new C0305a((byte) 0);

    static {
        Covode.recordClassIndex(7795);
    }

    /* renamed from: com.bytedance.android.livesdk.as.a$a  reason: collision with other inner class name */
    public static final class C0305a {
        static {
            Covode.recordClassIndex(7796);
        }

        private C0305a() {
        }

        public /* synthetic */ C0305a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.as.a$a$a  reason: collision with other inner class name */
        public static final class C0306a<T> implements w {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ IMessageManagerV2 f14055a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f14056b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e f14057c;

            static {
                Covode.recordClassIndex(7797);
            }

            C0306a(IMessageManagerV2 iMessageManagerV2, long j2, e eVar) {
                this.f14055a = iMessageManagerV2;
                this.f14056b = j2;
                this.f14057c = eVar;
            }

            @Override // f.a.w
            public final void subscribe(final v<T> vVar) {
                l.d(vVar, "");
                this.f14055a.sendRequest(this.f14056b, this.f14057c, new c() {
                    /* class com.bytedance.android.livesdk.as.a.C0305a.C0306a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(7798);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: f.a.v */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.ss.ugc.live.sdk.msg.b.c
                    public final void a(f<com.ss.ugc.live.sdk.msg.b.f, ? extends Exception> fVar) {
                        l.d(fVar, "");
                        if (fVar instanceof f.c) {
                            V v = ((f.c) fVar).f154188b;
                            Object obj = v.f154124e;
                            if (obj instanceof com.bytedance.android.live.network.response.b) {
                                ((com.bytedance.android.live.network.response.b) obj).requestType = v.f154125f;
                            }
                            vVar.a(obj);
                            vVar.a();
                        } else if (fVar instanceof f.b) {
                            vVar.a((Throwable) ((f.b) fVar).f154187b);
                        } else {
                            throw new n();
                        }
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.as.a$a$b */
        public static final class b<T> implements af {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ IMessageManagerV2 f14059a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f14060b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e f14061c;

            static {
                Covode.recordClassIndex(7799);
            }

            b(IMessageManagerV2 iMessageManagerV2, long j2, e eVar) {
                this.f14059a = iMessageManagerV2;
                this.f14060b = j2;
                this.f14061c = eVar;
            }

            @Override // f.a.af
            public final void subscribe(final ad<T> adVar) {
                l.d(adVar, "");
                this.f14059a.sendRequest(this.f14060b, this.f14061c, new c() {
                    /* class com.bytedance.android.livesdk.as.a.C0305a.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(7800);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: f.a.ad */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.ss.ugc.live.sdk.msg.b.c
                    public final void a(f<com.ss.ugc.live.sdk.msg.b.f, ? extends Exception> fVar) {
                        l.d(fVar, "");
                        if (fVar instanceof f.c) {
                            V v = ((f.c) fVar).f154188b;
                            Object obj = v.f154124e;
                            if (obj instanceof com.bytedance.android.live.network.response.b) {
                                ((com.bytedance.android.live.network.response.b) obj).requestType = v.f154125f;
                            }
                            adVar.a(obj);
                        } else if (fVar instanceof f.b) {
                            adVar.a((Throwable) ((f.b) fVar).f154187b);
                        } else {
                            throw new n();
                        }
                    }
                });
            }
        }
    }
}
