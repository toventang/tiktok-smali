package com.ss.android.ugc.aweme.services.external.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.b;
import h.z;

public interface IRecordService {

    public interface UICallback {

        public static final class DefaultImpls {
            static {
                Covode.recordClassIndex(79700);
            }

            public static boolean checkIsCanceled(UICallback uICallback) {
                return false;
            }
        }

        static {
            Covode.recordClassIndex(79699);
        }

        boolean checkIsCanceled();

        void postFail();

        void postSuccess();

        void preFail(int i2);

        void preSuccess();
    }

    static {
        Covode.recordClassIndex(79698);
    }

    Intent getRecordBasicIntent(RecordConfig recordConfig);

    void preloadDuetLayout(int i2, int i3, b<? super Effect, z> bVar);

    void recordActivityResult(Activity activity, int i2, int i3, Intent intent);

    void startChangeBanMusic(Aweme aweme, Activity activity, ChangeBanMusicConfig changeBanMusicConfig, UICallback uICallback);

    void startDuet(Context context, RecordConfig recordConfig, DuetConfig duetConfig, UICallback uICallback, String str, String str2);

    void startReact(Context context, RecordConfig recordConfig, ReactConfig reactConfig, UICallback uICallback);

    void startRecord(Activity activity, RecordConfig recordConfig, MusicModel musicModel, boolean z);

    void startRecord(Context context, Intent intent);

    void startRecord(Context context, RecordConfig recordConfig);

    void startRecord(Context context, RecordConfig recordConfig, Uri uri);

    void startRecord(Context context, RecordConfig recordConfig, Challenge challenge);

    void startRecordMV(Context context, RecordConfig recordConfig, StickerDownloadConfig stickerDownloadConfig);

    void startRecordSlideShowPhotoMV(Context context, RecordConfig recordConfig, PhotoMvAnchorConfig photoMvAnchorConfig);

    void startSpecialPlusEntrance(Context context, RecordConfig recordConfig);

    void startStitch(Context context, Intent intent, StitchParams stitchParams);

    void startSuperEntrace(Activity activity, RecordConfig recordConfig);
}
