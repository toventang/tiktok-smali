package dmt.av.video.f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.StickerPermissionApi;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.StickerPermissionResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.b;
import com.ss.android.ugc.aweme.shortvideo.ui.task.a;
import f.a.t;
import h.f.b.l;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f156891a;

    static {
        Covode.recordClassIndex(104219);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.a().a(false);
        au C = g.a().C();
        String str = StickerPermissionApi.a.f127773a;
        l.b(str, "");
        t<StickerPermissionResponse> a2 = ((StickerPermissionApi) C.createRetrofit(str, true, StickerPermissionApi.class)).getStickerPermission().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a2, "");
        a2.a(b.a.f127777a, b.C3330b.f127778a);
    }

    public f(Context context) {
        l.d(context, "");
        this.f156891a = context;
    }
}
