package com.ss.android.ugc.aweme.external.b;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.j;
import com.ss.android.ugc.aweme.df.s;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.external.b.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.ugc.aweme.services.SDKServiceImpl;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import com.ss.android.ugc.aweme.services.external.ui.CommentVideoConfig;
import com.ss.android.ugc.aweme.services.external.ui.DuetConfig;
import com.ss.android.ugc.aweme.services.external.ui.EffectConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.LiveParams;
import com.ss.android.ugc.aweme.services.external.ui.MiniAppConfig;
import com.ss.android.ugc.aweme.services.external.ui.QaStructConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReactConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.specialplus.e;
import com.ss.android.ugc.aweme.utils.hx;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import dmt.av.video.e.b;
import h.f.b.l;
import h.p;
import h.q;
import h.r;
import h.v;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.m;

public abstract class c implements IRecordService {

    /* renamed from: c  reason: collision with root package name */
    public static final a f90328c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final cr f90329a;

    /* renamed from: b  reason: collision with root package name */
    public final SDKServiceImpl f90330b = new SDKServiceImpl();

    /* renamed from: d  reason: collision with root package name */
    private final IAVSettingsService f90331d = ((com.ss.android.ugc.aweme.external.e) com.ss.android.ugc.aweme.external.e.f90378a.getValue()).avsettingsConfig();

    static {
        Covode.recordClassIndex(56698);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56699);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class d implements ISDKService.SplitCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f90341a;

