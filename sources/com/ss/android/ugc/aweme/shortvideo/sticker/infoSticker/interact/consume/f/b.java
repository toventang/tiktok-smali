package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.miniapp_api.d;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.j;
import h.f.b.l;
import java.util.List;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final BusinessExtraData f130391a;

    static {
        Covode.recordClassIndex(85515);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final List<NormalTrackTimeStamp> a(long j2, InteractStickerStruct interactStickerStruct) {
        l.d(interactStickerStruct, "");
        return c.a(j2, interactStickerStruct);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final void a(float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        String str;
        l.d(bVar, "");
        BusinessExtraData businessExtraData = this.f130391a;
        if (businessExtraData != null) {
            str = businessExtraData.getSchemaUrlOpenFirst();
        } else {
            str = null;
        }
        if (!d.c(str)) {
            bVar.a(this.f130388d.b(f2, f3));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3) {
        String str;
        BusinessExtraData businessExtraData = this.f130391a;
        String str2 = null;
        if (businessExtraData != null) {
            str = businessExtraData.getStickerId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        BusinessExtraData businessExtraData2 = this.f130391a;
        if (businessExtraData2 != null) {
            str2 = businessExtraData2.getSchemaUrlOpenFirst();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return super.a(j2, i2, f2, f3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, a aVar, InteractStickerStruct interactStickerStruct, j jVar, BusinessExtraData businessExtraData) {
        super(context, aVar, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(aVar, "");
        l.d(interactStickerStruct, "");
        this.f130391a = businessExtraData;
    }
}
