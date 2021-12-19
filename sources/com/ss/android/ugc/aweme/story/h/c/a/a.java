package com.ss.android.ugc.aweme.story.h.c.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.a.q;
import h.z;
import java.util.ArrayList;

public interface a {
    static {
        Covode.recordClassIndex(90144);
    }

    String a(Bundle bundle, VideoPublishEditModel videoPublishEditModel, q<? super String, Object, Object, z> qVar);

    void a();

    void a(Activity activity, VideoPublishEditModel videoPublishEditModel, int i2);

    void a(e eVar, ArrayList<MediaModel> arrayList, Intent intent);

    void a(boolean z);

    boolean b();

    com.ss.android.ugc.aweme.story.a c();
}