        static {
            Covode.recordClassIndex(56702);
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final boolean checkIsCanceled() {
            return ISDKService.SplitCallback.DefaultImpls.checkIsCanceled(this);
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onFail() {
            if (this.f90341a.a()) {
                this.f90341a.resumeWith(q.m223constructorimpl(r.a((Throwable) new RuntimeException("split failed"))));
            }
        }

        d(m mVar) {
            this.f90341a = mVar;
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onSuccess(int i2, int i3) {
            if (this.f90341a.a()) {
                this.f90341a.resumeWith(q.m223constructorimpl(v.a(Integer.valueOf(i2), Integer.valueOf(i3))));
            }
        }
    }

    public static final class g implements ISDKService.SplitCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f90354a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactConfig f90355b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecordConfig f90356c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ IRecordService.UICallback f90357d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f90358e;

        static {
            Covode.recordClassIndex(56711);
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final boolean checkIsCanceled() {
            return ISDKService.SplitCallback.DefaultImpls.checkIsCanceled(this);
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onFail() {
            IRecordService.UICallback uICallback = this.f90357d;
            if (uICallback != null) {
                uICallback.preFail(-1);
            }
        }

        static final class a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f90359a;

            static {
                Covode.recordClassIndex(56712);
            }

            a(g gVar) {
                this.f90359a = gVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Intent a2 = c.a(this.f90359a.f90356c);
                ReactionParams params = this.f90359a.f90355b.getParams();
                User reactionFromAuthor = this.f90359a.f90355b.getReactionFromAuthor();
                Bundle bundle = new Bundle();
                Objects.requireNonNull(params, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("reaction_params", params);
                bundle.putSerializable("reaction_from_author", reactionFromAuthor);
                aa b2 = com.ss.android.ugc.aweme.port.in.c.D.b();
                String str = params.wavPath;
                l.b(str, "");
                MusicWaveBean musicWaveBean = (MusicWaveBean) b2.a(k.b.a(str));
                if (musicWaveBean != null) {
                    bundle.putSerializable("music_wave_data", musicWaveBean);
                }
                a2.putExtras(bundle);
                IRecordService.UICallback uICallback = this.f90359a.f90357d;
                if (uICallback != null) {
                    uICallback.preSuccess();
                }
                this.f90359a.f90354a.f90329a.a(com.ss.android.ugc.aweme.port.in.c.f115629h.b(this.f90359a.f90356c.getMusicModel()));
                this.f90359a.f90354a.f90329a.g();
                VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f90359a.f90358e, a2);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onSuccess(int i2, int i3) {
            this.f90355b.getParams().videoWidth = c.a(i2);
            this.f90355b.getParams().videoHeight = c.a(i3);
            i.b(new a(this), j.f80052a);
        }

        g(c cVar, ReactConfig reactConfig, RecordConfig recordConfig, IRecordService.UICallback uICallback, Context context) {
            this.f90354a = cVar;
            this.f90355b = reactConfig;
            this.f90356c = recordConfig;
            this.f90357d = uICallback;
            this.f90358e = context;
        }
    }

    public static final class f implements ISDKService.SplitCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f90342a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DuetConfig f90343b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecordConfig f90344c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f90345d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ IRecordService.UICallback f90346e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f90347f;

        static {
            Covode.recordClassIndex(56706);
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final boolean checkIsCanceled() {
            IRecordService.UICallback uICallback = this.f90346e;
            if (uICallback != null) {
                return uICallback.checkIsCanceled();
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onFail() {
            IRecordService.UICallback uICallback = this.f90346e;
            if (uICallback != null) {
                uICallback.preFail(-1);
            }
        }

        static final class b<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f90352a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Intent f90353b;

            static {
                Covode.recordClassIndex(56710);
            }

            b(f fVar, Intent intent) {
                this.f90352a = fVar;
                this.f90353b = intent;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                IRecordService.UICallback uICallback = this.f90352a.f90346e;
                if (uICallback != null) {
                    uICallback.preSuccess();
                }
                this.f90352a.f90342a.f90329a.a(com.ss.android.ugc.aweme.port.in.c.f115629h.b(this.f90352a.f90344c.getMusicModel()));
                if (!TextUtils.equals(this.f90352a.f90347f, "challenge")) {
                    this.f90352a.f90342a.f90329a.g();
                }
                IRecordService.UICallback uICallback2 = this.f90352a.f90346e;
                if (uICallback2 == null || !uICallback2.checkIsCanceled()) {
                    VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f90352a.f90345d, this.f90353b);
                    IRecordService.UICallback uICallback3 = this.f90352a.f90346e;
                    if (uICallback3 != null) {
                        uICallback3.postSuccess();
                    }
                }
                return z.f158842a;
            }
        }

        public static final class a implements IFetchEffectListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f90348a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Intent f90349b;

            static {
                Covode.recordClassIndex(56707);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
                l.d(effect, "");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(Effect effect) {
                final Effect effect2 = effect;
                l.d(effect2, "");
                i.b(new Callable(this) {
                    /* class com.ss.android.ugc.aweme.external.b.c.f.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f90350a;

                    static {
                        Covode.recordClassIndex(56708);
                    }

                    {
                        this.f90350a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        IRecordService.UICallback uICallback = this.f90350a.f90348a.f90346e;
                        if (uICallback != null) {
                            uICallback.preSuccess();
                        }
                        this.f90350a.f90348a.f90342a.f90329a.a((com.ss.android.ugc.aweme.shortvideo.c) null);
                        if (!TextUtils.equals(this.f90350a.f90348a.f90347f, "challenge")) {
                            this.f90350a.f90348a.f90342a.f90329a.g();
                        }
                        MusicModel musicModel = this.f90350a.f90348a.f90344c.getMusicModel();
                        if (musicModel != null) {
                            this.f90350a.f90348a.f90342a.f90329a.a(com.ss.android.ugc.aweme.port.in.c.f115629h.b(musicModel));
                        }
                        Intent intent = this.f90350a.f90349b;
                        Effect effect = effect2;
                        Integer duetGameScore = this.f90350a.f90348a.f90343b.getDuetGameScore();
                        if (duetGameScore == null) {
                            l.b();
                        }
                        intent.putExtras(c.a(effect, duetGameScore.intValue()));
                        IRecordService.UICallback uICallback2 = this.f90350a.f90348a.f90346e;
                        if (uICallback2 == null || !uICallback2.checkIsCanceled()) {
                            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f90350a.f90348a.f90345d, this.f90350a.f90349b);
                            IRecordService.UICallback uICallback3 = this.f90350a.f90348a.f90346e;
                            if (uICallback3 != null) {
                                uICallback3.postSuccess();
                            }
                        }
                        return z.f158842a;
                    }
                }, j.f80052a);
            }

            a(f fVar, Intent intent) {
                this.f90348a = fVar;
                this.f90349b = intent;
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                l.d(exceptionResult, "");
                IRecordService.UICallback uICallback = this.f90348a.f90346e;
                if (uICallback != null) {
                    uICallback.preFail(-2);
                }
                AnonymousClass2 r1 = new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.external.b.c.f.a.AnonymousClass2 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(56709);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        Context applicationContext = this.this$0.f90348a.f90345d.getApplicationContext();
                        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                        }
                        new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(R.string.br3).a();
                        return z.f158842a;
                    }
                };
                l.d(r1, "");
                s.a(new s.a(r1));
            }
        }

        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
        public final void onSuccess(int i2, int i3) {
            this.f90343b.setDuetVideoWidth(c.a(i2));
            this.f90343b.setDuetVideoHeight(c.a(i3));
            Intent a2 = c.a(this.f90344c);
            DuetConfig duetConfig = this.f90343b;
            Bundle bundle = new Bundle();
            duetConfig.getDuetChallenge();
            duetConfig.getAuthor();
            bundle.putString("duet_hash_tag", duetConfig.getDuetChallenge());
            bundle.putString("duet_video_path", duetConfig.getMp4Path());
            bundle.putString("duet_audio_path", duetConfig.getWavPath());
            bundle.putInt("duet_video_width", duetConfig.getDuetVideoWidth());
            bundle.putBoolean("duet_default_mic", duetConfig.getDefaultUseMic());
            bundle.putInt("duet_video_height", duetConfig.getDuetVideoHeight());
            bundle.putBoolean("duet_from_duet_sticker", duetConfig.isFromDuetSticker());
            bundle.putBoolean("duet_from_duet_button", duetConfig.isFromDuetButton());
            bundle.putString("duet_from", duetConfig.getDuetFrom());
            bundle.putSerializable("duet_author", duetConfig.getAuthor());
            MusicWaveBean musicWaveBean = (MusicWaveBean) com.ss.android.ugc.aweme.port.in.l.f115658a.b().a(k.b.a(duetConfig.getWavPath()));
            if (musicWaveBean != null) {
                bundle.putSerializable("music_wave_data", musicWaveBean);
            }
            bundle.putParcelable("duet_layout_effect", duetConfig.getDuetLayout());
            a2.putExtras(bundle);
            if (this.f90343b.getMStickerDownloadConfig() != null) {
                StickerDownloadConfig mStickerDownloadConfig = this.f90343b.getMStickerDownloadConfig();
                if (mStickerDownloadConfig != null) {
                    c.a(this.f90345d, mStickerDownloadConfig, new a(this, a2));
                    return;
                }
                return;
            }
            i.b(new b(this, a2), j.f80052a);
        }

        f(c cVar, DuetConfig duetConfig, RecordConfig recordConfig, Context context, IRecordService.UICallback uICallback, String str) {
            this.f90342a = cVar;
            this.f90343b = duetConfig;
            this.f90344c = recordConfig;
            this.f90345d = context;
            this.f90346e = uICallback;
            this.f90347f = str;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ StitchParams $stitchParams;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(56713);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar, Intent intent, StitchParams stitchParams, Context context) {
            super(0);
            this.this$0 = cVar;
            this.$intent = intent;
            this.$stitchParams = stitchParams;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String a2 = a(this.$intent, "creation_id");
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.shootWay("stitch");
            builder.stitchParams(this.$stitchParams);
            builder.creationId(a2);
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.$context, c.a(builder.build()));
            return z.f158842a;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public c() {
        cr a2 = cr.a();
        l.b(a2, "");
        this.f90329a = a2;
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.c$c  reason: collision with other inner class name */
    public static final class C2178c implements IFetchEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StickerDownloadConfig f90339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IFetchEffectListener f90340b;

        static {
            Covode.recordClassIndex(56701);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            l.d(effect, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            l.d(effect, "");
            this.f90339a.getOnSuccess();
            this.f90340b.onSuccess(effect);
        }

        C2178c(StickerDownloadConfig stickerDownloadConfig, IFetchEffectListener iFetchEffectListener) {
            this.f90339a = stickerDownloadConfig;
            this.f90340b = iFetchEffectListener;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            h.f.a.b<Integer, z> onFail = this.f90339a.getOnFail();
            if (onFail != null) {
                onFail.invoke(Integer.valueOf(exceptionResult.getErrorCode()));
            }
            this.f90340b.onFail(effect, exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public Intent getRecordBasicIntent(RecordConfig recordConfig) {
        l.d(recordConfig, "");
        return a(recordConfig);
    }

    public static int a(int i2) {
        double d2 = (double) i2;
        Double.isNaN(d2);
        return ((int) Math.round((d2 * 1.0d) / 16.0d)) * 16;
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ IRecordService.UICallback $clientCallback;
        final /* synthetic */ ChangeBanMusicConfig $config;
        final /* synthetic */ Activity $context;
        int label;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(56703);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, Activity activity, ChangeBanMusicConfig changeBanMusicConfig, IRecordService.UICallback uICallback, Aweme aweme, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = cVar;
            this.$context = activity;
            this.$config = changeBanMusicConfig;
            this.$clientCallback = uICallback;
            this.$aweme = aweme;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new e(this.this$0, this.$context, this.$config, this.$clientCallback, this.$aweme, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((e) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0094  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
            // Method dump skipped, instructions count: 181
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.external.b.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    protected static Intent a(RecordConfig recordConfig) {
        Set<Map.Entry<String, String>> entrySet;
        Set<Map.Entry<String, String>> entrySet2;
        l.d(recordConfig, "");
        Intent intent = new Intent();
        Boolean isInterceptBackground = recordConfig.isInterceptBackground();
        if (isInterceptBackground != null) {
            intent.putExtra("intercept_background", isInterceptBackground.booleanValue());
        }
        String shootway = recordConfig.getShootway();
        if (shootway != null) {
            intent.putExtra("shoot_way", shootway);
        }
        String shootFrom = recordConfig.getShootFrom();
        if (shootFrom != null) {
            intent.putExtra("shoot_from", shootFrom);
        }
        String enterFrom = recordConfig.getEnterFrom();
        if (enterFrom != null) {
            intent.putExtra("enter_from", enterFrom);
        }
        String enterMethod = recordConfig.getEnterMethod();
        if (enterMethod != null) {
            intent.putExtra("enter_method", enterMethod);
        }
        String creationId = recordConfig.getCreationId();
        if (creationId != null) {
            intent.putExtra("creation_id", creationId);
        }
        String shoutoutMode = recordConfig.getShoutoutMode();
        if (shoutoutMode != null) {
            intent.putExtra("shoutouts_mode", shoutoutMode);
        }
        String shoutoutOrderID = recordConfig.getShoutoutOrderID();
        if (shoutoutOrderID != null) {
            intent.putExtra("shout_out_order_id", shoutoutOrderID);
        }
        intent.putExtra("restore", recordConfig.getRestoreType());
        String musicOrigin = recordConfig.getMusicOrigin();
        if (musicOrigin != null) {
            intent.putExtra("music_origin", musicOrigin);
        }
        intent.putExtra("need_refresh_filter_data", recordConfig.getPrepareFilter());
        p<String, String> mentionUser = recordConfig.getMentionUser();
        if (mentionUser != null) {
            intent.putExtra("extra_mention_uid", mentionUser.getFirst());
            intent.putExtra("extra_mention_user_name", mentionUser.getSecond());
        }
        String previousPage = recordConfig.getPreviousPage();
        if (previousPage != null) {
            intent.putExtra("extra_previous_page", previousPage);
        }
        String commerceData = recordConfig.getCommerceData();
        if (commerceData != null) {
            intent.putExtra("commerce_data_in_tools_line", commerceData);
        }
        Integer tabs = recordConfig.getTabs();
        if (tabs != null) {
            intent.putExtra("tabs", tabs.intValue());
        }
        String sticker = recordConfig.getSticker();
        if (sticker != null) {
            intent.putExtra("sticker_id", sticker);
        }
        Boolean showCancelAfterPinProp = recordConfig.getShowCancelAfterPinProp();
        if (showCancelAfterPinProp != null) {
            intent.putExtra("show_cancel_after_pin_prop", showCancelAfterPinProp.booleanValue());
        }
        String isFilterBusniessSticker = recordConfig.isFilterBusniessSticker();
        if (isFilterBusniessSticker != null) {
            intent.putExtra("filter_business_sticker", isFilterBusniessSticker);
        }
        Long videoDownloadDuration = recordConfig.getVideoDownloadDuration();
        if (videoDownloadDuration != null) {
            intent.putExtra("video_download_duration", videoDownloadDuration.longValue());
        }
        Long effectDownloadDuration = recordConfig.getEffectDownloadDuration();
        if (effectDownloadDuration != null) {
            intent.putExtra("effect_download_duration", effectDownloadDuration.longValue());
        }
        Long musicDownloadDuration = recordConfig.getMusicDownloadDuration();
        if (musicDownloadDuration != null) {
            intent.putExtra("music_download_duration", musicDownloadDuration.longValue());
        }
        Long startRecordTime = recordConfig.getStartRecordTime();
        if (startRecordTime != null) {
            intent.putExtra("extra_start_record_time", startRecordTime.longValue());
        }
        Long decompressTime = recordConfig.getDecompressTime();
        if (decompressTime != null) {
            intent.putExtra("extra_decompress_time", decompressTime.longValue());
        }
        Boolean presetSticker = recordConfig.getPresetSticker();
        if (presetSticker != null) {
            intent.putExtra("use_preset_sticker_at_first", presetSticker.booleanValue());
        }
        Integer translationType = recordConfig.getTranslationType();
        if (translationType != null) {
            intent.putExtra("translation_type", translationType.intValue());
        }
        Boolean permissionActivityRequired = recordConfig.getPermissionActivityRequired();
        if (permissionActivityRequired != null) {
            intent.putExtra("extra_need_permission_activity", permissionActivityRequired.booleanValue());
        }
        if (l.a((Object) recordConfig.getFromMain(), (Object) true)) {
            intent.putExtra("from", "main");
        }
        Boolean fromSystem = recordConfig.getFromSystem();
        if (fromSystem != null) {
            intent.putExtra("enter_record_directly_from_system", fromSystem.booleanValue());
        }
        Boolean fromOtherPlatform = recordConfig.getFromOtherPlatform();
        if (fromOtherPlatform != null) {
            intent.putExtra("enter_record_from_other_platform", fromOtherPlatform.booleanValue());
        }
        Boolean autoStartRecording = recordConfig.getAutoStartRecording();
        if (autoStartRecording != null) {
            intent.putExtra("auto_start_recording", autoStartRecording.booleanValue());
        }
        Integer cameraFacing = recordConfig.getCameraFacing();
        if (cameraFacing != null) {
            intent.putExtra("extra_camera_facing", cameraFacing.intValue());
        }
        ArrayList<String> stickers = recordConfig.getStickers();
        if (stickers != null) {
            intent.putStringArrayListExtra("reuse_sticker_ids", stickers);
        }
        String giphyGifIds = recordConfig.getGiphyGifIds();
        if (giphyGifIds != null) {
            intent.putExtra("reuse_giphy_gifs", giphyGifIds);
        }
        ShootExtraData shootExtraData = recordConfig.getShootExtraData();
        if (shootExtraData != null) {
            Objects.requireNonNull(shootExtraData, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("extra_shoot_data", (Parcelable) shootExtraData);
        }
        String musicPath = recordConfig.getMusicPath();
        if (musicPath != null) {
            intent.putExtra("path", musicPath);
        }
        String musicSticker = recordConfig.getMusicSticker();
        if (musicSticker != null) {
            intent.putExtra("music_reuse_sticker_id", musicSticker);
        }
        String stickerWithMusicFilePath = recordConfig.getStickerWithMusicFilePath();
        if (stickerWithMusicFilePath != null) {
            intent.putExtra("sticker_with_music_file_path", stickerWithMusicFilePath);
        }
        Effect musicWithStickerEffect = recordConfig.getMusicWithStickerEffect();
        if (musicWithStickerEffect != null) {
            Objects.requireNonNull(musicWithStickerEffect, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("music_with_sticker_effect", (Parcelable) musicWithStickerEffect);
        }
        Music stickerMusic = recordConfig.getStickerMusic();
        if (stickerMusic != null) {
            intent.putExtra("sticker_music", stickerMusic);
        }
        String musicId = recordConfig.getMusicId();
        if (musicId != null) {
            intent.putExtra("music_id", musicId);
        }
        String shareId = recordConfig.getShareId();
        if (shareId != null) {
            intent.putExtra("share_id", shareId);
        }
        String clientId = recordConfig.getClientId();
        if (clientId != null) {
            intent.putExtra("channel", clientId);
        }
        String challengeId = recordConfig.getChallengeId();
        if (challengeId != null) {
            intent.putExtra("challenge_id", challengeId);
        }
        String autoUseMusic = recordConfig.getAutoUseMusic();
        if (autoUseMusic != null) {
            intent.putExtra("direct_use_sticker_music", autoUseMusic);
        }
        String autoUseSticker = recordConfig.getAutoUseSticker();
        if (autoUseSticker != null) {
            intent.putExtra("first_face_sticker", autoUseSticker);
        }
        Boolean showPreloadingDialog = recordConfig.getShowPreloadingDialog();
        if (showPreloadingDialog != null) {
            intent.putExtra("show_preloading_dialog", showPreloadingDialog.booleanValue());
        }
        Effect mvSticker = recordConfig.getMvSticker();
        if (mvSticker != null) {
            intent.putExtra("reuse_mvtheme_enter", true);
            intent.putExtra("extra_bind_mv_id", mvSticker.getEffectId());
            Objects.requireNonNull(mvSticker, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("extra_mv_effect", (Parcelable) mvSticker);
        }
        String mvStickerId = recordConfig.getMvStickerId();
        if (mvStickerId != null) {
            intent.putExtra("extra_bind_mv_id", mvStickerId);
        }
        MiniAppConfig miniAppConfig = recordConfig.getMiniAppConfig();
        if (miniAppConfig != null) {
            intent.putExtra("sticker_id", miniAppConfig.getStickerId());
            intent.putExtra("micro_app_info", miniAppConfig.getAppInfo());
            intent.putExtra("micro_app_class", miniAppConfig.getAppClass());
        }
        CommentVideoConfig commentVideoConfig = recordConfig.getCommentVideoConfig();
        if (commentVideoConfig != null) {
            intent.putExtra("comment_video_model", commentVideoConfig.getCommentVideoModel());
        }
        QaStructConfig qaStructConfig = recordConfig.getQaStructConfig();
        if (qaStructConfig != null) {
            intent.putExtra("question_answer_video_model", qaStructConfig.getQaStruct());
        }
        Effect firstSticker = recordConfig.getFirstSticker();
        if (firstSticker != null) {
            Objects.requireNonNull(firstSticker, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("first_sticker", (Parcelable) firstSticker);
        }
        RecordPresetResource recordPresetResource = recordConfig.getRecordPresetResource();
        if (recordPresetResource != null) {
            Objects.requireNonNull(recordPresetResource, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("record_preset_resource", (Parcelable) recordPresetResource);
        }
        Map<String, String> extraParams = recordConfig.getExtraParams();
        if (extraParams != null) {
            intent.putExtra("extra_sticker_from", extraParams.get("scene"));
            intent.putExtra("grade_key", extraParams.get("grade_key"));
        }
        String donationId = recordConfig.getDonationId();
        if (donationId != null) {
            intent.putExtra("donation_id", donationId);
        }
        Integer defaultTab = recordConfig.getDefaultTab();
        if (defaultTab != null) {
            if (defaultTab.intValue() == 1) {
                intent.putExtra("extra_to_status", true);
            } else if (defaultTab.intValue() == 2) {
                intent.putExtra("to_live", true);
            }
        }
        LiveParams liveParams = recordConfig.getLiveParams();
        if (liveParams != null) {
            String sourceParams = liveParams.getSourceParams();
            if (sourceParams != null) {
                intent.putExtra("extra_live_source_params", sourceParams);
            }
            Boolean onlyShowLiveTab = liveParams.getOnlyShowLiveTab();
            if (onlyShowLiveTab != null) {
                intent.putExtra("extra_only_show_live_tab", onlyShowLiveTab.booleanValue());
            }
        }
        if (recordConfig.getShowStickerPanel()) {
            intent.putExtra("sticker_pannel_show", true);
        }
        HashMap<String, String> starAtlasConfig = recordConfig.getStarAtlasConfig();
        if (!(starAtlasConfig == null || (entrySet2 = starAtlasConfig.entrySet()) == null)) {
            for (Map.Entry<String, String> entry : entrySet2) {
                intent.putExtra(entry.getKey(), entry.getValue());
            }
        }
        HashMap<String, String> missionConfig = recordConfig.getMissionConfig();
        if (!(missionConfig == null || (entrySet = missionConfig.entrySet()) == null)) {
            for (Map.Entry<String, String> entry2 : entrySet) {
                intent.putExtra(entry2.getKey(), entry2.getValue());
            }
        }
        EffectConfig effectConfig = recordConfig.getEffectConfig();
        if (effectConfig != null) {
            intent.putExtra("effect_meta_info", effectConfig.getEffectMetaInfo());
            intent.putExtra("effect_image", effectConfig.getEffectImage());
        }
        StitchParams stitchParams = recordConfig.getStitchParams();
        if (stitchParams != null) {
            Objects.requireNonNull(stitchParams, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("stitch_params", (Parcelable) stitchParams);
        }
        Boolean fromSpecialPlus = recordConfig.getFromSpecialPlus();
        if (fromSpecialPlus != null) {
            intent.putExtra("from_special_plus", fromSpecialPlus.booleanValue());
        }
        Integer videoLength = recordConfig.getVideoLength();
        if (videoLength != null) {
            intent.putExtra("extra_video_length", videoLength.intValue());
        }
        String sharedARSessionId = recordConfig.getSharedARSessionId();
        if (sharedARSessionId != null) {
            intent.putExtra("session", sharedARSessionId);
        }
        String sharedARHostId = recordConfig.getSharedARHostId();
        if (sharedARHostId != null) {
            intent.putExtra("host_uid", sharedARHostId);
        }
        Effect ttepPreviewEffect = recordConfig.getTtepPreviewEffect();
        if (ttepPreviewEffect != null) {
            Objects.requireNonNull(ttepPreviewEffect, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("extra_ttep_preview_effect", (Parcelable) ttepPreviewEffect);
        }
        intent.putExtra("extra_ttep_enter_preview_page", recordConfig.getEnterTTEPPreviewPage());
        intent.putExtra("auto_selected_anchor", recordConfig.getAutoSelectedAnchor());
        intent.putExtra("open_platform_extra", recordConfig.getOpenPlatformExtra());
        intent.putExtra("open_platform_client_key", recordConfig.getOpenPlatformClientKey());
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public void startRecord(Context context, Intent intent) {
        l.d(context, "");
        l.d(intent, "");
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, intent);
    }

    public static Bundle a(Effect effect, int i2) {
        long j2;
        Bundle bundle = new Bundle();
        GameDuetResource gameDuetResource = new GameDuetResource(i2, effect);
        try {
            j2 = Long.parseLong(effect.getEffectId());
        } catch (Exception unused) {
            j2 = 0;
        }
        bundle.putParcelable("duet_sticker_game", gameDuetResource);
        bundle.putLong("first_face_sticker", j2);
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public void startRecord(Context context, RecordConfig recordConfig) {
        l.d(context, "");
        l.d(recordConfig, "");
        Intent a2 = a(recordConfig);
        if (recordConfig.getReshootConfig().getEnableReshoot()) {
            a(context, a2, recordConfig.getKeepChallenges(), recordConfig.getReshootConfig());
        } else {
            a(context, a2, recordConfig.getKeepChallenges());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public void startSuperEntrace(Activity activity, RecordConfig recordConfig) {
        l.d(activity, "");
        l.d(recordConfig, "");
        recordConfig.setPrepareFilter(false);
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startSuperEntranceRecordActivity(activity, a(recordConfig));
        b.a.a().setSuperEntranceRecordClicked(activity, true);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public void startSpecialPlusEntrance(Context context, RecordConfig recordConfig) {
        l.d(context, "");
        l.d(recordConfig, "");
        recordConfig.setSticker(e.a.a().getEffectId());
        recordConfig.setFromSpecialPlus(true);
        recordConfig.setEnterFrom("super_entrance");
        recordConfig.setPresetSticker(true);
        Intent a2 = a(recordConfig);
        Effect a3 = new com.ss.android.ugc.aweme.specialplus.c().a();
        if (a3 != null) {
            recordConfig.setFirstSticker(a3);
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, a2);
        e.a.a().setSpecialPlusClicked();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public void startStitch(Context context, Intent intent, StitchParams stitchParams) {
        l.d(context, "");
        l.d(intent, "");
        l.d(stitchParams, "");
        hx.a(0, new h(this, intent, stitchParams, context));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public void preloadDuetLayout(int i2, int i3, h.f.a.b<? super Effect, z> bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
        if (i2 == 0 || i3 == 0) {
            bVar.invoke(null);
        } else if (((double) ((((float) i2) * 1.0f) / ((float) i3))) <= 1.0d) {
            bVar.invoke(null);
        } else {
            Application a2 = com.bytedance.ies.ugc.appcontext.g.a();
            l.b(a2, "");
            com.ss.android.ugc.aweme.effectplatform.f a3 = com.ss.android.ugc.aweme.effectplatform.c.a(a2, null);
            a3.a("duet-layout", false, (IFetchEffectChannelListener) new a.C2175a(bVar, a3));
        }
    }

    private final void a(Context context, Intent intent, Boolean bool) {
        this.f90329a.a((com.ss.android.ugc.aweme.shortvideo.c) null);
        if (!l.a((Object) bool, (Object) true)) {
            this.f90329a.g();
        }
        if (com.ss.android.ugc.aweme.port.in.g.a().n().b()) {
            com.ss.android.ugc.tools.utils.q.a("cannot enter main record page during entering story page");
        } else {
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, intent);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public void startRecord(Context context, RecordConfig recordConfig, Uri uri) {
        l.d(context, "");
        l.d(recordConfig, "");
        l.d(uri, "");
        Intent a2 = a(recordConfig);
        if (uri.isHierarchical()) {
            for (String str : uri.getQueryParameterNames()) {
                a2.putExtra(str, uri.getQueryParameter(str));
            }
        }
        if (recordConfig.getReshootConfig().getEnableReshoot()) {
            a(context, a2, recordConfig.getKeepChallenges(), recordConfig.getReshootConfig());
        } else {
            a(context, a2, recordConfig.getKeepChallenges());
        }
    }

    protected static void a(Context context, StickerDownloadConfig stickerDownloadConfig, IFetchEffectListener iFetchEffectListener) {
        com.ss.android.ugc.aweme.effectplatform.f createMvEffectPlatform;
        Integer type;
        Integer type2;
        l.d(context, "");
        l.d(stickerDownloadConfig, "");
        l.d(iFetchEffectListener, "");
        Integer type3 = stickerDownloadConfig.getType();
        if ((type3 != null && type3.intValue() == 1) || (((type = stickerDownloadConfig.getType()) != null && type.intValue() == 3) || ((type2 = stickerDownloadConfig.getType()) != null && type2.intValue() == 4))) {
            createMvEffectPlatform = EffectService.getInstance().createMvEffectPlatform(context, stickerDownloadConfig.getRegion());
        } else {
            createMvEffectPlatform = EffectService.getInstance().createEffectPlatform(context, stickerDownloadConfig.getRegion());
        }
        createMvEffectPlatform.a(stickerDownloadConfig.getStickerId(), (Map<String, String>) null, new C2178c(stickerDownloadConfig, iFetchEffectListener));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public void startRecord(Context context, RecordConfig recordConfig, Challenge challenge) {
        String str;
        String str2;
        l.d(context, "");
        l.d(recordConfig, "");
        l.d(challenge, "");
        recordConfig.setPrepareFilter(false);
        AVChallenge a2 = com.ss.android.ugc.aweme.port.in.c.f115629h.a(challenge);
        if (recordConfig.getRecordPresetResource() != null) {
            if (a2 != null) {
                str = a2.stickerId;
                str2 = a2.musicId;
            } else {
                str = null;
                str2 = null;
            }
            recordConfig.setRecordPresetResource(new RecordPresetResource(str, null, str2, null));
        }
        this.f90329a.f125306m = null;
        this.f90329a.a(a2);
        this.f90329a.a((com.ss.android.ugc.aweme.shortvideo.c) null);
        Intent a3 = a(recordConfig);
        if (a2 != null) {
            Objects.requireNonNull(a2, "null cannot be cast to non-null type java.io.Serializable");
            a3.putExtra("extra_open_record_challenge", (Serializable) a2);
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, a3);
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f90333a = 0;

        /* renamed from: b  reason: collision with root package name */
        public final String f90334b;

        /* renamed from: c  reason: collision with root package name */
        public final String f90335c;

        /* renamed from: d  reason: collision with root package name */
        public final String f90336d;

        /* renamed from: e  reason: collision with root package name */
        public final String f90337e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f90338f;

        static {
            Covode.recordClassIndex(56700);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f90333a == bVar.f90333a && l.a(this.f90334b, bVar.f90334b) && l.a(this.f90335c, bVar.f90335c) && l.a(this.f90336d, bVar.f90336d) && l.a(this.f90337e, bVar.f90337e) && this.f90338f == bVar.f90338f;
        }

        public final int hashCode() {
            int i2 = this.f90333a * 31;
            String str = this.f90334b;
            int i3 = 0;
            int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f90335c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f90336d;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f90337e;
            if (str4 != null) {
                i3 = str4.hashCode();
            }
            int i4 = (hashCode3 + i3) * 31;
            boolean z = this.f90338f;
            if (z) {
                z = true;
            }
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = z ? 1 : 0;
            return i4 + i5;
        }

        public final String toString() {
            return "SplitConfig(minDuration=" + this.f90333a + ", outputDir=" + this.f90334b + ", originVideo=" + this.f90335c + ", outAudio=" + this.f90336d + ", outVideo=" + this.f90337e + ", useSplitVideo=" + this.f90338f + ")";
        }

        public b(String str, String str2, String str3, String str4) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(str4, "");
            this.f90334b = str;
            this.f90335c = str2;
            this.f90336d = str3;
            this.f90337e = str4;
            this.f90338f = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public void startChangeBanMusic(Aweme aweme, Activity activity, ChangeBanMusicConfig changeBanMusicConfig, IRecordService.UICallback uICallback) {
        l.d(aweme, "");
        l.d(activity, "");
        l.d(changeBanMusicConfig, "");
        bz unused = kotlinx.coroutines.i.a(bs.f159054a, null, null, new e(this, activity, changeBanMusicConfig, uICallback, aweme, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public void startReact(Context context, RecordConfig recordConfig, ReactConfig reactConfig, IRecordService.UICallback uICallback) {
        l.d(context, "");
        l.d(recordConfig, "");
        l.d(reactConfig, "");
        SDKServiceImpl sDKServiceImpl = this.f90330b;
        int minDuration = reactConfig.getMinDuration();
        String outputDir = reactConfig.getOutputDir();
        String originVideo = reactConfig.getOriginVideo();
        String str = reactConfig.getParams().wavPath;
        l.b(str, "");
        String str2 = reactConfig.getParams().videoPath;
        l.b(str2, "");
        sDKServiceImpl.split(context, minDuration, outputDir, originVideo, str, str2, new g(this, reactConfig, recordConfig, uICallback, context));
    }

    private final void a(Context context, Intent intent, Boolean bool, ReshootConfig reshootConfig) {
        boolean a2;
        this.f90329a.a((com.ss.android.ugc.aweme.shortvideo.c) null);
        if (!l.a((Object) bool, (Object) true)) {
            this.f90329a.g();
        }
        Boolean backMain = reshootConfig.getBackMain();
        if (backMain != null) {
            a2 = backMain.booleanValue();
        } else {
            a2 = com.ss.android.ugc.aweme.port.in.c.a();
        }
        if (context instanceof Activity) {
            VideoRecordEntranceServiceImpl instance = VideoRecordEntranceServiceImpl.Companion.getINSTANCE();
            Activity activity = (Activity) context;
            boolean enableReshoot = reshootConfig.getEnableReshoot();
            Boolean reshootClear = reshootConfig.getReshootClear();
            if (reshootClear == null) {
                l.b();
            }
            instance.startToolPermissionActivity(activity, intent, enableReshoot, reshootClear.booleanValue(), a2);
            return;
        }
        VideoRecordEntranceServiceImpl instance2 = VideoRecordEntranceServiceImpl.Companion.getINSTANCE();
        boolean enableReshoot2 = reshootConfig.getEnableReshoot();
        Boolean reshootClear2 = reshootConfig.getReshootClear();
        if (reshootClear2 == null) {
            l.b();
        }
        instance2.notifyToolPermissionActivity(context, intent, enableReshoot2, reshootClear2.booleanValue(), a2);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public void startRecord(Activity activity, RecordConfig recordConfig, MusicModel musicModel, boolean z) {
        boolean z2;
        boolean z3;
        l.d(activity, "");
        l.d(recordConfig, "");
        l.d(musicModel, "");
        Intent a2 = a(recordConfig);
        cr a3 = cr.a();
        l.b(a3, "");
        boolean z4 = true;
        if (l.a((Object) "direct_shoot", (Object) a3.f125299e)) {
            cr a4 = cr.a();
            l.b(a4, "");
            if (2 == a4.f125300f) {
                if (cr.a().f125295a == null) {
                    z4 = false;
                }
                a2.putExtra("extra_clear_dialog_show_needed", z4);
            }
        }
        if (musicModel.getMusicWaveBean() != null) {
            a2.putExtra("music_wave_data", musicModel.getMusicWaveBean());
        }
        this.f90329a.a(com.ss.android.ugc.aweme.port.in.c.f115629h.b(musicModel));
        a2.putExtra("music_model", musicModel);
        if (recordConfig.getReshootConfig().getEnableReshoot()) {
            ReshootConfig reshootConfig = recordConfig.getReshootConfig();
            VideoRecordEntranceServiceImpl instance = VideoRecordEntranceServiceImpl.Companion.getINSTANCE();
            boolean enableReshoot = reshootConfig.getEnableReshoot();
            Boolean reshootClear = reshootConfig.getReshootClear();
            if (reshootClear != null) {
                z2 = reshootClear.booleanValue();
            } else {
                z2 = false;
            }
            Boolean backMain = reshootConfig.getBackMain();
            if (backMain != null) {
                z3 = backMain.booleanValue();
            } else {
                z3 = false;
            }
            instance.startToolPermissionActivity(activity, a2, enableReshoot, z2, z3);
            return;
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(activity, a2);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public void startDuet(Context context, RecordConfig recordConfig, DuetConfig duetConfig, IRecordService.UICallback uICallback, String str, String str2) {
        l.d(context, "");
        l.d(recordConfig, "");
        l.d(duetConfig, "");
        this.f90330b.split(context, duetConfig.getMinDuration(), duetConfig.getOutputDir(), duetConfig.getOriginVideo(), duetConfig.getWavPath(), duetConfig.getMp4Path(), new f(this, duetConfig, recordConfig, context, uICallback, str2));
    }
}
