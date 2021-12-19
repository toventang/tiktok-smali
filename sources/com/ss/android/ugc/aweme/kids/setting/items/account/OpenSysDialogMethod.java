package com.ss.android.ugc.aweme.kids.setting.items.account;

import android.content.DialogInterface;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenSysDialogMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f106844b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f106845c = "openSysDialog";

    static {
        Covode.recordClassIndex(68329);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68330);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f106845c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenSysDialogMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OpenSysDialogMethod f106850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f106851b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f106852c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f106853d;

        static {
            Covode.recordClassIndex(68332);
        }

        c(OpenSysDialogMethod openSysDialogMethod, JSONObject jSONObject, boolean z, BaseBridgeMethod.a aVar) {
            this.f106850a = openSysDialogMethod;
            this.f106851b = jSONObject;
            this.f106852c = z;
            this.f106853d = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            OpenSysDialogMethod.a(this.f106852c, this.f106853d);
        }
    }

    public static void a(boolean z, BaseBridgeMethod.a aVar) {
        aVar.a(null, z ? 1 : 0, null);
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OpenSysDialogMethod f106846a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f106847b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f106848c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f106849d;

        static {
            Covode.recordClassIndex(68331);
        }

        b(OpenSysDialogMethod openSysDialogMethod, JSONObject jSONObject, boolean z, BaseBridgeMethod.a aVar) {
            this.f106846a = openSysDialogMethod;
            this.f106847b = jSONObject;
            this.f106848c = z;
            this.f106849d = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            OpenSysDialogMethod.a(!this.f106848c, this.f106849d);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        String str;
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            if (e() != null) {
                String optString = jSONObject.optString("content");
                String optString2 = jSONObject.optString("title");
                String optString3 = jSONObject.optString("confirm_text");
                String optString4 = jSONObject.optString("cancel_text");
                boolean optBoolean = jSONObject.optBoolean("swap");
                a.C0731a aVar2 = new a.C0731a(e());
                aVar2.f33401a = optString2;
                aVar2.f33402b = optString;
                if (optBoolean) {
                    str = optString4;
                } else {
                    str = optString3;
                }
                a.C0731a a2 = aVar2.a(str, (DialogInterface.OnClickListener) new b(this, jSONObject, optBoolean, aVar), false);
                if (!optBoolean) {
                    optString3 = optString4;
                }
                a2.b(optString3, (DialogInterface.OnClickListener) new c(this, jSONObject, optBoolean, aVar), false);
                aVar2.a().b().setCancelable(false);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
