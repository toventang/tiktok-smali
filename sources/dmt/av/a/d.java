package dmt.av.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.vesdk.VEUtils;
import dmt.av.a.a;
import h.f.b.l;
import java.util.ArrayList;

public final class d extends a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f156705f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public String f156706e;

    static {
        Covode.recordClassIndex(104075);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(104076);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(c cVar) {
        super(cVar);
        l.d(cVar, "");
    }

    /* access modifiers changed from: protected */
    @Override // dmt.av.a.a
    public final void a(VideoPublishEditModel videoPublishEditModel) {
        String audioPath;
        l.d(videoPublishEditModel, "");
        super.a(videoPublishEditModel);
        if (TextUtils.isEmpty(videoPublishEditModel.audioPath())) {
            audioPath = videoPublishEditModel.videoPath().toString();
        } else {
            audioPath = videoPublishEditModel.audioPath();
        }
        this.f156706e = audioPath;
    }

    @Override // dmt.av.a.a
    public final a.b d(VideoPublishEditModel videoPublishEditModel) {
        a.b.EnumC4141a aVar;
        a.b.EnumC4141a aVar2;
        l.d(videoPublishEditModel, "");
        if (i.a(this.f156706e)) {
            aVar = a.b.EnumC4141a.EXIT;
        } else {
            aVar = a.b.EnumC4141a.ABSENCE;
        }
        String str = this.f156706e;
        if (str != null) {
            this.f156691a = VEUtils.transCodeAudio(str, videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        }
        if (i.a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = a.b.EnumC4141a.EXIT;
        } else {
            aVar2 = a.b.EnumC4141a.ABSENCE;
        }
        return new a.b("DefaultSeparator", aVar, a.b.EnumC4141a.NO_NEEDED, aVar2, this.f156691a);
    }

    @Override // dmt.av.a.a
    public final a.b c(VideoPublishEditModel videoPublishEditModel) {
        a.b.EnumC4141a aVar;
        a.b.EnumC4141a aVar2;
        l.d(videoPublishEditModel, "");
        if (this.f156706e == null) {
            a.b.EnumC4141a aVar3 = a.b.EnumC4141a.NO_NEEDED;
            return new a.b("DefaultSeparator", aVar3, aVar3, a.b.EnumC4141a.NO_NEEDED, this.f156691a, "mediaFile == null: true");
        }
        a.b.EnumC4141a aVar4 = a.b.EnumC4141a.NO_NEEDED;
        if (i.a(videoPublishEditModel.veAudioRecorderParam.getAudioUrl())) {
            aVar = a.b.EnumC4141a.EXIT;
        } else {
            aVar = a.b.EnumC4141a.ABSENCE;
        }
        if (!videoPublishEditModel.hasOriginalSound() || videoPublishEditModel.voiceVolume == 0.0f) {
            this.f156691a = VEUtils.transCodeAudio(videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        } else {
            if (i.a(this.f156706e)) {
                aVar4 = a.b.EnumC4141a.EXIT;
            } else {
                aVar4 = a.b.EnumC4141a.ABSENCE;
            }
            this.f156691a = -999;
            ArrayList arrayList = new ArrayList();
            String str = this.f156706e;
            if (str == null) {
                l.b();
            }
            arrayList.add(str);
            arrayList.add(videoPublishEditModel.veAudioRecorderParam.getAudioUrl());
            this.f156692b = VEUtils.mixAudio(arrayList, videoPublishEditModel.mEncodedAudioOutputFile, null);
        }
        if (i.a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = a.b.EnumC4141a.EXIT;
        } else {
            aVar2 = a.b.EnumC4141a.ABSENCE;
        }
        return new a.b("DefaultSeparator", aVar4, aVar, aVar2, this.f156691a, "hasOriginalSound = " + videoPublishEditModel.hasOriginalSound() + " \n voiceVolume: " + videoPublishEditModel.voiceVolume);
    }
}
