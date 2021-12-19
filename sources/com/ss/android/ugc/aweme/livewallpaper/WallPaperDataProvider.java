package com.ss.android.ugc.aweme.livewallpaper;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.livewallpaper.d.c;
import com.ss.android.ugc.aweme.livewallpaper.f.d;
import com.ss.android.ugc.aweme.livewallpaper.f.f;
import com.ss.android.ugc.aweme.livewallpaper.f.h;
import com.ss.android.ugc.aweme.utils.in;
import java.io.File;
import org.json.JSONObject;

public class WallPaperDataProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final String f108717a = "com.zhiliaoapp.musically.wallpapercaller";

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f108718b = Uri.parse("content://" + "com.zhiliaoapp.musically.wallpapercaller" + "/video_path");

    /* renamed from: c  reason: collision with root package name */
    public static final Uri f108719c = Uri.parse("content://" + "com.zhiliaoapp.musically.wallpapercaller" + "/video_width");

    /* renamed from: d  reason: collision with root package name */
    public static final Uri f108720d = Uri.parse("content://" + "com.zhiliaoapp.musically.wallpapercaller" + "/video_height");

    /* renamed from: e  reason: collision with root package name */
    public static final Uri f108721e = Uri.parse("content://" + "com.zhiliaoapp.musically.wallpapercaller" + "/ab_info");

    /* renamed from: f  reason: collision with root package name */
    public static final Uri f108722f = Uri.parse("content://" + "com.zhiliaoapp.musically.wallpapercaller" + "/wallpaper_json");

    /* renamed from: g  reason: collision with root package name */
    public static final Uri f108723g = Uri.parse("content://" + "com.zhiliaoapp.musically.wallpapercaller" + "/fall_back_video_path");

    /* renamed from: h  reason: collision with root package name */
    public static final Uri f108724h = Uri.parse("content://" + "com.zhiliaoapp.musically.wallpapercaller" + "/set_wp_result");

    /* renamed from: i  reason: collision with root package name */
    public static final Uri f108725i = Uri.parse("content://" + "com.zhiliaoapp.musically.wallpapercaller" + "/source");

    /* renamed from: j  reason: collision with root package name */
    public static final Uri f108726j = Uri.parse("content://" + "com.zhiliaoapp.musically.wallpapercaller" + "/volume");

    /* renamed from: k  reason: collision with root package name */
    public static final Uri f108727k = Uri.parse("content://" + "com.zhiliaoapp.musically.wallpapercaller" + "/need_tighten");

    /* renamed from: l  reason: collision with root package name */
    private UriMatcher f108728l;

    /* renamed from: m  reason: collision with root package name */
    private Handler f108729m;

    public boolean onCreate() {
        this.f108728l = new UriMatcher(-1);
        String str = f108717a;
        if (!TextUtils.isEmpty(str)) {
            this.f108728l.addURI(str, "ab_info", 145);
            this.f108728l.addURI(str, "wallpaper_json", 144);
            this.f108728l.addURI(str, "video_path", 16);
            this.f108728l.addURI(str, "fall_back_video_path", 32);
            this.f108728l.addURI(str, "set_wp_result", 48);
            this.f108728l.addURI(str, "video_width", 64);
            this.f108728l.addURI(str, "video_height", 80);
            this.f108728l.addURI(str, "source", 96);
            this.f108728l.addURI(str, "volume", 112);
            this.f108728l.addURI(str, "need_tighten", 128);
        }
        this.f108729m = new Handler(Looper.getMainLooper());
        return false;
    }

    static {
        Covode.recordClassIndex(69657);
    }

    private static String a(ContentValues contentValues) {
        return "{" + contentValues.toString() + "}";
    }

    private static String a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i2 = 0; i2 < strArr.length; i2++) {
            sb.append(strArr[i2]);
            if (i2 < strArr.length - 2) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static String a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            if (objArr[i2] instanceof Uri) {
                sb.append(((Uri) objArr[i2]).toString());
            } else if (objArr[i2] instanceof String[]) {
                sb.append(a((String[]) objArr[i2]));
            } else if (objArr[i2] instanceof String) {
                sb.append(objArr[i2]);
            } else if (objArr[i2] instanceof ContentValues) {
                sb.append(a((ContentValues) objArr[i2]));
            }
            if (i2 < objArr.length - 2) {
                sb.append("---");
            }
        }
        return sb.toString();
    }

    public String getType(Uri uri) {
        a(uri);
        int match = this.f108728l.match(uri);
        if (match == 16) {
            return d.f108899e.f108902c.getVideoPath();
        }
        if (match == 32) {
            return d.f108899e.f108902c.getVideoPath();
        }
        if (match == 64) {
            return String.valueOf(d.f108899e.f108902c.getWidth());
        }
        if (match == 80) {
            return String.valueOf(d.f108899e.f108902c.getHeight());
        }
        if (match == 96) {
            return d.f108899e.f108902c.getSource();
        }
        if (match == 112) {
            return String.valueOf(d.f108899e.f108902c.getVolume());
        }
        if (match == 128) {
            return String.valueOf(in.e());
        }
        if (match == 144) {
            return c.a(d.f108899e.f108902c);
        }
        if (match != 145) {
            return "";
        }
        return c.b();
    }

    public Uri insert(Uri uri, final ContentValues contentValues) {
        a(uri, contentValues);
        if (!(contentValues == null || contentValues.size() == 0 || this.f108728l.match(uri) != 48)) {
            this.f108729m.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.livewallpaper.WallPaperDataProvider.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(69658);
                }

                public final void run() {
                    boolean z;
                    d.a aVar;
                    if (contentValues.getAsBoolean("result") != null) {
                        z = contentValues.getAsBoolean("result").booleanValue();
                    } else {
                        z = false;
                    }
                    String asString = contentValues.getAsString("source");
                    String asString2 = contentValues.getAsString("message");
                    d dVar = d.f108899e;
                    if (dVar.f108903d.size() != 0 && (aVar = dVar.f108903d.get(asString)) != null) {
                        aVar.a(z, asString2);
                    }
                }
            });
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        String str2;
        int match = this.f108728l.match(uri);
        if (match == 16) {
            str2 = d.f108899e.f108902c.getVideoPath();
        } else if (match != 32) {
            str2 = "";
        } else {
            str2 = f.b();
        }
        try {
            return ParcelFileDescriptor.open(new File(str2), 268435456);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        a(uri, str, strArr);
        return 0;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        str.hashCode();
        if (str.equals("update_preferences")) {
            try {
                JSONObject jSONObject = new JSONObject(bundle.getString("wallpaper_preferences"));
                boolean optBoolean = jSONObject.optBoolean("enablePauseVideo", false);
                int optInt = jSONObject.optInt("soundProgress", 0);
                h.a(optBoolean);
                h.a(optInt);
            } catch (Exception unused) {
            }
        }
        return bundle;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        a(uri, contentValues, str, strArr);
        return 0;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a(uri, strArr, str, strArr2, str2);
        return null;
    }
}
