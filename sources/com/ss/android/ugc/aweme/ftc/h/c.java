package com.ss.android.ugc.aweme.ftc.h;

import android.view.ScaleGestureDetector;
import com.bytedance.als.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import h.f.b.l;
import h.p;
import h.u;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public d f98559a;

    /* renamed from: b  reason: collision with root package name */
    public m f98560b;

    /* renamed from: c  reason: collision with root package name */
    public ShortVideoContext f98561c;

    /* renamed from: d  reason: collision with root package name */
    public h<Long> f98562d;

    /* renamed from: e  reason: collision with root package name */
    public h<p<List<TimeSpeedModelExtension>, Long>> f98563e;

    /* renamed from: f  reason: collision with root package name */
    public h<u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f98564f;

    /* renamed from: g  reason: collision with root package name */
    public h<Integer> f98565g;

    /* renamed from: h  reason: collision with root package name */
    public h<RetakeVideoContext> f98566h;

    /* renamed from: i  reason: collision with root package name */
    public h<p<List<TimeSpeedModelExtension>, Long>> f98567i;

    /* renamed from: j  reason: collision with root package name */
    public h<u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f98568j;

    /* renamed from: k  reason: collision with root package name */
    public h<Boolean> f98569k;

    /* renamed from: l  reason: collision with root package name */
    public h<Boolean> f98570l;

    /* renamed from: m  reason: collision with root package name */
    public h<Boolean> f98571m;
    public h<ScaleGestureDetector> n;
    public h<VideoRecordGestureLayout.a> o;

    static {
        Covode.recordClassIndex(62671);
    }

    public final m a() {
        m mVar = this.f98560b;
        if (mVar == null) {
            l.a("recordControlApi");
        }
        return mVar;
    }

    public final ShortVideoContext b() {
        ShortVideoContext shortVideoContext = this.f98561c;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        return shortVideoContext;
    }
}
