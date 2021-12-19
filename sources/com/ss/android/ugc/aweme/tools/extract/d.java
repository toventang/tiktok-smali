package com.ss.android.ugc.aweme.tools.extract;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.tools.extract.l;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.vesdk.VEUtils;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class d extends a {

    /* renamed from: e  reason: collision with root package name */
    public final VideoPublishEditModel f140046e;

    /* renamed from: f  reason: collision with root package name */
    private int f140047f;

    static {
        Covode.recordClassIndex(91519);
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.l
    public final String e() {
        return "extract_bgv";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.tools.extract.a
    public final List<z> d() {
        return aa.a(this.f140046e);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f140048a;

        static {
            Covode.recordClassIndex(91520);
        }

        a(d dVar) {
            this.f140048a = dVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ArrayList<TimeSpeedModelExtension> a2 = CameraComponentModel.a(this.f140048a.f140046e.mVideoSegmentsDesc);
            n nVar = this.f140048a.f139985c;
            l.b(nVar, "");
            String str = nVar.f140102b;
            l.b(str, "");
            String str2 = File.separator;
            l.b(str2, "");
            if (!p.c(str, str2, false)) {
                str = str + File.separator;
            }
            d dVar = this.f140048a;
            l.b(a2, "");
            ArrayList arrayList = new ArrayList();
            for (T t : a2) {
                T t2 = t;
                l.b(t2, "");
                if (t2.getBackgroundVideo() != null) {
                    arrayList.add(t);
                }
            }
            int i2 = 0;
            for (Map.Entry<String, Long> entry : dVar.a(arrayList).entrySet()) {
                VEUtils.saveVideoFrames(entry.getKey(), this.f140048a.a((int) entry.getValue().longValue()), k.f140100a[0], -1, false, str, i2 + "_extract_frame", 1);
                i2++;
            }
            String extractFramesDir = this.f140048a.f140046e.extractFramesModel.getExtractFramesDir();
            String str3 = File.separator;
            l.b(str3, "");
            if (!p.c(extractFramesDir, str3, false)) {
                extractFramesDir = extractFramesDir + File.separator;
            }
            File[] listFiles = new File(str).listFiles();
            if (!(listFiles == null || listFiles.length == 0)) {
                for (File file : listFiles) {
                    StringBuilder append = new StringBuilder().append(extractFramesDir);
                    l.b(file, "");
                    String sb = append.append(file.getName()).toString();
                    e.c(file.getAbsolutePath(), sb);
                    this.f140048a.f140046e.extractFramesModel.addFrameAtLastSegment(new FrameItem(sb, 0, 0, 6, null));
                }
            }
            e.e(str);
            e.c(str);
            return null;
        }
    }

    public d(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        this.f140046e = videoPublishEditModel;
    }

    static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f140049a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l.a f140050b;

        static {
            Covode.recordClassIndex(91521);
        }

        b(d dVar, l.a aVar) {
            this.f140049a = dVar;
            this.f140050b = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            l.a aVar = this.f140050b;
            h.f.b.l.b(iVar, "");
            aVar.a(iVar.a());
            this.f140049a.a(true);
            this.f140049a.a();
            return null;
        }
    }

    public final int[] a(int i2) {
        int i3 = i2 / 500;
        this.f140047f = i3;
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i4] = i4 * 500;
        }
        return iArr;
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.a
    public final void a(l.a aVar) {
        h.f.b.l.d(aVar, "");
        super.a(aVar);
        if (b()) {
            i.b(new a(this), i.f4824a).a((g) new b(this, aVar));
        }
    }

    public final Map<String, Long> a(List<? extends TimeSpeedModelExtension> list) {
        String videoPath;
        long j2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : list) {
            com.ss.android.ugc.aweme.sticker.model.a backgroundVideo = t.getBackgroundVideo();
            if (!(backgroundVideo == null || (videoPath = backgroundVideo.getVideoPath()) == null)) {
                String str = File.separator;
                h.f.b.l.b(str, "");
                Objects.requireNonNull(videoPath, "null cannot be cast to non-null type java.lang.String");
                String substring = videoPath.substring(p.a((CharSequence) videoPath, str) + 1);
                h.f.b.l.b(substring, "");
                String str2 = this.f140046e.uniqueVideoSessionDir(dj.f126466i) + File.separator + substring;
                if (com.ss.android.ugc.tools.utils.i.a(str2)) {
                    videoPath = str2;
                }
                if (com.ss.android.ugc.tools.utils.i.a(videoPath)) {
                    Long l2 = (Long) linkedHashMap.get(String.valueOf(videoPath));
                    if (t.getSpeed() > 0.0d) {
                        String valueOf = String.valueOf(videoPath);
                        if (l2 != null) {
                            j2 = l2.longValue();
                        } else {
                            j2 = 0;
                        }
                        linkedHashMap.put(valueOf, Long.valueOf(j2 + ((long) TimeSpeedModelExtension.calculateRealTime(t.getDuration(), t.getSpeed()))));
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
