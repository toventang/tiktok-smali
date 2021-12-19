package dmt.av.video;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ac implements u {

    /* renamed from: a  reason: collision with root package name */
    private final z f156764a;

    static {
        Covode.recordClassIndex(104114);
    }

    ac(z zVar) {
        this.f156764a = zVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        z zVar = this.f156764a;
        zVar.a((InfoStickerModel) obj, zVar.f156981e.getValue());
    }
}
