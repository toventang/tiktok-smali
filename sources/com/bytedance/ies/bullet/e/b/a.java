package com.bytedance.ies.bullet.e.b;

import android.net.Uri;
import android.util.LruCache;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.b;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import h.f.b.l;

public final class a implements com.bytedance.ies.bullet.e.a.a<Uri, b> {

    /* renamed from: a  reason: collision with root package name */
    public C0677a f32123a;

    static {
        Covode.recordClassIndex(18838);
    }

    public a(int i2) {
        this.f32123a = new C0677a(i2, i2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.ies.bullet.e.a.a
    public final /* synthetic */ b a(Uri uri) {
        l.c(uri, "");
        return this.f32123a.remove(uri);
    }

    public final boolean a(Uri uri) {
        l.c(uri, "");
        if (this.f32123a.get(uri) != null) {
            return true;
        }
        return false;
    }

    public final boolean b(Uri uri) {
        BulletContainerView a2;
        l.c(uri, "");
        b bVar = (b) this.f32123a.remove(uri);
        if (bVar == null) {
            return false;
        }
        View view = bVar.f32570c;
        if (view == null || (a2 = com.bytedance.ies.bullet.e.c.a.a(view)) == null) {
            return true;
        }
        a2.a();
        return true;
    }

    /* renamed from: com.bytedance.ies.bullet.e.b.a$a  reason: collision with other inner class name */
    public static final class C0677a extends LruCache<Uri, b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f32124a;

        static {
            Covode.recordClassIndex(18839);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0677a(int i2, int i3) {
            super(i3);
            this.f32124a = i2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // android.util.LruCache
        public final /* synthetic */ void entryRemoved(boolean z, Uri uri, b bVar, b bVar2) {
            View view;
            BulletContainerView a2;
            b bVar3 = bVar;
            super.entryRemoved(z, uri, bVar3, bVar2);
            if (z && bVar3 != null && (view = bVar3.f32570c) != null && (a2 = com.bytedance.ies.bullet.e.c.a.a(view)) != null) {
                a2.a();
            }
        }
    }

    public final boolean a(Uri uri, b bVar) {
        l.c(uri, "");
        l.c(bVar, "");
        this.f32123a.put(uri, bVar);
        return true;
    }
}
