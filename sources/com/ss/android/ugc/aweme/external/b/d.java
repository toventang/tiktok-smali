package com.ss.android.ugc.aweme.external.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class d extends c {
    static {
        Covode.recordClassIndex(56714);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void recordActivityResult(Activity activity, int i2, int i3, Intent intent) {
    }

    public static final class a implements IFetchEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f90360a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StickerDownloadConfig f90361b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecordConfig f90362c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f90363d;

        static {
            Covode.recordClassIndex(56715);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            h.f.a.a<z> onSuccess = this.f90361b.getOnSuccess();
            if (onSuccess != null) {
                onSuccess.invoke();
            }
            Intent a2 = d.a(this.f90362c);
            if (effect2 != null) {
                a2.putExtra("reuse_mvtheme_enter", true);
                a2.putExtra("extra_bind_mv_id", effect2.getEffectId());
                Objects.requireNonNull(effect2, "null cannot be cast to non-null type android.os.Parcelable");
                a2.putExtra("extra_mv_effect", (Parcelable) effect2);
            }
            h.f.a.a<z> onSuccess2 = this.f90361b.getOnSuccess();
            if (onSuccess2 != null) {
                onSuccess2.invoke();
            }
            this.f90360a.f90329a.a((c) null);
            this.f90360a.f90329a.g();
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f90363d, a2);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            b<Integer, z> onFail = this.f90361b.getOnFail();
            if (onFail != null) {
                onFail.invoke(Integer.valueOf(exceptionResult.getErrorCode()));
            }
        }

        a(d dVar, StickerDownloadConfig stickerDownloadConfig, RecordConfig recordConfig, Context context) {
            this.f90360a = dVar;
            this.f90361b = stickerDownloadConfig;
            this.f90362c = recordConfig;
            this.f90363d = context;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecordMV(Context context, RecordConfig recordConfig, StickerDownloadConfig stickerDownloadConfig) {
        l.d(context, "");
        l.d(recordConfig, "");
        l.d(stickerDownloadConfig, "");
        if (!TextUtils.isEmpty(stickerDownloadConfig.getStickerId())) {
            a(context, stickerDownloadConfig, new a(this, stickerDownloadConfig, recordConfig, context));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecordSlideShowPhotoMV(Context context, RecordConfig recordConfig, PhotoMvAnchorConfig photoMvAnchorConfig) {
        l.d(context, "");
        l.d(recordConfig, "");
        l.d(photoMvAnchorConfig, "");
        this.f90329a.a((c) null);
        this.f90329a.g();
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startChoosePhotoActivity((Activity) context, a(recordConfig), photoMvAnchorConfig);
    }
}
