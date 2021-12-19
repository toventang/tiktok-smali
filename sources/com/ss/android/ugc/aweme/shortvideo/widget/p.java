package com.ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cover.a;
import f.a.l.d;
import f.a.t;
import f.a.v;
import f.a.w;
import f.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.atomic.AtomicInteger;

public final class p {

    /* renamed from: d  reason: collision with root package name */
    public static final a f132954d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f132955a;

    /* renamed from: b  reason: collision with root package name */
    public final int f132956b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.cover.a f132957c;

    /* renamed from: e  reason: collision with root package name */
    private d<h.p<Integer, Bitmap>> f132958e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f132959f;

    /* renamed from: g  reason: collision with root package name */
    private final h f132960g;

    static {
        Covode.recordClassIndex(86955);
    }

    private final t<h.p<Integer, Bitmap>> c() {
        return (t) this.f132960g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(86956);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<t<h.p<? extends Integer, ? extends Bitmap>>> {
        final /* synthetic */ int $coverSize;
        final /* synthetic */ int $height;
        final /* synthetic */ int $width;
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(86957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar, int i2, int i3, int i4) {
            super(0);
            this.this$0 = pVar;
            this.$width = i2;
            this.$height = i3;
            this.$coverSize = i4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<h.p<? extends Integer, ? extends Bitmap>> invoke() {
            return t.a(new w<h.p<? extends Integer, ? extends Bitmap>>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.widget.p.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f132961a;

                static {
                    Covode.recordClassIndex(86958);
                }

                {
                    this.f132961a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.v<h.p<java.lang.Integer, android.graphics.Bitmap>>] */
                @Override // f.a.w
                public final void subscribe(final v<h.p<? extends Integer, ? extends Bitmap>> vVar) {
                    l.d(vVar, "");
                    final AtomicInteger atomicInteger = new AtomicInteger();
                    this.f132961a.this$0.f132957c.a(this.f132961a.$width, this.f132961a.$height, new a.AbstractC3267a(this) {
                        /* class com.ss.android.ugc.aweme.shortvideo.widget.p.b.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f132962a;

                        static {
                            Covode.recordClassIndex(86959);
                        }

                        {
                            this.f132962a = r1;
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: f.a.v */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.ss.android.ugc.aweme.shortvideo.cover.a.AbstractC3267a
                        public final void a(int i2, Bitmap bitmap) {
                            vVar.a(new h.p(Integer.valueOf(i2), bitmap));
                            if (atomicInteger.incrementAndGet() == this.f132962a.f132961a.$coverSize) {
                                vVar.a();
                            }
                        }
                    });
                }
            });
        }
    }

    public final t<h.p<Integer, Bitmap>> a() {
        if (!this.f132959f) {
            c().b((z<? super h.p<Integer, Bitmap>>) this.f132958e);
            this.f132959f = true;
        }
        return this.f132958e;
    }

    public final void b() {
        this.f132957c.b();
        this.f132959f = false;
        d<h.p<Integer, Bitmap>> i2 = d.i();
        l.b(i2, "");
        this.f132958e = i2;
    }

    public p(com.ss.android.ugc.aweme.shortvideo.cover.a aVar, int i2, int i3, int i4) {
        l.d(aVar, "");
        this.f132957c = aVar;
        d<h.p<Integer, Bitmap>> i5 = d.i();
        l.b(i5, "");
        this.f132958e = i5;
        this.f132955a = i4;
        this.f132956b = i2;
        this.f132960g = i.a((h.f.a.a) new b(this, i2, i3, i4));
    }
}
