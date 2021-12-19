package dmt.av.video;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;

/* access modifiers changed from: package-private */
public final /* synthetic */ class af implements u {

    /* renamed from: a  reason: collision with root package name */
    private final z f156767a;

    static {
        Covode.recordClassIndex(104117);
    }

    af(z zVar) {
        this.f156767a = zVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        z zVar = this.f156767a;
        zVar.a((InfoStickerModel) obj, zVar.f156981e.getValue());
    }
}
