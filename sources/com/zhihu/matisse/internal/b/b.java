package com.zhihu.matisse.internal.b;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import androidx.fragment.app.e;
import androidx.loader.a.c;
import androidx.loader.app.a;
import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.c;
import java.lang.ref.WeakReference;

public final class b implements a.AbstractC0052a<Cursor> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f156405a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.loader.app.a f156406b;

    /* renamed from: c  reason: collision with root package name */
    private a f156407c;

    public interface a {
        static {
            Covode.recordClassIndex(103879);
        }

        void a();

        void a(Cursor cursor);
    }

    static {
        Covode.recordClassIndex(103878);
    }

    @Override // androidx.loader.app.a.AbstractC0052a
    public final void a() {
        if (this.f156405a.get() != null) {
            this.f156407c.a();
        }
    }

    public final void b() {
        androidx.loader.app.a aVar = this.f156406b;
        if (aVar != null) {
            aVar.a(2);
        }
        this.f156407c = null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.loader.app.a.AbstractC0052a
    public final /* synthetic */ void a(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (this.f156405a.get() != null) {
            this.f156407c.a(cursor2);
        }
    }

    @Override // androidx.loader.app.a.AbstractC0052a
    public final c<Cursor> a(Bundle bundle) {
        Album album;
        boolean z;
        String[] strArr;
        Context context = this.f156405a.get();
        if (context == null || (album = (Album) bundle.getParcelable("args_album")) == null) {
            return null;
        }
        boolean z2 = false;
        if (!album.b() || !bundle.getBoolean("args_enable_capture", false)) {
            z = false;
        } else {
            z = true;
        }
        String str = "media_type=? AND _size>0";
        if (album.b()) {
            if (c.a.f156445a.c()) {
                strArr = com.zhihu.matisse.internal.a.b.a(1);
            } else if (c.a.f156445a.d()) {
                strArr = com.zhihu.matisse.internal.a.b.a(3);
            } else {
                strArr = com.zhihu.matisse.internal.a.b.v;
                str = "(media_type=? OR media_type=?) AND _size>0";
            }
            z2 = z;
        } else {
            str = "media_type=? AND  bucket_id=? AND _size>0";
            if (c.a.f156445a.c()) {
                strArr = com.zhihu.matisse.internal.a.b.a(1, album.f156417b);
            } else if (c.a.f156445a.d()) {
                strArr = com.zhihu.matisse.internal.a.b.a(3, album.f156417b);
            } else {
                strArr = new String[]{"1", "3", album.f156417b};
                str = "(media_type=? OR media_type=?) AND  bucket_id=? AND _size>0";
            }
        }
        return new com.zhihu.matisse.internal.a.b(context, str, strArr, z2);
    }

    public final void a(e eVar, a aVar) {
        this.f156405a = new WeakReference<>(eVar);
        this.f156406b = eVar.getSupportLoaderManager();
        this.f156407c = aVar;
    }

    public final void a(Album album, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_album", album);
        bundle.putBoolean("args_enable_capture", z);
        this.f156406b.a(2, bundle, this);
    }
}
