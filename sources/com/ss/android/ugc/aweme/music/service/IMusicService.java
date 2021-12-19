package com.ss.android.ugc.aweme.music.service;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.a;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.m;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import h.z;
import java.util.List;

public interface IMusicService {
    static {
        Covode.recordClassIndex(71849);
    }

    i<CollectedMusicList> a(int i2, int i3);

    i<List<MusicModel>> a(int i2, int i3, boolean z, int i4);

    i<BaseResponse> a(String str, int i2);

    i<SuggestMusicList> a(String str, String str2, String str3, long j2, int i2, int i3);

    a a(m mVar);

    Music a(String str);

    c a(Context context);

    MusicList a(int i2, String str);

    String a(int i2);

    String a(MusicModel musicModel);

    List<k> a(b bVar);

    void a();

    void a(Activity activity, ViewGroup viewGroup, Bundle bundle, h.f.a.m<Integer, Intent, z> mVar, h.f.a.a<z> aVar);

    void a(Context context, MusicModel musicModel, int i2, b bVar);

    void a(Context context, String str, UrlModel urlModel, b bVar);

    void a(Context context, String str, boolean z, ProgressDialog progressDialog, a aVar);

    void a(TextView textView, Music music);

    void a(com.ss.android.ugc.aweme.music.c.a aVar);

    void a(Integer num);

    boolean a(MusicModel musicModel, Context context);

    boolean a(MusicModel musicModel, Context context, boolean z);

    i<SuggestMusicList> b(int i2, int i3, boolean z, int i4);

    a b(m mVar);

    String b(MusicModel musicModel);

    List<String> b(String str);

    void b();

    int c();

    void d();

    String e();

    boolean f();

    int g();

    com.ss.android.ugc.aweme.music.c.a h();

    void i();

    void j();

    void k();

    Class<?> l();
}
