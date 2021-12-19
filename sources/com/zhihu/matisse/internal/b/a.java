package com.zhihu.matisse.internal.b;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import androidx.loader.a.c;
import androidx.loader.app.a;
import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.internal.entity.c;
import java.lang.ref.WeakReference;

public final class a implements a.AbstractC0052a<Cursor> {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Context> f156400a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.loader.app.a f156401b;

    /* renamed from: c  reason: collision with root package name */
    public AbstractC4129a f156402c;

    /* renamed from: d  reason: collision with root package name */
    public int f156403d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f156404e;

    /* renamed from: com.zhihu.matisse.internal.b.a$a  reason: collision with other inner class name */
    public interface AbstractC4129a {
        static {
            Covode.recordClassIndex(103877);
        }

        void a();

        void a(Cursor cursor);
    }

    static {
        Covode.recordClassIndex(103876);
    }

    @Override // androidx.loader.app.a.AbstractC0052a
    public final void a() {
        if (this.f156400a.get() != null) {
            this.f156402c.a();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.loader.app.a.AbstractC0052a
    public final /* synthetic */ void a(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (this.f156400a.get() != null && !this.f156404e) {
            this.f156404e = true;
            this.f156402c.a(cursor2);
        }
    }

    @Override // androidx.loader.app.a.AbstractC0052a
    public final c<Cursor> a(Bundle bundle) {
        String[] strArr;
        Context context = this.f156400a.get();
        if (context == null) {
            return null;
        }
        this.f156404e = false;
        String str = "media_type=? AND _size>0) GROUP BY (bucket_id";
        if (c.a.f156445a.c()) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = "media_type=? AND _size>0";
            }
            strArr = com.zhihu.matisse.internal.a.a.a(1);
        } else if (c.a.f156445a.d()) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = "media_type=? AND _size>0";
            }
            strArr = com.zhihu.matisse.internal.a.a.a(3);
        } else {
            if (Build.VERSION.SDK_INT < 29) {
                str = "(media_type=? OR media_type=?) AND _size>0) GROUP BY (bucket_id";
            } else {
                str = "(media_type=? OR media_type=?) AND _size>0";
            }
            strArr = com.zhihu.matisse.internal.a.a.v;
        }
        return new com.zhihu.matisse.internal.a.a(context, str, strArr);
    }
}
