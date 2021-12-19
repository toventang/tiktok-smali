package com.ss.android.ugc.aweme.music.service;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.text.TextUtils;
import androidx.lifecycle.m;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.metrics.ah;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicRecordService;
import com.ss.android.ugc.aweme.music.ui.e;
import com.ss.android.ugc.aweme.music.ui.w;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.ss.android.ugc.aweme.utils.bt;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.UUID;

public final class e implements IMusicRecordService {

    /* renamed from: a  reason: collision with root package name */
    public boolean f111730a = true;

    /* renamed from: b  reason: collision with root package name */
    public long f111731b;

    /* renamed from: c  reason: collision with root package name */
    public ProgressDialog f111732c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.music.ui.e f111733d;

    /* renamed from: e  reason: collision with root package name */
    public w f111734e;

    /* renamed from: f  reason: collision with root package name */
    public SafeHandler f111735f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f111736g;

    static {
        Covode.recordClassIndex(71858);
    }

    public final void a(boolean z) {
        if (z) {
            this.f111736g = false;
            bt.b(this.f111733d);
            this.f111733d = null;
        }
        ProgressDialog progressDialog = this.f111732c;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    public static ArrayList<String> a(String str) {
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        String[] split = str.split(",");
        for (String str2 : split) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(boolean z, Activity activity, MusicModel musicModel, String str, int i2, i iVar) {
        String str2;
        if (this.f111730a) {
            if (iVar.a()) {
                Music music = (Music) iVar.d();
                if (music == null || TextUtils.isEmpty(music.getOwnerBanShowInfo())) {
                    w wVar = this.f111734e;
                    if (!TextUtils.isEmpty(str)) {
                        ArrayList<String> a2 = a(str);
                        if (!a2.isEmpty()) {
                            str2 = a2.get(0);
                            wVar.a(musicModel, str2, i2, z);
                        }
                    }
                    str2 = null;
                    wVar.a(musicModel, str2, i2, z);
                } else {
                    a(z);
                    new b(activity).a(music.getOwnerBanShowInfo()).b();
                }
            } else {
                a(z);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicRecordService
    public final void startRecord(m mVar, final Activity activity, MusicModel musicModel, final String str, final String str2, final IMusicRecordService.a aVar, final int i2, final boolean z) {
        if (com.ss.android.ugc.aweme.account.b.g().getCurUser().isLive()) {
            new a(activity).a(R.string.cp5).a();
        } else if (AVExternalServiceImpl.a().publishService().checkIsAlreadyPublished(activity)) {
            if (musicModel == null || MusicService.m().a(musicModel, activity, true)) {
                this.f111734e = new w(activity, new w.a() {
                    /* class com.ss.android.ugc.aweme.music.service.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(71859);
                    }

                    @Override // com.ss.android.ugc.aweme.music.ui.w.a
                    public final void a(MusicModel musicModel) {
                    }

                    @Override // com.ss.android.ugc.aweme.music.ui.w.a
                    public final boolean bT_() {
                        return e.this.f111730a;
                    }

                    @Override // com.ss.android.ugc.aweme.music.ui.w.a
                    public final void bS_() {
                        c.a(activity, "single_song", "click_music_shoot");
                    }

                    private void b(boolean z) {
                        e.this.a(z);
                    }

                    @Override // com.ss.android.ugc.aweme.music.ui.w.a
                    public final void e_(boolean z) {
                        if (z) {
                            b(z);
                        } else if (e.this.f111732c != null) {
                            e.this.f111732c.dismiss();
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.music.ui.w.a
                    public final void a(final Effect effect, final MusicModel musicModel) {
                        ah.f109483a = "single_song";
                        b(true);
                        AVExternalServiceImpl.a().asyncService("MusicRecordService", new SimpleServiceLoadCallback() {
                            /* class com.ss.android.ugc.aweme.music.service.e.AnonymousClass1.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(71862);
                            }

                            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                                String str;
                                RecordConfig.Builder videoLength = new RecordConfig.Builder().creationId(UUID.randomUUID().toString()).startRecordTime(e.this.f111731b).decompressTime(j2).reshootConfig(new ReshootConfig(true, true)).shootWay("single_song").musicWithSticker(effect).translationType(3).musicOrigin("single_song").videoLength(Integer.valueOf(i2));
                                if (!TextUtils.isEmpty(str)) {
                                    videoLength.stickers(e.a(str));
                                    if (!TextUtils.isEmpty(str2)) {
                                        videoLength.giphyGifIds(str2);
                                    }
                                    ArrayList<String> a2 = e.a(str);
                                    if (!a2.isEmpty()) {
                                        videoLength.musicSticker(a2.get(0));
                                    }
                                }
                                String musicSticker = videoLength.build().getMusicSticker();
                                Effect effect = effect;
                                MusicModel musicModel = musicModel;
                                if (musicModel != null) {
                                    str = musicModel.getMusicId();
                                } else {
                                    str = null;
                                }
                                videoLength.recordPresetResource(new RecordPresetResource(musicSticker, effect, str, musicModel));
                                asyncAVService.uiService().recordService().startRecord(activity, videoLength.build(), musicModel, true);
                            }
                        });
                    }

                    @Override // com.ss.android.ugc.aweme.music.ui.w.a
                    public final void a(MusicModel musicModel, boolean z) {
                        if (z && (activity instanceof m)) {
                            e.this.f111736g = true;
                            e.this.f111735f = new SafeHandler((m) activity);
                            e.this.f111735f.postDelayed(new Runnable() {
                                /* class com.ss.android.ugc.aweme.music.service.e.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(71860);
                                }

                                public final void run() {
                                    if (e.this.f111736g && activity != null && !activity.isFinishing()) {
                                        e.this.f111733d = e.b.a(activity);
                                        e.this.f111733d.setMessage(activity.getResources().getString(R.string.g4k));
                                    }
                                }
                            }, 300);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.music.ui.w.a
                    public final void a_(int i2, boolean z) {
                        if (!z && e.this.f111732c != null) {
                            e.this.f111732c.setProgress(i2);
                            if (i2 >= 98 && e.this.f111732c != null) {
                                e.this.f111732c.setCancelable(true);
                            }
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.music.ui.w.a
                    public final void a(final String str, final MusicModel musicModel, final int i2) {
                        b(z);
                        if (e.this.f111732c != null) {
                            e.this.f111732c.dismiss();
                        }
                        ah.f109483a = "single_song";
                        boolean isRecording = AVExternalServiceImpl.a().configService().shortVideoConfig().isRecording();
                        final long currentTimeMillis = System.currentTimeMillis() - e.this.f111731b;
                        if (!isRecording || activity == null) {
                            AVExternalServiceImpl.a().asyncService("MusicRecordService", new SimpleServiceLoadCallback() {
                                /* class com.ss.android.ugc.aweme.music.service.e.AnonymousClass1.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(71861);
                                }

                                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                                    RecordConfig.Builder videoLength = new RecordConfig.Builder().creationId(UUID.randomUUID().toString()).musicPath(str).startRecordTime(e.this.f111731b).decompressTime(j2).musicDownloadDuration(currentTimeMillis).reshootConfig(new ReshootConfig(true, true)).shootWay("single_song").musicWithSticker(e.this.f111734e.f112070c).translationType(3).musicOrigin("single_song").videoLength(Integer.valueOf(i2));
                                    if (!TextUtils.isEmpty(str)) {
                                        videoLength.stickers(e.a(str));
                                        if (!TextUtils.isEmpty(str2)) {
                                            videoLength.giphyGifIds(str2);
                                        }
                                        ArrayList<String> a2 = e.a(str);
                                        if (!a2.isEmpty()) {
                                            videoLength.musicSticker(a2.get(0));
                                        }
                                    }
                                    asyncAVService.uiService().recordService().startRecord(activity, videoLength.build(), musicModel, true);
                                }
                            });
                            return;
                        }
                        AVExternalServiceImpl.a().publishService().addMusic(musicModel);
                        Intent intent = new Intent();
                        intent.putExtra("path", str);
                        intent.putExtra("music_model", musicModel);
                        intent.putExtra("music_origin", 0);
                        activity.setResult(-1, intent);
                        activity.finish();
                    }
                });
                mVar.getLifecycle().a(new MusicRecordService$2(this));
                this.f111732c = e.b.a(activity, e.a.VISIBLE_AFTER_5S, new h(this, musicModel));
                i.b(new f(musicModel), i.f4824a).a(new g(this, z, activity, musicModel, str, i2), i.f4826c, null);
            }
        }
    }
}
