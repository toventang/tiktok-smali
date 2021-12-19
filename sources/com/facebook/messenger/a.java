package com.facebook.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.ae;
import com.facebook.internal.m;
import java.util.HashSet;
import java.util.Set;

public class a {
    static {
        Covode.recordClassIndex(29496);
    }

    public static void a(Context context) {
        if (!com.facebook.internal.a.b.a.a(a.class)) {
            try {
                a(context, "market://details?id=com.facebook.orca");
            } catch (ActivityNotFoundException unused) {
                a(context, "http://play.google.com/store/apps/details?id=com.facebook.orca");
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, a.class);
            }
        }
    }

    private static Set<Integer> b(Context context) {
        MethodCollector.i(1787);
        ContentResolver contentResolver = context.getContentResolver();
        HashSet hashSet = new HashSet();
        Cursor query = contentResolver.query(Uri.parse("content://com.facebook.orca.provider.MessengerPlatformProvider/versions"), new String[]{"version"}, null, null, null);
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex("version");
                while (query.moveToNext()) {
                    hashSet.add(Integer.valueOf(query.getInt(columnIndex)));
                }
                query.close();
            } catch (Throwable th) {
                query.close();
                MethodCollector.o(1787);
                throw th;
            }
        }
        MethodCollector.o(1787);
        return hashSet;
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    private static void a(Context context, String str) {
        a(context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public static void a(Activity activity, b bVar) {
        if (!com.facebook.internal.a.b.a.a(a.class)) {
            try {
                if (!m.a(activity, "com.facebook.orca")) {
                    a(activity);
                } else if (b(activity).contains(20150314)) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setFlags(1);
                        intent.setPackage("com.facebook.orca");
                        intent.putExtra("android.intent.extra.STREAM", bVar.f48939d);
                        intent.setType(bVar.f48940e);
                        ae.a();
                        String str = com.facebook.m.f48915a;
                        if (str != null) {
                            intent.putExtra("com.facebook.orca.extra.PROTOCOL_VERSION", 20150314);
                            intent.putExtra("com.facebook.orca.extra.APPLICATION_ID", str);
                            intent.putExtra("com.facebook.orca.extra.METADATA", bVar.f48941f);
                            intent.putExtra("com.facebook.orca.extra.EXTERNAL_URI", bVar.f48942g);
                        }
                        activity.startActivityForResult(intent, 12306);
                    } catch (ActivityNotFoundException unused) {
                        Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage("com.facebook.orca");
                        com.ss.android.ugc.tiktok.security.a.a.a(launchIntentForPackage, activity);
                        activity.startActivity(launchIntentForPackage);
                    }
                } else {
                    a(activity);
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, a.class);
            }
        }
    }
}
