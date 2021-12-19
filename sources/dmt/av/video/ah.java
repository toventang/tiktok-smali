package dmt.av.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.a.b;

final /* synthetic */ class ah implements b {

    /* renamed from: a  reason: collision with root package name */
    private final z f156769a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishEditModel f156770b;

    static {
        Covode.recordClassIndex(104119);
    }

    ah(z zVar, VideoPublishEditModel videoPublishEditModel) {
        this.f156769a = zVar;
        this.f156770b = videoPublishEditModel;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        z zVar = this.f156769a;
        VideoPublishEditModel videoPublishEditModel = this.f156770b;
        FilterBean filterBean = (FilterBean) obj;
        if (filterBean == null) {
            return null;
        }
        zVar.H.B = filterBean;
        zVar.H.C = videoPublishEditModel.mSelectedFilterIntensity;
        return null;
    }
}
