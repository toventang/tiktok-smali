package com.ss.android.ugc.aweme.sticker.d.a;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.als.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.e.a;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.v;
import h.z;
import java.util.HashMap;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public Object f134753a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.b<com.ss.android.ugc.aweme.sticker.d.b.b<?>, z> f134754b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f134755c;

    /* renamed from: d  reason: collision with root package name */
    private final g<Boolean> f134756d;

    /* renamed from: e  reason: collision with root package name */
    private final ShortVideoContext f134757e;

    static {
        Covode.recordClassIndex(88077);
    }

    @Override // com.ss.android.ugc.aweme.sticker.d.a.d
    public final <T> boolean a(com.ss.android.ugc.aweme.sticker.d.b.b<T> bVar) {
        l.d(bVar, "");
        if ((!l.a(this.f134753a, bVar)) && (bVar instanceof com.ss.android.ugc.aweme.sticker.d.b.c) && (bVar.b() == com.ss.android.ugc.aweme.sticker.d.b.a.UI_CLICK || bVar.b() == com.ss.android.ugc.aweme.sticker.d.b.a.UI_GALLERY)) {
            Effect effect = ((com.ss.android.ugc.aweme.sticker.d.b.c) bVar).f134767a;
            if (!com.ss.android.ugc.aweme.sticker.p.g.t(effect) || !l.a((Object) this.f134756d.a(), (Object) true) || this.f134757e.f124757b.f124711f.isEmpty()) {
                return false;
            }
            HashMap c2 = ag.c(v.a("prop_id", effect.getEffectId()), v.a("creation_id", this.f134757e.q), v.a("shoot_way", this.f134757e.r));
            a.C4048a a2 = new a.C4048a(this.f134755c).a(R.string.h80);
            a2.f150101b = a2.f150107h.getString(R.string.h7z);
            a2.a(new a(c2)).a(R.string.asq, new b(this, c2, bVar)).a().a();
            return true;
        }
        return false;
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashMap f134758a;

        static {
            Covode.recordClassIndex(88078);
        }

        a(HashMap hashMap) {
            this.f134758a = hashMap;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f134758a.put("to_status", "cancel");
            d.a("shoot_video_delete_confirm", this.f134758a);
        }
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f134759a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f134760b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.d.b.b f134761c;

        static {
            Covode.recordClassIndex(88079);
        }

        b(c cVar, HashMap hashMap, com.ss.android.ugc.aweme.sticker.d.b.b bVar) {
            this.f134759a = cVar;
            this.f134760b = hashMap;
            this.f134761c = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f134760b.put("to_status", "confirm");
            d.a("shoot_video_delete_confirm", this.f134760b);
            this.f134759a.f134753a = this.f134761c;
            this.f134759a.f134754b.invoke(this.f134761c);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.sticker.d.b.b<?>, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, g<Boolean> gVar, ShortVideoContext shortVideoContext, h.f.a.b<? super com.ss.android.ugc.aweme.sticker.d.b.b<?>, z> bVar) {
        l.d(context, "");
        l.d(gVar, "");
        l.d(shortVideoContext, "");
        l.d(bVar, "");
        this.f134755c = context;
        this.f134756d = gVar;
        this.f134757e = shortVideoContext;
        this.f134754b = bVar;
    }
}
