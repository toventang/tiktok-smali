package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.a.c;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class bi {
    static {
        Covode.recordClassIndex(93334);
    }

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f142672a;

        /* renamed from: b  reason: collision with root package name */
        private final c f142673b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<Object, Object> f142674c = new LinkedHashMap();

        static {
            Covode.recordClassIndex(93335);
        }

        @Override // com.ss.android.ugc.tools.view.a.c
        public final void a(com.ss.android.ugc.tools.view.a.a aVar) {
            l.d(aVar, "");
        }

        a(c cVar) {
            this.f142672a = cVar;
            this.f142673b = cVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.c
        public final void b(com.ss.android.ugc.tools.view.a.b bVar) {
            l.d(bVar, "");
            if (this.f142674c.containsKey(bVar)) {
                c cVar = this.f142673b;
                Object remove = this.f142674c.remove(bVar);
                Objects.requireNonNull(remove, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVActivityResultListener");
                cVar.b((com.ss.android.ugc.tools.view.a.b) remove);
            }
        }

        @Override // com.ss.android.ugc.tools.view.a.c
        public final void c(com.ss.android.ugc.tools.view.a.a aVar) {
            l.d(aVar, "");
            if (this.f142674c.containsKey(aVar)) {
                c cVar = this.f142673b;
                Object remove = this.f142674c.remove(aVar);
                Objects.requireNonNull(remove, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVActivityOnKeyDownListener");
                cVar.c((com.ss.android.ugc.tools.view.a.a) remove);
            }
        }

        @Override // com.ss.android.ugc.tools.view.a.c
        public final void a(com.ss.android.ugc.tools.view.a.b bVar) {
            l.d(bVar, "");
            if (!this.f142674c.containsKey(bVar)) {
                this.f142674c.put(bVar, new b(bVar));
            }
            c cVar = this.f142673b;
            Object obj = this.f142674c.get(bVar);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVActivityResultListener");
            cVar.a((com.ss.android.ugc.tools.view.a.b) obj);
        }

        @Override // com.ss.android.ugc.tools.view.a.c
        public final void b(com.ss.android.ugc.tools.view.a.a aVar) {
            l.d(aVar, "");
            if (!this.f142674c.containsKey(aVar)) {
                this.f142674c.put(aVar, new C3812a(aVar));
            }
            c cVar = this.f142673b;
            Object obj = this.f142674c.get(aVar);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVActivityOnKeyDownListener");
            cVar.b((com.ss.android.ugc.tools.view.a.a) obj);
        }

        /* renamed from: com.ss.android.ugc.aweme.utils.bi$a$a  reason: collision with other inner class name */
        static final class C3812a implements com.ss.android.ugc.tools.view.a.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.tools.view.a.a f142675a;

            static {
                Covode.recordClassIndex(93336);
            }

            C3812a(com.ss.android.ugc.tools.view.a.a aVar) {
                this.f142675a = aVar;
            }

            @Override // com.ss.android.ugc.tools.view.a.a
            public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
                return this.f142675a.onKeyDown(i2, keyEvent);
            }
        }

        static final class b implements com.ss.android.ugc.tools.view.a.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.tools.view.a.b f142676a;

            static {
                Covode.recordClassIndex(93337);
            }

            b(com.ss.android.ugc.tools.view.a.b bVar) {
                this.f142676a = bVar;
            }

            @Override // com.ss.android.ugc.tools.view.a.b
            public final boolean a(int i2, int i3, Intent intent) {
                return this.f142676a.a(i2, i3, intent);
            }
        }
    }

    public static final c a(c cVar) {
        l.d(cVar, "");
        return new a(cVar);
    }

    public static final c a(Activity activity) {
        l.d(activity, "");
        if ((activity instanceof c) && activity != null) {
            return a((c) activity);
        }
        return null;
    }
}
