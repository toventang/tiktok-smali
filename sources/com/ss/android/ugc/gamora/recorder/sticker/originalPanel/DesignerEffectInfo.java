package com.ss.android.ugc.gamora.recorder.sticker.originalPanel;

import com.bytedance.covode.number.Covode;
import f.a.t;
import l.b.f;

public interface DesignerEffectInfo {

    /* renamed from: a  reason: collision with root package name */
    public static final a f148477a = a.f148478a;

    static {
        Covode.recordClassIndex(97876);
    }

    @f(a = "/aweme/v1/original/effect/list/")
    t<StickerItemList> fetch(@l.b.t(a = "user_id") String str, @l.b.t(a = "cursor") int i2, @l.b.t(a = "count") int i3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f148478a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(97877);
        }
    }
}
