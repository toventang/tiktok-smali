package com.ss.android.ugc.aweme.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import f.a.d.f;
import h.f.b.l;

public final class n {
    static {
        Covode.recordClassIndex(93208);
    }

    public static final class a implements IInterceptor {

        /* renamed from: com.ss.android.ugc.aweme.util.n$a$a  reason: collision with other inner class name */
        static final class C3811a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final C3811a f142520a = new C3811a();

            static {
                Covode.recordClassIndex(93210);
            }

            C3811a() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static final class b<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final b f142521a = new b();

            static {
                Covode.recordClassIndex(93211);
            }

            b() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static final class c<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final c f142522a = new c();

            static {
                Covode.recordClassIndex(93212);
            }

            c() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static final class d<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final d f142523a = new d();

            static {
                Covode.recordClassIndex(93213);
            }

            d() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(93209);
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean matchInterceptRules(RouteIntent routeIntent) {
            String str;
            if (routeIntent != null) {
                str = routeIntent.getHost();
            } else {
                str = null;
            }
            return l.a((Object) str, (Object) "eoy");
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
            k.a(20, 0, "", false, true).b(f.a.h.a.b(f.a.k.a.f158006c)).a(C3811a.f142520a, b.f142521a);
            m.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(c.f142522a, d.f142523a);
            return false;
        }
    }
}
