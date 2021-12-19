package com.ss.android.ugc.aweme.shortvideo.edit;

import b.i;
import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.shortvideo.cut.v;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.bg;
import com.ss.android.vesdk.runtime.b;
import com.ss.android.vesdk.x;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class ab implements x {

    /* renamed from: a  reason: collision with root package name */
    public j<Boolean> f126726a = new j<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f126727b;

    /* renamed from: c  reason: collision with root package name */
    private g f126728c;

    /* renamed from: d  reason: collision with root package name */
    private final g f126729d;

    /* renamed from: e  reason: collision with root package name */
    private final EditPreviewInfo f126730e;

    static {
        Covode.recordClassIndex(83137);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.x
    public final String[] c() {
        return this.f126729d.g();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.x
    public final String[] d() {
        return this.f126729d.h();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.x
    public final String[] e() {
        return this.f126729d.i();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.x
    public final boolean b() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.x
    public final i<Boolean> a() {
        int i2;
        VEVideoEncodeSettings d2;
        if (c() != null) {
            this.f126727b = true;
            this.f126726a.a((Boolean) true);
        } else if (this.f126728c == null) {
            int[] iArr = (this.f126730e.getSceneIn() > 0 || this.f126730e.getSceneOut() > 0) ? new int[]{(int) this.f126730e.getSceneIn(), (int) this.f126730e.getSceneOut()} : new int[]{0, this.f126729d.j()};
            int i3 = iArr[0];
            int i4 = iArr[1];
            VESize vESize = new VESize(-1, -1);
            List<EditVideoSegment> videoList = this.f126730e.getVideoList();
            if (videoList != null && !videoList.isEmpty()) {
                EditVideoSegment editVideoSegment = this.f126730e.getVideoList().get(0);
                VESize vESize2 = new VESize(editVideoSegment.getVideoFileInfo().getWidth(), editVideoSegment.getVideoFileInfo().getHeight());
                vESize = new VESize(this.f126730e.getPreviewWidth(), this.f126730e.getPreviewHeight());
                float f2 = ((float) vESize2.width) / ((float) vESize2.height);
                float f3 = ((float) vESize.width) / ((float) vESize.height);
                if (f2 > f3) {
                    if (vESize2.width <= vESize.width) {
                        vESize2.height = (int) (((float) vESize2.width) / f3);
                    }
                } else if (vESize2.height <= vESize.height) {
                    vESize2.width = (int) (((float) vESize2.height) * f3);
                }
                vESize = vESize2;
            }
            b a2 = this.f126729d.a();
            String[] strArr = new String[this.f126730e.getVideoList().size()];
            int i5 = 0;
            for (T t : this.f126730e.getVideoList()) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    n.a();
                }
                strArr[i5] = t.getVideoPath();
                i5 = i6;
            }
            bg bgVar = new bg(strArr);
            int i7 = 0;
            for (T t2 : this.f126730e.getVideoList()) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    n.a();
                }
                VideoCutInfo videoCutInfo = t2.getVideoCutInfo();
                if (videoCutInfo != null) {
                    bgVar.f151088e[i7] = (int) videoCutInfo.getStart();
                    bgVar.f151089f[i7] = (int) videoCutInfo.getEnd();
                    bgVar.f151092i[i7] = (double) videoCutInfo.getSpeed();
                    bgVar.f151094k[i7] = v.a.a(videoCutInfo.getRotate());
                }
                i7 = i8;
            }
            int i9 = vESize.width;
            int i10 = vESize.height;
            a aVar = new a(this);
            l.d(a2, "");
            l.d(bgVar, "");
            if (bgVar.f151084a == null || bgVar.f151084a.length <= 1) {
                i2 = 0;
                d2 = new VEVideoEncodeSettings.a(2).a(-1, -1).a(30).b(false).c(13).g(1).c().a(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).a(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).a(false, false).d();
            } else {
                i2 = 0;
                d2 = new VEVideoEncodeSettings.a(2).a(i9, i10).f(1).a(30).b(false).c(13).g(1).c().a(VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE).a(VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST).a(false, false).d();
            }
            an.c("VEEditor", "genReverseVideo2 with param:startTime:" + i3 + "endTime:" + i4);
            float[] fArr = new float[bgVar.f151092i.length];
            while (i2 < bgVar.f151092i.length) {
                fArr[i2] = (float) bgVar.f151092i[i2];
                i2++;
            }
            x xVar = new x(a2.f151426a);
            int a3 = xVar.a(bgVar.f151084a, bgVar.f151088e, bgVar.f151089f, (String[]) null, bgVar.f151086c, bgVar.f151090g, bgVar.f151091h, fArr, fArr, bgVar.f151094k, x.l.VIDEO_OUT_RATIO_ORIGINAL);
            com.ss.android.ugc.asve.editor.a aVar2 = null;
            if (a3 != 0) {
                an.d("VEEditor", "genReverseVideo2 init2 error:".concat(String.valueOf(a3)));
            } else {
                xVar.f151515d.b(i3, i4, x.g.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
                x a4 = x.a(xVar, a2, d2, aVar);
                if (a4 != null) {
                    aVar2 = new com.ss.android.ugc.asve.editor.a(a4);
                }
            }
            this.f126728c = aVar2;
        }
        i<TResult> iVar = this.f126726a.f4869a;
        l.b(iVar, "");
        return iVar;
    }

    public static final class a implements VEListener.r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ab f126731a;

        static {
            Covode.recordClassIndex(83138);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(ab abVar) {
            this.f126731a = abVar;
        }

        @Override // com.ss.android.vesdk.VEListener.r
        public final void a(int i2) {
            boolean z;
            ab abVar = this.f126731a;
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            abVar.f126727b = z;
            this.f126731a.f126726a.a(Boolean.valueOf(this.f126731a.f126727b));
        }
    }

    public ab(g gVar, EditPreviewInfo editPreviewInfo) {
        l.d(gVar, "");
        l.d(editPreviewInfo, "");
        this.f126729d = gVar;
        this.f126730e = editPreviewInfo;
    }
}
