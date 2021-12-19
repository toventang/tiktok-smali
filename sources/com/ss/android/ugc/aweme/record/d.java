package com.ss.android.ugc.aweme.record;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.als.dsl.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.a.i;
import com.bytedance.o.f;
import com.bytedance.o.n;
import com.bytedance.scene.j;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.asve.recorder.effect.a;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.record.f;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.types.ar.text.r;
import com.ss.android.vesdk.k;
import h.z;

public interface d {
    static {
        Covode.recordClassIndex(78231);
    }

    void addStoryTempFile(String str);

    void attachStickerComponent(b bVar, com.bytedance.scene.group.b bVar2, int i2, r.b bVar3);

    void cleanStoryCache();

    j createLighteningFakeScene();

    boolean enable3MinRecord();

    Activity findActivityInstance(Class<? extends e> cls);

    i generateBeautyComponent(f fVar);

    c getABService();

    com.bytedance.creativex.recorder.gesture.api.d getARGestureDelegateListener(a aVar, ViewGroup.MarginLayoutParams marginLayoutParams);

    b getAlbumService();

    String getDefaultShootTabTag(ShortVideoContext shortVideoContext);

    e getMaxDurationResolver();

    f getPhotoModule(e eVar, com.ss.android.ugc.asve.recorder.c.a aVar, f.a aVar2);

    boolean getRequestDuetSettingPermission();

    void initVESDK(k kVar);

    boolean isRecordingOrEditing();

    void photoCanvasGoNext(e eVar, String str, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, boolean z, MediaModel mediaModel, h.f.a.b<? super Boolean, z> bVar);

    void registerNeededObjects(e eVar, n nVar, ShortVideoContext shortVideoContext);

    void requestDuetSettingPermission();

    boolean shouldDropCurrentMusicFor3min(Object obj, ShortVideoContext shortVideoContext);

    void startStoryPublish(Activity activity, g gVar, com.ss.android.ugc.aweme.shortvideo.preview.a aVar, com.ss.android.ugc.aweme.publish.a aVar2, Intent intent);
}
