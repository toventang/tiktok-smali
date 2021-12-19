package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.j;
import com.ss.android.ugc.aweme.sticker.k.d;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import h.f.b.l;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f130327a = new a((byte) 0);

    static {
        Covode.recordClassIndex(85480);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85481);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(Context context, j jVar, InteractStickerStruct interactStickerStruct, View view, g gVar, Aweme aweme) {
            BusinessExtraData businessExtraData;
            d.a aVar;
            float f2;
            l.d(context, "");
            l.d(interactStickerStruct, "");
            l.d(view, "");
            if (jVar != null) {
                com.ss.android.ugc.aweme.sticker.k.d dVar = jVar.n;
                if (dVar != null) {
                    aVar = dVar.a();
                } else {
                    aVar = null;
                }
                float f3 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f2 = (float) aVar.f134941a;
                    } else {
                        f2 = 0.0f;
                    }
                    jVar.f134920a = f2;
                    if (aVar != null) {
                        f3 = (float) aVar.f134942b;
                    }
                    jVar.f134921b = f3;
                }
            }
            try {
                businessExtraData = (BusinessExtraData) GsonHolder.c().b().a(new JSONObject(interactStickerStruct.getAttr()).getString("interaction_extra"), BusinessExtraData.class);
            } catch (Exception e2) {
                e2.printStackTrace();
                businessExtraData = null;
            }
            return new b(interactStickerStruct.getType(), context, view, interactStickerStruct, jVar, gVar, businessExtraData, aweme);
        }
    }
}
