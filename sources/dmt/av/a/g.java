package dmt.av.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.vesdk.VEUtils;
import dmt.av.a.a;
import h.f.b.l;

public final class g extends a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f156708e = new a((byte) 0);

    static {
        Covode.recordClassIndex(104080);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(104081);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(c cVar) {
        super(cVar);
        l.d(cVar, "");
    }

    @Override // dmt.av.a.a
    public final a.b d(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        this.f156691a = 0;
        a.b.EnumC4141a aVar = a.b.EnumC4141a.NO_NEEDED;
        return new a.b("MVSeparator", aVar, aVar, a.b.EnumC4141a.NO_NEEDED, this.f156691a);
    }

    @Override // dmt.av.a.a
    public final a.b c(VideoPublishEditModel videoPublishEditModel) {
        a.b.EnumC4141a aVar;
        a.b.EnumC4141a aVar2;
        l.d(videoPublishEditModel, "");
        if (i.a(videoPublishEditModel.veAudioRecorderParam.getAudioUrl())) {
            aVar = a.b.EnumC4141a.EXIT;
        } else {
            aVar = a.b.EnumC4141a.ABSENCE;
        }
        this.f156691a = VEUtils.transCodeAudio(videoPublishEditModel.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        if (i.a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            aVar2 = a.b.EnumC4141a.EXIT;
        } else {
            aVar2 = a.b.EnumC4141a.ABSENCE;
        }
        return new a.b("MVSeparator", a.b.EnumC4141a.NO_NEEDED, aVar, aVar2, this.f156691a);
    }
}
