package com.ss.android.ad.splash.core.i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ad.splash.core.b.a;
import java.util.LinkedList;
import java.util.List;

public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    a f58614a;

    static {
        Covode.recordClassIndex(36342);
    }

    @Override // com.ss.android.ad.splash.core.i.g
    public final List<f> a() {
        boolean z;
        LinkedList linkedList = new LinkedList();
        Cursor a2 = this.f58614a.a().a("trackurl");
        while (a2.moveToNext()) {
            try {
                String string = a2.getString(a2.getColumnIndex("id"));
                String string2 = a2.getString(a2.getColumnIndex("url"));
                if (a2.getInt(a2.getColumnIndex("replaceholder")) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                linkedList.add(new f(a2.getLong(a2.getColumnIndex("cid")), a2.getString(a2.getColumnIndex("log_extra")), string, string2, z, a2.getInt(a2.getColumnIndex("retry")), a2.getInt(a2.getColumnIndex(StringSet.type))));
            } catch (Exception e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }
        a2.close();
        return linkedList;
    }

    public h(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f58614a = a.a(applicationContext);
    }

    @Override // com.ss.android.ad.splash.core.i.g
    public final void c(f fVar) {
        this.f58614a.a().a("trackurl", "id=?", new String[]{fVar.f58607a});
    }

    @Override // com.ss.android.ad.splash.core.i.g
    public final void b(f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fVar.f58607a);
        contentValues.put("url", fVar.f58608b);
        contentValues.put("replaceholder", Integer.valueOf(fVar.f58609c ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(fVar.f58610d));
        contentValues.put(StringSet.type, Integer.valueOf(fVar.f58611e));
        contentValues.put("cid", Long.valueOf(fVar.f58612f));
        contentValues.put("log_extra", fVar.f58613g);
        this.f58614a.a().a("trackurl", contentValues, "id=?", new String[]{fVar.f58607a});
    }

    @Override // com.ss.android.ad.splash.core.i.g
    public final void a(f fVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", fVar.f58607a);
        contentValues.put("url", fVar.f58608b);
        contentValues.put("replaceholder", Integer.valueOf(fVar.f58609c ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(fVar.f58610d));
        contentValues.put(StringSet.type, Integer.valueOf(fVar.f58611e));
        contentValues.put("cid", Long.valueOf(fVar.f58612f));
        contentValues.put("log_extra", fVar.f58613g);
        this.f58614a.a().a("trackurl", contentValues);
    }
}
