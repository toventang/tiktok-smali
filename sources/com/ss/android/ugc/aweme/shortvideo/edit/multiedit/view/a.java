package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.w;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.b;
import java.util.List;

public interface a {
    static {
        Covode.recordClassIndex(83888);
    }

    com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a a();

    void a(int i2, int i3);

    void a(View.OnClickListener onClickListener);

    void a(e<Float, Float> eVar);

    void a(androidx.fragment.app.e eVar, int i2, AnimatorListenerAdapter animatorListenerAdapter);

    void a(androidx.fragment.app.e eVar, View view, boolean z);

    void a(androidx.fragment.app.e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends MediaModel> list, boolean z, w wVar);

    void a(androidx.fragment.app.e eVar, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list);

    void a(VideoSegment videoSegment);

    void a(b bVar);

    void a(List<? extends VideoSegment> list);

    void a(boolean z);

    void a(boolean z, int i2);

    void b(e<Float, Float> eVar);

    void b(androidx.fragment.app.e eVar, int i2, AnimatorListenerAdapter animatorListenerAdapter);

    void b(VideoSegment videoSegment);

    void b(boolean z);

    boolean b();

    void c();

    void c(boolean z);

    e<Float, Float> d();

    boolean e();

    void f();

    void g();

    void h();

    void i();

    void j();

    void k();
}
