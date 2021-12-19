package com.ss.android.ugc.aweme.component.music;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import b.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.scene.i;
import com.bytedance.scene.n;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.choosemusic.activity.f;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.choosemusic.bullet.jsb.ShootMusicMethod;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.model.a.c;
import com.ss.android.ugc.aweme.choosemusic.model.a.f;
import com.ss.android.ugc.aweme.choosemusic.model.s;
import com.ss.android.ugc.aweme.choosemusic.utils.AVMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.music.c.a;
import com.ss.android.ugc.aweme.music.e.c;
import com.ss.android.ugc.aweme.music.f;
import com.ss.android.ugc.aweme.music.k.d;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCoverInfo;
import com.ss.android.ugc.aweme.music.model.ThirdMusicCoverItem;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.music.service.b;
import com.ss.android.ugc.aweme.music.ui.AIMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.b.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.settings.v;
import com.ss.android.ugc.aweme.settings.x;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import com.ss.android.ugc.musicprovider.e;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

public class MusicService implements IMusicService {

    /* renamed from: a  reason: collision with root package name */
    public f f78099a;

    /* renamed from: b  reason: collision with root package name */
    private int f78100b = 2;

    /* renamed from: c  reason: collision with root package name */
    private a f78101c;

    static {
        Covode.recordClassIndex(48421);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void b() {
        this.f78100b = 3;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final int c() {
        return this.f78100b;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final a h() {
        return this.f78101c;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final Class<?> l() {
        return ChooseMusicActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void a(Context context, String str, boolean z, final ProgressDialog progressDialog, final com.ss.android.ugc.aweme.music.service.a aVar) {
        MusicModel convertToMusicModel;
        if (str == null) {
            try {
                aVar.a(new Exception());
            } catch (Exception e2) {
                e2.printStackTrace();
                aVar.a(e2);
            }
        } else {
            final Music music = MusicApi.a(str, 0).music;
            if (music == null || (convertToMusicModel = music.convertToMusicModel()) == null) {
                aVar.a(new Exception());
                return;
            }
            f fVar = new f(context, z);
            this.f78099a = fVar;
            fVar.a(convertToMusicModel, new b() {
                /* class com.ss.android.ugc.aweme.component.music.MusicService.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(48422);
                }

                @Override // com.ss.android.ugc.aweme.music.service.b
                public final void a() {
                }

                @Override // com.ss.android.ugc.aweme.music.service.b
                public final void a(int i2) {
                }

                @Override // com.ss.android.ugc.aweme.music.service.b
                public final void b() {
                    ProgressDialog progressDialog = progressDialog;
                    if (progressDialog != null) {
                        progressDialog.show();
                    }
                }

                @Override // com.ss.android.ugc.aweme.music.service.b
                public final void a(com.ss.android.ugc.musicprovider.a aVar) {
                    ProgressDialog progressDialog = progressDialog;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    com.ss.android.ugc.aweme.music.service.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(aVar);
                    }
                    MusicService.this.f78099a = null;
                }

                @Override // com.ss.android.ugc.aweme.music.service.b
                public final void a(String str, MusicWaveBean musicWaveBean) {
                    MusicModel musicModel;
                    ProgressDialog progressDialog = progressDialog;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    if (aVar != null) {
                        try {
                            Music music = music;
                            if (music != null) {
                                musicModel = music.convertToMusicModel();
                            } else {
                                musicModel = null;
                            }
                            aVar.a(str, musicModel);
                        } catch (Exception e2) {
                            aVar.a(e2);
                        }
                    }
                    MusicService.this.f78099a = null;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean a(MusicModel musicModel, Context context) {
        return d.a(musicModel, context, true);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void a(Context context, MusicModel musicModel, int i2, b bVar) {
        if (musicModel != null) {
            f fVar = new f(context, true, false);
            fVar.f111468a = i2;
            fVar.a(musicModel, bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void a(Context context, String str, UrlModel urlModel, b bVar) {
        f fVar = new f(context, false, false);
        l.d(str, "");
        l.d(urlModel, "");
        String b2 = e.a().b(str);
        CountDownLatch countDownLatch = new CountDownLatch(0);
        l.b(b2, "");
        c cVar = new c(urlModel, b2, str, countDownLatch);
        cVar.a(fVar.f111469b);
        cVar.f111400b = bVar;
        cVar.c();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void a(a aVar) {
        this.f78101c = aVar;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final String a(MusicModel musicModel) {
        if (v.a()) {
            return e.a().b(musicModel.getMusicId());
        }
        return musicModel.isPlayUrlValid() ? e.a().b(musicModel.getUrl().getUrlList().get(0)) : "";
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void a(Activity activity, ViewGroup viewGroup, Bundle bundle, m<Integer, Intent, z> mVar, h.f.a.a<z> aVar) {
        MethodCollector.i(4943);
        String string = activity.getString(R.string.adm);
        if (CommerceMediaServiceImpl.f().b()) {
            string = activity.getString(R.string.db0);
        }
        bundle.putString("title", string);
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
        l.d(eVar, "");
        l.d(viewGroup, "");
        l.d(bundle, "");
        l.d(mVar, "");
        l.d(aVar, "");
        if (viewGroup.findViewById(com.ss.android.ugc.aweme.choosemusic.activity.f.a()) == null) {
            com.ss.android.ugc.aweme.choosemusic.activity.e eVar2 = new com.ss.android.ugc.aweme.choosemusic.activity.e();
            eVar2.r = bundle;
            FrameLayout frameLayout = new FrameLayout(eVar);
            frameLayout.setId(com.ss.android.ugc.aweme.choosemusic.activity.f.a());
            viewGroup.addView(frameLayout, -1, -1);
            i.a a2 = i.a(eVar, com.ss.android.ugc.aweme.choosemusic.activity.e.class);
            a2.f42897e = false;
            i.a a3 = a2.a("attachChooseMusicScene");
            a3.f42898f = new f.g(eVar2);
            a3.f42894b = false;
            a3.f42895c = false;
            a3.f42899g = true;
            a3.f42896d = frameLayout.getId();
            n a4 = a3.a();
            l.b(a4, "");
            ac a5 = ae.a(eVar, (ad.b) null).a(ChooseMusicWithSceneViewModel.class);
            l.b(a5, "");
            ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = (ChooseMusicWithSceneViewModel) a5;
            t<com.ss.android.ugc.aweme.choosemusic.model.a> d2 = chooseMusicWithSceneViewModel.d();
            t<com.ss.android.ugc.aweme.choosemusic.model.a> c2 = chooseMusicWithSceneViewModel.c();
            t<s> b2 = chooseMusicWithSceneViewModel.b();
            f.C1592f fVar = new f.C1592f(d2, eVar, a4, viewGroup, frameLayout, c2, mVar);
            f.e eVar3 = new f.e(b2, eVar, mVar);
            com.ss.android.ugc.aweme.choosemusic.model.t tVar = new com.ss.android.ugc.aweme.choosemusic.model.t(fVar, eVar3);
            l.d(tVar, "");
            chooseMusicWithSceneViewModel.a().setValue(tVar);
            c2.observe(eVar, new f.b(fVar));
            d2.observe(eVar, new f.c(aVar));
            b2.observe(eVar, new f.d(eVar3));
        }
        MethodCollector.o(4943);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final List<k> a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ShootMusicMethod(bVar));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void a() {
        com.bytedance.ies.ugc.aweme.ttsetting.a.a(new d.a());
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean a(MusicModel musicModel, Context context, boolean z) {
        return com.ss.android.ugc.aweme.music.k.d.a(musicModel, context, z);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void a(Integer num) {
        c.a.a().a(new com.ss.android.ugc.aweme.choosemusic.model.a.e(num.intValue(), null, false, 0), f.b.f70603a).g();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void d() {
        com.ss.android.ugc.aweme.music.f fVar = this.f78099a;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final int g() {
        return x.a();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final String e() {
        ThirdMusicCoverItem a2 = com.ss.android.ugc.aweme.music.ui.b.d.a();
        if (a2 != null) {
            return a2.musicCoverDisplayText;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final boolean f() {
        if (com.bytedance.ies.abmock.b.a().a(true, "music_player_loader_mode", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void j() {
        com.ss.android.ugc.aweme.base.h.d.c().b("has_receive_new_coupon", true);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void k() {
        c.a.a().f70592b.c();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void i() {
        com.ss.android.ugc.aweme.base.h.e c2 = com.ss.android.ugc.aweme.base.h.d.c();
        c2.b("cold_start_times", c2.a("cold_start_times", 0) + 1);
    }

    public static IMusicService m() {
        MethodCollector.i(4946);
        Object a2 = com.ss.android.ugc.b.a(IMusicService.class, false);
        if (a2 != null) {
            IMusicService iMusicService = (IMusicService) a2;
            MethodCollector.o(4946);
            return iMusicService;
        }
        if (com.ss.android.ugc.b.aT == null) {
            synchronized (IMusicService.class) {
                try {
                    if (com.ss.android.ugc.b.aT == null) {
                        com.ss.android.ugc.b.aT = new MusicService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4946);
                    throw th;
                }
            }
        }
        MusicService musicService = (MusicService) com.ss.android.ugc.b.aT;
        MethodCollector.o(4946);
        return musicService;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final com.ss.android.ugc.aweme.music.a b(com.ss.android.ugc.aweme.music.ui.m mVar) {
        return new AVMusicDownloadPlayHelper(mVar);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final String b(MusicModel musicModel) {
        if (musicModel.isPlayUrlValid()) {
            return e.a().a(musicModel.getUrl().getUrlList().get(0));
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final com.ss.android.ugc.aweme.music.a a(com.ss.android.ugc.aweme.music.ui.m mVar) {
        return new AIMusicDownloadPlayHelper(mVar);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final List<String> b(String str) {
        ThirdMusicCoverItem a2 = com.ss.android.ugc.aweme.music.ui.b.d.a();
        if (a2 == null) {
            return null;
        }
        List<MusicCoverInfo> list = a2.musicCoverInfoList;
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return null;
        }
        for (MusicCoverInfo musicCoverInfo : list) {
            if (musicCoverInfo != null && TextUtils.equals(musicCoverInfo.partnerName, str)) {
                return musicCoverInfo.coverUrlList;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final Music a(String str) {
        try {
            Music music = MusicApi.a(str, 0).music;
            if (music != null) {
                return music;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final com.ss.android.ugc.aweme.music.service.c a(Context context) {
        if (f()) {
            return new com.ss.android.ugc.musicprovider.c.a((byte) 0);
        }
        return new com.ss.android.ugc.musicprovider.c.c(context, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final String a(int i2) {
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

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final void a(TextView textView, Music music) {
        com.ss.android.ugc.aweme.music.ui.b.d.a(textView, music);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final b.i<CollectedMusicList> a(int i2, int i3) {
        return ChooseMusicApi.a(i2, 12, i3);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final b.i<BaseResponse> a(String str, int i2) {
        return ChooseMusicApi.f70375a.collectMusic(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final MusicList a(int i2, String str) {
        if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
            return MusicApi.f111094a.fetchCommerceStickPointMusicList(0, 20, i2, str).get();
        }
        return MusicApi.f111094a.fetchStickPointMusicList(0, 20, i2, str).get();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final b.i<List<MusicModel>> a(int i2, int i3, boolean z, int i4) {
        return ChooseMusicApi.a(i2, i3, z, i4, false).a(new g<com.ss.android.ugc.aweme.music.model.MusicList, List<MusicModel>>() {
            /* class com.ss.android.ugc.aweme.component.music.MusicService.AnonymousClass3 */

            static {
                Covode.recordClassIndex(48424);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // b.g
            public final /* synthetic */ List<MusicModel> then(b.i<com.ss.android.ugc.aweme.music.model.MusicList> iVar) {
                if (iVar.b() || iVar.c() || iVar.d() == null) {
                    return null;
                }
                return com.ss.android.ugc.aweme.choosemusic.utils.c.a(iVar.d().items);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final b.i<SuggestMusicList> b(int i2, int i3, boolean z, int i4) {
        return ChooseMusicApi.a(i2, i3, z, i4, true).a(new g<com.ss.android.ugc.aweme.music.model.MusicList, SuggestMusicList>() {
            /* class com.ss.android.ugc.aweme.component.music.MusicService.AnonymousClass4 */

            static {
                Covode.recordClassIndex(48425);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // b.g
            public final /* synthetic */ SuggestMusicList then(b.i<com.ss.android.ugc.aweme.music.model.MusicList> iVar) {
                if (iVar.b() || iVar.c() || iVar.d() == null) {
                    return null;
                }
                SuggestMusicList suggestMusicList = new SuggestMusicList();
                suggestMusicList.musicList = com.ss.android.ugc.aweme.choosemusic.utils.c.a(iVar.d().items);
                suggestMusicList.cursor = iVar.d().getCursor();
                suggestMusicList.hasMore = iVar.d().isHasMore();
                return suggestMusicList;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicService
    public final b.i<SuggestMusicList> a(String str, String str2, String str3, long j2, int i2, int i3) {
        return ChooseMusicApi.f70375a.getRecommenMusicListFromAI(i3, i2, "shoot_page", str, new StringBuilder().append(AVExternalServiceImpl.a().configService().avsettingsConfig().recommentMusicByAIPolicy()).toString(), str2, str3, j2).a(new g<com.ss.android.ugc.aweme.music.model.MusicList, SuggestMusicList>() {
            /* class com.ss.android.ugc.aweme.component.music.MusicService.AnonymousClass2 */

            static {
                Covode.recordClassIndex(48423);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // b.g
            public final /* synthetic */ SuggestMusicList then(b.i<com.ss.android.ugc.aweme.music.model.MusicList> iVar) {
                if (iVar.c() || iVar.b() || iVar.d() == null) {
                    return null;
                }
                SuggestMusicList suggestMusicList = new SuggestMusicList();
                suggestMusicList.musicList = com.ss.android.ugc.aweme.choosemusic.utils.c.a(iVar.d().items);
                suggestMusicList.musicType = Integer.valueOf(iVar.d().mMusicType);
                suggestMusicList.logPb = iVar.d().logPb;
                suggestMusicList.hasMore = iVar.d().isHasMore();
                suggestMusicList.cursor = iVar.d().getCursor();
                return suggestMusicList;
            }
        });
    }
}
