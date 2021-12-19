package com.ss.android.ugc.aweme.bullet.module.p001default;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.c.j;
import com.bytedance.ies.xelement.m;
import com.bytedance.ies.xelement.n;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.components.video.playbox.LynxDeclarativeVideoPlayBox;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.DefaultLynxKitDelegatesProvider  reason: invalid package */
public final class DefaultLynxKitDelegatesProvider implements com.bytedance.ies.bullet.kit.lynx.c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69466a = new a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.DefaultLynxKitDelegatesProvider$LynxApi */
    public interface LynxApi {
        static {
            Covode.recordClassIndex(42819);
        }

        @h
        com.bytedance.retrofit2.b<String> getDebugUrlData(@ag String str);

        @h
        @ae
        com.bytedance.retrofit2.b<TypedInput> getUrlStream(@ag String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.DefaultLynxKitDelegatesProvider$a */
    public static final class a {
        static {
            Covode.recordClassIndex(42820);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.DefaultLynxKitDelegatesProvider$c */
    public static final class c implements com.bytedance.ies.bullet.kit.lynx.a {
        static {
            Covode.recordClassIndex(42822);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.a
        public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar) {
            l.d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.a
        public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar, Context context, m<Object, ? super Throwable, z> mVar) {
            l.d(bVar, "");
            l.d(context, "");
            l.d(mVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.a
        public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar, com.bytedance.ies.bullet.kit.lynx.b.b bVar2) {
            l.d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.a
        public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar, String str) {
            l.d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.a
        public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar, JSONObject jSONObject) {
            l.d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.a
        public final void b(com.bytedance.ies.bullet.kit.lynx.b bVar) {
            l.d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.a
        public final void c(com.bytedance.ies.bullet.kit.lynx.b bVar) {
            l.d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.a
        public final void d(com.bytedance.ies.bullet.kit.lynx.b bVar) {
            l.d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.a
        public final void e(com.bytedance.ies.bullet.kit.lynx.b bVar) {
            l.d(bVar, "");
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.a
        public final void f(com.bytedance.ies.bullet.kit.lynx.b bVar) {
            l.d(bVar, "");
        }

        c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.DefaultLynxKitDelegatesProvider$e */
    public static final class e implements com.bytedance.ies.bullet.kit.lynx.c.a {
        static {
            Covode.recordClassIndex(42824);
        }

        e() {
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.c.a
        public final List<com.lynx.tasm.behavior.a> a() {
            return com.ss.android.ugc.aweme.cq.b.c.a(false);
        }
    }

    static {
        Covode.recordClassIndex(42818);
        n.a.a().a(new m.a().a(b.f69467a).a());
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.DefaultLynxKitDelegatesProvider$b */
    static final class b extends h.f.b.m implements h.f.a.b<Context, com.bytedance.ies.xelement.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f69467a = new b();

        static {
            Covode.recordClassIndex(42821);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.xelement.d invoke(Context context) {
            Context context2 = context;
            l.d(context2, "");
            return new LynxDeclarativeVideoPlayBox(context2, (byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.DefaultLynxKitDelegatesProvider$d */
    public static final class d implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DefaultLynxKitDelegatesProvider f69468a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b f69469b;

        /* renamed from: c  reason: collision with root package name */
        private f.a.b.b f69470c;

        static {
            Covode.recordClassIndex(42823);
        }

        @Override // com.bytedance.ies.bullet.c.c.j
        public final void a(i iVar) {
            l.d(iVar, "");
            j.a.a(iVar);
        }

        d(DefaultLynxKitDelegatesProvider defaultLynxKitDelegatesProvider, com.bytedance.ies.bullet.c.e.a.b bVar) {
            this.f69468a = defaultLynxKitDelegatesProvider;
            this.f69469b = bVar;
        }

        @Override // com.bytedance.ies.bullet.c.c.j
        public final void a(i iVar, Uri uri) {
            l.d(iVar, "");
            l.d(uri, "");
            this.f69470c = null;
        }

        @Override // com.bytedance.ies.bullet.c.c.j
        public final void a(i iVar, Throwable th) {
            l.d(iVar, "");
            j.a.b(iVar);
            f.a.b.b bVar = this.f69470c;
            if (bVar != null) {
                bVar.dispose();
            }
        }

        @Override // com.bytedance.ies.bullet.c.c.j
        public final void a(i iVar, Uri uri, h.f.a.b<? super Uri, z> bVar, h.f.a.b<? super Throwable, z> bVar2) {
            l.d(iVar, "");
            l.d(uri, "");
            l.d(bVar, "");
            l.d(bVar2, "");
            j.a.a(iVar, uri, bVar, bVar2);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.e
    public final j a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return new d(this, bVar);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.c
    public final com.bytedance.ies.bullet.kit.lynx.a b(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return new c();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.c
    public final com.bytedance.ies.bullet.kit.lynx.c.a c(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return new e();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.c
    public final com.bytedance.ies.bullet.kit.lynx.c.a d(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        l.c(bVar, "");
        return null;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.c
    public final com.bytedance.ies.bullet.kit.lynx.c.b e(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        l.c(bVar, "");
        return null;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.c
    public final com.bytedance.ies.bullet.kit.lynx.c.c f(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        l.c(bVar, "");
        return null;
    }
}
