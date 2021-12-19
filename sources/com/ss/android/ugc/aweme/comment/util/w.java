package com.ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.v;
import h.f.b.l;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public b f72888a;

    /* renamed from: b  reason: collision with root package name */
    public f.a.b.b f72889b;

    public interface a {
        static {
            Covode.recordClassIndex(44895);
        }

        void a(String str);
    }

    public interface b {
        static {
            Covode.recordClassIndex(44896);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(44894);
    }

    public static final class c<T> implements f.a.w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f72890a;

        static {
            Covode.recordClassIndex(44897);
        }

        public c(w wVar) {
            this.f72890a = wVar;
        }

        @Override // f.a.w
        public final void subscribe(final v<String> vVar) {
            l.d(vVar, "");
            this.f72890a.f72888a = new b() {
                /* class com.ss.android.ugc.aweme.comment.util.w.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(44898);
                }

                @Override // com.ss.android.ugc.aweme.comment.util.w.b
                public final void a(String str) {
                    l.d(str, "");
                    v vVar = vVar;
                    l.b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.a(str);
                    }
                }
            };
        }
    }

    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f72892a;

        static {
            Covode.recordClassIndex(44899);
        }

        public d(a aVar) {
            this.f72892a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            a aVar = this.f72892a;
            l.b(str, "");
            aVar.a(str);
        }
    }
}
