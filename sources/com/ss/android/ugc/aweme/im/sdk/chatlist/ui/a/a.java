package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.q;
import h.f.b.g;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public abstract class a extends Enum<a> {
    public static final a ChatSession;
    public static final a StrangerSession;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ a[] f102065a;

    static {
        Covode.recordClassIndex(65308);
        C2549a aVar = new C2549a("ChatSession");
        ChatSession = aVar;
        b bVar = new b("StrangerSession");
        StrangerSession = bVar;
        f102065a = new a[]{aVar, bVar};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f102065a.clone();
    }

    public abstract List<q<Context, com.bytedance.ies.im.core.api.b.b, com.ss.android.ugc.aweme.im.service.k.a, b>> getActionList();

    public abstract String getTitle(Context context, String str);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a$a  reason: collision with other inner class name */
    static final class C2549a extends a {
        private final List<q<Context, com.bytedance.ies.im.core.api.b.b, com.ss.android.ugc.aweme.im.service.k.a, b>> actionList;

        static {
            Covode.recordClassIndex(65309);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a
        public final List<q<Context, com.bytedance.ies.im.core.api.b.b, com.ss.android.ugc.aweme.im.service.k.a, b>> getActionList() {
            return this.actionList;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2549a(String str) {
            super(str, 0, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(C2550a.f102066a);
            arrayList.add(b.f102067a);
            arrayList.add(c.f102068a);
            arrayList.add(d.f102069a);
            this.actionList = n.k(arrayList);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a
        public final String getTitle(Context context, String str) {
            l.d(context, "");
            l.d(str, "");
            String string = context.getString(R.string.b9h, str);
            l.b(string, "");
            return string;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a$a$a  reason: collision with other inner class name */
        static final class C2550a extends m implements q<Context, com.bytedance.ies.im.core.api.b.b, com.ss.android.ugc.aweme.im.service.k.a, b> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2550a f102066a = new C2550a();

            static {
                Covode.recordClassIndex(65310);
            }

            C2550a() {
                super(3);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.q
            public final /* synthetic */ b invoke(Context context, com.bytedance.ies.im.core.api.b.b bVar, com.ss.android.ugc.aweme.im.service.k.a aVar) {
                Context context2 = context;
                com.bytedance.ies.im.core.api.b.b bVar2 = bVar;
                com.ss.android.ugc.aweme.im.service.k.a aVar2 = aVar;
                l.d(context2, "");
                l.d(bVar2, "");
                l.d(aVar2, "");
                return new c(context2, bVar2, aVar2);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a$a$b */
        static final class b extends m implements q<Context, com.bytedance.ies.im.core.api.b.b, com.ss.android.ugc.aweme.im.service.k.a, b> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f102067a = new b();

            static {
                Covode.recordClassIndex(65311);
            }

            b() {
                super(3);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.q
            public final /* synthetic */ b invoke(Context context, com.bytedance.ies.im.core.api.b.b bVar, com.ss.android.ugc.aweme.im.service.k.a aVar) {
                Context context2 = context;
                com.bytedance.ies.im.core.api.b.b bVar2 = bVar;
                com.ss.android.ugc.aweme.im.service.k.a aVar2 = aVar;
                l.d(context2, "");
                l.d(bVar2, "");
                l.d(aVar2, "");
                return new g(context2, bVar2, aVar2);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a$a$c */
        static final class c extends m implements q<Context, com.bytedance.ies.im.core.api.b.b, com.ss.android.ugc.aweme.im.service.k.a, b> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f102068a = new c();

            static {
                Covode.recordClassIndex(65312);
            }

            c() {
                super(3);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.q
            public final /* synthetic */ b invoke(Context context, com.bytedance.ies.im.core.api.b.b bVar, com.ss.android.ugc.aweme.im.service.k.a aVar) {
                Context context2 = context;
                com.bytedance.ies.im.core.api.b.b bVar2 = bVar;
                com.ss.android.ugc.aweme.im.service.k.a aVar2 = aVar;
                l.d(context2, "");
                l.d(bVar2, "");
                l.d(aVar2, "");
                return new e(context2, bVar2, aVar2);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a$a$d */
        static final class d extends m implements q<Context, com.bytedance.ies.im.core.api.b.b, com.ss.android.ugc.aweme.im.service.k.a, b> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f102069a = new d();

            static {
                Covode.recordClassIndex(65313);
            }

            d() {
                super(3);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.q
            public final /* synthetic */ b invoke(Context context, com.bytedance.ies.im.core.api.b.b bVar, com.ss.android.ugc.aweme.im.service.k.a aVar) {
                Context context2 = context;
                com.bytedance.ies.im.core.api.b.b bVar2 = bVar;
                com.ss.android.ugc.aweme.im.service.k.a aVar2 = aVar;
                l.d(context2, "");
                l.d(bVar2, "");
                l.d(aVar2, "");
                return new f(context2, bVar2, aVar2);
            }
        }
    }

    static final class b extends a {
        private final List<q<Context, com.bytedance.ies.im.core.api.b.b, com.ss.android.ugc.aweme.im.service.k.a, b>> actionList;

        static {
            Covode.recordClassIndex(65314);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a
        public final List<q<Context, com.bytedance.ies.im.core.api.b.b, com.ss.android.ugc.aweme.im.service.k.a, b>> getActionList() {
            return this.actionList;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(String str) {
            super(str, 1, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(C2551a.f102070a);
            this.actionList = n.k(arrayList);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a
        public final String getTitle(Context context, String str) {
            l.d(context, "");
            l.d(str, "");
            String string = context.getString(R.string.b9m, str);
            l.b(string, "");
            return string;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.a$b$a  reason: collision with other inner class name */
        static final class C2551a extends m implements q<Context, com.bytedance.ies.im.core.api.b.b, com.ss.android.ugc.aweme.im.service.k.a, b> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2551a f102070a = new C2551a();

            static {
                Covode.recordClassIndex(65315);
            }

            C2551a() {
                super(3);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.q
            public final /* synthetic */ b invoke(Context context, com.bytedance.ies.im.core.api.b.b bVar, com.ss.android.ugc.aweme.im.service.k.a aVar) {
                Context context2 = context;
                com.bytedance.ies.im.core.api.b.b bVar2 = bVar;
                com.ss.android.ugc.aweme.im.service.k.a aVar2 = aVar;
                l.d(context2, "");
                l.d(bVar2, "");
                l.d(aVar2, "");
                return new c(context2, bVar2, aVar2);
            }
        }
    }

    private a(String str, int i2) {
    }

    public /* synthetic */ a(String str, int i2, g gVar) {
        this(str, i2);
    }
}
