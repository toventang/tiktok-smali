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

public class i implements a {
    static {
        Covode.recordClassIndex(37079);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        if (context != null && componentName != null) {
            if (i2 < 0) {
                i2 = 0;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("tag", componentName.getPackageName() + "/" + componentName.getClassName());
            contentValues.put("count", Integer.valueOf(i2));
            try {
                context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
            } catch (Throwable th) {
                throw new d(th.getMessage());
            }
        }
    }
}
