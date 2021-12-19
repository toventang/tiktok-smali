package dmt.av.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.x;
import dmt.av.a.a;
import h.f.b.l;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class j extends a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f156715e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private String f156716f;

    static {
        Covode.recordClassIndex(104086);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(104087);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements VEListener.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f156717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f156718b;

        static {
            Covode.recordClassIndex(104088);
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileProgress(float f2) {
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileDone() {
            this.f156717a.f156691a = 0;
            this.f156718b.countDown();
        }

        b(j jVar, CountDownLatch countDownLatch) {
            this.f156717a = jVar;
            this.f156718b = countDownLatch;
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileError(int i2, int i3, float f2, String str) {
            l.d(str, "");
            this.f156718b.countDown();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(c cVar) {
        super(cVar);
        l.d(cVar, "");
    }

    /* access modifiers changed from: protected */
    @Override // dmt.av.a.a
    public final void a(VideoPublishEditModel videoPublishEditModel) {
        String str;
        l.d(videoPublishEditModel, "");
        super.a(videoPublishEditModel);
        StitchParams stitchParams = videoPublishEditModel.stitchParams;
        String str2 = null;
        if (stitchParams != null) {
            str = stitchParams.getConcatAudioPath();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = videoPublishEditModel.audioPath();
        } else {
            StitchParams stitchParams2 = videoPublishEditModel.stitchParams;
            if (stitchParams2 != null) {
                str2 = stitchParams2.getConcatAudioPath();
            }
        }
        this.f156716f = str2;
    }

    @Override // dmt.av.a.a
    public final a.b d(VideoPublishEditModel videoPublishEditModel) {
        a.b.EnumC4141a aVar;
        a.b.EnumC4141a aVar2;
        l.d(videoPublishEditModel, "");
        if (i.a(this.f156716f)) {
            aVar = a.b.EnumC4141a.EXIT;
        } else {
            aVar = a.b.EnumC4141a.ABSENCE;
        }
        String str = this.f156716f;
        if (str != null) {
            this.f156691a = VEUtils.transCodeAudio(str, videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        }
        if (i.a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = a.b.EnumC4141a.EXIT;
        } else {
            aVar2 = a.b.EnumC4141a.ABSENCE;
        }
        return new a.b("StitchSeparator", aVar, a.b.EnumC4141a.NO_NEEDED, aVar2, this.f156691a);
    }

    @Override // dmt.av.a.a
    public final a.b c(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        a.b.EnumC4141a aVar;
        a.b.EnumC4141a aVar2;
        l.d(videoPublishEditModel, "");
        boolean z2 = false;
        if (videoPublishEditModel.stitchParams == null || this.f156716f == null) {
            a.b.EnumC4141a aVar3 = a.b.EnumC4141a.NO_NEEDED;
            a.b.EnumC4141a aVar4 = a.b.EnumC4141a.NO_NEEDED;
            int i2 = this.f156691a;
            StringBuilder sb = new StringBuilder("model.stitchParams == null: ");
            if (videoPublishEditModel.stitchParams == null) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder append = sb.append(z).append("  mediaFile == null: ");
            if (this.f156716f == null) {
                z2 = true;
            }
            return new a.b("StitchSeparator", aVar3, aVar3, aVar4, i2, append.append(z2).toString());
        }
        a.b.EnumC4141a aVar5 = a.b.EnumC4141a.NO_NEEDED;
        if (i.a(videoPublishEditModel.veAudioRecorderParam.getAudioUrl())) {
            aVar = a.b.EnumC4141a.EXIT;
        } else {
            aVar = a.b.EnumC4141a.ABSENCE;
        }
        if (!videoPublishEditModel.hasOriginalSound() || videoPublishEditModel.voiceVolume == 0.0f) {
            this.f156691a = VEUtils.transCodeAudio(videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        } else {
            x xVar = new x(videoPublishEditModel.draftDir());
            xVar.a(new String[]{videoPublishEditModel.veAudioRecorderParam.getAudioUrl()}, new int[]{0}, new int[]{-1}, new float[]{1.0f});
            if (i.a(this.f156716f)) {
                aVar5 = a.b.EnumC4141a.EXIT;
            } else {
                aVar5 = a.b.EnumC4141a.ABSENCE;
            }
            String str = this.f156716f;
            int s = xVar.s();
            StitchParams stitchParams = videoPublishEditModel.stitchParams;
            if (stitchParams == null) {
                l.b();
            }
            int duration = s - ((int) stitchParams.getDuration());
            StitchParams stitchParams2 = videoPublishEditModel.stitchParams;
            if (stitchParams2 == null) {
                l.b();
            }
            int a2 = xVar.a(str, 0, duration, (int) stitchParams2.getDuration(), xVar.s(), false);
            xVar.a(0, 1, videoPublishEditModel.voiceVolume);
            xVar.a(a2, 1, videoPublishEditModel.voiceVolume);
            xVar.d(1);
            VEAudioEncodeSettings.a aVar6 = new VEAudioEncodeSettings.a();
            aVar6.f150684b = 16000;
            aVar6.f150686d = 2;
            aVar6.f150685c = 128000;
            VEAudioEncodeSettings a3 = aVar6.a();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (xVar.a(videoPublishEditModel.mEncodedAudioOutputFile, a3, new b(this, countDownLatch))) {
                try {
                    countDownLatch.await(40000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            xVar.j();
        }
        if (i.a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = a.b.EnumC4141a.EXIT;
        } else {
            aVar2 = a.b.EnumC4141a.ABSENCE;
        }
        return new a.b("StitchSeparator", aVar5, aVar, aVar2, this.f156691a, "hasOriginalSound = " + videoPublishEditModel.hasOriginalSound() + " \n voiceVolume: " + videoPublishEditModel.voiceVolume);
    }
}
