package com.ss.android.newmedia.redbadge.a;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.redbadge.d;
import java.util.Arrays;
import java.util.List;

public class m implements com.ss.android.newmedia.redbadge.a {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f59991a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b  reason: collision with root package name */
    private AsyncQueryHandler f59992b;

    static {
        Covode.recordClassIndex(37083);
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final List<String> a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    static class a extends AsyncQueryHandler {
        static {
            Covode.recordClassIndex(37085);
        }

        a(ContentResolver contentResolver) {
            super(contentResolver);
        }

        /* access modifiers changed from: protected */
        public Handler createHandler(Looper looper) {
            return new C1305a(looper);
        }

        /* renamed from: com.ss.android.newmedia.redbadge.a.m$a$a  reason: collision with other inner class name */
        class C1305a extends AsyncQueryHandler.WorkerHandler {
            static {
                Covode.recordClassIndex(37086);
            }

            public final void handleMessage(Message message) {
                try {
                    super.handleMessage(message);
                } catch (SecurityException e2) {
                    e2.printStackTrace();
                }
            }

            C1305a(Looper looper) {
                super(a.this, looper);
            }
        }
    }

    @Override // com.ss.android.newmedia.redbadge.a
    public final void a(Context context, ComponentName componentName, int i2) {
        if (context != null && componentName != null) {
            boolean z = false;
            if (i2 < 0) {
                i2 = 0;
            }
            try {
                if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
                    if (this.f59992b == null) {
                        Context applicationContext = context.getApplicationContext();
                        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                            if (applicationContext == null) {
                                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                            }
                        }
                        this.f59992b = new a(applicationContext.getContentResolver()) {
                            /* class com.ss.android.newmedia.redbadge.a.m.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(37084);
                            }
                        };
                    }
                    String packageName = componentName.getPackageName();
                    String className = componentName.getClassName();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("badge_count", Integer.valueOf(i2));
                    contentValues.put("package_name", packageName);
                    contentValues.put("activity_name", className);
                    this.f59992b.startInsert(0, null, this.f59991a, contentValues);
                    return;
                }
                Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
                intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
                intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
                intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i2));
                if (i2 > 0) {
                    z = true;
                }
                intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
                context.sendBroadcast(intent);
            } catch (Throwable th) {
                throw new d(th.getMessage());
            }
        }
    }
}
