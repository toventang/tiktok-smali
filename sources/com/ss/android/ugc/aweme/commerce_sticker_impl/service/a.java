package com.ss.android.ugc.aweme.commerce_sticker_impl.service;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.sticker.model.c;
import com.ss.android.ugc.aweme.sticker.model.d;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a implements com.ss.android.ugc.aweme.commerce_sticker_api.service.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1648a f73594a = new C1648a((byte) 0);

    static {
        Covode.recordClassIndex(45293);
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.service.a$a  reason: collision with other inner class name */
    public static final class C1648a {
        static {
            Covode.recordClassIndex(45294);
        }

        private C1648a() {
        }

        public /* synthetic */ C1648a(byte b2) {
            this();
        }

        public static boolean a(g gVar) {
            com.ss.android.ugc.aweme.commerce_sticker_api.a.a a2;
            if (gVar == null || gVar.id == null || gVar.extra == null) {
                return false;
            }
            com.ss.android.ugc.aweme.commerce_sticker_api.a.a a3 = com.ss.android.ugc.aweme.commerce_sticker_impl.a.a.a();
            if (a3 != null) {
                String str = gVar.id;
                l.b(str, "");
                if (a3.b(str)) {
                    return false;
                }
            }
            if (!(gVar.commerceSticker == null || (a2 = com.ss.android.ugc.aweme.commerce_sticker_impl.a.a.a()) == null)) {
                String str2 = gVar.extra;
                l.b(str2, "");
                if (a2.c(str2)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.service.a$a$a  reason: collision with other inner class name */
        static final class DialogInterface$OnClickListenerC1649a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static final DialogInterface$OnClickListenerC1649a f73595a = new DialogInterface$OnClickListenerC1649a();

            static {
                Covode.recordClassIndex(45295);
            }

            DialogInterface$OnClickListenerC1649a() {
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.service.a$a$b */
        static final class b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f73596a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f73597b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Context f73598c;

            static {
                Covode.recordClassIndex(45296);
            }

            b(g gVar, String str, Context context) {
                this.f73596a = gVar;
                this.f73597b = str;
                this.f73598c = context;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
                if (r0 == null) goto L_0x0078;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.content.DialogInterface r7, int r8) {
                /*
                // Method dump skipped, instructions count: 141
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce_sticker_impl.service.a.C1648a.b.onClick(android.content.DialogInterface, int):void");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.service.a
    public final boolean a(g gVar) {
        return C1648a.a(gVar);
    }

    @Override // com.ss.android.ugc.aweme.commerce_sticker_api.service.a
    public final boolean a(Context context, g gVar, String str) {
        d dVar;
        String str2;
        String str3 = "";
        l.d(context, str3);
        l.d(str, str3);
        if (gVar == null || gVar.id == null || !C1648a.a(gVar)) {
            return false;
        }
        com.ss.android.ugc.aweme.commerce_sticker_api.a.a a2 = com.ss.android.ugc.aweme.commerce_sticker_impl.a.a.a();
        if (a2 != null) {
            String str4 = gVar.id;
            l.b(str4, str3);
            if (a2.b(str4)) {
                return false;
            }
        }
        r.a("show_toast", new com.ss.android.ugc.aweme.app.f.d().a("prop_id", gVar.id).a("scene_id", "1001").a("enter_from", str).f66730a);
        c cVar = gVar.commerceSticker;
        if (cVar != null) {
            dVar = cVar.getCommerceStickerUnlockInfo();
        } else {
            dVar = null;
        }
        a.C0731a aVar = new a.C0731a(context);
        if (!(dVar == null || (str2 = dVar.desc) == null)) {
            str3 = str2;
        }
        aVar.f33402b = str3;
        aVar.a(R.string.ghq).b(R.string.a9e, (DialogInterface.OnClickListener) C1648a.DialogInterface$OnClickListenerC1649a.f73595a, false).a(R.string.b6s, (DialogInterface.OnClickListener) new C1648a.b(gVar, str, context), false).a().c();
        return true;
    }
}
