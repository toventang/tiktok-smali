package com.ss.android.ugc.aweme.discover.lynx.delegate;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.helper.ae;
import com.ss.android.ugc.aweme.discover.m.b;
import com.ss.android.ugc.aweme.feed.i.ag;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONObject;

public final class e extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81485a = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f81486c;

    static {
        Covode.recordClassIndex(50642);
    }

    private final b.a<ag> d() {
        return (b.a) this.f81486c.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50643);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ com.ss.android.ugc.aweme.discover.lynx.a.b $bulletContext;

        static {
            Covode.recordClassIndex(50644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
            super(0);
            this.$bulletContext = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new b.a<ag>(this) {
                /* class com.ss.android.ugc.aweme.discover.lynx.delegate.e.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f81487a;

                static {
                    Covode.recordClassIndex(50645);
                }

                @Override // com.ss.android.ugc.aweme.discover.m.b.a
                public final Class<ag> a() {
                    return ag.class;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f81487a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.aweme.discover.m.b.a
                public final /* synthetic */ void a(ag agVar) {
                    ag agVar2 = agVar;
                    l.d(agVar2, "");
                    if (agVar2.f93450a == 13) {
                        com.ss.android.ugc.aweme.discover.lynx.a.b bVar = this.f81487a.$bulletContext;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("aid", agVar2.f93451b);
                        Bundle bundle = agVar2.f93452c;
                        if (bundle != null) {
                            jSONObject.put("dig_status", bundle.getInt("user_digged"));
                        }
                        bVar.a("changeDiggState", jSONObject);
                    }
                }
            };
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.delegate.b
    public final void b() {
        ae.f81066a.a((b.a<?>) d());
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.delegate.b
    public final void c() {
        ae aeVar = ae.f81066a;
        b.a<ag> d2 = d();
        l.d(d2, "");
        Iterator<WeakReference<b.a<?>>> it = aeVar.a().iterator();
        while (it.hasNext()) {
            WeakReference<b.a<?>> next = it.next();
            if (d2 == next.get() || next.get() == null) {
                it.remove();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
        this.f81486c = i.a((h.f.a.a) new b(bVar));
    }
}
