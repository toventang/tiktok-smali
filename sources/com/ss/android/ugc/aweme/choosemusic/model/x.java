package com.ss.android.ugc.aweme.choosemusic.model;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import b.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.music.k.b;
import com.ss.android.ugc.aweme.music.k.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final u f70696a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f70697b;

    /* renamed from: c  reason: collision with root package name */
    private final List f70698c;

    /* renamed from: d  reason: collision with root package name */
    private final j f70699d;

    static {
        Covode.recordClassIndex(43585);
    }

    x(u uVar, WeakReference weakReference, List list, j jVar) {
        this.f70696a = uVar;
        this.f70697b = weakReference;
        this.f70698c = list;
        this.f70699d = jVar;
    }

    public final void run() {
        int i2;
        MethodCollector.i(3600);
        u uVar = this.f70696a;
        WeakReference weakReference = this.f70697b;
        List<? extends MusicModel> list = this.f70698c;
        j jVar = this.f70699d;
        Context context = (Context) weakReference.get();
        jVar.getClass();
        ac acVar = new ac(jVar);
        if (context == null) {
            acVar.finish(new ArrayList());
            MethodCollector.o(3600);
            return;
        }
        list.clear();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        ArrayList arrayList = new ArrayList();
        if (uVar.f70691e == null) {
            uVar.f70691e = context.getContentResolver().query(uri, new String[]{"_id", "is_music", "title", "artist", "album", "album_id", "_display_name", "_size", "duration"}, null, null, "title_key");
        }
        if (uVar.f70691e == null) {
            acVar.finish(list);
            MethodCollector.o(3600);
            return;
        }
        int i3 = uVar.f70690d * 20;
        int i4 = ((uVar.f70690d + 1) * 20) - 1;
        if (i4 > uVar.f70691e.getCount() - 1) {
            i4 = uVar.f70691e.getCount() - 1;
            uVar.f70688b = true;
        }
        if (i3 <= uVar.f70691e.getCount() - 1) {
            uVar.f70691e.moveToPosition(i3 - 1);
            while (true) {
                if (!uVar.f70691e.moveToNext()) {
                    i2 = 1;
                    break;
                }
                int i5 = uVar.f70691e.getInt(uVar.f70691e.getColumnIndex("is_music"));
                if (d.a() || i5 != 0) {
                    Uri withAppendedId = ContentUris.withAppendedId(uri, uVar.f70691e.getLong(uVar.f70691e.getColumnIndex("_id")));
                    String string = uVar.f70691e.getString(uVar.f70691e.getColumnIndex("title"));
                    String string2 = uVar.f70691e.getString(uVar.f70691e.getColumnIndex("artist"));
                    String string3 = uVar.f70691e.getString(uVar.f70691e.getColumnIndex("album"));
                    uVar.f70691e.getLong(uVar.f70691e.getColumnIndex("album_id"));
                    long j2 = uVar.f70691e.getLong(uVar.f70691e.getColumnIndex("duration"));
                    String string4 = uVar.f70691e.getString(uVar.f70691e.getColumnIndex("_display_name"));
                    long j3 = uVar.f70691e.getLong(uVar.f70691e.getColumnIndex("_size"));
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
                    i2 = 1;
                    musicModel.setDataType(1);
                    list.add(musicModel);
                    arrayList.add(Long.valueOf(j2));
                    if (uVar.f70691e.getPosition() == i4) {
                        break;
                    }
                }
            }
            uVar.f70690d += i2;
            if (uVar.f70688b) {
                uVar.f70691e.close();
                uVar.f70691e = null;
            }
            a.b("Local Sound scan result", u.a((List<MusicModel>) list));
            AVExternalServiceImpl.a().abilityService().infoService().audioLegal(context, list, new aa(arrayList), new ab(acVar, list));
            MethodCollector.o(3600);
            return;
        }
        uVar.f70691e.close();
        acVar.finish(list);
        MethodCollector.o(3600);
    }
}
