package com.bytedance.ies.bullet.e;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.service.base.b;
import com.bytedance.ies.bullet.service.base.c;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.h;
import h.f.a.m;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a implements q<Uri, Uri, m<? super Boolean, ? super b, ? extends z>, z> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f32107a;

    /* renamed from: b  reason: collision with root package name */
    private final d.b f32108b;

    static {
        Covode.recordClassIndex(18830);
    }

    public a(Context context, d.b bVar) {
        l.c(context, "");
        l.c(bVar, "");
        this.f32107a = context;
        this.f32108b = bVar;
    }

    /* renamed from: com.bytedance.ies.bullet.e.a$a  reason: collision with other inner class name */
    public static final class C0676a implements h.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f32109a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f32110b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Uri f32111c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Uri f32112d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f32113e;

        /* renamed from: f  reason: collision with root package name */
        private final AtomicBoolean f32114f = new AtomicBoolean(false);

        static {
            Covode.recordClassIndex(18831);
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(Uri uri) {
            l.c(uri, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(i iVar, Uri uri, com.bytedance.ies.bullet.service.f.a.b.q qVar) {
            l.c(iVar, "");
            l.c(uri, "");
            l.c(qVar, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, i iVar, boolean z) {
            l.c(list, "");
            l.c(uri, "");
            l.c(iVar, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(Uri uri, Throwable th) {
            l.c(uri, "");
            l.c(th, "");
            if (this.f32114f.compareAndSet(false, true)) {
                this.f32113e.invoke(false, this.f32109a);
            }
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(View view, Uri uri, i iVar) {
            l.c(view, "");
            l.c(uri, "");
            l.c(iVar, "");
            if (this.f32114f.compareAndSet(false, true)) {
                this.f32113e.invoke(true, this.f32109a);
            }
        }

        C0676a(b bVar, a aVar, Uri uri, Uri uri2, m mVar) {
            this.f32109a = bVar;
            this.f32110b = aVar;
            this.f32111c = uri;
            this.f32112d = uri2;
            this.f32113e = mVar;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // h.f.a.q
    public final /* synthetic */ z invoke(Uri uri, Uri uri2, m<? super Boolean, ? super b, ? extends z> mVar) {
        Uri uri3 = uri;
        Uri uri4 = uri2;
        m<? super Boolean, ? super b, ? extends z> mVar2 = mVar;
        l.c(uri3, "");
        l.c(uri4, "");
        l.c(mVar2, "");
        BulletContainerView bulletContainerView = new BulletContainerView(new MutableContextWrapper(this.f32107a), null, 6, (byte) 0);
        bulletContainerView.a(this.f32108b);
        bulletContainerView.a(uri3, (Bundle) null, (com.bytedance.ies.bullet.c.e.a.b) null, new C0676a(new b(uri3, uri4, bulletContainerView, c.PRE_RENDER), this, uri3, uri4, mVar2));
        return z.f158842a;
    }
}
