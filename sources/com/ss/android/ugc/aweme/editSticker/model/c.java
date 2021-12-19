package com.ss.android.ugc.aweme.editSticker.model;

import com.bytedance.covode.number.Covode;
import h.a.i;
import h.f.a.b;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f88246a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f88247b = {7, 8, 9, 18, 19};

    static {
        Covode.recordClassIndex(55476);
    }

    public static /* synthetic */ boolean a(StickerItemModel stickerItemModel) {
        b<? super StickerItemModel, Boolean> bVar = f88246a.f88244a;
        l.d(stickerItemModel, "");
        l.d(bVar, "");
        if (!(!bVar.invoke(stickerItemModel).booleanValue() || stickerItemModel.type == 2 || stickerItemModel.type == 13)) {
            l.d(stickerItemModel, "");
            if (!i.a(f88247b, stickerItemModel.type)) {
                l.d(stickerItemModel, "");
                if (stickerItemModel.type == 4 || stickerItemModel.type == 22 || stickerItemModel.type == 21) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
