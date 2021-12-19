package com.ss.android.ugc.aweme.music.k;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.music.e;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static String f111546a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f111547b = false;

    /* renamed from: c  reason: collision with root package name */
    private static final String f111548c = d.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    private static final Uri f111549d = Uri.parse("content://media/external/audio/albumart");

    static {
        Covode.recordClassIndex(71646);
    }

    public static boolean a() {
        String b2 = b("ro.build.display.id");
        if (TextUtils.isEmpty(b2) || !b2.toLowerCase().contains("flyme")) {
            return false;
        }
        return true;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new URI(str).getHost();
        } catch (Exception e2) {
            e2.printStackTrace();
            a.a("music url illegal");
            return null;
        }
    }

    private static String b(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(int i2) {
        if (i2 <= 0) {
            return "";
        }
        int i3 = i2 / 1000;
        int i4 = i3 % 60;
        int i5 = i3 / 60;
        int i6 = i5 / 60;
        int i7 = i5 % 60;
        if (i6 == 0) {
            return com.a.a(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i7), Integer.valueOf(i4)});
        }
        return com.a.a(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i4)});
    }

    public static void a(Activity activity, int i2) {
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//assmusic/category");
        if (i2 == 0) {
            buildRoute.withParam("music_type", 6);
        } else if (i2 == 2) {
            buildRoute.withParam("music_type", 5);
        }
        buildRoute.withParam("sound_page_scene", 0);
        activity.startActivityForResult(buildRoute.buildIntent(), 10086);
    }

    public static void a(Context context, List<MusicModel> list, IAVInfoService.IGetInfoCallback<List<MusicModel>> iGetInfoCallback) {
        MethodCollector.i(996);
        if (context == null) {
            iGetInfoCallback.finish(new ArrayList());
        }
        list.clear();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        ArrayList arrayList = new ArrayList();
        Cursor query = context.getContentResolver().query(uri, new String[]{"_id", "is_music", "title", "artist", "album", "album_id", "_display_name", "_size", "duration"}, null, null, "title_key");
        if (query == null) {
            iGetInfoCallback.finish(list);
        }
        while (query.moveToNext()) {
            int i2 = query.getInt(query.getColumnIndex("is_music"));
            if (a() || i2 != 0) {
                Uri withAppendedId = ContentUris.withAppendedId(uri, query.getLong(query.getColumnIndex("_id")));
                String string = query.getString(query.getColumnIndex("title"));
                String string2 = query.getString(query.getColumnIndex("artist"));
                String string3 = query.getString(query.getColumnIndex("album"));
                query.getLong(query.getColumnIndex("album_id"));
                long j2 = query.getLong(query.getColumnIndex("duration"));
                String string4 = query.getString(query.getColumnIndex("_display_name"));
                long j3 = query.getLong(query.getColumnIndex("_size"));
                MusicModel musicModel = new MusicModel();
                musicModel.setLocalMusicId(b.a(string4, string2, string3, j3));
                musicModel.setName(string);
                musicModel.setMusicStatus(1);
                musicModel.setAlbum(string3);
                if (TextUtils.equals("<unknown>", string2)) {
                    string2 = "unknown";
                }
                musicModel.setSinger(string2);
                musicModel.setLocalPath(withAppendedId.toString());
                musicModel.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                musicModel.setMusicType(MusicModel.MusicType.LOCAL);
                musicModel.setLocalMusicDuration(j2);
                musicModel.setDataType(1);
                list.add(musicModel);
                arrayList.add(Long.valueOf(j2));
            }
        }
        query.close();
        AVExternalServiceImpl.a().abilityService().infoService().audioLegal(context, list, new e(arrayList), new f(iGetInfoCallback, list));
        MethodCollector.o(996);
    }

    public static boolean a(MusicModel musicModel, Context context, boolean z) {
        if (musicModel == null) {
            return false;
        }
        if (f111547b) {
            musicModel.getMusicStatus();
            musicModel.getLocalPath();
        }
        if (!TextUtils.isEmpty(musicModel.getLocalPath())) {
            return true;
        }
        if (musicModel.getUrl() != null && !TextUtils.isEmpty(musicModel.getUrl().getUri()) && !b.a((Collection) musicModel.getUrl().getUrlList()) && musicModel.getMusicStatus() != 0) {
            return true;
        }
        String offlineDesc = musicModel.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = e.a(musicModel, context);
        }
        if (z) {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(offlineDesc).a();
        }
        return false;
    }
}
