package com.ss.android.ugc.aweme.share.improve;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.ad;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.utils.in;
import f.a.o;
import f.a.q;
import h.c.b.a.k;
import h.c.d;
import h.c.g;
import h.f.a.m;
import h.f.b.l;
import h.f.b.z;
import h.r;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.h;

public final class e {

    /* renamed from: a */
    public static final e f123909a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(81345);
    }

    public static final class b<T> implements q {

        /* renamed from: a */
        final /* synthetic */ String f123916a;

        static {
            Covode.recordClassIndex(81349);
        }

        public b(String str) {
            this.f123916a = str;
        }

        @Override // f.a.q
        public final void a(o<String> oVar) {
            String str = "";
            l.d(oVar, str);
            String str2 = this.f123916a;
            if (str2 != null) {
                str = str2;
            }
            oVar.a(str);
        }
    }

    public static final class a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ boolean $boolPersist;
        final /* synthetic */ String $channel;
        final /* synthetic */ String $itemType;
        final /* synthetic */ z.e $longUrl;
        final /* synthetic */ z.e $url;
        int label;

        static {
            Covode.recordClassIndex(81346);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(z.e eVar, String str, String str2, z.e eVar2, boolean z, d dVar) {
            super(2, dVar);
            this.$url = eVar;
            this.$itemType = str;
            this.$channel = str2;
            this.$longUrl = eVar2;
            this.$boolPersist = z;
        }

        @Override // h.c.b.a.a
        public final d<h.z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$url, this.$itemType, this.$channel, this.$longUrl, this.$boolPersist, dVar);
        }

        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super h.z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                AnonymousClass1 r5 = new m<am, d<? super h.z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.share.improve.e.a.AnonymousClass1 */
                    int label;
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(81347);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final d<h.z> create(Object obj, d<?> dVar) {
                        l.d(dVar, "");
                        return 

                        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.lang.String */
                        /* JADX WARN: Multi-variable type inference failed */
                        public static /* synthetic */ String a(String str, String str2, String str3) {
                            l.d(str, "");
                            l.d(str3, "");
                            if (!in.d() && str2 != 0 && str2.length() != 0) {
                                z.e eVar = new z.e();
                                eVar.element = "";
                                z.e eVar2 = new z.e();
                                eVar2.element = str2;
                                eVar2.element = (T) ad.a(eVar2.element, str3);
                                Object unused = h.a(g.INSTANCE, new a(eVar, str, str3, eVar2, true, null));
                                T t = eVar.element;
                                if (hl.a(t) && t != null) {
                                    return t;
                                }
                                T t2 = eVar2.element;
                                l.b(t2, "");
                                return t2;
                            } else if (str2 == 0) {
                                return "";
                            } else {
                                return str2;
                            }
                        }
                    }
