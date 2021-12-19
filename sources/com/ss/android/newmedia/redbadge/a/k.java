package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.c.b;
import java.util.Arrays;
import java.util.List;

public class k implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f59989a = {"_id", "class"};

    /* renamed from: b  reason: collision with root package name */
    private d f59990b;

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    static {
        Covode.recordClassIndex(37081);
    }

    public k() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f59990b = new d();
        }
    }

    private static ContentValues a(ComponentName componentName, int i2, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i2));
        return contentValues;
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        int i3 = i2;
        MethodCollector.i(189);
        if (context == null || componentName == null) {
            MethodCollector.o(189);
            return;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (this.f59990b == null || !com.ss.android.newmedia.redbadge.c.a.a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"))) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            try {
                Cursor query = contentResolver.query(parse, f59989a, "package=?", new String[]{componentName.getPackageName()}, null);
                if (query != null) {
                    String className = componentName.getClassName();
                    boolean z = false;
                    while (query.moveToNext()) {
                        int i4 = query.getInt(0);
                        contentResolver.update(parse, a(componentName, i3, false), "_id=?", new String[]{String.valueOf(i4)});
                        if (className.equals(query.getString(query.getColumnIndex("class")))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        contentResolver.insert(parse, a(componentName, i3, true));
                    }
                }
                b.a(query);
                MethodCollector.o(189);
            } catch (Throwable th) {
                b.a(null);
                MethodCollector.o(189);
                throw th;
            }
        } else {
            this.f59990b.a(context, componentName, i3);
            MethodCollector.o(189);
        }
    }
}
