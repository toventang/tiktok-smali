package com.ss.android.newmedia.redbadge.a;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.redbadge.a;
import com.ss.android.newmedia.redbadge.d;
import java.util.Arrays;
import java.util.List;

public class e implements a {
    static {
        Covode.recordClassIndex(37075);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return Arrays.asList("me.everything.launcher");
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        if (context != null && componentName != null) {
            if (i2 < 0) {
                i2 = 0;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("package_name", componentName.getPackageName());
            contentValues.put("activity_name", componentName.getClassName());
            contentValues.put("count", Integer.valueOf(i2));
            try {
                context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
            } catch (Throwable th) {
                throw new d(th.getMessage());
            }
        }
    }
}
