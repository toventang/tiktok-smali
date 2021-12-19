package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.r;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.TextStruct;
import com.ss.android.ugc.aweme.sticker.i;
import com.ss.android.ugc.aweme.sticker.j;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class g extends a {

    /* renamed from: a  reason: collision with root package name */
    private final h f130404a;

    static {
        Covode.recordClassIndex(85524);
    }

    public final TextStruct a() {
        return (TextStruct) this.f130404a.getValue();
    }

    static final class a extends m implements h.f.a.a<TextStruct> {
        final /* synthetic */ InteractStickerStruct $stickerStruct;

        static {
            Covode.recordClassIndex(85525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(InteractStickerStruct interactStickerStruct) {
            super(0);
            this.$stickerStruct = interactStickerStruct;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextStruct invoke() {
            try {
                GsonProvider c2 = GsonHolder.c();
                l.b(c2, "");
                return (TextStruct) c2.b().a(this.$stickerStruct.getTextStruct(), TextStruct.class);
            } catch (Exception unused) {
                return new TextStruct(null, 1, null);
            }
        }
    }

    public final Map<String, String> b() {
        String str;
        String str2;
        i iVar;
        String str3;
        i iVar2;
        i iVar3;
        HashMap hashMap = new HashMap();
        hashMap.put("close", "false");
        hashMap.put("back", "true");
        hashMap.put("hide_nav_bar", "false");
        j jVar = this.f130390f;
        String str4 = "";
        if (jVar == null || (iVar3 = jVar.r) == null || (str = iVar3.f134902b) == null) {
            str = str4;
        }
        hashMap.put("author_id", str);
        j jVar2 = this.f130390f;
        if (jVar2 == null || (iVar2 = jVar2.r) == null || (str2 = iVar2.f134903c) == null) {
            str2 = str4;
        }
        hashMap.put("group_id", str2);
        j jVar3 = this.f130390f;
        if (!(jVar3 == null || (iVar = jVar3.r) == null || (str3 = iVar.f134901a) == null)) {
            str4 = str3;
        }
        hashMap.put("enter_from", str4);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final List<NormalTrackTimeStamp> a(long j2, InteractStickerStruct interactStickerStruct) {
        l.d(interactStickerStruct, "");
        return c.b(j2, interactStickerStruct);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final void a(float f2, float f3, b bVar) {
        l.d(bVar, "");
        bVar.a(this.f130388d.b(f2, f3));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, r rVar, InteractStickerStruct interactStickerStruct, j jVar) {
        super(context, rVar, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(rVar, "");
        l.d(interactStickerStruct, "");
        this.f130404a = h.i.a((h.f.a.a) new a(interactStickerStruct));
    }
}
