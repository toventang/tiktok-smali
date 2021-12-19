package com.ss.android.ugc.aweme.specact.popup.calendar;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xbridge.system.b.a.b.b;
import com.bytedance.keva.Keva;
import com.kakao.usermgmt.StringSet;
import h.a.i;
import h.f.b.l;
import java.util.TimeZone;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final Keva f134618a = Keva.getRepo("com.ss.android.ugc.aweme.specact.calendar.CalendarWriter");

    /* renamed from: b  reason: collision with root package name */
    public static final c f134619b = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(87959);
    }

    private static Uri a() {
        Uri build = CalendarContract.Events.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", "com.tiktok").appendQueryParameter("account_type", "LOCAL").build();
        l.b(build, "");
        return build;
    }

    private static void a(String str) {
        f134618a.storeBoolean(str, true);
    }

    private static int b(Context context) {
        MethodCollector.i(10211);
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.android.calendar/calendars"), null, null, null, null);
        int i2 = -1;
        if (query != null) {
            if (query.getCount() > 0) {
                query.moveToFirst();
                while (true) {
                    if (query.getInt(query.getColumnIndex("calendar_access_level")) <= 200) {
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        i2 = query.getInt(query.getColumnIndex("_id"));
                        break;
                    }
                }
            }
            query.close();
        }
        MethodCollector.o(10211);
        return i2;
    }

    private static int a(Context context) {
        int b2 = b(context);
        if (b2 >= 0) {
            return b2;
        }
        TimeZone timeZone = TimeZone.getDefault();
        l.b(timeZone, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put(StringSet.name, "tiktok");
        contentValues.put("account_name", "tiktok@tiktok.com");
        contentValues.put("account_type", "com.tiktok");
        contentValues.put("calendar_displayName", "TikTok");
        contentValues.put("visible", (Integer) 1);
        contentValues.put("calendar_color", (Integer) -16776961);
        contentValues.put("calendar_access_level", (Integer) 700);
        contentValues.put("sync_events", (Integer) 1);
        contentValues.put("calendar_timezone", timeZone.getID());
        contentValues.put("ownerAccount", "tiktok@tiktok.com");
        contentValues.put("canOrganizerRespond", (Integer) 0);
        Uri parse = Uri.parse("content://com.android.calendar/calendars");
        l.b(parse, "");
        Uri build = parse.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", "tiktok@tiktok.com").appendQueryParameter("account_type", "com.tiktok").build();
        l.b(build, "");
        Uri insert = context.getContentResolver().insert(build, contentValues);
        if (insert == null || ContentUris.parseId(insert) < 0) {
            return -1;
        }
        return b(context);
    }

    private static boolean a(b bVar) {
        if (bVar.f134607a.length() == 0) {
            return false;
        }
        if ((bVar.f134608b.length() <= 0 || ((!(!l.a((Object) bVar.f134608b, (Object) "daily")) || !(!l.a((Object) bVar.f134608b, (Object) "weekly")) || !(!l.a((Object) bVar.f134608b, (Object) "monthly")) || !(!l.a((Object) bVar.f134608b, (Object) "yearly"))) && bVar.f134609c >= 0 && bVar.f134610d >= 0)) && bVar.f134611e >= 0 && bVar.f134612f >= 0 && bVar.f134613g >= 0 && bVar.f134615i.length() != 0) {
            return true;
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        MethodCollector.i(10217);
        l.d(context, "");
        l.d(str, "");
        boolean z = true;
        Cursor query = context.getContentResolver().query(CalendarContract.Events.CONTENT_URI, new String[]{b.f36462b}, i.a(new String[]{"sync_data1=?"}, " and ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62), new String[]{str}, null);
        if (query != null) {
            try {
                Cursor cursor = query;
                l.b(cursor, "");
                if (cursor.getCount() <= 0) {
                    z = false;
                }
                h.e.c.a(query, null);
                MethodCollector.o(10217);
                return z;
            } catch (Throwable th) {
                h.e.c.a(query, th);
                MethodCollector.o(10217);
                throw th;
            }
        } else {
            MethodCollector.o(10217);
            return false;
        }
    }

    public static int a(Context context, b bVar) {
        l.d(context, "");
        l.d(bVar, "");
        if (!a(bVar)) {
            return -1;
        }
        if (a(context, bVar.f134607a)) {
            return 5;
        }
        int a2 = a(context);
        if (a2 < 0) {
            return 1000;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("calendar_id", Integer.valueOf(a2));
        contentValues.put("title", bVar.f134615i);
        if (!TextUtils.isEmpty(bVar.f134616j)) {
            contentValues.put("description", bVar.f134616j);
        }
        contentValues.put("dtstart", Long.valueOf(bVar.f134611e));
        contentValues.put("dtend", Long.valueOf(bVar.f134612f));
        TimeZone timeZone = TimeZone.getDefault();
        l.b(timeZone, "");
        contentValues.put("eventTimezone", timeZone.getID());
        contentValues.put("allDay", Boolean.valueOf(bVar.f134614h));
        contentValues.put(b.f36462b, bVar.f134607a);
        if (bVar.f134613g >= 0) {
            contentValues.put("hasAlarm", (Integer) 1);
        }
        if (!TextUtils.isEmpty(bVar.f134608b)) {
            contentValues.put("rrule", "FREQ=" + bVar.f134608b + ";INTERVAL=" + bVar.f134609c + ";COUNT=" + bVar.f134610d);
        }
        Uri insert = context.getContentResolver().insert(a(), contentValues);
        if (bVar.f134613g >= 0) {
            ContentValues contentValues2 = new ContentValues();
            if (insert != null) {
                contentValues2.put("event_id", Long.valueOf(ContentUris.parseId(insert)));
            }
            contentValues2.put("minutes", Long.valueOf(bVar.f134613g / 60000));
            contentValues2.put("method", (Integer) 1);
            context.getContentResolver().insert(Uri.parse("content://com.android.calendar/reminders"), contentValues2);
        }
        a(bVar.f134607a);
        return 1;
    }
}
