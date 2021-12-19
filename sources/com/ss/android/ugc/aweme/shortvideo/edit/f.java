package com.ss.android.ugc.aweme.shortvideo.edit;

import b.i;
import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.asve.f.c;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.runtime.b;
import com.ss.android.vesdk.x;
import h.f.b.l;

public final class f implements x {

    /* renamed from: a  reason: collision with root package name */
    public boolean f127055a;

    /* renamed from: b  reason: collision with root package name */
    private g f127056b;

    /* renamed from: c  reason: collision with root package name */
    private b f127057c;

    /* renamed from: d  reason: collision with root package name */
    private final g f127058d;

    /* renamed from: e  reason: collision with root package name */
    private final MultiEditVideoRecordData f127059e;

    /* renamed from: f  reason: collision with root package name */
    private VideoPublishEditModel f127060f;

    static {
        Covode.recordClassIndex(83370);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.x
    public final String[] c() {
        return this.f127058d.g();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.x
    public final String[] d() {
        return this.f127058d.h();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.x
    public final String[] e() {
        return this.f127058d.i();
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
        com.ss.android.ugc.asve.editor.a aVar;
        j jVar = new j();
        if (c() != null) {
            this.f127055a = true;
            jVar.a((Object) true);
        } else {
            VERecordData a2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(this.f127059e);
            EditPreviewInfo previewInfo = this.f127060f.getPreviewInfo();
            int[] totalVideoWidth = previewInfo.getTotalVideoWidth();
            int[] totalVideoHeight = previewInfo.getTotalVideoHeight();
            l.b(previewInfo, "");
            VESize calcTargetRes = VEUtils.calcTargetRes(totalVideoWidth, totalVideoHeight, c.a(previewInfo), previewInfo.getPreviewWidth());
            this.f127057c = this.f127058d.a();
            b a3 = this.f127058d.a();
            int i2 = calcTargetRes.width;
            int i3 = calcTargetRes.height;
            a aVar2 = new a(this, jVar);
            l.d(a3, "");
            l.d(a2, "");
            l.d(aVar2, "");
            x a4 = x.a(a3, a2, i2, i3, aVar2);
            if (a4 != null) {
                aVar = new com.ss.android.ugc.asve.editor.a(a4);
            } else {
                aVar = null;
            }
            this.f127056b = aVar;
        }
        i<TResult> iVar = jVar.f4869a;
        l.b(iVar, "");
        return iVar;
    }

    public static final class a implements VEListener.r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f127061a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f127062b;

        static {
            Covode.recordClassIndex(83371);
        }

        @Override // com.ss.android.vesdk.VEListener.r
        public final void a(int i2) {
            boolean z;
            f fVar = this.f127061a;
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            fVar.f127055a = z;
            this.f127062b.a(Boolean.valueOf(this.f127061a.f127055a));
        }

        a(f fVar, j jVar) {
            this.f127061a = fVar;
            this.f127062b = jVar;
        }
    }

    public f(g gVar, MultiEditVideoRecordData multiEditVideoRecordData, VideoPublishEditModel videoPublishEditModel) {
        l.d(gVar, "");
        l.d(multiEditVideoRecordData, "");
        l.d(videoPublishEditModel, "");
        this.f127058d = gVar;
        this.f127059e = multiEditVideoRecordData;
        this.f127060f = videoPublishEditModel;
    }
}
